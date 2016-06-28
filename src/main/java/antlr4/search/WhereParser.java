// Generated from F:/GitHub/ESQL/src/main/java/antlr4/search\WhereParser.g4 by ANTLR 4.5.3
package antlr4.search;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WhereParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, IS=6, NOT=7, NULL=8, LIKE=9, IN=10, 
		EXISTS=11, ALL=12, BETWEEN=13, REGEXP=14, LIMIT=15, COLON=16, ALL_FIELDS=17, 
		EQ=18, LTH=19, GTH=20, NOT_EQ=21, LET=22, GET=23, SEMI=24, ORDER=25, GROUP=26, 
		BY=27, ASC=28, DESC=29, QUOTES=30, INT=31, NEWLINE=32, WS=33, RPAREN=34, 
		LPAREN=35, INDEX=36, KEY=37, COMMA=38, DOT=39, PARTITION=40, NEGATION=41, 
		VERTBAR=42, TRUE=43, FALSE=44, ANY_STRING_CHAR=45, ID=46;
	public static final int
		RULE_stat = 0, RULE_where_clause = 1, RULE_expression = 2, RULE_right_element = 3, 
		RULE_left_element = 4, RULE_between_element = 5, RULE_is_or_is_not = 6, 
		RULE_simple_expression = 7;
	public static final String[] ruleNames = {
		"stat", "where_clause", "expression", "right_element", "left_element", 
		"between_element", "is_or_is_not", "simple_expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "':'", "'*'", "'='", "'<'", "'>'", "'!='", "'<='", 
		"'>='", "';'", null, null, null, null, null, "'''", null, null, null, 
		"')'", "'('", "'index'", "'key'", "','", "'.'", "'partition'", "'~'", 
		"'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "IS", "NOT", "NULL", "LIKE", 
		"IN", "EXISTS", "ALL", "BETWEEN", "REGEXP", "LIMIT", "COLON", "ALL_FIELDS", 
		"EQ", "LTH", "GTH", "NOT_EQ", "LET", "GET", "SEMI", "ORDER", "GROUP", 
		"BY", "ASC", "DESC", "QUOTES", "INT", "NEWLINE", "WS", "RPAREN", "LPAREN", 
		"INDEX", "KEY", "COMMA", "DOT", "PARTITION", "NEGATION", "VERTBAR", "TRUE", 
		"FALSE", "ANY_STRING_CHAR", "ID"
	};
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
	public String getGrammarFileName() { return "WhereParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WhereParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhereParserVisitor ) return ((WhereParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			where_clause();
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

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(WhereParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhereParserVisitor ) return ((WhereParserVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(WHERE);
			setState(19);
			expression(0);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(WhereParser.AND, 0); }
		public AndExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhereParserVisitor ) return ((WhereParserVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(WhereParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WhereParser.RPAREN, 0); }
		public ParenExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhereParserVisitor ) return ((WhereParserVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(WhereParser.OR, 0); }
		public OrExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhereParserVisitor ) return ((WhereParserVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends ExpressionContext {
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public ExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhereParserVisitor ) return ((WhereParserVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(22);
				match(LPAREN);
				setState(23);
				expression(0);
				setState(24);
				match(RPAREN);
				}
				break;
			case INT:
			case ID:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				simple_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(35);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(29);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(30);
						match(AND);
						setState(31);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(32);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(33);
						match(OR);
						setState(34);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Right_elementContext extends ParserRuleContext {
		public List<TerminalNode> QUOTES() { return getTokens(WhereParser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(WhereParser.QUOTES, i);
		}
		public TerminalNode ID() { return getToken(WhereParser.ID, 0); }
		public TerminalNode INT() { return getToken(WhereParser.INT, 0); }
		public Right_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhereParserVisitor ) return ((WhereParserVisitor<? extends T>)visitor).visitRight_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_elementContext right_element() throws RecognitionException {
		Right_elementContext _localctx = new Right_elementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_right_element);
		try {
			setState(44);
			switch (_input.LA(1)) {
			case QUOTES:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(40);
				match(QUOTES);
				setState(41);
				match(ID);
				setState(42);
				match(QUOTES);
				}
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Left_elementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WhereParser.ID, 0); }
		public TerminalNode INT() { return getToken(WhereParser.INT, 0); }
		public Left_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhereParserVisitor ) return ((WhereParserVisitor<? extends T>)visitor).visitLeft_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_elementContext left_element() throws RecognitionException {
		Left_elementContext _localctx = new Left_elementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_left_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Between_elementContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(WhereParser.INT, 0); }
		public Between_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhereParserVisitor ) return ((WhereParserVisitor<? extends T>)visitor).visitBetween_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_elementContext between_element() throws RecognitionException {
		Between_elementContext _localctx = new Between_elementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_between_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(INT);
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

	public static class Is_or_is_notContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(WhereParser.IS, 0); }
		public TerminalNode NOT() { return getToken(WhereParser.NOT, 0); }
		public Is_or_is_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_or_is_not; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhereParserVisitor ) return ((WhereParserVisitor<? extends T>)visitor).visitIs_or_is_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_or_is_notContext is_or_is_not() throws RecognitionException {
		Is_or_is_notContext _localctx = new Is_or_is_notContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_is_or_is_not);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(IS);
				setState(52);
				match(NOT);
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

	public static class Simple_expressionContext extends ParserRuleContext {
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
	 
		public Simple_expressionContext() { }
		public void copyFrom(Simple_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BaseExpContext extends Simple_expressionContext {
		public Token relational_op;
		public Left_elementContext left_element() {
			return getRuleContext(Left_elementContext.class,0);
		}
		public Right_elementContext right_element() {
			return getRuleContext(Right_elementContext.class,0);
		}
		public TerminalNode EQ() { return getToken(WhereParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(WhereParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(WhereParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(WhereParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(WhereParser.LET, 0); }
		public TerminalNode GET() { return getToken(WhereParser.GET, 0); }
		public TerminalNode LIKE() { return getToken(WhereParser.LIKE, 0); }
		public BaseExpContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhereParserVisitor ) return ((WhereParserVisitor<? extends T>)visitor).visitBaseExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenExpContext extends Simple_expressionContext {
		public Left_elementContext left_element() {
			return getRuleContext(Left_elementContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(WhereParser.BETWEEN, 0); }
		public TerminalNode LPAREN() { return getToken(WhereParser.LPAREN, 0); }
		public List<Between_elementContext> between_element() {
			return getRuleContexts(Between_elementContext.class);
		}
		public Between_elementContext between_element(int i) {
			return getRuleContext(Between_elementContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(WhereParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(WhereParser.RPAREN, 0); }
		public BetweenExpContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhereParserVisitor ) return ((WhereParserVisitor<? extends T>)visitor).visitBetweenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsExpContext extends Simple_expressionContext {
		public Left_elementContext left_element() {
			return getRuleContext(Left_elementContext.class,0);
		}
		public Is_or_is_notContext is_or_is_not() {
			return getRuleContext(Is_or_is_notContext.class,0);
		}
		public TerminalNode NULL() { return getToken(WhereParser.NULL, 0); }
		public IsExpContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhereParserVisitor ) return ((WhereParserVisitor<? extends T>)visitor).visitIsExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simple_expression);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new BaseExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				left_element();
				setState(56);
				((BaseExpContext)_localctx).relational_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIKE) | (1L << EQ) | (1L << LTH) | (1L << GTH) | (1L << NOT_EQ) | (1L << LET) | (1L << GET))) != 0)) ) {
					((BaseExpContext)_localctx).relational_op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(57);
				right_element();
				}
				break;
			case 2:
				_localctx = new BetweenExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				left_element();
				setState(60);
				match(BETWEEN);
				setState(61);
				match(LPAREN);
				setState(62);
				between_element();
				setState(63);
				match(COMMA);
				setState(64);
				between_element();
				setState(65);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new IsExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				left_element();
				setState(68);
				is_or_is_not();
				setState(69);
				match(NULL);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60L\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\36\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4&\n\4\f"+
		"\4\16\4)\13\4\3\5\3\5\3\5\3\5\5\5/\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b"+
		"8\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\tJ\n\t\3\t\2\3\6\n\2\4\6\b\n\f\16\20\2\4\4\2!!\60\60\4\2\13\13\24\31"+
		"J\2\22\3\2\2\2\4\24\3\2\2\2\6\35\3\2\2\2\b.\3\2\2\2\n\60\3\2\2\2\f\62"+
		"\3\2\2\2\16\67\3\2\2\2\20I\3\2\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24\25\7"+
		"\5\2\2\25\26\5\6\4\2\26\5\3\2\2\2\27\30\b\4\1\2\30\31\7%\2\2\31\32\5\6"+
		"\4\2\32\33\7$\2\2\33\36\3\2\2\2\34\36\5\20\t\2\35\27\3\2\2\2\35\34\3\2"+
		"\2\2\36\'\3\2\2\2\37 \f\5\2\2 !\7\6\2\2!&\5\6\4\6\"#\f\4\2\2#$\7\7\2\2"+
		"$&\5\6\4\5%\37\3\2\2\2%\"\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\7\3"+
		"\2\2\2)\'\3\2\2\2*+\7 \2\2+,\7\60\2\2,/\7 \2\2-/\7!\2\2.*\3\2\2\2.-\3"+
		"\2\2\2/\t\3\2\2\2\60\61\t\2\2\2\61\13\3\2\2\2\62\63\7!\2\2\63\r\3\2\2"+
		"\2\648\7\b\2\2\65\66\7\b\2\2\668\7\t\2\2\67\64\3\2\2\2\67\65\3\2\2\28"+
		"\17\3\2\2\29:\5\n\6\2:;\t\3\2\2;<\5\b\5\2<J\3\2\2\2=>\5\n\6\2>?\7\17\2"+
		"\2?@\7%\2\2@A\5\f\7\2AB\7(\2\2BC\5\f\7\2CD\7$\2\2DJ\3\2\2\2EF\5\n\6\2"+
		"FG\5\16\b\2GH\7\n\2\2HJ\3\2\2\2I9\3\2\2\2I=\3\2\2\2IE\3\2\2\2J\21\3\2"+
		"\2\2\b\35%\'.\67I";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}