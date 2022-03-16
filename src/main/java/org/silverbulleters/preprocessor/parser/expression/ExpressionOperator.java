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

package org.silverbulleters.preprocessor.parser.expression;

import java.util.Locale;

/**
 * Операторы логического выражения препроцессора и скобки.
 * <b>Внимание!</b> Порядок элементов влияет на приоритет операторов при вычислении выражений.
 */
public enum ExpressionOperator {
  LEFT_PARENTHESIS,
  RIGHT_PARENTHESIS,
  OR,
  AND;

  public static ExpressionOperator fromString(String value) {
    value = value.toUpperCase(Locale.ENGLISH);
    switch (value) {
      case "AND":
      case "И": {
        return ExpressionOperator.AND;
      }
      case "OR":
      case "ИЛИ": {
        return ExpressionOperator.OR;
      }
      case "(": {
        return ExpressionOperator.LEFT_PARENTHESIS;
      }
      case ")": {
        return ExpressionOperator.RIGHT_PARENTHESIS;
      }
      default: throw new IllegalArgumentException("Unknown operator " + value);
    }
  }
}
