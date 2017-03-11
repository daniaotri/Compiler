// Generated from be\u005Cunamur\info\b314\compiler\B314Words.g4 by ANTLR 4.6
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
public class B314Words extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, INTEGER=2, SQUARE=3, NEARBY=4, VOID=5, START=6, DLOCAL=7, TSTART=8, 
		WHEN=9, DO=10, DONE=11, BYDEF=12, AS=13, FUNCTION=14, IF=15, THEN=16, 
		WHILE=17, SET=18, COMPUTE=19, ELSE=20, TO=21, MOVE=22, NORTH=23, SOUTH=24, 
		EAST=25, WEST=26, SHOOT=27, USE=28, NOTHING=29, CROCHET_OUVERT=30, CROCHET_FERME=31, 
		VIRGULE=32, DEUXPOINTS=33, POINtVIRGULE=34, PAR_OUVERT=35, PAR_FERME=36, 
		NOT=37, AND=38, OR=39, INF=40, SUP=41, EGALE=42, PLUS=43, MOINS=44, MUL=45, 
		DIV=46, DIV_ENT=47, LATITUDE=48, LONGITUDE=49, GRID_SIZE=50, COUNT=51, 
		LIFE=52, TRUE=53, FALSE=54, IS=55, GRAAL=56, DIRT=57, ROCK=58, VINES=59, 
		ZOMBIE=60, PLAYER=61, ENNEMI=62, MAP=63, RADIO=64, AMMO=65, FRUITS=66, 
		SODA=67, ID=68, NUMBER=69, COMMENT=70, NEWLINE=71, WS=72;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOLEAN", "INTEGER", "SQUARE", "NEARBY", "VOID", "START", "DLOCAL", "TSTART", 
		"WHEN", "DO", "DONE", "BYDEF", "AS", "FUNCTION", "IF", "THEN", "WHILE", 
		"SET", "COMPUTE", "ELSE", "TO", "MOVE", "NORTH", "SOUTH", "EAST", "WEST", 
		"SHOOT", "USE", "NOTHING", "CROCHET_OUVERT", "CROCHET_FERME", "VIRGULE", 
		"DEUXPOINTS", "POINtVIRGULE", "PAR_OUVERT", "PAR_FERME", "NOT", "AND", 
		"OR", "INF", "SUP", "EGALE", "PLUS", "MOINS", "MUL", "DIV", "DIV_ENT", 
		"LATITUDE", "LONGITUDE", "GRID_SIZE", "COUNT", "LIFE", "TRUE", "FALSE", 
		"IS", "GRAAL", "DIRT", "ROCK", "VINES", "ZOMBIE", "PLAYER", "ENNEMI", 
		"MAP", "RADIO", "AMMO", "FRUITS", "SODA", "ID", "NUMBER", "LETTER", "DIGIT", 
		"COMMENT", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'integer'", "'square'", "'nearby'", "'void'", "'declare and retain'", 
		"'declare local'", "'when your turn'", "'when'", "'do'", "'done'", "'by default'", 
		"'as'", "'function'", "'if'", "'then'", "'while'", "'set'", "'compute'", 
		"'else'", "'to'", "'move'", "'north'", "'south'", "'east'", "'west'", 
		"'shoot'", "'use'", "'nothing'", "'['", "']'", "','", "':'", "';'", "'('", 
		"')'", "'not'", "'and'", "'or'", "'<'", "'>'", "'='", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'latitude'", "'longitude'", "'grid size'", "'count'", "'life'", 
		"'true'", "'false'", "'is'", "'graal'", "'dirt'", "'rock'", "'vines'", 
		"'zombie'", "'player'", "'ennemi'", "'map'", "'radio'", "'ammo'", "'fruits'", 
		"'soda'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "INTEGER", "SQUARE", "NEARBY", "VOID", "START", "DLOCAL", 
		"TSTART", "WHEN", "DO", "DONE", "BYDEF", "AS", "FUNCTION", "IF", "THEN", 
		"WHILE", "SET", "COMPUTE", "ELSE", "TO", "MOVE", "NORTH", "SOUTH", "EAST", 
		"WEST", "SHOOT", "USE", "NOTHING", "CROCHET_OUVERT", "CROCHET_FERME", 
		"VIRGULE", "DEUXPOINTS", "POINtVIRGULE", "PAR_OUVERT", "PAR_FERME", "NOT", 
		"AND", "OR", "INF", "SUP", "EGALE", "PLUS", "MOINS", "MUL", "DIV", "DIV_ENT", 
		"LATITUDE", "LONGITUDE", "GRID_SIZE", "COUNT", "LIFE", "TRUE", "FALSE", 
		"IS", "GRAAL", "DIRT", "ROCK", "VINES", "ZOMBIE", "PLAYER", "ENNEMI", 
		"MAP", "RADIO", "AMMO", "FRUITS", "SODA", "ID", "NUMBER", "COMMENT", "NEWLINE", 
		"WS"
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


	public B314Words(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "B314Words.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2J\u022f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\39\39\39\39\39\39\3:\3:\3"+
		":\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3>\3>\3"+
		">\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3"+
		"B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\7E\u0206\nE\f"+
		"E\16E\u0209\13E\3F\6F\u020c\nF\rF\16F\u020d\3G\3G\3H\3H\3I\3I\3I\3I\7"+
		"I\u0218\nI\fI\16I\u021b\13I\3I\3I\3I\3I\3I\3J\5J\u0223\nJ\3J\3J\3J\3J"+
		"\3K\6K\u022a\nK\rK\16K\u022b\3K\3K\3\u0219\2L\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d\2\u008f\2\u0091H\u0093I\u0095"+
		"J\3\2\4\4\2C\\c|\4\2\13\13\"\"\u0232\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\3\u0097\3\2\2\2\5\u009f\3\2\2\2\7\u00a7\3\2\2\2\t\u00ae\3\2\2\2\13"+
		"\u00b5\3\2\2\2\r\u00ba\3\2\2\2\17\u00cd\3\2\2\2\21\u00db\3\2\2\2\23\u00ea"+
		"\3\2\2\2\25\u00ef\3\2\2\2\27\u00f2\3\2\2\2\31\u00f7\3\2\2\2\33\u0102\3"+
		"\2\2\2\35\u0105\3\2\2\2\37\u010e\3\2\2\2!\u0111\3\2\2\2#\u0116\3\2\2\2"+
		"%\u011c\3\2\2\2\'\u0120\3\2\2\2)\u0128\3\2\2\2+\u012d\3\2\2\2-\u0130\3"+
		"\2\2\2/\u0135\3\2\2\2\61\u013b\3\2\2\2\63\u0141\3\2\2\2\65\u0146\3\2\2"+
		"\2\67\u014b\3\2\2\29\u0151\3\2\2\2;\u0155\3\2\2\2=\u015d\3\2\2\2?\u015f"+
		"\3\2\2\2A\u0161\3\2\2\2C\u0163\3\2\2\2E\u0165\3\2\2\2G\u0167\3\2\2\2I"+
		"\u0169\3\2\2\2K\u016b\3\2\2\2M\u016f\3\2\2\2O\u0173\3\2\2\2Q\u0176\3\2"+
		"\2\2S\u0178\3\2\2\2U\u017a\3\2\2\2W\u017c\3\2\2\2Y\u017e\3\2\2\2[\u0180"+
		"\3\2\2\2]\u0182\3\2\2\2_\u0184\3\2\2\2a\u0186\3\2\2\2c\u018f\3\2\2\2e"+
		"\u0199\3\2\2\2g\u01a3\3\2\2\2i\u01a9\3\2\2\2k\u01ae\3\2\2\2m\u01b3\3\2"+
		"\2\2o\u01b9\3\2\2\2q\u01bc\3\2\2\2s\u01c2\3\2\2\2u\u01c7\3\2\2\2w\u01cc"+
		"\3\2\2\2y\u01d2\3\2\2\2{\u01d9\3\2\2\2}\u01e0\3\2\2\2\177\u01e7\3\2\2"+
		"\2\u0081\u01eb\3\2\2\2\u0083\u01f1\3\2\2\2\u0085\u01f6\3\2\2\2\u0087\u01fd"+
		"\3\2\2\2\u0089\u0202\3\2\2\2\u008b\u020b\3\2\2\2\u008d\u020f\3\2\2\2\u008f"+
		"\u0211\3\2\2\2\u0091\u0213\3\2\2\2\u0093\u0222\3\2\2\2\u0095\u0229\3\2"+
		"\2\2\u0097\u0098\7d\2\2\u0098\u0099\7q\2\2\u0099\u009a\7q\2\2\u009a\u009b"+
		"\7n\2\2\u009b\u009c\7g\2\2\u009c\u009d\7c\2\2\u009d\u009e\7p\2\2\u009e"+
		"\4\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3\u00a4\7i\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7t\2\2"+
		"\u00a6\6\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7s\2\2\u00a9\u00aa\7w"+
		"\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\b"+
		"\3\2\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7c\2\2\u00b1"+
		"\u00b2\7t\2\2\u00b2\u00b3\7d\2\2\u00b3\u00b4\7{\2\2\u00b4\n\3\2\2\2\u00b5"+
		"\u00b6\7x\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7f\2\2"+
		"\u00b9\f\3\2\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7e"+
		"\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\u00c2\7\"\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7p\2\2\u00c4"+
		"\u00c5\7f\2\2\u00c5\u00c6\7\"\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7g\2"+
		"\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc"+
		"\7p\2\2\u00cc\16\3\2\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0"+
		"\7e\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7t\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7\"\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7q\2"+
		"\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da\20\3"+
		"\2\2\2\u00db\u00dc\7y\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7p\2\2\u00df\u00e0\7\"\2\2\u00e0\u00e1\7{\2\2\u00e1\u00e2\7q\2"+
		"\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6"+
		"\7v\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7p\2\2\u00e9"+
		"\22\3\2\2\2\u00ea\u00eb\7y\2\2\u00eb\u00ec\7j\2\2\u00ec\u00ed\7g\2\2\u00ed"+
		"\u00ee\7p\2\2\u00ee\24\3\2\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7q\2\2\u00f1"+
		"\26\3\2\2\2\u00f2\u00f3\7f\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7p\2\2\u00f5"+
		"\u00f6\7g\2\2\u00f6\30\3\2\2\2\u00f7\u00f8\7d\2\2\u00f8\u00f9\7{\2\2\u00f9"+
		"\u00fa\7\"\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7h\2"+
		"\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100\7n\2\2\u0100\u0101"+
		"\7v\2\2\u0101\32\3\2\2\2\u0102\u0103\7c\2\2\u0103\u0104\7u\2\2\u0104\34"+
		"\3\2\2\2\u0105\u0106\7h\2\2\u0106\u0107\7w\2\2\u0107\u0108\7p\2\2\u0108"+
		"\u0109\7e\2\2\u0109\u010a\7v\2\2\u010a\u010b\7k\2\2\u010b\u010c\7q\2\2"+
		"\u010c\u010d\7p\2\2\u010d\36\3\2\2\2\u010e\u010f\7k\2\2\u010f\u0110\7"+
		"h\2\2\u0110 \3\2\2\2\u0111\u0112\7v\2\2\u0112\u0113\7j\2\2\u0113\u0114"+
		"\7g\2\2\u0114\u0115\7p\2\2\u0115\"\3\2\2\2\u0116\u0117\7y\2\2\u0117\u0118"+
		"\7j\2\2\u0118\u0119\7k\2\2\u0119\u011a\7n\2\2\u011a\u011b\7g\2\2\u011b"+
		"$\3\2\2\2\u011c\u011d\7u\2\2\u011d\u011e\7g\2\2\u011e\u011f\7v\2\2\u011f"+
		"&\3\2\2\2\u0120\u0121\7e\2\2\u0121\u0122\7q\2\2\u0122\u0123\7o\2\2\u0123"+
		"\u0124\7r\2\2\u0124\u0125\7w\2\2\u0125\u0126\7v\2\2\u0126\u0127\7g\2\2"+
		"\u0127(\3\2\2\2\u0128\u0129\7g\2\2\u0129\u012a\7n\2\2\u012a\u012b\7u\2"+
		"\2\u012b\u012c\7g\2\2\u012c*\3\2\2\2\u012d\u012e\7v\2\2\u012e\u012f\7"+
		"q\2\2\u012f,\3\2\2\2\u0130\u0131\7o\2\2\u0131\u0132\7q\2\2\u0132\u0133"+
		"\7x\2\2\u0133\u0134\7g\2\2\u0134.\3\2\2\2\u0135\u0136\7p\2\2\u0136\u0137"+
		"\7q\2\2\u0137\u0138\7t\2\2\u0138\u0139\7v\2\2\u0139\u013a\7j\2\2\u013a"+
		"\60\3\2\2\2\u013b\u013c\7u\2\2\u013c\u013d\7q\2\2\u013d\u013e\7w\2\2\u013e"+
		"\u013f\7v\2\2\u013f\u0140\7j\2\2\u0140\62\3\2\2\2\u0141\u0142\7g\2\2\u0142"+
		"\u0143\7c\2\2\u0143\u0144\7u\2\2\u0144\u0145\7v\2\2\u0145\64\3\2\2\2\u0146"+
		"\u0147\7y\2\2\u0147\u0148\7g\2\2\u0148\u0149\7u\2\2\u0149\u014a\7v\2\2"+
		"\u014a\66\3\2\2\2\u014b\u014c\7u\2\2\u014c\u014d\7j\2\2\u014d\u014e\7"+
		"q\2\2\u014e\u014f\7q\2\2\u014f\u0150\7v\2\2\u01508\3\2\2\2\u0151\u0152"+
		"\7w\2\2\u0152\u0153\7u\2\2\u0153\u0154\7g\2\2\u0154:\3\2\2\2\u0155\u0156"+
		"\7p\2\2\u0156\u0157\7q\2\2\u0157\u0158\7v\2\2\u0158\u0159\7j\2\2\u0159"+
		"\u015a\7k\2\2\u015a\u015b\7p\2\2\u015b\u015c\7i\2\2\u015c<\3\2\2\2\u015d"+
		"\u015e\7]\2\2\u015e>\3\2\2\2\u015f\u0160\7_\2\2\u0160@\3\2\2\2\u0161\u0162"+
		"\7.\2\2\u0162B\3\2\2\2\u0163\u0164\7<\2\2\u0164D\3\2\2\2\u0165\u0166\7"+
		"=\2\2\u0166F\3\2\2\2\u0167\u0168\7*\2\2\u0168H\3\2\2\2\u0169\u016a\7+"+
		"\2\2\u016aJ\3\2\2\2\u016b\u016c\7p\2\2\u016c\u016d\7q\2\2\u016d\u016e"+
		"\7v\2\2\u016eL\3\2\2\2\u016f\u0170\7c\2\2\u0170\u0171\7p\2\2\u0171\u0172"+
		"\7f\2\2\u0172N\3\2\2\2\u0173\u0174\7q\2\2\u0174\u0175\7t\2\2\u0175P\3"+
		"\2\2\2\u0176\u0177\7>\2\2\u0177R\3\2\2\2\u0178\u0179\7@\2\2\u0179T\3\2"+
		"\2\2\u017a\u017b\7?\2\2\u017bV\3\2\2\2\u017c\u017d\7-\2\2\u017dX\3\2\2"+
		"\2\u017e\u017f\7/\2\2\u017fZ\3\2\2\2\u0180\u0181\7,\2\2\u0181\\\3\2\2"+
		"\2\u0182\u0183\7\61\2\2\u0183^\3\2\2\2\u0184\u0185\7\'\2\2\u0185`\3\2"+
		"\2\2\u0186\u0187\7n\2\2\u0187\u0188\7c\2\2\u0188\u0189\7v\2\2\u0189\u018a"+
		"\7k\2\2\u018a\u018b\7v\2\2\u018b\u018c\7w\2\2\u018c\u018d\7f\2\2\u018d"+
		"\u018e\7g\2\2\u018eb\3\2\2\2\u018f\u0190\7n\2\2\u0190\u0191\7q\2\2\u0191"+
		"\u0192\7p\2\2\u0192\u0193\7i\2\2\u0193\u0194\7k\2\2\u0194\u0195\7v\2\2"+
		"\u0195\u0196\7w\2\2\u0196\u0197\7f\2\2\u0197\u0198\7g\2\2\u0198d\3\2\2"+
		"\2\u0199\u019a\7i\2\2\u019a\u019b\7t\2\2\u019b\u019c\7k\2\2\u019c\u019d"+
		"\7f\2\2\u019d\u019e\7\"\2\2\u019e\u019f\7u\2\2\u019f\u01a0\7k\2\2\u01a0"+
		"\u01a1\7|\2\2\u01a1\u01a2\7g\2\2\u01a2f\3\2\2\2\u01a3\u01a4\7e\2\2\u01a4"+
		"\u01a5\7q\2\2\u01a5\u01a6\7w\2\2\u01a6\u01a7\7p\2\2\u01a7\u01a8\7v\2\2"+
		"\u01a8h\3\2\2\2\u01a9\u01aa\7n\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ac\7h\2"+
		"\2\u01ac\u01ad\7g\2\2\u01adj\3\2\2\2\u01ae\u01af\7v\2\2\u01af\u01b0\7"+
		"t\2\2\u01b0\u01b1\7w\2\2\u01b1\u01b2\7g\2\2\u01b2l\3\2\2\2\u01b3\u01b4"+
		"\7h\2\2\u01b4\u01b5\7c\2\2\u01b5\u01b6\7n\2\2\u01b6\u01b7\7u\2\2\u01b7"+
		"\u01b8\7g\2\2\u01b8n\3\2\2\2\u01b9\u01ba\7k\2\2\u01ba\u01bb\7u\2\2\u01bb"+
		"p\3\2\2\2\u01bc\u01bd\7i\2\2\u01bd\u01be\7t\2\2\u01be\u01bf\7c\2\2\u01bf"+
		"\u01c0\7c\2\2\u01c0\u01c1\7n\2\2\u01c1r\3\2\2\2\u01c2\u01c3\7f\2\2\u01c3"+
		"\u01c4\7k\2\2\u01c4\u01c5\7t\2\2\u01c5\u01c6\7v\2\2\u01c6t\3\2\2\2\u01c7"+
		"\u01c8\7t\2\2\u01c8\u01c9\7q\2\2\u01c9\u01ca\7e\2\2\u01ca\u01cb\7m\2\2"+
		"\u01cbv\3\2\2\2\u01cc\u01cd\7x\2\2\u01cd\u01ce\7k\2\2\u01ce\u01cf\7p\2"+
		"\2\u01cf\u01d0\7g\2\2\u01d0\u01d1\7u\2\2\u01d1x\3\2\2\2\u01d2\u01d3\7"+
		"|\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5\7o\2\2\u01d5\u01d6\7d\2\2\u01d6\u01d7"+
		"\7k\2\2\u01d7\u01d8\7g\2\2\u01d8z\3\2\2\2\u01d9\u01da\7r\2\2\u01da\u01db"+
		"\7n\2\2\u01db\u01dc\7c\2\2\u01dc\u01dd\7{\2\2\u01dd\u01de\7g\2\2\u01de"+
		"\u01df\7t\2\2\u01df|\3\2\2\2\u01e0\u01e1\7g\2\2\u01e1\u01e2\7p\2\2\u01e2"+
		"\u01e3\7p\2\2\u01e3\u01e4\7g\2\2\u01e4\u01e5\7o\2\2\u01e5\u01e6\7k\2\2"+
		"\u01e6~\3\2\2\2\u01e7\u01e8\7o\2\2\u01e8\u01e9\7c\2\2\u01e9\u01ea\7r\2"+
		"\2\u01ea\u0080\3\2\2\2\u01eb\u01ec\7t\2\2\u01ec\u01ed\7c\2\2\u01ed\u01ee"+
		"\7f\2\2\u01ee\u01ef\7k\2\2\u01ef\u01f0\7q\2\2\u01f0\u0082\3\2\2\2\u01f1"+
		"\u01f2\7c\2\2\u01f2\u01f3\7o\2\2\u01f3\u01f4\7o\2\2\u01f4\u01f5\7q\2\2"+
		"\u01f5\u0084\3\2\2\2\u01f6\u01f7\7h\2\2\u01f7\u01f8\7t\2\2\u01f8\u01f9"+
		"\7w\2\2\u01f9\u01fa\7k\2\2\u01fa\u01fb\7v\2\2\u01fb\u01fc\7u\2\2\u01fc"+
		"\u0086\3\2\2\2\u01fd\u01fe\7u\2\2\u01fe\u01ff\7q\2\2\u01ff\u0200\7f\2"+
		"\2\u0200\u0201\7c\2\2\u0201\u0088\3\2\2\2\u0202\u0207\5\u008dG\2\u0203"+
		"\u0206\5\u008dG\2\u0204\u0206\5\u008fH\2\u0205\u0203\3\2\2\2\u0205\u0204"+
		"\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u008a\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020c\5\u008fH\2\u020b\u020a"+
		"\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u008c\3\2\2\2\u020f\u0210\t\2\2\2\u0210\u008e\3\2\2\2\u0211\u0212\4\62"+
		";\2\u0212\u0090\3\2\2\2\u0213\u0214\7\61\2\2\u0214\u0215\7,\2\2\u0215"+
		"\u0219\3\2\2\2\u0216\u0218\13\2\2\2\u0217\u0216\3\2\2\2\u0218\u021b\3"+
		"\2\2\2\u0219\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021c\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021c\u021d\7,\2\2\u021d\u021e\7\61\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u0220\bI\2\2\u0220\u0092\3\2\2\2\u0221\u0223\7\17\2\2\u0222"+
		"\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\7\f"+
		"\2\2\u0225\u0226\3\2\2\2\u0226\u0227\bJ\2\2\u0227\u0094\3\2\2\2\u0228"+
		"\u022a\t\3\2\2\u0229\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2"+
		"\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\bK\2\2\u022e"+
		"\u0096\3\2\2\2\t\2\u0205\u0207\u020d\u0219\u0222\u022b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}