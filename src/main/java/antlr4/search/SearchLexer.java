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
		BY=27, ASC=28, DESC=29, ID=30, INT=31, NEWLINE=32, WS=33, RPAREN=34, LPAREN=35, 
		INDEX=36, KEY=37, COMMA=38, DOT=39, PARTITION=40, NEGATION=41, VERTBAR=42, 
		TRUE=43, FALSE=44, ANY_STRING_CHAR=45, QUOTES=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "AND", "OR", "IS", "NOT", "NULL", "LIKE", "IN", 
		"EXISTS", "ALL", "BETWEEN", "REGEXP", "LIMIT", "COLON", "ALL_FIELDS", 
		"EQ", "LTH", "GTH", "NOT_EQ", "LET", "GET", "SEMI", "ORDER", "GROUP", 
		"BY", "ASC", "DESC", "ID", "INT", "NEWLINE", "WS", "RPAREN", "LPAREN", 
		"INDEX", "KEY", "COMMA", "DOT", "PARTITION", "NEGATION", "VERTBAR", "TRUE", 
		"FALSE", "ANY_STRING_CHAR", "QUOTES"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "':'", "'*'", "'='", "'<'", "'>'", "'!='", "'<='", 
		"'>='", "';'", null, null, null, null, null, null, null, null, null, "')'", 
		"'('", "'index'", "'key'", "','", "'.'", "'partition'", "'~'", "'|'", 
		null, null, null, "'''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "IS", "NOT", "NULL", "LIKE", 
		"IN", "EXISTS", "ALL", "BETWEEN", "REGEXP", "LIMIT", "COLON", "ALL_FIELDS", 
		"EQ", "LTH", "GTH", "NOT_EQ", "LET", "GET", "SEMI", "ORDER", "GROUP", 
		"BY", "ASC", "DESC", "ID", "INT", "NEWLINE", "WS", "RPAREN", "LPAREN", 
		"INDEX", "KEY", "COMMA", "DOT", "PARTITION", "NEGATION", "VERTBAR", "TRUE", 
		"FALSE", "ANY_STRING_CHAR", "QUOTES"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u0194\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2l\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3v\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u008c\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0094\n\6\3\7\3\7\3\7\3\7\5"+
		"\7\u009a\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a2\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00ac\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b6\n"+
		"\n\3\13\3\13\3\13\3\13\5\13\u00bc\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00ca\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d2\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00e2\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00f0\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00fc\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u011d\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0129\n\33\3\34\3\34\3\34\3\34\5\34\u012f"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0137\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0141\n\36\3\37\6\37\u0144\n\37\r\37\16\37\u0145"+
		"\3 \6 \u0149\n \r \16 \u014a\3!\5!\u014e\n!\3!\3!\3!\3!\3\"\6\"\u0155"+
		"\n\"\r\"\16\"\u0156\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3"+
		",\3,\3,\3,\5,\u0183\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u018f\n-\3.\3"+
		".\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\6\7\2//C\\aa"+
		"c|\u4e02\u9fa7\3\2\62;\5\2\13\f\17\17\"\"\3\2\"\"\u01af\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3k\3\2\2\2\5u\3\2\2\2\7\u0081"+
		"\3\2\2\2\t\u008b\3\2\2\2\13\u0093\3\2\2\2\r\u0099\3\2\2\2\17\u00a1\3\2"+
		"\2\2\21\u00ab\3\2\2\2\23\u00b5\3\2\2\2\25\u00bb\3\2\2\2\27\u00c9\3\2\2"+
		"\2\31\u00d1\3\2\2\2\33\u00e1\3\2\2\2\35\u00ef\3\2\2\2\37\u00fb\3\2\2\2"+
		"!\u00fd\3\2\2\2#\u00ff\3\2\2\2%\u0101\3\2\2\2\'\u0103\3\2\2\2)\u0105\3"+
		"\2\2\2+\u0107\3\2\2\2-\u010a\3\2\2\2/\u010d\3\2\2\2\61\u0110\3\2\2\2\63"+
		"\u011c\3\2\2\2\65\u0128\3\2\2\2\67\u012e\3\2\2\29\u0136\3\2\2\2;\u0140"+
		"\3\2\2\2=\u0143\3\2\2\2?\u0148\3\2\2\2A\u014d\3\2\2\2C\u0154\3\2\2\2E"+
		"\u015a\3\2\2\2G\u015c\3\2\2\2I\u015e\3\2\2\2K\u0164\3\2\2\2M\u0168\3\2"+
		"\2\2O\u016a\3\2\2\2Q\u016c\3\2\2\2S\u0176\3\2\2\2U\u0178\3\2\2\2W\u0182"+
		"\3\2\2\2Y\u018e\3\2\2\2[\u0190\3\2\2\2]\u0192\3\2\2\2_`\7u\2\2`a\7g\2"+
		"\2ab\7n\2\2bc\7g\2\2cd\7e\2\2dl\7v\2\2ef\7U\2\2fg\7G\2\2gh\7N\2\2hi\7"+
		"G\2\2ij\7E\2\2jl\7V\2\2k_\3\2\2\2ke\3\2\2\2l\4\3\2\2\2mn\7h\2\2no\7t\2"+
		"\2op\7q\2\2pv\7o\2\2qr\7H\2\2rs\7T\2\2st\7Q\2\2tv\7O\2\2um\3\2\2\2uq\3"+
		"\2\2\2v\6\3\2\2\2wx\7y\2\2xy\7j\2\2yz\7g\2\2z{\7t\2\2{\u0082\7g\2\2|}"+
		"\7Y\2\2}~\7J\2\2~\177\7G\2\2\177\u0080\7T\2\2\u0080\u0082\7G\2\2\u0081"+
		"w\3\2\2\2\u0081|\3\2\2\2\u0082\b\3\2\2\2\u0083\u0084\7c\2\2\u0084\u0085"+
		"\7p\2\2\u0085\u008c\7f\2\2\u0086\u0087\7(\2\2\u0087\u008c\7(\2\2\u0088"+
		"\u0089\7C\2\2\u0089\u008a\7P\2\2\u008a\u008c\7F\2\2\u008b\u0083\3\2\2"+
		"\2\u008b\u0086\3\2\2\2\u008b\u0088\3\2\2\2\u008c\n\3\2\2\2\u008d\u008e"+
		"\7q\2\2\u008e\u0094\7t\2\2\u008f\u0090\7~\2\2\u0090\u0094\7~\2\2\u0091"+
		"\u0092\7Q\2\2\u0092\u0094\7T\2\2\u0093\u008d\3\2\2\2\u0093\u008f\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0094\f\3\2\2\2\u0095\u0096\7k\2\2\u0096\u009a"+
		"\7u\2\2\u0097\u0098\7K\2\2\u0098\u009a\7U\2\2\u0099\u0095\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\16\3\2\2\2\u009b\u009c\7p\2\2\u009c\u009d\7q\2\2"+
		"\u009d\u00a2\7v\2\2\u009e\u009f\7P\2\2\u009f\u00a0\7Q\2\2\u00a0\u00a2"+
		"\7V\2\2\u00a1\u009b\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\20\3\2\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7n\2\2\u00a6\u00ac\7n\2\2"+
		"\u00a7\u00a8\7P\2\2\u00a8\u00a9\7W\2\2\u00a9\u00aa\7N\2\2\u00aa\u00ac"+
		"\7N\2\2\u00ab\u00a3\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\22\3\2\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7m\2\2\u00b0\u00b6\7g\2\2"+
		"\u00b1\u00b2\7N\2\2\u00b2\u00b3\7K\2\2\u00b3\u00b4\7M\2\2\u00b4\u00b6"+
		"\7G\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\24\3\2\2\2\u00b7"+
		"\u00b8\7k\2\2\u00b8\u00bc\7p\2\2\u00b9\u00ba\7K\2\2\u00ba\u00bc\7P\2\2"+
		"\u00bb\u00b7\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\26\3\2\2\2\u00bd\u00be"+
		"\7g\2\2\u00be\u00bf\7z\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7u\2\2\u00c1"+
		"\u00c2\7v\2\2\u00c2\u00ca\7u\2\2\u00c3\u00c4\7G\2\2\u00c4\u00c5\7Z\2\2"+
		"\u00c5\u00c6\7K\2\2\u00c6\u00c7\7U\2\2\u00c7\u00c8\7V\2\2\u00c8\u00ca"+
		"\7U\2\2\u00c9\u00bd\3\2\2\2\u00c9\u00c3\3\2\2\2\u00ca\30\3\2\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc\u00cd\7n\2\2\u00cd\u00d2\7n\2\2\u00ce\u00cf\7C\2\2"+
		"\u00cf\u00d0\7N\2\2\u00d0\u00d2\7N\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00ce"+
		"\3\2\2\2\u00d2\32\3\2\2\2\u00d3\u00d4\7d\2\2\u00d4\u00d5\7g\2\2\u00d5"+
		"\u00d6\7v\2\2\u00d6\u00d7\7y\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7g\2\2"+
		"\u00d9\u00e2\7p\2\2\u00da\u00db\7D\2\2\u00db\u00dc\7G\2\2\u00dc\u00dd"+
		"\7V\2\2\u00dd\u00de\7Y\2\2\u00de\u00df\7G\2\2\u00df\u00e0\7G\2\2\u00e0"+
		"\u00e2\7P\2\2\u00e1\u00d3\3\2\2\2\u00e1\u00da\3\2\2\2\u00e2\34\3\2\2\2"+
		"\u00e3\u00e4\7t\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7i\2\2\u00e6\u00e7"+
		"\7g\2\2\u00e7\u00e8\7z\2\2\u00e8\u00f0\7r\2\2\u00e9\u00ea\7T\2\2\u00ea"+
		"\u00eb\7G\2\2\u00eb\u00ec\7I\2\2\u00ec\u00ed\7G\2\2\u00ed\u00ee\7Z\2\2"+
		"\u00ee\u00f0\7R\2\2\u00ef\u00e3\3\2\2\2\u00ef\u00e9\3\2\2\2\u00f0\36\3"+
		"\2\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7o\2\2\u00f4"+
		"\u00f5\7k\2\2\u00f5\u00fc\7v\2\2\u00f6\u00f7\7N\2\2\u00f7\u00f8\7K\2\2"+
		"\u00f8\u00f9\7O\2\2\u00f9\u00fa\7K\2\2\u00fa\u00fc\7V\2\2\u00fb\u00f1"+
		"\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fc \3\2\2\2\u00fd\u00fe\7<\2\2\u00fe\""+
		"\3\2\2\2\u00ff\u0100\7,\2\2\u0100$\3\2\2\2\u0101\u0102\7?\2\2\u0102&\3"+
		"\2\2\2\u0103\u0104\7>\2\2\u0104(\3\2\2\2\u0105\u0106\7@\2\2\u0106*\3\2"+
		"\2\2\u0107\u0108\7#\2\2\u0108\u0109\7?\2\2\u0109,\3\2\2\2\u010a\u010b"+
		"\7>\2\2\u010b\u010c\7?\2\2\u010c.\3\2\2\2\u010d\u010e\7@\2\2\u010e\u010f"+
		"\7?\2\2\u010f\60\3\2\2\2\u0110\u0111\7=\2\2\u0111\62\3\2\2\2\u0112\u0113"+
		"\7q\2\2\u0113\u0114\7t\2\2\u0114\u0115\7f\2\2\u0115\u0116\7g\2\2\u0116"+
		"\u011d\7t\2\2\u0117\u0118\7Q\2\2\u0118\u0119\7T\2\2\u0119\u011a\7F\2\2"+
		"\u011a\u011b\7G\2\2\u011b\u011d\7T\2\2\u011c\u0112\3\2\2\2\u011c\u0117"+
		"\3\2\2\2\u011d\64\3\2\2\2\u011e\u011f\7i\2\2\u011f\u0120\7t\2\2\u0120"+
		"\u0121\7q\2\2\u0121\u0122\7w\2\2\u0122\u0129\7r\2\2\u0123\u0124\7I\2\2"+
		"\u0124\u0125\7T\2\2\u0125\u0126\7Q\2\2\u0126\u0127\7W\2\2\u0127\u0129"+
		"\7R\2\2\u0128\u011e\3\2\2\2\u0128\u0123\3\2\2\2\u0129\66\3\2\2\2\u012a"+
		"\u012b\7d\2\2\u012b\u012f\7{\2\2\u012c\u012d\7D\2\2\u012d\u012f\7[\2\2"+
		"\u012e\u012a\3\2\2\2\u012e\u012c\3\2\2\2\u012f8\3\2\2\2\u0130\u0131\7"+
		"c\2\2\u0131\u0132\7u\2\2\u0132\u0137\7e\2\2\u0133\u0134\7C\2\2\u0134\u0135"+
		"\7U\2\2\u0135\u0137\7E\2\2\u0136\u0130\3\2\2\2\u0136\u0133\3\2\2\2\u0137"+
		":\3\2\2\2\u0138\u0139\7f\2\2\u0139\u013a\7g\2\2\u013a\u013b\7u\2\2\u013b"+
		"\u0141\7e\2\2\u013c\u013d\7F\2\2\u013d\u013e\7G\2\2\u013e\u013f\7U\2\2"+
		"\u013f\u0141\7E\2\2\u0140\u0138\3\2\2\2\u0140\u013c\3\2\2\2\u0141<\3\2"+
		"\2\2\u0142\u0144\t\2\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146>\3\2\2\2\u0147\u0149\t\3\2\2"+
		"\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b@\3\2\2\2\u014c\u014e\7\17\2\2\u014d\u014c\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7\f\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0152\b!\2\2\u0152B\3\2\2\2\u0153\u0155\t\4\2\2\u0154\u0153"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0159\b\"\2\2\u0159D\3\2\2\2\u015a\u015b\7+\2\2\u015b"+
		"F\3\2\2\2\u015c\u015d\7*\2\2\u015dH\3\2\2\2\u015e\u015f\7k\2\2\u015f\u0160"+
		"\7p\2\2\u0160\u0161\7f\2\2\u0161\u0162\7g\2\2\u0162\u0163\7z\2\2\u0163"+
		"J\3\2\2\2\u0164\u0165\7m\2\2\u0165\u0166\7g\2\2\u0166\u0167\7{\2\2\u0167"+
		"L\3\2\2\2\u0168\u0169\7.\2\2\u0169N\3\2\2\2\u016a\u016b\7\60\2\2\u016b"+
		"P\3\2\2\2\u016c\u016d\7r\2\2\u016d\u016e\7c\2\2\u016e\u016f\7t\2\2\u016f"+
		"\u0170\7v\2\2\u0170\u0171\7k\2\2\u0171\u0172\7v\2\2\u0172\u0173\7k\2\2"+
		"\u0173\u0174\7q\2\2\u0174\u0175\7p\2\2\u0175R\3\2\2\2\u0176\u0177\7\u0080"+
		"\2\2\u0177T\3\2\2\2\u0178\u0179\7~\2\2\u0179V\3\2\2\2\u017a\u017b\7v\2"+
		"\2\u017b\u017c\7t\2\2\u017c\u017d\7w\2\2\u017d\u0183\7g\2\2\u017e\u017f"+
		"\7V\2\2\u017f\u0180\7T\2\2\u0180\u0181\7W\2\2\u0181\u0183\7G\2\2\u0182"+
		"\u017a\3\2\2\2\u0182\u017e\3\2\2\2\u0183X\3\2\2\2\u0184\u0185\7h\2\2\u0185"+
		"\u0186\7c\2\2\u0186\u0187\7n\2\2\u0187\u0188\7u\2\2\u0188\u018f\7g\2\2"+
		"\u0189\u018a\7H\2\2\u018a\u018b\7C\2\2\u018b\u018c\7N\2\2\u018c\u018d"+
		"\7U\2\2\u018d\u018f\7G\2\2\u018e\u0184\3\2\2\2\u018e\u0189\3\2\2\2\u018f"+
		"Z\3\2\2\2\u0190\u0191\n\5\2\2\u0191\\\3\2\2\2\u0192\u0193\7)\2\2\u0193"+
		"^\3\2\2\2\35\2ku\u0081\u008b\u0093\u0099\u00a1\u00ab\u00b5\u00bb\u00c9"+
		"\u00d1\u00e1\u00ef\u00fb\u011c\u0128\u012e\u0136\u0140\u0145\u014a\u014d"+
		"\u0156\u0182\u018e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}