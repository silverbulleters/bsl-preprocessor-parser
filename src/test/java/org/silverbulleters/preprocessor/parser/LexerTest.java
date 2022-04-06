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

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

class LexerTest {

  @Test
  void testRegionName() {
    String code = "#region Client \n#EndRegion";
    var tokens = getTokensFromString(code);
    Assertions.assertEquals(8, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.REGION, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IDENTIFIER, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.WHITESPACE, tokens.get(3).getType());
    Assertions.assertEquals(PreprocessorParserTokens.EOL, tokens.get(4).getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(5).getType());
    Assertions.assertEquals(PreprocessorParserTokens.END_REGION, tokens.get(6).getType());
  }

  @Test
  void testSlashToken() {
    String code = "Message(a / b);";
    var tokens = getTokensFromString(code);
    Assertions.assertEquals(6, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.CODE, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.WHITESPACE, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.CODE, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.WHITESPACE, tokens.get(3).getType());
    Assertions.assertEquals(PreprocessorParserTokens.CODE, tokens.get(4).getType());
  }

  @Test
  void testIfToken() {
    String en = "#If";
    String ru = "#ЕсЛи";

    var tokens = getTokensFromString(en);
    var sharp = tokens.get(0);
    var enToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.IF, enToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());

    tokens = getTokensFromString(ru);
    sharp = tokens.get(0);
    var ruToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.IF, ruToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());
  }

  @Test
  void testElsIfToken() {
    String en = "#ElsIf";
    String ru = "#ИначеЕсли";

    var tokens = getTokensFromString(en);
    var sharp = tokens.get(0);
    var enToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.ELSIF, enToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());

    tokens = getTokensFromString(ru);
    sharp = tokens.get(0);
    var ruToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.ELSIF, ruToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());
  }

  @Test
  void testElseToken() {
    String en = "#ELSE";
    String ru = "#Иначе";

    var tokens = getTokensFromString(en);
    var sharp = tokens.get(0);
    var enToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.ELSE, enToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());

    tokens = getTokensFromString(ru);
    sharp = tokens.get(0);
    var ruToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.ELSE, ruToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());
  }

  @Test
  void testEndIfToken() {
    String en = "#EndIf";
    String ru = "#КонецЕсли";

    var tokens = getTokensFromString(en);
    var sharp = tokens.get(0);
    var enToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.END_IF, enToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());

    tokens = getTokensFromString(ru);
    sharp = tokens.get(0);
    var ruToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.END_IF, ruToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());
  }

  @Test
  void testRegionToken() {
    String en = "#Region";
    String ru = "#Область";

    var tokens = getTokensFromString(en);
    var sharp = tokens.get(0);
    var enToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.REGION, enToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());

    tokens = getTokensFromString(ru);
    sharp = tokens.get(0);
    var ruToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.REGION, ruToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());
  }

  @Test
  void testEndRegionToken() {
    String en = "#EndRegion";
    String ru = "#КонецОбласти";

    var tokens = getTokensFromString(en);
    var sharp = tokens.get(0);
    var enToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.END_REGION, enToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());

    tokens = getTokensFromString(ru);
    sharp = tokens.get(0);
    var ruToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.END_REGION, ruToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());
  }

  @Test
  void testInsertToken() {
    String en = "#Insert";
    String ru = "#Вставка";

    var tokens = getTokensFromString(en);
    var sharp = tokens.get(0);
    var enToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.INSERT, enToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());

    tokens = getTokensFromString(ru);
    sharp = tokens.get(0);
    var ruToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.INSERT, ruToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());
  }

  @Test
  void testEndInsertToken() {
    String en = "#EndInsert";
    String ru = "#КонецВставки";

    var tokens = getTokensFromString(en);
    var sharp = tokens.get(0);
    var enToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.END_INSERT, enToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());

    tokens = getTokensFromString(ru);
    sharp = tokens.get(0);
    var ruToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.END_INSERT, ruToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());
  }

  @Test
  void testDeleteToken() {
    String en = "#Delete";
    String ru = "#Удаление";

    var tokens = getTokensFromString(en);
    var sharp = tokens.get(0);
    var enToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.DELETE, enToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());

    tokens = getTokensFromString(ru);
    sharp = tokens.get(0);
    var ruToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.DELETE, ruToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());
  }

  @Test
  void testEndDeleteToken() {
    String en = "#EndDelete";
    String ru = "#КонецУдаления";

    var tokens = getTokensFromString(en);
    var sharp = tokens.get(0);
    var enToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.END_DELETE, enToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());

    tokens = getTokensFromString(ru);
    sharp = tokens.get(0);
    var ruToken = tokens.get(1);
    Assertions.assertEquals(PreprocessorParserTokens.END_DELETE, ruToken.getType());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, sharp.getType());
  }

  @Test
  void testBooleanAndToken() {
    String en = "#If Server And Client Then";
    String ru = "#Если Сервер и Клиент Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(7, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.SERVER, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.AND, tokens.get(3).getType());
    Assertions.assertEquals(PreprocessorParserTokens.CLIENT, tokens.get(4).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(5).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(7, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.SERVER, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.AND, tokens.get(3).getType());
    Assertions.assertEquals(PreprocessorParserTokens.CLIENT, tokens.get(4).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(5).getType());
  }

  @Test
  void testBooleanOrToken() {
    String en = "#If Server Or Client Then";
    String ru = "#Если Сервер иЛи Клиент Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(7, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.SERVER, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.OR, tokens.get(3).getType());
    Assertions.assertEquals(PreprocessorParserTokens.CLIENT, tokens.get(4).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(5).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(7, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.SERVER, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.OR, tokens.get(3).getType());
    Assertions.assertEquals(PreprocessorParserTokens.CLIENT, tokens.get(4).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(5).getType());
  }

  @Test
  void testBooleanNotToken() {
    String en = "#If Not Server Or Client Then";
    String ru = "#Если Не Сервер иЛи Клиент Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(8, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.NOT, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.SERVER, tokens.get(3).getType());
    Assertions.assertEquals(PreprocessorParserTokens.OR, tokens.get(4).getType());
    Assertions.assertEquals(PreprocessorParserTokens.CLIENT, tokens.get(5).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(6).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(8, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.NOT, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.SERVER, tokens.get(3).getType());
    Assertions.assertEquals(PreprocessorParserTokens.OR, tokens.get(4).getType());
    Assertions.assertEquals(PreprocessorParserTokens.CLIENT, tokens.get(5).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(6).getType());
  }

  @Test
  void testClientToken() {
    String en = "#If Client Then";
    String ru = "#Если Клиент Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.CLIENT, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.CLIENT, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());
  }

  @Test
  void testServerToken() {
    String en = "#If Server Then";
    String ru = "#Если Сервер Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.SERVER, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.SERVER, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());
  }

  @Test
  void testAtServerToken() {
    String en = "#If AtServer Then";
    String ru = "#Если НаСервере Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.AT_SERVER, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.AT_SERVER, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());
  }

  @Test
  void testAtClientToken() {
    String en = "#If AtClient Then";
    String ru = "#Если НаКлиенте Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.AT_CLIENT, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.AT_CLIENT, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());
  }

  @Test
  void testThinClientToken() {
    String en = "#If ThinClient Then";
    String ru = "#Если ТонкийКлиент Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THIN_CLIENT, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THIN_CLIENT, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());
  }

  @Test
  void testWebClientToken() {
    String en = "#If WebClient Then";
    String ru = "#Если ВебКлиент Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.WEB_CLIENT, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.WEB_CLIENT, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());
  }

  @Test
  void testMobileStandaloneServerToken() {
    String en = "#If MobileStandAloneServer Then";
    String ru = "#Если МобильныйАвтономныйСервер Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.MOBILE_STANDALONE_SERVER, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.MOBILE_STANDALONE_SERVER, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());
  }

  @Test
  void testMobileAppClientToken() {
    String en = "#If MobileAppClient Then";
    String ru = "#Если МобильноеПриложениеКлиент Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.MOBILE_APP_CLIENT, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.MOBILE_APP_CLIENT, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());
  }

  @Test
  void testMobileAppServerToken() {
    String en = "#If MobileAppServer Then";
    String ru = "#Если МобильноеПриложениеСервер Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.MOBILE_APP_SERVER, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.MOBILE_APP_SERVER, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());
  }

  @Test
  void testMobileClientToken() {
    String en = "#If MobileClient Then";
    String ru = "#Если МобильныйКлиент Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.MOBILE_CLIENT, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.MOBILE_CLIENT, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());
  }

  @Test
  void testThickClientOrdinaryApplicationToken() {
    String en = "#If ThickClientOrdinaryApplication Then";
    String ru = "#Если ТолстыйКлиентОбычноеПриложение Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THICK_CLIENT_ORDINARY_APPLICATION, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THICK_CLIENT_ORDINARY_APPLICATION, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());
  }

  @Test
  void testThickClientManagedApplicationToken() {
    String en = "#If ThickClientManagedApplication Then";
    String ru = "#Если ТолстыйКлиентУправляемоеПриложение Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THICK_CLIENT_MANAGED_APPLICATION, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THICK_CLIENT_MANAGED_APPLICATION, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());
  }

  @Test
  void testExternalConnectionToken() {
    String en = "#If ExternalConnection Then";
    String ru = "#Если ВнешнееСоединение Тогда";

    var tokens = getTokensFromString(en);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.EXTERNAL_CONNECTION, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());

    tokens = getTokensFromString(ru);
    Assertions.assertEquals(5, tokens.size());
    Assertions.assertEquals(PreprocessorParserTokens.SHARP, tokens.get(0).getType());
    Assertions.assertEquals(PreprocessorParserTokens.IF, tokens.get(1).getType());
    Assertions.assertEquals(PreprocessorParserTokens.EXTERNAL_CONNECTION, tokens.get(2).getType());
    Assertions.assertEquals(PreprocessorParserTokens.THEN, tokens.get(3).getType());
  }

  private List<Token> getTokensFromString(String text) {
    try (var inputStream = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8))) {
      var charStream = CharStreams.fromStream(inputStream);
      var lexer = new PreprocessorParserTokens(charStream);
      var tokenStream = new CommonTokenStream(lexer);
      tokenStream.fill();

      return tokenStream.getTokens();
    } catch (IOException e) {
      e.printStackTrace();
      return Collections.emptyList();
    }
  }
}
