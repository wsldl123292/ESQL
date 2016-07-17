// Generated from /Users/ldl/Documents/develop/project/github/ESQL/src/main/java/test/LibExpr.g4 by ANTLR 4.5.3
package test;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LibExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, IS=6, NOT=7, NULL=8, LIKE=9, IN=10, 
		EXISTS=11, ALL=12, BETWEEN=13, REGEXP=14, LIMIT=15, COLON=16, ALL_FIELDS=17, 
		EQ=18, LTH=19, GTH=20, NOT_EQ=21, LET=22, GET=23, SEMI=24, ORDER=25, GROUP=26, 
		BY=27, ASC=28, DESC=29, QUOTES=30, ID=31, INT=32, NEWLINE=33, WS=34, RPAREN=35, 
		LPAREN=36, INDEX=37, KEY=38, COMMA=39, DOT=40, PARTITION=41, NEGATION=42, 
		VERTBAR=43, TRUE=44, FALSE=45, ANY_STRING_CHAR=46, ErrorCharacter=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "AND", "OR", "IS", "NOT", "NULL", "LIKE", "IN", 
		"EXISTS", "ALL", "BETWEEN", "REGEXP", "LIMIT", "COLON", "ALL_FIELDS", 
		"EQ", "LTH", "GTH", "NOT_EQ", "LET", "GET", "SEMI", "ORDER", "GROUP", 
		"BY", "ASC", "DESC", "QUOTES", "ID", "INT", "NEWLINE", "WS", "RPAREN", 
		"LPAREN", "INDEX", "KEY", "COMMA", "DOT", "PARTITION", "NEGATION", "VERTBAR", 
		"TRUE", "FALSE", "ANY_STRING_CHAR", "ErrorCharacter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "':'", "'*'", "'='", "'<'", "'>'", "'!='", "'<='", 
		"'>='", "';'", null, null, null, null, null, "'''", null, null, null, 
		null, "')'", "'('", "'index'", "'key'", "','", "'.'", "'partition'", "'~'", 
		"'|'", null, null, null, "''''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "IS", "NOT", "NULL", "LIKE", 
		"IN", "EXISTS", "ALL", "BETWEEN", "REGEXP", "LIMIT", "COLON", "ALL_FIELDS", 
		"EQ", "LTH", "GTH", "NOT_EQ", "LET", "GET", "SEMI", "ORDER", "GROUP", 
		"BY", "ASC", "DESC", "QUOTES", "ID", "INT", "NEWLINE", "WS", "RPAREN", 
		"LPAREN", "INDEX", "KEY", "COMMA", "DOT", "PARTITION", "NEGATION", "VERTBAR", 
		"TRUE", "FALSE", "ANY_STRING_CHAR", "ErrorCharacter"
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


	public LibExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LibExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0199\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2n\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3x\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0084\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u008e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0096\n\6\3\7\3\7"+
		"\3\7\3\7\5\7\u009c\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a4\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ae\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00b8\n\n\3\13\3\13\3\13\3\13\5\13\u00be\n\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cc\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d4"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00e4\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00f2\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00fe\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u011f\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u012b\n\33\3\34\3\34\3\34\3\34\5\34"+
		"\u0131\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0139\n\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\5\36\u0143\n\36\3\37\3\37\3 \6 \u0148\n "+
		"\r \16 \u0149\3!\6!\u014d\n!\r!\16!\u014e\3\"\5\"\u0152\n\"\3\"\3\"\3"+
		"\"\3\"\3#\6#\u0159\n#\r#\16#\u015a\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0187\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5"+
		".\u0193\n.\3/\3/\3\60\3\60\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61\3\2\6\7\2//C\\aac|\u4e02\u9fa7\3\2\62;\4\2\13\f\17\17\3\2\""+
		"\"\u01b4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\3m\3\2\2\2\5w\3\2\2\2\7\u0083\3\2\2\2\t\u008d\3\2\2\2\13\u0095\3"+
		"\2\2\2\r\u009b\3\2\2\2\17\u00a3\3\2\2\2\21\u00ad\3\2\2\2\23\u00b7\3\2"+
		"\2\2\25\u00bd\3\2\2\2\27\u00cb\3\2\2\2\31\u00d3\3\2\2\2\33\u00e3\3\2\2"+
		"\2\35\u00f1\3\2\2\2\37\u00fd\3\2\2\2!\u00ff\3\2\2\2#\u0101\3\2\2\2%\u0103"+
		"\3\2\2\2\'\u0105\3\2\2\2)\u0107\3\2\2\2+\u0109\3\2\2\2-\u010c\3\2\2\2"+
		"/\u010f\3\2\2\2\61\u0112\3\2\2\2\63\u011e\3\2\2\2\65\u012a\3\2\2\2\67"+
		"\u0130\3\2\2\29\u0138\3\2\2\2;\u0142\3\2\2\2=\u0144\3\2\2\2?\u0147\3\2"+
		"\2\2A\u014c\3\2\2\2C\u0151\3\2\2\2E\u0158\3\2\2\2G\u015e\3\2\2\2I\u0160"+
		"\3\2\2\2K\u0162\3\2\2\2M\u0168\3\2\2\2O\u016c\3\2\2\2Q\u016e\3\2\2\2S"+
		"\u0170\3\2\2\2U\u017a\3\2\2\2W\u017c\3\2\2\2Y\u0186\3\2\2\2[\u0192\3\2"+
		"\2\2]\u0194\3\2\2\2_\u0196\3\2\2\2ab\7u\2\2bc\7g\2\2cd\7n\2\2de\7g\2\2"+
		"ef\7e\2\2fn\7v\2\2gh\7U\2\2hi\7G\2\2ij\7N\2\2jk\7G\2\2kl\7E\2\2ln\7V\2"+
		"\2ma\3\2\2\2mg\3\2\2\2n\4\3\2\2\2op\7h\2\2pq\7t\2\2qr\7q\2\2rx\7o\2\2"+
		"st\7H\2\2tu\7T\2\2uv\7Q\2\2vx\7O\2\2wo\3\2\2\2ws\3\2\2\2x\6\3\2\2\2yz"+
		"\7y\2\2z{\7j\2\2{|\7g\2\2|}\7t\2\2}\u0084\7g\2\2~\177\7Y\2\2\177\u0080"+
		"\7J\2\2\u0080\u0081\7G\2\2\u0081\u0082\7T\2\2\u0082\u0084\7G\2\2\u0083"+
		"y\3\2\2\2\u0083~\3\2\2\2\u0084\b\3\2\2\2\u0085\u0086\7c\2\2\u0086\u0087"+
		"\7p\2\2\u0087\u008e\7f\2\2\u0088\u0089\7(\2\2\u0089\u008e\7(\2\2\u008a"+
		"\u008b\7C\2\2\u008b\u008c\7P\2\2\u008c\u008e\7F\2\2\u008d\u0085\3\2\2"+
		"\2\u008d\u0088\3\2\2\2\u008d\u008a\3\2\2\2\u008e\n\3\2\2\2\u008f\u0090"+
		"\7q\2\2\u0090\u0096\7t\2\2\u0091\u0092\7~\2\2\u0092\u0096\7~\2\2\u0093"+
		"\u0094\7Q\2\2\u0094\u0096\7T\2\2\u0095\u008f\3\2\2\2\u0095\u0091\3\2\2"+
		"\2\u0095\u0093\3\2\2\2\u0096\f\3\2\2\2\u0097\u0098\7k\2\2\u0098\u009c"+
		"\7u\2\2\u0099\u009a\7K\2\2\u009a\u009c\7U\2\2\u009b\u0097\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\16\3\2\2\2\u009d\u009e\7p\2\2\u009e\u009f\7q\2\2"+
		"\u009f\u00a4\7v\2\2\u00a0\u00a1\7P\2\2\u00a1\u00a2\7Q\2\2\u00a2\u00a4"+
		"\7V\2\2\u00a3\u009d\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\20\3\2\2\2\u00a5"+
		"\u00a6\7p\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7n\2\2\u00a8\u00ae\7n\2\2"+
		"\u00a9\u00aa\7P\2\2\u00aa\u00ab\7W\2\2\u00ab\u00ac\7N\2\2\u00ac\u00ae"+
		"\7N\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\22\3\2\2\2\u00af"+
		"\u00b0\7n\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7m\2\2\u00b2\u00b8\7g\2\2"+
		"\u00b3\u00b4\7N\2\2\u00b4\u00b5\7K\2\2\u00b5\u00b6\7M\2\2\u00b6\u00b8"+
		"\7G\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\24\3\2\2\2\u00b9"+
		"\u00ba\7k\2\2\u00ba\u00be\7p\2\2\u00bb\u00bc\7K\2\2\u00bc\u00be\7P\2\2"+
		"\u00bd\u00b9\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\26\3\2\2\2\u00bf\u00c0"+
		"\7g\2\2\u00c0\u00c1\7z\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7u\2\2\u00c3"+
		"\u00c4\7v\2\2\u00c4\u00cc\7u\2\2\u00c5\u00c6\7G\2\2\u00c6\u00c7\7Z\2\2"+
		"\u00c7\u00c8\7K\2\2\u00c8\u00c9\7U\2\2\u00c9\u00ca\7V\2\2\u00ca\u00cc"+
		"\7U\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cc\30\3\2\2\2\u00cd"+
		"\u00ce\7c\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d4\7n\2\2\u00d0\u00d1\7C\2\2"+
		"\u00d1\u00d2\7N\2\2\u00d2\u00d4\7N\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00d0"+
		"\3\2\2\2\u00d4\32\3\2\2\2\u00d5\u00d6\7d\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"\u00d8\7v\2\2\u00d8\u00d9\7y\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7g\2\2"+
		"\u00db\u00e4\7p\2\2\u00dc\u00dd\7D\2\2\u00dd\u00de\7G\2\2\u00de\u00df"+
		"\7V\2\2\u00df\u00e0\7Y\2\2\u00e0\u00e1\7G\2\2\u00e1\u00e2\7G\2\2\u00e2"+
		"\u00e4\7P\2\2\u00e3\u00d5\3\2\2\2\u00e3\u00dc\3\2\2\2\u00e4\34\3\2\2\2"+
		"\u00e5\u00e6\7t\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7i\2\2\u00e8\u00e9"+
		"\7g\2\2\u00e9\u00ea\7z\2\2\u00ea\u00f2\7r\2\2\u00eb\u00ec\7T\2\2\u00ec"+
		"\u00ed\7G\2\2\u00ed\u00ee\7I\2\2\u00ee\u00ef\7G\2\2\u00ef\u00f0\7Z\2\2"+
		"\u00f0\u00f2\7R\2\2\u00f1\u00e5\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f2\36\3"+
		"\2\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7o\2\2\u00f6"+
		"\u00f7\7k\2\2\u00f7\u00fe\7v\2\2\u00f8\u00f9\7N\2\2\u00f9\u00fa\7K\2\2"+
		"\u00fa\u00fb\7O\2\2\u00fb\u00fc\7K\2\2\u00fc\u00fe\7V\2\2\u00fd\u00f3"+
		"\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fe \3\2\2\2\u00ff\u0100\7<\2\2\u0100\""+
		"\3\2\2\2\u0101\u0102\7,\2\2\u0102$\3\2\2\2\u0103\u0104\7?\2\2\u0104&\3"+
		"\2\2\2\u0105\u0106\7>\2\2\u0106(\3\2\2\2\u0107\u0108\7@\2\2\u0108*\3\2"+
		"\2\2\u0109\u010a\7#\2\2\u010a\u010b\7?\2\2\u010b,\3\2\2\2\u010c\u010d"+
		"\7>\2\2\u010d\u010e\7?\2\2\u010e.\3\2\2\2\u010f\u0110\7@\2\2\u0110\u0111"+
		"\7?\2\2\u0111\60\3\2\2\2\u0112\u0113\7=\2\2\u0113\62\3\2\2\2\u0114\u0115"+
		"\7q\2\2\u0115\u0116\7t\2\2\u0116\u0117\7f\2\2\u0117\u0118\7g\2\2\u0118"+
		"\u011f\7t\2\2\u0119\u011a\7Q\2\2\u011a\u011b\7T\2\2\u011b\u011c\7F\2\2"+
		"\u011c\u011d\7G\2\2\u011d\u011f\7T\2\2\u011e\u0114\3\2\2\2\u011e\u0119"+
		"\3\2\2\2\u011f\64\3\2\2\2\u0120\u0121\7i\2\2\u0121\u0122\7t\2\2\u0122"+
		"\u0123\7q\2\2\u0123\u0124\7w\2\2\u0124\u012b\7r\2\2\u0125\u0126\7I\2\2"+
		"\u0126\u0127\7T\2\2\u0127\u0128\7Q\2\2\u0128\u0129\7W\2\2\u0129\u012b"+
		"\7R\2\2\u012a\u0120\3\2\2\2\u012a\u0125\3\2\2\2\u012b\66\3\2\2\2\u012c"+
		"\u012d\7d\2\2\u012d\u0131\7{\2\2\u012e\u012f\7D\2\2\u012f\u0131\7[\2\2"+
		"\u0130\u012c\3\2\2\2\u0130\u012e\3\2\2\2\u01318\3\2\2\2\u0132\u0133\7"+
		"c\2\2\u0133\u0134\7u\2\2\u0134\u0139\7e\2\2\u0135\u0136\7C\2\2\u0136\u0137"+
		"\7U\2\2\u0137\u0139\7E\2\2\u0138\u0132\3\2\2\2\u0138\u0135\3\2\2\2\u0139"+
		":\3\2\2\2\u013a\u013b\7f\2\2\u013b\u013c\7g\2\2\u013c\u013d\7u\2\2\u013d"+
		"\u0143\7e\2\2\u013e\u013f\7F\2\2\u013f\u0140\7G\2\2\u0140\u0141\7U\2\2"+
		"\u0141\u0143\7E\2\2\u0142\u013a\3\2\2\2\u0142\u013e\3\2\2\2\u0143<\3\2"+
		"\2\2\u0144\u0145\7)\2\2\u0145>\3\2\2\2\u0146\u0148\t\2\2\2\u0147\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"@\3\2\2\2\u014b\u014d\t\3\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2"+
		"\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014fB\3\2\2\2\u0150\u0152\7"+
		"\17\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\7\f\2\2\u0154\u0155\3\2\2\2\u0155\u0156\b\"\2\2\u0156D\3\2\2\2"+
		"\u0157\u0159\t\4\2\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\b#\2\2\u015d"+
		"F\3\2\2\2\u015e\u015f\7+\2\2\u015fH\3\2\2\2\u0160\u0161\7*\2\2\u0161J"+
		"\3\2\2\2\u0162\u0163\7k\2\2\u0163\u0164\7p\2\2\u0164\u0165\7f\2\2\u0165"+
		"\u0166\7g\2\2\u0166\u0167\7z\2\2\u0167L\3\2\2\2\u0168\u0169\7m\2\2\u0169"+
		"\u016a\7g\2\2\u016a\u016b\7{\2\2\u016bN\3\2\2\2\u016c\u016d\7.\2\2\u016d"+
		"P\3\2\2\2\u016e\u016f\7\60\2\2\u016fR\3\2\2\2\u0170\u0171\7r\2\2\u0171"+
		"\u0172\7c\2\2\u0172\u0173\7t\2\2\u0173\u0174\7v\2\2\u0174\u0175\7k\2\2"+
		"\u0175\u0176\7v\2\2\u0176\u0177\7k\2\2\u0177\u0178\7q\2\2\u0178\u0179"+
		"\7p\2\2\u0179T\3\2\2\2\u017a\u017b\7\u0080\2\2\u017bV\3\2\2\2\u017c\u017d"+
		"\7~\2\2\u017dX\3\2\2\2\u017e\u017f\7v\2\2\u017f\u0180\7t\2\2\u0180\u0181"+
		"\7w\2\2\u0181\u0187\7g\2\2\u0182\u0183\7V\2\2\u0183\u0184\7T\2\2\u0184"+
		"\u0185\7W\2\2\u0185\u0187\7G\2\2\u0186\u017e\3\2\2\2\u0186\u0182\3\2\2"+
		"\2\u0187Z\3\2\2\2\u0188\u0189\7h\2\2\u0189\u018a\7c\2\2\u018a\u018b\7"+
		"n\2\2\u018b\u018c\7u\2\2\u018c\u0193\7g\2\2\u018d\u018e\7H\2\2\u018e\u018f"+
		"\7C\2\2\u018f\u0190\7N\2\2\u0190\u0191\7U\2\2\u0191\u0193\7G\2\2\u0192"+
		"\u0188\3\2\2\2\u0192\u018d\3\2\2\2\u0193\\\3\2\2\2\u0194\u0195\n\5\2\2"+
		"\u0195^\3\2\2\2\u0196\u0197\7)\2\2\u0197\u0198\7)\2\2\u0198`\3\2\2\2\35"+
		"\2mw\u0083\u008d\u0095\u009b\u00a3\u00ad\u00b7\u00bd\u00cb\u00d3\u00e3"+
		"\u00f1\u00fd\u011e\u012a\u0130\u0138\u0142\u0149\u014e\u0151\u015a\u0186"+
		"\u0192\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}