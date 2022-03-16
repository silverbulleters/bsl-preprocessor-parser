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
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.silverbulleters.preprocessor.parser.internal.ModuleListener;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;

/**
 * Препроцессор языка 1С. Используется для получения "чистого" кода модулей написанных на языке 1С, в котором инструкции препроцессора
 * обработаны, и удалены с сохранением только доступного в текущем контексте кода.
 */
public final class Preprocessor {

  /**
   * Метод предназначен для обработки текстов программных модулей, содержащих инструкции препроцессора. Данный текст будет обработан
   * в разрезе переданных в параметре метода контекстов выполнения кода, в результате чего будут сформированы тексты содержащие только тот код,
   * который доступен в конкретном контексте. Весь недоступный код и все инструкции препроцессора будут заменены на знак пробела, в целях сохранения
   * оригинальных номеров строк при дальнейшем анализе кода.
   *
   * @param inputStream Входящие текстовые данные, представляющие собой программный модуль написанный на языке 1С.
   * @param contexts Перечень контекстов выполнения, в которых ожидается выполнение кода модуля. Например, веб-клиент, тонкий клиент, сервер и т.д.
   * @return соответствие, где ключом является контекст выполнения кода 1С, а значением непосредственно код на языке 1С, который будет доступен в данном
   * контексте выполнения. Данный текст НЕ будет содержать инструкции препроцессора.
   * @throws IOException в случае ошибок при чтении входящего потока данных
   */
  public Map<ExecutionContext, String> preprocessModule(InputStream inputStream, Set<ExecutionContext> contexts) throws IOException {
    var charStream = CharStreams.fromStream(inputStream);
    var lexer = new PreprocessorParserTokens(charStream);
    var tokenStream = new CommonTokenStream(lexer);

    var preprocessor = new PreprocessorParser(tokenStream);
    var module = preprocessor.module();

    var listener = new ModuleListener();
    var walker = new ParseTreeWalker();
    listener.setRuntimeContext(contexts);
    walker.walk(listener, module);

    return listener.resultCode();
  }
}
