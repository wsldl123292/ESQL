// Generated from /Users/ldl/Documents/develop/project/github/ESQL/src/main/java/antlr4/search/SearchParser.g4 by ANTLR 4.5.3
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
public class SearchParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, IS=6, NOT=7, NULL=8, LIKE=9, IN=10, 
		EXISTS=11, ALL=12, BETWEEN=13, REGEXP=14, LIMIT=15, COLON=16, ALL_FIELDS=17, 
		EQ=18, LTH=19, GTH=20, NOT_EQ=21, LET=22, GET=23, SEMI=24, ORDER=25, GROUP=26, 
		BY=27, ID=28, INT=29, NEWLINE=30, WS=31, RPAREN=32, LPAREN=33, INDEX=34, 
		KEY=35, COMMA=36, DOT=37, PARTITION=38, NEGATION=39, VERTBAR=40, TRUE=41, 
		FALSE=42;
	public static final int
		RULE_stat = 0, RULE_select_clause = 1, RULE_table_name = 2, RULE_table_type = 3, 
		RULE_limit_case = 4, RULE_limit_expr = 5, RULE_column_name = 6, RULE_column_list_clause = 7, 
		RULE_where_clause = 8, RULE_expression = 9, RULE_element = 10, RULE_right_element = 11, 
		RULE_left_element = 12, RULE_target_element = 13, RULE_between_op = 14, 
		RULE_is_or_is_not = 15, RULE_simple_expression = 16, RULE_table_references = 17;
	public static final String[] ruleNames = {
		"stat", "select_clause", "table_name", "table_type", "limit_case", "limit_expr", 
		"column_name", "column_list_clause", "where_clause", "expression", "element", 
		"right_element", "left_element", "target_element", "between_op", "is_or_is_not", 
		"simple_expression", "table_references"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "':'", "'*'", "'='", "'<'", "'>'", "'!='", "'<='", 
		"'>='", "';'", null, null, null, null, null, null, null, "')'", "'('", 
		"'index'", "'key'", "','", "'.'", "'partition'", "'~'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "IS", "NOT", "NULL", "LIKE", 
		"IN", "EXISTS", "ALL", "BETWEEN", "REGEXP", "LIMIT", "COLON", "ALL_FIELDS", 
		"EQ", "LTH", "GTH", "NOT_EQ", "LET", "GET", "SEMI", "ORDER", "GROUP", 
		"BY", "ID", "INT", "NEWLINE", "WS", "RPAREN", "LPAREN", "INDEX", "KEY", 
		"COMMA", "DOT", "PARTITION", "NEGATION", "VERTBAR", "TRUE", "FALSE"
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
	public String getGrammarFileName() { return "SearchParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SearchParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			select_clause();
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

	public static class Select_clauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SearchParser.SELECT, 0); }
		public Column_list_clauseContext column_list_clause() {
			return getRuleContext(Column_list_clauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SearchParser.FROM, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Limit_caseContext limit_case() {
			return getRuleContext(Limit_caseContext.class,0);
		}
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterSelect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitSelect_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitSelect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(SELECT);
			setState(39);
			column_list_clause();
			setState(40);
			match(FROM);
			setState(41);
			table_references();
			setState(43);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(42);
				where_clause();
				}
			}

			setState(46);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(45);
				limit_case();
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

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SearchParser.ID, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
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

	public static class Table_typeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SearchParser.ID, 0); }
		public Table_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterTable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitTable_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitTable_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_typeContext table_type() throws RecognitionException {
		Table_typeContext _localctx = new Table_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
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

	public static class Limit_caseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SearchParser.LIMIT, 0); }
		public Limit_exprContext limit_expr() {
			return getRuleContext(Limit_exprContext.class,0);
		}
		public Limit_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterLimit_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitLimit_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitLimit_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_caseContext limit_case() throws RecognitionException {
		Limit_caseContext _localctx = new Limit_caseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_limit_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(LIMIT);
			setState(53);
			limit_expr();
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

	public static class Limit_exprContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SearchParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SearchParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(SearchParser.COMMA, 0); }
		public Limit_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterLimit_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitLimit_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitLimit_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_exprContext limit_expr() throws RecognitionException {
		Limit_exprContext _localctx = new Limit_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_limit_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ID);
			setState(56);
			match(COMMA);
			setState(57);
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

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SearchParser.ID, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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

	public static class Column_list_clauseContext extends ParserRuleContext {
		public TerminalNode ALL_FIELDS() { return getToken(SearchParser.ALL_FIELDS, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SearchParser.COMMA, i);
		}
		public Column_list_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterColumn_list_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitColumn_list_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitColumn_list_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_list_clauseContext column_list_clause() throws RecognitionException {
		Column_list_clauseContext _localctx = new Column_list_clauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_column_list_clause);
		int _la;
		try {
			setState(70);
			switch (_input.LA(1)) {
			case ALL_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(ALL_FIELDS);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				column_name();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(63);
					match(COMMA);
					setState(64);
					column_name();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SearchParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(WHERE);
			setState(73);
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
		public TerminalNode AND() { return getToken(SearchParser.AND, 0); }
		public AndExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(SearchParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SearchParser.RPAREN, 0); }
		public ParenExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterParenExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitParenExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitParenExp(this);
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
		public TerminalNode OR() { return getToken(SearchParser.OR, 0); }
		public OrExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends ExpressionContext {
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public ExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitExp(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(76);
				match(LPAREN);
				setState(77);
				expression(0);
				setState(78);
				match(RPAREN);
				}
				break;
			case ID:
			case INT:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				simple_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(84);
						match(AND);
						setState(85);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(86);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(87);
						match(OR);
						setState(88);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SearchParser.ID, 0); }
		public TerminalNode INT() { return getToken(SearchParser.INT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
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

	public static class Right_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Right_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterRight_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitRight_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitRight_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_elementContext right_element() throws RecognitionException {
		Right_elementContext _localctx = new Right_elementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_right_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			element();
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Left_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterLeft_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitLeft_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitLeft_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_elementContext left_element() throws RecognitionException {
		Left_elementContext _localctx = new Left_elementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_left_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			element();
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

	public static class Target_elementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Target_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterTarget_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitTarget_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitTarget_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Target_elementContext target_element() throws RecognitionException {
		Target_elementContext _localctx = new Target_elementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_target_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			element();
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

	public static class Between_opContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(SearchParser.BETWEEN, 0); }
		public Between_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterBetween_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitBetween_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitBetween_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_opContext between_op() throws RecognitionException {
		Between_opContext _localctx = new Between_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_between_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(BETWEEN);
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
		public TerminalNode IS() { return getToken(SearchParser.IS, 0); }
		public TerminalNode NOT() { return getToken(SearchParser.NOT, 0); }
		public Is_or_is_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_or_is_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterIs_or_is_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitIs_or_is_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitIs_or_is_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_or_is_notContext is_or_is_not() throws RecognitionException {
		Is_or_is_notContext _localctx = new Is_or_is_notContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_is_or_is_not);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(IS);
				setState(106);
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
		public TerminalNode EQ() { return getToken(SearchParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(SearchParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(SearchParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(SearchParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(SearchParser.LET, 0); }
		public TerminalNode GET() { return getToken(SearchParser.GET, 0); }
		public TerminalNode LIKE() { return getToken(SearchParser.LIKE, 0); }
		public BaseExpContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterBaseExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitBaseExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitBaseExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenExpContext extends Simple_expressionContext {
		public Target_elementContext target_element() {
			return getRuleContext(Target_elementContext.class,0);
		}
		public Between_opContext between_op() {
			return getRuleContext(Between_opContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SearchParser.LPAREN, 0); }
		public List<Left_elementContext> left_element() {
			return getRuleContexts(Left_elementContext.class);
		}
		public Left_elementContext left_element(int i) {
			return getRuleContext(Left_elementContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SearchParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(SearchParser.RPAREN, 0); }
		public BetweenExpContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterBetweenExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitBetweenExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitBetweenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsExpContext extends Simple_expressionContext {
		public Target_elementContext target_element() {
			return getRuleContext(Target_elementContext.class,0);
		}
		public Is_or_is_notContext is_or_is_not() {
			return getRuleContext(Is_or_is_notContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SearchParser.NULL, 0); }
		public IsExpContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterIsExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitIsExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitIsExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simple_expression);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new BaseExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				left_element();
				setState(110);
				((BaseExpContext)_localctx).relational_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIKE) | (1L << EQ) | (1L << LTH) | (1L << GTH) | (1L << NOT_EQ) | (1L << LET) | (1L << GET))) != 0)) ) {
					((BaseExpContext)_localctx).relational_op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(111);
				right_element();
				}
				break;
			case 2:
				_localctx = new BetweenExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				target_element();
				setState(114);
				between_op();
				setState(115);
				match(LPAREN);
				setState(116);
				left_element();
				setState(117);
				match(COMMA);
				setState(118);
				left_element();
				setState(119);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new IsExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				target_element();
				setState(122);
				is_or_is_not();
				setState(123);
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

	public static class Table_referencesContext extends ParserRuleContext {
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SearchParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SearchParser.DOT, i);
		}
		public List<Table_typeContext> table_type() {
			return getRuleContexts(Table_typeContext.class);
		}
		public Table_typeContext table_type(int i) {
			return getRuleContext(Table_typeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SearchParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SearchParser.COMMA, i);
		}
		public Table_referencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).enterTable_references(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchParserListener ) ((SearchParserListener)listener).exitTable_references(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchParserVisitor ) return ((SearchParserVisitor<? extends T>)visitor).visitTable_references(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referencesContext table_references() throws RecognitionException {
		Table_referencesContext _localctx = new Table_referencesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_table_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			table_name();
			setState(128);
			match(DOT);
			setState(129);
			table_type();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				{
				setState(130);
				match(COMMA);
				setState(131);
				table_name();
				setState(132);
				match(DOT);
				setState(133);
				table_type();
				}
				}
				}
				setState(139);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u008f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\5\3\61\n\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\7\tD\n\t"+
		"\f\t\16\tG\13\t\5\tI\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"T\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\\\n\13\f\13\16\13_\13\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\5\21n\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u0080\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u008a\n\23\f\23\16\23\u008d\13\23\3\23\2\3\24\24\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$\2\4\3\2\36\37\4\2\13\13\24\31\u0087\2&\3\2\2\2"+
		"\4(\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f9\3\2\2\2\16=\3\2"+
		"\2\2\20H\3\2\2\2\22J\3\2\2\2\24S\3\2\2\2\26`\3\2\2\2\30b\3\2\2\2\32d\3"+
		"\2\2\2\34f\3\2\2\2\36h\3\2\2\2 m\3\2\2\2\"\177\3\2\2\2$\u0081\3\2\2\2"+
		"&\'\5\4\3\2\'\3\3\2\2\2()\7\3\2\2)*\5\20\t\2*+\7\4\2\2+-\5$\23\2,.\5\22"+
		"\n\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/\61\5\n\6\2\60/\3\2\2\2\60\61\3\2"+
		"\2\2\61\5\3\2\2\2\62\63\7\36\2\2\63\7\3\2\2\2\64\65\7\36\2\2\65\t\3\2"+
		"\2\2\66\67\7\21\2\2\678\5\f\7\28\13\3\2\2\29:\7\36\2\2:;\7&\2\2;<\7\36"+
		"\2\2<\r\3\2\2\2=>\7\36\2\2>\17\3\2\2\2?I\7\23\2\2@E\5\16\b\2AB\7&\2\2"+
		"BD\5\16\b\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2"+
		"\2H?\3\2\2\2H@\3\2\2\2I\21\3\2\2\2JK\7\5\2\2KL\5\24\13\2L\23\3\2\2\2M"+
		"N\b\13\1\2NO\7#\2\2OP\5\24\13\2PQ\7\"\2\2QT\3\2\2\2RT\5\"\22\2SM\3\2\2"+
		"\2SR\3\2\2\2T]\3\2\2\2UV\f\5\2\2VW\7\6\2\2W\\\5\24\13\6XY\f\4\2\2YZ\7"+
		"\7\2\2Z\\\5\24\13\5[U\3\2\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2"+
		"^\25\3\2\2\2_]\3\2\2\2`a\t\2\2\2a\27\3\2\2\2bc\5\26\f\2c\31\3\2\2\2de"+
		"\5\26\f\2e\33\3\2\2\2fg\5\26\f\2g\35\3\2\2\2hi\7\17\2\2i\37\3\2\2\2jn"+
		"\7\b\2\2kl\7\b\2\2ln\7\t\2\2mj\3\2\2\2mk\3\2\2\2n!\3\2\2\2op\5\32\16\2"+
		"pq\t\3\2\2qr\5\30\r\2r\u0080\3\2\2\2st\5\34\17\2tu\5\36\20\2uv\7#\2\2"+
		"vw\5\32\16\2wx\7&\2\2xy\5\32\16\2yz\7\"\2\2z\u0080\3\2\2\2{|\5\34\17\2"+
		"|}\5 \21\2}~\7\n\2\2~\u0080\3\2\2\2\177o\3\2\2\2\177s\3\2\2\2\177{\3\2"+
		"\2\2\u0080#\3\2\2\2\u0081\u0082\5\6\4\2\u0082\u0083\7\'\2\2\u0083\u008b"+
		"\5\b\5\2\u0084\u0085\7&\2\2\u0085\u0086\5\6\4\2\u0086\u0087\7\'\2\2\u0087"+
		"\u0088\5\b\5\2\u0088\u008a\3\2\2\2\u0089\u0084\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c%\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\f-\60EHS[]m\177\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}