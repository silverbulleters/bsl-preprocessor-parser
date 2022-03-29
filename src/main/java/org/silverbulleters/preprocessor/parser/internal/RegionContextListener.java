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
import org.silverbulleters.preprocessor.parser.Trees;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegionContextListener extends PreprocessorParserBaseListener {

  public final Map<Range, List<String>> codeToRegions = new HashMap<>();
  public final Map<String, List<String>> methodNamesToRegions = new HashMap<>();
  public final Map<String, List<String>> varNamesToRegions = new HashMap<>();


  @Override
  public void enterMethodSignature(PreprocessorParser.MethodSignatureContext ctx) {
    var methodName = ctx.codeId().getText();
    methodNamesToRegions.put(methodName, Trees.findAllRegionsNames(ctx));
  }

  @Override
  public void enterVarDefinition(PreprocessorParser.VarDefinitionContext ctx) {
    var methodName = ctx.codeId().getText();
    varNamesToRegions.put(methodName, Trees.findAllRegionsNames(ctx));
  }

  @Override
  public void enterCode(PreprocessorParser.CodeContext ctx) {
    var range = new Range(ctx.getStart().getLine(), ctx.getStop().getLine());
    codeToRegions.put(range, Trees.findAllRegionsNames(ctx));
  }
}
