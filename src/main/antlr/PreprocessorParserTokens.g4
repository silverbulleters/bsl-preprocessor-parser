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
lexer grammar PreprocessorParserTokens;

EOL: [\r\n]+;
WHITESPACE: [ \t]+;
COMMENT: SLASH SLASH ~[\r\n]* -> type(CODE);
SHARP: '#' -> mode(DIRECTIVE_MODE);
STRING_START: QUOTE (~["\r\n]| QUOTE QUOTE)* -> type(CODE);
STRING_PART: BAR (~[\r\n"] | QUOTE QUOTE)* -> type(CODE);
STRING_END: BAR (~["\r\n] | QUOTE QUOTE)* QUOTE -> type(CODE);
STRING: QUOTE (~[\r\n"] | QUOTE QUOTE)* QUOTE -> type(CODE);
DATE: APOSTROPHE (~['\r\n])* APOSTROPHE -> type(CODE);
BAR: '|';
QUOTE: '"';
APOSTROPHE: '\'';
SLASH: '/' -> type(CODE);

PROCEDURE: (P_RU R_RU O_RU CZ_RU E_RU D_RU U_RU R_RU A_RU | P R O C E D U R E) -> mode(SIGNATURE_MODE);
FUNCTION: (F_RU U_RU N_RU K_RU CZ_RU I_RU YA_RU | F U N C T I O N) -> mode(SIGNATURE_MODE);
VAR: (P_RU E_RU R_RU E_RU M_RU | V A R) -> mode(SIGNATURE_MODE);
CODE: ~[#'"\r\n \t/]+;

mode DIRECTIVE_MODE;
IF: I F | E_RU S_RU L_RU I_RU;
ELSIF: E L S I F | I_RU N_RU A_RU CH_RU E_RU E_RU S_RU L_RU I_RU;
ELSE: (E L S E | I_RU N_RU A_RU CH_RU E_RU) -> mode(DEFAULT_MODE);
END_IF: (E N D I F | K_RU O_RU N_RU E_RU CZ_RU E_RU S_RU L_RU I_RU) -> mode(DEFAULT_MODE);
REGION: (R E G I O N | O_RU B_RU L_RU A_RU S_RU T_RU SOFT_SIGN_RU) -> mode(REGION_MODE);
END_REGION: (E N D R E G I O N | K_RU O_RU N_RU E_RU CZ_RU O_RU B_RU L_RU A_RU S_RU T_RU I_RU) -> mode(DEFAULT_MODE);
INSERT: (I N S E R T | V_RU S_RU T_RU A_RU V_RU K_RU A_RU) -> mode(DEFAULT_MODE);
END_INSERT: (E N D I N S E R T | K_RU O_RU N_RU E_RU CZ_RU V_RU S_RU T_RU A_RU V_RU K_RU I_RU) -> mode(DEFAULT_MODE);
DELETE: (D E L E T E | U_RU D_RU A_RU L_RU E_RU N_RU I_RU E_RU) -> mode(DEFAULT_MODE);
END_DELETE: (E N D D E L E T E | K_RU O_RU N_RU E_RU CZ_RU U_RU D_RU A_RU L_RU E_RU N_RU I_RU YA_RU) -> mode(DEFAULT_MODE);
AND: A N D | I_RU;
OR: O R | I_RU L_RU I_RU;
NOT: N O T | N_RU E_RU;
CLIENT: C L I E N T | K_RU L_RU I_RU E_RU N_RU T_RU;
AT_CLIENT: A T C L I E N T | N_RU A_RU K_RU L_RU I_RU E_RU N_RU T_RU E_RU;
AT_SERVER: A T S E R V E R | N_RU A_RU S_RU E_RU R_RU V_RU E_RU R_RU E_RU;
SERVER: S E R V E R | S_RU E_RU R_RU V_RU E_RU R_RU;
THIN_CLIENT: T H I N C L I E N T | T_RU O_RU N_RU K_RU I_RU J_RU K_RU L_RU I_RU E_RU N_RU T_RU;
WEB_CLIENT: W E B C L I E N T | V_RU E_RU B_RU K_RU L_RU I_RU E_RU N_RU T_RU;
MOBILE_STANDALONE_SERVER: M O B I L E S T A N D A L O N E S E R V E R
    | M_RU O_RU B_RU I_RU L_RU SOFT_SIGN_RU N_RU Y_RU J_RU A_RU V_RU T_RU O_RU N_RU O_RU M_RU N_RU Y_RU J_RU S_RU E_RU R_RU V_RU E_RU R_RU;
MOBILE_APP_CLIENT: M O B I L E A P P C L I E N T
    | M_RU O_RU B_RU I_RU L_RU SOFT_SIGN_RU N_RU O_RU E_RU P_RU R_RU I_RU L_RU O_RU ZH_RU E_RU N_RU I_RU E_RU K_RU L_RU I_RU E_RU N_RU T_RU;
MOBILE_APP_SERVER: M O B I L E A P P S E R V E R
    | M_RU O_RU B_RU I_RU L_RU SOFT_SIGN_RU N_RU O_RU E_RU P_RU R_RU I_RU L_RU O_RU ZH_RU E_RU N_RU I_RU E_RU S_RU E_RU R_RU V_RU E_RU R_RU;
MOBILE_CLIENT: M O B I L E C L I E N T | M_RU O_RU B_RU I_RU L_RU SOFT_SIGN_RU N_RU Y_RU J_RU K_RU L_RU I_RU E_RU N_RU T_RU;
THICK_CLIENT_ORDINARY_APPLICATION: T H I C K C L I E N T O R D I N A R Y A P P L I C A T I O N
    | T_RU O_RU L_RU S_RU T_RU Y_RU J_RU K_RU L_RU I_RU E_RU N_RU T_RU O_RU B_RU Y_RU CH_RU N_RU O_RU E_RU P_RU R_RU I_RU L_RU O_RU ZH_RU E_RU N_RU I_RU E_RU;
THICK_CLIENT_MANAGED_APPLICATION: T H I C K C L I E N T M A N A G E D A P P L I C A T I O N
    | T_RU O_RU L_RU S_RU T_RU Y_RU J_RU K_RU L_RU I_RU E_RU N_RU T_RU U_RU P_RU R_RU A_RU V_RU L_RU YA_RU E_RU M_RU O_RU E_RU P_RU R_RU I_RU L_RU O_RU ZH_RU E_RU N_RU I_RU E_RU;
EXTERNAL_CONNECTION: E X T E R N A L C O N N E C T I O N
 | V_RU N_RU E_RU SH_RU N_RU E_RU E_RU S_RU O_RU E_RU D_RU I_RU N_RU E_RU N_RU I_RU E_RU;
THEN: (T H E N | T_RU O_RU G_RU D_RU A_RU) -> mode(DEFAULT_MODE);
LPAREN: '(';
RPAREN: ')';
DIRECTIVE_WHTITESPACE: [ \t]+ -> skip;

mode SIGNATURE_MODE;
SIGNATURE_WHITESPACE: [ \t]+;
CODE_IDENTIFIER: LETTER (LETTER | DIGIT)* -> mode(DEFAULT_MODE);

mode REGION_MODE;
IDENTIFIER: LETTER (LETTER | DIGIT)* -> mode(DEFAULT_MODE);
REGION_WHTITESPACE: [ \t]+ -> skip;

fragment A: [Aa];
fragment B: [Bb];
fragment C: [Cc];
fragment D: [Dd];
fragment E: [Ee];
fragment F: [Ff];
fragment G: [Gg];
fragment H: [Hh];
fragment I: [Ii];
fragment J: [Jj];
fragment K: [Kk];
fragment L: [Ll];
fragment M: [Mm];
fragment N: [Nn];
fragment O: [Oo];
fragment P: [Pp];
fragment Q: [Qq];
fragment R: [Rr];
fragment S: [Ss];
fragment T: [Tt];
fragment U: [Uu];
fragment V: [Vv];
fragment W: [Ww];
fragment X: [Xx];
fragment Y: [Yy];
fragment Z: [Zz];

fragment A_RU: [????];
fragment B_RU: [????];
fragment V_RU: [????];
fragment G_RU: [????];
fragment D_RU: [????];
fragment E_RU: [????];
fragment YO_RU: [????];
fragment ZH_RU: [????];
fragment Z_RU: [????];
fragment I_RU: [????];
fragment J_RU: [????];
fragment K_RU: [????];
fragment L_RU: [????];
fragment M_RU: [????];
fragment N_RU: [????];
fragment O_RU: [????];
fragment P_RU: [????];
fragment R_RU: [????];
fragment S_RU: [????];
fragment T_RU: [????];
fragment U_RU: [????];
fragment F_RU: [????];
fragment X_RU: [????];
fragment CZ_RU: [????];
fragment CH_RU: [????];
fragment SH_RU: [????];
fragment SHH_RU: [????];
fragment HARD_SIGN_RU: [????];
fragment Y_RU: [????];
fragment SOFT_SIGN_RU: [????];
fragment EH_RU: [????];
fragment YU_RU: [????];
fragment YA_RU: [????];

fragment LETTER: [\p{Letter}] | '_';
fragment DIGIT: [0-9];