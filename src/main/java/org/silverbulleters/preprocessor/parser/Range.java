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

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Представление диапазона (range) участков кода. Характеризуется значениями начальной и конечной строки.
 */
public class Range {
  private final int startLine;
  private final int endLine;

  public Range(int startLine, int endLine) {
    this.startLine = startLine;
    this.endLine = endLine;
  }

  public int startLine() {
    return startLine;
  }

  public int endLine() {
    return endLine;
  }

  public boolean containsInclusive(int lineNumber) {
    return lineNumber >= startLine && lineNumber <= endLine;
  }

  public boolean containsInclusive(@NotNull Range other) {
    return other.startLine >= this.startLine && other.endLine <= this.endLine;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Range range = (Range) o;
    return startLine == range.startLine && endLine == range.endLine;
  }

  @Override
  public int hashCode() {
    return Objects.hash(startLine, endLine);
  }
}
