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
		ID=1, INT=2, NEWLINE=3, WS=4, INDEX=5, CREATE=6, NUMBER_OF_SHARDS=7, NUMBER_OF_REPLICAS=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ID", "INT", "NEWLINE", "WS", "INDEX", "CREATE", "NUMBER_OF_SHARDS", "NUMBER_OF_REPLICAS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'index'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "INT", "NEWLINE", "WS", "INDEX", "CREATE", "NUMBER_OF_SHARDS", 
		"NUMBER_OF_REPLICAS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u0087\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\25"+
		"\n\2\r\2\16\2\26\3\3\6\3\32\n\3\r\3\16\3\33\3\4\5\4\37\n\4\3\4\3\4\3\4"+
		"\3\4\3\5\6\5&\n\5\r\5\16\5\'\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7>\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0086\n\t\2\2\n"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\5\7\2//C\\aac|\u4e02\u9fa7\3\2"+
		"\62;\4\2\13\f\17\17\u008d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\24\3\2\2\2\5"+
		"\31\3\2\2\2\7\36\3\2\2\2\t%\3\2\2\2\13+\3\2\2\2\r=\3\2\2\2\17_\3\2\2\2"+
		"\21\u0085\3\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2"+
		"\2\2\26\27\3\2\2\2\27\4\3\2\2\2\30\32\t\3\2\2\31\30\3\2\2\2\32\33\3\2"+
		"\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\6\3\2\2\2\35\37\7\17\2\2\36\35\3\2"+
		"\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\7\f\2\2!\"\3\2\2\2\"#\b\4\2\2#\b\3\2"+
		"\2\2$&\t\4\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*"+
		"\b\5\2\2*\n\3\2\2\2+,\7k\2\2,-\7p\2\2-.\7f\2\2./\7g\2\2/\60\7z\2\2\60"+
		"\f\3\2\2\2\61\62\7e\2\2\62\63\7t\2\2\63\64\7g\2\2\64\65\7c\2\2\65\66\7"+
		"v\2\2\66>\7g\2\2\678\7E\2\289\7T\2\29:\7G\2\2:;\7C\2\2;<\7V\2\2<>\7G\2"+
		"\2=\61\3\2\2\2=\67\3\2\2\2>\16\3\2\2\2?@\7p\2\2@A\7w\2\2AB\7o\2\2BC\7"+
		"d\2\2CD\7g\2\2DE\7t\2\2EF\7a\2\2FG\7q\2\2GH\7h\2\2HI\7a\2\2IJ\7u\2\2J"+
		"K\7j\2\2KL\7c\2\2LM\7t\2\2MN\7f\2\2N`\7u\2\2OP\7P\2\2PQ\7W\2\2QR\7O\2"+
		"\2RS\7D\2\2ST\7G\2\2TU\7T\2\2UV\7a\2\2VW\7Q\2\2WX\7H\2\2XY\7a\2\2YZ\7"+
		"U\2\2Z[\7J\2\2[\\\7C\2\2\\]\7T\2\2]^\7F\2\2^`\7U\2\2_?\3\2\2\2_O\3\2\2"+
		"\2`\20\3\2\2\2ab\7p\2\2bc\7w\2\2cd\7o\2\2de\7d\2\2ef\7g\2\2fg\7t\2\2g"+
		"h\7a\2\2hi\7q\2\2ij\7h\2\2jk\7a\2\2kl\7t\2\2lm\7g\2\2mn\7r\2\2no\7n\2"+
		"\2op\7k\2\2pq\7e\2\2qr\7c\2\2r\u0086\7u\2\2st\7P\2\2tu\7W\2\2uv\7O\2\2"+
		"vw\7D\2\2wx\7G\2\2xy\7T\2\2yz\7a\2\2z{\7Q\2\2{|\7H\2\2|}\7a\2\2}~\7T\2"+
		"\2~\177\7G\2\2\177\u0080\7R\2\2\u0080\u0081\7N\2\2\u0081\u0082\7K\2\2"+
		"\u0082\u0083\7E\2\2\u0083\u0084\7C\2\2\u0084\u0086\7U\2\2\u0085a\3\2\2"+
		"\2\u0085s\3\2\2\2\u0086\22\3\2\2\2\n\2\26\33\36\'=_\u0085\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}