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

class SimplePreprocessorTest {

  @Test
  void simpleTest() {
    var pathToFile = Path.of("src/test/resources/simpleTest.bsl");
    var preprocessor = new Preprocessor();
    try (var inputStream = new FileInputStream(pathToFile.toFile())) {
      var resultCode = preprocessor.preprocessModule(inputStream, Set.of(ExecutionContext.WEB_CLIENT, ExecutionContext.THIN_CLIENT, ExecutionContext.THICK_CLIENT_MANAGED_APPLICATION));
      Assertions.assertEquals(expectedThinClientCode(), resultCode.get(ExecutionContext.THIN_CLIENT));
      Assertions.assertEquals(expectedWebClientCode(), resultCode.get(ExecutionContext.WEB_CLIENT));
      Assertions.assertEquals(expectedThickClientCode(), resultCode.get(ExecutionContext.THICK_CLIENT_MANAGED_APPLICATION));
    } catch (IOException e) {
      throw new RuntimeException();
    }
  }

  private String expectedThickClientCode() {
    return """
      Процедура Тест()
      \s
      \s
      \s
      \s
      \s
      Сообщить("Nothing");
      \s
      КонецПроцедуры""";
  }

  private String expectedThinClientCode() {
    return """
      Процедура Тест()
      \s
      Сообщить(ТонкийКлиент);
      \s
      \s
      \s
      \s
      \s
      КонецПроцедуры""";
  }

  private String expectedWebClientCode() {
    return """
      Процедура Тест()
      \s
      \s
      \s
      Сообщить(Веб);
      \s
      \s
      \s
      КонецПроцедуры""";
  }
}
