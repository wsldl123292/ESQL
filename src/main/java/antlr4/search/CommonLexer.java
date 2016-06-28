// Generated from F:/GitHub/ESQL/src/main/java/antlr4/search\CommonLexer.g4 by ANTLR 4.5.3
package antlr4.search;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, INT=2, NEWLINE=3, WS=4, RPAREN=5, LPAREN=6, INDEX=7, KEY=8, COMMA=9, 
		DOT=10, PARTITION=11, NEGATION=12, VERTBAR=13, TRUE=14, FALSE=15, ANY_STRING_CHAR=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ID", "INT", "NEWLINE", "WS", "RPAREN", "LPAREN", "INDEX", "KEY", "COMMA", 
		"DOT", "PARTITION", "NEGATION", "VERTBAR", "TRUE", "FALSE", "ANY_STRING_CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "')'", "'('", "'index'", "'key'", "','", 
		"'.'", "'partition'", "'~'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "INT", "NEWLINE", "WS", "RPAREN", "LPAREN", "INDEX", "KEY", 
		"COMMA", "DOT", "PARTITION", "NEGATION", "VERTBAR", "TRUE", "FALSE", "ANY_STRING_CHAR"
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


	public CommonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommonLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2%\n"+
		"\2\r\2\16\2&\3\3\6\3*\n\3\r\3\16\3+\3\4\5\4/\n\4\3\4\3\4\3\4\3\4\3\5\6"+
		"\5\66\n\5\r\5\16\5\67\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17d\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20p\n\20\3\21"+
		"\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22\3\2\6\7\2//C\\aac|\u4e02\u9fa7\3\2\62;\6\2\13\f"+
		"\17\17\"\"))\3\2\"\"x\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\3$\3\2\2\2\5)\3\2\2\2\7.\3\2\2\2\t\65\3\2\2\2\13;\3\2"+
		"\2\2\r=\3\2\2\2\17?\3\2\2\2\21E\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27M\3"+
		"\2\2\2\31W\3\2\2\2\33Y\3\2\2\2\35c\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#%\t\2"+
		"\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\4\3\2\2\2(*\t\3\2\2)("+
		"\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\6\3\2\2\2-/\7\17\2\2.-\3\2\2\2"+
		"./\3\2\2\2/\60\3\2\2\2\60\61\7\f\2\2\61\62\3\2\2\2\62\63\b\4\2\2\63\b"+
		"\3\2\2\2\64\66\t\4\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3"+
		"\2\2\289\3\2\2\29:\b\5\2\2:\n\3\2\2\2;<\7+\2\2<\f\3\2\2\2=>\7*\2\2>\16"+
		"\3\2\2\2?@\7k\2\2@A\7p\2\2AB\7f\2\2BC\7g\2\2CD\7z\2\2D\20\3\2\2\2EF\7"+
		"m\2\2FG\7g\2\2GH\7{\2\2H\22\3\2\2\2IJ\7.\2\2J\24\3\2\2\2KL\7\60\2\2L\26"+
		"\3\2\2\2MN\7r\2\2NO\7c\2\2OP\7t\2\2PQ\7v\2\2QR\7k\2\2RS\7v\2\2ST\7k\2"+
		"\2TU\7q\2\2UV\7p\2\2V\30\3\2\2\2WX\7\u0080\2\2X\32\3\2\2\2YZ\7~\2\2Z\34"+
		"\3\2\2\2[\\\7v\2\2\\]\7t\2\2]^\7w\2\2^d\7g\2\2_`\7V\2\2`a\7T\2\2ab\7W"+
		"\2\2bd\7G\2\2c[\3\2\2\2c_\3\2\2\2d\36\3\2\2\2ef\7h\2\2fg\7c\2\2gh\7n\2"+
		"\2hi\7u\2\2ip\7g\2\2jk\7H\2\2kl\7C\2\2lm\7N\2\2mn\7U\2\2np\7G\2\2oe\3"+
		"\2\2\2oj\3\2\2\2p \3\2\2\2qr\n\5\2\2r\"\3\2\2\2\t\2&+.\67co\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}