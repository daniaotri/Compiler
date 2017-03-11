// Generated from be\u005Cunamur\info\b314\compiler\B314.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class B314Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, NUMBER=2, COMMENT=3, NEWLINE=4, WS=5, START=6, DLOCAL=7, TSTART=8, 
		WHEN=9, DO=10, DONE=11, BYDEF=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ID", "NUMBER", "LETTER", "DIGIT", "COMMENT", "NEWLINE", "WS", "START", 
		"DLOCAL", "TSTART", "WHEN", "DO", "DONE", "BYDEF"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'declare and retain'", "'declare local'", 
		"'when your turn'", "'when'", "'do'", "'done'", "'by default'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "NUMBER", "COMMENT", "NEWLINE", "WS", "START", "DLOCAL", "TSTART", 
		"WHEN", "DO", "DONE", "BYDEF"
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


	public B314Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "B314.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2#\n\2\f\2"+
		"\16\2&\13\2\3\3\6\3)\n\3\r\3\16\3*\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6"+
		"\65\n\6\f\6\16\68\13\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7@\n\7\3\7\3\7\3\7\3"+
		"\7\3\b\6\bG\n\b\r\b\16\bH\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\66\2\20\3\3\5\4\7\2\t\2\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f"+
		"\33\r\35\16\3\2\4\4\2C\\c|\4\2\13\13\"\"\u0097\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2"+
		"\2\2\5(\3\2\2\2\7,\3\2\2\2\t.\3\2\2\2\13\60\3\2\2\2\r?\3\2\2\2\17F\3\2"+
		"\2\2\21L\3\2\2\2\23_\3\2\2\2\25m\3\2\2\2\27|\3\2\2\2\31\u0081\3\2\2\2"+
		"\33\u0084\3\2\2\2\35\u0089\3\2\2\2\37$\5\7\4\2 #\5\7\4\2!#\5\t\5\2\" "+
		"\3\2\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\4\3\2\2\2&$\3\2\2"+
		"\2\')\5\t\5\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\6\3\2\2\2,-\t"+
		"\2\2\2-\b\3\2\2\2./\4\62;\2/\n\3\2\2\2\60\61\7\61\2\2\61\62\7,\2\2\62"+
		"\66\3\2\2\2\63\65\13\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\67\3\2\2\2\66"+
		"\64\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7,\2\2:;\7\61\2\2;<\3\2\2\2<=\b"+
		"\6\2\2=\f\3\2\2\2>@\7\17\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\f\2\2B"+
		"C\3\2\2\2CD\b\7\2\2D\16\3\2\2\2EG\t\3\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2"+
		"\2HI\3\2\2\2IJ\3\2\2\2JK\b\b\2\2K\20\3\2\2\2LM\7f\2\2MN\7g\2\2NO\7e\2"+
		"\2OP\7n\2\2PQ\7c\2\2QR\7t\2\2RS\7g\2\2ST\7\"\2\2TU\7c\2\2UV\7p\2\2VW\7"+
		"f\2\2WX\7\"\2\2XY\7t\2\2YZ\7g\2\2Z[\7v\2\2[\\\7c\2\2\\]\7k\2\2]^\7p\2"+
		"\2^\22\3\2\2\2_`\7f\2\2`a\7g\2\2ab\7e\2\2bc\7n\2\2cd\7c\2\2de\7t\2\2e"+
		"f\7g\2\2fg\7\"\2\2gh\7n\2\2hi\7q\2\2ij\7e\2\2jk\7c\2\2kl\7n\2\2l\24\3"+
		"\2\2\2mn\7y\2\2no\7j\2\2op\7g\2\2pq\7p\2\2qr\7\"\2\2rs\7{\2\2st\7q\2\2"+
		"tu\7w\2\2uv\7t\2\2vw\7\"\2\2wx\7v\2\2xy\7w\2\2yz\7t\2\2z{\7p\2\2{\26\3"+
		"\2\2\2|}\7y\2\2}~\7j\2\2~\177\7g\2\2\177\u0080\7p\2\2\u0080\30\3\2\2\2"+
		"\u0081\u0082\7f\2\2\u0082\u0083\7q\2\2\u0083\32\3\2\2\2\u0084\u0085\7"+
		"f\2\2\u0085\u0086\7q\2\2\u0086\u0087\7p\2\2\u0087\u0088\7g\2\2\u0088\34"+
		"\3\2\2\2\u0089\u008a\7d\2\2\u008a\u008b\7{\2\2\u008b\u008c\7\"\2\2\u008c"+
		"\u008d\7f\2\2\u008d\u008e\7g\2\2\u008e\u008f\7h\2\2\u008f\u0090\7c\2\2"+
		"\u0090\u0091\7w\2\2\u0091\u0092\7n\2\2\u0092\u0093\7v\2\2\u0093\36\3\2"+
		"\2\2\t\2\"$*\66?H\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}