// Generated from PreprocessorParser.g4 by ANTLR 4.9.3
package org.silverbulleters.preprocessor.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PreprocessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, WHTITESPACE=2, SHARP=3, CODE=4, BAR=5, QUOTE=6, APOSTROPHE=7, IF=8, 
		ELSIF=9, ELSE=10, END_IF=11, REGION=12, END_REGION=13, INSERT=14, END_INSERT=15, 
		DELETE=16, END_DELETE=17, AND=18, OR=19, NOT=20, CLIENT=21, AT_CLIENT=22, 
		AT_SERVER=23, SERVER=24, THIN_CLIENT=25, WEB_CLIENT=26, MOBILE_STANDALONE_SERVER=27, 
		MOBILE_APP_CLIENT=28, MOBILE_APP_SERVER=29, MOBILE_CLIENT=30, THICK_CLIENT_ORDINARY_APPLICATION=31, 
		THICK_CLIENT_MANAGED_APPLICATION=32, EXTERNAL_CONNECTION=33, THEN=34, 
		LPAREN=35, RPAREN=36, IDENTIFIER=37, DIRECTIVE_WHTITESPACE=38;
	public static final int
		RULE_module = 0, RULE_directive = 1, RULE_insertCommand = 2, RULE_deleteCommand = 3, 
		RULE_regionCommand = 4, RULE_ifCommand = 5, RULE_ifPart = 6, RULE_elsIfPart = 7, 
		RULE_elsePart = 8, RULE_insert = 9, RULE_endInsert = 10, RULE_delete = 11, 
		RULE_endDelete = 12, RULE_region = 13, RULE_regionName = 14, RULE_endRegion = 15, 
		RULE_ifTerm = 16, RULE_thenTerm = 17, RULE_elsIfTerm = 18, RULE_elseTerm = 19, 
		RULE_endIfTerm = 20, RULE_code = 21, RULE_expression = 22, RULE_symbol = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "directive", "insertCommand", "deleteCommand", "regionCommand", 
			"ifCommand", "ifPart", "elsIfPart", "elsePart", "insert", "endInsert", 
			"delete", "endDelete", "region", "regionName", "endRegion", "ifTerm", 
			"thenTerm", "elsIfTerm", "elseTerm", "endIfTerm", "code", "expression", 
			"symbol"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'#'", null, "'|'", "'\"'", "'''", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EOL", "WHTITESPACE", "SHARP", "CODE", "BAR", "QUOTE", "APOSTROPHE", 
			"IF", "ELSIF", "ELSE", "END_IF", "REGION", "END_REGION", "INSERT", "END_INSERT", 
			"DELETE", "END_DELETE", "AND", "OR", "NOT", "CLIENT", "AT_CLIENT", "AT_SERVER", 
			"SERVER", "THIN_CLIENT", "WEB_CLIENT", "MOBILE_STANDALONE_SERVER", "MOBILE_APP_CLIENT", 
			"MOBILE_APP_SERVER", "MOBILE_CLIENT", "THICK_CLIENT_ORDINARY_APPLICATION", 
			"THICK_CLIENT_MANAGED_APPLICATION", "EXTERNAL_CONNECTION", "THEN", "LPAREN", 
			"RPAREN", "IDENTIFIER", "DIRECTIVE_WHTITESPACE"
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EOL) | (1L << SHARP) | (1L << CODE))) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOL:
				case CODE:
					{
					setState(48);
					code();
					}
					break;
				case SHARP:
					{
					setState(49);
					directive();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54);
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
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				insertCommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				deleteCommand();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				regionCommand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
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
			setState(61);
			insert();
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(64);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EOL:
					case CODE:
						{
						setState(62);
						code();
						}
						break;
					case SHARP:
						{
						setState(63);
						directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(69);
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
			setState(71);
			delete();
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(74);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EOL:
					case CODE:
						{
						setState(72);
						code();
						}
						break;
					case SHARP:
						{
						setState(73);
						directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(79);
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
			setState(81);
			region();
			setState(82);
			regionName();
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(85);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EOL:
					case CODE:
						{
						setState(83);
						code();
						}
						break;
					case SHARP:
						{
						setState(84);
						directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(90);
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
			setState(92);
			ifPart();
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					elsIfPart();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(99);
				elsePart();
				}
				break;
			}
			setState(102);
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
			setState(104);
			ifTerm();
			setState(105);
			expression(0);
			setState(106);
			thenTerm();
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(109);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EOL:
					case CODE:
						{
						setState(107);
						code();
						}
						break;
					case SHARP:
						{
						setState(108);
						directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(113);
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
			setState(114);
			elsIfTerm();
			setState(115);
			expression(0);
			setState(116);
			thenTerm();
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(119);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EOL:
					case CODE:
						{
						setState(117);
						code();
						}
						break;
					case SHARP:
						{
						setState(118);
						directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(123);
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
			setState(124);
			elseTerm();
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(127);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EOL:
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
			setState(132);
			match(SHARP);
			setState(133);
			match(INSERT);
			setState(134);
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
			setState(136);
			match(SHARP);
			setState(137);
			match(END_INSERT);
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(138);
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
			setState(141);
			match(SHARP);
			setState(142);
			match(DELETE);
			setState(143);
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
			setState(145);
			match(SHARP);
			setState(146);
			match(END_DELETE);
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(147);
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
			setState(150);
			match(SHARP);
			setState(151);
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
			setState(153);
			match(IDENTIFIER);
			setState(154);
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
			setState(156);
			match(SHARP);
			setState(157);
			match(END_REGION);
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(158);
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
			setState(161);
			match(SHARP);
			setState(162);
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
			setState(164);
			match(THEN);
			setState(165);
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
			setState(167);
			match(SHARP);
			setState(168);
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
			setState(170);
			match(SHARP);
			setState(171);
			match(ELSE);
			setState(172);
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
			setState(174);
			match(SHARP);
			setState(175);
			match(END_IF);
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(176);
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
		public List<TerminalNode> CODE() { return getTokens(PreprocessorParser.CODE); }
		public TerminalNode CODE(int i) {
			return getToken(PreprocessorParser.CODE, i);
		}
		public List<TerminalNode> EOL() { return getTokens(PreprocessorParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(PreprocessorParser.EOL, i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(179);
					_la = _input.LA(1);
					if ( !(_la==EOL || _la==CODE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(182); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(185);
				match(NOT);
				setState(186);
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
				setState(187);
				symbol();
				}
				break;
			case LPAREN:
				{
				setState(188);
				match(LPAREN);
				setState(189);
				expression(0);
				setState(190);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(195);
						match(AND);
						setState(196);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(198);
						match(OR);
						setState(199);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(204);
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
		enterRule(_localctx, 46, RULE_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
		case 22:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3"+
		"\4\7\4C\n\4\f\4\16\4F\13\4\3\4\3\4\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\7\3\7\7\7a"+
		"\n\7\f\7\16\7d\13\7\3\7\5\7g\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bp\n\b"+
		"\f\b\16\bs\13\b\3\t\3\t\3\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\n\3\n\3"+
		"\n\7\n\u0082\n\n\f\n\16\n\u0085\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5"+
		"\f\u008e\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0097\n\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00a2\n\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u00b4"+
		"\n\26\3\27\6\27\u00b7\n\27\r\27\16\27\u00b8\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u00c3\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00cb"+
		"\n\30\f\30\16\30\u00ce\13\30\3\31\3\31\3\31\2\3.\32\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\2\4\4\2\3\3\6\6\3\2\27#\2\u00d5\2\66"+
		"\3\2\2\2\4=\3\2\2\2\6?\3\2\2\2\bI\3\2\2\2\nS\3\2\2\2\f^\3\2\2\2\16j\3"+
		"\2\2\2\20t\3\2\2\2\22~\3\2\2\2\24\u0086\3\2\2\2\26\u008a\3\2\2\2\30\u008f"+
		"\3\2\2\2\32\u0093\3\2\2\2\34\u0098\3\2\2\2\36\u009b\3\2\2\2 \u009e\3\2"+
		"\2\2\"\u00a3\3\2\2\2$\u00a6\3\2\2\2&\u00a9\3\2\2\2(\u00ac\3\2\2\2*\u00b0"+
		"\3\2\2\2,\u00b6\3\2\2\2.\u00c2\3\2\2\2\60\u00cf\3\2\2\2\62\65\5,\27\2"+
		"\63\65\5\4\3\2\64\62\3\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\67\3\3\2\2\28\66\3\2\2\29>\5\6\4\2:>\5\b\5\2;>\5\n\6\2<>\5"+
		"\f\7\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\5\3\2\2\2?D\5\24\13\2"+
		"@C\5,\27\2AC\5\4\3\2B@\3\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2"+
		"EG\3\2\2\2FD\3\2\2\2GH\5\26\f\2H\7\3\2\2\2IN\5\30\r\2JM\5,\27\2KM\5\4"+
		"\3\2LJ\3\2\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2"+
		"\2\2QR\5\32\16\2R\t\3\2\2\2ST\5\34\17\2TY\5\36\20\2UX\5,\27\2VX\5\4\3"+
		"\2WU\3\2\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2"+
		"\2\2\\]\5 \21\2]\13\3\2\2\2^b\5\16\b\2_a\5\20\t\2`_\3\2\2\2ad\3\2\2\2"+
		"b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2eg\5\22\n\2fe\3\2\2\2fg\3\2\2"+
		"\2gh\3\2\2\2hi\5*\26\2i\r\3\2\2\2jk\5\"\22\2kl\5.\30\2lq\5$\23\2mp\5,"+
		"\27\2np\5\4\3\2om\3\2\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\17"+
		"\3\2\2\2sq\3\2\2\2tu\5&\24\2uv\5.\30\2v{\5$\23\2wz\5,\27\2xz\5\4\3\2y"+
		"w\3\2\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\21\3\2\2\2}{\3\2\2"+
		"\2~\u0083\5(\25\2\177\u0082\5,\27\2\u0080\u0082\5\4\3\2\u0081\177\3\2"+
		"\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\23\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\5\2"+
		"\2\u0087\u0088\7\20\2\2\u0088\u0089\7\3\2\2\u0089\25\3\2\2\2\u008a\u008b"+
		"\7\5\2\2\u008b\u008d\7\21\2\2\u008c\u008e\7\3\2\2\u008d\u008c\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\27\3\2\2\2\u008f\u0090\7\5\2\2\u0090\u0091"+
		"\7\22\2\2\u0091\u0092\7\3\2\2\u0092\31\3\2\2\2\u0093\u0094\7\5\2\2\u0094"+
		"\u0096\7\23\2\2\u0095\u0097\7\3\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3"+
		"\2\2\2\u0097\33\3\2\2\2\u0098\u0099\7\5\2\2\u0099\u009a\7\16\2\2\u009a"+
		"\35\3\2\2\2\u009b\u009c\7\'\2\2\u009c\u009d\7\3\2\2\u009d\37\3\2\2\2\u009e"+
		"\u009f\7\5\2\2\u009f\u00a1\7\17\2\2\u00a0\u00a2\7\3\2\2\u00a1\u00a0\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2!\3\2\2\2\u00a3\u00a4\7\5\2\2\u00a4\u00a5"+
		"\7\n\2\2\u00a5#\3\2\2\2\u00a6\u00a7\7$\2\2\u00a7\u00a8\7\3\2\2\u00a8%"+
		"\3\2\2\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab\7\13\2\2\u00ab\'\3\2\2\2\u00ac"+
		"\u00ad\7\5\2\2\u00ad\u00ae\7\f\2\2\u00ae\u00af\7\3\2\2\u00af)\3\2\2\2"+
		"\u00b0\u00b1\7\5\2\2\u00b1\u00b3\7\r\2\2\u00b2\u00b4\7\3\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4+\3\2\2\2\u00b5\u00b7\t\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9-\3\2\2\2\u00ba\u00bb\b\30\1\2\u00bb\u00bc\7\26\2\2\u00bc\u00c3"+
		"\5.\30\7\u00bd\u00c3\5\60\31\2\u00be\u00bf\7%\2\2\u00bf\u00c0\5.\30\2"+
		"\u00c0\u00c1\7&\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bd"+
		"\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3\u00cc\3\2\2\2\u00c4\u00c5\f\6\2\2\u00c5"+
		"\u00c6\7\24\2\2\u00c6\u00cb\5.\30\7\u00c7\u00c8\f\5\2\2\u00c8\u00c9\7"+
		"\25\2\2\u00c9\u00cb\5.\30\6\u00ca\u00c4\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd/\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00cf\u00d0\t\3\2\2\u00d0\61\3\2\2\2\33\64\66=BD"+
		"LNWYbfoqy{\u0081\u0083\u008d\u0096\u00a1\u00b3\u00b8\u00c2\u00ca\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}