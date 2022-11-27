// Generated from java-escape by ANTLR 4.11.1
package org.plang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, COMMENT=2, MUL=3, DIV=4, ADD=5, SUB=6, EXP=7, NEQ=8, GTE=9, LTE=10, 
		GT=11, LT=12, EQ=13, AND=14, OR=15, IF=16, ELSE=17, LOOP=18, DEF=19, ROUND_LEFT=20, 
		ROUND_RIGHT=21, SQUARE_LEFT=22, SQUARE_RIGHT=23, CURLY_LEFT=24, CURLY_RIGHT=25, 
		TRUE=26, FALSE=27, NUMBER=28, STRINGLITERAL=29, ID=30, NEWLINE=31, WS=32, 
		SEMI=33, SPACE=34, COMMA=35;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_function = 2, RULE_funcBlock = 3, 
		RULE_statement = 4, RULE_stringLiteral = 5, RULE_number = 6, RULE_bool = 7, 
		RULE_id = 8, RULE_functionCall = 9, RULE_variable = 10, RULE_newVariableAssignment = 11, 
		RULE_variableAssignment = 12, RULE_if_ = 13, RULE_elseIf = 14, RULE_else_ = 15, 
		RULE_loop = 16, RULE_expr = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "function", "funcBlock", "statement", "stringLiteral", 
			"number", "bool", "id", "functionCall", "variable", "newVariableAssignment", 
			"variableAssignment", "if_", "elseIf", "else_", "loop", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", null, "'*'", "'/'", "'+'", "'-'", "'^'", "'<>'", "'>='", 
			"'<='", "'>'", "'<'", "'=='", null, null, "'if'", "'else'", "'loop'", 
			"'def'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'true'", "'false'", 
			null, null, null, null, null, "';'", "' '", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "COMMENT", "MUL", "DIV", "ADD", "SUB", "EXP", "NEQ", "GTE", 
			"LTE", "GT", "LT", "EQ", "AND", "OR", "IF", "ELSE", "LOOP", "DEF", "ROUND_LEFT", 
			"ROUND_RIGHT", "SQUARE_LEFT", "SQUARE_RIGHT", "CURLY_LEFT", "CURLY_RIGHT", 
			"TRUE", "FALSE", "NUMBER", "STRINGLITERAL", "ID", "NEWLINE", "WS", "SEMI", 
			"SPACE", "COMMA"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PLangParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			block();
			setState(37);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3222077444L) != 0) {
				{
				{
				setState(39);
				statement();
				}
				}
				setState(44);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public IdContext name;
		public TerminalNode DEF() { return getToken(PLangParser.DEF, 0); }
		public TerminalNode ROUND_LEFT() { return getToken(PLangParser.ROUND_LEFT, 0); }
		public TerminalNode ROUND_RIGHT() { return getToken(PLangParser.ROUND_RIGHT, 0); }
		public FuncBlockContext funcBlock() {
			return getRuleContext(FuncBlockContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLangParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(DEF);
			setState(46);
			((FunctionContext)_localctx).name = id();
			setState(47);
			match(ROUND_LEFT);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(48);
				id();
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(49);
					match(COMMA);
					setState(50);
					id();
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(58);
			match(ROUND_RIGHT);
			setState(59);
			funcBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncBlockContext extends ParserRuleContext {
		public TerminalNode CURLY_LEFT() { return getToken(PLangParser.CURLY_LEFT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CURLY_RIGHT() { return getToken(PLangParser.CURLY_RIGHT, 0); }
		public FuncBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterFuncBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitFuncBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitFuncBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBlockContext funcBlock() throws RecognitionException {
		FuncBlockContext _localctx = new FuncBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(CURLY_LEFT);
			setState(62);
			block();
			setState(63);
			match(CURLY_RIGHT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public NewVariableAssignmentContext newVariableAssignment() {
			return getRuleContext(NewVariableAssignmentContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(PLangParser.COMMENT, 0); }
		public TerminalNode NEWLINE() { return getToken(PLangParser.NEWLINE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				variableAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				newVariableAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				if_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				function();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				functionCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				match(COMMENT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(73);
				match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(PLangParser.STRINGLITERAL, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(STRINGLITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PLangParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PLangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PLangParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLangParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ROUND_LEFT() { return getToken(PLangParser.ROUND_LEFT, 0); }
		public TerminalNode ROUND_RIGHT() { return getToken(PLangParser.ROUND_RIGHT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PLangParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			id();
			setState(85);
			match(ROUND_LEFT);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2081423360L) != 0) {
				{
				setState(86);
				expr(0);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(87);
					match(COMMA);
					setState(88);
					expr(0);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(96);
			match(ROUND_RIGHT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PLangParser.DEF, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(DEF);
			setState(99);
			id();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NewVariableAssignmentContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PLangParser.DEF, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NewVariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newVariableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterNewVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitNewVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitNewVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewVariableAssignmentContext newVariableAssignment() throws RecognitionException {
		NewVariableAssignmentContext _localctx = new NewVariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_newVariableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(DEF);
			setState(102);
			id();
			setState(103);
			match(T__0);
			setState(104);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignmentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			id();
			setState(107);
			match(T__0);
			setState(108);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PLangParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncBlockContext funcBlock() {
			return getRuleContext(FuncBlockContext.class,0);
		}
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitIf_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitIf_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IF);
			setState(111);
			expr(0);
			setState(112);
			funcBlock();
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					elseIf();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(119);
				else_();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PLangParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(PLangParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncBlockContext funcBlock() {
			return getRuleContext(FuncBlockContext.class,0);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ELSE);
			setState(123);
			match(IF);
			setState(124);
			expr(0);
			setState(125);
			funcBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_Context extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PLangParser.ELSE, 0); }
		public FuncBlockContext funcBlock() {
			return getRuleContext(FuncBlockContext.class,0);
		}
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterElse_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitElse_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_else_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ELSE);
			setState(128);
			funcBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(PLangParser.LOOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncBlockContext funcBlock() {
			return getRuleContext(FuncBlockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(LOOP);
			setState(131);
			expr(0);
			setState(132);
			funcBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext left;
		public ExprContext nested;
		public Token op;
		public ExprContext right;
		public TerminalNode ROUND_LEFT() { return getToken(PLangParser.ROUND_LEFT, 0); }
		public TerminalNode ROUND_RIGHT() { return getToken(PLangParser.ROUND_RIGHT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode MUL() { return getToken(PLangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PLangParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(PLangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PLangParser.SUB, 0); }
		public TerminalNode LT() { return getToken(PLangParser.LT, 0); }
		public TerminalNode LTE() { return getToken(PLangParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(PLangParser.GTE, 0); }
		public TerminalNode GT() { return getToken(PLangParser.GT, 0); }
		public TerminalNode EQ() { return getToken(PLangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(PLangParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(PLangParser.AND, 0); }
		public TerminalNode OR() { return getToken(PLangParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLangListener ) ((PLangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLangVisitor ) return ((PLangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROUND_LEFT:
				{
				setState(135);
				match(ROUND_LEFT);
				setState(136);
				((ExprContext)_localctx).nested = expr(0);
				setState(137);
				match(ROUND_RIGHT);
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(139);
				bool();
				}
				break;
			case NUMBER:
				{
				setState(140);
				number();
				}
				break;
			case STRINGLITERAL:
				{
				setState(141);
				stringLiteral();
				}
				break;
			case ID:
				{
				setState(142);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(146);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(147);
						((ExprContext)_localctx).right = expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(149);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(150);
						((ExprContext)_localctx).right = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(152);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(153);
						((ExprContext)_localctx).right = expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(155);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(156);
						((ExprContext)_localctx).right = expr(7);
						}
						break;
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u00a3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u00024\b\u0002\n\u0002\f\u00027\t\u0002\u0003\u00029\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004K\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tZ\b\t\n\t\f"+
		"\t]\t\t\u0003\t_\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\rs\b\r\n\r\f\rv\t\r\u0001"+
		"\r\u0003\ry\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0090"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u009e\b\u0011\n\u0011\f\u0011\u00a1\t\u0011\u0001\u0011"+
		"\u0000\u0001\"\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"\u0000\u0005\u0001\u0000\u001a\u001b"+
		"\u0001\u0000\u0003\u0004\u0001\u0000\u0005\u0006\u0001\u0000\b\r\u0001"+
		"\u0000\u000e\u000f\u00a7\u0000$\u0001\u0000\u0000\u0000\u0002*\u0001\u0000"+
		"\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000"+
		"\bJ\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000\u0000\fN\u0001\u0000"+
		"\u0000\u0000\u000eP\u0001\u0000\u0000\u0000\u0010R\u0001\u0000\u0000\u0000"+
		"\u0012T\u0001\u0000\u0000\u0000\u0014b\u0001\u0000\u0000\u0000\u0016e"+
		"\u0001\u0000\u0000\u0000\u0018j\u0001\u0000\u0000\u0000\u001an\u0001\u0000"+
		"\u0000\u0000\u001cz\u0001\u0000\u0000\u0000\u001e\u007f\u0001\u0000\u0000"+
		"\u0000 \u0082\u0001\u0000\u0000\u0000\"\u008f\u0001\u0000\u0000\u0000"+
		"$%\u0003\u0002\u0001\u0000%&\u0005\u0000\u0000\u0001&\u0001\u0001\u0000"+
		"\u0000\u0000\')\u0003\b\u0004\u0000(\'\u0001\u0000\u0000\u0000),\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"+\u0003\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0013"+
		"\u0000\u0000./\u0003\u0010\b\u0000/8\u0005\u0014\u0000\u000005\u0003\u0010"+
		"\b\u000012\u0005#\u0000\u000024\u0003\u0010\b\u000031\u0001\u0000\u0000"+
		"\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000080\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":;\u0005\u0015\u0000\u0000;<\u0003\u0006\u0003\u0000<\u0005\u0001\u0000"+
		"\u0000\u0000=>\u0005\u0018\u0000\u0000>?\u0003\u0002\u0001\u0000?@\u0005"+
		"\u0019\u0000\u0000@\u0007\u0001\u0000\u0000\u0000AK\u0003\u0014\n\u0000"+
		"BK\u0003\u0018\f\u0000CK\u0003\u0016\u000b\u0000DK\u0003\u001a\r\u0000"+
		"EK\u0003 \u0010\u0000FK\u0003\u0004\u0002\u0000GK\u0003\u0012\t\u0000"+
		"HK\u0005\u0002\u0000\u0000IK\u0005\u001f\u0000\u0000JA\u0001\u0000\u0000"+
		"\u0000JB\u0001\u0000\u0000\u0000JC\u0001\u0000\u0000\u0000JD\u0001\u0000"+
		"\u0000\u0000JE\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000\u0000JG\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000"+
		"K\t\u0001\u0000\u0000\u0000LM\u0005\u001d\u0000\u0000M\u000b\u0001\u0000"+
		"\u0000\u0000NO\u0005\u001c\u0000\u0000O\r\u0001\u0000\u0000\u0000PQ\u0007"+
		"\u0000\u0000\u0000Q\u000f\u0001\u0000\u0000\u0000RS\u0005\u001e\u0000"+
		"\u0000S\u0011\u0001\u0000\u0000\u0000TU\u0003\u0010\b\u0000U^\u0005\u0014"+
		"\u0000\u0000V[\u0003\"\u0011\u0000WX\u0005#\u0000\u0000XZ\u0003\"\u0011"+
		"\u0000YW\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000^V\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`a\u0005\u0015\u0000\u0000a\u0013\u0001\u0000"+
		"\u0000\u0000bc\u0005\u0013\u0000\u0000cd\u0003\u0010\b\u0000d\u0015\u0001"+
		"\u0000\u0000\u0000ef\u0005\u0013\u0000\u0000fg\u0003\u0010\b\u0000gh\u0005"+
		"\u0001\u0000\u0000hi\u0003\"\u0011\u0000i\u0017\u0001\u0000\u0000\u0000"+
		"jk\u0003\u0010\b\u0000kl\u0005\u0001\u0000\u0000lm\u0003\"\u0011\u0000"+
		"m\u0019\u0001\u0000\u0000\u0000no\u0005\u0010\u0000\u0000op\u0003\"\u0011"+
		"\u0000pt\u0003\u0006\u0003\u0000qs\u0003\u001c\u000e\u0000rq\u0001\u0000"+
		"\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"wy\u0003\u001e\u000f\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000y\u001b\u0001\u0000\u0000\u0000z{\u0005\u0011\u0000\u0000{|\u0005"+
		"\u0010\u0000\u0000|}\u0003\"\u0011\u0000}~\u0003\u0006\u0003\u0000~\u001d"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0011\u0000\u0000\u0080\u0081"+
		"\u0003\u0006\u0003\u0000\u0081\u001f\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0005\u0012\u0000\u0000\u0083\u0084\u0003\"\u0011\u0000\u0084\u0085\u0003"+
		"\u0006\u0003\u0000\u0085!\u0001\u0000\u0000\u0000\u0086\u0087\u0006\u0011"+
		"\uffff\uffff\u0000\u0087\u0088\u0005\u0014\u0000\u0000\u0088\u0089\u0003"+
		"\"\u0011\u0000\u0089\u008a\u0005\u0015\u0000\u0000\u008a\u0090\u0001\u0000"+
		"\u0000\u0000\u008b\u0090\u0003\u000e\u0007\u0000\u008c\u0090\u0003\f\u0006"+
		"\u0000\u008d\u0090\u0003\n\u0005\u0000\u008e\u0090\u0003\u0010\b\u0000"+
		"\u008f\u0086\u0001\u0000\u0000\u0000\u008f\u008b\u0001\u0000\u0000\u0000"+
		"\u008f\u008c\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u009f\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\n\t\u0000\u0000\u0092\u0093\u0007\u0001\u0000\u0000\u0093"+
		"\u009e\u0003\"\u0011\n\u0094\u0095\n\b\u0000\u0000\u0095\u0096\u0007\u0002"+
		"\u0000\u0000\u0096\u009e\u0003\"\u0011\t\u0097\u0098\n\u0007\u0000\u0000"+
		"\u0098\u0099\u0007\u0003\u0000\u0000\u0099\u009e\u0003\"\u0011\b\u009a"+
		"\u009b\n\u0006\u0000\u0000\u009b\u009c\u0007\u0004\u0000\u0000\u009c\u009e"+
		"\u0003\"\u0011\u0007\u009d\u0091\u0001\u0000\u0000\u0000\u009d\u0094\u0001"+
		"\u0000\u0000\u0000\u009d\u0097\u0001\u0000\u0000\u0000\u009d\u009a\u0001"+
		"\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0#\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u000b*58J[^tx\u008f\u009d"+
		"\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}