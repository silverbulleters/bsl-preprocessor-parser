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

/**
 * Перечень контекстов выполнения кода 1С. Проще говоря, каждый элемент перечисления это "место" где потенциально может выполняться
 * код из программного модуля 1С.
 */
public enum ExecutionContext {
  THIN_CLIENT,
  WEB_CLIENT,
  MOBILE_CLIENT,
  STANDALONE_MOBILE_SERVER,
  SERVER,
  EXTERNAL_CONNECTION,
  MOBILE_APP_CLIENT,
  MOBILE_APP_SERVER,
  THICK_CLIENT_ORDINARY_APPLICATION,
  THICK_CLIENT_MANAGED_APPLICATION
}
