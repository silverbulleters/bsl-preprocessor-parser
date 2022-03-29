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
parser grammar PreprocessorParser;

options {
    tokenVocab = PreprocessorParserTokens;
}

module: (code | directive)*;
directive: insertCommand
    | deleteCommand
    | regionCommand
    | ifCommand;

insertCommand: insert (code | directive)* endInsert;
deleteCommand: delete (code | directive)* endDelete;
regionCommand: region regionName (code | directive)* endRegion;
ifCommand: ifPart elsIfPart* elsePart? endIfTerm;
ifPart: ifTerm expression thenTerm (code | directive)*;
elsIfPart: elsIfTerm expression thenTerm (code | directive)*;
elsePart: elseTerm (code | directive)*;

insert: SHARP INSERT EOL;
endInsert: SHARP END_INSERT EOL?;

delete: SHARP DELETE EOL;
endDelete: SHARP END_DELETE EOL?;

region: SHARP REGION;
regionName: IDENTIFIER EOL;
endRegion: SHARP END_REGION EOL?;

ifTerm: SHARP IF;
thenTerm: THEN EOL;
elsIfTerm: SHARP ELSIF;
elseTerm: SHARP ELSE EOL;
endIfTerm: SHARP END_IF EOL?;

code: (methodSignature | varDefinition | simpleCode)+;
methodSignature: (PROCEDURE | FUNCTION) SIGNATURE_WHITESPACE codeId;
varDefinition: VAR SIGNATURE_WHITESPACE codeId;
codeId: CODE_IDENTIFIER;
simpleCode: (CODE | EOL | WHITESPACE)+;

expression: NOT expression
    | expression AND expression
    | expression OR expression
    | symbol
    | LPAREN expression RPAREN;

symbol: SERVER
    | AT_SERVER
    | CLIENT
    | AT_CLIENT
    | THIN_CLIENT
    | MOBILE_CLIENT
    | WEB_CLIENT
    | EXTERNAL_CONNECTION
    | THICK_CLIENT_ORDINARY_APPLICATION
    | THICK_CLIENT_MANAGED_APPLICATION
    | MOBILE_STANDALONE_SERVER
    | MOBILE_APP_CLIENT
    | MOBILE_APP_SERVER;