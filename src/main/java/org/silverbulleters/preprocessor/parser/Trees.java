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
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class Trees {
  private Trees() {
    // noop
  }

  /**
   * Получение полного списка токенов всех дочерних элементов узла
   *
   * @param tree узел дерева, для которого необходимо получить токены
   * @return не модифицируемый список всех токенов узла и его дочерних элементов.
   */
  public static List<Token> getTokens(@NotNull ParseTree tree) {

    if (tree instanceof TerminalNode) {
      var node = (TerminalNode) tree;
      var token = node.getSymbol();
      return List.of(token);
    }

    if (tree.getChildCount() == 0) {
      return Collections.emptyList();
    }

    List<Token> result = new ArrayList<>();
    getTokensFromParseTree(tree, result);

    return Collections.unmodifiableList(result);
  }

  /**
   * Осуществляет поиск среди всех родительских узлов аргумента, на наличие узла, соответствующего инструкции
   * препроцессора "Удаление"
   *
   * @param tree узел дерева родителей которого необходимо проверить
   * @return признак наличия инструкции препроцессора "Удаление"
   */
  public static boolean hasDeleteCommandParent(@NotNull ParseTree tree) {
    var parent = tree.getParent();

    while (parent != null) {
      if (parent instanceof PreprocessorParser.DeleteCommandContext) {
        return true;
      }
      parent = parent.getParent();
    }

    return false;
  }

  /**
   * Получает стек состоящий из узлов инструкций препроцессора "Если". Включает в себя ветки "Если", "ИначеЕсли" и "Иначе".
   * Инструкции обходятся снизу вверх, следовательно, самым верхним элементом стека будет самая верхняя инструкция препроцессора.
   *
   * @param node узел дерева с типом "CodeContext"
   * @return стек состоящий из узлов с типами "IfPartContext", "ElsePartContext" и "ElsIfPartContext".
   */
  public static @NotNull Deque<Tree> findAllIfPartParents(@NotNull Tree node) {

    Deque<Tree> result = new ArrayDeque<>();
    var parent = node.getParent();
    while (parent != null) {
      if (parent instanceof PreprocessorParser.IfPartContext
        || parent instanceof PreprocessorParser.ElsePartContext
        || parent instanceof PreprocessorParser.ElsIfPartContext) {

        result.offerLast(parent);
      }

      parent = parent.getParent();
    }

    return result;
  }

  private static void getTokensFromParseTree(@NotNull ParseTree tree, List<Token> tokens) {
    for (var i = 0; i < tree.getChildCount(); i++) {
      var childTree = tree.getChild(i);
      if (childTree instanceof TerminalNode) {
        TerminalNode node = (TerminalNode) childTree;
        var token = node.getSymbol();
        tokens.add(token);
      } else {
        getTokensFromParseTree(childTree, tokens);
      }
    }
  }
}
