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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Set;

class NestedCommandPreprocessorTest {

  @Test
  void test() {
    var pathToFile = Path.of("src/test/resources/nestedCommands.bsl");
    var preprocessor = new Preprocessor();
    try (var inputStream = new FileInputStream(pathToFile.toFile())) {
      var moduleContext = preprocessor.readModuleContext(inputStream);
      var resultCode = preprocessor.preprocessModule(moduleContext, Set.of(ExecutionContext.WEB_CLIENT, ExecutionContext.THIN_CLIENT));
      Assertions.assertEquals(expectedThinClientCode(), resultCode.get(ExecutionContext.THIN_CLIENT));
      Assertions.assertEquals(expectedWebClientCode(), resultCode.get(ExecutionContext.WEB_CLIENT));
    } catch (IOException e) {
      throw new RuntimeException();
    }
  }

  private String expectedThinClientCode() {
    return """
      Функция Тест() Экспорт
      
      \s
      \s\s\s\s\s
      \s\s\s\s\s\sВозврат Неопределено;
      \t\s
      \s\s\s\s
      \s\s
      \s
      
      КонецФункции""";
  }

  private String expectedWebClientCode() {
    return """
      Функция Тест() Экспорт
      
      \s
      \s\s\s\s\s
      \s\s\s\s
      \s\s
      \s\s\s\s\s\sВозврат Истина;
      \s\s\s\s\s
      \s
      
      КонецФункции""";
  }
}
