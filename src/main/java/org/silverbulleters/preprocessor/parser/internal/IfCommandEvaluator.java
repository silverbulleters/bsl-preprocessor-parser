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
import org.jetbrains.annotations.Nullable;
import org.silverbulleters.preprocessor.parser.ExecutionContext;
import org.silverbulleters.preprocessor.parser.PreprocessorParser;
import org.silverbulleters.preprocessor.parser.expression.Expression;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Абстракция для вычисления доступных контекстов выполнения в разрезе узлов "Если", "ИначеЕсли" и "Иначе" логического
 * выражения препроцессора
 */
public final class IfCommandEvaluator {
  private final PreprocessorParser.IfCommandContext ifCommandContext;
  private final Set<ExecutionContext> availableExecutionContexts;

  public IfCommandEvaluator(PreprocessorParser.IfCommandContext ifCommandContext, Set<ExecutionContext> availableExecutionContexts) {
    this.ifCommandContext = ifCommandContext;
    this.availableExecutionContexts = availableExecutionContexts;
  }

  /**
   * @return Соответствие, где узлом является ветка "Если", "ИначеЕсли" или "Иначе", а значением множество доступных в данной
   * ветви условия контекстов выполнения кода. Расчет доступных контекстов идет сверху вниз, начиная с "Если" и заканчивая "Иначе".
   * Расчет каждой ветки логического выражения сокращает доступные контексты выполнения.
   */
  public Map<Tree, Set<ExecutionContext>> evaluateIfCommand() {
    Map<Tree, Set<ExecutionContext>> result = new HashMap<>();

    var availableIfPartContext = evaluateIfPart(ifCommandContext.ifPart(), availableExecutionContexts);
    if (ifCommandContext.ifPart() != null) {
      result.put(ifCommandContext.ifPart(), availableIfPartContext);
      availableExecutionContexts.removeAll(availableIfPartContext);
    }

    for (var elsIfPart : ifCommandContext.elsIfPart()) {
      var availableElsIfContext = evaluateElsIfPart(elsIfPart, availableExecutionContexts);
      if (elsIfPart != null) {
        result.put(elsIfPart, availableElsIfContext);
        availableExecutionContexts.removeAll(availableElsIfContext);
      }
    }

    if (ifCommandContext.elsePart() != null) {
      result.put(ifCommandContext.elsePart(), availableExecutionContexts);
    }

    return result;
  }

  private @NotNull Set<ExecutionContext> evaluateElsIfPart(@Nullable PreprocessorParser.ElsIfPartContext elsIfPart, Set<ExecutionContext> availableExecutionContexts) {
    if (elsIfPart == null) {
      return Collections.emptySet();
    }

    return evaluateAvailableContexts(availableExecutionContexts, elsIfPart.expression());
  }

  private @NotNull Set<ExecutionContext> evaluateIfPart(@Nullable PreprocessorParser.IfPartContext ifPart, Set<ExecutionContext> availableExecutionContexts) {
    if (ifPart == null) {
      return Collections.emptySet();
    }

    return evaluateAvailableContexts(availableExecutionContexts, ifPart.expression());
  }

  private Set<ExecutionContext> evaluateAvailableContexts(Set<ExecutionContext> targetExecutionContexts, PreprocessorParser.ExpressionContext expressionContext) {
    Set<ExecutionContext> result = new HashSet<>();

    for (var targetRuntimeContext : targetExecutionContexts) {
      var expression = new Expression(expressionContext);
      boolean expressionResult = expression.evaluateExpressionByContext(targetRuntimeContext);
      if (expressionResult) {
        result.add(targetRuntimeContext);
      }
    }

    return result;
  }
}
