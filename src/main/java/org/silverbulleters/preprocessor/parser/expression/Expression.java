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

import org.antlr.v4.runtime.Token;
import org.jetbrains.annotations.NotNull;
import org.silverbulleters.preprocessor.parser.ExecutionContext;
import org.silverbulleters.preprocessor.parser.PreprocessorParser;
import org.silverbulleters.preprocessor.parser.PreprocessorParserTokens;
import org.silverbulleters.preprocessor.parser.Trees;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import static org.silverbulleters.preprocessor.parser.PreprocessorSymbols.*;

/**
 * Абстракция логического выражения, которое встречается в инструкциях препроцессора "Если" и "ИначеЕсли"
 */
public final class Expression {

  private final List<Token> tokens;

  public Expression(PreprocessorParser.ExpressionContext nodeContext) {
    this.tokens = Trees.getTokens(nodeContext);
  }

  /**
   * Вычисляет логическое выражение относительно переданного контекста выполнения кода. Проще говоря, "чему будет равно выражение
   * если код будет выполняться на тонком клиенте/сервере/и т.д.")
   *
   * @param targetExecutionContext контекст выполнения относительно которого выполняется расчет логического выражения
   * @return истина, если логическое выражение разрешается относительно переданного контекста выполнения, и ложь в обратном случае.
   */
  public boolean evaluateExpressionByContext(ExecutionContext targetExecutionContext) {
    Deque<Integer> valueStack = new ArrayDeque<>();
    Deque<ExpressionOperator> operatorStack = new ArrayDeque<>();

    boolean logicalNotModifier = false;
    for (Token token : tokens) {
      if (isLogicalNot(token)) {
        logicalNotModifier = true;
      }
      if (isSymbol(token)) {
        int value = evaluateSymbolByRuntimeContext(targetExecutionContext, token, logicalNotModifier);
        valueStack.offerLast(value);
        logicalNotModifier = false;
      } else if (isLeftParenthesis(token)) {
        operatorStack.offerLast(ExpressionOperator.LEFT_PARENTHESIS);
      } else if (isRightParenthesis(token)) {
        calculateParenthesisValue(valueStack, operatorStack);
      } else if (isOperator(token)) {
        handleOperatorToken(ExpressionOperator.fromString(token.getText()), operatorStack, valueStack);
      }
    }

    int result = calculateFinalResult(operatorStack, valueStack);
    return result == 1;
  }

  private int calculateFinalResult(Deque<ExpressionOperator> operatorStack, Deque<Integer> valueStack) {
    while (!operatorStack.isEmpty()) {
      var currentOperator = operatorStack.removeLast();
      var firstOperand = valueStack.removeLast();
      var secondOperand = valueStack.removeLast();

      int result = calculateSimpleExpression(firstOperand, secondOperand, currentOperator);
      valueStack.offerLast(result);
    }

    return valueStack.removeLast();
  }

  private void handleOperatorToken(ExpressionOperator operator, Deque<ExpressionOperator> operatorStack, Deque<Integer> valueStack) {
    while (!operatorStack.isEmpty() && operatorStack.peekLast().compareTo(operator) >= 0) {
      var currentOperator = operatorStack.removeLast();
      var firstOperand = valueStack.removeLast();
      var secondOperand = valueStack.removeLast();

      int result = calculateSimpleExpression(firstOperand, secondOperand, currentOperator);
      valueStack.offerLast(result);
    }

    operatorStack.offerLast(operator);
  }

  private int calculateSimpleExpression(int firstOperand, int secondOperand, ExpressionOperator operator) {
    switch (operator) {
      case OR: {
        return firstOperand | secondOperand;
      }
      case AND: {
        return firstOperand & secondOperand;
      }
      default:
        throw new IllegalArgumentException("Unknown operator " + operator);
    }
  }

