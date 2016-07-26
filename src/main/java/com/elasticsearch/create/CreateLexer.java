// Generated from F:/GitHub/ESQL/src/main/java/antlr4/create\CreateLexer.g4 by ANTLR 4.5.3
package com.elasticsearch.create;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, INDEX=2, NUMBER_OF_SHARDS=3, NUMBER_OF_REPLICAS=4, ID=5, INT=6, 
		NEWLINE=7, WS=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CREATE", "INDEX", "NUMBER_OF_SHARDS", "NUMBER_OF_REPLICAS", "ID", "INT", 
		"NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "INDEX", "NUMBER_OF_SHARDS", "NUMBER_OF_REPLICAS", "ID", 
		"INT", "NEWLINE", "WS"
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


	public CreateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CreateLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u008d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5t\n\5\3\6\6\6w\n\6\r\6\16\6x\3\7\6\7|"+
		"\n\7\r\7\16\7}\3\b\5\b\u0081\n\b\3\b\3\b\3\b\3\b\3\t\6\t\u0088\n\t\r\t"+
		"\16\t\u0089\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\5\7\2"+
		"//C\\aac|\u4e02\u9fa7\3\2\62;\4\2\13\f\17\17\u0094\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\3\37\3\2\2\2\5+\3\2\2\2\7M\3\2\2\2\ts\3\2\2\2\13v\3\2\2\2\r{"+
		"\3\2\2\2\17\u0080\3\2\2\2\21\u0087\3\2\2\2\23\24\7e\2\2\24\25\7t\2\2\25"+
		"\26\7g\2\2\26\27\7c\2\2\27\30\7v\2\2\30 \7g\2\2\31\32\7E\2\2\32\33\7T"+
		"\2\2\33\34\7G\2\2\34\35\7C\2\2\35\36\7V\2\2\36 \7G\2\2\37\23\3\2\2\2\37"+
		"\31\3\2\2\2 \4\3\2\2\2!\"\7k\2\2\"#\7p\2\2#$\7f\2\2$%\7g\2\2%,\7z\2\2"+
		"&\'\7K\2\2\'(\7P\2\2()\7F\2\2)*\7G\2\2*,\7Z\2\2+!\3\2\2\2+&\3\2\2\2,\6"+
		"\3\2\2\2-.\7p\2\2./\7w\2\2/\60\7o\2\2\60\61\7d\2\2\61\62\7g\2\2\62\63"+
		"\7t\2\2\63\64\7a\2\2\64\65\7q\2\2\65\66\7h\2\2\66\67\7a\2\2\678\7u\2\2"+
		"89\7j\2\29:\7c\2\2:;\7t\2\2;<\7f\2\2<N\7u\2\2=>\7P\2\2>?\7W\2\2?@\7O\2"+
		"\2@A\7D\2\2AB\7G\2\2BC\7T\2\2CD\7a\2\2DE\7Q\2\2EF\7H\2\2FG\7a\2\2GH\7"+
		"U\2\2HI\7J\2\2IJ\7C\2\2JK\7T\2\2KL\7F\2\2LN\7U\2\2M-\3\2\2\2M=\3\2\2\2"+
		"N\b\3\2\2\2OP\7p\2\2PQ\7w\2\2QR\7o\2\2RS\7d\2\2ST\7g\2\2TU\7t\2\2UV\7"+
		"a\2\2VW\7q\2\2WX\7h\2\2XY\7a\2\2YZ\7t\2\2Z[\7g\2\2[\\\7r\2\2\\]\7n\2\2"+
		"]^\7k\2\2^_\7e\2\2_`\7c\2\2`t\7u\2\2ab\7P\2\2bc\7W\2\2cd\7O\2\2de\7D\2"+
		"\2ef\7G\2\2fg\7T\2\2gh\7a\2\2hi\7Q\2\2ij\7H\2\2jk\7a\2\2kl\7T\2\2lm\7"+
		"G\2\2mn\7R\2\2no\7N\2\2op\7K\2\2pq\7E\2\2qr\7C\2\2rt\7U\2\2sO\3\2\2\2"+
		"sa\3\2\2\2t\n\3\2\2\2uw\t\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2"+
		"\2y\f\3\2\2\2z|\t\3\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\16\3"+
		"\2\2\2\177\u0081\7\17\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\7\f\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\b"+
		"\2\2\u0085\20\3\2\2\2\u0086\u0088\t\4\2\2\u0087\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\b\t\2\2\u008c\22\3\2\2\2\13\2\37+Msx}\u0080\u0089\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}