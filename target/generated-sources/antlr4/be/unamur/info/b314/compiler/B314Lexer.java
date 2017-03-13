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
		ID=1, NUMBER=2, COMMENT=3, NEWLINE=4, WS=5, BOOLEAN=6, INTEGER=7, SQUARE=8, 
		VOID=9, CROCHET_OUVERT=10, CROCHET_FERME=11, VIRGULE=12, DEUXPOINTS=13, 
		POINtVIRGULE=14, PAR_OUVERT=15, PAR_FERME=16, AS=17, LATITUDE=18, LONGITUDE=19, 
		GRID_SIZE=20, COUNT=21, LIFE=22, DIRT=23, ROCK=24, VINES=25, ZOMBIE=26, 
		PLAYER=27, ENNEMI=28, MAP=29, RADIO=30, AMMO=31, FRUITS=32, SODA=33, NEARBY=34, 
		TRUE=35, FALSE=36, IS=37, GRAAL=38, NOT=39, AND=40, OR=41, INF=42, SUP=43, 
		EGALE=44, PLUS=45, MOINS=46, MUL=47, DIV=48, DIV_ENT=49, MOVE=50, NORTH=51, 
		SOUTH=52, EAST=53, WEST=54, SHOOT=55, USE=56, NOTHING=57, NEXT=58, START=59, 
		TSTART=60, FUNCTION=61, DLOCAL=62, DONE=63, DO=64, WHEN=65, BYDEF=66, 
		IF=67, THEN=68, WHILE=69, SET=70, COMPUTE=71, ELSE=72, TO=73, SKIPPPP=74;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ID", "NUMBER", "LETTER", "DIGIT", "COMMENT", "NEWLINE", "WS", "BOOLEAN", 
		"INTEGER", "SQUARE", "VOID", "CROCHET_OUVERT", "CROCHET_FERME", "VIRGULE", 
		"DEUXPOINTS", "POINtVIRGULE", "PAR_OUVERT", "PAR_FERME", "AS", "LATITUDE", 
		"LONGITUDE", "GRID_SIZE", "COUNT", "LIFE", "DIRT", "ROCK", "VINES", "ZOMBIE", 
		"PLAYER", "ENNEMI", "MAP", "RADIO", "AMMO", "FRUITS", "SODA", "NEARBY", 
		"TRUE", "FALSE", "IS", "GRAAL", "NOT", "AND", "OR", "INF", "SUP", "EGALE", 
		"PLUS", "MOINS", "MUL", "DIV", "DIV_ENT", "MOVE", "NORTH", "SOUTH", "EAST", 
		"WEST", "SHOOT", "USE", "NOTHING", "NEXT", "START", "TSTART", "FUNCTION", 
		"DLOCAL", "DONE", "DO", "WHEN", "BYDEF", "IF", "THEN", "WHILE", "SET", 
		"COMPUTE", "ELSE", "TO", "SKIPPPP"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'boolean'", "'integer'", "'square'", 
		"'void'", "'['", "']'", "','", "':'", "';'", "'('", "')'", "'as'", "'latitude'", 
		"'longitude'", "'grid size'", "'count'", "'life'", "'dirt'", "'rock'", 
		"'vines'", "'zombie'", "'player'", "'ennemi'", "'map'", "'radio'", "'ammo'", 
		"'fruits'", "'soda'", "'nearby'", "'true'", "'false'", "'is'", "'graal'", 
		"'not'", "'and'", "'or'", "'<'", "'>'", "'='", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'move'", "'north'", "'south'", "'east'", "'west'", "'shoot'", 
		"'use'", "'nothing'", "'next'", "'declare and retain'", "'when your turn'", 
		"'function'", "'declare local'", "'done'", "'do'", "'when'", "'by default'", 
		"'if'", "'then'", "'while'", "'set'", "'compute'", "'else'", "'to'", "'skip'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "NUMBER", "COMMENT", "NEWLINE", "WS", "BOOLEAN", "INTEGER", 
		"SQUARE", "VOID", "CROCHET_OUVERT", "CROCHET_FERME", "VIRGULE", "DEUXPOINTS", 
		"POINtVIRGULE", "PAR_OUVERT", "PAR_FERME", "AS", "LATITUDE", "LONGITUDE", 
		"GRID_SIZE", "COUNT", "LIFE", "DIRT", "ROCK", "VINES", "ZOMBIE", "PLAYER", 
		"ENNEMI", "MAP", "RADIO", "AMMO", "FRUITS", "SODA", "NEARBY", "TRUE", 
		"FALSE", "IS", "GRAAL", "NOT", "AND", "OR", "INF", "SUP", "EGALE", "PLUS", 
		"MOINS", "MUL", "DIV", "DIV_ENT", "MOVE", "NORTH", "SOUTH", "EAST", "WEST", 
		"SHOOT", "USE", "NOTHING", "NEXT", "START", "TSTART", "FUNCTION", "DLOCAL", 
		"DONE", "DO", "WHEN", "BYDEF", "IF", "THEN", "WHILE", "SET", "COMPUTE", 
		"ELSE", "TO", "SKIPPPP"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2L\u023d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\7\2\u009f\n\2\f\2\16\2\u00a2\13"+
		"\2\3\3\6\3\u00a5\n\3\r\3\16\3\u00a6\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7"+
		"\6\u00b1\n\6\f\6\16\6\u00b4\13\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7\u00bc\n\7"+
		"\3\7\3\7\3\7\3\7\3\b\6\b\u00c3\n\b\r\b\16\b\u00c4\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3"+
		"+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3"+
		":\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3"+
		"I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3M\3M\3M\3M\3"+
		"M\3\u00b2\2N\3\3\5\4\7\2\t\2\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33"+
		"\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\33"+
		"9\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64"+
		"k\65m\66o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089D\u008b"+
		"E\u008dF\u008fG\u0091H\u0093I\u0095J\u0097K\u0099L\3\2\4\4\2C\\c|\4\2"+
		"\13\13\"\"\u0240\2\3\3\2\2\2\2\5\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2"+
		"\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\3\u009b\3\2\2\2\5\u00a4\3\2\2\2\7\u00a8\3\2\2"+
		"\2\t\u00aa\3\2\2\2\13\u00ac\3\2\2\2\r\u00bb\3\2\2\2\17\u00c2\3\2\2\2\21"+
		"\u00c8\3\2\2\2\23\u00d0\3\2\2\2\25\u00d8\3\2\2\2\27\u00df\3\2\2\2\31\u00e4"+
		"\3\2\2\2\33\u00e6\3\2\2\2\35\u00e8\3\2\2\2\37\u00ea\3\2\2\2!\u00ec\3\2"+
		"\2\2#\u00ee\3\2\2\2%\u00f0\3\2\2\2\'\u00f2\3\2\2\2)\u00f5\3\2\2\2+\u00fe"+
		"\3\2\2\2-\u0108\3\2\2\2/\u0112\3\2\2\2\61\u0118\3\2\2\2\63\u011d\3\2\2"+
		"\2\65\u0122\3\2\2\2\67\u0127\3\2\2\29\u012d\3\2\2\2;\u0134\3\2\2\2=\u013b"+
		"\3\2\2\2?\u0142\3\2\2\2A\u0146\3\2\2\2C\u014c\3\2\2\2E\u0151\3\2\2\2G"+
		"\u0158\3\2\2\2I\u015d\3\2\2\2K\u0164\3\2\2\2M\u0169\3\2\2\2O\u016f\3\2"+
		"\2\2Q\u0172\3\2\2\2S\u0178\3\2\2\2U\u017c\3\2\2\2W\u0180\3\2\2\2Y\u0183"+
		"\3\2\2\2[\u0185\3\2\2\2]\u0187\3\2\2\2_\u0189\3\2\2\2a\u018b\3\2\2\2c"+
		"\u018d\3\2\2\2e\u018f\3\2\2\2g\u0191\3\2\2\2i\u0193\3\2\2\2k\u0198\3\2"+
		"\2\2m\u019e\3\2\2\2o\u01a4\3\2\2\2q\u01a9\3\2\2\2s\u01ae\3\2\2\2u\u01b4"+
		"\3\2\2\2w\u01b8\3\2\2\2y\u01c0\3\2\2\2{\u01c5\3\2\2\2}\u01d8\3\2\2\2\177"+
		"\u01e7\3\2\2\2\u0081\u01f0\3\2\2\2\u0083\u01fe\3\2\2\2\u0085\u0203\3\2"+
		"\2\2\u0087\u0206\3\2\2\2\u0089\u020b\3\2\2\2\u008b\u0216\3\2\2\2\u008d"+
		"\u0219\3\2\2\2\u008f\u021e\3\2\2\2\u0091\u0224\3\2\2\2\u0093\u0228\3\2"+
		"\2\2\u0095\u0230\3\2\2\2\u0097\u0235\3\2\2\2\u0099\u0238\3\2\2\2\u009b"+
		"\u00a0\5\7\4\2\u009c\u009f\5\7\4\2\u009d\u009f\5\t\5\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\5\t\5\2"+
		"\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\6\3\2\2\2\u00a8\u00a9\t\2\2\2\u00a9\b\3\2\2\2\u00aa\u00ab"+
		"\4\62;\2\u00ab\n\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae\7,\2\2\u00ae"+
		"\u00b2\3\2\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00b9\b\6\2\2\u00b9\f\3\2\2\2\u00ba\u00bc\7\17\2\2\u00bb\u00ba"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\f\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\b\7\2\2\u00c0\16\3\2\2\2\u00c1\u00c3\t\3\2"+
		"\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\b\2\2\u00c7\20\3\2\2\2\u00c8"+
		"\u00c9\7d\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7n\2\2"+
		"\u00cc\u00cd\7g\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7p\2\2\u00cf\22\3\2"+
		"\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4"+
		"\7g\2\2\u00d4\u00d5\7i\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7t\2\2\u00d7"+
		"\24\3\2\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7s\2\2\u00da\u00db\7w\2\2\u00db"+
		"\u00dc\7c\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de\26\3\2\2\2\u00df"+
		"\u00e0\7x\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7f\2\2"+
		"\u00e3\30\3\2\2\2\u00e4\u00e5\7]\2\2\u00e5\32\3\2\2\2\u00e6\u00e7\7_\2"+
		"\2\u00e7\34\3\2\2\2\u00e8\u00e9\7.\2\2\u00e9\36\3\2\2\2\u00ea\u00eb\7"+
		"<\2\2\u00eb \3\2\2\2\u00ec\u00ed\7=\2\2\u00ed\"\3\2\2\2\u00ee\u00ef\7"+
		"*\2\2\u00ef$\3\2\2\2\u00f0\u00f1\7+\2\2\u00f1&\3\2\2\2\u00f2\u00f3\7c"+
		"\2\2\u00f3\u00f4\7u\2\2\u00f4(\3\2\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7"+
		"\7c\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7v\2\2\u00fa"+
		"\u00fb\7w\2\2\u00fb\u00fc\7f\2\2\u00fc\u00fd\7g\2\2\u00fd*\3\2\2\2\u00fe"+
		"\u00ff\7n\2\2\u00ff\u0100\7q\2\2\u0100\u0101\7p\2\2\u0101\u0102\7i\2\2"+
		"\u0102\u0103\7k\2\2\u0103\u0104\7v\2\2\u0104\u0105\7w\2\2\u0105\u0106"+
		"\7f\2\2\u0106\u0107\7g\2\2\u0107,\3\2\2\2\u0108\u0109\7i\2\2\u0109\u010a"+
		"\7t\2\2\u010a\u010b\7k\2\2\u010b\u010c\7f\2\2\u010c\u010d\7\"\2\2\u010d"+
		"\u010e\7u\2\2\u010e\u010f\7k\2\2\u010f\u0110\7|\2\2\u0110\u0111\7g\2\2"+
		"\u0111.\3\2\2\2\u0112\u0113\7e\2\2\u0113\u0114\7q\2\2\u0114\u0115\7w\2"+
		"\2\u0115\u0116\7p\2\2\u0116\u0117\7v\2\2\u0117\60\3\2\2\2\u0118\u0119"+
		"\7n\2\2\u0119\u011a\7k\2\2\u011a\u011b\7h\2\2\u011b\u011c\7g\2\2\u011c"+
		"\62\3\2\2\2\u011d\u011e\7f\2\2\u011e\u011f\7k\2\2\u011f\u0120\7t\2\2\u0120"+
		"\u0121\7v\2\2\u0121\64\3\2\2\2\u0122\u0123\7t\2\2\u0123\u0124\7q\2\2\u0124"+
		"\u0125\7e\2\2\u0125\u0126\7m\2\2\u0126\66\3\2\2\2\u0127\u0128\7x\2\2\u0128"+
		"\u0129\7k\2\2\u0129\u012a\7p\2\2\u012a\u012b\7g\2\2\u012b\u012c\7u\2\2"+
		"\u012c8\3\2\2\2\u012d\u012e\7|\2\2\u012e\u012f\7q\2\2\u012f\u0130\7o\2"+
		"\2\u0130\u0131\7d\2\2\u0131\u0132\7k\2\2\u0132\u0133\7g\2\2\u0133:\3\2"+
		"\2\2\u0134\u0135\7r\2\2\u0135\u0136\7n\2\2\u0136\u0137\7c\2\2\u0137\u0138"+
		"\7{\2\2\u0138\u0139\7g\2\2\u0139\u013a\7t\2\2\u013a<\3\2\2\2\u013b\u013c"+
		"\7g\2\2\u013c\u013d\7p\2\2\u013d\u013e\7p\2\2\u013e\u013f\7g\2\2\u013f"+
		"\u0140\7o\2\2\u0140\u0141\7k\2\2\u0141>\3\2\2\2\u0142\u0143\7o\2\2\u0143"+
		"\u0144\7c\2\2\u0144\u0145\7r\2\2\u0145@\3\2\2\2\u0146\u0147\7t\2\2\u0147"+
		"\u0148\7c\2\2\u0148\u0149\7f\2\2\u0149\u014a\7k\2\2\u014a\u014b\7q\2\2"+
		"\u014bB\3\2\2\2\u014c\u014d\7c\2\2\u014d\u014e\7o\2\2\u014e\u014f\7o\2"+
		"\2\u014f\u0150\7q\2\2\u0150D\3\2\2\2\u0151\u0152\7h\2\2\u0152\u0153\7"+
		"t\2\2\u0153\u0154\7w\2\2\u0154\u0155\7k\2\2\u0155\u0156\7v\2\2\u0156\u0157"+
		"\7u\2\2\u0157F\3\2\2\2\u0158\u0159\7u\2\2\u0159\u015a\7q\2\2\u015a\u015b"+
		"\7f\2\2\u015b\u015c\7c\2\2\u015cH\3\2\2\2\u015d\u015e\7p\2\2\u015e\u015f"+
		"\7g\2\2\u015f\u0160\7c\2\2\u0160\u0161\7t\2\2\u0161\u0162\7d\2\2\u0162"+
		"\u0163\7{\2\2\u0163J\3\2\2\2\u0164\u0165\7v\2\2\u0165\u0166\7t\2\2\u0166"+
		"\u0167\7w\2\2\u0167\u0168\7g\2\2\u0168L\3\2\2\2\u0169\u016a\7h\2\2\u016a"+
		"\u016b\7c\2\2\u016b\u016c\7n\2\2\u016c\u016d\7u\2\2\u016d\u016e\7g\2\2"+
		"\u016eN\3\2\2\2\u016f\u0170\7k\2\2\u0170\u0171\7u\2\2\u0171P\3\2\2\2\u0172"+
		"\u0173\7i\2\2\u0173\u0174\7t\2\2\u0174\u0175\7c\2\2\u0175\u0176\7c\2\2"+
		"\u0176\u0177\7n\2\2\u0177R\3\2\2\2\u0178\u0179\7p\2\2\u0179\u017a\7q\2"+
		"\2\u017a\u017b\7v\2\2\u017bT\3\2\2\2\u017c\u017d\7c\2\2\u017d\u017e\7"+
		"p\2\2\u017e\u017f\7f\2\2\u017fV\3\2\2\2\u0180\u0181\7q\2\2\u0181\u0182"+
		"\7t\2\2\u0182X\3\2\2\2\u0183\u0184\7>\2\2\u0184Z\3\2\2\2\u0185\u0186\7"+
		"@\2\2\u0186\\\3\2\2\2\u0187\u0188\7?\2\2\u0188^\3\2\2\2\u0189\u018a\7"+
		"-\2\2\u018a`\3\2\2\2\u018b\u018c\7/\2\2\u018cb\3\2\2\2\u018d\u018e\7,"+
		"\2\2\u018ed\3\2\2\2\u018f\u0190\7\61\2\2\u0190f\3\2\2\2\u0191\u0192\7"+
		"\'\2\2\u0192h\3\2\2\2\u0193\u0194\7o\2\2\u0194\u0195\7q\2\2\u0195\u0196"+
		"\7x\2\2\u0196\u0197\7g\2\2\u0197j\3\2\2\2\u0198\u0199\7p\2\2\u0199\u019a"+
		"\7q\2\2\u019a\u019b\7t\2\2\u019b\u019c\7v\2\2\u019c\u019d\7j\2\2\u019d"+
		"l\3\2\2\2\u019e\u019f\7u\2\2\u019f\u01a0\7q\2\2\u01a0\u01a1\7w\2\2\u01a1"+
		"\u01a2\7v\2\2\u01a2\u01a3\7j\2\2\u01a3n\3\2\2\2\u01a4\u01a5\7g\2\2\u01a5"+
		"\u01a6\7c\2\2\u01a6\u01a7\7u\2\2\u01a7\u01a8\7v\2\2\u01a8p\3\2\2\2\u01a9"+
		"\u01aa\7y\2\2\u01aa\u01ab\7g\2\2\u01ab\u01ac\7u\2\2\u01ac\u01ad\7v\2\2"+
		"\u01adr\3\2\2\2\u01ae\u01af\7u\2\2\u01af\u01b0\7j\2\2\u01b0\u01b1\7q\2"+
		"\2\u01b1\u01b2\7q\2\2\u01b2\u01b3\7v\2\2\u01b3t\3\2\2\2\u01b4\u01b5\7"+
		"w\2\2\u01b5\u01b6\7u\2\2\u01b6\u01b7\7g\2\2\u01b7v\3\2\2\2\u01b8\u01b9"+
		"\7p\2\2\u01b9\u01ba\7q\2\2\u01ba\u01bb\7v\2\2\u01bb\u01bc\7j\2\2\u01bc"+
		"\u01bd\7k\2\2\u01bd\u01be\7p\2\2\u01be\u01bf\7i\2\2\u01bfx\3\2\2\2\u01c0"+
		"\u01c1\7p\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3\7z\2\2\u01c3\u01c4\7v\2\2"+
		"\u01c4z\3\2\2\2\u01c5\u01c6\7f\2\2\u01c6\u01c7\7g\2\2\u01c7\u01c8\7e\2"+
		"\2\u01c8\u01c9\7n\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb\7t\2\2\u01cb\u01cc"+
		"\7g\2\2\u01cc\u01cd\7\"\2\2\u01cd\u01ce\7c\2\2\u01ce\u01cf\7p\2\2\u01cf"+
		"\u01d0\7f\2\2\u01d0\u01d1\7\"\2\2\u01d1\u01d2\7t\2\2\u01d2\u01d3\7g\2"+
		"\2\u01d3\u01d4\7v\2\2\u01d4\u01d5\7c\2\2\u01d5\u01d6\7k\2\2\u01d6\u01d7"+
		"\7p\2\2\u01d7|\3\2\2\2\u01d8\u01d9\7y\2\2\u01d9\u01da\7j\2\2\u01da\u01db"+
		"\7g\2\2\u01db\u01dc\7p\2\2\u01dc\u01dd\7\"\2\2\u01dd\u01de\7{\2\2\u01de"+
		"\u01df\7q\2\2\u01df\u01e0\7w\2\2\u01e0\u01e1\7t\2\2\u01e1\u01e2\7\"\2"+
		"\2\u01e2\u01e3\7v\2\2\u01e3\u01e4\7w\2\2\u01e4\u01e5\7t\2\2\u01e5\u01e6"+
		"\7p\2\2\u01e6~\3\2\2\2\u01e7\u01e8\7h\2\2\u01e8\u01e9\7w\2\2\u01e9\u01ea"+
		"\7p\2\2\u01ea\u01eb\7e\2\2\u01eb\u01ec\7v\2\2\u01ec\u01ed\7k\2\2\u01ed"+
		"\u01ee\7q\2\2\u01ee\u01ef\7p\2\2\u01ef\u0080\3\2\2\2\u01f0\u01f1\7f\2"+
		"\2\u01f1\u01f2\7g\2\2\u01f2\u01f3\7e\2\2\u01f3\u01f4\7n\2\2\u01f4\u01f5"+
		"\7c\2\2\u01f5\u01f6\7t\2\2\u01f6\u01f7\7g\2\2\u01f7\u01f8\7\"\2\2\u01f8"+
		"\u01f9\7n\2\2\u01f9\u01fa\7q\2\2\u01fa\u01fb\7e\2\2\u01fb\u01fc\7c\2\2"+
		"\u01fc\u01fd\7n\2\2\u01fd\u0082\3\2\2\2\u01fe\u01ff\7f\2\2\u01ff\u0200"+
		"\7q\2\2\u0200\u0201\7p\2\2\u0201\u0202\7g\2\2\u0202\u0084\3\2\2\2\u0203"+
		"\u0204\7f\2\2\u0204\u0205\7q\2\2\u0205\u0086\3\2\2\2\u0206\u0207\7y\2"+
		"\2\u0207\u0208\7j\2\2\u0208\u0209\7g\2\2\u0209\u020a\7p\2\2\u020a\u0088"+
		"\3\2\2\2\u020b\u020c\7d\2\2\u020c\u020d\7{\2\2\u020d\u020e\7\"\2\2\u020e"+
		"\u020f\7f\2\2\u020f\u0210\7g\2\2\u0210\u0211\7h\2\2\u0211\u0212\7c\2\2"+
		"\u0212\u0213\7w\2\2\u0213\u0214\7n\2\2\u0214\u0215\7v\2\2\u0215\u008a"+
		"\3\2\2\2\u0216\u0217\7k\2\2\u0217\u0218\7h\2\2\u0218\u008c\3\2\2\2\u0219"+
		"\u021a\7v\2\2\u021a\u021b\7j\2\2\u021b\u021c\7g\2\2\u021c\u021d\7p\2\2"+
		"\u021d\u008e\3\2\2\2\u021e\u021f\7y\2\2\u021f\u0220\7j\2\2\u0220\u0221"+
		"\7k\2\2\u0221\u0222\7n\2\2\u0222\u0223\7g\2\2\u0223\u0090\3\2\2\2\u0224"+
		"\u0225\7u\2\2\u0225\u0226\7g\2\2\u0226\u0227\7v\2\2\u0227\u0092\3\2\2"+
		"\2\u0228\u0229\7e\2\2\u0229\u022a\7q\2\2\u022a\u022b\7o\2\2\u022b\u022c"+
		"\7r\2\2\u022c\u022d\7w\2\2\u022d\u022e\7v\2\2\u022e\u022f\7g\2\2\u022f"+
		"\u0094\3\2\2\2\u0230\u0231\7g\2\2\u0231\u0232\7n\2\2\u0232\u0233\7u\2"+
		"\2\u0233\u0234\7g\2\2\u0234\u0096\3\2\2\2\u0235\u0236\7v\2\2\u0236\u0237"+
		"\7q\2\2\u0237\u0098\3\2\2\2\u0238\u0239\7u\2\2\u0239\u023a\7m\2\2\u023a"+
		"\u023b\7k\2\2\u023b\u023c\7r\2\2\u023c\u009a\3\2\2\2\t\2\u009e\u00a0\u00a6"+
		"\u00b2\u00bb\u00c4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}