  private void calculateParenthesisValue(Deque<Integer> valueStack, Deque<ExpressionOperator> operatorStack) {

    while (operatorStack.peekLast() != null && operatorStack.peekLast() != ExpressionOperator.LEFT_PARENTHESIS) {
      var currentOperator = operatorStack.removeLast();
      int firstOperand = valueStack.removeLast();
      int secondOperand = valueStack.removeLast();
      int result = calculateSimpleExpression(firstOperand, secondOperand, currentOperator);

      valueStack.offerLast(result);
    }

    operatorStack.removeLast(); // discard left parenthesis
  }

  /**
   * Каждый символ препроцессора может быть вычисляться в истину или ложь, в зависимости от контекста выполнения кода. Так,
   * символ {@code ТонкийКлиент} в логическом выражении, будет равен истине только в тех случаях, когда код выполняется на тонком
   * клиенте. Для удобства последующего вычисления выражений вместо использования булевых операндов, символы разрешаются в
   * целочисленные эквиваленты, где 0 - ложь, 1 - истина.
   *
   * @param targetExecutionContext контекст выполнения относительно которого идет расчет символа
   * @param symbol символ препроцессора. Например "Сервер", "Клиент", "ВебКлиент" и т.д.
   * @param logicalNotModifier признак наличия логического отрицания ПЕРЕД символом.
   * @return 1 если переданный символ доступен в текущем контексте, 0 если символ недоступен в данном контексте.
   */
  private int evaluateSymbolByRuntimeContext(@NotNull ExecutionContext targetExecutionContext, Token symbol, boolean logicalNotModifier) {
    int result = 0;
    switch (targetExecutionContext) {
      case SERVER: {
        if (isServerSymbol(symbol) || isAtServerSymbol(symbol)) {
          result = 1;
        }
        break;
      }
      case EXTERNAL_CONNECTION: {
        if (isExternalConnectionSymbol(symbol)) {
          result = 1;
        }
        break;
      }
      case MOBILE_APP_CLIENT: {
        if (isClientSymbol(symbol) || isAtClientSymbol(symbol) || isMobileAppClientSymbol(symbol)) {
          result = 1;
        }
        break;
      }
      case WEB_CLIENT: {
        if (isClientSymbol(symbol) || isAtClientSymbol(symbol) || isWebClientSymbol(symbol)) {
          result = 1;
        }
        break;
      }
      case MOBILE_APP_SERVER: {
        if (isServerSymbol(symbol) || isAtServerSymbol(symbol) || isMobileAppServerSymbol(symbol)) {
          result = 1;
        }
        break;
      }
      case THIN_CLIENT: {
        if (isClientSymbol(symbol) || isAtClientSymbol(symbol) || isThinClientSymbol(symbol)) {
          result = 1;
        }
        break;
      }
      case MOBILE_CLIENT: {
        if (isClientSymbol(symbol) || isAtClientSymbol(symbol) || isMobileClientSymbol(symbol)) {
          result = 1;
        }
        break;
      }
      case STANDALONE_MOBILE_SERVER: {
        if (isServerSymbol(symbol) || isAtServerSymbol(symbol) || isMobileStandaloneServerSymbol(symbol)) {
          result = 1;
        }
        break;
      }
      case THICK_CLIENT_MANAGED_APPLICATION: {
        if (isClientSymbol(symbol) || isAtClientSymbol(symbol) || isThickClientManagedApplicationSymbol(symbol)) {
          result = 1;
        }
        break;
      }
      case THICK_CLIENT_ORDINARY_APPLICATION: {
        if (isClientSymbol(symbol) || isAtClientSymbol(symbol) || isThickClientOrdinaryApplicationSymbol(symbol)) {
          result = 1;
        }
        break;
      }
      default:
    }

    return logicalNotModifier ? result ^ 1 : result;
  }

  private boolean isLeftParenthesis(Token symbol) {
    return symbol.getType() == PreprocessorParserTokens.LPAREN;
  }

  private boolean isRightParenthesis(Token symbol) {
    return symbol.getType() == PreprocessorParserTokens.RPAREN;
  }

  private boolean isOperator(Token token) {
    return token.getType() == PreprocessorParserTokens.AND || token.getType() == PreprocessorParserTokens.OR;
  }

  private boolean isLogicalNot(Token token) {
    return token.getType() == PreprocessorParserTokens.NOT;
  }
}
