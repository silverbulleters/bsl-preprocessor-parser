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

import org.antlr.v4.runtime.Token;

import java.util.Set;

/**
 * Утилитный класс, предоставляющий методы для проверки принадлежности токена узла дерева тому или иному символу препроцессора
 * и сгруппированные по категориям множества самих токенов
 */
public class PreprocessorSymbols {
  public static final Set<Integer> ALL_SYMBOL_TYPES = Set.of(
    PreprocessorParserTokens.CLIENT,
    PreprocessorParserTokens.AT_CLIENT,
    PreprocessorParserTokens.AT_SERVER,
    PreprocessorParserTokens.SERVER,
    PreprocessorParserTokens.THIN_CLIENT,
    PreprocessorParserTokens.WEB_CLIENT,
    PreprocessorParserTokens.MOBILE_STANDALONE_SERVER,
    PreprocessorParserTokens.MOBILE_APP_CLIENT,
    PreprocessorParserTokens.MOBILE_APP_SERVER,
    PreprocessorParserTokens.MOBILE_CLIENT,
    PreprocessorParserTokens.THICK_CLIENT_MANAGED_APPLICATION,
    PreprocessorParserTokens.THICK_CLIENT_ORDINARY_APPLICATION,
    PreprocessorParserTokens.EXTERNAL_CONNECTION);

  public static final Set<Integer> SERVER_SYMBOLS = Set.of(
    PreprocessorParserTokens.AT_SERVER,
    PreprocessorParserTokens.SERVER,
    PreprocessorParserTokens.MOBILE_STANDALONE_SERVER,
    PreprocessorParserTokens.MOBILE_APP_SERVER
  );

  public static final Set<Integer> CLIENT_SYMBOLS = Set.of(
    PreprocessorParserTokens.CLIENT,
    PreprocessorParserTokens.AT_CLIENT,
    PreprocessorParserTokens.THIN_CLIENT,
    PreprocessorParserTokens.WEB_CLIENT,
    PreprocessorParserTokens.MOBILE_APP_CLIENT,
    PreprocessorParserTokens.MOBILE_CLIENT,
    PreprocessorParserTokens.THICK_CLIENT_MANAGED_APPLICATION,
    PreprocessorParserTokens.THICK_CLIENT_ORDINARY_APPLICATION
  );

  private PreprocessorSymbols() {
    // noop
  }

  public static boolean isSymbol(Token token) {
    return ALL_SYMBOL_TYPES.contains(token.getType());
  }

  public static boolean isAnyServerSymbol(Token token) {
    return SERVER_SYMBOLS.contains(token.getType());
  }

  public static boolean isAnyClientSymbol(Token token) {
    return CLIENT_SYMBOLS.contains(token.getType());
  }

  public static boolean isClientSymbol(Token token) {
    return token.getType() == PreprocessorParserTokens.CLIENT;
  }

  public static boolean isAtClientSymbol(Token token) {
    return token.getType() == PreprocessorParserTokens.AT_CLIENT;
  }

  public static boolean isAtServerSymbol(Token token) {
    return token.getType() == PreprocessorParserTokens.AT_SERVER;
  }

  public static boolean isServerSymbol(Token token) {
    return token.getType() == PreprocessorParserTokens.SERVER;
  }

  public static boolean isThinClientSymbol(Token token) {
    return token.getType() == PreprocessorParserTokens.THIN_CLIENT;
  }

  public static boolean isWebClientSymbol(Token token) {
    return token.getType() == PreprocessorParserTokens.WEB_CLIENT;
  }

  public static boolean isMobileStandaloneServerSymbol(Token token) {
    return token.getType() == PreprocessorParserTokens.MOBILE_STANDALONE_SERVER;
  }

  public static boolean isMobileAppClientSymbol(Token token) {
    return token.getType() == PreprocessorParserTokens.MOBILE_APP_CLIENT;
  }

  public static boolean isMobileAppServerSymbol(Token token) {
    return token.getType() == PreprocessorParserTokens.MOBILE_APP_SERVER;
  }

  public static boolean isMobileClientSymbol(Token token) {
    return token.getType() == PreprocessorParserTokens.MOBILE_CLIENT;
  }

  public static boolean isThickClientOrdinaryApplicationSymbol(Token token) {
    return token.getType() == PreprocessorParserTokens.THICK_CLIENT_ORDINARY_APPLICATION;
  }

  public static boolean isThickClientManagedApplicationSymbol(Token token) {
    return token.getType() == PreprocessorParserTokens.THICK_CLIENT_MANAGED_APPLICATION;
  }

  public static boolean isExternalConnectionSymbol(Token token) {
    return token.getType() == PreprocessorParserTokens.EXTERNAL_CONNECTION;
  }
}
