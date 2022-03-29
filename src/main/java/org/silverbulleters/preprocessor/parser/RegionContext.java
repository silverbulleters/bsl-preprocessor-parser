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
import org.silverbulleters.preprocessor.parser.internal.RegionContextListener;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Контекст содержащий в себе информацию о соответствиях имен методов, переменных и областей кода к именам областей
 * препроцессора
 */
public class RegionContext {

  private final Map<Range, List<String>> codeToRegions;
  private final Map<String, List<String>> methodNamesToRegions;
  private final Map<String, List<String>> varNamesToRegions;

  public RegionContext(PreprocessorParser.ModuleContext moduleContext) {
    var listener = new RegionContextListener();
    var walker = new ParseTreeWalker();
    walker.walk(listener, moduleContext);

    codeToRegions = Collections.unmodifiableMap(listener.codeToRegions);
    methodNamesToRegions = Collections.unmodifiableMap(listener.methodNamesToRegions);
    varNamesToRegions = Collections.unmodifiableMap(listener.varNamesToRegions);
  }

  /**
   * Получает список имен областей в которых содержится метод с указанным именем
   *
   * @param methodName Не может быть null. Имя метода для которого необходимо найти имена областей.
   * @return Список имен областей, в которых содержится метод с таким именем. Самым первым элементом списка является имя
   * самой вложенной области.
   */
  public List<String> getRegionsByMethodName(@NotNull String methodName) {
    return Collections.unmodifiableList(methodNamesToRegions.getOrDefault(methodName, Collections.emptyList()));
  }

  /**
   * Получает список имен областей в которых содержится переменная с указанным именем
   *
   * @param varName Не может быть null. Имя переменной для которой необходимо найти имена областей.
   * @return Список имен областей, в которых содержится переменная с таким именем. Самым первым элементом списка является имя
   * самой вложенной области.
   */
  public List<String> getRegionsByVarName(@NotNull String varName) {
    return Collections.unmodifiableList(varNamesToRegions.getOrDefault(varName, Collections.emptyList()));
  }

  /**
   * Получает список имен областей в которых содержится код с указанным диапазоном (range). Код считается принадлежащим
   * диапазону области, если переданная область {@code codeRange} меньше или равна диапазону области.
   *
   * @param codeRange Не может быть null. Диапазон кода для которого осуществляется поиск областей. Нумерация строк начинается с 1.
   * @return Список имен областей, в которых содержится код с переданным диапазоном. Самым первым элементом списка является имя
   * самой вложенной области.
   */
  public List<String> getRegionsByCodeRange(@NotNull Range codeRange) {
    return codeToRegions.entrySet().stream()
      .filter(entry -> entry.getKey().containsInclusive(codeRange))
      .findFirst()
      .map(Map.Entry::getValue)
      .orElse(Collections.emptyList());
  }
}
