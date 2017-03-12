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
		ID=1, NUMBER=2, COMMENT=3, NEWLINE=4, WS=5, START=6, DLOCAL=7, TSTART=8, 
		WHEN=9, DO=10, DONE=11, BYDEF=12, BOOLEAN=13, INTEGER=14, SQUARE=15, CROCHET_OUVERT=16, 
		VIRGULE=17, CROCHET_FERME=18, NOT=19, AND=20, OR=21, INF=22, SUP=23, EGALE=24, 
		PLUS=25, MOINS=26, MUL=27, DIV=28, DIV_ENT=29, NEARBY=30, PAR_OUVERT=31, 
		PAR_FERME=32, LATITUDE=33, LONGITUDE=34, GRID_SIZE=35, MAP=36, RADIO=37, 
		AMMO=38, FRUITS=39, SODA=40, COUNT=41, LIFE=42, TRUE=43, FALSE=44, ENNEMI=45, 
		IS=46, NORTH=47, SOUTH=48, EAST=49, WEST=50, GRAAL=51, DIRT=52, ROCK=53, 
		VINES=54, ZOMBIE=55, PLAYER=56, DIGIT=57, SKIPPPP=58, IF=59, THEN=60, 
		ELSE=61, WHILE=62, SET=63, TO=64, COMPUTE=65, NEXT=66, MOVE=67, SHOOT=68, 
		USE=69, NOTHING=70, POINtVIRGULE=71, AS=72, FUNCTION=73, DEUXPOINTS=74, 
		VOID=75;
	public static final int
		RULE_type = 0, RULE_scalar = 1, RULE_array = 2, RULE_exprBool = 3, RULE_exprInt = 4, 
		RULE_exprCase = 5, RULE_exprD = 6, RULE_environnementInt = 7, RULE_environnementBool = 8, 
		RULE_environnementCase = 9, RULE_exprG = 10, RULE_entier = 11, RULE_instruction = 12, 
		RULE_action = 13, RULE_programme = 14, RULE_progDecl = 15, RULE_fctDecl = 16, 
		RULE_fctType = 17, RULE_paramDecl = 18, RULE_varDecl = 19, RULE_clauseWhen = 20, 
		RULE_clauseDefault = 21;
	public static final String[] ruleNames = {
		"type", "scalar", "array", "exprBool", "exprInt", "exprCase", "exprD", 
		"environnementInt", "environnementBool", "environnementCase", "exprG", 
		"entier", "instruction", "action", "programme", "progDecl", "fctDecl", 
		"fctType", "paramDecl", "varDecl", "clauseWhen", "clauseDefault"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'declare and retain'", "'declare local'", 
		"'when your turn'", "'when'", "'do'", "'done'", "'by default'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "NUMBER", "COMMENT", "NEWLINE", "WS", "START", "DLOCAL", "TSTART", 
		"WHEN", "DO", "DONE", "BYDEF", "BOOLEAN", "INTEGER", "SQUARE", "CROCHET_OUVERT", 
		"VIRGULE", "CROCHET_FERME", "NOT", "AND", "OR", "INF", "SUP", "EGALE", 
		"PLUS", "MOINS", "MUL", "DIV", "DIV_ENT", "NEARBY", "PAR_OUVERT", "PAR_FERME", 
		"LATITUDE", "LONGITUDE", "GRID_SIZE", "MAP", "RADIO", "AMMO", "FRUITS", 
		"SODA", "COUNT", "LIFE", "TRUE", "FALSE", "ENNEMI", "IS", "NORTH", "SOUTH", 
		"EAST", "WEST", "GRAAL", "DIRT", "ROCK", "VINES", "ZOMBIE", "PLAYER", 
		"DIGIT", "SKIPPPP", "IF", "THEN", "ELSE", "WHILE", "SET", "TO", "COMPUTE", 
		"NEXT", "MOVE", "SHOOT", "USE", "NOTHING", "POINtVIRGULE", "AS", "FUNCTION", 
		"DEUXPOINTS", "VOID"
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeArrayContext extends TypeContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypeArrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterTypeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitTypeArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitTypeArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeScalarContext extends TypeContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TypeScalarContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterTypeScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitTypeScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitTypeScalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new TypeScalarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				scalar();
				}
				break;
			case 2:
				_localctx = new TypeArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
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
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
	 
		public ScalarContext() { }
		public void copyFrom(ScalarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ScalarSquareContext extends ScalarContext {
		public TerminalNode SQUARE() { return getToken(B314Parser.SQUARE, 0); }
		public ScalarSquareContext(ScalarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterScalarSquare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitScalarSquare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitScalarSquare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarBooleanContext extends ScalarContext {
		public TerminalNode BOOLEAN() { return getToken(B314Parser.BOOLEAN, 0); }
		public ScalarBooleanContext(ScalarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterScalarBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitScalarBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitScalarBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarIntegerContext extends ScalarContext {
		public TerminalNode INTEGER() { return getToken(B314Parser.INTEGER, 0); }
		public ScalarIntegerContext(ScalarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterScalarInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitScalarInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitScalarInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scalar);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new ScalarBooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(BOOLEAN);
				}
				break;
			case INTEGER:
				_localctx = new ScalarIntegerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(INTEGER);
				}
				break;
			case SQUARE:
				_localctx = new ScalarSquareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(SQUARE);
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
			setState(53);
			scalar();
			setState(54);
			match(CROCHET_OUVERT);
			setState(55);
			match(NUMBER);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULE) {
				{
				setState(56);
				match(VIRGULE);
				setState(57);
				match(NUMBER);
				}
			}

			setState(60);
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

	public static class ExprBoolContext extends ParserRuleContext {
		public ExprBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBool; }
	 
		public ExprBoolContext() { }
		public void copyFrom(ExprBoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprBoolInfSupEgaleContext extends ExprBoolContext {
		public ExprBoolContext expr1;
		public Token op;
		public ExprBoolContext expr2;
		public List<ExprBoolContext> exprBool() {
			return getRuleContexts(ExprBoolContext.class);
		}
		public ExprBoolContext exprBool(int i) {
			return getRuleContext(ExprBoolContext.class,i);
		}
		public TerminalNode INF() { return getToken(B314Parser.INF, 0); }
		public TerminalNode SUP() { return getToken(B314Parser.SUP, 0); }
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public ExprBoolInfSupEgaleContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolInfSupEgale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolInfSupEgale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolInfSupEgale(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolNotContext extends ExprBoolContext {
		public TerminalNode NOT() { return getToken(B314Parser.NOT, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public ExprBoolNotContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolEnviContext extends ExprBoolContext {
		public EnvironnementBoolContext environnementBool() {
			return getRuleContext(EnvironnementBoolContext.class,0);
		}
		public ExprBoolEnviContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolEnvi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolEnvi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolEnvi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolAndOrContext extends ExprBoolContext {
		public ExprBoolContext expr1;
		public Token op;
		public ExprBoolContext expr2;
		public List<ExprBoolContext> exprBool() {
			return getRuleContexts(ExprBoolContext.class);
		}
		public ExprBoolContext exprBool(int i) {
			return getRuleContext(ExprBoolContext.class,i);
		}
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode OR() { return getToken(B314Parser.OR, 0); }
		public ExprBoolAndOrContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolAndOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprBoolContext exprBool() throws RecognitionException {
		return exprBool(0);
	}

	private ExprBoolContext exprBool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprBoolContext _localctx = new ExprBoolContext(_ctx, _parentState);
		ExprBoolContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exprBool, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case ENNEMI:
			case GRAAL:
				{
				_localctx = new ExprBoolEnviContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(63);
				environnementBool();
				}
				break;
			case NOT:
				{
				_localctx = new ExprBoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(NOT);
				setState(65);
				exprBool(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBoolAndOrContext(new ExprBoolContext(_parentctx, _parentState));
						((ExprBoolAndOrContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(68);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(69);
						((ExprBoolAndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExprBoolAndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						((ExprBoolAndOrContext)_localctx).expr2 = exprBool(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprBoolInfSupEgaleContext(new ExprBoolContext(_parentctx, _parentState));
						((ExprBoolInfSupEgaleContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(71);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(72);
						((ExprBoolInfSupEgaleContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INF) | (1L << SUP) | (1L << EGALE))) != 0)) ) {
							((ExprBoolInfSupEgaleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(73);
						((ExprBoolInfSupEgaleContext)_localctx).expr2 = exprBool(2);
						}
						break;
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ExprIntContext extends ParserRuleContext {
		public ExprIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprInt; }
	 
		public ExprIntContext() { }
		public void copyFrom(ExprIntContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprIntEntierContext extends ExprIntContext {
		public EntierContext entier() {
			return getRuleContext(EntierContext.class,0);
		}
		public ExprIntEntierContext(ExprIntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprIntEntier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprIntEntier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprIntEntier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIntPlusMoinsContext extends ExprIntContext {
		public ExprIntContext expr1;
		public Token op;
		public ExprIntContext expr2;
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(B314Parser.PLUS, 0); }
		public TerminalNode MOINS() { return getToken(B314Parser.MOINS, 0); }
		public ExprIntPlusMoinsContext(ExprIntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprIntPlusMoins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprIntPlusMoins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprIntPlusMoins(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIntEnvContext extends ExprIntContext {
		public EnvironnementIntContext environnementInt() {
			return getRuleContext(EnvironnementIntContext.class,0);
		}
		public ExprIntEnvContext(ExprIntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprIntEnv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprIntEnv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprIntEnv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIntMulDivContext extends ExprIntContext {
		public ExprIntContext expr1;
		public Token op;
		public ExprIntContext expr2;
		public List<ExprIntContext> exprInt() {
			return getRuleContexts(ExprIntContext.class);
		}
		public ExprIntContext exprInt(int i) {
			return getRuleContext(ExprIntContext.class,i);
		}
		public TerminalNode MUL() { return getToken(B314Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(B314Parser.DIV, 0); }
		public TerminalNode DIV_ENT() { return getToken(B314Parser.DIV_ENT, 0); }
		public ExprIntMulDivContext(ExprIntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprIntMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprIntMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprIntMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprIntContext exprInt() throws RecognitionException {
		return exprInt(0);
	}

	private ExprIntContext exprInt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprIntContext _localctx = new ExprIntContext(_ctx, _parentState);
		ExprIntContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exprInt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOINS:
			case DIGIT:
				{
				_localctx = new ExprIntEntierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(80);
				entier();
				}
				break;
			case LATITUDE:
			case LONGITUDE:
			case GRID_SIZE:
			case MAP:
			case RADIO:
			case AMMO:
			case FRUITS:
			case SODA:
			case LIFE:
				{
				_localctx = new ExprIntEnvContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				environnementInt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(90);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprIntPlusMoinsContext(new ExprIntContext(_parentctx, _parentState));
						((ExprIntPlusMoinsContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprInt);
						setState(84);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(85);
						((ExprIntPlusMoinsContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MOINS) ) {
							((ExprIntPlusMoinsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(86);
						((ExprIntPlusMoinsContext)_localctx).expr2 = exprInt(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprIntMulDivContext(new ExprIntContext(_parentctx, _parentState));
						((ExprIntMulDivContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprInt);
						setState(87);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(88);
						((ExprIntMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << DIV_ENT))) != 0)) ) {
							((ExprIntMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(89);
						((ExprIntMulDivContext)_localctx).expr2 = exprInt(2);
						}
						break;
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ExprCaseContext extends ParserRuleContext {
		public ExprCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCase; }
	 
		public ExprCaseContext() { }
		public void copyFrom(ExprCaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprCaseEnvContext extends ExprCaseContext {
		public EnvironnementCaseContext environnementCase() {
			return getRuleContext(EnvironnementCaseContext.class,0);
		}
		public ExprCaseEnvContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprCaseEnv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprCaseEnv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprCaseEnv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseNearbyContext extends ExprCaseContext {
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
		public ExprCaseNearbyContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprCaseNearby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprCaseNearby(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprCaseNearby(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseContext exprCase() throws RecognitionException {
		ExprCaseContext _localctx = new ExprCaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprCase);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case RADIO:
			case AMMO:
			case FRUITS:
			case SODA:
			case ENNEMI:
			case DIRT:
			case ROCK:
			case VINES:
			case ZOMBIE:
			case PLAYER:
				_localctx = new ExprCaseEnvContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				environnementCase();
				}
				break;
			case NEARBY:
				_localctx = new ExprCaseNearbyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(NEARBY);
				setState(97);
				match(CROCHET_OUVERT);
				setState(98);
				exprD();
				setState(99);
				match(VIRGULE);
				setState(100);
				exprD();
				setState(101);
				match(CROCHET_FERME);
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
	public static class ExprDCasContext extends ExprDContext {
		public ExprCaseContext exprCase() {
			return getRuleContext(ExprCaseContext.class,0);
		}
		public ExprDCasContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprDCas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprDCas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprDCas(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDBoolContext extends ExprDContext {
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public ExprDBoolContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprDBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprDBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprDBool(this);
			else return visitor.visitChildren(this);
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
	public static class ExprDIntContext extends ExprDContext {
		public ExprIntContext exprInt() {
			return getRuleContext(ExprIntContext.class,0);
		}
		public ExprDIntContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprDInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprDInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprDInt(this);
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

	public final ExprDContext exprD() throws RecognitionException {
		ExprDContext _localctx = new ExprDContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprD);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ExprDBoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				exprBool(0);
				}
				break;
			case 2:
				_localctx = new ExprDIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				exprInt(0);
				}
				break;
			case 3:
				_localctx = new ExprDCasContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				exprCase();
				}
				break;
			case 4:
				_localctx = new ExprDexprGContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				exprG();
				}
				break;
			case 5:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(ID);
				setState(110);
				match(PAR_OUVERT);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NOT) | (1L << MOINS) | (1L << NEARBY) | (1L << PAR_OUVERT) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID_SIZE) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << LIFE) | (1L << TRUE) | (1L << FALSE) | (1L << ENNEMI) | (1L << GRAAL) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << DIGIT))) != 0)) {
					{
					setState(111);
					exprD();
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULE) {
						{
						{
						setState(112);
						match(VIRGULE);
						setState(113);
						exprD();
						}
						}
						setState(118);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(121);
				match(PAR_FERME);
				}
				break;
			case 6:
				_localctx = new ExprParContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				match(PAR_OUVERT);
				setState(123);
				exprD();
				setState(124);
				match(PAR_FERME);
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
		enterRule(_localctx, 14, RULE_environnementInt);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LATITUDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(LATITUDE);
				}
				break;
			case LONGITUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(LONGITUDE);
				}
				break;
			case GRID_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
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
				setState(131);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				match(COUNT);
				}
				break;
			case LIFE:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
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
		enterRule(_localctx, 16, RULE_environnementBool);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(FALSE);
				}
				break;
			case ENNEMI:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(ENNEMI);
				setState(139);
				match(IS);
				setState(140);
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
				setState(141);
				match(GRAAL);
				setState(142);
				match(IS);
				setState(143);
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
		enterRule(_localctx, 18, RULE_environnementCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << ENNEMI) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER))) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_exprG);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new VariableExprGContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(ID);
				}
				break;
			case 2:
				_localctx = new TableauExprGContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(ID);
				setState(150);
				match(CROCHET_OUVERT);
				setState(151);
				exprD();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRGULE) {
					{
					setState(152);
					match(VIRGULE);
					setState(153);
					exprD();
					}
				}

				setState(156);
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
		enterRule(_localctx, 22, RULE_entier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MOINS) {
				{
				setState(160);
				match(MOINS);
				}
			}

			setState(163);
			match(DIGIT);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					match(DIGIT);
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 24, RULE_instruction);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new SkippppContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(SKIPPPP);
				}
				break;
			case 2:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(IF);
				setState(172);
				exprD();
				setState(173);
				match(THEN);
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(174);
					instruction();
					}
					}
					setState(177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (SKIPPPP - 58)) | (1L << (IF - 58)) | (1L << (WHILE - 58)) | (1L << (SET - 58)) | (1L << (COMPUTE - 58)) | (1L << (NEXT - 58)))) != 0) );
				setState(179);
				match(DONE);
				}
				break;
			case 3:
				_localctx = new IfthenelseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(IF);
				setState(182);
				exprD();
				setState(183);
				match(THEN);
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(184);
					instruction();
					}
					}
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (SKIPPPP - 58)) | (1L << (IF - 58)) | (1L << (WHILE - 58)) | (1L << (SET - 58)) | (1L << (COMPUTE - 58)) | (1L << (NEXT - 58)))) != 0) );
				setState(189);
				match(ELSE);
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(190);
					instruction();
					}
					}
					setState(193); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (SKIPPPP - 58)) | (1L << (IF - 58)) | (1L << (WHILE - 58)) | (1L << (SET - 58)) | (1L << (COMPUTE - 58)) | (1L << (NEXT - 58)))) != 0) );
				setState(195);
				match(DONE);
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(WHILE);
				setState(198);
				exprD();
				setState(199);
				match(DO);
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(200);
					instruction();
					}
					}
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (SKIPPPP - 58)) | (1L << (IF - 58)) | (1L << (WHILE - 58)) | (1L << (SET - 58)) | (1L << (COMPUTE - 58)) | (1L << (NEXT - 58)))) != 0) );
				setState(205);
				match(DONE);
				}
				break;
			case 5:
				_localctx = new AffectationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
				match(SET);
				setState(208);
				exprG();
				setState(209);
				match(TO);
				setState(210);
				exprD();
				}
				break;
			case 6:
				_localctx = new ComputeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				match(COMPUTE);
				setState(213);
				exprD();
				}
				break;
			case 7:
				_localctx = new NextActionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				match(NEXT);
				setState(215);
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
		enterRule(_localctx, 26, RULE_action);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(MOVE);
				setState(219);
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
				setState(220);
				match(SHOOT);
				setState(221);
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
				setState(222);
				match(USE);
				setState(223);
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
				setState(224);
				match(DO);
				setState(225);
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
		enterRule(_localctx, 28, RULE_programme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(START);
			setState(229);
			progDecl();
			setState(230);
			match(TSTART);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(231);
				clauseWhen();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
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
		enterRule(_localctx, 30, RULE_progDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(239);
					varDecl();
					setState(240);
					match(POINtVIRGULE);
					}
					break;
				case 2:
					{
					setState(242);
					fctDecl();
					}
					break;
				}
				}
				setState(247);
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
		enterRule(_localctx, 32, RULE_fctDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ID);
			setState(249);
			match(AS);
			setState(250);
			match(FUNCTION);
			setState(251);
			match(PAR_OUVERT);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(252);
				paramDecl();
				}
			}

			setState(255);
			match(PAR_FERME);
			setState(256);
			match(DEUXPOINTS);
			setState(257);
			fctType();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DLOCAL) {
				{
				setState(258);
				match(DLOCAL);
				setState(262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(259);
					varDecl();
					setState(260);
					match(POINtVIRGULE);
					}
					}
					setState(264); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(268);
			match(DO);
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				instruction();
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (SKIPPPP - 58)) | (1L << (IF - 58)) | (1L << (WHILE - 58)) | (1L << (SET - 58)) | (1L << (COMPUTE - 58)) | (1L << (NEXT - 58)))) != 0) );
			setState(274);
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
		public FctTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fctType; }
	 
		public FctTypeContext() { }
		public void copyFrom(FctTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FctTypeVoidContext extends FctTypeContext {
		public TerminalNode VOID() { return getToken(B314Parser.VOID, 0); }
		public FctTypeVoidContext(FctTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterFctTypeVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitFctTypeVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitFctTypeVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FctTypeScalarContext extends FctTypeContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public FctTypeScalarContext(FctTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterFctTypeScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitFctTypeScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitFctTypeScalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FctTypeContext fctType() throws RecognitionException {
		FctTypeContext _localctx = new FctTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fctType);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTEGER:
			case SQUARE:
				_localctx = new FctTypeScalarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				scalar();
				}
				break;
			case VOID:
				_localctx = new FctTypeVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(VOID);
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
		enterRule(_localctx, 36, RULE_paramDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(280);
			varDecl();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULE) {
				{
				{
				setState(281);
				match(VIRGULE);
				setState(282);
				varDecl();
				}
				}
				setState(287);
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
		enterRule(_localctx, 38, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(ID);
			setState(289);
			match(AS);
			setState(290);
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
		enterRule(_localctx, 40, RULE_clauseWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(WHEN);
			setState(293);
			exprD();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DLOCAL) {
				{
				setState(294);
				match(DLOCAL);
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(295);
					varDecl();
					setState(296);
					match(POINtVIRGULE);
					}
					}
					setState(300); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(304);
			match(DO);
			setState(306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305);
				instruction();
				}
				}
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (SKIPPPP - 58)) | (1L << (IF - 58)) | (1L << (WHILE - 58)) | (1L << (SET - 58)) | (1L << (COMPUTE - 58)) | (1L << (NEXT - 58)))) != 0) );
			setState(310);
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
		enterRule(_localctx, 42, RULE_clauseDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(BYDEF);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DLOCAL) {
				{
				setState(313);
				match(DLOCAL);
				setState(317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(314);
					varDecl();
					setState(315);
					match(POINtVIRGULE);
					}
					}
					setState(319); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(323);
			match(DO);
			setState(325); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(324);
				instruction();
				}
				}
				setState(327); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (SKIPPPP - 58)) | (1L << (IF - 58)) | (1L << (WHILE - 58)) | (1L << (SET - 58)) | (1L << (COMPUTE - 58)) | (1L << (NEXT - 58)))) != 0) );
			setState(329);
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
			return exprBool_sempred((ExprBoolContext)_localctx, predIndex);
		case 4:
			return exprInt_sempred((ExprIntContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprBool_sempred(ExprBoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exprInt_sempred(ExprIntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3M\u014e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\5\2\61\n\2"+
		"\3\3\3\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\5\5E\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\6\3"+
		"\6\3\6\5\6U\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\bu\n\b\f\b\16\bx\13\b\5\bz\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0081\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0089\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0093\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009d\n\f\3\f\3\f"+
		"\5\f\u00a1\n\f\3\r\5\r\u00a4\n\r\3\r\3\r\7\r\u00a8\n\r\f\r\16\r\u00ab"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\6\16\u00b2\n\16\r\16\16\16\u00b3\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\6\16\u00bc\n\16\r\16\16\16\u00bd\3\16\3\16\6\16"+
		"\u00c2\n\16\r\16\16\16\u00c3\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00cc"+
		"\n\16\r\16\16\16\u00cd\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00db\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00e5\n\17\3\20\3\20\3\20\3\20\7\20\u00eb\n\20\f\20\16\20\u00ee\13\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00f6\n\21\f\21\16\21\u00f9\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0100\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\6\22\u0109\n\22\r\22\16\22\u010a\5\22\u010d\n\22\3\22\3\22\6\22"+
		"\u0111\n\22\r\22\16\22\u0112\3\22\3\22\3\23\3\23\5\23\u0119\n\23\3\24"+
		"\3\24\3\24\7\24\u011e\n\24\f\24\16\24\u0121\13\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u012d\n\26\r\26\16\26\u012e\5\26\u0131"+
		"\n\26\3\26\3\26\6\26\u0135\n\26\r\26\16\26\u0136\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\6\27\u0140\n\27\r\27\16\27\u0141\5\27\u0144\n\27\3\27\3"+
		"\27\6\27\u0148\n\27\r\27\16\27\u0149\3\27\3\27\3\27\2\4\b\n\30\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\n\3\2\26\27\3\2\30\32\3\2\33"+
		"\34\3\2\35\37\3\2&*\3\2\61\64\5\2&*//\66:\4\2&\')*\u0170\2\60\3\2\2\2"+
		"\4\65\3\2\2\2\6\67\3\2\2\2\bD\3\2\2\2\nT\3\2\2\2\fi\3\2\2\2\16\u0080\3"+
		"\2\2\2\20\u0088\3\2\2\2\22\u0092\3\2\2\2\24\u0094\3\2\2\2\26\u00a0\3\2"+
		"\2\2\30\u00a3\3\2\2\2\32\u00da\3\2\2\2\34\u00e4\3\2\2\2\36\u00e6\3\2\2"+
		"\2 \u00f7\3\2\2\2\"\u00fa\3\2\2\2$\u0118\3\2\2\2&\u011a\3\2\2\2(\u0122"+
		"\3\2\2\2*\u0126\3\2\2\2,\u013a\3\2\2\2.\61\5\4\3\2/\61\5\6\4\2\60.\3\2"+
		"\2\2\60/\3\2\2\2\61\3\3\2\2\2\62\66\7\17\2\2\63\66\7\20\2\2\64\66\7\21"+
		"\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\678\5\4\3"+
		"\289\7\22\2\29<\7\4\2\2:;\7\23\2\2;=\7\4\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2"+
		"\2\2>?\7\24\2\2?\7\3\2\2\2@A\b\5\1\2AE\5\22\n\2BC\7\25\2\2CE\5\b\5\5D"+
		"@\3\2\2\2DB\3\2\2\2EN\3\2\2\2FG\f\4\2\2GH\t\2\2\2HM\5\b\5\5IJ\f\3\2\2"+
		"JK\t\3\2\2KM\5\b\5\4LF\3\2\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2"+
		"O\t\3\2\2\2PN\3\2\2\2QR\b\6\1\2RU\5\30\r\2SU\5\20\t\2TQ\3\2\2\2TS\3\2"+
		"\2\2U^\3\2\2\2VW\f\4\2\2WX\t\4\2\2X]\5\n\6\5YZ\f\3\2\2Z[\t\5\2\2[]\5\n"+
		"\6\4\\V\3\2\2\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\13\3\2\2\2"+
		"`^\3\2\2\2aj\5\24\13\2bc\7 \2\2cd\7\22\2\2de\5\16\b\2ef\7\23\2\2fg\5\16"+
		"\b\2gh\7\24\2\2hj\3\2\2\2ia\3\2\2\2ib\3\2\2\2j\r\3\2\2\2k\u0081\5\b\5"+
		"\2l\u0081\5\n\6\2m\u0081\5\f\7\2n\u0081\5\26\f\2op\7\3\2\2py\7!\2\2qv"+
		"\5\16\b\2rs\7\23\2\2su\5\16\b\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2wz\3\2\2\2xv\3\2\2\2yq\3\2\2\2yz\3\2\2\2z{\3\2\2\2{\u0081\7\"\2\2|}"+
		"\7!\2\2}~\5\16\b\2~\177\7\"\2\2\177\u0081\3\2\2\2\u0080k\3\2\2\2\u0080"+
		"l\3\2\2\2\u0080m\3\2\2\2\u0080n\3\2\2\2\u0080o\3\2\2\2\u0080|\3\2\2\2"+
		"\u0081\17\3\2\2\2\u0082\u0089\7#\2\2\u0083\u0089\7$\2\2\u0084\u0089\7"+
		"%\2\2\u0085\u0086\t\6\2\2\u0086\u0089\7+\2\2\u0087\u0089\7,\2\2\u0088"+
		"\u0082\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\21\3\2\2\2\u008a\u0093\7-\2\2\u008b\u0093"+
		"\7.\2\2\u008c\u008d\7/\2\2\u008d\u008e\7\60\2\2\u008e\u0093\t\7\2\2\u008f"+
		"\u0090\7\65\2\2\u0090\u0091\7\60\2\2\u0091\u0093\t\7\2\2\u0092\u008a\3"+
		"\2\2\2\u0092\u008b\3\2\2\2\u0092\u008c\3\2\2\2\u0092\u008f\3\2\2\2\u0093"+
		"\23\3\2\2\2\u0094\u0095\t\b\2\2\u0095\25\3\2\2\2\u0096\u00a1\7\3\2\2\u0097"+
		"\u0098\7\3\2\2\u0098\u0099\7\22\2\2\u0099\u009c\5\16\b\2\u009a\u009b\7"+
		"\23\2\2\u009b\u009d\5\16\b\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\7\24\2\2\u009f\u00a1\3\2\2\2\u00a0\u0096\3"+
		"\2\2\2\u00a0\u0097\3\2\2\2\u00a1\27\3\2\2\2\u00a2\u00a4\7\34\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a9\7;"+
		"\2\2\u00a6\u00a8\7;\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\31\3\2\2\2\u00ab\u00a9\3\2\2"+
		"\2\u00ac\u00db\7<\2\2\u00ad\u00ae\7=\2\2\u00ae\u00af\5\16\b\2\u00af\u00b1"+
		"\7>\2\2\u00b0\u00b2\5\32\16\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6"+
		"\7\r\2\2\u00b6\u00db\3\2\2\2\u00b7\u00b8\7=\2\2\u00b8\u00b9\5\16\b\2\u00b9"+
		"\u00bb\7>\2\2\u00ba\u00bc\5\32\16\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3"+
		"\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c1\7?\2\2\u00c0\u00c2\5\32\16\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\7\r\2\2\u00c6\u00db\3\2\2\2\u00c7\u00c8\7@\2\2\u00c8\u00c9\5\16"+
		"\b\2\u00c9\u00cb\7\f\2\2\u00ca\u00cc\5\32\16\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\7\r\2\2\u00d0\u00db\3\2\2\2\u00d1\u00d2\7A\2\2\u00d2"+
		"\u00d3\5\26\f\2\u00d3\u00d4\7B\2\2\u00d4\u00d5\5\16\b\2\u00d5\u00db\3"+
		"\2\2\2\u00d6\u00d7\7C\2\2\u00d7\u00db\5\16\b\2\u00d8\u00d9\7D\2\2\u00d9"+
		"\u00db\5\34\17\2\u00da\u00ac\3\2\2\2\u00da\u00ad\3\2\2\2\u00da\u00b7\3"+
		"\2\2\2\u00da\u00c7\3\2\2\2\u00da\u00d1\3\2\2\2\u00da\u00d6\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\33\3\2\2\2\u00dc\u00dd\7E\2\2\u00dd\u00e5\t\7\2\2"+
		"\u00de\u00df\7F\2\2\u00df\u00e5\t\7\2\2\u00e0\u00e1\7G\2\2\u00e1\u00e5"+
		"\t\t\2\2\u00e2\u00e3\7\f\2\2\u00e3\u00e5\7H\2\2\u00e4\u00dc\3\2\2\2\u00e4"+
		"\u00de\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\35\3\2\2"+
		"\2\u00e6\u00e7\7\b\2\2\u00e7\u00e8\5 \21\2\u00e8\u00ec\7\n\2\2\u00e9\u00eb"+
		"\5*\26\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\5,"+
		"\27\2\u00f0\37\3\2\2\2\u00f1\u00f2\5(\25\2\u00f2\u00f3\7I\2\2\u00f3\u00f6"+
		"\3\2\2\2\u00f4\u00f6\5\"\22\2\u00f5\u00f1\3\2\2\2\u00f5\u00f4\3\2\2\2"+
		"\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8!\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\3\2\2\u00fb\u00fc\7J\2\2\u00fc"+
		"\u00fd\7K\2\2\u00fd\u00ff\7!\2\2\u00fe\u0100\5&\24\2\u00ff\u00fe\3\2\2"+
		"\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\"\2\2\u0102\u0103"+
		"\7L\2\2\u0103\u010c\5$\23\2\u0104\u0108\7\t\2\2\u0105\u0106\5(\25\2\u0106"+
		"\u0107\7I\2\2\u0107\u0109\3\2\2\2\u0108\u0105\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u0104\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\7\f"+
		"\2\2\u010f\u0111\5\32\16\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\r"+
		"\2\2\u0115#\3\2\2\2\u0116\u0119\5\4\3\2\u0117\u0119\7M\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0117\3\2\2\2\u0119%\3\2\2\2\u011a\u011f\5(\25\2\u011b"+
		"\u011c\7\23\2\2\u011c\u011e\5(\25\2\u011d\u011b\3\2\2\2\u011e\u0121\3"+
		"\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\'\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0123\7\3\2\2\u0123\u0124\7J\2\2\u0124\u0125\5\2\2\2\u0125"+
		")\3\2\2\2\u0126\u0127\7\13\2\2\u0127\u0130\5\16\b\2\u0128\u012c\7\t\2"+
		"\2\u0129\u012a\5(\25\2\u012a\u012b\7I\2\2\u012b\u012d\3\2\2\2\u012c\u0129"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u0128\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0134\7\f\2\2\u0133\u0135\5\32\16\2\u0134\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u0139\7\r\2\2\u0139+\3\2\2\2\u013a\u0143\7\16\2\2\u013b\u013f"+
		"\7\t\2\2\u013c\u013d\5(\25\2\u013d\u013e\7I\2\2\u013e\u0140\3\2\2\2\u013f"+
		"\u013c\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0144\3\2\2\2\u0143\u013b\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0147\7\f\2\2\u0146\u0148\5\32\16\2\u0147\u0146\3"+
		"\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\7\r\2\2\u014c-\3\2\2\2*\60\65<DLNT\\^ivy\u0080"+
		"\u0088\u0092\u009c\u00a0\u00a3\u00a9\u00b3\u00bd\u00c3\u00cd\u00da\u00e4"+
		"\u00ec\u00f5\u00f7\u00ff\u010a\u010c\u0112\u0118\u011f\u012e\u0130\u0136"+
		"\u0141\u0143\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}