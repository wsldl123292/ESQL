// Generated from /Users/ldl/Documents/develop/project/github/ESQL/src/main/java/antlr4/create/CreateLexer.g4 by ANTLR 4.5.3
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
		CREATE=1, NUMBER_OF_SHARDS=2, NUMBER_OF_REPLICAS=3, COLON=4, SEMI=5, QUOTES=6, 
		ID=7, INT=8, NEWLINE=9, WS=10, RPAREN=11, LPAREN=12, INDEX=13, COMMA=14, 
		DOT=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CREATE", "NUMBER_OF_SHARDS", "NUMBER_OF_REPLICAS", "COLON", "SEMI", "QUOTES", 
		"ID", "INT", "NEWLINE", "WS", "RPAREN", "LPAREN", "INDEX", "COMMA", "DOT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "':'", "';'", "'''", null, null, null, null, "')'", 
		"'('", null, "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CREATE", "NUMBER_OF_SHARDS", "NUMBER_OF_REPLICAS", "COLON", "SEMI", 
		"QUOTES", "ID", "INT", "NEWLINE", "WS", "RPAREN", "LPAREN", "INDEX", "COMMA", 
		"DOT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2.\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4v\n\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\6\b\177\n\b\r\b\16\b\u0080\3\t\6\t\u0084\n\t\r\t\16\t\u0085"+
		"\3\n\5\n\u0089\n\n\3\n\3\n\3\n\3\n\3\13\6\13\u0090\n\13\r\13\16\13\u0091"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00a4\n\16\3\17\3\17\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\5\7\2//C\\"+
		"aac|\u4e02\u9fa7\3\2\62;\4\2\13\f\17\17\u00b0\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\3-\3\2\2\2\5O\3\2\2\2\7u\3\2\2\2\tw\3\2\2"+
		"\2\13y\3\2\2\2\r{\3\2\2\2\17~\3\2\2\2\21\u0083\3\2\2\2\23\u0088\3\2\2"+
		"\2\25\u008f\3\2\2\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u00a3\3\2\2\2"+
		"\35\u00a5\3\2\2\2\37\u00a7\3\2\2\2!\"\7e\2\2\"#\7t\2\2#$\7g\2\2$%\7c\2"+
		"\2%&\7v\2\2&.\7g\2\2\'(\7E\2\2()\7T\2\2)*\7G\2\2*+\7C\2\2+,\7V\2\2,.\7"+
		"G\2\2-!\3\2\2\2-\'\3\2\2\2.\4\3\2\2\2/\60\7p\2\2\60\61\7w\2\2\61\62\7"+
		"o\2\2\62\63\7d\2\2\63\64\7g\2\2\64\65\7t\2\2\65\66\7a\2\2\66\67\7q\2\2"+
		"\678\7h\2\289\7a\2\29:\7u\2\2:;\7j\2\2;<\7c\2\2<=\7t\2\2=>\7f\2\2>P\7"+
		"u\2\2?@\7P\2\2@A\7W\2\2AB\7O\2\2BC\7D\2\2CD\7G\2\2DE\7T\2\2EF\7a\2\2F"+
		"G\7Q\2\2GH\7H\2\2HI\7a\2\2IJ\7U\2\2JK\7J\2\2KL\7C\2\2LM\7T\2\2MN\7F\2"+
		"\2NP\7U\2\2O/\3\2\2\2O?\3\2\2\2P\6\3\2\2\2QR\7p\2\2RS\7w\2\2ST\7o\2\2"+
		"TU\7d\2\2UV\7g\2\2VW\7t\2\2WX\7a\2\2XY\7q\2\2YZ\7h\2\2Z[\7a\2\2[\\\7t"+
		"\2\2\\]\7g\2\2]^\7r\2\2^_\7n\2\2_`\7k\2\2`a\7e\2\2ab\7c\2\2bv\7u\2\2c"+
		"d\7P\2\2de\7W\2\2ef\7O\2\2fg\7D\2\2gh\7G\2\2hi\7T\2\2ij\7a\2\2jk\7Q\2"+
		"\2kl\7H\2\2lm\7a\2\2mn\7T\2\2no\7G\2\2op\7R\2\2pq\7N\2\2qr\7K\2\2rs\7"+
		"E\2\2st\7C\2\2tv\7U\2\2uQ\3\2\2\2uc\3\2\2\2v\b\3\2\2\2wx\7<\2\2x\n\3\2"+
		"\2\2yz\7=\2\2z\f\3\2\2\2{|\7)\2\2|\16\3\2\2\2}\177\t\2\2\2~}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\20\3\2\2\2\u0082"+
		"\u0084\t\3\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\22\3\2\2\2\u0087\u0089\7\17\2\2\u0088\u0087"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\f\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\b\n\2\2\u008d\24\3\2\2\2\u008e\u0090\t\4\2"+
		"\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\13\2\2\u0094\26\3\2\2\2\u0095"+
		"\u0096\7+\2\2\u0096\30\3\2\2\2\u0097\u0098\7*\2\2\u0098\32\3\2\2\2\u0099"+
		"\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7f\2\2\u009c\u009d\7g\2\2"+
		"\u009d\u00a4\7z\2\2\u009e\u009f\7K\2\2\u009f\u00a0\7P\2\2\u00a0\u00a1"+
		"\7F\2\2\u00a1\u00a2\7G\2\2\u00a2\u00a4\7Z\2\2\u00a3\u0099\3\2\2\2\u00a3"+
		"\u009e\3\2\2\2\u00a4\34\3\2\2\2\u00a5\u00a6\7.\2\2\u00a6\36\3\2\2\2\u00a7"+
		"\u00a8\7\60\2\2\u00a8 \3\2\2\2\13\2-Ou\u0080\u0085\u0088\u0091\u00a3\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}