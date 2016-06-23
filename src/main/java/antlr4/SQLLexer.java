// Generated from /Users/ldl/Documents/develop/project/github/ESQL/src/main/java/antlr4/SQLLexer.g4 by ANTLR 4.5.3
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, IS=6, NULL=7, LIKE=8, IN=9, EXISTS=10, 
		ALL=11, TRUE=12, FALSE=13, BETWEEN=14, REGEXP=15, LIMIT=16, NEGATION=17, 
		VERTBAR=18, RBRACK=19, LBRACK=20, COLON=21, ALL_FIELDS=22, EQ=23, LTH=24, 
		GTH=25, NOT_EQ=26, NOT=27, LET=28, GET=29, SEMI=30, ORDER=31, GROUP=32, 
		BY=33, ID=34, INT=35, NEWLINE=36, WS=37, RPAREN=38, LPAREN=39, INDEX=40, 
		KEY=41, COMMA=42, DOT=43, PARTITION=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "AND", "OR", "IS", "NULL", "LIKE", "IN", "EXISTS", 
		"ALL", "TRUE", "FALSE", "BETWEEN", "REGEXP", "LIMIT", "NEGATION", "VERTBAR", 
		"RBRACK", "LBRACK", "COLON", "ALL_FIELDS", "EQ", "LTH", "GTH", "NOT_EQ", 
		"NOT", "LET", "GET", "SEMI", "ORDER", "GROUP", "BY", "ID", "INT", "NEWLINE", 
		"WS", "RPAREN", "LPAREN", "INDEX", "KEY", "COMMA", "DOT", "PARTITION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'~'", "'|'", "']'", "'['", "':'", "'*'", 
		"'='", "'<'", "'>'", "'!='", "'not'", "'<='", "'>='", "';'", "'order'", 
		"'group'", "'by'", null, null, null, null, "')'", "'('", "'index'", "'key'", 
		"','", "'.'", "'partition'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "IS", "NULL", "LIKE", "IN", 
		"EXISTS", "ALL", "TRUE", "FALSE", "BETWEEN", "REGEXP", "LIMIT", "NEGATION", 
		"VERTBAR", "RBRACK", "LBRACK", "COLON", "ALL_FIELDS", "EQ", "LTH", "GTH", 
		"NOT_EQ", "NOT", "LET", "GET", "SEMI", "ORDER", "GROUP", "BY", "ID", "INT", 
		"NEWLINE", "WS", "RPAREN", "LPAREN", "INDEX", "KEY", "COMMA", "DOT", "PARTITION"
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


	public SQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u016b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2h\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3r\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4~\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0088\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u0090\n\6\3\7\3\7\3\7\3\7\5\7\u0096\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a0\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00aa\n\t\3\n\3\n\3\n\3\n\5\n\u00b0\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00be\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00c6\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d0\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00dc\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ec"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00fa\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0106"+
		"\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3#\6#\u0139\n#\r#\16#\u013a\3$\6$\u013e\n$\r$\16$\u013f\3%\5"+
		"%\u0143\n%\3%\3%\3%\3%\3&\6&\u014a\n&\r&\16&\u014b\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\4\b\2//\62;C\\aac|\u4e02"+
		"\u9fa7\5\2\13\f\17\17\"\"\u0180\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3g\3\2"+
		"\2\2\5q\3\2\2\2\7}\3\2\2\2\t\u0087\3\2\2\2\13\u008f\3\2\2\2\r\u0095\3"+
		"\2\2\2\17\u009f\3\2\2\2\21\u00a9\3\2\2\2\23\u00af\3\2\2\2\25\u00bd\3\2"+
		"\2\2\27\u00c5\3\2\2\2\31\u00cf\3\2\2\2\33\u00db\3\2\2\2\35\u00eb\3\2\2"+
		"\2\37\u00f9\3\2\2\2!\u0105\3\2\2\2#\u0107\3\2\2\2%\u0109\3\2\2\2\'\u010b"+
		"\3\2\2\2)\u010d\3\2\2\2+\u010f\3\2\2\2-\u0111\3\2\2\2/\u0113\3\2\2\2\61"+
		"\u0115\3\2\2\2\63\u0117\3\2\2\2\65\u0119\3\2\2\2\67\u011c\3\2\2\29\u0120"+
		"\3\2\2\2;\u0123\3\2\2\2=\u0126\3\2\2\2?\u0128\3\2\2\2A\u012e\3\2\2\2C"+
		"\u0134\3\2\2\2E\u0138\3\2\2\2G\u013d\3\2\2\2I\u0142\3\2\2\2K\u0149\3\2"+
		"\2\2M\u014f\3\2\2\2O\u0151\3\2\2\2Q\u0153\3\2\2\2S\u0159\3\2\2\2U\u015d"+
		"\3\2\2\2W\u015f\3\2\2\2Y\u0161\3\2\2\2[\\\7u\2\2\\]\7g\2\2]^\7n\2\2^_"+
		"\7g\2\2_`\7e\2\2`h\7v\2\2ab\7U\2\2bc\7G\2\2cd\7N\2\2de\7G\2\2ef\7E\2\2"+
		"fh\7V\2\2g[\3\2\2\2ga\3\2\2\2h\4\3\2\2\2ij\7h\2\2jk\7t\2\2kl\7q\2\2lr"+
		"\7o\2\2mn\7H\2\2no\7T\2\2op\7Q\2\2pr\7O\2\2qi\3\2\2\2qm\3\2\2\2r\6\3\2"+
		"\2\2st\7y\2\2tu\7j\2\2uv\7g\2\2vw\7t\2\2w~\7g\2\2xy\7Y\2\2yz\7J\2\2z{"+
		"\7G\2\2{|\7T\2\2|~\7G\2\2}s\3\2\2\2}x\3\2\2\2~\b\3\2\2\2\177\u0080\7c"+
		"\2\2\u0080\u0081\7p\2\2\u0081\u0088\7f\2\2\u0082\u0083\7(\2\2\u0083\u0088"+
		"\7(\2\2\u0084\u0085\7C\2\2\u0085\u0086\7P\2\2\u0086\u0088\7F\2\2\u0087"+
		"\177\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0084\3\2\2\2\u0088\n\3\2\2\2\u0089"+
		"\u008a\7q\2\2\u008a\u0090\7t\2\2\u008b\u008c\7~\2\2\u008c\u0090\7~\2\2"+
		"\u008d\u008e\7Q\2\2\u008e\u0090\7T\2\2\u008f\u0089\3\2\2\2\u008f\u008b"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\f\3\2\2\2\u0091\u0092\7k\2\2\u0092"+
		"\u0096\7u\2\2\u0093\u0094\7K\2\2\u0094\u0096\7U\2\2\u0095\u0091\3\2\2"+
		"\2\u0095\u0093\3\2\2\2\u0096\16\3\2\2\2\u0097\u0098\7p\2\2\u0098\u0099"+
		"\7w\2\2\u0099\u009a\7n\2\2\u009a\u00a0\7n\2\2\u009b\u009c\7P\2\2\u009c"+
		"\u009d\7W\2\2\u009d\u009e\7N\2\2\u009e\u00a0\7N\2\2\u009f\u0097\3\2\2"+
		"\2\u009f\u009b\3\2\2\2\u00a0\20\3\2\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3"+
		"\7k\2\2\u00a3\u00a4\7m\2\2\u00a4\u00aa\7g\2\2\u00a5\u00a6\7N\2\2\u00a6"+
		"\u00a7\7K\2\2\u00a7\u00a8\7M\2\2\u00a8\u00aa\7G\2\2\u00a9\u00a1\3\2\2"+
		"\2\u00a9\u00a5\3\2\2\2\u00aa\22\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00b0"+
		"\7p\2\2\u00ad\u00ae\7K\2\2\u00ae\u00b0\7P\2\2\u00af\u00ab\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\24\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7z\2\2"+
		"\u00b3\u00b4\7k\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7v\2\2\u00b6\u00be"+
		"\7u\2\2\u00b7\u00b8\7G\2\2\u00b8\u00b9\7Z\2\2\u00b9\u00ba\7K\2\2\u00ba"+
		"\u00bb\7U\2\2\u00bb\u00bc\7V\2\2\u00bc\u00be\7U\2\2\u00bd\u00b1\3\2\2"+
		"\2\u00bd\u00b7\3\2\2\2\u00be\26\3\2\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1"+
		"\7n\2\2\u00c1\u00c6\7n\2\2\u00c2\u00c3\7C\2\2\u00c3\u00c4\7N\2\2\u00c4"+
		"\u00c6\7N\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6\30\3\2\2\2"+
		"\u00c7\u00c8\7v\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7w\2\2\u00ca\u00d0"+
		"\7g\2\2\u00cb\u00cc\7V\2\2\u00cc\u00cd\7T\2\2\u00cd\u00ce\7W\2\2\u00ce"+
		"\u00d0\7G\2\2\u00cf\u00c7\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0\32\3\2\2\2"+
		"\u00d1\u00d2\7h\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5"+
		"\7u\2\2\u00d5\u00dc\7g\2\2\u00d6\u00d7\7H\2\2\u00d7\u00d8\7C\2\2\u00d8"+
		"\u00d9\7N\2\2\u00d9\u00da\7U\2\2\u00da\u00dc\7G\2\2\u00db\u00d1\3\2\2"+
		"\2\u00db\u00d6\3\2\2\2\u00dc\34\3\2\2\2\u00dd\u00de\7d\2\2\u00de\u00df"+
		"\7g\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7y\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3\u00ec\7p\2\2\u00e4\u00e5\7D\2\2\u00e5\u00e6\7G\2\2"+
		"\u00e6\u00e7\7V\2\2\u00e7\u00e8\7Y\2\2\u00e8\u00e9\7G\2\2\u00e9\u00ea"+
		"\7G\2\2\u00ea\u00ec\7P\2\2\u00eb\u00dd\3\2\2\2\u00eb\u00e4\3\2\2\2\u00ec"+
		"\36\3\2\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7i\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1\u00f2\7z\2\2\u00f2\u00fa\7r\2\2\u00f3\u00f4\7T\2\2"+
		"\u00f4\u00f5\7G\2\2\u00f5\u00f6\7I\2\2\u00f6\u00f7\7G\2\2\u00f7\u00f8"+
		"\7Z\2\2\u00f8\u00fa\7R\2\2\u00f9\u00ed\3\2\2\2\u00f9\u00f3\3\2\2\2\u00fa"+
		" \3\2\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7o\2\2\u00fe"+
		"\u00ff\7k\2\2\u00ff\u0106\7v\2\2\u0100\u0101\7N\2\2\u0101\u0102\7K\2\2"+
		"\u0102\u0103\7O\2\2\u0103\u0104\7K\2\2\u0104\u0106\7V\2\2\u0105\u00fb"+
		"\3\2\2\2\u0105\u0100\3\2\2\2\u0106\"\3\2\2\2\u0107\u0108\7\u0080\2\2\u0108"+
		"$\3\2\2\2\u0109\u010a\7~\2\2\u010a&\3\2\2\2\u010b\u010c\7_\2\2\u010c("+
		"\3\2\2\2\u010d\u010e\7]\2\2\u010e*\3\2\2\2\u010f\u0110\7<\2\2\u0110,\3"+
		"\2\2\2\u0111\u0112\7,\2\2\u0112.\3\2\2\2\u0113\u0114\7?\2\2\u0114\60\3"+
		"\2\2\2\u0115\u0116\7>\2\2\u0116\62\3\2\2\2\u0117\u0118\7@\2\2\u0118\64"+
		"\3\2\2\2\u0119\u011a\7#\2\2\u011a\u011b\7?\2\2\u011b\66\3\2\2\2\u011c"+
		"\u011d\7p\2\2\u011d\u011e\7q\2\2\u011e\u011f\7v\2\2\u011f8\3\2\2\2\u0120"+
		"\u0121\7>\2\2\u0121\u0122\7?\2\2\u0122:\3\2\2\2\u0123\u0124\7@\2\2\u0124"+
		"\u0125\7?\2\2\u0125<\3\2\2\2\u0126\u0127\7=\2\2\u0127>\3\2\2\2\u0128\u0129"+
		"\7q\2\2\u0129\u012a\7t\2\2\u012a\u012b\7f\2\2\u012b\u012c\7g\2\2\u012c"+
		"\u012d\7t\2\2\u012d@\3\2\2\2\u012e\u012f\7i\2\2\u012f\u0130\7t\2\2\u0130"+
		"\u0131\7q\2\2\u0131\u0132\7w\2\2\u0132\u0133\7r\2\2\u0133B\3\2\2\2\u0134"+
		"\u0135\7d\2\2\u0135\u0136\7{\2\2\u0136D\3\2\2\2\u0137\u0139\t\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013bF\3\2\2\2\u013c\u013e\4\62;\2\u013d\u013c\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140H\3\2\2\2\u0141"+
		"\u0143\7\17\2\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3"+
		"\2\2\2\u0144\u0145\7\f\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b%\2\2\u0147"+
		"J\3\2\2\2\u0148\u014a\t\3\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e"+
		"\b&\2\2\u014eL\3\2\2\2\u014f\u0150\7+\2\2\u0150N\3\2\2\2\u0151\u0152\7"+
		"*\2\2\u0152P\3\2\2\2\u0153\u0154\7k\2\2\u0154\u0155\7p\2\2\u0155\u0156"+
		"\7f\2\2\u0156\u0157\7g\2\2\u0157\u0158\7z\2\2\u0158R\3\2\2\2\u0159\u015a"+
		"\7m\2\2\u015a\u015b\7g\2\2\u015b\u015c\7{\2\2\u015cT\3\2\2\2\u015d\u015e"+
		"\7.\2\2\u015eV\3\2\2\2\u015f\u0160\7\60\2\2\u0160X\3\2\2\2\u0161\u0162"+
		"\7r\2\2\u0162\u0163\7c\2\2\u0163\u0164\7t\2\2\u0164\u0165\7v\2\2\u0165"+
		"\u0166\7k\2\2\u0166\u0167\7v\2\2\u0167\u0168\7k\2\2\u0168\u0169\7q\2\2"+
		"\u0169\u016a\7p\2\2\u016aZ\3\2\2\2\27\2gq}\u0087\u008f\u0095\u009f\u00a9"+
		"\u00af\u00bd\u00c5\u00cf\u00db\u00eb\u00f9\u0105\u013a\u013f\u0142\u014b"+
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