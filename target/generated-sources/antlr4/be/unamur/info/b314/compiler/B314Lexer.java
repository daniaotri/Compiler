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
		BOOLEAN=1, INTEGER=2, SQUARE=3, VOID=4, CROCHET_OUVERT=5, CROCHET_FERME=6, 
		VIRGULE=7, DEUXPOINTS=8, POINtVIRGULE=9, PAR_OUVERT=10, PAR_FERME=11, 
		AS=12, LATITUDE=13, LONGITUDE=14, GRID=15, SIZE=16, COUNT=17, LIFE=18, 
		DIRT=19, ROCK=20, VINES=21, ZOMBIE=22, PLAYER=23, ENNEMI=24, MAP=25, RADIO=26, 
		AMMO=27, FRUITS=28, SODA=29, NEARBY=30, TRUE=31, FALSE=32, IS=33, GRAAL=34, 
		NOT=35, AND=36, OR=37, INF=38, SUP=39, EGALE=40, PLUS=41, MOINS=42, MUL=43, 
		DIV=44, DIV_ENT=45, MOVE=46, NORTH=47, SOUTH=48, EAST=49, WEST=50, SHOOT=51, 
		USE=52, NOTHING=53, NEXT=54, RETAIN=55, WHEN=56, YOUR=57, TURN=58, FUNCTION=59, 
		DECLARE=60, LOCAL=61, DONE=62, DO=63, BY=64, DEFAULT=65, IF=66, THEN=67, 
		WHILE=68, SET=69, COMPUTE=70, ELSE=71, TO=72, SKIPPPP=73, ID=74, NUMBER=75, 
		COMMENT=76, NEWLINE=77, WS=78;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOLEAN", "INTEGER", "SQUARE", "VOID", "CROCHET_OUVERT", "CROCHET_FERME", 
		"VIRGULE", "DEUXPOINTS", "POINtVIRGULE", "PAR_OUVERT", "PAR_FERME", "AS", 
		"LATITUDE", "LONGITUDE", "GRID", "SIZE", "COUNT", "LIFE", "DIRT", "ROCK", 
		"VINES", "ZOMBIE", "PLAYER", "ENNEMI", "MAP", "RADIO", "AMMO", "FRUITS", 
		"SODA", "NEARBY", "TRUE", "FALSE", "IS", "GRAAL", "NOT", "AND", "OR", 
		"INF", "SUP", "EGALE", "PLUS", "MOINS", "MUL", "DIV", "DIV_ENT", "MOVE", 
		"NORTH", "SOUTH", "EAST", "WEST", "SHOOT", "USE", "NOTHING", "NEXT", "RETAIN", 
		"WHEN", "YOUR", "TURN", "FUNCTION", "DECLARE", "LOCAL", "DONE", "DO", 
		"BY", "DEFAULT", "IF", "THEN", "WHILE", "SET", "COMPUTE", "ELSE", "TO", 
		"SKIPPPP", "ID", "NUMBER", "LETTER", "DIGIT", "COMMENT", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'integer'", "'square'", "'void'", "'['", "']'", "','", 
		"':'", "';'", "'('", "')'", "'as'", "'latitude'", "'longitude'", "'grid'", 
		"'size'", "'count'", "'life'", "'dirt'", "'rock'", "'vines'", "'zombie'", 
		"'player'", "'ennemi'", "'map'", "'radio'", "'ammo'", "'fruits'", "'soda'", 
		"'nearby'", "'true'", "'false'", "'is'", "'graal'", "'not'", "'and'", 
		"'or'", "'<'", "'>'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'move'", 
		"'north'", "'south'", "'east'", "'west'", "'shoot'", "'use'", "'nothing'", 
		"'next'", "'retain'", "'when'", "'your'", "'turn'", "'function'", "'declare'", 
		"'local'", "'done'", "'do'", "'by'", "'default'", "'if'", "'then'", "'while'", 
		"'set'", "'compute'", "'else'", "'to'", "'skip'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "INTEGER", "SQUARE", "VOID", "CROCHET_OUVERT", "CROCHET_FERME", 
		"VIRGULE", "DEUXPOINTS", "POINtVIRGULE", "PAR_OUVERT", "PAR_FERME", "AS", 
		"LATITUDE", "LONGITUDE", "GRID", "SIZE", "COUNT", "LIFE", "DIRT", "ROCK", 
		"VINES", "ZOMBIE", "PLAYER", "ENNEMI", "MAP", "RADIO", "AMMO", "FRUITS", 
		"SODA", "NEARBY", "TRUE", "FALSE", "IS", "GRAAL", "NOT", "AND", "OR", 
		"INF", "SUP", "EGALE", "PLUS", "MOINS", "MUL", "DIV", "DIV_ENT", "MOVE", 
		"NORTH", "SOUTH", "EAST", "WEST", "SHOOT", "USE", "NOTHING", "NEXT", "RETAIN", 
		"WHEN", "YOUR", "TURN", "FUNCTION", "DECLARE", "LOCAL", "DONE", "DO", 
		"BY", "DEFAULT", "IF", "THEN", "WHILE", "SET", "COMPUTE", "ELSE", "TO", 
		"SKIPPPP", "ID", "NUMBER", "COMMENT", "NEWLINE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2P\u0234\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*"+
		"\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\3"+
		"8\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3"+
		"?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3D\3D\3D\3D\3D\3"+
		"E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3"+
		"I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\7K\u020b\nK\fK\16K\u020e\13K\3L\6L\u0211"+
		"\nL\rL\16L\u0212\3M\3M\3N\3N\3O\3O\3O\3O\7O\u021d\nO\fO\16O\u0220\13O"+
		"\3O\3O\3O\3O\3O\3P\5P\u0228\nP\3P\3P\3P\3P\3Q\6Q\u022f\nQ\rQ\16Q\u0230"+
		"\3Q\3Q\3\u021e\2R\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099\2\u009b\2\u009d"+
		"N\u009fO\u00a1P\3\2\4\4\2C\\c|\4\2\13\13\"\"\u0237\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\3\u00a3\3\2\2\2\5\u00ab\3\2\2"+
		"\2\7\u00b3\3\2\2\2\t\u00ba\3\2\2\2\13\u00bf\3\2\2\2\r\u00c1\3\2\2\2\17"+
		"\u00c3\3\2\2\2\21\u00c5\3\2\2\2\23\u00c7\3\2\2\2\25\u00c9\3\2\2\2\27\u00cb"+
		"\3\2\2\2\31\u00cd\3\2\2\2\33\u00d0\3\2\2\2\35\u00d9\3\2\2\2\37\u00e3\3"+
		"\2\2\2!\u00e8\3\2\2\2#\u00ed\3\2\2\2%\u00f3\3\2\2\2\'\u00f8\3\2\2\2)\u00fd"+
		"\3\2\2\2+\u0102\3\2\2\2-\u0108\3\2\2\2/\u010f\3\2\2\2\61\u0116\3\2\2\2"+
		"\63\u011d\3\2\2\2\65\u0121\3\2\2\2\67\u0127\3\2\2\29\u012c\3\2\2\2;\u0133"+
		"\3\2\2\2=\u0138\3\2\2\2?\u013f\3\2\2\2A\u0144\3\2\2\2C\u014a\3\2\2\2E"+
		"\u014d\3\2\2\2G\u0153\3\2\2\2I\u0157\3\2\2\2K\u015b\3\2\2\2M\u015e\3\2"+
		"\2\2O\u0160\3\2\2\2Q\u0162\3\2\2\2S\u0164\3\2\2\2U\u0166\3\2\2\2W\u0168"+
		"\3\2\2\2Y\u016a\3\2\2\2[\u016c\3\2\2\2]\u016e\3\2\2\2_\u0173\3\2\2\2a"+
		"\u0179\3\2\2\2c\u017f\3\2\2\2e\u0184\3\2\2\2g\u0189\3\2\2\2i\u018f\3\2"+
		"\2\2k\u0193\3\2\2\2m\u019b\3\2\2\2o\u01a0\3\2\2\2q\u01a7\3\2\2\2s\u01ac"+
		"\3\2\2\2u\u01b1\3\2\2\2w\u01b6\3\2\2\2y\u01bf\3\2\2\2{\u01c7\3\2\2\2}"+
		"\u01cd\3\2\2\2\177\u01d2\3\2\2\2\u0081\u01d5\3\2\2\2\u0083\u01d8\3\2\2"+
		"\2\u0085\u01e0\3\2\2\2\u0087\u01e3\3\2\2\2\u0089\u01e8\3\2\2\2\u008b\u01ee"+
		"\3\2\2\2\u008d\u01f2\3\2\2\2\u008f\u01fa\3\2\2\2\u0091\u01ff\3\2\2\2\u0093"+
		"\u0202\3\2\2\2\u0095\u0207\3\2\2\2\u0097\u0210\3\2\2\2\u0099\u0214\3\2"+
		"\2\2\u009b\u0216\3\2\2\2\u009d\u0218\3\2\2\2\u009f\u0227\3\2\2\2\u00a1"+
		"\u022e\3\2\2\2\u00a3\u00a4\7d\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7q\2"+
		"\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa"+
		"\7p\2\2\u00aa\4\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae"+
		"\7v\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7g\2\2\u00b1"+
		"\u00b2\7t\2\2\u00b2\6\3\2\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7s\2\2\u00b5"+
		"\u00b6\7w\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7g\2\2"+
		"\u00b9\b\3\2\2\2\u00ba\u00bb\7x\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7k"+
		"\2\2\u00bd\u00be\7f\2\2\u00be\n\3\2\2\2\u00bf\u00c0\7]\2\2\u00c0\f\3\2"+
		"\2\2\u00c1\u00c2\7_\2\2\u00c2\16\3\2\2\2\u00c3\u00c4\7.\2\2\u00c4\20\3"+
		"\2\2\2\u00c5\u00c6\7<\2\2\u00c6\22\3\2\2\2\u00c7\u00c8\7=\2\2\u00c8\24"+
		"\3\2\2\2\u00c9\u00ca\7*\2\2\u00ca\26\3\2\2\2\u00cb\u00cc\7+\2\2\u00cc"+
		"\30\3\2\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7u\2\2\u00cf\32\3\2\2\2\u00d0"+
		"\u00d1\7n\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7k\2\2"+
		"\u00d4\u00d5\7v\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8"+
		"\7g\2\2\u00d8\34\3\2\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7q\2\2\u00db\u00dc"+
		"\7p\2\2\u00dc\u00dd\7i\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7v\2\2\u00df"+
		"\u00e0\7w\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2\7g\2\2\u00e2\36\3\2\2\2\u00e3"+
		"\u00e4\7i\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7f\2\2"+
		"\u00e7 \3\2\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7|\2"+
		"\2\u00eb\u00ec\7g\2\2\u00ec\"\3\2\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7"+
		"q\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7v\2\2\u00f2$"+
		"\3\2\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7h\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7&\3\2\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa\7k\2\2\u00fa"+
		"\u00fb\7t\2\2\u00fb\u00fc\7v\2\2\u00fc(\3\2\2\2\u00fd\u00fe\7t\2\2\u00fe"+
		"\u00ff\7q\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7m\2\2\u0101*\3\2\2\2\u0102"+
		"\u0103\7x\2\2\u0103\u0104\7k\2\2\u0104\u0105\7p\2\2\u0105\u0106\7g\2\2"+
		"\u0106\u0107\7u\2\2\u0107,\3\2\2\2\u0108\u0109\7|\2\2\u0109\u010a\7q\2"+
		"\2\u010a\u010b\7o\2\2\u010b\u010c\7d\2\2\u010c\u010d\7k\2\2\u010d\u010e"+
		"\7g\2\2\u010e.\3\2\2\2\u010f\u0110\7r\2\2\u0110\u0111\7n\2\2\u0111\u0112"+
		"\7c\2\2\u0112\u0113\7{\2\2\u0113\u0114\7g\2\2\u0114\u0115\7t\2\2\u0115"+
		"\60\3\2\2\2\u0116\u0117\7g\2\2\u0117\u0118\7p\2\2\u0118\u0119\7p\2\2\u0119"+
		"\u011a\7g\2\2\u011a\u011b\7o\2\2\u011b\u011c\7k\2\2\u011c\62\3\2\2\2\u011d"+
		"\u011e\7o\2\2\u011e\u011f\7c\2\2\u011f\u0120\7r\2\2\u0120\64\3\2\2\2\u0121"+
		"\u0122\7t\2\2\u0122\u0123\7c\2\2\u0123\u0124\7f\2\2\u0124\u0125\7k\2\2"+
		"\u0125\u0126\7q\2\2\u0126\66\3\2\2\2\u0127\u0128\7c\2\2\u0128\u0129\7"+
		"o\2\2\u0129\u012a\7o\2\2\u012a\u012b\7q\2\2\u012b8\3\2\2\2\u012c\u012d"+
		"\7h\2\2\u012d\u012e\7t\2\2\u012e\u012f\7w\2\2\u012f\u0130\7k\2\2\u0130"+
		"\u0131\7v\2\2\u0131\u0132\7u\2\2\u0132:\3\2\2\2\u0133\u0134\7u\2\2\u0134"+
		"\u0135\7q\2\2\u0135\u0136\7f\2\2\u0136\u0137\7c\2\2\u0137<\3\2\2\2\u0138"+
		"\u0139\7p\2\2\u0139\u013a\7g\2\2\u013a\u013b\7c\2\2\u013b\u013c\7t\2\2"+
		"\u013c\u013d\7d\2\2\u013d\u013e\7{\2\2\u013e>\3\2\2\2\u013f\u0140\7v\2"+
		"\2\u0140\u0141\7t\2\2\u0141\u0142\7w\2\2\u0142\u0143\7g\2\2\u0143@\3\2"+
		"\2\2\u0144\u0145\7h\2\2\u0145\u0146\7c\2\2\u0146\u0147\7n\2\2\u0147\u0148"+
		"\7u\2\2\u0148\u0149\7g\2\2\u0149B\3\2\2\2\u014a\u014b\7k\2\2\u014b\u014c"+
		"\7u\2\2\u014cD\3\2\2\2\u014d\u014e\7i\2\2\u014e\u014f\7t\2\2\u014f\u0150"+
		"\7c\2\2\u0150\u0151\7c\2\2\u0151\u0152\7n\2\2\u0152F\3\2\2\2\u0153\u0154"+
		"\7p\2\2\u0154\u0155\7q\2\2\u0155\u0156\7v\2\2\u0156H\3\2\2\2\u0157\u0158"+
		"\7c\2\2\u0158\u0159\7p\2\2\u0159\u015a\7f\2\2\u015aJ\3\2\2\2\u015b\u015c"+
		"\7q\2\2\u015c\u015d\7t\2\2\u015dL\3\2\2\2\u015e\u015f\7>\2\2\u015fN\3"+
		"\2\2\2\u0160\u0161\7@\2\2\u0161P\3\2\2\2\u0162\u0163\7?\2\2\u0163R\3\2"+
		"\2\2\u0164\u0165\7-\2\2\u0165T\3\2\2\2\u0166\u0167\7/\2\2\u0167V\3\2\2"+
		"\2\u0168\u0169\7,\2\2\u0169X\3\2\2\2\u016a\u016b\7\61\2\2\u016bZ\3\2\2"+
		"\2\u016c\u016d\7\'\2\2\u016d\\\3\2\2\2\u016e\u016f\7o\2\2\u016f\u0170"+
		"\7q\2\2\u0170\u0171\7x\2\2\u0171\u0172\7g\2\2\u0172^\3\2\2\2\u0173\u0174"+
		"\7p\2\2\u0174\u0175\7q\2\2\u0175\u0176\7t\2\2\u0176\u0177\7v\2\2\u0177"+
		"\u0178\7j\2\2\u0178`\3\2\2\2\u0179\u017a\7u\2\2\u017a\u017b\7q\2\2\u017b"+
		"\u017c\7w\2\2\u017c\u017d\7v\2\2\u017d\u017e\7j\2\2\u017eb\3\2\2\2\u017f"+
		"\u0180\7g\2\2\u0180\u0181\7c\2\2\u0181\u0182\7u\2\2\u0182\u0183\7v\2\2"+
		"\u0183d\3\2\2\2\u0184\u0185\7y\2\2\u0185\u0186\7g\2\2\u0186\u0187\7u\2"+
		"\2\u0187\u0188\7v\2\2\u0188f\3\2\2\2\u0189\u018a\7u\2\2\u018a\u018b\7"+
		"j\2\2\u018b\u018c\7q\2\2\u018c\u018d\7q\2\2\u018d\u018e\7v\2\2\u018eh"+
		"\3\2\2\2\u018f\u0190\7w\2\2\u0190\u0191\7u\2\2\u0191\u0192\7g\2\2\u0192"+
		"j\3\2\2\2\u0193\u0194\7p\2\2\u0194\u0195\7q\2\2\u0195\u0196\7v\2\2\u0196"+
		"\u0197\7j\2\2\u0197\u0198\7k\2\2\u0198\u0199\7p\2\2\u0199\u019a\7i\2\2"+
		"\u019al\3\2\2\2\u019b\u019c\7p\2\2\u019c\u019d\7g\2\2\u019d\u019e\7z\2"+
		"\2\u019e\u019f\7v\2\2\u019fn\3\2\2\2\u01a0\u01a1\7t\2\2\u01a1\u01a2\7"+
		"g\2\2\u01a2\u01a3\7v\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a5\7k\2\2\u01a5\u01a6"+
		"\7p\2\2\u01a6p\3\2\2\2\u01a7\u01a8\7y\2\2\u01a8\u01a9\7j\2\2\u01a9\u01aa"+
		"\7g\2\2\u01aa\u01ab\7p\2\2\u01abr\3\2\2\2\u01ac\u01ad\7{\2\2\u01ad\u01ae"+
		"\7q\2\2\u01ae\u01af\7w\2\2\u01af\u01b0\7t\2\2\u01b0t\3\2\2\2\u01b1\u01b2"+
		"\7v\2\2\u01b2\u01b3\7w\2\2\u01b3\u01b4\7t\2\2\u01b4\u01b5\7p\2\2\u01b5"+
		"v\3\2\2\2\u01b6\u01b7\7h\2\2\u01b7\u01b8\7w\2\2\u01b8\u01b9\7p\2\2\u01b9"+
		"\u01ba\7e\2\2\u01ba\u01bb\7v\2\2\u01bb\u01bc\7k\2\2\u01bc\u01bd\7q\2\2"+
		"\u01bd\u01be\7p\2\2\u01bex\3\2\2\2\u01bf\u01c0\7f\2\2\u01c0\u01c1\7g\2"+
		"\2\u01c1\u01c2\7e\2\2\u01c2\u01c3\7n\2\2\u01c3\u01c4\7c\2\2\u01c4\u01c5"+
		"\7t\2\2\u01c5\u01c6\7g\2\2\u01c6z\3\2\2\2\u01c7\u01c8\7n\2\2\u01c8\u01c9"+
		"\7q\2\2\u01c9\u01ca\7e\2\2\u01ca\u01cb\7c\2\2\u01cb\u01cc\7n\2\2\u01cc"+
		"|\3\2\2\2\u01cd\u01ce\7f\2\2\u01ce\u01cf\7q\2\2\u01cf\u01d0\7p\2\2\u01d0"+
		"\u01d1\7g\2\2\u01d1~\3\2\2\2\u01d2\u01d3\7f\2\2\u01d3\u01d4\7q\2\2\u01d4"+
		"\u0080\3\2\2\2\u01d5\u01d6\7d\2\2\u01d6\u01d7\7{\2\2\u01d7\u0082\3\2\2"+
		"\2\u01d8\u01d9\7f\2\2\u01d9\u01da\7g\2\2\u01da\u01db\7h\2\2\u01db\u01dc"+
		"\7c\2\2\u01dc\u01dd\7w\2\2\u01dd\u01de\7n\2\2\u01de\u01df\7v\2\2\u01df"+
		"\u0084\3\2\2\2\u01e0\u01e1\7k\2\2\u01e1\u01e2\7h\2\2\u01e2\u0086\3\2\2"+
		"\2\u01e3\u01e4\7v\2\2\u01e4\u01e5\7j\2\2\u01e5\u01e6\7g\2\2\u01e6\u01e7"+
		"\7p\2\2\u01e7\u0088\3\2\2\2\u01e8\u01e9\7y\2\2\u01e9\u01ea\7j\2\2\u01ea"+
		"\u01eb\7k\2\2\u01eb\u01ec\7n\2\2\u01ec\u01ed\7g\2\2\u01ed\u008a\3\2\2"+
		"\2\u01ee\u01ef\7u\2\2\u01ef\u01f0\7g\2\2\u01f0\u01f1\7v\2\2\u01f1\u008c"+
		"\3\2\2\2\u01f2\u01f3\7e\2\2\u01f3\u01f4\7q\2\2\u01f4\u01f5\7o\2\2\u01f5"+
		"\u01f6\7r\2\2\u01f6\u01f7\7w\2\2\u01f7\u01f8\7v\2\2\u01f8\u01f9\7g\2\2"+
		"\u01f9\u008e\3\2\2\2\u01fa\u01fb\7g\2\2\u01fb\u01fc\7n\2\2\u01fc\u01fd"+
		"\7u\2\2\u01fd\u01fe\7g\2\2\u01fe\u0090\3\2\2\2\u01ff\u0200\7v\2\2\u0200"+
		"\u0201\7q\2\2\u0201\u0092\3\2\2\2\u0202\u0203\7u\2\2\u0203\u0204\7m\2"+
		"\2\u0204\u0205\7k\2\2\u0205\u0206\7r\2\2\u0206\u0094\3\2\2\2\u0207\u020c"+
		"\5\u0099M\2\u0208\u020b\5\u0099M\2\u0209\u020b\5\u009bN\2\u020a\u0208"+
		"\3\2\2\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u0096\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\5\u009b"+
		"N\2\u0210\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0210\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0098\3\2\2\2\u0214\u0215\t\2\2\2\u0215\u009a\3\2"+
		"\2\2\u0216\u0217\4\62;\2\u0217\u009c\3\2\2\2\u0218\u0219\7\61\2\2\u0219"+
		"\u021a\7,\2\2\u021a\u021e\3\2\2\2\u021b\u021d\13\2\2\2\u021c\u021b\3\2"+
		"\2\2\u021d\u0220\3\2\2\2\u021e\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f"+
		"\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7,\2\2\u0222\u0223\7\61"+
		"\2\2\u0223\u0224\3\2\2\2\u0224\u0225\bO\2\2\u0225\u009e\3\2\2\2\u0226"+
		"\u0228\7\17\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3"+
		"\2\2\2\u0229\u022a\7\f\2\2\u022a\u022b\3\2\2\2\u022b\u022c\bP\2\2\u022c"+
		"\u00a0\3\2\2\2\u022d\u022f\t\3\2\2\u022e\u022d\3\2\2\2\u022f\u0230\3\2"+
		"\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		"\u0233\bQ\2\2\u0233\u00a2\3\2\2\2\t\2\u020a\u020c\u0212\u021e\u0227\u0230"+
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