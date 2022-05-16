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

package org.silverbulleters.preprocessor.parser;

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.jetbrains.annotations.NotNull;
import org.silverbulleters.preprocessor.parser.internal.ExtensionCommandListener;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ExtensionContext {
  private final Map<String, List<Range>> methodNamesToInsertCodeRanges;

  public ExtensionContext(PreprocessorParser.ModuleContext moduleContext) {
    var listener = new ExtensionCommandListener();
    var walker = new ParseTreeWalker();
    walker.walk(listener, moduleContext);

    methodNamesToInsertCodeRanges = Collections.unmodifiableMap(listener.methodNamesToInsertCodeRanges());
  }

  /**
   * @param methodName имя метода для которого необходимо получить диапазоны инструкций #Вставка-#КонецВставки
   * @return список диапазонов инструкций #Вставка-#КонецВставки
   */
  public List<Range> getInsertCommandCodeRangesByMethodName(@NotNull String methodName) {
    return Collections.unmodifiableList(methodNamesToInsertCodeRanges.getOrDefault(methodName, Collections.emptyList()));
  }
}
