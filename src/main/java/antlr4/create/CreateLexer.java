// Generated from F:/GitHub/ESQL/src/main/java/antlr4/create\CreateLexer.g4 by ANTLR 4.5.3
package antlr4.create;
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
		CREATE=1, INDEX=2, NUMBER_OF_SHARDS=3, NUMBER_OF_REPLICAS=4, COLON=5, 
		SEMI=6, QUOTES=7, ID=8, INT=9, NEWLINE=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CREATE", "INDEX", "NUMBER_OF_SHARDS", "NUMBER_OF_REPLICAS", "COLON", 
		"SEMI", "QUOTES", "ID", "INT", "NEWLINE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r\u0099\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2&\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5z\n\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\6\t\u0083\n\t\r\t\16\t\u0084\3\n\6\n\u0088\n\n"+
		"\r\n\16\n\u0089\3\13\5\13\u008d\n\13\3\13\3\13\3\13\3\13\3\f\6\f\u0094"+
		"\n\f\r\f\16\f\u0095\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\3\2\5\7\2//C\\aac|\u4e02\u9fa7\3\2\62;\4\2\13\f\17\17\u00a0"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\3%\3\2\2\2\5\61\3\2\2\2\7S\3\2\2\2\ty\3\2\2\2\13{\3\2\2\2\r}\3\2\2\2"+
		"\17\177\3\2\2\2\21\u0082\3\2\2\2\23\u0087\3\2\2\2\25\u008c\3\2\2\2\27"+
		"\u0093\3\2\2\2\31\32\7e\2\2\32\33\7t\2\2\33\34\7g\2\2\34\35\7c\2\2\35"+
		"\36\7v\2\2\36&\7g\2\2\37 \7E\2\2 !\7T\2\2!\"\7G\2\2\"#\7C\2\2#$\7V\2\2"+
		"$&\7G\2\2%\31\3\2\2\2%\37\3\2\2\2&\4\3\2\2\2\'(\7k\2\2()\7p\2\2)*\7f\2"+
		"\2*+\7g\2\2+\62\7z\2\2,-\7K\2\2-.\7P\2\2./\7F\2\2/\60\7G\2\2\60\62\7Z"+
		"\2\2\61\'\3\2\2\2\61,\3\2\2\2\62\6\3\2\2\2\63\64\7p\2\2\64\65\7w\2\2\65"+
		"\66\7o\2\2\66\67\7d\2\2\678\7g\2\289\7t\2\29:\7a\2\2:;\7q\2\2;<\7h\2\2"+
		"<=\7a\2\2=>\7u\2\2>?\7j\2\2?@\7c\2\2@A\7t\2\2AB\7f\2\2BT\7u\2\2CD\7P\2"+
		"\2DE\7W\2\2EF\7O\2\2FG\7D\2\2GH\7G\2\2HI\7T\2\2IJ\7a\2\2JK\7Q\2\2KL\7"+
		"H\2\2LM\7a\2\2MN\7U\2\2NO\7J\2\2OP\7C\2\2PQ\7T\2\2QR\7F\2\2RT\7U\2\2S"+
		"\63\3\2\2\2SC\3\2\2\2T\b\3\2\2\2UV\7p\2\2VW\7w\2\2WX\7o\2\2XY\7d\2\2Y"+
		"Z\7g\2\2Z[\7t\2\2[\\\7a\2\2\\]\7q\2\2]^\7h\2\2^_\7a\2\2_`\7t\2\2`a\7g"+
		"\2\2ab\7r\2\2bc\7n\2\2cd\7k\2\2de\7e\2\2ef\7c\2\2fz\7u\2\2gh\7P\2\2hi"+
		"\7W\2\2ij\7O\2\2jk\7D\2\2kl\7G\2\2lm\7T\2\2mn\7a\2\2no\7Q\2\2op\7H\2\2"+
		"pq\7a\2\2qr\7T\2\2rs\7G\2\2st\7R\2\2tu\7N\2\2uv\7K\2\2vw\7E\2\2wx\7C\2"+
		"\2xz\7U\2\2yU\3\2\2\2yg\3\2\2\2z\n\3\2\2\2{|\7<\2\2|\f\3\2\2\2}~\7=\2"+
		"\2~\16\3\2\2\2\177\u0080\7)\2\2\u0080\20\3\2\2\2\u0081\u0083\t\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\22\3\2\2\2\u0086\u0088\t\3\2\2\u0087\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\24\3\2\2\2\u008b"+
		"\u008d\7\17\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u008f\7\f\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\13\2\2\u0091"+
		"\26\3\2\2\2\u0092\u0094\t\4\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2"+
		"\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\b\f\2\2\u0098\30\3\2\2\2\13\2%\61Sy\u0084\u0089\u008c\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}