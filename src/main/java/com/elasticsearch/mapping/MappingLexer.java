// Generated from F:/GitHub/ESQL/src/main/java/com/elasticsearch/mapping\MappingLexer.g4 by ANTLR 4.5.3
package com.elasticsearch.mapping;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MappingLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, MAPPING=2, TYPE=3, SOURCE=4, INDEX=5, STORE=6, ENABLED=7, COLON=8, 
		RPAREN=9, LPAREN=10, COMMA=11, TRUE=12, FALSE=13, ID=14, INT=15, NEWLINE=16, 
		WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ADD", "MAPPING", "TYPE", "SOURCE", "INDEX", "STORE", "ENABLED", "COLON", 
		"RPAREN", "LPAREN", "COMMA", "TRUE", "FALSE", "ID", "INT", "NEWLINE", 
		"WS"
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


	public MappingLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MappingLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u00b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\5\2,\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5V\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6b\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b~\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u0090\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u009c\n\16\3\17\6\17\u009f\n\17\r\17\16\17\u00a0"+
		"\3\20\6\20\u00a4\n\20\r\20\16\20\u00a5\3\21\5\21\u00a9\n\21\3\21\3\21"+
		"\3\21\3\21\3\22\6\22\u00b0\n\22\r\22\16\22\u00b1\3\22\3\22\2\2\23\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23\3\2\5\7\2//C\\aac|\u4e02\u9fa7\3\2\62;\4\2\13\f\17\17\u00c1\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\3+\3\2\2\2\5;\3\2\2\2\7E\3\2\2\2\tU\3\2\2\2\13a\3\2\2\2\rm\3\2\2\2"+
		"\17}\3\2\2\2\21\177\3\2\2\2\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u0085"+
		"\3\2\2\2\31\u008f\3\2\2\2\33\u009b\3\2\2\2\35\u009e\3\2\2\2\37\u00a3\3"+
		"\2\2\2!\u00a8\3\2\2\2#\u00af\3\2\2\2%&\7c\2\2&\'\7f\2\2\',\7f\2\2()\7"+
		"C\2\2)*\7F\2\2*,\7F\2\2+%\3\2\2\2+(\3\2\2\2,\4\3\2\2\2-.\7o\2\2./\7c\2"+
		"\2/\60\7r\2\2\60\61\7r\2\2\61\62\7k\2\2\62\63\7p\2\2\63<\7i\2\2\64\65"+
		"\7O\2\2\65\66\7C\2\2\66\67\7R\2\2\678\7R\2\289\7K\2\29:\7P\2\2:<\7I\2"+
		"\2;-\3\2\2\2;\64\3\2\2\2<\6\3\2\2\2=>\7v\2\2>?\7{\2\2?@\7r\2\2@F\7g\2"+
		"\2AB\7V\2\2BC\7[\2\2CD\7R\2\2DF\7G\2\2E=\3\2\2\2EA\3\2\2\2F\b\3\2\2\2"+
		"GH\7a\2\2HI\7u\2\2IJ\7q\2\2JK\7w\2\2KL\7t\2\2LM\7e\2\2MV\7g\2\2NO\7a\2"+
		"\2OP\7U\2\2PQ\7Q\2\2QR\7W\2\2RS\7T\2\2ST\7E\2\2TV\7G\2\2UG\3\2\2\2UN\3"+
		"\2\2\2V\n\3\2\2\2WX\7k\2\2XY\7p\2\2YZ\7f\2\2Z[\7g\2\2[b\7z\2\2\\]\7K\2"+
		"\2]^\7P\2\2^_\7F\2\2_`\7G\2\2`b\7Z\2\2aW\3\2\2\2a\\\3\2\2\2b\f\3\2\2\2"+
		"cd\7u\2\2de\7v\2\2ef\7q\2\2fg\7t\2\2gn\7g\2\2hi\7U\2\2ij\7V\2\2jk\7Q\2"+
		"\2kl\7T\2\2ln\7G\2\2mc\3\2\2\2mh\3\2\2\2n\16\3\2\2\2op\7g\2\2pq\7p\2\2"+
		"qr\7c\2\2rs\7d\2\2st\7n\2\2tu\7g\2\2u~\7f\2\2vw\7G\2\2wx\7P\2\2xy\7C\2"+
		"\2yz\7D\2\2z{\7N\2\2{|\7G\2\2|~\7F\2\2}o\3\2\2\2}v\3\2\2\2~\20\3\2\2\2"+
		"\177\u0080\7<\2\2\u0080\22\3\2\2\2\u0081\u0082\7}\2\2\u0082\24\3\2\2\2"+
		"\u0083\u0084\7\177\2\2\u0084\26\3\2\2\2\u0085\u0086\7.\2\2\u0086\30\3"+
		"\2\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089\u008a\7w\2\2\u008a"+
		"\u0090\7g\2\2\u008b\u008c\7V\2\2\u008c\u008d\7T\2\2\u008d\u008e\7W\2\2"+
		"\u008e\u0090\7G\2\2\u008f\u0087\3\2\2\2\u008f\u008b\3\2\2\2\u0090\32\3"+
		"\2\2\2\u0091\u0092\7h\2\2\u0092\u0093\7c\2\2\u0093\u0094\7n\2\2\u0094"+
		"\u0095\7u\2\2\u0095\u009c\7g\2\2\u0096\u0097\7H\2\2\u0097\u0098\7C\2\2"+
		"\u0098\u0099\7N\2\2\u0099\u009a\7U\2\2\u009a\u009c\7G\2\2\u009b\u0091"+
		"\3\2\2\2\u009b\u0096\3\2\2\2\u009c\34\3\2\2\2\u009d\u009f\t\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\36\3\2\2\2\u00a2\u00a4\t\3\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6 \3\2\2\2\u00a7"+
		"\u00a9\7\17\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00aa\u00ab\7\f\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\21\2\2\u00ad"+
		"\"\3\2\2\2\u00ae\u00b0\t\4\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4"+
		"\b\22\2\2\u00b4$\3\2\2\2\20\2+;EUam}\u008f\u009b\u00a0\u00a5\u00a8\u00b1"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}