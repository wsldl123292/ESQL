// Generated from F:/GitHub/ESQL/src/main/java/antlr4/create\CreateParser.g4 by ANTLR 4.5.3
package com.elasticsearch.create;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, INDEX=2, NUMBER_OF_SHARDS=3, NUMBER_OF_REPLICAS=4, COLON=5, 
		SEMI=6, QUOTES=7, ID=8, INT=9, NEWLINE=10, WS=11;
	public static final int
		RULE_stat = 0, RULE_create_clause = 1, RULE_index_clause = 2, RULE_index_name = 3, 
		RULE_shards = 4, RULE_replicas = 5;
	public static final String[] ruleNames = {
		"stat", "create_clause", "index_clause", "index_name", "shards", "replicas"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "':'", "';'", "'''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "INDEX", "NUMBER_OF_SHARDS", "NUMBER_OF_REPLICAS", "COLON", 
		"SEMI", "QUOTES", "ID", "INT", "NEWLINE", "WS"
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
			setState(12);
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
		public Index_clauseContext index_clause() {
			return getRuleContext(Index_clauseContext.class,0);
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
			setState(14);
			match(CREATE);
			setState(15);
			index_clause();
			setState(17);
			_la = _input.LA(1);
			if (_la==NUMBER_OF_SHARDS) {
				{
				setState(16);
				shards();
				}
			}

			setState(20);
			_la = _input.LA(1);
			if (_la==NUMBER_OF_REPLICAS) {
				{
				setState(19);
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

	public static class Index_clauseContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(CreateParser.INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateParserVisitor ) return ((CreateParserVisitor<? extends T>)visitor).visitIndex_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_clauseContext index_clause() throws RecognitionException {
		Index_clauseContext _localctx = new Index_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_index_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(INDEX);
			setState(23);
			index_name();
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
		enterRule(_localctx, 6, RULE_index_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(25);
				match(ID);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(31);
				match(INT);
				}
				}
				setState(36);
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
		enterRule(_localctx, 8, RULE_shards);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(NUMBER_OF_SHARDS);
			setState(38);
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
		enterRule(_localctx, 10, RULE_replicas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(NUMBER_OF_REPLICAS);
			setState(41);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r.\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\5\3\24\n\3\3\3"+
		"\5\3\27\n\3\3\4\3\4\3\4\3\5\7\5\35\n\5\f\5\16\5 \13\5\3\5\7\5#\n\5\f\5"+
		"\16\5&\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2+\2\16\3"+
		"\2\2\2\4\20\3\2\2\2\6\30\3\2\2\2\b\36\3\2\2\2\n\'\3\2\2\2\f*\3\2\2\2\16"+
		"\17\5\4\3\2\17\3\3\2\2\2\20\21\7\3\2\2\21\23\5\6\4\2\22\24\5\n\6\2\23"+
		"\22\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\27\5\f\7\2\26\25\3\2\2\2\26"+
		"\27\3\2\2\2\27\5\3\2\2\2\30\31\7\4\2\2\31\32\5\b\5\2\32\7\3\2\2\2\33\35"+
		"\7\n\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37$\3\2"+
		"\2\2 \36\3\2\2\2!#\7\13\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2"+
		"%\t\3\2\2\2&$\3\2\2\2\'(\7\5\2\2()\7\13\2\2)\13\3\2\2\2*+\7\6\2\2+,\7"+
		"\13\2\2,\r\3\2\2\2\6\23\26\36$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}