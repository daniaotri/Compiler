// Generated from be\u005Cunamur\info\b314\compiler\B314.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class B314Parser extends Parser {
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
		PAR_FERME=70, NUMBER=71, COMMENT=72, NEWLINE=73, WS=74, DIGIT=75;
	public static final int
		RULE_type = 0, RULE_scalar = 1, RULE_array = 2, RULE_exprD = 3, RULE_environnementInt = 4, 
		RULE_environnementBool = 5, RULE_environnementCase = 6, RULE_exprG = 7, 
		RULE_entier = 8, RULE_instruction = 9, RULE_action = 10, RULE_programme = 11, 
		RULE_progDecl = 12, RULE_fctDecl = 13, RULE_fctType = 14, RULE_paramDecl = 15, 
		RULE_varDecl = 16, RULE_clauseWhen = 17, RULE_clauseDefault = 18;
	public static final String[] ruleNames = {
		"type", "scalar", "array", "exprD", "environnementInt", "environnementBool", 
		"environnementCase", "exprG", "entier", "instruction", "action", "programme", 
		"progDecl", "fctDecl", "fctType", "paramDecl", "varDecl", "clauseWhen", 
		"clauseDefault"
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
		"COMMENT", "NEWLINE", "WS", "DIGIT"
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

	@Override
	public String getGrammarFileName() { return "B314.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public B314Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeContext extends ParserRuleContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				scalar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				array();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(B314Parser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(B314Parser.INTEGER, 0); }
		public TerminalNode SQUARE() { return getToken(B314Parser.SQUARE, 0); }
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitScalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << SQUARE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TerminalNode CROCHET_OUVERT() { return getToken(B314Parser.CROCHET_OUVERT, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(B314Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(B314Parser.NUMBER, i);
		}
		public TerminalNode CROCHET_FERME() { return getToken(B314Parser.CROCHET_FERME, 0); }
		public TerminalNode VIRGULE() { return getToken(B314Parser.VIRGULE, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			scalar();
			setState(45);
			match(CROCHET_OUVERT);
			setState(46);
			match(NUMBER);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULE) {
				{
				setState(47);
				match(VIRGULE);
				setState(48);
				match(NUMBER);
				}
			}

			setState(51);
			match(CROCHET_FERME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprDContext extends ParserRuleContext {
		public ExprDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprD; }
	 
		public ExprDContext() { }
		public void copyFrom(ExprDContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprParContext extends ExprDContext {
		public TerminalNode PAR_OUVERT() { return getToken(B314Parser.PAR_OUVERT, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode PAR_FERME() { return getToken(B314Parser.PAR_FERME, 0); }
		public ExprParContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEnvCaseContext extends ExprDContext {
		public EnvironnementCaseContext environnementCase() {
			return getRuleContext(EnvironnementCaseContext.class,0);
		}
		public ExprEnvCaseContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEnvCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEnvCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEnvCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntierContext extends ExprDContext {
		public EntierContext entier() {
			return getRuleContext(EntierContext.class,0);
		}
		public ExprEntierContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNearbyContext extends ExprDContext {
		public TerminalNode NEARBY() { return getToken(B314Parser.NEARBY, 0); }
		public TerminalNode CROCHET_OUVERT() { return getToken(B314Parser.CROCHET_OUVERT, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode VIRGULE() { return getToken(B314Parser.VIRGULE, 0); }
		public TerminalNode CROCHET_FERME() { return getToken(B314Parser.CROCHET_FERME, 0); }
		public ExprNearbyContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprNearby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprNearby(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprNearby(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDexprGContext extends ExprDContext {
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ExprDexprGContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprDexprG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprDexprG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprDexprG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExprDContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode PAR_OUVERT() { return getToken(B314Parser.PAR_OUVERT, 0); }
		public TerminalNode PAR_FERME() { return getToken(B314Parser.PAR_FERME, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public List<TerminalNode> VIRGULE() { return getTokens(B314Parser.VIRGULE); }
		public TerminalNode VIRGULE(int i) {
			return getToken(B314Parser.VIRGULE, i);
		}
		public FunctionCallContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEnvIntContext extends ExprDContext {
		public EnvironnementIntContext environnementInt() {
			return getRuleContext(EnvironnementIntContext.class,0);
		}
		public ExprEnvIntContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEnvInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEnvInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEnvInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEnvBoolContext extends ExprDContext {
		public EnvironnementBoolContext environnementBool() {
			return getRuleContext(EnvironnementBoolContext.class,0);
		}
		public ExprEnvBoolContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEnvBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEnvBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEnvBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOpContext extends ExprDContext {
		public ExprDContext expr1;
		public Token op;
		public ExprDContext expr2;
		public TerminalNode NOT() { return getToken(B314Parser.NOT, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(B314Parser.PLUS, 0); }
		public TerminalNode MOINS() { return getToken(B314Parser.MOINS, 0); }
		public TerminalNode MUL() { return getToken(B314Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(B314Parser.DIV, 0); }
		public TerminalNode DIV_ENT() { return getToken(B314Parser.DIV_ENT, 0); }
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode OR() { return getToken(B314Parser.OR, 0); }
		public TerminalNode INF() { return getToken(B314Parser.INF, 0); }
		public TerminalNode SUP() { return getToken(B314Parser.SUP, 0); }
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public ExprOpContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprDContext exprD() throws RecognitionException {
		return exprD(0);
	}

	private ExprDContext exprD(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprDContext _localctx = new ExprDContext(_ctx, _parentState);
		ExprDContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exprD, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new ExprEntierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54);
				entier();
				}
				break;
			case 2:
				{
				_localctx = new ExprEnvIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				environnementInt();
				}
				break;
			case 3:
				{
				_localctx = new ExprEnvBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				environnementBool();
				}
				break;
			case 4:
				{
				_localctx = new ExprEnvCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				environnementCase();
				}
				break;
			case 5:
				{
				_localctx = new ExprDexprGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				exprG();
				}
				break;
			case 6:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(ID);
				setState(60);
				match(PAR_OUVERT);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID_SIZE) | (1L << LIFE) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << ENNEMI) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << NEARBY) | (1L << TRUE) | (1L << FALSE) | (1L << GRAAL) | (1L << NOT) | (1L << MOINS))) != 0) || _la==PAR_OUVERT || _la==DIGIT) {
					{
					setState(61);
					exprD(0);
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULE) {
						{
						{
						setState(62);
						match(VIRGULE);
						setState(63);
						exprD(0);
						}
						}
						setState(68);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(71);
				match(PAR_FERME);
				}
				break;
			case 7:
				{
				_localctx = new ExprParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(PAR_OUVERT);
				setState(73);
				exprD(0);
				setState(74);
				match(PAR_FERME);
				}
				break;
			case 8:
				{
				_localctx = new ExprOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(NOT);
				setState(77);
				exprD(6);
				}
				break;
			case 9:
				{
				_localctx = new ExprNearbyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(NEARBY);
				setState(79);
				match(CROCHET_OUVERT);
				setState(80);
				exprD(0);
				setState(81);
				match(VIRGULE);
				setState(82);
				exprD(0);
				setState(83);
				match(CROCHET_FERME);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprOpContext(new ExprDContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(87);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(88);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MOINS) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(89);
						((ExprOpContext)_localctx).expr2 = exprD(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprOpContext(new ExprDContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(90);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(91);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << DIV_ENT))) != 0)) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(92);
						((ExprOpContext)_localctx).expr2 = exprD(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprOpContext(new ExprDContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(93);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(94);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						((ExprOpContext)_localctx).expr2 = exprD(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprOpContext(new ExprDContext(_parentctx, _parentState));
						((ExprOpContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(96);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(97);
						((ExprOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INF) | (1L << SUP) | (1L << EGALE))) != 0)) ) {
							((ExprOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						((ExprOpContext)_localctx).expr2 = exprD(3);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnvironnementIntContext extends ParserRuleContext {
		public TerminalNode LATITUDE() { return getToken(B314Parser.LATITUDE, 0); }
		public TerminalNode LONGITUDE() { return getToken(B314Parser.LONGITUDE, 0); }
		public TerminalNode GRID_SIZE() { return getToken(B314Parser.GRID_SIZE, 0); }
		public TerminalNode COUNT() { return getToken(B314Parser.COUNT, 0); }
		public TerminalNode MAP() { return getToken(B314Parser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(B314Parser.RADIO, 0); }
		public TerminalNode AMMO() { return getToken(B314Parser.AMMO, 0); }
		public TerminalNode FRUITS() { return getToken(B314Parser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(B314Parser.SODA, 0); }
		public TerminalNode LIFE() { return getToken(B314Parser.LIFE, 0); }
		public EnvironnementIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environnementInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterEnvironnementInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitEnvironnementInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitEnvironnementInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvironnementIntContext environnementInt() throws RecognitionException {
		EnvironnementIntContext _localctx = new EnvironnementIntContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_environnementInt);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LATITUDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(LATITUDE);
				}
				break;
			case LONGITUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(LONGITUDE);
				}
				break;
			case GRID_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(GRID_SIZE);
				}
				break;
			case MAP:
			case RADIO:
			case AMMO:
			case FRUITS:
			case SODA:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(108);
				match(COUNT);
				}
				break;
			case LIFE:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(LIFE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironnementBoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(B314Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(B314Parser.FALSE, 0); }
		public TerminalNode ENNEMI() { return getToken(B314Parser.ENNEMI, 0); }
		public TerminalNode IS() { return getToken(B314Parser.IS, 0); }
		public TerminalNode NORTH() { return getToken(B314Parser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(B314Parser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(B314Parser.EAST, 0); }
		public TerminalNode WEST() { return getToken(B314Parser.WEST, 0); }
		public TerminalNode GRAAL() { return getToken(B314Parser.GRAAL, 0); }
		public EnvironnementBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environnementBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterEnvironnementBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitEnvironnementBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitEnvironnementBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvironnementBoolContext environnementBool() throws RecognitionException {
		EnvironnementBoolContext _localctx = new EnvironnementBoolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_environnementBool);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(FALSE);
				}
				break;
			case ENNEMI:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(ENNEMI);
				setState(115);
				match(IS);
				setState(116);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case GRAAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				match(GRAAL);
				setState(118);
				match(IS);
				setState(119);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironnementCaseContext extends ParserRuleContext {
		public TerminalNode DIRT() { return getToken(B314Parser.DIRT, 0); }
		public TerminalNode ROCK() { return getToken(B314Parser.ROCK, 0); }
		public TerminalNode VINES() { return getToken(B314Parser.VINES, 0); }
		public TerminalNode ZOMBIE() { return getToken(B314Parser.ZOMBIE, 0); }
		public TerminalNode PLAYER() { return getToken(B314Parser.PLAYER, 0); }
		public TerminalNode ENNEMI() { return getToken(B314Parser.ENNEMI, 0); }
		public TerminalNode MAP() { return getToken(B314Parser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(B314Parser.RADIO, 0); }
		public TerminalNode AMMO() { return getToken(B314Parser.AMMO, 0); }
		public TerminalNode FRUITS() { return getToken(B314Parser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(B314Parser.SODA, 0); }
		public EnvironnementCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environnementCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterEnvironnementCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitEnvironnementCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitEnvironnementCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvironnementCaseContext environnementCase() throws RecognitionException {
		EnvironnementCaseContext _localctx = new EnvironnementCaseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_environnementCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << ENNEMI) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprGContext extends ParserRuleContext {
		public ExprGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprG; }
	 
		public ExprGContext() { }
		public void copyFrom(ExprGContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableauExprGContext extends ExprGContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode CROCHET_OUVERT() { return getToken(B314Parser.CROCHET_OUVERT, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode CROCHET_FERME() { return getToken(B314Parser.CROCHET_FERME, 0); }
		public TerminalNode VIRGULE() { return getToken(B314Parser.VIRGULE, 0); }
		public TableauExprGContext(ExprGContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterTableauExprG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitTableauExprG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitTableauExprG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExprGContext extends ExprGContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public VariableExprGContext(ExprGContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVariableExprG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVariableExprG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVariableExprG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprGContext exprG() throws RecognitionException {
		ExprGContext _localctx = new ExprGContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprG);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new VariableExprGContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(ID);
				}
				break;
			case 2:
				_localctx = new TableauExprGContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(ID);
				setState(126);
				match(CROCHET_OUVERT);
				setState(127);
				exprD(0);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRGULE) {
					{
					setState(128);
					match(VIRGULE);
					setState(129);
					exprD(0);
					}
				}

				setState(132);
				match(CROCHET_FERME);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntierContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(B314Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(B314Parser.DIGIT, i);
		}
		public TerminalNode MOINS() { return getToken(B314Parser.MOINS, 0); }
		public EntierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterEntier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitEntier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitEntier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntierContext entier() throws RecognitionException {
		EntierContext _localctx = new EntierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_entier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MOINS) {
				{
				setState(136);
				match(MOINS);
				}
			}

			setState(139);
			match(DIGIT);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					match(DIGIT);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComputeContext extends InstructionContext {
		public TerminalNode COMPUTE() { return getToken(B314Parser.COMPUTE, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public ComputeContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterCompute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitCompute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitCompute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfthenelseContext extends InstructionContext {
		public TerminalNode IF() { return getToken(B314Parser.IF, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode THEN() { return getToken(B314Parser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(B314Parser.ELSE, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public IfthenelseContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterIfthenelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitIfthenelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitIfthenelse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NextActionContext extends InstructionContext {
		public TerminalNode NEXT() { return getToken(B314Parser.NEXT, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public NextActionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterNextAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitNextAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitNextAction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends InstructionContext {
		public TerminalNode WHILE() { return getToken(B314Parser.WHILE, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public WhileContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends InstructionContext {
		public TerminalNode IF() { return getToken(B314Parser.IF, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode THEN() { return getToken(B314Parser.THEN, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public IfContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkippppContext extends InstructionContext {
		public TerminalNode SKIPPPP() { return getToken(B314Parser.SKIPPPP, 0); }
		public SkippppContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterSkipppp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitSkipppp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitSkipppp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AffectationContext extends InstructionContext {
		public TerminalNode SET() { return getToken(B314Parser.SET, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode TO() { return getToken(B314Parser.TO, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public AffectationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAffectation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAffectation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAffectation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instruction);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new SkippppContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(SKIPPPP);
				}
				break;
			case 2:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(IF);
				setState(148);
				exprD(0);
				setState(149);
				match(THEN);
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150);
					instruction();
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << SKIPPPP) | (1L << NEXT))) != 0) );
				setState(155);
				match(DONE);
				}
				break;
			case 3:
				_localctx = new IfthenelseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(IF);
				setState(158);
				exprD(0);
				setState(159);
				match(THEN);
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(160);
					instruction();
					}
					}
					setState(163); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << SKIPPPP) | (1L << NEXT))) != 0) );
				setState(165);
				match(ELSE);
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					instruction();
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << SKIPPPP) | (1L << NEXT))) != 0) );
				setState(171);
				match(DONE);
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(WHILE);
				setState(174);
				exprD(0);
				setState(175);
				match(DO);
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					instruction();
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << SKIPPPP) | (1L << NEXT))) != 0) );
				setState(181);
				match(DONE);
				}
				break;
			case 5:
				_localctx = new AffectationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(SET);
				setState(184);
				exprG();
				setState(185);
				match(TO);
				setState(186);
				exprD(0);
				}
				break;
			case 6:
				_localctx = new ComputeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(COMPUTE);
				setState(189);
				exprD(0);
				}
				break;
			case 7:
				_localctx = new NextActionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				match(NEXT);
				setState(191);
				action();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(B314Parser.MOVE, 0); }
		public TerminalNode NORTH() { return getToken(B314Parser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(B314Parser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(B314Parser.EAST, 0); }
		public TerminalNode WEST() { return getToken(B314Parser.WEST, 0); }
		public TerminalNode SHOOT() { return getToken(B314Parser.SHOOT, 0); }
		public TerminalNode USE() { return getToken(B314Parser.USE, 0); }
		public TerminalNode MAP() { return getToken(B314Parser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(B314Parser.RADIO, 0); }
		public TerminalNode FRUITS() { return getToken(B314Parser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(B314Parser.SODA, 0); }
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode NOTHING() { return getToken(B314Parser.NOTHING, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_action);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(MOVE);
				setState(195);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SHOOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(SHOOT);
				setState(197);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(USE);
				setState(199);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(DO);
				setState(201);
				match(NOTHING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgrammeContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(B314Parser.START, 0); }
		public ProgDeclContext progDecl() {
			return getRuleContext(ProgDeclContext.class,0);
		}
		public TerminalNode TSTART() { return getToken(B314Parser.TSTART, 0); }
		public ClauseDefaultContext clauseDefault() {
			return getRuleContext(ClauseDefaultContext.class,0);
		}
		public List<ClauseWhenContext> clauseWhen() {
			return getRuleContexts(ClauseWhenContext.class);
		}
		public ClauseWhenContext clauseWhen(int i) {
			return getRuleContext(ClauseWhenContext.class,i);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitProgramme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_programme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(START);
			setState(205);
			progDecl();
			setState(206);
			match(TSTART);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(207);
				clauseWhen();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			clauseDefault();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgDeclContext extends ParserRuleContext {
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> POINtVIRGULE() { return getTokens(B314Parser.POINtVIRGULE); }
		public TerminalNode POINtVIRGULE(int i) {
			return getToken(B314Parser.POINtVIRGULE, i);
		}
		public List<FctDeclContext> fctDecl() {
			return getRuleContexts(FctDeclContext.class);
		}
		public FctDeclContext fctDecl(int i) {
			return getRuleContext(FctDeclContext.class,i);
		}
		public ProgDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterProgDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitProgDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitProgDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgDeclContext progDecl() throws RecognitionException {
		ProgDeclContext _localctx = new ProgDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_progDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(215);
					varDecl();
					setState(216);
					match(POINtVIRGULE);
					}
					break;
				case 2:
					{
					setState(218);
					fctDecl();
					}
					break;
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FctDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode AS() { return getToken(B314Parser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(B314Parser.FUNCTION, 0); }
		public TerminalNode PAR_OUVERT() { return getToken(B314Parser.PAR_OUVERT, 0); }
		public TerminalNode PAR_FERME() { return getToken(B314Parser.PAR_FERME, 0); }
		public TerminalNode DEUXPOINTS() { return getToken(B314Parser.DEUXPOINTS, 0); }
		public FctTypeContext fctType() {
			return getRuleContext(FctTypeContext.class,0);
		}
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public ParamDeclContext paramDecl() {
			return getRuleContext(ParamDeclContext.class,0);
		}
		public TerminalNode DLOCAL() { return getToken(B314Parser.DLOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> POINtVIRGULE() { return getTokens(B314Parser.POINtVIRGULE); }
		public TerminalNode POINtVIRGULE(int i) {
			return getToken(B314Parser.POINtVIRGULE, i);
		}
		public FctDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fctDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterFctDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitFctDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitFctDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FctDeclContext fctDecl() throws RecognitionException {
		FctDeclContext _localctx = new FctDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fctDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ID);
			setState(225);
			match(AS);
			setState(226);
			match(FUNCTION);
			setState(227);
			match(PAR_OUVERT);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(228);
				paramDecl();
				}
			}

			setState(231);
			match(PAR_FERME);
			setState(232);
			match(DEUXPOINTS);
			setState(233);
			fctType();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DLOCAL) {
				{
				setState(234);
				match(DLOCAL);
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(235);
					varDecl();
					setState(236);
					match(POINtVIRGULE);
					}
					}
					setState(240); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(244);
			match(DO);
			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(245);
				instruction();
				}
				}
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << SKIPPPP) | (1L << NEXT))) != 0) );
			setState(250);
			match(DONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FctTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(B314Parser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(B314Parser.INTEGER, 0); }
		public TerminalNode SQUARE() { return getToken(B314Parser.SQUARE, 0); }
		public TerminalNode VOID() { return getToken(B314Parser.VOID, 0); }
		public FctTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fctType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterFctType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitFctType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitFctType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FctTypeContext fctType() throws RecognitionException {
		FctTypeContext _localctx = new FctTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fctType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << SQUARE) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamDeclContext extends ParserRuleContext {
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> VIRGULE() { return getTokens(B314Parser.VIRGULE); }
		public TerminalNode VIRGULE(int i) {
			return getToken(B314Parser.VIRGULE, i);
		}
		public ParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitParamDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitParamDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamDeclContext paramDecl() throws RecognitionException {
		ParamDeclContext _localctx = new ParamDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_paramDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(254);
			varDecl();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULE) {
				{
				{
				setState(255);
				match(VIRGULE);
				setState(256);
				varDecl();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext typeOfVar;
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode AS() { return getToken(B314Parser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ID);
			setState(263);
			match(AS);
			setState(264);
			((VarDeclContext)_localctx).typeOfVar = type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseWhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(B314Parser.WHEN, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public TerminalNode DLOCAL() { return getToken(B314Parser.DLOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> POINtVIRGULE() { return getTokens(B314Parser.POINtVIRGULE); }
		public TerminalNode POINtVIRGULE(int i) {
			return getToken(B314Parser.POINtVIRGULE, i);
		}
		public ClauseWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseWhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterClauseWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitClauseWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitClauseWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseWhenContext clauseWhen() throws RecognitionException {
		ClauseWhenContext _localctx = new ClauseWhenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_clauseWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(WHEN);
			setState(267);
			exprD(0);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DLOCAL) {
				{
				setState(268);
				match(DLOCAL);
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(269);
					varDecl();
					setState(270);
					match(POINtVIRGULE);
					}
					}
					setState(274); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(278);
			match(DO);
			setState(280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(279);
				instruction();
				}
				}
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << SKIPPPP) | (1L << NEXT))) != 0) );
			setState(284);
			match(DONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseDefaultContext extends ParserRuleContext {
		public TerminalNode BYDEF() { return getToken(B314Parser.BYDEF, 0); }
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public TerminalNode DLOCAL() { return getToken(B314Parser.DLOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> POINtVIRGULE() { return getTokens(B314Parser.POINtVIRGULE); }
		public TerminalNode POINtVIRGULE(int i) {
			return getToken(B314Parser.POINtVIRGULE, i);
		}
		public ClauseDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterClauseDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitClauseDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitClauseDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseDefaultContext clauseDefault() throws RecognitionException {
		ClauseDefaultContext _localctx = new ClauseDefaultContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_clauseDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(BYDEF);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DLOCAL) {
				{
				setState(287);
				match(DLOCAL);
				setState(291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(288);
					varDecl();
					setState(289);
					match(POINtVIRGULE);
					}
					}
					setState(293); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(297);
			match(DO);
			setState(299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(298);
				instruction();
				}
				}
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE) | (1L << SKIPPPP) | (1L << NEXT))) != 0) );
			setState(303);
			match(DONE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return exprD_sempred((ExprDContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprD_sempred(ExprDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3M\u0134\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\5\2+\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\64\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5C\n\5\f"+
		"\5\16\5F\13\5\5\5H\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5X\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"f\n\5\f\5\16\5i\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7{\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0085\n"+
		"\t\3\t\3\t\5\t\u0089\n\t\3\n\5\n\u008c\n\n\3\n\3\n\7\n\u0090\n\n\f\n\16"+
		"\n\u0093\13\n\3\13\3\13\3\13\3\13\3\13\6\13\u009a\n\13\r\13\16\13\u009b"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00a4\n\13\r\13\16\13\u00a5\3\13\3"+
		"\13\6\13\u00aa\n\13\r\13\16\13\u00ab\3\13\3\13\3\13\3\13\3\13\3\13\6\13"+
		"\u00b4\n\13\r\13\16\13\u00b5\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00c3\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cd"+
		"\n\f\3\r\3\r\3\r\3\r\7\r\u00d3\n\r\f\r\16\r\u00d6\13\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\7\16\u00de\n\16\f\16\16\16\u00e1\13\16\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u00e8\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00f1"+
		"\n\17\r\17\16\17\u00f2\5\17\u00f5\n\17\3\17\3\17\6\17\u00f9\n\17\r\17"+
		"\16\17\u00fa\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21\u0104\n\21\f\21\16"+
		"\21\u0107\13\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\6\23"+
		"\u0113\n\23\r\23\16\23\u0114\5\23\u0117\n\23\3\23\3\23\6\23\u011b\n\23"+
		"\r\23\16\23\u011c\3\23\3\23\3\24\3\24\3\24\3\24\3\24\6\24\u0126\n\24\r"+
		"\24\16\24\u0127\5\24\u012a\n\24\3\24\3\24\6\24\u012e\n\24\r\24\16\24\u012f"+
		"\3\24\3\24\3\24\2\3\b\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2"+
		"\f\3\2\25\27\3\2\64\65\3\2\668\3\2/\60\3\2\61\63\3\2$(\3\2:=\3\2\36(\4"+
		"\2$%\'(\3\2\25\30\u0156\2*\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\bW\3\2\2\2\n"+
		"p\3\2\2\2\fz\3\2\2\2\16|\3\2\2\2\20\u0088\3\2\2\2\22\u008b\3\2\2\2\24"+
		"\u00c2\3\2\2\2\26\u00cc\3\2\2\2\30\u00ce\3\2\2\2\32\u00df\3\2\2\2\34\u00e2"+
		"\3\2\2\2\36\u00fe\3\2\2\2 \u0100\3\2\2\2\"\u0108\3\2\2\2$\u010c\3\2\2"+
		"\2&\u0120\3\2\2\2(+\5\4\3\2)+\5\6\4\2*(\3\2\2\2*)\3\2\2\2+\3\3\2\2\2,"+
		"-\t\2\2\2-\5\3\2\2\2./\5\4\3\2/\60\7B\2\2\60\63\7I\2\2\61\62\7D\2\2\62"+
		"\64\7I\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7C\2\2\66\7"+
		"\3\2\2\2\678\b\5\1\28X\5\22\n\29X\5\n\6\2:X\5\f\7\2;X\5\16\b\2<X\5\20"+
		"\t\2=>\7\6\2\2>G\7G\2\2?D\5\b\5\2@A\7D\2\2AC\5\b\5\2B@\3\2\2\2CF\3\2\2"+
		"\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2G?\3\2\2\2GH\3\2\2\2HI\3\2\2"+
		"\2IX\7H\2\2JK\7G\2\2KL\5\b\5\2LM\7H\2\2MX\3\2\2\2NO\7.\2\2OX\5\b\5\bP"+
		"Q\7)\2\2QR\7B\2\2RS\5\b\5\2ST\7D\2\2TU\5\b\5\2UV\7C\2\2VX\3\2\2\2W\67"+
		"\3\2\2\2W9\3\2\2\2W:\3\2\2\2W;\3\2\2\2W<\3\2\2\2W=\3\2\2\2WJ\3\2\2\2W"+
		"N\3\2\2\2WP\3\2\2\2Xg\3\2\2\2YZ\f\7\2\2Z[\t\3\2\2[f\5\b\5\b\\]\f\6\2\2"+
		"]^\t\4\2\2^f\5\b\5\7_`\f\5\2\2`a\t\5\2\2af\5\b\5\6bc\f\4\2\2cd\t\6\2\2"+
		"df\5\b\5\5eY\3\2\2\2e\\\3\2\2\2e_\3\2\2\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2"+
		"\2gh\3\2\2\2h\t\3\2\2\2ig\3\2\2\2jq\7\31\2\2kq\7\32\2\2lq\7\33\2\2mn\t"+
		"\7\2\2nq\7\34\2\2oq\7\35\2\2pj\3\2\2\2pk\3\2\2\2pl\3\2\2\2pm\3\2\2\2p"+
		"o\3\2\2\2q\13\3\2\2\2r{\7*\2\2s{\7+\2\2tu\7#\2\2uv\7,\2\2v{\t\b\2\2wx"+
		"\7-\2\2xy\7,\2\2y{\t\b\2\2zr\3\2\2\2zs\3\2\2\2zt\3\2\2\2zw\3\2\2\2{\r"+
		"\3\2\2\2|}\t\t\2\2}\17\3\2\2\2~\u0089\7\6\2\2\177\u0080\7\6\2\2\u0080"+
		"\u0081\7B\2\2\u0081\u0084\5\b\5\2\u0082\u0083\7D\2\2\u0083\u0085\5\b\5"+
		"\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\7C\2\2\u0087\u0089\3\2\2\2\u0088~\3\2\2\2\u0088\177\3\2\2\2\u0089\21"+
		"\3\2\2\2\u008a\u008c\7\65\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u0091\7M\2\2\u008e\u0090\7M\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\23\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u00c3\7\24\2\2\u0095\u0096\7\r\2"+
		"\2\u0096\u0097\5\b\5\2\u0097\u0099\7\16\2\2\u0098\u009a\5\24\13\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\t\2\2\u009e\u00c3\3\2\2\2\u009f"+
		"\u00a0\7\r\2\2\u00a0\u00a1\5\b\5\2\u00a1\u00a3\7\16\2\2\u00a2\u00a4\5"+
		"\24\13\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\7\22\2\2\u00a8\u00aa\5"+
		"\24\13\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\t\2\2\u00ae\u00c3\3\2"+
		"\2\2\u00af\u00b0\7\17\2\2\u00b0\u00b1\5\b\5\2\u00b1\u00b3\7\n\2\2\u00b2"+
		"\u00b4\5\24\13\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\t\2\2\u00b8"+
		"\u00c3\3\2\2\2\u00b9\u00ba\7\20\2\2\u00ba\u00bb\5\20\t\2\u00bb\u00bc\7"+
		"\23\2\2\u00bc\u00bd\5\b\5\2\u00bd\u00c3\3\2\2\2\u00be\u00bf\7\21\2\2\u00bf"+
		"\u00c3\5\b\5\2\u00c0\u00c1\7A\2\2\u00c1\u00c3\5\26\f\2\u00c2\u0094\3\2"+
		"\2\2\u00c2\u0095\3\2\2\2\u00c2\u009f\3\2\2\2\u00c2\u00af\3\2\2\2\u00c2"+
		"\u00b9\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\25\3\2\2"+
		"\2\u00c4\u00c5\79\2\2\u00c5\u00cd\t\b\2\2\u00c6\u00c7\7>\2\2\u00c7\u00cd"+
		"\t\b\2\2\u00c8\u00c9\7?\2\2\u00c9\u00cd\t\n\2\2\u00ca\u00cb\7\n\2\2\u00cb"+
		"\u00cd\7@\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c8\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\27\3\2\2\2\u00ce\u00cf\7\3\2\2\u00cf\u00d0"+
		"\5\32\16\2\u00d0\u00d4\7\4\2\2\u00d1\u00d3\5$\23\2\u00d2\u00d1\3\2\2\2"+
		"\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\5&\24\2\u00d8\31\3\2\2\2\u00d9"+
		"\u00da\5\"\22\2\u00da\u00db\7F\2\2\u00db\u00de\3\2\2\2\u00dc\u00de\5\34"+
		"\17\2\u00dd\u00d9\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\33\3\2\2\2\u00e1\u00df\3\2\2"+
		"\2\u00e2\u00e3\7\6\2\2\u00e3\u00e4\7\5\2\2\u00e4\u00e5\7\7\2\2\u00e5\u00e7"+
		"\7G\2\2\u00e6\u00e8\5 \21\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\7H\2\2\u00ea\u00eb\7E\2\2\u00eb\u00f4\5\36"+
		"\20\2\u00ec\u00f0\7\b\2\2\u00ed\u00ee\5\"\22\2\u00ee\u00ef\7F\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\7\n\2\2\u00f7\u00f9\5\24"+
		"\13\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\t\2\2\u00fd\35\3\2\2"+
		"\2\u00fe\u00ff\t\13\2\2\u00ff\37\3\2\2\2\u0100\u0105\5\"\22\2\u0101\u0102"+
		"\7D\2\2\u0102\u0104\5\"\22\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106!\3\2\2\2\u0107\u0105\3\2\2\2"+
		"\u0108\u0109\7\6\2\2\u0109\u010a\7\5\2\2\u010a\u010b\5\2\2\2\u010b#\3"+
		"\2\2\2\u010c\u010d\7\13\2\2\u010d\u0116\5\b\5\2\u010e\u0112\7\b\2\2\u010f"+
		"\u0110\5\"\22\2\u0110\u0111\7F\2\2\u0111\u0113\3\2\2\2\u0112\u010f\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u011a\7\n\2\2\u0119\u011b\5\24\13\2\u011a\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u011f\7\t\2\2\u011f%\3\2\2\2\u0120\u0129\7\f\2\2\u0121\u0125"+
		"\7\b\2\2\u0122\u0123\5\"\22\2\u0123\u0124\7F\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0122\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u012a\3\2\2\2\u0129\u0121\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\7\n\2\2\u012c\u012e\5\24\13\2\u012d\u012c\3"+
		"\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\7\t\2\2\u0132\'\3\2\2\2#*\63DGWegpz\u0084\u0088"+
		"\u008b\u0091\u009b\u00a5\u00ab\u00b5\u00c2\u00cc\u00d4\u00dd\u00df\u00e7"+
		"\u00f2\u00f4\u00fa\u0105\u0114\u0116\u011c\u0127\u0129\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}