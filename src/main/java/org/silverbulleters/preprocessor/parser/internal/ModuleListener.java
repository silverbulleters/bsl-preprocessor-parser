/*
 * This file is a part of BSL preprocessor parser.
 *
 * Copyright (c) 2022. Team SilverBulleters <team@silverbulleters.org> and contributors
 *
 * SPDX-License-Identifier: LGPL-3.0-or-later
 *
 *  BSL preprocessor parser is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 3.0 of the License, or (at your option) any later version.
 *
 *  BSL preprocessor parser is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with BSL preprocessor parser.
 */

package org.silverbulleters.preprocessor.parser.internal;

import org.antlr.v4.runtime.tree.Tree;
import org.jetbrains.annotations.NotNull;
import org.silverbulleters.preprocessor.parser.ExecutionContext;
import org.silverbulleters.preprocessor.parser.PreprocessorParser;
import org.silverbulleters.preprocessor.parser.PreprocessorParserBaseListener;
import org.silverbulleters.preprocessor.parser.Trees;
import org.silverbulleters.preprocessor.parser.internal.IfCommandEvaluator;

import java.util.ArrayList;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class ModuleListener extends PreprocessorParserBaseListener {
  private static final Pattern CLEAR_PATTERN = Pattern.compile("[^\\r\\n]+");
  private final Map<ExecutionContext, StringBuilder> resultCode = new EnumMap<>(ExecutionContext.class);
  private final Map<Tree, Set<ExecutionContext>> nodeToContexts = new HashMap<>();
  private Set<ExecutionContext> allExecutionContexts;

  public void setRuntimeContext(Set<ExecutionContext> executionContexts) {
    this.allExecutionContexts = executionContexts;
    executionContexts.forEach(executionContext -> resultCode.put(executionContext, new StringBuilder()));
  }

  public Map<ExecutionContext, String> resultCode() {
    return resultCode.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().toString()));
  }

  @Override
  public void enterInsert(PreprocessorParser.InsertContext ctx) {
    addClearedDirectiveTextToCode(ctx.getText());
  }

  @Override
  public void enterEndInsert(PreprocessorParser.EndInsertContext ctx) {
    addClearedDirectiveTextToCode(ctx.getText());
  }

  @Override
  public void enterDelete(PreprocessorParser.DeleteContext ctx) {
    addClearedDirectiveTextToCode(ctx.getText());
  }

  @Override
  public void enterEndDelete(PreprocessorParser.EndDeleteContext ctx) {
    addClearedDirectiveTextToCode(ctx.getText());
  }

  @Override
  public void enterRegionName(PreprocessorParser.RegionNameContext ctx) {
    addClearedDirectiveTextToCode(ctx.getText());
  }

  @Override
  public void enterEndRegion(PreprocessorParser.EndRegionContext ctx) {
    addClearedDirectiveTextToCode(ctx.getText());
  }

  @Override
  public void enterThenTerm(PreprocessorParser.ThenTermContext ctx) {
    addClearedDirectiveTextToCode(ctx.getText());
  }

  @Override
  public void enterElseTerm(PreprocessorParser.ElseTermContext ctx) {
    addClearedDirectiveTextToCode(ctx.getText());
  }

  @Override
  public void enterEndIfTerm(PreprocessorParser.EndIfTermContext ctx) {
    addClearedDirectiveTextToCode(ctx.getText());
  }

  @Override
  public void enterIfCommand(PreprocessorParser.IfCommandContext ctx) {
    var eval = new IfCommandEvaluator(ctx, new HashSet<>(allExecutionContexts));
    nodeToContexts.putAll(eval.evaluateIfCommand());
  }

  private void addClearedDirectiveTextToCode(String text) {
    allExecutionContexts.forEach(executionContext -> {
      var code = resultCode.get(executionContext);
      code.append(CLEAR_PATTERN.matcher(text).replaceAll(" "));
    });
  }

  @Override
  public void enterCode(PreprocessorParser.CodeContext ctx) {
    var hasDeleteCommandParent = Trees.hasDeleteCommandParent(ctx);
    if (hasDeleteCommandParent) {
      addEmptyCodeToAllContexts(ctx);
      return;
    }

    var parentDirectiveNodes = Trees.findAllIfPartParents(ctx);
    if (parentDirectiveNodes.isEmpty()) {
      allExecutionContexts.forEach(executionContext -> resultCode.get(executionContext).append(ctx.getText()));
      return;
    }

    var nestedContexts = getNestedContextsFromParentNodes(parentDirectiveNodes);
    Set<ExecutionContext> availableContext = intersectNestedContexts(nestedContexts);
    appendFullOrClearedCodeText(ctx, availableContext);
  }

  private void addEmptyCodeToAllContexts(PreprocessorParser.CodeContext ctx) {
    allExecutionContexts
      .forEach(executionContext -> resultCode.get(executionContext)
        .append(CLEAR_PATTERN.matcher(ctx.getText()).replaceAll(" ")));
  }

  private void appendFullOrClearedCodeText(PreprocessorParser.CodeContext ctx, Set<ExecutionContext> availableContext) {
    for (var executionContext : allExecutionContexts) {
      if (availableContext.contains(executionContext)) {
        resultCode.get(executionContext).append(ctx.getText());
      } else {
        resultCode.get(executionContext)
          .append(CLEAR_PATTERN.matcher(ctx.getText()).replaceAll(" "));
      }
    }
  }

  @NotNull
  private Set<ExecutionContext> intersectNestedContexts(List<Set<ExecutionContext>> nestedContexts) {
    Set<ExecutionContext> result = new HashSet<>(allExecutionContexts);
    for (var nestedContext : nestedContexts) {
      result.retainAll(nestedContext);
    }
    return result;
  }

  private List<Set<ExecutionContext>> getNestedContextsFromParentNodes(Deque<Tree> parentDirectiveNodes) {
    List<Set<ExecutionContext>> nestedContexts = new ArrayList<>();

    for (var parentIfPartNode : parentDirectiveNodes) {
      var contexts = nodeToContexts.get(parentIfPartNode);
      if (contexts == null) {
        throw new IllegalStateException();
      }
      nestedContexts.add(contexts);
    }

    return nestedContexts;
  }
}
