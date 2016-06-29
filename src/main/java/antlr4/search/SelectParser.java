// Generated from F:/GitHub/ESQL/src/main/java/antlr4/search\SelectParser.g4 by ANTLR 4.5.3
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
public class SelectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, IS=6, NOT=7, NULL=8, LIKE=9, IN=10, 
		EXISTS=11, ALL=12, BETWEEN=13, REGEXP=14, LIMIT=15, COLON=16, ALL_FIELDS=17, 
		EQ=18, LTH=19, GTH=20, NOT_EQ=21, LET=22, GET=23, SEMI=24, ORDER=25, GROUP=26, 
		BY=27, ASC=28, DESC=29, QUOTES=30, ID=31, INT=32, NEWLINE=33, WS=34, RPAREN=35, 
		LPAREN=36, INDEX=37, KEY=38, COMMA=39, DOT=40, PARTITION=41, NEGATION=42, 
		VERTBAR=43, TRUE=44, FALSE=45, ANY_STRING_CHAR=46;
	public static final int
		RULE_stat = 0, RULE_select_clause = 1, RULE_table_name = 2, RULE_table_type = 3, 
		RULE_limit_case = 4, RULE_limit_expr = 5, RULE_column_name = 6, RULE_column_list_clause = 7, 
		RULE_table_references = 8, RULE_orderby_case = 9, RULE_where_clause = 10, 
		RULE_expression = 11, RULE_right_element = 12, RULE_left_element = 13, 
		RULE_between_element = 14, RULE_is_or_is_not = 15, RULE_simple_expression = 16;
	public static final String[] ruleNames = {
		"stat", "select_clause", "table_name", "table_type", "limit_case", "limit_expr", 
		"column_name", "column_list_clause", "table_references", "orderby_case", 
		"where_clause", "expression", "right_element", "left_element", "between_element", 
		"is_or_is_not", "simple_expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "':'", "'*'", "'='", "'<'", "'>'", "'!='", "'<='", 
		"'>='", "';'", null, null, null, null, null, "'''", null, null, null, 
		null, "')'", "'('", "'index'", "'key'", "','", "'.'", "'partition'", "'~'", 
		"'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "IS", "NOT", "NULL", "LIKE", 
		"IN", "EXISTS", "ALL", "BETWEEN", "REGEXP", "LIMIT", "COLON", "ALL_FIELDS", 
		"EQ", "LTH", "GTH", "NOT_EQ", "LET", "GET", "SEMI", "ORDER", "GROUP", 
		"BY", "ASC", "DESC", "QUOTES", "ID", "INT", "NEWLINE", "WS", "RPAREN", 
		"LPAREN", "INDEX", "KEY", "COMMA", "DOT", "PARTITION", "NEGATION", "VERTBAR", 
		"TRUE", "FALSE", "ANY_STRING_CHAR"
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
	public String getGrammarFileName() { return "SelectParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SelectParser(TokenStream input) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
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
		public TerminalNode SELECT() { return getToken(SelectParser.SELECT, 0); }
		public Column_list_clauseContext column_list_clause() {
			return getRuleContext(Column_list_clauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SelectParser.FROM, 0); }
		public Table_referencesContext table_references() {
			return getRuleContext(Table_referencesContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Orderby_caseContext orderby_case() {
			return getRuleContext(Orderby_caseContext.class,0);
		}
		public Limit_caseContext limit_case() {
			return getRuleContext(Limit_caseContext.class,0);
		}
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitSelect_clause(this);
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
			setState(36);
			match(SELECT);
			setState(37);
			column_list_clause();
			setState(38);
			match(FROM);
			setState(39);
			table_references();
			setState(41);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(40);
				where_clause();
				}
			}

			setState(44);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(43);
				orderby_case();
				}
			}

			setState(47);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(46);
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
		public List<TerminalNode> ID() { return getTokens(SelectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SelectParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(SelectParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SelectParser.INT, i);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(49);
				match(ID);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(55);
				match(INT);
				}
				}
				setState(60);
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

	public static class Table_typeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SelectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SelectParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(SelectParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SelectParser.INT, i);
		}
		public Table_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitTable_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_typeContext table_type() throws RecognitionException {
		Table_typeContext _localctx = new Table_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(61);
				match(ID);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(67);
				match(INT);
				}
				}
				setState(72);
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

	public static class Limit_caseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SelectParser.LIMIT, 0); }
		public Limit_exprContext limit_expr() {
			return getRuleContext(Limit_exprContext.class,0);
		}
		public Limit_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_case; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitLimit_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_caseContext limit_case() throws RecognitionException {
		Limit_caseContext _localctx = new Limit_caseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_limit_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(LIMIT);
			setState(74);
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
		public List<TerminalNode> INT() { return getTokens(SelectParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SelectParser.INT, i);
		}
		public TerminalNode COMMA() { return getToken(SelectParser.COMMA, 0); }
		public Limit_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitLimit_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_exprContext limit_expr() throws RecognitionException {
		Limit_exprContext _localctx = new Limit_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_limit_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(INT);
			setState(77);
			match(COMMA);
			setState(78);
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

	public static class Column_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SelectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SelectParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(SelectParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SelectParser.INT, i);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_column_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(80);
				match(ID);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(86);
				match(INT);
				}
				}
				setState(91);
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

	public static class Column_list_clauseContext extends ParserRuleContext {
		public TerminalNode ALL_FIELDS() { return getToken(SelectParser.ALL_FIELDS, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SelectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SelectParser.COMMA, i);
		}
		public Column_list_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitColumn_list_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_list_clauseContext column_list_clause() throws RecognitionException {
		Column_list_clauseContext _localctx = new Column_list_clauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_column_list_clause);
		int _la;
		try {
			setState(101);
			switch (_input.LA(1)) {
			case ALL_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(ALL_FIELDS);
				}
				break;
			case FROM:
			case ID:
			case INT:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				column_name();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(94);
					match(COMMA);
					setState(95);
					column_name();
					}
					}
					setState(100);
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

	public static class Table_referencesContext extends ParserRuleContext {
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SelectParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SelectParser.DOT, i);
		}
		public List<Table_typeContext> table_type() {
			return getRuleContexts(Table_typeContext.class);
		}
		public Table_typeContext table_type(int i) {
			return getRuleContext(Table_typeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SelectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SelectParser.COMMA, i);
		}
		public Table_referencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_references; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitTable_references(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referencesContext table_references() throws RecognitionException {
		Table_referencesContext _localctx = new Table_referencesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_table_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			table_name();
			setState(104);
			match(DOT);
			setState(105);
			table_type();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				{
				setState(106);
				match(COMMA);
				setState(107);
				table_name();
				setState(108);
				match(DOT);
				setState(109);
				table_type();
				}
				}
				}
				setState(115);
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

	public static class Orderby_caseContext extends ParserRuleContext {
		public Token order;
		public TerminalNode ORDER() { return getToken(SelectParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SelectParser.BY, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SelectParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SelectParser.DESC, 0); }
		public Orderby_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_case; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitOrderby_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_caseContext orderby_case() throws RecognitionException {
		Orderby_caseContext _localctx = new Orderby_caseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_orderby_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(ORDER);
			setState(117);
			match(BY);
			setState(118);
			column_name();
			setState(119);
			((Orderby_caseContext)_localctx).order = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
				((Orderby_caseContext)_localctx).order = (Token)_errHandler.recoverInline(this);
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

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SelectParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(WHERE);
			setState(122);
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
		public TerminalNode AND() { return getToken(SelectParser.AND, 0); }
		public AndExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(SelectParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SelectParser.RPAREN, 0); }
		public ParenExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitParenExp(this);
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
		public TerminalNode OR() { return getToken(SelectParser.OR, 0); }
		public OrExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitOrExp(this);
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
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitExp(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(125);
				match(LPAREN);
				setState(126);
				expression(0);
				setState(127);
				match(RPAREN);
				}
				break;
			case ID:
			case INT:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				simple_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(133);
						match(AND);
						setState(134);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(136);
						match(OR);
						setState(137);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(142);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Right_elementContext extends ParserRuleContext {
		public List<TerminalNode> QUOTES() { return getTokens(SelectParser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(SelectParser.QUOTES, i);
		}
		public TerminalNode ID() { return getToken(SelectParser.ID, 0); }
		public Right_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitRight_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_elementContext right_element() throws RecognitionException {
		Right_elementContext _localctx = new Right_elementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_right_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(143);
			match(QUOTES);
			setState(144);
			match(ID);
			setState(145);
			match(QUOTES);
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

	public static class Left_elementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SelectParser.ID, 0); }
		public TerminalNode INT() { return getToken(SelectParser.INT, 0); }
		public Left_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitLeft_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_elementContext left_element() throws RecognitionException {
		Left_elementContext _localctx = new Left_elementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_left_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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

	public static class Between_elementContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SelectParser.INT, 0); }
		public Between_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitBetween_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_elementContext between_element() throws RecognitionException {
		Between_elementContext _localctx = new Between_elementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_between_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		public TerminalNode IS() { return getToken(SelectParser.IS, 0); }
		public TerminalNode NOT() { return getToken(SelectParser.NOT, 0); }
		public Is_or_is_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_or_is_not; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitIs_or_is_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_or_is_notContext is_or_is_not() throws RecognitionException {
		Is_or_is_notContext _localctx = new Is_or_is_notContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_is_or_is_not);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(IS);
				setState(153);
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
		public TerminalNode EQ() { return getToken(SelectParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(SelectParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(SelectParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(SelectParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(SelectParser.LET, 0); }
		public TerminalNode GET() { return getToken(SelectParser.GET, 0); }
		public TerminalNode LIKE() { return getToken(SelectParser.LIKE, 0); }
		public BaseExpContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitBaseExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenExpContext extends Simple_expressionContext {
		public Left_elementContext left_element() {
			return getRuleContext(Left_elementContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(SelectParser.BETWEEN, 0); }
		public TerminalNode LPAREN() { return getToken(SelectParser.LPAREN, 0); }
		public List<Between_elementContext> between_element() {
			return getRuleContexts(Between_elementContext.class);
		}
		public Between_elementContext between_element(int i) {
			return getRuleContext(Between_elementContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SelectParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(SelectParser.RPAREN, 0); }
		public BetweenExpContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitBetweenExp(this);
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
		public TerminalNode NULL() { return getToken(SelectParser.NULL, 0); }
		public IsExpContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitIsExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simple_expression);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new BaseExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				left_element();
				setState(157);
				((BaseExpContext)_localctx).relational_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIKE) | (1L << EQ) | (1L << LTH) | (1L << GTH) | (1L << NOT_EQ) | (1L << LET) | (1L << GET))) != 0)) ) {
					((BaseExpContext)_localctx).relational_op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(158);
				right_element();
				}
				break;
			case 2:
				_localctx = new BetweenExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				left_element();
				setState(161);
				match(BETWEEN);
				setState(162);
				match(LPAREN);
				setState(163);
				between_element();
				setState(164);
				match(COMMA);
				setState(165);
				between_element();
				setState(166);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new IsExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				left_element();
				setState(169);
				is_or_is_not();
				setState(170);
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
		case 11:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u00b1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\3\5\3/\n\3\3\3\5\3\62\n\3\3\4"+
		"\7\4\65\n\4\f\4\16\48\13\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\5\7\5A\n\5\f"+
		"\5\16\5D\13\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\7\bT\n\b\f\b\16\bW\13\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\t\3\t\3\t\3"+
		"\t\7\tc\n\t\f\t\16\tf\13\t\5\th\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7"+
		"\nr\n\n\f\n\16\nu\13\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u0085\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u008d\n\r\f\r"+
		"\16\r\u0090\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\5\21\u009d\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00af\n\22\3\22\2\3\30\23\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"\2\5\3\2\36\37\3\2!\"\4\2\13\13\24\31\u00b1"+
		"\2$\3\2\2\2\4&\3\2\2\2\6\66\3\2\2\2\bB\3\2\2\2\nK\3\2\2\2\fN\3\2\2\2\16"+
		"U\3\2\2\2\20g\3\2\2\2\22i\3\2\2\2\24v\3\2\2\2\26{\3\2\2\2\30\u0084\3\2"+
		"\2\2\32\u0091\3\2\2\2\34\u0095\3\2\2\2\36\u0097\3\2\2\2 \u009c\3\2\2\2"+
		"\"\u00ae\3\2\2\2$%\5\4\3\2%\3\3\2\2\2&\'\7\3\2\2\'(\5\20\t\2()\7\4\2\2"+
		")+\5\22\n\2*,\5\26\f\2+*\3\2\2\2+,\3\2\2\2,.\3\2\2\2-/\5\24\13\2.-\3\2"+
		"\2\2./\3\2\2\2/\61\3\2\2\2\60\62\5\n\6\2\61\60\3\2\2\2\61\62\3\2\2\2\62"+
		"\5\3\2\2\2\63\65\7!\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67"+
		"\3\2\2\2\67<\3\2\2\28\66\3\2\2\29;\7\"\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2"+
		"\2<=\3\2\2\2=\7\3\2\2\2><\3\2\2\2?A\7!\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2"+
		"\2BC\3\2\2\2CH\3\2\2\2DB\3\2\2\2EG\7\"\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2"+
		"\2HI\3\2\2\2I\t\3\2\2\2JH\3\2\2\2KL\7\21\2\2LM\5\f\7\2M\13\3\2\2\2NO\7"+
		"\"\2\2OP\7)\2\2PQ\7\"\2\2Q\r\3\2\2\2RT\7!\2\2SR\3\2\2\2TW\3\2\2\2US\3"+
		"\2\2\2UV\3\2\2\2V[\3\2\2\2WU\3\2\2\2XZ\7\"\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3"+
		"\2\2\2[\\\3\2\2\2\\\17\3\2\2\2][\3\2\2\2^h\7\23\2\2_d\5\16\b\2`a\7)\2"+
		"\2ac\5\16\b\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eh\3\2\2\2fd\3\2"+
		"\2\2g^\3\2\2\2g_\3\2\2\2h\21\3\2\2\2ij\5\6\4\2jk\7*\2\2ks\5\b\5\2lm\7"+
		")\2\2mn\5\6\4\2no\7*\2\2op\5\b\5\2pr\3\2\2\2ql\3\2\2\2ru\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2t\23\3\2\2\2us\3\2\2\2vw\7\33\2\2wx\7\35\2\2xy\5\16\b\2"+
		"yz\t\2\2\2z\25\3\2\2\2{|\7\5\2\2|}\5\30\r\2}\27\3\2\2\2~\177\b\r\1\2\177"+
		"\u0080\7&\2\2\u0080\u0081\5\30\r\2\u0081\u0082\7%\2\2\u0082\u0085\3\2"+
		"\2\2\u0083\u0085\5\"\22\2\u0084~\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u008e"+
		"\3\2\2\2\u0086\u0087\f\5\2\2\u0087\u0088\7\6\2\2\u0088\u008d\5\30\r\6"+
		"\u0089\u008a\f\4\2\2\u008a\u008b\7\7\2\2\u008b\u008d\5\30\r\5\u008c\u0086"+
		"\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\31\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7 \2\2"+
		"\u0092\u0093\7!\2\2\u0093\u0094\7 \2\2\u0094\33\3\2\2\2\u0095\u0096\t"+
		"\3\2\2\u0096\35\3\2\2\2\u0097\u0098\7\"\2\2\u0098\37\3\2\2\2\u0099\u009d"+
		"\7\b\2\2\u009a\u009b\7\b\2\2\u009b\u009d\7\t\2\2\u009c\u0099\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d!\3\2\2\2\u009e\u009f\5\34\17\2\u009f\u00a0\t\4\2"+
		"\2\u00a0\u00a1\5\32\16\2\u00a1\u00af\3\2\2\2\u00a2\u00a3\5\34\17\2\u00a3"+
		"\u00a4\7\17\2\2\u00a4\u00a5\7&\2\2\u00a5\u00a6\5\36\20\2\u00a6\u00a7\7"+
		")\2\2\u00a7\u00a8\5\36\20\2\u00a8\u00a9\7%\2\2\u00a9\u00af\3\2\2\2\u00aa"+
		"\u00ab\5\34\17\2\u00ab\u00ac\5 \21\2\u00ac\u00ad\7\n\2\2\u00ad\u00af\3"+
		"\2\2\2\u00ae\u009e\3\2\2\2\u00ae\u00a2\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af"+
		"#\3\2\2\2\23+.\61\66<BHU[dgs\u0084\u008c\u008e\u009c\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}