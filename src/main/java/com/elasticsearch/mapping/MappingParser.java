// Generated from F:/GitHub/ESQL/src/main/java/com/elasticsearch/mapping\MappingParser.g4 by ANTLR 4.5.3
package com.elasticsearch.mapping;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MappingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, MAPPING=2, TYPE=3, SOURCE=4, INDEX=5, STORE=6, ENABLED=7, COLON=8, 
		RPAREN=9, LPAREN=10, COMMA=11, TRUE=12, FALSE=13, ID=14, INT=15, NEWLINE=16, 
		WS=17;
	public static final int
		RULE_mapping_clause = 0, RULE_index_clause = 1, RULE_type_clause = 2, 
		RULE_index_name = 3, RULE_source_clause = 4;
	public static final String[] ruleNames = {
		"mapping_clause", "index_clause", "type_clause", "index_name", "source_clause"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "':'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ADD", "MAPPING", "TYPE", "SOURCE", "INDEX", "STORE", "ENABLED", 
		"COLON", "RPAREN", "LPAREN", "COMMA", "TRUE", "FALSE", "ID", "INT", "NEWLINE", 
		"WS"
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
	public String getGrammarFileName() { return "MappingParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MappingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Mapping_clauseContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MappingParser.ADD, 0); }
		public Index_clauseContext index_clause() {
			return getRuleContext(Index_clauseContext.class,0);
		}
		public Type_clauseContext type_clause() {
			return getRuleContext(Type_clauseContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MappingParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(MappingParser.LPAREN, 0); }
		public Source_clauseContext source_clause() {
			return getRuleContext(Source_clauseContext.class,0);
		}
		public Mapping_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingParserVisitor ) return ((MappingParserVisitor<? extends T>)visitor).visitMapping_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mapping_clauseContext mapping_clause() throws RecognitionException {
		Mapping_clauseContext _localctx = new Mapping_clauseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mapping_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(ADD);
			setState(11);
			index_clause();
			setState(12);
			type_clause();
			setState(13);
			match(RPAREN);
			setState(15);
			_la = _input.LA(1);
			if (_la==SOURCE) {
				{
				setState(14);
				source_clause();
				}
			}

			setState(17);
			match(LPAREN);
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
		public TerminalNode MAPPING() { return getToken(MappingParser.MAPPING, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingParserVisitor ) return ((MappingParserVisitor<? extends T>)visitor).visitIndex_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_clauseContext index_clause() throws RecognitionException {
		Index_clauseContext _localctx = new Index_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_index_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(MAPPING);
			setState(20);
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

	public static class Type_clauseContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(MappingParser.TYPE, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingParserVisitor ) return ((MappingParserVisitor<? extends T>)visitor).visitType_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_clauseContext type_clause() throws RecognitionException {
		Type_clauseContext _localctx = new Type_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(TYPE);
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
		public List<TerminalNode> ID() { return getTokens(MappingParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MappingParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(MappingParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MappingParser.INT, i);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingParserVisitor ) return ((MappingParserVisitor<? extends T>)visitor).visitIndex_name(this);
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

	public static class Source_clauseContext extends ParserRuleContext {
		public TerminalNode SOURCE() { return getToken(MappingParser.SOURCE, 0); }
		public TerminalNode COLON() { return getToken(MappingParser.COLON, 0); }
		public TerminalNode RPAREN() { return getToken(MappingParser.RPAREN, 0); }
		public TerminalNode ENABLED() { return getToken(MappingParser.ENABLED, 0); }
		public TerminalNode LPAREN() { return getToken(MappingParser.LPAREN, 0); }
		public TerminalNode TRUE() { return getToken(MappingParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MappingParser.FALSE, 0); }
		public Source_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingParserVisitor ) return ((MappingParserVisitor<? extends T>)visitor).visitSource_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_clauseContext source_clause() throws RecognitionException {
		Source_clauseContext _localctx = new Source_clauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_source_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(SOURCE);
			setState(38);
			match(COLON);
			setState(39);
			match(RPAREN);
			setState(40);
			match(ENABLED);
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(42);
			match(LPAREN);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\5\2\22\n\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\7\5\35\n\5\f\5\16\5 \13\5\3\5\7\5#\n\5\f\5\16"+
		"\5&\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\3\2\16\17"+
		",\2\f\3\2\2\2\4\25\3\2\2\2\6\30\3\2\2\2\b\36\3\2\2\2\n\'\3\2\2\2\f\r\7"+
		"\3\2\2\r\16\5\4\3\2\16\17\5\6\4\2\17\21\7\13\2\2\20\22\5\n\6\2\21\20\3"+
		"\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24\7\f\2\2\24\3\3\2\2\2\25\26\7"+
		"\4\2\2\26\27\5\b\5\2\27\5\3\2\2\2\30\31\7\5\2\2\31\32\5\b\5\2\32\7\3\2"+
		"\2\2\33\35\7\20\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2"+
		"\2\2\37$\3\2\2\2 \36\3\2\2\2!#\7\21\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2"+
		"\2$%\3\2\2\2%\t\3\2\2\2&$\3\2\2\2\'(\7\6\2\2()\7\n\2\2)*\7\13\2\2*+\7"+
		"\t\2\2+,\t\2\2\2,-\7\f\2\2-\13\3\2\2\2\5\21\36$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}