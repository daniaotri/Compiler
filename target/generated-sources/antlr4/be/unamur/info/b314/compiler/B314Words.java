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
		START=1, TSTART=2, AS=3, ID=4, FUNCTION=5, DLOCAL=6, DONE=7, DO=8, WHEN=9, 
		BYDEF=10, IF=11, THEN=12, WHILE=13, SET=14, COMPUTE=15, ELSE=16, TO=17, 
		SKIPPPP=18, BOOLEAN=19, INTEGER=20, SQUARE=21, VOID=22, LATITUDE=23, LONGITUDE=24, 
		GRID_SIZE=25, COUNT=26, LIFE=27, DIRT=28, ROCK=29, VINES=30, ZOMBIE=31, 
		PLAYER=32, ENNEMI=33, MAP=34, RADIO=35, AMMO=36, FRUITS=37, SODA=38, NEARBY=39, 
		TRUE=40, FALSE=41, IS=42, GRAAL=43, NOT=44, AND=45, OR=46, INF=47, SUP=48, 
		EGALE=49, PLUS=50, MOINS=51, MUL=52, DIV=53, DIV_ENT=54, MOVE=55, NORTH=56, 
		SOUTH=57, EAST=58, WEST=59, SHOOT=60, USE=61, NOTHING=62, NEXT=63, CROCHET_OUVERT=64, 
		CROCHET_FERME=65, VIRGULE=66, DEUXPOINTS=67, POINtVIRGULE=68, PAR_OUVERT=69, 
		PAR_FERME=70, NUMBER=71, COMMENT=72, NEWLINE=73, WS=74;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"START", "TSTART", "AS", "ID", "FUNCTION", "DLOCAL", "DONE", "DO", "WHEN", 
		"BYDEF", "IF", "THEN", "WHILE", "SET", "COMPUTE", "ELSE", "TO", "SKIPPPP", 
		"BOOLEAN", "INTEGER", "SQUARE", "VOID", "LATITUDE", "LONGITUDE", "GRID_SIZE", 
		"COUNT", "LIFE", "DIRT", "ROCK", "VINES", "ZOMBIE", "PLAYER", "ENNEMI", 
		"MAP", "RADIO", "AMMO", "FRUITS", "SODA", "NEARBY", "TRUE", "FALSE", "IS", 
		"GRAAL", "NOT", "AND", "OR", "INF", "SUP", "EGALE", "PLUS", "MOINS", "MUL", 
		"DIV", "DIV_ENT", "MOVE", "NORTH", "SOUTH", "EAST", "WEST", "SHOOT", "USE", 
		"NOTHING", "NEXT", "CROCHET_OUVERT", "CROCHET_FERME", "VIRGULE", "DEUXPOINTS", 
		"POINtVIRGULE", "PAR_OUVERT", "PAR_FERME", "NUMBER", "LETTER", "DIGIT", 
		"COMMENT", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'declare and retain'", "'when your turn'", "'as'", null, "'function'", 
		"'declare local'", "'done'", "'do'", "'when'", "'by default'", "'if'", 
		"'then'", "'while'", "'set'", "'compute'", "'else'", "'to'", "'skip'", 
		"'boolean'", "'integer'", "'square'", "'void'", "'latitude'", "'longitude'", 
		"'grid size'", "'count'", "'life'", "'dirt'", "'rock'", "'vines'", "'zombie'", 
		"'player'", "'ennemi'", "'map'", "'radio'", "'ammo'", "'fruits'", "'soda'", 
		"'nearby'", "'true'", "'false'", "'is'", "'graal'", "'not'", "'and'", 
		"'or'", "'<'", "'>'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'move'", 
		"'north'", "'south'", "'east'", "'west'", "'shoot'", "'use'", "'nothing'", 
		"'next'", "'['", "']'", "','", "':'", "';'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "START", "TSTART", "AS", "ID", "FUNCTION", "DLOCAL", "DONE", "DO", 
		"WHEN", "BYDEF", "IF", "THEN", "WHILE", "SET", "COMPUTE", "ELSE", "TO", 
		"SKIPPPP", "BOOLEAN", "INTEGER", "SQUARE", "VOID", "LATITUDE", "LONGITUDE", 
		"GRID_SIZE", "COUNT", "LIFE", "DIRT", "ROCK", "VINES", "ZOMBIE", "PLAYER", 
		"ENNEMI", "MAP", "RADIO", "AMMO", "FRUITS", "SODA", "NEARBY", "TRUE", 
		"FALSE", "IS", "GRAAL", "NOT", "AND", "OR", "INF", "SUP", "EGALE", "PLUS", 
		"MOINS", "MUL", "DIV", "DIV_ENT", "MOVE", "NORTH", "SOUTH", "EAST", "WEST", 
		"SHOOT", "USE", "NOTHING", "NEXT", "CROCHET_OUVERT", "CROCHET_FERME", 
		"VIRGULE", "DEUXPOINTS", "POINtVIRGULE", "PAR_OUVERT", "PAR_FERME", "NUMBER", 
		"COMMENT", "NEWLINE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2L\u023d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\7\5\u00c4\n\5\f\5\16"+
		"\5\u00c7\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,"+
		"\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\38\3"+
		"9\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3"+
		"=\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3"+
		"A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\6H\u021a\nH\rH\16H\u021b\3I\3"+
		"I\3J\3J\3K\3K\3K\3K\7K\u0226\nK\fK\16K\u0229\13K\3K\3K\3K\3K\3K\3L\5L"+
		"\u0231\nL\3L\3L\3L\3L\3M\6M\u0238\nM\rM\16M\u0239\3M\3M\3\u0227\2N\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091\2\u0093\2\u0095J\u0097K\u0099L\3\2\4\4\2C\\c|\4\2\13\13\"\"\u0240"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\3\u009b"+
		"\3\2\2\2\5\u00ae\3\2\2\2\7\u00bd\3\2\2\2\t\u00c0\3\2\2\2\13\u00c8\3\2"+
		"\2\2\r\u00d1\3\2\2\2\17\u00df\3\2\2\2\21\u00e4\3\2\2\2\23\u00e7\3\2\2"+
		"\2\25\u00ec\3\2\2\2\27\u00f7\3\2\2\2\31\u00fa\3\2\2\2\33\u00ff\3\2\2\2"+
		"\35\u0105\3\2\2\2\37\u0109\3\2\2\2!\u0111\3\2\2\2#\u0116\3\2\2\2%\u0119"+
		"\3\2\2\2\'\u011e\3\2\2\2)\u0126\3\2\2\2+\u012e\3\2\2\2-\u0135\3\2\2\2"+
		"/\u013a\3\2\2\2\61\u0143\3\2\2\2\63\u014d\3\2\2\2\65\u0157\3\2\2\2\67"+
		"\u015d\3\2\2\29\u0162\3\2\2\2;\u0167\3\2\2\2=\u016c\3\2\2\2?\u0172\3\2"+
		"\2\2A\u0179\3\2\2\2C\u0180\3\2\2\2E\u0187\3\2\2\2G\u018b\3\2\2\2I\u0191"+
		"\3\2\2\2K\u0196\3\2\2\2M\u019d\3\2\2\2O\u01a2\3\2\2\2Q\u01a9\3\2\2\2S"+
		"\u01ae\3\2\2\2U\u01b4\3\2\2\2W\u01b7\3\2\2\2Y\u01bd\3\2\2\2[\u01c1\3\2"+
		"\2\2]\u01c5\3\2\2\2_\u01c8\3\2\2\2a\u01ca\3\2\2\2c\u01cc\3\2\2\2e\u01ce"+
		"\3\2\2\2g\u01d0\3\2\2\2i\u01d2\3\2\2\2k\u01d4\3\2\2\2m\u01d6\3\2\2\2o"+
		"\u01d8\3\2\2\2q\u01dd\3\2\2\2s\u01e3\3\2\2\2u\u01e9\3\2\2\2w\u01ee\3\2"+
		"\2\2y\u01f3\3\2\2\2{\u01f9\3\2\2\2}\u01fd\3\2\2\2\177\u0205\3\2\2\2\u0081"+
		"\u020a\3\2\2\2\u0083\u020c\3\2\2\2\u0085\u020e\3\2\2\2\u0087\u0210\3\2"+
		"\2\2\u0089\u0212\3\2\2\2\u008b\u0214\3\2\2\2\u008d\u0216\3\2\2\2\u008f"+
		"\u0219\3\2\2\2\u0091\u021d\3\2\2\2\u0093\u021f\3\2\2\2\u0095\u0221\3\2"+
		"\2\2\u0097\u0230\3\2\2\2\u0099\u0237\3\2\2\2\u009b\u009c\7f\2\2\u009c"+
		"\u009d\7g\2\2\u009d\u009e\7e\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7c\2\2"+
		"\u00a0\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a4"+
		"\7c\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7\"\2\2\u00a7"+
		"\u00a8\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7c\2\2"+
		"\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\4\3\2\2\2\u00ae\u00af\7y"+
		"\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3"+
		"\7\"\2\2\u00b3\u00b4\7{\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7w\2\2\u00b6"+
		"\u00b7\7t\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7w\2"+
		"\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7p\2\2\u00bc\6\3\2\2\2\u00bd\u00be\7"+
		"c\2\2\u00be\u00bf\7u\2\2\u00bf\b\3\2\2\2\u00c0\u00c5\5\u0091I\2\u00c1"+
		"\u00c4\5\u0091I\2\u00c2\u00c4\5\u0093J\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\n\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca\7w\2\2\u00ca"+
		"\u00cb\7p\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7k\2\2"+
		"\u00ce\u00cf\7q\2\2\u00cf\u00d0\7p\2\2\u00d0\f\3\2\2\2\u00d1\u00d2\7f"+
		"\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6"+
		"\7c\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7\"\2\2\u00d9"+
		"\u00da\7n\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7c\2\2"+
		"\u00dd\u00de\7n\2\2\u00de\16\3\2\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7"+
		"q\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7g\2\2\u00e3\20\3\2\2\2\u00e4\u00e5"+
		"\7f\2\2\u00e5\u00e6\7q\2\2\u00e6\22\3\2\2\2\u00e7\u00e8\7y\2\2\u00e8\u00e9"+
		"\7j\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7p\2\2\u00eb\24\3\2\2\2\u00ec\u00ed"+
		"\7d\2\2\u00ed\u00ee\7{\2\2\u00ee\u00ef\7\"\2\2\u00ef\u00f0\7f\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7w\2\2"+
		"\u00f4\u00f5\7n\2\2\u00f5\u00f6\7v\2\2\u00f6\26\3\2\2\2\u00f7\u00f8\7"+
		"k\2\2\u00f8\u00f9\7h\2\2\u00f9\30\3\2\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc"+
		"\7j\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7p\2\2\u00fe\32\3\2\2\2\u00ff\u0100"+
		"\7y\2\2\u0100\u0101\7j\2\2\u0101\u0102\7k\2\2\u0102\u0103\7n\2\2\u0103"+
		"\u0104\7g\2\2\u0104\34\3\2\2\2\u0105\u0106\7u\2\2\u0106\u0107\7g\2\2\u0107"+
		"\u0108\7v\2\2\u0108\36\3\2\2\2\u0109\u010a\7e\2\2\u010a\u010b\7q\2\2\u010b"+
		"\u010c\7o\2\2\u010c\u010d\7r\2\2\u010d\u010e\7w\2\2\u010e\u010f\7v\2\2"+
		"\u010f\u0110\7g\2\2\u0110 \3\2\2\2\u0111\u0112\7g\2\2\u0112\u0113\7n\2"+
		"\2\u0113\u0114\7u\2\2\u0114\u0115\7g\2\2\u0115\"\3\2\2\2\u0116\u0117\7"+
		"v\2\2\u0117\u0118\7q\2\2\u0118$\3\2\2\2\u0119\u011a\7u\2\2\u011a\u011b"+
		"\7m\2\2\u011b\u011c\7k\2\2\u011c\u011d\7r\2\2\u011d&\3\2\2\2\u011e\u011f"+
		"\7d\2\2\u011f\u0120\7q\2\2\u0120\u0121\7q\2\2\u0121\u0122\7n\2\2\u0122"+
		"\u0123\7g\2\2\u0123\u0124\7c\2\2\u0124\u0125\7p\2\2\u0125(\3\2\2\2\u0126"+
		"\u0127\7k\2\2\u0127\u0128\7p\2\2\u0128\u0129\7v\2\2\u0129\u012a\7g\2\2"+
		"\u012a\u012b\7i\2\2\u012b\u012c\7g\2\2\u012c\u012d\7t\2\2\u012d*\3\2\2"+
		"\2\u012e\u012f\7u\2\2\u012f\u0130\7s\2\2\u0130\u0131\7w\2\2\u0131\u0132"+
		"\7c\2\2\u0132\u0133\7t\2\2\u0133\u0134\7g\2\2\u0134,\3\2\2\2\u0135\u0136"+
		"\7x\2\2\u0136\u0137\7q\2\2\u0137\u0138\7k\2\2\u0138\u0139\7f\2\2\u0139"+
		".\3\2\2\2\u013a\u013b\7n\2\2\u013b\u013c\7c\2\2\u013c\u013d\7v\2\2\u013d"+
		"\u013e\7k\2\2\u013e\u013f\7v\2\2\u013f\u0140\7w\2\2\u0140\u0141\7f\2\2"+
		"\u0141\u0142\7g\2\2\u0142\60\3\2\2\2\u0143\u0144\7n\2\2\u0144\u0145\7"+
		"q\2\2\u0145\u0146\7p\2\2\u0146\u0147\7i\2\2\u0147\u0148\7k\2\2\u0148\u0149"+
		"\7v\2\2\u0149\u014a\7w\2\2\u014a\u014b\7f\2\2\u014b\u014c\7g\2\2\u014c"+
		"\62\3\2\2\2\u014d\u014e\7i\2\2\u014e\u014f\7t\2\2\u014f\u0150\7k\2\2\u0150"+
		"\u0151\7f\2\2\u0151\u0152\7\"\2\2\u0152\u0153\7u\2\2\u0153\u0154\7k\2"+
		"\2\u0154\u0155\7|\2\2\u0155\u0156\7g\2\2\u0156\64\3\2\2\2\u0157\u0158"+
		"\7e\2\2\u0158\u0159\7q\2\2\u0159\u015a\7w\2\2\u015a\u015b\7p\2\2\u015b"+
		"\u015c\7v\2\2\u015c\66\3\2\2\2\u015d\u015e\7n\2\2\u015e\u015f\7k\2\2\u015f"+
		"\u0160\7h\2\2\u0160\u0161\7g\2\2\u01618\3\2\2\2\u0162\u0163\7f\2\2\u0163"+
		"\u0164\7k\2\2\u0164\u0165\7t\2\2\u0165\u0166\7v\2\2\u0166:\3\2\2\2\u0167"+
		"\u0168\7t\2\2\u0168\u0169\7q\2\2\u0169\u016a\7e\2\2\u016a\u016b\7m\2\2"+
		"\u016b<\3\2\2\2\u016c\u016d\7x\2\2\u016d\u016e\7k\2\2\u016e\u016f\7p\2"+
		"\2\u016f\u0170\7g\2\2\u0170\u0171\7u\2\2\u0171>\3\2\2\2\u0172\u0173\7"+
		"|\2\2\u0173\u0174\7q\2\2\u0174\u0175\7o\2\2\u0175\u0176\7d\2\2\u0176\u0177"+
		"\7k\2\2\u0177\u0178\7g\2\2\u0178@\3\2\2\2\u0179\u017a\7r\2\2\u017a\u017b"+
		"\7n\2\2\u017b\u017c\7c\2\2\u017c\u017d\7{\2\2\u017d\u017e\7g\2\2\u017e"+
		"\u017f\7t\2\2\u017fB\3\2\2\2\u0180\u0181\7g\2\2\u0181\u0182\7p\2\2\u0182"+
		"\u0183\7p\2\2\u0183\u0184\7g\2\2\u0184\u0185\7o\2\2\u0185\u0186\7k\2\2"+
		"\u0186D\3\2\2\2\u0187\u0188\7o\2\2\u0188\u0189\7c\2\2\u0189\u018a\7r\2"+
		"\2\u018aF\3\2\2\2\u018b\u018c\7t\2\2\u018c\u018d\7c\2\2\u018d\u018e\7"+
		"f\2\2\u018e\u018f\7k\2\2\u018f\u0190\7q\2\2\u0190H\3\2\2\2\u0191\u0192"+
		"\7c\2\2\u0192\u0193\7o\2\2\u0193\u0194\7o\2\2\u0194\u0195\7q\2\2\u0195"+
		"J\3\2\2\2\u0196\u0197\7h\2\2\u0197\u0198\7t\2\2\u0198\u0199\7w\2\2\u0199"+
		"\u019a\7k\2\2\u019a\u019b\7v\2\2\u019b\u019c\7u\2\2\u019cL\3\2\2\2\u019d"+
		"\u019e\7u\2\2\u019e\u019f\7q\2\2\u019f\u01a0\7f\2\2\u01a0\u01a1\7c\2\2"+
		"\u01a1N\3\2\2\2\u01a2\u01a3\7p\2\2\u01a3\u01a4\7g\2\2\u01a4\u01a5\7c\2"+
		"\2\u01a5\u01a6\7t\2\2\u01a6\u01a7\7d\2\2\u01a7\u01a8\7{\2\2\u01a8P\3\2"+
		"\2\2\u01a9\u01aa\7v\2\2\u01aa\u01ab\7t\2\2\u01ab\u01ac\7w\2\2\u01ac\u01ad"+
		"\7g\2\2\u01adR\3\2\2\2\u01ae\u01af\7h\2\2\u01af\u01b0\7c\2\2\u01b0\u01b1"+
		"\7n\2\2\u01b1\u01b2\7u\2\2\u01b2\u01b3\7g\2\2\u01b3T\3\2\2\2\u01b4\u01b5"+
		"\7k\2\2\u01b5\u01b6\7u\2\2\u01b6V\3\2\2\2\u01b7\u01b8\7i\2\2\u01b8\u01b9"+
		"\7t\2\2\u01b9\u01ba\7c\2\2\u01ba\u01bb\7c\2\2\u01bb\u01bc\7n\2\2\u01bc"+
		"X\3\2\2\2\u01bd\u01be\7p\2\2\u01be\u01bf\7q\2\2\u01bf\u01c0\7v\2\2\u01c0"+
		"Z\3\2\2\2\u01c1\u01c2\7c\2\2\u01c2\u01c3\7p\2\2\u01c3\u01c4\7f\2\2\u01c4"+
		"\\\3\2\2\2\u01c5\u01c6\7q\2\2\u01c6\u01c7\7t\2\2\u01c7^\3\2\2\2\u01c8"+
		"\u01c9\7>\2\2\u01c9`\3\2\2\2\u01ca\u01cb\7@\2\2\u01cbb\3\2\2\2\u01cc\u01cd"+
		"\7?\2\2\u01cdd\3\2\2\2\u01ce\u01cf\7-\2\2\u01cff\3\2\2\2\u01d0\u01d1\7"+
		"/\2\2\u01d1h\3\2\2\2\u01d2\u01d3\7,\2\2\u01d3j\3\2\2\2\u01d4\u01d5\7\61"+
		"\2\2\u01d5l\3\2\2\2\u01d6\u01d7\7\'\2\2\u01d7n\3\2\2\2\u01d8\u01d9\7o"+
		"\2\2\u01d9\u01da\7q\2\2\u01da\u01db\7x\2\2\u01db\u01dc\7g\2\2\u01dcp\3"+
		"\2\2\2\u01dd\u01de\7p\2\2\u01de\u01df\7q\2\2\u01df\u01e0\7t\2\2\u01e0"+
		"\u01e1\7v\2\2\u01e1\u01e2\7j\2\2\u01e2r\3\2\2\2\u01e3\u01e4\7u\2\2\u01e4"+
		"\u01e5\7q\2\2\u01e5\u01e6\7w\2\2\u01e6\u01e7\7v\2\2\u01e7\u01e8\7j\2\2"+
		"\u01e8t\3\2\2\2\u01e9\u01ea\7g\2\2\u01ea\u01eb\7c\2\2\u01eb\u01ec\7u\2"+
		"\2\u01ec\u01ed\7v\2\2\u01edv\3\2\2\2\u01ee\u01ef\7y\2\2\u01ef\u01f0\7"+
		"g\2\2\u01f0\u01f1\7u\2\2\u01f1\u01f2\7v\2\2\u01f2x\3\2\2\2\u01f3\u01f4"+
		"\7u\2\2\u01f4\u01f5\7j\2\2\u01f5\u01f6\7q\2\2\u01f6\u01f7\7q\2\2\u01f7"+
		"\u01f8\7v\2\2\u01f8z\3\2\2\2\u01f9\u01fa\7w\2\2\u01fa\u01fb\7u\2\2\u01fb"+
		"\u01fc\7g\2\2\u01fc|\3\2\2\2\u01fd\u01fe\7p\2\2\u01fe\u01ff\7q\2\2\u01ff"+
		"\u0200\7v\2\2\u0200\u0201\7j\2\2\u0201\u0202\7k\2\2\u0202\u0203\7p\2\2"+
		"\u0203\u0204\7i\2\2\u0204~\3\2\2\2\u0205\u0206\7p\2\2\u0206\u0207\7g\2"+
		"\2\u0207\u0208\7z\2\2\u0208\u0209\7v\2\2\u0209\u0080\3\2\2\2\u020a\u020b"+
		"\7]\2\2\u020b\u0082\3\2\2\2\u020c\u020d\7_\2\2\u020d\u0084\3\2\2\2\u020e"+
		"\u020f\7.\2\2\u020f\u0086\3\2\2\2\u0210\u0211\7<\2\2\u0211\u0088\3\2\2"+
		"\2\u0212\u0213\7=\2\2\u0213\u008a\3\2\2\2\u0214\u0215\7*\2\2\u0215\u008c"+
		"\3\2\2\2\u0216\u0217\7+\2\2\u0217\u008e\3\2\2\2\u0218\u021a\5\u0093J\2"+
		"\u0219\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c"+
		"\3\2\2\2\u021c\u0090\3\2\2\2\u021d\u021e\t\2\2\2\u021e\u0092\3\2\2\2\u021f"+
		"\u0220\4\62;\2\u0220\u0094\3\2\2\2\u0221\u0222\7\61\2\2\u0222\u0223\7"+
		",\2\2\u0223\u0227\3\2\2\2\u0224\u0226\13\2\2\2\u0225\u0224\3\2\2\2\u0226"+
		"\u0229\3\2\2\2\u0227\u0228\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u022a\3\2"+
		"\2\2\u0229\u0227\3\2\2\2\u022a\u022b\7,\2\2\u022b\u022c\7\61\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022e\bK\2\2\u022e\u0096\3\2\2\2\u022f\u0231\7\17"+
		"\2\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		"\u0233\7\f\2\2\u0233\u0234\3\2\2\2\u0234\u0235\bL\2\2\u0235\u0098\3\2"+
		"\2\2\u0236\u0238\t\3\2\2\u0237\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\bM"+
		"\2\2\u023c\u009a\3\2\2\2\t\2\u00c3\u00c5\u021b\u0227\u0230\u0239\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}