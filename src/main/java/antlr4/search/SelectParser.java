// Generated from /Users/ldl/Documents/develop/project/github/ESQL/src/main/java/antlr4/search/SelectParser.g4 by ANTLR 4.5.3
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
		BY=27, ASC=28, DESC=29, ID=30, INT=31, NEWLINE=32, WS=33, RPAREN=34, LPAREN=35, 
		INDEX=36, KEY=37, COMMA=38, QUOTE=39, DOT=40, PARTITION=41, NEGATION=42, 
		VERTBAR=43, TRUE=44, FALSE=45;
	public static final int
		RULE_stat = 0, RULE_select_clause = 1, RULE_table_name = 2, RULE_table_type = 3, 
		RULE_limit_case = 4, RULE_limit_expr = 5, RULE_column_name = 6, RULE_column_list_clause = 7, 
		RULE_table_references = 8, RULE_orderby_case = 9, RULE_where_clause = 10, 
		RULE_expression = 11, RULE_element = 12, RULE_between_op = 13, RULE_is_or_is_not = 14, 
		RULE_simple_expression = 15;
	public static final String[] ruleNames = {
		"stat", "select_clause", "table_name", "table_type", "limit_case", "limit_expr", 
		"column_name", "column_list_clause", "table_references", "orderby_case", 
		"where_clause", "expression", "element", "between_op", "is_or_is_not", 
		"simple_expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "':'", "'*'", "'='", "'<'", "'>'", "'!='", "'<='", 
		"'>='", "';'", null, null, null, null, null, null, null, null, null, "')'", 
		"'('", "'index'", "'key'", "','", "'''", "'.'", "'partition'", "'~'", 
		"'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "IS", "NOT", "NULL", "LIKE", 
		"IN", "EXISTS", "ALL", "BETWEEN", "REGEXP", "LIMIT", "COLON", "ALL_FIELDS", 
		"EQ", "LTH", "GTH", "NOT_EQ", "LET", "GET", "SEMI", "ORDER", "GROUP", 
		"BY", "ASC", "DESC", "ID", "INT", "NEWLINE", "WS", "RPAREN", "LPAREN", 
		"INDEX", "KEY", "COMMA", "QUOTE", "DOT", "PARTITION", "NEGATION", "VERTBAR", 
		"TRUE", "FALSE"
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
			setState(32);
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
			setState(34);
			match(SELECT);
			setState(35);
			column_list_clause();
			setState(36);
			match(FROM);
			setState(37);
			table_references();
			setState(39);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(38);
				where_clause();
				}
			}

			setState(42);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(41);
				orderby_case();
				}
			}

			setState(45);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(44);
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
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(47);
				match(ID);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(53);
				match(INT);
				}
				}
				setState(58);
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
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(59);
				match(ID);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(65);
				match(INT);
				}
				}
				setState(70);
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
			setState(71);
			match(LIMIT);
			setState(72);
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
			setState(74);
			match(INT);
			setState(75);
			match(COMMA);
			setState(76);
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
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(78);
				match(ID);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(84);
				match(INT);
				}
				}
				setState(89);
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
			setState(99);
			switch (_input.LA(1)) {
			case ALL_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(ALL_FIELDS);
				}
				break;
			case FROM:
			case ID:
			case INT:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				column_name();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(92);
					match(COMMA);
					setState(93);
					column_name();
					}
					}
					setState(98);
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
			setState(101);
			table_name();
			setState(102);
			match(DOT);
			setState(103);
			table_type();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				{
				setState(104);
				match(COMMA);
				setState(105);
				table_name();
				setState(106);
				match(DOT);
				setState(107);
				table_type();
				}
				}
				}
				setState(113);
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
			setState(114);
			match(ORDER);
			setState(115);
			match(BY);
			setState(116);
			column_name();
			setState(117);
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
			setState(119);
			match(WHERE);
			setState(120);
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
			setState(128);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(123);
				match(LPAREN);
				setState(124);
				expression(0);
				setState(125);
				match(RPAREN);
				}
				break;
			case ID:
			case INT:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				simple_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(131);
						match(AND);
						setState(132);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(134);
						match(OR);
						setState(135);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(140);
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SelectParser.ID, 0); }
		public TerminalNode INT() { return getToken(SelectParser.INT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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

	public static class Between_opContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(SelectParser.BETWEEN, 0); }
		public Between_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitBetween_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_opContext between_op() throws RecognitionException {
		Between_opContext _localctx = new Between_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_between_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
		enterRule(_localctx, 28, RULE_is_or_is_not);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(IS);
				setState(147);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SelectParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(SelectParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(SelectParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(SelectParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(SelectParser.LET, 0); }
		public TerminalNode GET() { return getToken(SelectParser.GET, 0); }
		public TerminalNode LIKE() { return getToken(SelectParser.LIKE, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(SelectParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(SelectParser.QUOTE, i);
		}
		public TerminalNode ID() { return getToken(SelectParser.ID, 0); }
		public TerminalNode INT() { return getToken(SelectParser.INT, 0); }
		public BaseExpContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SelectParserVisitor ) return ((SelectParserVisitor<? extends T>)visitor).visitBaseExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenExpContext extends Simple_expressionContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Between_opContext between_op() {
			return getRuleContext(Between_opContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SelectParser.LPAREN, 0); }
		public List<TerminalNode> INT() { return getTokens(SelectParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SelectParser.INT, i);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
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
		enterRule(_localctx, 30, RULE_simple_expression);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new BaseExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				element();
				setState(151);
				((BaseExpContext)_localctx).relational_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LIKE) | (1L << EQ) | (1L << LTH) | (1L << GTH) | (1L << NOT_EQ) | (1L << LET) | (1L << GET))) != 0)) ) {
					((BaseExpContext)_localctx).relational_op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(156);
				switch (_input.LA(1)) {
				case QUOTE:
					{
					setState(152);
					match(QUOTE);
					setState(153);
					match(ID);
					setState(154);
					match(QUOTE);
					}
					break;
				case INT:
					{
					setState(155);
					match(INT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new BetweenExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				element();
				setState(159);
				between_op();
				setState(160);
				match(LPAREN);
				setState(161);
				match(INT);
				setState(162);
				match(COMMA);
				setState(163);
				match(INT);
				setState(164);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new IsExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				element();
				setState(167);
				is_or_is_not();
				setState(168);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\5\3*\n\3\3\3\5\3-\n\3\3\3\5\3\60\n\3\3\4\7\4\63\n\4"+
		"\f\4\16\4\66\13\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\5\7\5?\n\5\f\5\16\5B\13"+
		"\5\3\5\7\5E\n\5\f\5\16\5H\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\7\bR\n"+
		"\b\f\b\16\bU\13\b\3\b\7\bX\n\b\f\b\16\b[\13\b\3\t\3\t\3\t\3\t\7\ta\n\t"+
		"\f\t\16\td\13\t\5\tf\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\np\n\n\f\n"+
		"\16\ns\13\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u0083\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u008b\n\r\f\r\16\r\u008e"+
		"\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\5\20\u0097\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u009f\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00ad\n\21\3\21\2\3\30\22\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \2\5\3\2\36\37\3\2 !\4\2\13\13\24\31\u00b1\2\"\3"+
		"\2\2\2\4$\3\2\2\2\6\64\3\2\2\2\b@\3\2\2\2\nI\3\2\2\2\fL\3\2\2\2\16S\3"+
		"\2\2\2\20e\3\2\2\2\22g\3\2\2\2\24t\3\2\2\2\26y\3\2\2\2\30\u0082\3\2\2"+
		"\2\32\u008f\3\2\2\2\34\u0091\3\2\2\2\36\u0096\3\2\2\2 \u00ac\3\2\2\2\""+
		"#\5\4\3\2#\3\3\2\2\2$%\7\3\2\2%&\5\20\t\2&\'\7\4\2\2\')\5\22\n\2(*\5\26"+
		"\f\2)(\3\2\2\2)*\3\2\2\2*,\3\2\2\2+-\5\24\13\2,+\3\2\2\2,-\3\2\2\2-/\3"+
		"\2\2\2.\60\5\n\6\2/.\3\2\2\2/\60\3\2\2\2\60\5\3\2\2\2\61\63\7 \2\2\62"+
		"\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65:\3\2\2\2\66\64"+
		"\3\2\2\2\679\7!\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\7\3\2\2"+
		"\2<:\3\2\2\2=?\7 \2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AF\3\2\2"+
		"\2B@\3\2\2\2CE\7!\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\t\3\2\2"+
		"\2HF\3\2\2\2IJ\7\21\2\2JK\5\f\7\2K\13\3\2\2\2LM\7!\2\2MN\7(\2\2NO\7!\2"+
		"\2O\r\3\2\2\2PR\7 \2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TY\3\2\2"+
		"\2US\3\2\2\2VX\7!\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\17\3\2"+
		"\2\2[Y\3\2\2\2\\f\7\23\2\2]b\5\16\b\2^_\7(\2\2_a\5\16\b\2`^\3\2\2\2ad"+
		"\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2e\\\3\2\2\2e]\3\2\2\2"+
		"f\21\3\2\2\2gh\5\6\4\2hi\7*\2\2iq\5\b\5\2jk\7(\2\2kl\5\6\4\2lm\7*\2\2"+
		"mn\5\b\5\2np\3\2\2\2oj\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\23\3\2\2"+
		"\2sq\3\2\2\2tu\7\33\2\2uv\7\35\2\2vw\5\16\b\2wx\t\2\2\2x\25\3\2\2\2yz"+
		"\7\5\2\2z{\5\30\r\2{\27\3\2\2\2|}\b\r\1\2}~\7%\2\2~\177\5\30\r\2\177\u0080"+
		"\7$\2\2\u0080\u0083\3\2\2\2\u0081\u0083\5 \21\2\u0082|\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\u008c\3\2\2\2\u0084\u0085\f\5\2\2\u0085\u0086\7\6\2\2\u0086"+
		"\u008b\5\30\r\6\u0087\u0088\f\4\2\2\u0088\u0089\7\7\2\2\u0089\u008b\5"+
		"\30\r\5\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\31\3\2\2\2\u008e\u008c\3\2\2"+
		"\2\u008f\u0090\t\3\2\2\u0090\33\3\2\2\2\u0091\u0092\7\17\2\2\u0092\35"+
		"\3\2\2\2\u0093\u0097\7\b\2\2\u0094\u0095\7\b\2\2\u0095\u0097\7\t\2\2\u0096"+
		"\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0097\37\3\2\2\2\u0098\u0099\5\32\16"+
		"\2\u0099\u009e\t\4\2\2\u009a\u009b\7)\2\2\u009b\u009c\7 \2\2\u009c\u009f"+
		"\7)\2\2\u009d\u009f\7!\2\2\u009e\u009a\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00ad\3\2\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\5\34\17\2\u00a2\u00a3"+
		"\7%\2\2\u00a3\u00a4\7!\2\2\u00a4\u00a5\7(\2\2\u00a5\u00a6\7!\2\2\u00a6"+
		"\u00a7\7$\2\2\u00a7\u00ad\3\2\2\2\u00a8\u00a9\5\32\16\2\u00a9\u00aa\5"+
		"\36\20\2\u00aa\u00ab\7\n\2\2\u00ab\u00ad\3\2\2\2\u00ac\u0098\3\2\2\2\u00ac"+
		"\u00a0\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad!\3\2\2\2\24),/\64:@FSYbeq\u0082"+
		"\u008a\u008c\u0096\u009e\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}