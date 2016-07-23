// Generated from /Users/ldl/Documents/develop/project/github/ESQL/src/main/java/antlr4/create/CreateParser.g4 by ANTLR 4.5.3
package antlr4.create;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, NUMBER_OF_SHARDS=2, NUMBER_OF_REPLICAS=3, COLON=4, SEMI=5, QUOTES=6, 
		ID=7, INT=8, NEWLINE=9, WS=10, RPAREN=11, LPAREN=12, INDEX=13, COMMA=14;
	public static final int
		RULE_stat = 0, RULE_create_clause = 1, RULE_index_name = 2, RULE_shards = 3, 
		RULE_replicas = 4;
	public static final String[] ruleNames = {
		"stat", "create_clause", "index_name", "shards", "replicas"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "':'", "';'", "'''", null, null, null, null, "')'", 
		"'('", null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "NUMBER_OF_SHARDS", "NUMBER_OF_REPLICAS", "COLON", "SEMI", 
		"QUOTES", "ID", "INT", "NEWLINE", "WS", "RPAREN", "LPAREN", "INDEX", "COMMA"
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
	public String getGrammarFileName() { return "CreateParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CreateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public Create_clauseContext create_clause() {
			return getRuleContext(Create_clauseContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateParserVisitor ) return ((CreateParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			create_clause();
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

	public static class Create_clauseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(CreateParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(CreateParser.INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public ShardsContext shards() {
			return getRuleContext(ShardsContext.class,0);
		}
		public ReplicasContext replicas() {
			return getRuleContext(ReplicasContext.class,0);
		}
		public Create_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateParserVisitor ) return ((CreateParserVisitor<? extends T>)visitor).visitCreate_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_clauseContext create_clause() throws RecognitionException {
		Create_clauseContext _localctx = new Create_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_create_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(CREATE);
			setState(13);
			match(INDEX);
			setState(14);
			index_name();
			setState(16);
			_la = _input.LA(1);
			if (_la==NUMBER_OF_SHARDS) {
				{
				setState(15);
				shards();
				}
			}

			setState(19);
			_la = _input.LA(1);
			if (_la==NUMBER_OF_REPLICAS) {
				{
				setState(18);
				replicas();
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

	public static class Index_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CreateParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CreateParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(CreateParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CreateParser.INT, i);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateParserVisitor ) return ((CreateParserVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_index_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(21);
				match(ID);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(27);
				match(INT);
				}
				}
				setState(32);
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

	public static class ShardsContext extends ParserRuleContext {
		public TerminalNode NUMBER_OF_SHARDS() { return getToken(CreateParser.NUMBER_OF_SHARDS, 0); }
		public TerminalNode INT() { return getToken(CreateParser.INT, 0); }
		public ShardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shards; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateParserVisitor ) return ((CreateParserVisitor<? extends T>)visitor).visitShards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShardsContext shards() throws RecognitionException {
		ShardsContext _localctx = new ShardsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_shards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(NUMBER_OF_SHARDS);
			setState(34);
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

	public static class ReplicasContext extends ParserRuleContext {
		public TerminalNode NUMBER_OF_REPLICAS() { return getToken(CreateParser.NUMBER_OF_REPLICAS, 0); }
		public TerminalNode INT() { return getToken(CreateParser.INT, 0); }
		public ReplicasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replicas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateParserVisitor ) return ((CreateParserVisitor<? extends T>)visitor).visitReplicas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplicasContext replicas() throws RecognitionException {
		ReplicasContext _localctx = new ReplicasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_replicas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(NUMBER_OF_REPLICAS);
			setState(37);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\3\3\5\3\23\n\3\3\3\5\3"+
		"\26\n\3\3\4\7\4\31\n\4\f\4\16\4\34\13\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2(\2\f\3\2\2\2\4\16\3\2"+
		"\2\2\6\32\3\2\2\2\b#\3\2\2\2\n&\3\2\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\17"+
		"\7\3\2\2\17\20\7\17\2\2\20\22\5\6\4\2\21\23\5\b\5\2\22\21\3\2\2\2\22\23"+
		"\3\2\2\2\23\25\3\2\2\2\24\26\5\n\6\2\25\24\3\2\2\2\25\26\3\2\2\2\26\5"+
		"\3\2\2\2\27\31\7\t\2\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33"+
		"\3\2\2\2\33 \3\2\2\2\34\32\3\2\2\2\35\37\7\n\2\2\36\35\3\2\2\2\37\"\3"+
		"\2\2\2 \36\3\2\2\2 !\3\2\2\2!\7\3\2\2\2\" \3\2\2\2#$\7\4\2\2$%\7\n\2\2"+
		"%\t\3\2\2\2&\'\7\5\2\2\'(\7\n\2\2(\13\3\2\2\2\6\22\25\32 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}