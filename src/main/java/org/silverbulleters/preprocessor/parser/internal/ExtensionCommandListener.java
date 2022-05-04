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

import org.silverbulleters.preprocessor.parser.PreprocessorParser;
import org.silverbulleters.preprocessor.parser.PreprocessorParserBaseListener;
import org.silverbulleters.preprocessor.parser.Range;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtensionCommandListener extends PreprocessorParserBaseListener {
  private final Map<String, List<Range>> methodNamesToInsertCodeRanges = new HashMap<>();
  private String currentMethodName = "";

  public Map<String, List<Range>> methodNamesToInsertCodeRanges() {
    return methodNamesToInsertCodeRanges;
  }

  @Override
  public void enterMethodSignature(PreprocessorParser.MethodSignatureContext ctx) {
    var methodName = ctx.codeId().getText();
    methodNamesToInsertCodeRanges.put(methodName, new ArrayList<>());
    currentMethodName = methodName;
  }

  @Override
  public void enterInsertCommand(PreprocessorParser.InsertCommandContext ctx) {
    var codeNodes = ctx.code();
    if (codeNodes.isEmpty()) {
      return;
    }

    var firstCodeNode = codeNodes.get(0);
    var lastCodeNode = codeNodes.get(codeNodes.size() - 1);
    var startLine = firstCodeNode.getStart().getLine();
    var endLine = lastCodeNode.getStop().getLine();
    var range = new Range(startLine, endLine);
    methodNamesToInsertCodeRanges.compute(currentMethodName, (key, value) -> {
      if (value == null) {
        return new ArrayList<>();
      } else {
        value.add(range);
        return value;
      }
    });
  }
}
