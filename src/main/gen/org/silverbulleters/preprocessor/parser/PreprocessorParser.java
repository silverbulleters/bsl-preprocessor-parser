// Generated from PreprocessorParser.g4 by ANTLR 4.9.3
package org.silverbulleters.preprocessor.parser;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PreprocessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, WHITESPACE=2, SHARP=3, BAR=4, QUOTE=5, APOSTROPHE=6, PROCEDURE=7, 
		FUNCTION=8, VAR=9, CODE=10, IF=11, ELSIF=12, ELSE=13, END_IF=14, REGION=15, 
		END_REGION=16, INSERT=17, END_INSERT=18, DELETE=19, END_DELETE=20, AND=21, 
		OR=22, NOT=23, CLIENT=24, AT_CLIENT=25, AT_SERVER=26, SERVER=27, THIN_CLIENT=28, 
		WEB_CLIENT=29, MOBILE_STANDALONE_SERVER=30, MOBILE_APP_CLIENT=31, MOBILE_APP_SERVER=32, 
		MOBILE_CLIENT=33, THICK_CLIENT_ORDINARY_APPLICATION=34, THICK_CLIENT_MANAGED_APPLICATION=35, 
		EXTERNAL_CONNECTION=36, THEN=37, LPAREN=38, RPAREN=39, DIRECTIVE_WHTITESPACE=40, 
		SIGNATURE_WHITESPACE=41, CODE_IDENTIFIER=42, IDENTIFIER=43, REGION_WHTITESPACE=44;
	public static final int
		RULE_module = 0, RULE_directive = 1, RULE_insertCommand = 2, RULE_deleteCommand = 3, 
		RULE_regionCommand = 4, RULE_ifCommand = 5, RULE_ifPart = 6, RULE_elsIfPart = 7, 
		RULE_elsePart = 8, RULE_insert = 9, RULE_endInsert = 10, RULE_delete = 11, 
		RULE_endDelete = 12, RULE_region = 13, RULE_regionName = 14, RULE_endRegion = 15, 
		RULE_ifTerm = 16, RULE_thenTerm = 17, RULE_elsIfTerm = 18, RULE_elseTerm = 19, 
		RULE_endIfTerm = 20, RULE_code = 21, RULE_methodSignature = 22, RULE_varDefinition = 23, 
		RULE_codeId = 24, RULE_simpleCode = 25, RULE_expression = 26, RULE_symbol = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "directive", "insertCommand", "deleteCommand", "regionCommand", 
			"ifCommand", "ifPart", "elsIfPart", "elsePart", "insert", "endInsert", 
			"delete", "endDelete", "region", "regionName", "endRegion", "ifTerm", 
			"thenTerm", "elsIfTerm", "elseTerm", "endIfTerm", "code", "methodSignature", 
			"varDefinition", "codeId", "simpleCode", "expression", "symbol"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'#'", "'|'", "'\"'", "'''", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EOL", "WHITESPACE", "SHARP", "BAR", "QUOTE", "APOSTROPHE", "PROCEDURE", 
			"FUNCTION", "VAR", "CODE", "IF", "ELSIF", "ELSE", "END_IF", "REGION", 
			"END_REGION", "INSERT", "END_INSERT", "DELETE", "END_DELETE", "AND", 
			"OR", "NOT", "CLIENT", "AT_CLIENT", "AT_SERVER", "SERVER", "THIN_CLIENT", 
			"WEB_CLIENT", "MOBILE_STANDALONE_SERVER", "MOBILE_APP_CLIENT", "MOBILE_APP_SERVER", 
			"MOBILE_CLIENT", "THICK_CLIENT_ORDINARY_APPLICATION", "THICK_CLIENT_MANAGED_APPLICATION", 
			"EXTERNAL_CONNECTION", "THEN", "LPAREN", "RPAREN", "DIRECTIVE_WHTITESPACE", 
			"SIGNATURE_WHITESPACE", "CODE_IDENTIFIER", "IDENTIFIER", "REGION_WHTITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PreprocessorParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PreprocessorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ModuleContext extends ParserRuleContext {
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EOL) | (1L << WHITESPACE) | (1L << SHARP) | (1L << PROCEDURE) | (1L << FUNCTION) | (1L << VAR) | (1L << CODE))) != 0)) {
				{
				setState(58);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOL:
				case WHITESPACE:
				case PROCEDURE:
				case FUNCTION:
				case VAR:
				case CODE:
					{
					setState(56);
					code();
					}
					break;
				case SHARP:
					{
					setState(57);
					directive();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveContext extends ParserRuleContext {
		public InsertCommandContext insertCommand() {
			return getRuleContext(InsertCommandContext.class,0);
		}
		public DeleteCommandContext deleteCommand() {
			return getRuleContext(DeleteCommandContext.class,0);
		}
		public RegionCommandContext regionCommand() {
			return getRuleContext(RegionCommandContext.class,0);
		}
		public IfCommandContext ifCommand() {
			return getRuleContext(IfCommandContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitDirective(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_directive);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				insertCommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				deleteCommand();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				regionCommand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				ifCommand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertCommandContext extends ParserRuleContext {
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public EndInsertContext endInsert() {
			return getRuleContext(EndInsertContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public InsertCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterInsertCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitInsertCommand(this);
		}
	}

	public final InsertCommandContext insertCommand() throws RecognitionException {
		InsertCommandContext _localctx = new InsertCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertCommand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			insert();
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(72);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EOL:
					case WHITESPACE:
					case PROCEDURE:
					case FUNCTION:
					case VAR:
					case CODE:
						{
						setState(70);
						code();
						}
						break;
					case SHARP:
						{
						setState(71);
						directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(77);
			endInsert();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteCommandContext extends ParserRuleContext {
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public EndDeleteContext endDelete() {
			return getRuleContext(EndDeleteContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public DeleteCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterDeleteCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitDeleteCommand(this);
		}
	}

	public final DeleteCommandContext deleteCommand() throws RecognitionException {
		DeleteCommandContext _localctx = new DeleteCommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_deleteCommand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			delete();
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(82);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EOL:
					case WHITESPACE:
					case PROCEDURE:
					case FUNCTION:
					case VAR:
					case CODE:
						{
						setState(80);
						code();
						}
						break;
					case SHARP:
						{
						setState(81);
						directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(87);
			endDelete();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegionCommandContext extends ParserRuleContext {
		public RegionContext region() {
			return getRuleContext(RegionContext.class,0);
		}
		public RegionNameContext regionName() {
			return getRuleContext(RegionNameContext.class,0);
		}
		public EndRegionContext endRegion() {
			return getRuleContext(EndRegionContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public RegionCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regionCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterRegionCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitRegionCommand(this);
		}
	}

	public final RegionCommandContext regionCommand() throws RecognitionException {
		RegionCommandContext _localctx = new RegionCommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_regionCommand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			region();
			setState(90);
			regionName();
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(93);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EOL:
					case WHITESPACE:
					case PROCEDURE:
					case FUNCTION:
					case VAR:
					case CODE:
						{
						setState(91);
						code();
						}
						break;
					case SHARP:
						{
						setState(92);
						directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(98);
			endRegion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfCommandContext extends ParserRuleContext {
		public IfPartContext ifPart() {
			return getRuleContext(IfPartContext.class,0);
		}
		public EndIfTermContext endIfTerm() {
			return getRuleContext(EndIfTermContext.class,0);
		}
		public List<ElsIfPartContext> elsIfPart() {
			return getRuleContexts(ElsIfPartContext.class);
		}
		public ElsIfPartContext elsIfPart(int i) {
			return getRuleContext(ElsIfPartContext.class,i);
		}
		public ElsePartContext elsePart() {
			return getRuleContext(ElsePartContext.class,0);
		}
		public IfCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterIfCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitIfCommand(this);
		}
	}

	public final IfCommandContext ifCommand() throws RecognitionException {
		IfCommandContext _localctx = new IfCommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifCommand);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			ifPart();
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					elsIfPart();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(107);
				elsePart();
				}
				break;
			}
			setState(110);
			endIfTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfPartContext extends ParserRuleContext {
		public IfTermContext ifTerm() {
			return getRuleContext(IfTermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThenTermContext thenTerm() {
			return getRuleContext(ThenTermContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public IfPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterIfPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitIfPart(this);
		}
	}

	public final IfPartContext ifPart() throws RecognitionException {
		IfPartContext _localctx = new IfPartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			ifTerm();
			setState(113);
			expression(0);
			setState(114);
			thenTerm();
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(117);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EOL:
					case WHITESPACE:
					case PROCEDURE:
					case FUNCTION:
					case VAR:
					case CODE:
						{
						setState(115);
						code();
						}
						break;
					case SHARP:
						{
						setState(116);
						directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsIfPartContext extends ParserRuleContext {
		public ElsIfTermContext elsIfTerm() {
			return getRuleContext(ElsIfTermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThenTermContext thenTerm() {
			return getRuleContext(ThenTermContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public ElsIfPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsIfPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterElsIfPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitElsIfPart(this);
		}
	}

	public final ElsIfPartContext elsIfPart() throws RecognitionException {
		ElsIfPartContext _localctx = new ElsIfPartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elsIfPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			elsIfTerm();
			setState(123);
			expression(0);
			setState(124);
			thenTerm();
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(127);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EOL:
					case WHITESPACE:
					case PROCEDURE:
					case FUNCTION:
					case VAR:
					case CODE:
						{
						setState(125);
						code();
						}
						break;
					case SHARP:
						{
						setState(126);
						directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsePartContext extends ParserRuleContext {
		public ElseTermContext elseTerm() {
			return getRuleContext(ElseTermContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public ElsePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterElsePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitElsePart(this);
		}
	}

	public final ElsePartContext elsePart() throws RecognitionException {
		ElsePartContext _localctx = new ElsePartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elsePart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			elseTerm();
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(135);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EOL:
					case WHITESPACE:
					case PROCEDURE:
					case FUNCTION:
					case VAR:
					case CODE:
						{
						setState(133);
						code();
						}
						break;
					case SHARP:
						{
						setState(134);
						directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(PreprocessorParser.SHARP, 0); }
		public TerminalNode INSERT() { return getToken(PreprocessorParser.INSERT, 0); }
		public TerminalNode EOL() { return getToken(PreprocessorParser.EOL, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitInsert(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_insert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(SHARP);
			setState(141);
			match(INSERT);
			setState(142);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndInsertContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(PreprocessorParser.SHARP, 0); }
		public TerminalNode END_INSERT() { return getToken(PreprocessorParser.END_INSERT, 0); }
		public TerminalNode EOL() { return getToken(PreprocessorParser.EOL, 0); }
		public EndInsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endInsert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterEndInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitEndInsert(this);
		}
	}

	public final EndInsertContext endInsert() throws RecognitionException {
		EndInsertContext _localctx = new EndInsertContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_endInsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(SHARP);
			setState(145);
			match(END_INSERT);
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(146);
				match(EOL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(PreprocessorParser.SHARP, 0); }
		public TerminalNode DELETE() { return getToken(PreprocessorParser.DELETE, 0); }
		public TerminalNode EOL() { return getToken(PreprocessorParser.EOL, 0); }
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitDelete(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(SHARP);
			setState(150);
			match(DELETE);
			setState(151);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndDeleteContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(PreprocessorParser.SHARP, 0); }
		public TerminalNode END_DELETE() { return getToken(PreprocessorParser.END_DELETE, 0); }
		public TerminalNode EOL() { return getToken(PreprocessorParser.EOL, 0); }
		public EndDeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endDelete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterEndDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitEndDelete(this);
		}
	}

	public final EndDeleteContext endDelete() throws RecognitionException {
		EndDeleteContext _localctx = new EndDeleteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_endDelete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(SHARP);
			setState(154);
			match(END_DELETE);
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(155);
				match(EOL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegionContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(PreprocessorParser.SHARP, 0); }
		public TerminalNode REGION() { return getToken(PreprocessorParser.REGION, 0); }
		public RegionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_region; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterRegion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitRegion(this);
		}
	}

	public final RegionContext region() throws RecognitionException {
		RegionContext _localctx = new RegionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_region);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(SHARP);
			setState(159);
			match(REGION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PreprocessorParser.IDENTIFIER, 0); }
		public TerminalNode EOL() { return getToken(PreprocessorParser.EOL, 0); }
		public RegionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterRegionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitRegionName(this);
		}
	}

	public final RegionNameContext regionName() throws RecognitionException {
		RegionNameContext _localctx = new RegionNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_regionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(IDENTIFIER);
			setState(162);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndRegionContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(PreprocessorParser.SHARP, 0); }
		public TerminalNode END_REGION() { return getToken(PreprocessorParser.END_REGION, 0); }
		public TerminalNode EOL() { return getToken(PreprocessorParser.EOL, 0); }
		public EndRegionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endRegion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterEndRegion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitEndRegion(this);
		}
	}

	public final EndRegionContext endRegion() throws RecognitionException {
		EndRegionContext _localctx = new EndRegionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_endRegion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(SHARP);
			setState(165);
			match(END_REGION);
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(166);
				match(EOL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfTermContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(PreprocessorParser.SHARP, 0); }
		public TerminalNode IF() { return getToken(PreprocessorParser.IF, 0); }
		public IfTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterIfTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitIfTerm(this);
		}
	}

	public final IfTermContext ifTerm() throws RecognitionException {
		IfTermContext _localctx = new IfTermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(SHARP);
			setState(170);
			match(IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThenTermContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(PreprocessorParser.THEN, 0); }
		public TerminalNode EOL() { return getToken(PreprocessorParser.EOL, 0); }
		public ThenTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterThenTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitThenTerm(this);
		}
	}

	public final ThenTermContext thenTerm() throws RecognitionException {
		ThenTermContext _localctx = new ThenTermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_thenTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(THEN);
			setState(173);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsIfTermContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(PreprocessorParser.SHARP, 0); }
		public TerminalNode ELSIF() { return getToken(PreprocessorParser.ELSIF, 0); }
		public ElsIfTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsIfTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterElsIfTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitElsIfTerm(this);
		}
	}

	public final ElsIfTermContext elsIfTerm() throws RecognitionException {
		ElsIfTermContext _localctx = new ElsIfTermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elsIfTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(SHARP);
			setState(176);
			match(ELSIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseTermContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(PreprocessorParser.SHARP, 0); }
		public TerminalNode ELSE() { return getToken(PreprocessorParser.ELSE, 0); }
		public TerminalNode EOL() { return getToken(PreprocessorParser.EOL, 0); }
		public ElseTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterElseTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitElseTerm(this);
		}
	}

	public final ElseTermContext elseTerm() throws RecognitionException {
		ElseTermContext _localctx = new ElseTermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(SHARP);
			setState(179);
			match(ELSE);
			setState(180);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndIfTermContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(PreprocessorParser.SHARP, 0); }
		public TerminalNode END_IF() { return getToken(PreprocessorParser.END_IF, 0); }
		public TerminalNode EOL() { return getToken(PreprocessorParser.EOL, 0); }
		public EndIfTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endIfTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterEndIfTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitEndIfTerm(this);
		}
	}

	public final EndIfTermContext endIfTerm() throws RecognitionException {
		EndIfTermContext _localctx = new EndIfTermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_endIfTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(SHARP);
			setState(183);
			match(END_IF);
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(184);
				match(EOL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public SimpleCodeContext simpleCode() {
			return getRuleContext(SimpleCodeContext.class,0);
		}
		public MethodSignatureContext methodSignature() {
			return getRuleContext(MethodSignatureContext.class,0);
		}
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOL:
			case WHITESPACE:
			case CODE:
				{
				setState(187);
				simpleCode();
				}
				break;
			case PROCEDURE:
			case FUNCTION:
				{
				setState(188);
				methodSignature();
				}
				break;
			case VAR:
				{
				setState(189);
				varDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodSignatureContext extends ParserRuleContext {
		public TerminalNode SIGNATURE_WHITESPACE() { return getToken(PreprocessorParser.SIGNATURE_WHITESPACE, 0); }
		public CodeIdContext codeId() {
			return getRuleContext(CodeIdContext.class,0);
		}
		public TerminalNode PROCEDURE() { return getToken(PreprocessorParser.PROCEDURE, 0); }
		public TerminalNode FUNCTION() { return getToken(PreprocessorParser.FUNCTION, 0); }
		public MethodSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterMethodSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitMethodSignature(this);
		}
	}

	public final MethodSignatureContext methodSignature() throws RecognitionException {
		MethodSignatureContext _localctx = new MethodSignatureContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==PROCEDURE || _la==FUNCTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(193);
			match(SIGNATURE_WHITESPACE);
			setState(194);
			codeId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefinitionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PreprocessorParser.VAR, 0); }
		public TerminalNode SIGNATURE_WHITESPACE() { return getToken(PreprocessorParser.SIGNATURE_WHITESPACE, 0); }
		public CodeIdContext codeId() {
			return getRuleContext(CodeIdContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterVarDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitVarDefinition(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_varDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(VAR);
			setState(197);
			match(SIGNATURE_WHITESPACE);
			setState(198);
			codeId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeIdContext extends ParserRuleContext {
		public TerminalNode CODE_IDENTIFIER() { return getToken(PreprocessorParser.CODE_IDENTIFIER, 0); }
		public CodeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterCodeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitCodeId(this);
		}
	}

	public final CodeIdContext codeId() throws RecognitionException {
		CodeIdContext _localctx = new CodeIdContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_codeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(CODE_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleCodeContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(PreprocessorParser.EOL, 0); }
		public TerminalNode WHITESPACE() { return getToken(PreprocessorParser.WHITESPACE, 0); }
		public TerminalNode CODE() { return getToken(PreprocessorParser.CODE, 0); }
		public SimpleCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterSimpleCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitSimpleCode(this);
		}
	}

	public final SimpleCodeContext simpleCode() throws RecognitionException {
		SimpleCodeContext _localctx = new SimpleCodeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_simpleCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EOL) | (1L << WHITESPACE) | (1L << CODE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PreprocessorParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PreprocessorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PreprocessorParser.RPAREN, 0); }
		public TerminalNode AND() { return getToken(PreprocessorParser.AND, 0); }
		public TerminalNode OR() { return getToken(PreprocessorParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(205);
				match(NOT);
				setState(206);
				expression(5);
				}
				break;
			case CLIENT:
			case AT_CLIENT:
			case AT_SERVER:
			case SERVER:
			case THIN_CLIENT:
			case WEB_CLIENT:
			case MOBILE_STANDALONE_SERVER:
			case MOBILE_APP_CLIENT:
			case MOBILE_APP_SERVER:
			case MOBILE_CLIENT:
			case THICK_CLIENT_ORDINARY_APPLICATION:
			case THICK_CLIENT_MANAGED_APPLICATION:
			case EXTERNAL_CONNECTION:
				{
				setState(207);
				symbol();
				}
				break;
			case LPAREN:
				{
				setState(208);
				match(LPAREN);
				setState(209);
				expression(0);
				setState(210);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(215);
						match(AND);
						setState(216);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(218);
						match(OR);
						setState(219);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode SERVER() { return getToken(PreprocessorParser.SERVER, 0); }
		public TerminalNode AT_SERVER() { return getToken(PreprocessorParser.AT_SERVER, 0); }
		public TerminalNode CLIENT() { return getToken(PreprocessorParser.CLIENT, 0); }
		public TerminalNode AT_CLIENT() { return getToken(PreprocessorParser.AT_CLIENT, 0); }
		public TerminalNode THIN_CLIENT() { return getToken(PreprocessorParser.THIN_CLIENT, 0); }
		public TerminalNode MOBILE_CLIENT() { return getToken(PreprocessorParser.MOBILE_CLIENT, 0); }
		public TerminalNode WEB_CLIENT() { return getToken(PreprocessorParser.WEB_CLIENT, 0); }
		public TerminalNode EXTERNAL_CONNECTION() { return getToken(PreprocessorParser.EXTERNAL_CONNECTION, 0); }
		public TerminalNode THICK_CLIENT_ORDINARY_APPLICATION() { return getToken(PreprocessorParser.THICK_CLIENT_ORDINARY_APPLICATION, 0); }
		public TerminalNode THICK_CLIENT_MANAGED_APPLICATION() { return getToken(PreprocessorParser.THICK_CLIENT_MANAGED_APPLICATION, 0); }
		public TerminalNode MOBILE_STANDALONE_SERVER() { return getToken(PreprocessorParser.MOBILE_STANDALONE_SERVER, 0); }
		public TerminalNode MOBILE_APP_CLIENT() { return getToken(PreprocessorParser.MOBILE_APP_CLIENT, 0); }
		public TerminalNode MOBILE_APP_SERVER() { return getToken(PreprocessorParser.MOBILE_APP_SERVER, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreprocessorParserListener ) ((PreprocessorParserListener)listener).exitSymbol(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLIENT) | (1L << AT_CLIENT) | (1L << AT_SERVER) | (1L << SERVER) | (1L << THIN_CLIENT) | (1L << WEB_CLIENT) | (1L << MOBILE_STANDALONE_SERVER) | (1L << MOBILE_APP_CLIENT) | (1L << MOBILE_APP_SERVER) | (1L << MOBILE_CLIENT) | (1L << THICK_CLIENT_ORDINARY_APPLICATION) | (1L << THICK_CLIENT_MANAGED_APPLICATION) | (1L << EXTERNAL_CONNECTION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00e6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\3\3\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\3"+
		"\4\3\5\3\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6`\n"+
		"\6\f\6\16\6c\13\6\3\6\3\6\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\7\5\7o\n\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u0082\n\t\f\t\16\t\u0085\13\t\3\n\3\n\3\n\7\n\u008a\n\n\f\n\16"+
		"\n\u008d\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u0096\n\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\5\16\u009f\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\5\21\u00aa\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u00bc\n\26\3\27\3\27\3\27"+
		"\5\27\u00c1\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00d7\n\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\7\34\u00df\n\34\f\34\16\34\u00e2\13\34\3\35\3\35"+
		"\3\35\2\3\66\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668\2\5\3\2\t\n\4\2\3\4\f\f\3\2\32&\2\u00e6\2>\3\2\2\2\4E\3\2\2\2"+
		"\6G\3\2\2\2\bQ\3\2\2\2\n[\3\2\2\2\ff\3\2\2\2\16r\3\2\2\2\20|\3\2\2\2\22"+
		"\u0086\3\2\2\2\24\u008e\3\2\2\2\26\u0092\3\2\2\2\30\u0097\3\2\2\2\32\u009b"+
		"\3\2\2\2\34\u00a0\3\2\2\2\36\u00a3\3\2\2\2 \u00a6\3\2\2\2\"\u00ab\3\2"+
		"\2\2$\u00ae\3\2\2\2&\u00b1\3\2\2\2(\u00b4\3\2\2\2*\u00b8\3\2\2\2,\u00c0"+
		"\3\2\2\2.\u00c2\3\2\2\2\60\u00c6\3\2\2\2\62\u00ca\3\2\2\2\64\u00cc\3\2"+
		"\2\2\66\u00d6\3\2\2\28\u00e3\3\2\2\2:=\5,\27\2;=\5\4\3\2<:\3\2\2\2<;\3"+
		"\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\3\3\2\2\2@>\3\2\2\2AF\5\6\4\2BF"+
		"\5\b\5\2CF\5\n\6\2DF\5\f\7\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F"+
		"\5\3\2\2\2GL\5\24\13\2HK\5,\27\2IK\5\4\3\2JH\3\2\2\2JI\3\2\2\2KN\3\2\2"+
		"\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\5\26\f\2P\7\3\2\2\2QV\5\30"+
		"\r\2RU\5,\27\2SU\5\4\3\2TR\3\2\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2WY\3\2\2\2XV\3\2\2\2YZ\5\32\16\2Z\t\3\2\2\2[\\\5\34\17\2\\a\5\36\20"+
		"\2]`\5,\27\2^`\5\4\3\2_]\3\2\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2"+
		"\2bd\3\2\2\2ca\3\2\2\2de\5 \21\2e\13\3\2\2\2fj\5\16\b\2gi\5\20\t\2hg\3"+
		"\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2mo\5\22\n\2nm"+
		"\3\2\2\2no\3\2\2\2op\3\2\2\2pq\5*\26\2q\r\3\2\2\2rs\5\"\22\2st\5\66\34"+
		"\2ty\5$\23\2ux\5,\27\2vx\5\4\3\2wu\3\2\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2"+
		"\2yz\3\2\2\2z\17\3\2\2\2{y\3\2\2\2|}\5&\24\2}~\5\66\34\2~\u0083\5$\23"+
		"\2\177\u0082\5,\27\2\u0080\u0082\5\4\3\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\21\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008b\5(\25\2\u0087\u008a\5,\27"+
		"\2\u0088\u008a\5\4\3\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\23\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u008f\7\5\2\2\u008f\u0090\7\23\2\2\u0090\u0091\7"+
		"\3\2\2\u0091\25\3\2\2\2\u0092\u0093\7\5\2\2\u0093\u0095\7\24\2\2\u0094"+
		"\u0096\7\3\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\27\3\2\2"+
		"\2\u0097\u0098\7\5\2\2\u0098\u0099\7\25\2\2\u0099\u009a\7\3\2\2\u009a"+
		"\31\3\2\2\2\u009b\u009c\7\5\2\2\u009c\u009e\7\26\2\2\u009d\u009f\7\3\2"+
		"\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\33\3\2\2\2\u00a0\u00a1"+
		"\7\5\2\2\u00a1\u00a2\7\21\2\2\u00a2\35\3\2\2\2\u00a3\u00a4\7-\2\2\u00a4"+
		"\u00a5\7\3\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\7\5\2\2\u00a7\u00a9\7\22\2"+
		"\2\u00a8\u00aa\7\3\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa!"+
		"\3\2\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad\7\r\2\2\u00ad#\3\2\2\2\u00ae"+
		"\u00af\7\'\2\2\u00af\u00b0\7\3\2\2\u00b0%\3\2\2\2\u00b1\u00b2\7\5\2\2"+
		"\u00b2\u00b3\7\16\2\2\u00b3\'\3\2\2\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6"+
		"\7\17\2\2\u00b6\u00b7\7\3\2\2\u00b7)\3\2\2\2\u00b8\u00b9\7\5\2\2\u00b9"+
		"\u00bb\7\20\2\2\u00ba\u00bc\7\3\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3"+
		"\2\2\2\u00bc+\3\2\2\2\u00bd\u00c1\5\64\33\2\u00be\u00c1\5.\30\2\u00bf"+
		"\u00c1\5\60\31\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3"+
		"\2\2\2\u00c1-\3\2\2\2\u00c2\u00c3\t\2\2\2\u00c3\u00c4\7+\2\2\u00c4\u00c5"+
		"\5\62\32\2\u00c5/\3\2\2\2\u00c6\u00c7\7\13\2\2\u00c7\u00c8\7+\2\2\u00c8"+
		"\u00c9\5\62\32\2\u00c9\61\3\2\2\2\u00ca\u00cb\7,\2\2\u00cb\63\3\2\2\2"+
		"\u00cc\u00cd\t\3\2\2\u00cd\65\3\2\2\2\u00ce\u00cf\b\34\1\2\u00cf\u00d0"+
		"\7\31\2\2\u00d0\u00d7\5\66\34\7\u00d1\u00d7\58\35\2\u00d2\u00d3\7(\2\2"+
		"\u00d3\u00d4\5\66\34\2\u00d4\u00d5\7)\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00ce"+
		"\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7\u00e0\3\2\2\2\u00d8"+
		"\u00d9\f\6\2\2\u00d9\u00da\7\27\2\2\u00da\u00df\5\66\34\7\u00db\u00dc"+
		"\f\5\2\2\u00dc\u00dd\7\30\2\2\u00dd\u00df\5\66\34\6\u00de\u00d8\3\2\2"+
		"\2\u00de\u00db\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\67\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\t\4\2\2\u00e4"+
		"9\3\2\2\2\33<>EJLTV_ajnwy\u0081\u0083\u0089\u008b\u0095\u009e\u00a9\u00bb"+
		"\u00c0\u00d6\u00de\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}