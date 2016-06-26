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
		BY=27, ID=28, INT=29, NEWLINE=30, WS=31, RPAREN=32, LPAREN=33, INDEX=34, 
		KEY=35, COMMA=36, DOT=37, PARTITION=38, NEGATION=39, VERTBAR=40, TRUE=41, 
		FALSE=42;
	public static final int
		RULE_stat = 0, RULE_select_clause = 1, RULE_table_name = 2, RULE_table_type = 3, 
		RULE_limit_case = 4, RULE_limit_expr = 5, RULE_column_name = 6, RULE_column_list_clause = 7, 
		RULE_table_references = 8;
	public static final String[] ruleNames = {
		"stat", "select_clause", "table_name", "table_type", "limit_case", "limit_expr", 
		"column_name", "column_list_clause", "table_references"
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
			setState(18);
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
			setState(20);
			match(SELECT);
			setState(21);
			column_list_clause();
			setState(22);
			match(FROM);
			setState(23);
			table_references();
			setState(25);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(24);
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
		public TerminalNode ID() { return getToken(SelectParser.ID, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
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
		public TerminalNode ID() { return getToken(SelectParser.ID, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
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
			setState(31);
			match(LIMIT);
			setState(32);
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
		public List<TerminalNode> ID() { return getTokens(SelectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SelectParser.ID, i);
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
			setState(34);
			match(ID);
			setState(35);
			match(COMMA);
			setState(36);
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
		public TerminalNode ID() { return getToken(SelectParser.ID, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
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
			setState(49);
			switch (_input.LA(1)) {
			case ALL_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(ALL_FIELDS);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				column_name();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(42);
					match(COMMA);
					setState(43);
					column_name();
					}
					}
					setState(48);
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
			setState(51);
			table_name();
			setState(52);
			match(DOT);
			setState(53);
			table_type();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				{
				setState(54);
				match(COMMA);
				setState(55);
				table_name();
				setState(56);
				match(DOT);
				setState(57);
				table_type();
				}
				}
				}
				setState(63);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,C\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\7\t/\n\t\f\t\16\t\62\13\t\5\t\64\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n>\n\n\f\n\16\nA\13\n\3\n\2\2\13\2\4\6\b\n"+
		"\f\16\20\22\2\2=\2\24\3\2\2\2\4\26\3\2\2\2\6\35\3\2\2\2\b\37\3\2\2\2\n"+
		"!\3\2\2\2\f$\3\2\2\2\16(\3\2\2\2\20\63\3\2\2\2\22\65\3\2\2\2\24\25\5\4"+
		"\3\2\25\3\3\2\2\2\26\27\7\3\2\2\27\30\5\20\t\2\30\31\7\4\2\2\31\33\5\22"+
		"\n\2\32\34\5\n\6\2\33\32\3\2\2\2\33\34\3\2\2\2\34\5\3\2\2\2\35\36\7\36"+
		"\2\2\36\7\3\2\2\2\37 \7\36\2\2 \t\3\2\2\2!\"\7\21\2\2\"#\5\f\7\2#\13\3"+
		"\2\2\2$%\7\36\2\2%&\7&\2\2&\'\7\36\2\2\'\r\3\2\2\2()\7\36\2\2)\17\3\2"+
		"\2\2*\64\7\23\2\2+\60\5\16\b\2,-\7&\2\2-/\5\16\b\2.,\3\2\2\2/\62\3\2\2"+
		"\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\63*\3\2\2\2\63"+
		"+\3\2\2\2\64\21\3\2\2\2\65\66\5\6\4\2\66\67\7\'\2\2\67?\5\b\5\289\7&\2"+
		"\29:\5\6\4\2:;\7\'\2\2;<\5\b\5\2<>\3\2\2\2=8\3\2\2\2>A\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@\23\3\2\2\2A?\3\2\2\2\6\33\60\63?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}