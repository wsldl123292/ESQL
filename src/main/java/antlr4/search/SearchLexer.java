// Generated from F:/GitHub/ESQL/src/main/java/antlr4/search\SearchLexer.g4 by ANTLR 4.5.3
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
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, IS=6, NOT=7, NULL=8, LIKE=9, IN=10, 
		EXISTS=11, ALL=12, BETWEEN=13, REGEXP=14, LIMIT=15, COLON=16, ALL_FIELDS=17, 
		EQ=18, LTH=19, GTH=20, NOT_EQ=21, LET=22, GET=23, SEMI=24, ORDER=25, GROUP=26, 
		BY=27, ID=28, INT=29, NEWLINE=30, WS=31, RPAREN=32, LPAREN=33, INDEX=34, 
		KEY=35, COMMA=36, QUOTE=37, DOT=38, PARTITION=39, NEGATION=40, VERTBAR=41, 
		TRUE=42, FALSE=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "AND", "OR", "IS", "NOT", "NULL", "LIKE", "IN", 
		"EXISTS", "ALL", "BETWEEN", "REGEXP", "LIMIT", "COLON", "ALL_FIELDS", 
		"EQ", "LTH", "GTH", "NOT_EQ", "LET", "GET", "SEMI", "ORDER", "GROUP", 
		"BY", "ID", "INT", "NEWLINE", "WS", "RPAREN", "LPAREN", "INDEX", "KEY", 
		"COMMA", "QUOTE", "DOT", "PARTITION", "NEGATION", "VERTBAR", "TRUE", "FALSE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "':'", "'*'", "'='", "'<'", "'>'", "'!='", "'<='", 
		"'>='", "';'", null, null, null, null, null, null, null, "')'", "'('", 
		"'index'", "'key'", "','", "'''", "'.'", "'partition'", "'~'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "IS", "NOT", "NULL", "LIKE", 
		"IN", "EXISTS", "ALL", "BETWEEN", "REGEXP", "LIMIT", "COLON", "ALL_FIELDS", 
		"EQ", "LTH", "GTH", "NOT_EQ", "LET", "GET", "SEMI", "ORDER", "GROUP", 
		"BY", "ID", "INT", "NEWLINE", "WS", "RPAREN", "LPAREN", "INDEX", "KEY", 
		"COMMA", "QUOTE", "DOT", "PARTITION", "NEGATION", "VERTBAR", "TRUE", "FALSE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u017a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2f\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3p\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4|\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0086\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u008e\n\6\3\7\3\7\3\7\3\7\5\7\u0094\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u009c\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a6\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b0\n\n\3\13\3\13\3\13\3\13\5"+
		"\13\u00b6\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c4"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00cc\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00dc\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ea\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f6\n\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0117\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0123\n\33\3\34\3\34\3\34\3\34\5\34\u0129\n\34\3\35\6\35\u012c\n"+
		"\35\r\35\16\35\u012d\3\36\6\36\u0131\n\36\r\36\16\36\u0132\3\37\5\37\u0136"+
		"\n\37\3\37\3\37\3\37\3\37\3 \6 \u013d\n \r \16 \u013e\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u016d\n+\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0179\n,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-\3\2\5\7\2//C\\aac|\u4e02\u9fa7\3\2\62;\5\2\13\f\17\17\"\"\u0193\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\3e\3\2\2\2\5o\3\2\2\2\7{\3\2\2\2\t\u0085\3\2\2\2\13"+
		"\u008d\3\2\2\2\r\u0093\3\2\2\2\17\u009b\3\2\2\2\21\u00a5\3\2\2\2\23\u00af"+
		"\3\2\2\2\25\u00b5\3\2\2\2\27\u00c3\3\2\2\2\31\u00cb\3\2\2\2\33\u00db\3"+
		"\2\2\2\35\u00e9\3\2\2\2\37\u00f5\3\2\2\2!\u00f7\3\2\2\2#\u00f9\3\2\2\2"+
		"%\u00fb\3\2\2\2\'\u00fd\3\2\2\2)\u00ff\3\2\2\2+\u0101\3\2\2\2-\u0104\3"+
		"\2\2\2/\u0107\3\2\2\2\61\u010a\3\2\2\2\63\u0116\3\2\2\2\65\u0122\3\2\2"+
		"\2\67\u0128\3\2\2\29\u012b\3\2\2\2;\u0130\3\2\2\2=\u0135\3\2\2\2?\u013c"+
		"\3\2\2\2A\u0142\3\2\2\2C\u0144\3\2\2\2E\u0146\3\2\2\2G\u014c\3\2\2\2I"+
		"\u0150\3\2\2\2K\u0152\3\2\2\2M\u0154\3\2\2\2O\u0156\3\2\2\2Q\u0160\3\2"+
		"\2\2S\u0162\3\2\2\2U\u016c\3\2\2\2W\u0178\3\2\2\2YZ\7u\2\2Z[\7g\2\2[\\"+
		"\7n\2\2\\]\7g\2\2]^\7e\2\2^f\7v\2\2_`\7U\2\2`a\7G\2\2ab\7N\2\2bc\7G\2"+
		"\2cd\7E\2\2df\7V\2\2eY\3\2\2\2e_\3\2\2\2f\4\3\2\2\2gh\7h\2\2hi\7t\2\2"+
		"ij\7q\2\2jp\7o\2\2kl\7H\2\2lm\7T\2\2mn\7Q\2\2np\7O\2\2og\3\2\2\2ok\3\2"+
		"\2\2p\6\3\2\2\2qr\7y\2\2rs\7j\2\2st\7g\2\2tu\7t\2\2u|\7g\2\2vw\7Y\2\2"+
		"wx\7J\2\2xy\7G\2\2yz\7T\2\2z|\7G\2\2{q\3\2\2\2{v\3\2\2\2|\b\3\2\2\2}~"+
		"\7c\2\2~\177\7p\2\2\177\u0086\7f\2\2\u0080\u0081\7(\2\2\u0081\u0086\7"+
		"(\2\2\u0082\u0083\7C\2\2\u0083\u0084\7P\2\2\u0084\u0086\7F\2\2\u0085}"+
		"\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0082\3\2\2\2\u0086\n\3\2\2\2\u0087"+
		"\u0088\7q\2\2\u0088\u008e\7t\2\2\u0089\u008a\7~\2\2\u008a\u008e\7~\2\2"+
		"\u008b\u008c\7Q\2\2\u008c\u008e\7T\2\2\u008d\u0087\3\2\2\2\u008d\u0089"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008e\f\3\2\2\2\u008f\u0090\7k\2\2\u0090"+
		"\u0094\7u\2\2\u0091\u0092\7K\2\2\u0092\u0094\7U\2\2\u0093\u008f\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0094\16\3\2\2\2\u0095\u0096\7p\2\2\u0096\u0097"+
		"\7q\2\2\u0097\u009c\7v\2\2\u0098\u0099\7P\2\2\u0099\u009a\7Q\2\2\u009a"+
		"\u009c\7V\2\2\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c\20\3\2\2\2"+
		"\u009d\u009e\7p\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7n\2\2\u00a0\u00a6"+
		"\7n\2\2\u00a1\u00a2\7P\2\2\u00a2\u00a3\7W\2\2\u00a3\u00a4\7N\2\2\u00a4"+
		"\u00a6\7N\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\22\3\2\2\2"+
		"\u00a7\u00a8\7n\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7m\2\2\u00aa\u00b0"+
		"\7g\2\2\u00ab\u00ac\7N\2\2\u00ac\u00ad\7K\2\2\u00ad\u00ae\7M\2\2\u00ae"+
		"\u00b0\7G\2\2\u00af\u00a7\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\24\3\2\2\2"+
		"\u00b1\u00b2\7k\2\2\u00b2\u00b6\7p\2\2\u00b3\u00b4\7K\2\2\u00b4\u00b6"+
		"\7P\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\26\3\2\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8\u00b9\7z\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7u\2\2"+
		"\u00bb\u00bc\7v\2\2\u00bc\u00c4\7u\2\2\u00bd\u00be\7G\2\2\u00be\u00bf"+
		"\7Z\2\2\u00bf\u00c0\7K\2\2\u00c0\u00c1\7U\2\2\u00c1\u00c2\7V\2\2\u00c2"+
		"\u00c4\7U\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c4\30\3\2\2\2"+
		"\u00c5\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7\u00cc\7n\2\2\u00c8\u00c9"+
		"\7C\2\2\u00c9\u00ca\7N\2\2\u00ca\u00cc\7N\2\2\u00cb\u00c5\3\2\2\2\u00cb"+
		"\u00c8\3\2\2\2\u00cc\32\3\2\2\2\u00cd\u00ce\7d\2\2\u00ce\u00cf\7g\2\2"+
		"\u00cf\u00d0\7v\2\2\u00d0\u00d1\7y\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3"+
		"\7g\2\2\u00d3\u00dc\7p\2\2\u00d4\u00d5\7D\2\2\u00d5\u00d6\7G\2\2\u00d6"+
		"\u00d7\7V\2\2\u00d7\u00d8\7Y\2\2\u00d8\u00d9\7G\2\2\u00d9\u00da\7G\2\2"+
		"\u00da\u00dc\7P\2\2\u00db\u00cd\3\2\2\2\u00db\u00d4\3\2\2\2\u00dc\34\3"+
		"\2\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7i\2\2\u00e0"+
		"\u00e1\7g\2\2\u00e1\u00e2\7z\2\2\u00e2\u00ea\7r\2\2\u00e3\u00e4\7T\2\2"+
		"\u00e4\u00e5\7G\2\2\u00e5\u00e6\7I\2\2\u00e6\u00e7\7G\2\2\u00e7\u00e8"+
		"\7Z\2\2\u00e8\u00ea\7R\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00e3\3\2\2\2\u00ea"+
		"\36\3\2\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7o\2\2\u00ee"+
		"\u00ef\7k\2\2\u00ef\u00f6\7v\2\2\u00f0\u00f1\7N\2\2\u00f1\u00f2\7K\2\2"+
		"\u00f2\u00f3\7O\2\2\u00f3\u00f4\7K\2\2\u00f4\u00f6\7V\2\2\u00f5\u00eb"+
		"\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6 \3\2\2\2\u00f7\u00f8\7<\2\2\u00f8\""+
		"\3\2\2\2\u00f9\u00fa\7,\2\2\u00fa$\3\2\2\2\u00fb\u00fc\7?\2\2\u00fc&\3"+
		"\2\2\2\u00fd\u00fe\7>\2\2\u00fe(\3\2\2\2\u00ff\u0100\7@\2\2\u0100*\3\2"+
		"\2\2\u0101\u0102\7#\2\2\u0102\u0103\7?\2\2\u0103,\3\2\2\2\u0104\u0105"+
		"\7>\2\2\u0105\u0106\7?\2\2\u0106.\3\2\2\2\u0107\u0108\7@\2\2\u0108\u0109"+
		"\7?\2\2\u0109\60\3\2\2\2\u010a\u010b\7=\2\2\u010b\62\3\2\2\2\u010c\u010d"+
		"\7q\2\2\u010d\u010e\7t\2\2\u010e\u010f\7f\2\2\u010f\u0110\7g\2\2\u0110"+
		"\u0117\7t\2\2\u0111\u0112\7Q\2\2\u0112\u0113\7T\2\2\u0113\u0114\7F\2\2"+
		"\u0114\u0115\7G\2\2\u0115\u0117\7T\2\2\u0116\u010c\3\2\2\2\u0116\u0111"+
		"\3\2\2\2\u0117\64\3\2\2\2\u0118\u0119\7i\2\2\u0119\u011a\7t\2\2\u011a"+
		"\u011b\7q\2\2\u011b\u011c\7w\2\2\u011c\u0123\7r\2\2\u011d\u011e\7I\2\2"+
		"\u011e\u011f\7T\2\2\u011f\u0120\7Q\2\2\u0120\u0121\7W\2\2\u0121\u0123"+
		"\7R\2\2\u0122\u0118\3\2\2\2\u0122\u011d\3\2\2\2\u0123\66\3\2\2\2\u0124"+
		"\u0125\7d\2\2\u0125\u0129\7{\2\2\u0126\u0127\7D\2\2\u0127\u0129\7[\2\2"+
		"\u0128\u0124\3\2\2\2\u0128\u0126\3\2\2\2\u01298\3\2\2\2\u012a\u012c\t"+
		"\2\2\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e:\3\2\2\2\u012f\u0131\t\3\2\2\u0130\u012f\3\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133<\3"+
		"\2\2\2\u0134\u0136\7\17\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\7\f\2\2\u0138\u0139\3\2\2\2\u0139\u013a\b\37"+
		"\2\2\u013a>\3\2\2\2\u013b\u013d\t\4\2\2\u013c\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\b \2\2\u0141@\3\2\2\2\u0142\u0143\7+\2\2\u0143B\3\2\2\2\u0144\u0145"+
		"\7*\2\2\u0145D\3\2\2\2\u0146\u0147\7k\2\2\u0147\u0148\7p\2\2\u0148\u0149"+
		"\7f\2\2\u0149\u014a\7g\2\2\u014a\u014b\7z\2\2\u014bF\3\2\2\2\u014c\u014d"+
		"\7m\2\2\u014d\u014e\7g\2\2\u014e\u014f\7{\2\2\u014fH\3\2\2\2\u0150\u0151"+
		"\7.\2\2\u0151J\3\2\2\2\u0152\u0153\7)\2\2\u0153L\3\2\2\2\u0154\u0155\7"+
		"\60\2\2\u0155N\3\2\2\2\u0156\u0157\7r\2\2\u0157\u0158\7c\2\2\u0158\u0159"+
		"\7t\2\2\u0159\u015a\7v\2\2\u015a\u015b\7k\2\2\u015b\u015c\7v\2\2\u015c"+
		"\u015d\7k\2\2\u015d\u015e\7q\2\2\u015e\u015f\7p\2\2\u015fP\3\2\2\2\u0160"+
		"\u0161\7\u0080\2\2\u0161R\3\2\2\2\u0162\u0163\7~\2\2\u0163T\3\2\2\2\u0164"+
		"\u0165\7v\2\2\u0165\u0166\7t\2\2\u0166\u0167\7w\2\2\u0167\u016d\7g\2\2"+
		"\u0168\u0169\7V\2\2\u0169\u016a\7T\2\2\u016a\u016b\7W\2\2\u016b\u016d"+
		"\7G\2\2\u016c\u0164\3\2\2\2\u016c\u0168\3\2\2\2\u016dV\3\2\2\2\u016e\u016f"+
		"\7h\2\2\u016f\u0170\7c\2\2\u0170\u0171\7n\2\2\u0171\u0172\7u\2\2\u0172"+
		"\u0179\7g\2\2\u0173\u0174\7H\2\2\u0174\u0175\7C\2\2\u0175\u0176\7N\2\2"+
		"\u0176\u0177\7U\2\2\u0177\u0179\7G\2\2\u0178\u016e\3\2\2\2\u0178\u0173"+
		"\3\2\2\2\u0179X\3\2\2\2\33\2eo{\u0085\u008d\u0093\u009b\u00a5\u00af\u00b5"+
		"\u00c3\u00cb\u00db\u00e9\u00f5\u0116\u0122\u0128\u012d\u0132\u0135\u013e"+
		"\u016c\u0178\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}