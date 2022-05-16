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

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

class InsertRangesTest {
  private static PreprocessorParser.ModuleContext moduleContext;

  @BeforeAll
  static void initModuleContext() {
    var pathToFile = Path.of("src/test/resources/insertCodeRanges.bsl");
    var preprocessor = new Preprocessor();
    try (var inputStream = new FileInputStream(pathToFile.toFile())) {
      moduleContext = preprocessor.readModuleContext(inputStream);
    } catch (IOException e) {
      throw new RuntimeException();
    }
  }

  @Test
  void check() {
    var extensionContext = new ExtensionContext(moduleContext);
    var ranges = extensionContext.getInsertCommandCodeRangesByMethodName("Тест");
    assertThat(ranges)
      .hasSize(2)
      .anyMatch(range -> range.startLine() == 4 && range.endLine() == 6)
      .anyMatch(range -> range.startLine() == 9 && range.endLine() == 10);
  }
}
