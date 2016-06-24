// Generated from F:/GitHub/ESQL/src/main/java/antlr4/g4\SearchLexer.g4 by ANTLR 4.5.3
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
public class SearchLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, IS=6, NULL=7, LIKE=8, IN=9, EXISTS=10, 
		ALL=11, BETWEEN=12, REGEXP=13, LIMIT=14, COLON=15, ALL_FIELDS=16, EQ=17, 
		LTH=18, GTH=19, NOT_EQ=20, LET=21, GET=22, SEMI=23, ORDER=24, GROUP=25, 
		BY=26, ID=27, INT=28, NEWLINE=29, WS=30, RPAREN=31, LPAREN=32, INDEX=33, 
		KEY=34, COMMA=35, DOT=36, PARTITION=37, NEGATION=38, VERTBAR=39, TRUE=40, 
		FALSE=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "AND", "OR", "IS", "NULL", "LIKE", "IN", "EXISTS", 
		"ALL", "BETWEEN", "REGEXP", "LIMIT", "COLON", "ALL_FIELDS", "EQ", "LTH", 
		"GTH", "NOT_EQ", "LET", "GET", "SEMI", "ORDER", "GROUP", "BY", "ID", "INT", 
		"NEWLINE", "WS", "RPAREN", "LPAREN", "INDEX", "KEY", "COMMA", "DOT", "PARTITION", 
		"NEGATION", "VERTBAR", "TRUE", "FALSE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "':'", "'*'", "'='", "'<'", "'>'", "'!='", "'<='", "'>='", 
		"';'", null, null, null, null, null, null, null, "')'", "'('", "'index'", 
		"'key'", "','", "'.'", "'partition'", "'~'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "IS", "NULL", "LIKE", "IN", 
		"EXISTS", "ALL", "BETWEEN", "REGEXP", "LIMIT", "COLON", "ALL_FIELDS", 
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


	public SearchLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SearchLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u016c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2b\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3l\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4x\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u008a\n\6\3\7\3\7\3\7\3\7\5\7\u0090\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u009a\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a4\n\t\3\n"+
		"\3\n\3\n\3\n\5\n\u00aa\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00b8\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c0\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d0\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00de"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ea\n\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u010b\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0117\n\32\3\33\3\33\3\33\3\33\5\33\u011d\n\33\3\34\6"+
		"\34\u0120\n\34\r\34\16\34\u0121\3\35\6\35\u0125\n\35\r\35\16\35\u0126"+
		"\3\36\5\36\u012a\n\36\3\36\3\36\3\36\3\36\3\37\6\37\u0131\n\37\r\37\16"+
		"\37\u0132\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\5)\u015f\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u016b\n*\2\2+\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\4\b\2//\62;C\\aac|\u4e02\u9fa7\5\2\13\f"+
		"\17\17\"\"\u0184\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\3a\3\2\2\2\5k\3\2\2\2\7w\3\2\2\2\t\u0081\3\2\2\2\13\u0089"+
		"\3\2\2\2\r\u008f\3\2\2\2\17\u0099\3\2\2\2\21\u00a3\3\2\2\2\23\u00a9\3"+
		"\2\2\2\25\u00b7\3\2\2\2\27\u00bf\3\2\2\2\31\u00cf\3\2\2\2\33\u00dd\3\2"+
		"\2\2\35\u00e9\3\2\2\2\37\u00eb\3\2\2\2!\u00ed\3\2\2\2#\u00ef\3\2\2\2%"+
		"\u00f1\3\2\2\2\'\u00f3\3\2\2\2)\u00f5\3\2\2\2+\u00f8\3\2\2\2-\u00fb\3"+
		"\2\2\2/\u00fe\3\2\2\2\61\u010a\3\2\2\2\63\u0116\3\2\2\2\65\u011c\3\2\2"+
		"\2\67\u011f\3\2\2\29\u0124\3\2\2\2;\u0129\3\2\2\2=\u0130\3\2\2\2?\u0136"+
		"\3\2\2\2A\u0138\3\2\2\2C\u013a\3\2\2\2E\u0140\3\2\2\2G\u0144\3\2\2\2I"+
		"\u0146\3\2\2\2K\u0148\3\2\2\2M\u0152\3\2\2\2O\u0154\3\2\2\2Q\u015e\3\2"+
		"\2\2S\u016a\3\2\2\2UV\7u\2\2VW\7g\2\2WX\7n\2\2XY\7g\2\2YZ\7e\2\2Zb\7v"+
		"\2\2[\\\7U\2\2\\]\7G\2\2]^\7N\2\2^_\7G\2\2_`\7E\2\2`b\7V\2\2aU\3\2\2\2"+
		"a[\3\2\2\2b\4\3\2\2\2cd\7h\2\2de\7t\2\2ef\7q\2\2fl\7o\2\2gh\7H\2\2hi\7"+
		"T\2\2ij\7Q\2\2jl\7O\2\2kc\3\2\2\2kg\3\2\2\2l\6\3\2\2\2mn\7y\2\2no\7j\2"+
		"\2op\7g\2\2pq\7t\2\2qx\7g\2\2rs\7Y\2\2st\7J\2\2tu\7G\2\2uv\7T\2\2vx\7"+
		"G\2\2wm\3\2\2\2wr\3\2\2\2x\b\3\2\2\2yz\7c\2\2z{\7p\2\2{\u0082\7f\2\2|"+
		"}\7(\2\2}\u0082\7(\2\2~\177\7C\2\2\177\u0080\7P\2\2\u0080\u0082\7F\2\2"+
		"\u0081y\3\2\2\2\u0081|\3\2\2\2\u0081~\3\2\2\2\u0082\n\3\2\2\2\u0083\u0084"+
		"\7q\2\2\u0084\u008a\7t\2\2\u0085\u0086\7~\2\2\u0086\u008a\7~\2\2\u0087"+
		"\u0088\7Q\2\2\u0088\u008a\7T\2\2\u0089\u0083\3\2\2\2\u0089\u0085\3\2\2"+
		"\2\u0089\u0087\3\2\2\2\u008a\f\3\2\2\2\u008b\u008c\7k\2\2\u008c\u0090"+
		"\7u\2\2\u008d\u008e\7K\2\2\u008e\u0090\7U\2\2\u008f\u008b\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\16\3\2\2\2\u0091\u0092\7p\2\2\u0092\u0093\7w\2\2"+
		"\u0093\u0094\7n\2\2\u0094\u009a\7n\2\2\u0095\u0096\7P\2\2\u0096\u0097"+
		"\7W\2\2\u0097\u0098\7N\2\2\u0098\u009a\7N\2\2\u0099\u0091\3\2\2\2\u0099"+
		"\u0095\3\2\2\2\u009a\20\3\2\2\2\u009b\u009c\7n\2\2\u009c\u009d\7k\2\2"+
		"\u009d\u009e\7m\2\2\u009e\u00a4\7g\2\2\u009f\u00a0\7N\2\2\u00a0\u00a1"+
		"\7K\2\2\u00a1\u00a2\7M\2\2\u00a2\u00a4\7G\2\2\u00a3\u009b\3\2\2\2\u00a3"+
		"\u009f\3\2\2\2\u00a4\22\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00aa\7p\2\2"+
		"\u00a7\u00a8\7K\2\2\u00a8\u00aa\7P\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\24\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7z\2\2\u00ad"+
		"\u00ae\7k\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7v\2\2\u00b0\u00b8\7u\2\2"+
		"\u00b1\u00b2\7G\2\2\u00b2\u00b3\7Z\2\2\u00b3\u00b4\7K\2\2\u00b4\u00b5"+
		"\7U\2\2\u00b5\u00b6\7V\2\2\u00b6\u00b8\7U\2\2\u00b7\u00ab\3\2\2\2\u00b7"+
		"\u00b1\3\2\2\2\u00b8\26\3\2\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7n\2\2"+
		"\u00bb\u00c0\7n\2\2\u00bc\u00bd\7C\2\2\u00bd\u00be\7N\2\2\u00be\u00c0"+
		"\7N\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\30\3\2\2\2\u00c1"+
		"\u00c2\7d\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7y\2\2"+
		"\u00c5\u00c6\7g\2\2\u00c6\u00c7\7g\2\2\u00c7\u00d0\7p\2\2\u00c8\u00c9"+
		"\7D\2\2\u00c9\u00ca\7G\2\2\u00ca\u00cb\7V\2\2\u00cb\u00cc\7Y\2\2\u00cc"+
		"\u00cd\7G\2\2\u00cd\u00ce\7G\2\2\u00ce\u00d0\7P\2\2\u00cf\u00c1\3\2\2"+
		"\2\u00cf\u00c8\3\2\2\2\u00d0\32\3\2\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3"+
		"\7g\2\2\u00d3\u00d4\7i\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7z\2\2\u00d6"+
		"\u00de\7r\2\2\u00d7\u00d8\7T\2\2\u00d8\u00d9\7G\2\2\u00d9\u00da\7I\2\2"+
		"\u00da\u00db\7G\2\2\u00db\u00dc\7Z\2\2\u00dc\u00de\7R\2\2\u00dd\u00d1"+
		"\3\2\2\2\u00dd\u00d7\3\2\2\2\u00de\34\3\2\2\2\u00df\u00e0\7n\2\2\u00e0"+
		"\u00e1\7k\2\2\u00e1\u00e2\7o\2\2\u00e2\u00e3\7k\2\2\u00e3\u00ea\7v\2\2"+
		"\u00e4\u00e5\7N\2\2\u00e5\u00e6\7K\2\2\u00e6\u00e7\7O\2\2\u00e7\u00e8"+
		"\7K\2\2\u00e8\u00ea\7V\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e4\3\2\2\2\u00ea"+
		"\36\3\2\2\2\u00eb\u00ec\7<\2\2\u00ec \3\2\2\2\u00ed\u00ee\7,\2\2\u00ee"+
		"\"\3\2\2\2\u00ef\u00f0\7?\2\2\u00f0$\3\2\2\2\u00f1\u00f2\7>\2\2\u00f2"+
		"&\3\2\2\2\u00f3\u00f4\7@\2\2\u00f4(\3\2\2\2\u00f5\u00f6\7#\2\2\u00f6\u00f7"+
		"\7?\2\2\u00f7*\3\2\2\2\u00f8\u00f9\7>\2\2\u00f9\u00fa\7?\2\2\u00fa,\3"+
		"\2\2\2\u00fb\u00fc\7@\2\2\u00fc\u00fd\7?\2\2\u00fd.\3\2\2\2\u00fe\u00ff"+
		"\7=\2\2\u00ff\60\3\2\2\2\u0100\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102\u0103"+
		"\7f\2\2\u0103\u0104\7g\2\2\u0104\u010b\7t\2\2\u0105\u0106\7Q\2\2\u0106"+
		"\u0107\7T\2\2\u0107\u0108\7F\2\2\u0108\u0109\7G\2\2\u0109\u010b\7T\2\2"+
		"\u010a\u0100\3\2\2\2\u010a\u0105\3\2\2\2\u010b\62\3\2\2\2\u010c\u010d"+
		"\7i\2\2\u010d\u010e\7t\2\2\u010e\u010f\7q\2\2\u010f\u0110\7w\2\2\u0110"+
		"\u0117\7r\2\2\u0111\u0112\7I\2\2\u0112\u0113\7T\2\2\u0113\u0114\7Q\2\2"+
		"\u0114\u0115\7W\2\2\u0115\u0117\7R\2\2\u0116\u010c\3\2\2\2\u0116\u0111"+
		"\3\2\2\2\u0117\64\3\2\2\2\u0118\u0119\7d\2\2\u0119\u011d\7{\2\2\u011a"+
		"\u011b\7D\2\2\u011b\u011d\7[\2\2\u011c\u0118\3\2\2\2\u011c\u011a\3\2\2"+
		"\2\u011d\66\3\2\2\2\u011e\u0120\t\2\2\2\u011f\u011e\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u01228\3\2\2\2\u0123"+
		"\u0125\4\62;\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127:\3\2\2\2\u0128\u012a\7\17\2\2\u0129\u0128"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\f\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\b\36\2\2\u012e<\3\2\2\2\u012f\u0131\t\3\2\2"+
		"\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b\37\2\2\u0135>\3\2\2\2\u0136"+
		"\u0137\7+\2\2\u0137@\3\2\2\2\u0138\u0139\7*\2\2\u0139B\3\2\2\2\u013a\u013b"+
		"\7k\2\2\u013b\u013c\7p\2\2\u013c\u013d\7f\2\2\u013d\u013e\7g\2\2\u013e"+
		"\u013f\7z\2\2\u013fD\3\2\2\2\u0140\u0141\7m\2\2\u0141\u0142\7g\2\2\u0142"+
		"\u0143\7{\2\2\u0143F\3\2\2\2\u0144\u0145\7.\2\2\u0145H\3\2\2\2\u0146\u0147"+
		"\7\60\2\2\u0147J\3\2\2\2\u0148\u0149\7r\2\2\u0149\u014a\7c\2\2\u014a\u014b"+
		"\7t\2\2\u014b\u014c\7v\2\2\u014c\u014d\7k\2\2\u014d\u014e\7v\2\2\u014e"+
		"\u014f\7k\2\2\u014f\u0150\7q\2\2\u0150\u0151\7p\2\2\u0151L\3\2\2\2\u0152"+
		"\u0153\7\u0080\2\2\u0153N\3\2\2\2\u0154\u0155\7~\2\2\u0155P\3\2\2\2\u0156"+
		"\u0157\7v\2\2\u0157\u0158\7t\2\2\u0158\u0159\7w\2\2\u0159\u015f\7g\2\2"+
		"\u015a\u015b\7V\2\2\u015b\u015c\7T\2\2\u015c\u015d\7W\2\2\u015d\u015f"+
		"\7G\2\2\u015e\u0156\3\2\2\2\u015e\u015a\3\2\2\2\u015fR\3\2\2\2\u0160\u0161"+
		"\7h\2\2\u0161\u0162\7c\2\2\u0162\u0163\7n\2\2\u0163\u0164\7u\2\2\u0164"+
		"\u016b\7g\2\2\u0165\u0166\7H\2\2\u0166\u0167\7C\2\2\u0167\u0168\7N\2\2"+
		"\u0168\u0169\7U\2\2\u0169\u016b\7G\2\2\u016a\u0160\3\2\2\2\u016a\u0165"+
		"\3\2\2\2\u016bT\3\2\2\2\32\2akw\u0081\u0089\u008f\u0099\u00a3\u00a9\u00b7"+
		"\u00bf\u00cf\u00dd\u00e9\u010a\u0116\u011c\u0121\u0126\u0129\u0132\u015e"+
		"\u016a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}