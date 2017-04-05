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
	public static final int
		RULE_type = 0, RULE_scalar = 1, RULE_array = 2, RULE_varDecl = 3, RULE_exprD = 4, 
		RULE_exprEnt = 5, RULE_exprBool = 6, RULE_exprCase = 7, RULE_environnementInt = 8, 
		RULE_environnementBool = 9, RULE_environnementCase = 10, RULE_exprG = 11, 
		RULE_entier = 12, RULE_appelDeFonction = 13, RULE_manipulationFonction = 14, 
		RULE_instruction = 15, RULE_action = 16, RULE_programme = 17, RULE_progDecl = 18, 
		RULE_fctDecl = 19, RULE_fctType = 20, RULE_paramDecl = 21, RULE_clauseWhen = 22, 
		RULE_clauseDefault = 23;
	public static final String[] ruleNames = {
		"type", "scalar", "array", "varDecl", "exprD", "exprEnt", "exprBool", 
		"exprCase", "environnementInt", "environnementBool", "environnementCase", 
		"exprG", "entier", "appelDeFonction", "manipulationFonction", "instruction", 
		"action", "programme", "progDecl", "fctDecl", "fctType", "paramDecl", 
		"clauseWhen", "clauseDefault"
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
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new TypeScalarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				scalar();
				}
				break;
			case 2:
				_localctx = new TypeArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
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
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new ScalarBooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(BOOLEAN);
				}
				break;
			case INTEGER:
				_localctx = new ScalarIntegerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(INTEGER);
				}
				break;
			case SQUARE:
				_localctx = new ScalarSquareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
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
		public Token taille1;
		public Token taille2;
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TerminalNode CROCHET_OUVERT() { return getToken(B314Parser.CROCHET_OUVERT, 0); }
		public TerminalNode CROCHET_FERME() { return getToken(B314Parser.CROCHET_FERME, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(B314Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(B314Parser.NUMBER, i);
		}
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
			setState(57);
			scalar();
			setState(58);
			match(CROCHET_OUVERT);
			setState(59);
			((ArrayContext)_localctx).taille1 = match(NUMBER);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULE) {
				{
				setState(60);
				match(VIRGULE);
				setState(61);
				((ArrayContext)_localctx).taille2 = match(NUMBER);
				}
			}

			setState(64);
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

	public static class VarDeclContext extends ParserRuleContext {
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
		enterRule(_localctx, 6, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
			setState(67);
			match(AS);
			setState(68);
			type();
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
	public static class ExprDBooleanContext extends ExprDContext {
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public ExprDBooleanContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprDBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprDBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprDBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDGContext extends ExprDContext {
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ExprDGContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprDG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprDG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprDG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDCaseContext extends ExprDContext {
		public ExprCaseContext exprCase() {
			return getRuleContext(ExprCaseContext.class,0);
		}
		public ExprDCaseContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprDCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprDCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprDCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDIntegerContext extends ExprDContext {
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ExprDIntegerContext(ExprDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprDInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprDInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprDInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprDContext exprD() throws RecognitionException {
		ExprDContext _localctx = new ExprDContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exprD);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ExprDIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				exprEnt(0);
				}
				break;
			case 2:
				_localctx = new ExprDBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				exprBool(0);
				}
				break;
			case 3:
				_localctx = new ExprDCaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				exprCase();
				}
				break;
			case 4:
				_localctx = new ExprDGContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				exprG();
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

	public static class ExprEntContext extends ParserRuleContext {
		public ExprEntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprEnt; }
	 
		public ExprEntContext() { }
		public void copyFrom(ExprEntContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprEntParenntheseContext extends ExprEntContext {
		public TerminalNode PAR_OUVERT() { return getToken(B314Parser.PAR_OUVERT, 0); }
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public TerminalNode PAR_FERME() { return getToken(B314Parser.PAR_FERME, 0); }
		public ExprEntParenntheseContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntParennthese(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntParennthese(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntParennthese(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntEntierContext extends ExprEntContext {
		public EntierContext entier() {
			return getRuleContext(EntierContext.class,0);
		}
		public ExprEntEntierContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntEntier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntEntier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntEntier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntEnvironnementContext extends ExprEntContext {
		public EnvironnementIntContext environnementInt() {
			return getRuleContext(EnvironnementIntContext.class,0);
		}
		public ExprEntEnvironnementContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntEnvironnement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntEnvironnement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntEnvironnement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntPlusMoinsGauheEntContext extends ExprEntContext {
		public Token op;
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(B314Parser.PLUS, 0); }
		public TerminalNode MOINS() { return getToken(B314Parser.MOINS, 0); }
		public ExprEntPlusMoinsGauheEntContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntPlusMoinsGauheEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntPlusMoinsGauheEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntPlusMoinsGauheEnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntPlusMoinsEntEntContext extends ExprEntContext {
		public Token op;
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(B314Parser.PLUS, 0); }
		public TerminalNode MOINS() { return getToken(B314Parser.MOINS, 0); }
		public ExprEntPlusMoinsEntEntContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntPlusMoinsEntEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntPlusMoinsEntEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntPlusMoinsEntEnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntMulDivEntGauheContext extends ExprEntContext {
		public Token op;
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode MUL() { return getToken(B314Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(B314Parser.DIV, 0); }
		public TerminalNode DIV_ENT() { return getToken(B314Parser.DIV_ENT, 0); }
		public ExprEntMulDivEntGauheContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntMulDivEntGauhe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntMulDivEntGauhe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntMulDivEntGauhe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntMulDivEntEntContext extends ExprEntContext {
		public Token op;
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode MUL() { return getToken(B314Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(B314Parser.DIV, 0); }
		public TerminalNode DIV_ENT() { return getToken(B314Parser.DIV_ENT, 0); }
		public ExprEntMulDivEntEntContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntMulDivEntEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntMulDivEntEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntMulDivEntEnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntMulDivGaucheGauheContext extends ExprEntContext {
		public ExprGContext expr3;
		public Token op;
		public ExprGContext expr4;
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public TerminalNode MUL() { return getToken(B314Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(B314Parser.DIV, 0); }
		public TerminalNode DIV_ENT() { return getToken(B314Parser.DIV_ENT, 0); }
		public ExprEntMulDivGaucheGauheContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntMulDivGaucheGauhe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntMulDivGaucheGauhe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntMulDivGaucheGauhe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntMulDivGauheEntContext extends ExprEntContext {
		public Token op;
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public TerminalNode MUL() { return getToken(B314Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(B314Parser.DIV, 0); }
		public TerminalNode DIV_ENT() { return getToken(B314Parser.DIV_ENT, 0); }
		public ExprEntMulDivGauheEntContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntMulDivGauheEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntMulDivGauheEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntMulDivGauheEnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntPlusMoinsEntGauheContext extends ExprEntContext {
		public Token op;
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(B314Parser.PLUS, 0); }
		public TerminalNode MOINS() { return getToken(B314Parser.MOINS, 0); }
		public ExprEntPlusMoinsEntGauheContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntPlusMoinsEntGauhe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntPlusMoinsEntGauhe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntPlusMoinsEntGauhe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntPlusMoinsGaucheGauheContext extends ExprEntContext {
		public ExprGContext expr3;
		public Token op;
		public ExprGContext expr4;
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(B314Parser.PLUS, 0); }
		public TerminalNode MOINS() { return getToken(B314Parser.MOINS, 0); }
		public ExprEntPlusMoinsGaucheGauheContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntPlusMoinsGaucheGauhe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntPlusMoinsGaucheGauhe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntPlusMoinsGaucheGauhe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprEntContext exprEnt() throws RecognitionException {
		return exprEnt(0);
	}

	private ExprEntContext exprEnt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprEntContext _localctx = new ExprEntContext(_ctx, _parentState);
		ExprEntContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_exprEnt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new ExprEntEntierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				entier();
				}
				break;
			case 2:
				{
				_localctx = new ExprEntEnvironnementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				environnementInt();
				}
				break;
			case 3:
				{
				_localctx = new ExprEntMulDivGauheEntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				exprG();
				setState(80);
				((ExprEntMulDivGauheEntContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << DIV_ENT))) != 0)) ) {
					((ExprEntMulDivGauheEntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(81);
				exprEnt(7);
				}
				break;
			case 4:
				{
				_localctx = new ExprEntMulDivGaucheGauheContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				((ExprEntMulDivGaucheGauheContext)_localctx).expr3 = exprG();
				setState(84);
				((ExprEntMulDivGaucheGauheContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << DIV_ENT))) != 0)) ) {
					((ExprEntMulDivGaucheGauheContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(85);
				((ExprEntMulDivGaucheGauheContext)_localctx).expr4 = exprG();
				}
				break;
			case 5:
				{
				_localctx = new ExprEntPlusMoinsGauheEntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				exprG();
				setState(88);
				((ExprEntPlusMoinsGauheEntContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MOINS) ) {
					((ExprEntPlusMoinsGauheEntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(89);
				exprEnt(3);
				}
				break;
			case 6:
				{
				_localctx = new ExprEntPlusMoinsGaucheGauheContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				((ExprEntPlusMoinsGaucheGauheContext)_localctx).expr3 = exprG();
				setState(92);
				((ExprEntPlusMoinsGaucheGauheContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MOINS) ) {
					((ExprEntPlusMoinsGaucheGauheContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(93);
				((ExprEntPlusMoinsGaucheGauheContext)_localctx).expr4 = exprG();
				}
				break;
			case 7:
				{
				_localctx = new ExprEntParenntheseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(PAR_OUVERT);
				setState(96);
				exprEnt(0);
				setState(97);
				match(PAR_FERME);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprEntMulDivEntEntContext(new ExprEntContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(101);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(102);
						((ExprEntMulDivEntEntContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << DIV_ENT))) != 0)) ) {
							((ExprEntMulDivEntEntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						exprEnt(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprEntPlusMoinsEntEntContext(new ExprEntContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(104);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(105);
						((ExprEntPlusMoinsEntEntContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MOINS) ) {
							((ExprEntPlusMoinsEntEntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						exprEnt(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprEntMulDivEntGauheContext(new ExprEntContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(107);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(108);
						((ExprEntMulDivEntGauheContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << DIV_ENT))) != 0)) ) {
							((ExprEntMulDivEntGauheContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(109);
						exprG();
						}
						break;
					case 4:
						{
						_localctx = new ExprEntPlusMoinsEntGauheContext(new ExprEntContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(110);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(111);
						((ExprEntPlusMoinsEntGauheContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MOINS) ) {
							((ExprEntPlusMoinsEntGauheContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(112);
						exprG();
						}
						break;
					}
					} 
				}
				setState(117);
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
	public static class ExprBoolEgaleEntGaucheContext extends ExprBoolContext {
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ExprBoolEgaleEntGaucheContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolEgaleEntGauche(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolEgaleEntGauche(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolEgaleEntGauche(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolInfSupGGContext extends ExprBoolContext {
		public ExprGContext expr1;
		public Token op;
		public ExprGContext expr2;
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public TerminalNode INF() { return getToken(B314Parser.INF, 0); }
		public TerminalNode SUP() { return getToken(B314Parser.SUP, 0); }
		public ExprBoolInfSupGGContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolInfSupGG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolInfSupGG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolInfSupGG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolFalseContext extends ExprBoolContext {
		public TerminalNode FALSE() { return getToken(B314Parser.FALSE, 0); }
		public ExprBoolFalseContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolTrueContext extends ExprBoolContext {
		public TerminalNode TRUE() { return getToken(B314Parser.TRUE, 0); }
		public ExprBoolTrueContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolTrue(this);
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
	public static class ExprBoolNotGaucheContext extends ExprBoolContext {
		public TerminalNode NOT() { return getToken(B314Parser.NOT, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ExprBoolNotGaucheContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolNotGauche(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolNotGauche(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolNotGauche(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolAndOrBoolGaucheContext extends ExprBoolContext {
		public Token op;
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode OR() { return getToken(B314Parser.OR, 0); }
		public ExprBoolAndOrBoolGaucheContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolAndOrBoolGauche(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolAndOrBoolGauche(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolAndOrBoolGauche(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolEgaleCaseGaucheContext extends ExprBoolContext {
		public ExprCaseContext exprCase() {
			return getRuleContext(ExprCaseContext.class,0);
		}
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ExprBoolEgaleCaseGaucheContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolEgaleCaseGauche(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolEgaleCaseGauche(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolEgaleCaseGauche(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolEgaleGaucheGaucheContext extends ExprBoolContext {
		public ExprGContext expr3;
		public ExprGContext expr4;
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public ExprBoolEgaleGaucheGaucheContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolEgaleGaucheGauche(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolEgaleGaucheGauche(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolEgaleGaucheGauche(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolAndOrBoolBoolContext extends ExprBoolContext {
		public Token op;
		public List<ExprBoolContext> exprBool() {
			return getRuleContexts(ExprBoolContext.class);
		}
		public ExprBoolContext exprBool(int i) {
			return getRuleContext(ExprBoolContext.class,i);
		}
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode OR() { return getToken(B314Parser.OR, 0); }
		public ExprBoolAndOrBoolBoolContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolAndOrBoolBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolAndOrBoolBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolAndOrBoolBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolEgaleBoolGaucheContext extends ExprBoolContext {
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ExprBoolEgaleBoolGaucheContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolEgaleBoolGauche(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolEgaleBoolGauche(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolEgaleBoolGauche(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolInfSupGEntContext extends ExprBoolContext {
		public ExprGContext expr1;
		public Token op;
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode INF() { return getToken(B314Parser.INF, 0); }
		public TerminalNode SUP() { return getToken(B314Parser.SUP, 0); }
		public ExprBoolInfSupGEntContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolInfSupGEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolInfSupGEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolInfSupGEnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolEnvironnementContext extends ExprBoolContext {
		public EnvironnementBoolContext environnementBool() {
			return getRuleContext(EnvironnementBoolContext.class,0);
		}
		public ExprBoolEnvironnementContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolEnvironnement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolEnvironnement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolEnvironnement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolInfSupEntGaucheContext extends ExprBoolContext {
		public Token op;
		public ExprGContext expr2;
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode INF() { return getToken(B314Parser.INF, 0); }
		public TerminalNode SUP() { return getToken(B314Parser.SUP, 0); }
		public ExprBoolInfSupEntGaucheContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolInfSupEntGauche(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolInfSupEntGauche(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolInfSupEntGauche(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolEgaleBooleanContext extends ExprBoolContext {
		public List<ExprBoolContext> exprBool() {
			return getRuleContexts(ExprBoolContext.class);
		}
		public ExprBoolContext exprBool(int i) {
			return getRuleContext(ExprBoolContext.class,i);
		}
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public ExprBoolEgaleBooleanContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolEgaleBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolEgaleBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolEgaleBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolParenntheseContext extends ExprBoolContext {
		public TerminalNode PAR_OUVERT() { return getToken(B314Parser.PAR_OUVERT, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode PAR_FERME() { return getToken(B314Parser.PAR_FERME, 0); }
		public ExprBoolParenntheseContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolParennthese(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolParennthese(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolParennthese(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolEgaleCaseContext extends ExprBoolContext {
		public List<ExprCaseContext> exprCase() {
			return getRuleContexts(ExprCaseContext.class);
		}
		public ExprCaseContext exprCase(int i) {
			return getRuleContext(ExprCaseContext.class,i);
		}
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public ExprBoolEgaleCaseContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolEgaleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolEgaleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolEgaleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolEgaleGaucheEntContext extends ExprBoolContext {
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ExprBoolEgaleGaucheEntContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolEgaleGaucheEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolEgaleGaucheEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolEgaleGaucheEnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolAndOrGaucheBoolContext extends ExprBoolContext {
		public Token op;
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode OR() { return getToken(B314Parser.OR, 0); }
		public ExprBoolAndOrGaucheBoolContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolAndOrGaucheBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolAndOrGaucheBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolAndOrGaucheBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolEgaleGaucheCaseContext extends ExprBoolContext {
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public ExprCaseContext exprCase() {
			return getRuleContext(ExprCaseContext.class,0);
		}
		public ExprBoolEgaleGaucheCaseContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolEgaleGaucheCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolEgaleGaucheCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolEgaleGaucheCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolEgaleGaucheBoolContext extends ExprBoolContext {
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public ExprBoolEgaleGaucheBoolContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolEgaleGaucheBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolEgaleGaucheBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolEgaleGaucheBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolAndOrGaucheGaucheContext extends ExprBoolContext {
		public ExprGContext expr5;
		public Token op;
		public ExprGContext expr6;
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode OR() { return getToken(B314Parser.OR, 0); }
		public ExprBoolAndOrGaucheGaucheContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolAndOrGaucheGauche(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolAndOrGaucheGauche(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolAndOrGaucheGauche(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolEgaleIntegerContext extends ExprBoolContext {
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public ExprBoolEgaleIntegerContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolEgaleInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolEgaleInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolEgaleInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolInfSupEntContext extends ExprBoolContext {
		public Token op;
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode INF() { return getToken(B314Parser.INF, 0); }
		public TerminalNode SUP() { return getToken(B314Parser.SUP, 0); }
		public ExprBoolInfSupEntContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolInfSupEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolInfSupEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolInfSupEnt(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_exprBool, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new ExprBoolTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(119);
				match(TRUE);
				}
				break;
			case 2:
				{
				_localctx = new ExprBoolFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(FALSE);
				}
				break;
			case 3:
				{
				_localctx = new ExprBoolEnvironnementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				environnementBool();
				}
				break;
			case 4:
				{
				_localctx = new ExprBoolEgaleIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				exprEnt(0);
				setState(123);
				match(EGALE);
				setState(124);
				exprEnt(0);
				}
				break;
			case 5:
				{
				_localctx = new ExprBoolEgaleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				exprCase();
				setState(127);
				match(EGALE);
				setState(128);
				exprCase();
				}
				break;
			case 6:
				{
				_localctx = new ExprBoolEgaleGaucheGaucheContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				((ExprBoolEgaleGaucheGaucheContext)_localctx).expr3 = exprG();
				setState(131);
				match(EGALE);
				setState(132);
				((ExprBoolEgaleGaucheGaucheContext)_localctx).expr4 = exprG();
				}
				break;
			case 7:
				{
				_localctx = new ExprBoolEgaleGaucheEntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				exprG();
				setState(135);
				match(EGALE);
				setState(136);
				exprEnt(0);
				}
				break;
			case 8:
				{
				_localctx = new ExprBoolEgaleGaucheBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				exprG();
				setState(139);
				match(EGALE);
				setState(140);
				exprBool(16);
				}
				break;
			case 9:
				{
				_localctx = new ExprBoolEgaleGaucheCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				exprG();
				setState(143);
				match(EGALE);
				setState(144);
				exprCase();
				}
				break;
			case 10:
				{
				_localctx = new ExprBoolEgaleEntGaucheContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				exprEnt(0);
				setState(147);
				match(EGALE);
				setState(148);
				exprG();
				}
				break;
			case 11:
				{
				_localctx = new ExprBoolEgaleCaseGaucheContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				exprCase();
				setState(151);
				match(EGALE);
				setState(152);
				exprG();
				}
				break;
			case 12:
				{
				_localctx = new ExprBoolInfSupEntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				exprEnt(0);
				setState(155);
				((ExprBoolInfSupEntContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INF || _la==SUP) ) {
					((ExprBoolInfSupEntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				exprEnt(0);
				}
				break;
			case 13:
				{
				_localctx = new ExprBoolInfSupEntGaucheContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				exprEnt(0);
				setState(159);
				((ExprBoolInfSupEntGaucheContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INF || _la==SUP) ) {
					((ExprBoolInfSupEntGaucheContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(160);
				((ExprBoolInfSupEntGaucheContext)_localctx).expr2 = exprG();
				}
				break;
			case 14:
				{
				_localctx = new ExprBoolInfSupGEntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				((ExprBoolInfSupGEntContext)_localctx).expr1 = exprG();
				setState(163);
				((ExprBoolInfSupGEntContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INF || _la==SUP) ) {
					((ExprBoolInfSupGEntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(164);
				exprEnt(0);
				}
				break;
			case 15:
				{
				_localctx = new ExprBoolInfSupGGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				((ExprBoolInfSupGGContext)_localctx).expr1 = exprG();
				setState(167);
				((ExprBoolInfSupGGContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INF || _la==SUP) ) {
					((ExprBoolInfSupGGContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				((ExprBoolInfSupGGContext)_localctx).expr2 = exprG();
				}
				break;
			case 16:
				{
				_localctx = new ExprBoolAndOrGaucheBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				exprG();
				setState(171);
				((ExprBoolAndOrGaucheBoolContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((ExprBoolAndOrGaucheBoolContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				exprBool(5);
				}
				break;
			case 17:
				{
				_localctx = new ExprBoolAndOrGaucheGaucheContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				((ExprBoolAndOrGaucheGaucheContext)_localctx).expr5 = exprG();
				setState(175);
				((ExprBoolAndOrGaucheGaucheContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((ExprBoolAndOrGaucheGaucheContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				((ExprBoolAndOrGaucheGaucheContext)_localctx).expr6 = exprG();
				}
				break;
			case 18:
				{
				_localctx = new ExprBoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(NOT);
				setState(179);
				exprBool(3);
				}
				break;
			case 19:
				{
				_localctx = new ExprBoolNotGaucheContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(NOT);
				setState(181);
				exprG();
				}
				break;
			case 20:
				{
				_localctx = new ExprBoolParenntheseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(PAR_OUVERT);
				setState(183);
				exprBool(0);
				setState(184);
				match(PAR_FERME);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBoolEgaleBooleanContext(new ExprBoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(188);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(189);
						match(EGALE);
						setState(190);
						exprBool(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprBoolAndOrBoolBoolContext(new ExprBoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(191);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(192);
						((ExprBoolAndOrBoolBoolContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExprBoolAndOrBoolBoolContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(193);
						exprBool(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprBoolEgaleBoolGaucheContext(new ExprBoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(194);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(195);
						match(EGALE);
						setState(196);
						exprG();
						}
						break;
					case 4:
						{
						_localctx = new ExprBoolAndOrBoolGaucheContext(new ExprBoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(197);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(198);
						((ExprBoolAndOrBoolGaucheContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExprBoolAndOrBoolGaucheContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						exprG();
						}
						break;
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class ExprCaseParenntheseContext extends ExprCaseContext {
		public TerminalNode PAR_OUVERT() { return getToken(B314Parser.PAR_OUVERT, 0); }
		public ExprCaseContext exprCase() {
			return getRuleContext(ExprCaseContext.class,0);
		}
		public TerminalNode PAR_FERME() { return getToken(B314Parser.PAR_FERME, 0); }
		public ExprCaseParenntheseContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprCaseParennthese(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprCaseParennthese(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprCaseParennthese(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseNearbyGEntContext extends ExprCaseContext {
		public TerminalNode NEARBY() { return getToken(B314Parser.NEARBY, 0); }
		public TerminalNode CROCHET_OUVERT() { return getToken(B314Parser.CROCHET_OUVERT, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode VIRGULE() { return getToken(B314Parser.VIRGULE, 0); }
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public TerminalNode CROCHET_FERME() { return getToken(B314Parser.CROCHET_FERME, 0); }
		public ExprCaseNearbyGEntContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprCaseNearbyGEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprCaseNearbyGEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprCaseNearbyGEnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseNearbyGGContext extends ExprCaseContext {
		public ExprGContext taille1;
		public ExprGContext taille2;
		public TerminalNode NEARBY() { return getToken(B314Parser.NEARBY, 0); }
		public TerminalNode CROCHET_OUVERT() { return getToken(B314Parser.CROCHET_OUVERT, 0); }
		public TerminalNode VIRGULE() { return getToken(B314Parser.VIRGULE, 0); }
		public TerminalNode CROCHET_FERME() { return getToken(B314Parser.CROCHET_FERME, 0); }
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public ExprCaseNearbyGGContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprCaseNearbyGG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprCaseNearbyGG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprCaseNearbyGG(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseNearbyEntEntContext extends ExprCaseContext {
		public TerminalNode NEARBY() { return getToken(B314Parser.NEARBY, 0); }
		public TerminalNode CROCHET_OUVERT() { return getToken(B314Parser.CROCHET_OUVERT, 0); }
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode VIRGULE() { return getToken(B314Parser.VIRGULE, 0); }
		public TerminalNode CROCHET_FERME() { return getToken(B314Parser.CROCHET_FERME, 0); }
		public ExprCaseNearbyEntEntContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprCaseNearbyEntEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprCaseNearbyEntEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprCaseNearbyEntEnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseEnvironnementContext extends ExprCaseContext {
		public EnvironnementCaseContext environnementCase() {
			return getRuleContext(EnvironnementCaseContext.class,0);
		}
		public ExprCaseEnvironnementContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprCaseEnvironnement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprCaseEnvironnement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprCaseEnvironnement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCaseNearbyEntGContext extends ExprCaseContext {
		public TerminalNode NEARBY() { return getToken(B314Parser.NEARBY, 0); }
		public TerminalNode CROCHET_OUVERT() { return getToken(B314Parser.CROCHET_OUVERT, 0); }
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public TerminalNode VIRGULE() { return getToken(B314Parser.VIRGULE, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode CROCHET_FERME() { return getToken(B314Parser.CROCHET_FERME, 0); }
		public ExprCaseNearbyEntGContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprCaseNearbyEntG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprCaseNearbyEntG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprCaseNearbyEntG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseContext exprCase() throws RecognitionException {
		ExprCaseContext _localctx = new ExprCaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprCase);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExprCaseEnvironnementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				environnementCase();
				}
				break;
			case 2:
				_localctx = new ExprCaseNearbyEntEntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(NEARBY);
				setState(207);
				match(CROCHET_OUVERT);
				setState(208);
				exprEnt(0);
				setState(209);
				match(VIRGULE);
				setState(210);
				exprEnt(0);
				setState(211);
				match(CROCHET_FERME);
				}
				break;
			case 3:
				_localctx = new ExprCaseNearbyEntGContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(NEARBY);
				setState(214);
				match(CROCHET_OUVERT);
				setState(215);
				exprEnt(0);
				setState(216);
				match(VIRGULE);
				setState(217);
				exprG();
				setState(218);
				match(CROCHET_FERME);
				}
				break;
			case 4:
				_localctx = new ExprCaseNearbyGEntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(NEARBY);
				setState(221);
				match(CROCHET_OUVERT);
				setState(222);
				exprG();
				setState(223);
				match(VIRGULE);
				setState(224);
				exprEnt(0);
				setState(225);
				match(CROCHET_FERME);
				}
				break;
			case 5:
				_localctx = new ExprCaseNearbyGGContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				match(NEARBY);
				setState(228);
				match(CROCHET_OUVERT);
				setState(229);
				((ExprCaseNearbyGGContext)_localctx).taille1 = exprG();
				setState(230);
				match(VIRGULE);
				setState(231);
				((ExprCaseNearbyGGContext)_localctx).taille2 = exprG();
				setState(232);
				match(CROCHET_FERME);
				}
				break;
			case 6:
				_localctx = new ExprCaseParenntheseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				match(PAR_OUVERT);
				setState(235);
				exprCase();
				setState(236);
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
		public TerminalNode GRID() { return getToken(B314Parser.GRID, 0); }
		public TerminalNode SIZE() { return getToken(B314Parser.SIZE, 0); }
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
		enterRule(_localctx, 16, RULE_environnementInt);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LATITUDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(LATITUDE);
				}
				break;
			case LONGITUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(LONGITUDE);
				}
				break;
			case GRID:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(GRID);
				setState(243);
				match(SIZE);
				}
				break;
			case MAP:
			case RADIO:
			case AMMO:
			case FRUITS:
			case SODA:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(245);
				match(COUNT);
				}
				break;
			case LIFE:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
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
		enterRule(_localctx, 18, RULE_environnementBool);
		int _la;
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENNEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(ENNEMI);
				setState(250);
				match(IS);
				setState(251);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(GRAAL);
				setState(253);
				match(IS);
				setState(254);
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
		enterRule(_localctx, 20, RULE_environnementCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
	public static class ExprGTableauContext extends ExprGContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode CROCHET_OUVERT() { return getToken(B314Parser.CROCHET_OUVERT, 0); }
		public TerminalNode CROCHET_FERME() { return getToken(B314Parser.CROCHET_FERME, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public List<AppelDeFonctionContext> appelDeFonction() {
			return getRuleContexts(AppelDeFonctionContext.class);
		}
		public AppelDeFonctionContext appelDeFonction(int i) {
			return getRuleContext(AppelDeFonctionContext.class,i);
		}
		public TerminalNode VIRGULE() { return getToken(B314Parser.VIRGULE, 0); }
		public ExprGTableauContext(ExprGContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprGTableau(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprGTableau(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprGTableau(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprGVariableContext extends ExprGContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public ExprGVariableContext(ExprGContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprGVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprGVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprGVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprGContext exprG() throws RecognitionException {
		ExprGContext _localctx = new ExprGContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprG);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ExprGVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ExprGTableauContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(ID);
				setState(261);
				match(CROCHET_OUVERT);
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(262);
					exprD();
					}
					break;
				case 2:
					{
					setState(263);
					appelDeFonction();
					}
					break;
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRGULE) {
					{
					setState(266);
					match(VIRGULE);
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(267);
						exprD();
						}
						break;
					case 2:
						{
						setState(268);
						appelDeFonction();
						}
						break;
					}
					}
				}

				setState(273);
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
		public TerminalNode NUMBER() { return getToken(B314Parser.NUMBER, 0); }
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
		enterRule(_localctx, 24, RULE_entier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MOINS) {
				{
				setState(277);
				match(MOINS);
				}
			}

			setState(280);
			match(NUMBER);
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

	public static class AppelDeFonctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode PAR_OUVERT() { return getToken(B314Parser.PAR_OUVERT, 0); }
		public TerminalNode PAR_FERME() { return getToken(B314Parser.PAR_FERME, 0); }
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public List<ExprBoolContext> exprBool() {
			return getRuleContexts(ExprBoolContext.class);
		}
		public ExprBoolContext exprBool(int i) {
			return getRuleContext(ExprBoolContext.class,i);
		}
		public List<ExprCaseContext> exprCase() {
			return getRuleContexts(ExprCaseContext.class);
		}
		public ExprCaseContext exprCase(int i) {
			return getRuleContext(ExprCaseContext.class,i);
		}
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public List<AppelDeFonctionContext> appelDeFonction() {
			return getRuleContexts(AppelDeFonctionContext.class);
		}
		public AppelDeFonctionContext appelDeFonction(int i) {
			return getRuleContext(AppelDeFonctionContext.class,i);
		}
		public List<TerminalNode> VIRGULE() { return getTokens(B314Parser.VIRGULE); }
		public TerminalNode VIRGULE(int i) {
			return getToken(B314Parser.VIRGULE, i);
		}
		public AppelDeFonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appelDeFonction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAppelDeFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAppelDeFonction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAppelDeFonction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppelDeFonctionContext appelDeFonction() throws RecognitionException {
		AppelDeFonctionContext _localctx = new AppelDeFonctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_appelDeFonction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(ID);
			setState(283);
			match(PAR_OUVERT);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OUVERT) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << LIFE) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << ENNEMI) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << NEARBY) | (1L << TRUE) | (1L << FALSE) | (1L << GRAAL) | (1L << NOT) | (1L << MOINS))) != 0) || _la==ID || _la==NUMBER) {
				{
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(284);
					exprEnt(0);
					}
					break;
				case 2:
					{
					setState(285);
					exprBool(0);
					}
					break;
				case 3:
					{
					setState(286);
					exprCase();
					}
					break;
				case 4:
					{
					setState(287);
					exprG();
					}
					break;
				case 5:
					{
					setState(288);
					appelDeFonction();
					}
					break;
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULE) {
					{
					{
					setState(291);
					match(VIRGULE);
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(292);
						exprEnt(0);
						}
						break;
					case 2:
						{
						setState(293);
						exprBool(0);
						}
						break;
					case 3:
						{
						setState(294);
						exprCase();
						}
						break;
					case 4:
						{
						setState(295);
						exprG();
						}
						break;
					case 5:
						{
						setState(296);
						appelDeFonction();
						}
						break;
					}
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(306);
			match(PAR_FERME);
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

	public static class ManipulationFonctionContext extends ParserRuleContext {
		public ManipulationFonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manipulationFonction; }
	 
		public ManipulationFonctionContext() { }
		public void copyFrom(ManipulationFonctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SupEgaleFonctionContext extends ManipulationFonctionContext {
		public Token op;
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public List<AppelDeFonctionContext> appelDeFonction() {
			return getRuleContexts(AppelDeFonctionContext.class);
		}
		public AppelDeFonctionContext appelDeFonction(int i) {
			return getRuleContext(AppelDeFonctionContext.class,i);
		}
		public TerminalNode SUP() { return getToken(B314Parser.SUP, 0); }
		public TerminalNode INF() { return getToken(B314Parser.INF, 0); }
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public SupEgaleFonctionContext(ManipulationFonctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterSupEgaleFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitSupEgaleFonction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitSupEgaleFonction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndOrFonctionContext extends ManipulationFonctionContext {
		public Token op;
		public List<ExprBoolContext> exprBool() {
			return getRuleContexts(ExprBoolContext.class);
		}
		public ExprBoolContext exprBool(int i) {
			return getRuleContext(ExprBoolContext.class,i);
		}
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public List<AppelDeFonctionContext> appelDeFonction() {
			return getRuleContexts(AppelDeFonctionContext.class);
		}
		public AppelDeFonctionContext appelDeFonction(int i) {
			return getRuleContext(AppelDeFonctionContext.class,i);
		}
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode OR() { return getToken(B314Parser.OR, 0); }
		public AndOrFonctionContext(ManipulationFonctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAndOrFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAndOrFonction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAndOrFonction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusmoinsFonctionContext extends ManipulationFonctionContext {
		public Token op;
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public List<AppelDeFonctionContext> appelDeFonction() {
			return getRuleContexts(AppelDeFonctionContext.class);
		}
		public AppelDeFonctionContext appelDeFonction(int i) {
			return getRuleContext(AppelDeFonctionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(B314Parser.PLUS, 0); }
		public TerminalNode MOINS() { return getToken(B314Parser.MOINS, 0); }
		public PlusmoinsFonctionContext(ManipulationFonctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterPlusmoinsFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitPlusmoinsFonction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitPlusmoinsFonction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotFonctionContext extends ManipulationFonctionContext {
		public TerminalNode NOT() { return getToken(B314Parser.NOT, 0); }
		public AppelDeFonctionContext appelDeFonction() {
			return getRuleContext(AppelDeFonctionContext.class,0);
		}
		public NotFonctionContext(ManipulationFonctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterNotFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitNotFonction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitNotFonction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivFonctionContext extends ManipulationFonctionContext {
		public Token op;
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public List<AppelDeFonctionContext> appelDeFonction() {
			return getRuleContexts(AppelDeFonctionContext.class);
		}
		public AppelDeFonctionContext appelDeFonction(int i) {
			return getRuleContext(AppelDeFonctionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(B314Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(B314Parser.DIV, 0); }
		public TerminalNode DIV_ENT() { return getToken(B314Parser.DIV_ENT, 0); }
		public MulDivFonctionContext(ManipulationFonctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterMulDivFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitMulDivFonction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitMulDivFonction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ManipulationFonctionContext manipulationFonction() throws RecognitionException {
		ManipulationFonctionContext _localctx = new ManipulationFonctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_manipulationFonction);
		int _la;
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new MulDivFonctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(308);
					exprEnt(0);
					}
					break;
				case 2:
					{
					setState(309);
					exprG();
					}
					break;
				case 3:
					{
					setState(310);
					appelDeFonction();
					}
					break;
				}
				setState(313);
				((MulDivFonctionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << DIV_ENT))) != 0)) ) {
					((MulDivFonctionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(314);
					exprEnt(0);
					}
					break;
				case 2:
					{
					setState(315);
					exprG();
					}
					break;
				case 3:
					{
					setState(316);
					appelDeFonction();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new PlusmoinsFonctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(319);
					exprEnt(0);
					}
					break;
				case 2:
					{
					setState(320);
					exprG();
					}
					break;
				case 3:
					{
					setState(321);
					appelDeFonction();
					}
					break;
				}
				setState(324);
				((PlusmoinsFonctionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MOINS) ) {
					((PlusmoinsFonctionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(325);
					exprEnt(0);
					}
					break;
				case 2:
					{
					setState(326);
					exprG();
					}
					break;
				case 3:
					{
					setState(327);
					appelDeFonction();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new SupEgaleFonctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(330);
					exprEnt(0);
					}
					break;
				case 2:
					{
					setState(331);
					exprG();
					}
					break;
				case 3:
					{
					setState(332);
					appelDeFonction();
					}
					break;
				}
				setState(335);
				((SupEgaleFonctionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INF) | (1L << SUP) | (1L << EGALE))) != 0)) ) {
					((SupEgaleFonctionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(336);
					exprEnt(0);
					}
					break;
				case 2:
					{
					setState(337);
					exprG();
					}
					break;
				case 3:
					{
					setState(338);
					appelDeFonction();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new AndOrFonctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(341);
					exprBool(0);
					}
					break;
				case 2:
					{
					setState(342);
					exprG();
					}
					break;
				case 3:
					{
					setState(343);
					appelDeFonction();
					}
					break;
				}
				setState(346);
				((AndOrFonctionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((AndOrFonctionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(347);
					exprBool(0);
					}
					break;
				case 2:
					{
					setState(348);
					exprG();
					}
					break;
				case 3:
					{
					setState(349);
					appelDeFonction();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new NotFonctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(352);
				match(NOT);
				setState(353);
				appelDeFonction();
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
		public AppelDeFonctionContext appelDeFonction() {
			return getRuleContext(AppelDeFonctionContext.class,0);
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
	public static class AffectationGaucheBoolContext extends InstructionContext {
		public TerminalNode SET() { return getToken(B314Parser.SET, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode TO() { return getToken(B314Parser.TO, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public AffectationGaucheBoolContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAffectationGaucheBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAffectationGaucheBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAffectationGaucheBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfthenelseContext extends InstructionContext {
		public TerminalNode IF() { return getToken(B314Parser.IF, 0); }
		public TerminalNode THEN() { return getToken(B314Parser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(B314Parser.ELSE, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public AppelDeFonctionContext appelDeFonction() {
			return getRuleContext(AppelDeFonctionContext.class,0);
		}
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
	public static class AffectationGaucheGaucheContext extends InstructionContext {
		public TerminalNode SET() { return getToken(B314Parser.SET, 0); }
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public TerminalNode TO() { return getToken(B314Parser.TO, 0); }
		public AffectationGaucheGaucheContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAffectationGaucheGauche(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAffectationGaucheGauche(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAffectationGaucheGauche(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AffectationGaucheCaseContext extends InstructionContext {
		public TerminalNode SET() { return getToken(B314Parser.SET, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode TO() { return getToken(B314Parser.TO, 0); }
		public ExprCaseContext exprCase() {
			return getRuleContext(ExprCaseContext.class,0);
		}
		public AffectationGaucheCaseContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAffectationGaucheCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAffectationGaucheCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAffectationGaucheCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AffectationGaucheFonctionContext extends InstructionContext {
		public TerminalNode SET() { return getToken(B314Parser.SET, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode TO() { return getToken(B314Parser.TO, 0); }
		public AppelDeFonctionContext appelDeFonction() {
			return getRuleContext(AppelDeFonctionContext.class,0);
		}
		public AffectationGaucheFonctionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAffectationGaucheFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAffectationGaucheFonction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAffectationGaucheFonction(this);
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
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public AppelDeFonctionContext appelDeFonction() {
			return getRuleContext(AppelDeFonctionContext.class,0);
		}
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
	public static class AffectationGaucheEntContext extends InstructionContext {
		public TerminalNode SET() { return getToken(B314Parser.SET, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode TO() { return getToken(B314Parser.TO, 0); }
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public AffectationGaucheEntContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAffectationGaucheEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAffectationGaucheEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAffectationGaucheEnt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends InstructionContext {
		public TerminalNode IF() { return getToken(B314Parser.IF, 0); }
		public TerminalNode THEN() { return getToken(B314Parser.THEN, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public AppelDeFonctionContext appelDeFonction() {
			return getRuleContext(AppelDeFonctionContext.class,0);
		}
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

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instruction);
		int _la;
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new SkippppContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(SKIPPPP);
				}
				break;
			case 2:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(IF);
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(358);
					exprBool(0);
					}
					break;
				case 2:
					{
					setState(359);
					appelDeFonction();
					}
					break;
				}
				setState(362);
				match(THEN);
				setState(364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(363);
					instruction();
					}
					}
					setState(366); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (NEXT - 54)) | (1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (SET - 54)) | (1L << (COMPUTE - 54)) | (1L << (SKIPPPP - 54)))) != 0) );
				setState(368);
				match(DONE);
				}
				break;
			case 3:
				_localctx = new IfthenelseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(IF);
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(371);
					exprBool(0);
					}
					break;
				case 2:
					{
					setState(372);
					appelDeFonction();
					}
					break;
				}
				setState(375);
				match(THEN);
				setState(377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(376);
					instruction();
					}
					}
					setState(379); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (NEXT - 54)) | (1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (SET - 54)) | (1L << (COMPUTE - 54)) | (1L << (SKIPPPP - 54)))) != 0) );
				setState(381);
				match(ELSE);
				setState(383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(382);
					instruction();
					}
					}
					setState(385); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (NEXT - 54)) | (1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (SET - 54)) | (1L << (COMPUTE - 54)) | (1L << (SKIPPPP - 54)))) != 0) );
				setState(387);
				match(DONE);
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				match(WHILE);
				setState(392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(390);
					exprBool(0);
					}
					break;
				case 2:
					{
					setState(391);
					appelDeFonction();
					}
					break;
				}
				setState(394);
				match(DO);
				setState(396); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(395);
					instruction();
					}
					}
					setState(398); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (NEXT - 54)) | (1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (SET - 54)) | (1L << (COMPUTE - 54)) | (1L << (SKIPPPP - 54)))) != 0) );
				setState(400);
				match(DONE);
				}
				break;
			case 5:
				_localctx = new AffectationGaucheGaucheContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
				match(SET);
				setState(403);
				exprG();
				setState(404);
				match(TO);
				setState(405);
				exprG();
				}
				break;
			case 6:
				_localctx = new AffectationGaucheEntContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(407);
				match(SET);
				setState(408);
				exprG();
				setState(409);
				match(TO);
				setState(410);
				exprEnt(0);
				}
				break;
			case 7:
				_localctx = new AffectationGaucheBoolContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(412);
				match(SET);
				setState(413);
				exprG();
				setState(414);
				match(TO);
				setState(415);
				exprBool(0);
				}
				break;
			case 8:
				_localctx = new AffectationGaucheCaseContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(417);
				match(SET);
				setState(418);
				exprG();
				setState(419);
				match(TO);
				setState(420);
				exprCase();
				}
				break;
			case 9:
				_localctx = new AffectationGaucheFonctionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(422);
				match(SET);
				setState(423);
				exprG();
				setState(424);
				match(TO);
				setState(425);
				appelDeFonction();
				}
				break;
			case 10:
				_localctx = new ComputeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(427);
				match(COMPUTE);
				setState(430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(428);
					exprD();
					}
					break;
				case 2:
					{
					setState(429);
					appelDeFonction();
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new NextActionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(432);
				match(NEXT);
				setState(433);
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
		enterRule(_localctx, 32, RULE_action);
		int _la;
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(MOVE);
				setState(437);
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
				setState(438);
				match(SHOOT);
				setState(439);
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
				setState(440);
				match(USE);
				setState(441);
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
				setState(442);
				match(DO);
				setState(443);
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
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode RETAIN() { return getToken(B314Parser.RETAIN, 0); }
		public ProgDeclContext progDecl() {
			return getRuleContext(ProgDeclContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(B314Parser.WHEN, 0); }
		public TerminalNode YOUR() { return getToken(B314Parser.YOUR, 0); }
		public TerminalNode TURN() { return getToken(B314Parser.TURN, 0); }
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
		enterRule(_localctx, 34, RULE_programme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(DECLARE);
			setState(447);
			match(AND);
			setState(448);
			match(RETAIN);
			setState(449);
			progDecl();
			setState(450);
			match(WHEN);
			setState(451);
			match(YOUR);
			setState(452);
			match(TURN);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(453);
				clauseWhen();
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
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
		enterRule(_localctx, 36, RULE_progDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(461);
					varDecl();
					setState(462);
					match(POINtVIRGULE);
					}
					break;
				case 2:
					{
					setState(464);
					fctDecl();
					}
					break;
				}
				}
				setState(469);
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
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(B314Parser.LOCAL, 0); }
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
		enterRule(_localctx, 38, RULE_fctDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(ID);
			setState(471);
			match(AS);
			setState(472);
			match(FUNCTION);
			setState(473);
			match(PAR_OUVERT);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(474);
				paramDecl();
				}
			}

			setState(477);
			match(PAR_FERME);
			setState(478);
			match(DEUXPOINTS);
			setState(479);
			fctType();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(480);
				match(DECLARE);
				setState(481);
				match(LOCAL);
				setState(485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(482);
					varDecl();
					setState(483);
					match(POINtVIRGULE);
					}
					}
					setState(487); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(491);
			match(DO);
			setState(493); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(492);
				instruction();
				}
				}
				setState(495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (NEXT - 54)) | (1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (SET - 54)) | (1L << (COMPUTE - 54)) | (1L << (SKIPPPP - 54)))) != 0) );
			setState(497);
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
		enterRule(_localctx, 40, RULE_fctType);
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTEGER:
			case SQUARE:
				_localctx = new FctTypeScalarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				scalar();
				}
				break;
			case VOID:
				_localctx = new FctTypeVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
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
		enterRule(_localctx, 42, RULE_paramDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(503);
			varDecl();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULE) {
				{
				{
				setState(504);
				match(VIRGULE);
				setState(505);
				varDecl();
				}
				}
				setState(510);
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

	public static class ClauseWhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(B314Parser.WHEN, 0); }
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public AppelDeFonctionContext appelDeFonction() {
			return getRuleContext(AppelDeFonctionContext.class,0);
		}
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(B314Parser.LOCAL, 0); }
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
		enterRule(_localctx, 44, RULE_clauseWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(WHEN);
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(512);
				exprD();
				}
				break;
			case 2:
				{
				setState(513);
				appelDeFonction();
				}
				break;
			}
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(516);
				match(DECLARE);
				setState(517);
				match(LOCAL);
				setState(521); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(518);
					varDecl();
					setState(519);
					match(POINtVIRGULE);
					}
					}
					setState(523); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(527);
			match(DO);
			setState(529); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(528);
				instruction();
				}
				}
				setState(531); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (NEXT - 54)) | (1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (SET - 54)) | (1L << (COMPUTE - 54)) | (1L << (SKIPPPP - 54)))) != 0) );
			setState(533);
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
		public TerminalNode BY() { return getToken(B314Parser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(B314Parser.DEFAULT, 0); }
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(B314Parser.LOCAL, 0); }
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
		enterRule(_localctx, 46, RULE_clauseDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(BY);
			setState(536);
			match(DEFAULT);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(537);
				match(DECLARE);
				setState(538);
				match(LOCAL);
				setState(542); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(539);
					varDecl();
					setState(540);
					match(POINtVIRGULE);
					}
					}
					setState(544); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(548);
			match(DO);
			setState(550); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(549);
				instruction();
				}
				}
				setState(552); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (NEXT - 54)) | (1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (SET - 54)) | (1L << (COMPUTE - 54)) | (1L << (SKIPPPP - 54)))) != 0) );
			setState(554);
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
		case 5:
			return exprEnt_sempred((ExprEntContext)_localctx, predIndex);
		case 6:
			return exprBool_sempred((ExprBoolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprEnt_sempred(ExprEntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean exprBool_sempred(ExprBoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 20);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u022f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\5\2\65\n\2\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\5\4A\n\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7f\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7t\n\7\f"+
		"\7\16\7w\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00bd\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u00cb\n\b\f\b\16\b\u00ce\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f1\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00fa\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0102\n\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u010b\n\r\3\r\3\r\3\r\5\r\u0110\n\r\5\r\u0112\n\r\3"+
		"\r\3\r\5\r\u0116\n\r\3\16\5\16\u0119\n\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0124\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u012c"+
		"\n\17\7\17\u012e\n\17\f\17\16\17\u0131\13\17\5\17\u0133\n\17\3\17\3\17"+
		"\3\20\3\20\3\20\5\20\u013a\n\20\3\20\3\20\3\20\3\20\5\20\u0140\n\20\3"+
		"\20\3\20\3\20\5\20\u0145\n\20\3\20\3\20\3\20\3\20\5\20\u014b\n\20\3\20"+
		"\3\20\3\20\5\20\u0150\n\20\3\20\3\20\3\20\3\20\5\20\u0156\n\20\3\20\3"+
		"\20\3\20\5\20\u015b\n\20\3\20\3\20\3\20\3\20\5\20\u0161\n\20\3\20\3\20"+
		"\5\20\u0165\n\20\3\21\3\21\3\21\3\21\5\21\u016b\n\21\3\21\3\21\6\21\u016f"+
		"\n\21\r\21\16\21\u0170\3\21\3\21\3\21\3\21\3\21\5\21\u0178\n\21\3\21\3"+
		"\21\6\21\u017c\n\21\r\21\16\21\u017d\3\21\3\21\6\21\u0182\n\21\r\21\16"+
		"\21\u0183\3\21\3\21\3\21\3\21\3\21\5\21\u018b\n\21\3\21\3\21\6\21\u018f"+
		"\n\21\r\21\16\21\u0190\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01b1\n\21\3\21\3\21\5\21\u01b5"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01bf\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01c9\n\23\f\23\16\23\u01cc\13\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u01d4\n\24\f\24\16\24\u01d7\13\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u01de\n\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\6\25\u01e8\n\25\r\25\16\25\u01e9\5\25\u01ec\n\25\3\25\3\25"+
		"\6\25\u01f0\n\25\r\25\16\25\u01f1\3\25\3\25\3\26\3\26\5\26\u01f8\n\26"+
		"\3\27\3\27\3\27\7\27\u01fd\n\27\f\27\16\27\u0200\13\27\3\30\3\30\3\30"+
		"\5\30\u0205\n\30\3\30\3\30\3\30\3\30\3\30\6\30\u020c\n\30\r\30\16\30\u020d"+
		"\5\30\u0210\n\30\3\30\3\30\6\30\u0214\n\30\r\30\16\30\u0215\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u0221\n\31\r\31\16\31\u0222\5"+
		"\31\u0225\n\31\3\31\3\31\6\31\u0229\n\31\r\31\16\31\u022a\3\31\3\31\3"+
		"\31\2\4\f\16\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\13"+
		"\3\2-/\3\2+,\3\2()\3\2&\'\3\2\33\37\3\2\61\64\3\2\25\37\3\2(*\4\2\33\34"+
		"\36\37\u0290\2\64\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\bD\3\2\2\2\nL\3\2\2\2"+
		"\fe\3\2\2\2\16\u00bc\3\2\2\2\20\u00f0\3\2\2\2\22\u00f9\3\2\2\2\24\u0101"+
		"\3\2\2\2\26\u0103\3\2\2\2\30\u0115\3\2\2\2\32\u0118\3\2\2\2\34\u011c\3"+
		"\2\2\2\36\u0164\3\2\2\2 \u01b4\3\2\2\2\"\u01be\3\2\2\2$\u01c0\3\2\2\2"+
		"&\u01d5\3\2\2\2(\u01d8\3\2\2\2*\u01f7\3\2\2\2,\u01f9\3\2\2\2.\u0201\3"+
		"\2\2\2\60\u0219\3\2\2\2\62\65\5\4\3\2\63\65\5\6\4\2\64\62\3\2\2\2\64\63"+
		"\3\2\2\2\65\3\3\2\2\2\66:\7\3\2\2\67:\7\4\2\28:\7\5\2\29\66\3\2\2\29\67"+
		"\3\2\2\298\3\2\2\2:\5\3\2\2\2;<\5\4\3\2<=\7\7\2\2=@\7M\2\2>?\7\t\2\2?"+
		"A\7M\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\b\2\2C\7\3\2\2\2DE\7L\2\2E"+
		"F\7\16\2\2FG\5\2\2\2G\t\3\2\2\2HM\5\f\7\2IM\5\16\b\2JM\5\20\t\2KM\5\30"+
		"\r\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\13\3\2\2\2NO\b\7\1\2Of\5"+
		"\32\16\2Pf\5\22\n\2QR\5\30\r\2RS\t\2\2\2ST\5\f\7\tTf\3\2\2\2UV\5\30\r"+
		"\2VW\t\2\2\2WX\5\30\r\2Xf\3\2\2\2YZ\5\30\r\2Z[\t\3\2\2[\\\5\f\7\5\\f\3"+
		"\2\2\2]^\5\30\r\2^_\t\3\2\2_`\5\30\r\2`f\3\2\2\2ab\7\f\2\2bc\5\f\7\2c"+
		"d\7\r\2\2df\3\2\2\2eN\3\2\2\2eP\3\2\2\2eQ\3\2\2\2eU\3\2\2\2eY\3\2\2\2"+
		"e]\3\2\2\2ea\3\2\2\2fu\3\2\2\2gh\f\13\2\2hi\t\2\2\2it\5\f\7\fjk\f\7\2"+
		"\2kl\t\3\2\2lt\5\f\7\bmn\f\n\2\2no\t\2\2\2ot\5\30\r\2pq\f\6\2\2qr\t\3"+
		"\2\2rt\5\30\r\2sg\3\2\2\2sj\3\2\2\2sm\3\2\2\2sp\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2v\r\3\2\2\2wu\3\2\2\2xy\b\b\1\2y\u00bd\7!\2\2z\u00bd\7"+
		"\"\2\2{\u00bd\5\24\13\2|}\5\f\7\2}~\7*\2\2~\177\5\f\7\2\177\u00bd\3\2"+
		"\2\2\u0080\u0081\5\20\t\2\u0081\u0082\7*\2\2\u0082\u0083\5\20\t\2\u0083"+
		"\u00bd\3\2\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7*\2\2\u0086\u0087\5\30"+
		"\r\2\u0087\u00bd\3\2\2\2\u0088\u0089\5\30\r\2\u0089\u008a\7*\2\2\u008a"+
		"\u008b\5\f\7\2\u008b\u00bd\3\2\2\2\u008c\u008d\5\30\r\2\u008d\u008e\7"+
		"*\2\2\u008e\u008f\5\16\b\22\u008f\u00bd\3\2\2\2\u0090\u0091\5\30\r\2\u0091"+
		"\u0092\7*\2\2\u0092\u0093\5\20\t\2\u0093\u00bd\3\2\2\2\u0094\u0095\5\f"+
		"\7\2\u0095\u0096\7*\2\2\u0096\u0097\5\30\r\2\u0097\u00bd\3\2\2\2\u0098"+
		"\u0099\5\20\t\2\u0099\u009a\7*\2\2\u009a\u009b\5\30\r\2\u009b\u00bd\3"+
		"\2\2\2\u009c\u009d\5\f\7\2\u009d\u009e\t\4\2\2\u009e\u009f\5\f\7\2\u009f"+
		"\u00bd\3\2\2\2\u00a0\u00a1\5\f\7\2\u00a1\u00a2\t\4\2\2\u00a2\u00a3\5\30"+
		"\r\2\u00a3\u00bd\3\2\2\2\u00a4\u00a5\5\30\r\2\u00a5\u00a6\t\4\2\2\u00a6"+
		"\u00a7\5\f\7\2\u00a7\u00bd\3\2\2\2\u00a8\u00a9\5\30\r\2\u00a9\u00aa\t"+
		"\4\2\2\u00aa\u00ab\5\30\r\2\u00ab\u00bd\3\2\2\2\u00ac\u00ad\5\30\r\2\u00ad"+
		"\u00ae\t\5\2\2\u00ae\u00af\5\16\b\7\u00af\u00bd\3\2\2\2\u00b0\u00b1\5"+
		"\30\r\2\u00b1\u00b2\t\5\2\2\u00b2\u00b3\5\30\r\2\u00b3\u00bd\3\2\2\2\u00b4"+
		"\u00b5\7%\2\2\u00b5\u00bd\5\16\b\5\u00b6\u00b7\7%\2\2\u00b7\u00bd\5\30"+
		"\r\2\u00b8\u00b9\7\f\2\2\u00b9\u00ba\5\16\b\2\u00ba\u00bb\7\r\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bcx\3\2\2\2\u00bcz\3\2\2\2\u00bc{\3\2\2\2\u00bc|\3\2"+
		"\2\2\u00bc\u0080\3\2\2\2\u00bc\u0084\3\2\2\2\u00bc\u0088\3\2\2\2\u00bc"+
		"\u008c\3\2\2\2\u00bc\u0090\3\2\2\2\u00bc\u0094\3\2\2\2\u00bc\u0098\3\2"+
		"\2\2\u00bc\u009c\3\2\2\2\u00bc\u00a0\3\2\2\2\u00bc\u00a4\3\2\2\2\u00bc"+
		"\u00a8\3\2\2\2\u00bc\u00ac\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b4\3\2"+
		"\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\u00cc\3\2\2\2\u00be"+
		"\u00bf\f\26\2\2\u00bf\u00c0\7*\2\2\u00c0\u00cb\5\16\b\27\u00c1\u00c2\f"+
		"\t\2\2\u00c2\u00c3\t\5\2\2\u00c3\u00cb\5\16\b\n\u00c4\u00c5\f\17\2\2\u00c5"+
		"\u00c6\7*\2\2\u00c6\u00cb\5\30\r\2\u00c7\u00c8\f\b\2\2\u00c8\u00c9\t\5"+
		"\2\2\u00c9\u00cb\5\30\r\2\u00ca\u00be\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca"+
		"\u00c4\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\17\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00f1"+
		"\5\26\f\2\u00d0\u00d1\7 \2\2\u00d1\u00d2\7\7\2\2\u00d2\u00d3\5\f\7\2\u00d3"+
		"\u00d4\7\t\2\2\u00d4\u00d5\5\f\7\2\u00d5\u00d6\7\b\2\2\u00d6\u00f1\3\2"+
		"\2\2\u00d7\u00d8\7 \2\2\u00d8\u00d9\7\7\2\2\u00d9\u00da\5\f\7\2\u00da"+
		"\u00db\7\t\2\2\u00db\u00dc\5\30\r\2\u00dc\u00dd\7\b\2\2\u00dd\u00f1\3"+
		"\2\2\2\u00de\u00df\7 \2\2\u00df\u00e0\7\7\2\2\u00e0\u00e1\5\30\r\2\u00e1"+
		"\u00e2\7\t\2\2\u00e2\u00e3\5\f\7\2\u00e3\u00e4\7\b\2\2\u00e4\u00f1\3\2"+
		"\2\2\u00e5\u00e6\7 \2\2\u00e6\u00e7\7\7\2\2\u00e7\u00e8\5\30\r\2\u00e8"+
		"\u00e9\7\t\2\2\u00e9\u00ea\5\30\r\2\u00ea\u00eb\7\b\2\2\u00eb\u00f1\3"+
		"\2\2\2\u00ec\u00ed\7\f\2\2\u00ed\u00ee\5\20\t\2\u00ee\u00ef\7\r\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00cf\3\2\2\2\u00f0\u00d0\3\2\2\2\u00f0\u00d7\3\2"+
		"\2\2\u00f0\u00de\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f1"+
		"\21\3\2\2\2\u00f2\u00fa\7\17\2\2\u00f3\u00fa\7\20\2\2\u00f4\u00f5\7\21"+
		"\2\2\u00f5\u00fa\7\22\2\2\u00f6\u00f7\t\6\2\2\u00f7\u00fa\7\23\2\2\u00f8"+
		"\u00fa\7\24\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f4\3"+
		"\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\23\3\2\2\2\u00fb"+
		"\u00fc\7\32\2\2\u00fc\u00fd\7#\2\2\u00fd\u0102\t\7\2\2\u00fe\u00ff\7$"+
		"\2\2\u00ff\u0100\7#\2\2\u0100\u0102\t\7\2\2\u0101\u00fb\3\2\2\2\u0101"+
		"\u00fe\3\2\2\2\u0102\25\3\2\2\2\u0103\u0104\t\b\2\2\u0104\27\3\2\2\2\u0105"+
		"\u0116\7L\2\2\u0106\u0107\7L\2\2\u0107\u010a\7\7\2\2\u0108\u010b\5\n\6"+
		"\2\u0109\u010b\5\34\17\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b"+
		"\u0111\3\2\2\2\u010c\u010f\7\t\2\2\u010d\u0110\5\n\6\2\u010e\u0110\5\34"+
		"\17\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010c\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\b"+
		"\2\2\u0114\u0116\3\2\2\2\u0115\u0105\3\2\2\2\u0115\u0106\3\2\2\2\u0116"+
		"\31\3\2\2\2\u0117\u0119\7,\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2"+
		"\u0119\u011a\3\2\2\2\u011a\u011b\7M\2\2\u011b\33\3\2\2\2\u011c\u011d\7"+
		"L\2\2\u011d\u0132\7\f\2\2\u011e\u0124\5\f\7\2\u011f\u0124\5\16\b\2\u0120"+
		"\u0124\5\20\t\2\u0121\u0124\5\30\r\2\u0122\u0124\5\34\17\2\u0123\u011e"+
		"\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0122\3\2\2\2\u0124\u012f\3\2\2\2\u0125\u012b\7\t\2\2\u0126\u012c\5\f"+
		"\7\2\u0127\u012c\5\16\b\2\u0128\u012c\5\20\t\2\u0129\u012c\5\30\r\2\u012a"+
		"\u012c\5\34\17\2\u012b\u0126\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0128\3"+
		"\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u0125\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0123\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\r\2\2\u0135\35\3\2\2"+
		"\2\u0136\u013a\5\f\7\2\u0137\u013a\5\30\r\2\u0138\u013a\5\34\17\2\u0139"+
		"\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013f\t\2\2\2\u013c\u0140\5\f\7\2\u013d\u0140\5\30\r\2\u013e"+
		"\u0140\5\34\17\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3"+
		"\2\2\2\u0140\u0165\3\2\2\2\u0141\u0145\5\f\7\2\u0142\u0145\5\30\r\2\u0143"+
		"\u0145\5\34\17\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0146\u014a\t\3\2\2\u0147\u014b\5\f\7\2\u0148"+
		"\u014b\5\30\r\2\u0149\u014b\5\34\17\2\u014a\u0147\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u0149\3\2\2\2\u014b\u0165\3\2\2\2\u014c\u0150\5\f\7\2\u014d"+
		"\u0150\5\30\r\2\u014e\u0150\5\34\17\2\u014f\u014c\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0155\t\t\2\2\u0152"+
		"\u0156\5\f\7\2\u0153\u0156\5\30\r\2\u0154\u0156\5\34\17\2\u0155\u0152"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\u0165\3\2\2\2\u0157"+
		"\u015b\5\16\b\2\u0158\u015b\5\30\r\2\u0159\u015b\5\34\17\2\u015a\u0157"+
		"\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u0160\t\5\2\2\u015d\u0161\5\16\b\2\u015e\u0161\5\30\r\2\u015f\u0161\5"+
		"\34\17\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161"+
		"\u0165\3\2\2\2\u0162\u0163\7%\2\2\u0163\u0165\5\34\17\2\u0164\u0139\3"+
		"\2\2\2\u0164\u0144\3\2\2\2\u0164\u014f\3\2\2\2\u0164\u015a\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\37\3\2\2\2\u0166\u01b5\7K\2\2\u0167\u016a\7D\2\2"+
		"\u0168\u016b\5\16\b\2\u0169\u016b\5\34\17\2\u016a\u0168\3\2\2\2\u016a"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\7E\2\2\u016d\u016f\5 \21"+
		"\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7@\2\2\u0173\u01b5\3\2\2\2\u0174"+
		"\u0177\7D\2\2\u0175\u0178\5\16\b\2\u0176\u0178\5\34\17\2\u0177\u0175\3"+
		"\2\2\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\7E\2\2\u017a"+
		"\u017c\5 \21\2\u017b\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017b\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\7I\2\2\u0180"+
		"\u0182\5 \21\2\u0181\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7@\2\2\u0186"+
		"\u01b5\3\2\2\2\u0187\u018a\7F\2\2\u0188\u018b\5\16\b\2\u0189\u018b\5\34"+
		"\17\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018e\7A\2\2\u018d\u018f\5 \21\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\7@\2\2\u0193\u01b5\3\2\2\2\u0194\u0195\7G\2\2\u0195\u0196\5\30"+
		"\r\2\u0196\u0197\7J\2\2\u0197\u0198\5\30\r\2\u0198\u01b5\3\2\2\2\u0199"+
		"\u019a\7G\2\2\u019a\u019b\5\30\r\2\u019b\u019c\7J\2\2\u019c\u019d\5\f"+
		"\7\2\u019d\u01b5\3\2\2\2\u019e\u019f\7G\2\2\u019f\u01a0\5\30\r\2\u01a0"+
		"\u01a1\7J\2\2\u01a1\u01a2\5\16\b\2\u01a2\u01b5\3\2\2\2\u01a3\u01a4\7G"+
		"\2\2\u01a4\u01a5\5\30\r\2\u01a5\u01a6\7J\2\2\u01a6\u01a7\5\20\t\2\u01a7"+
		"\u01b5\3\2\2\2\u01a8\u01a9\7G\2\2\u01a9\u01aa\5\30\r\2\u01aa\u01ab\7J"+
		"\2\2\u01ab\u01ac\5\34\17\2\u01ac\u01b5\3\2\2\2\u01ad\u01b0\7H\2\2\u01ae"+
		"\u01b1\5\n\6\2\u01af\u01b1\5\34\17\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3"+
		"\2\2\2\u01b1\u01b5\3\2\2\2\u01b2\u01b3\78\2\2\u01b3\u01b5\5\"\22\2\u01b4"+
		"\u0166\3\2\2\2\u01b4\u0167\3\2\2\2\u01b4\u0174\3\2\2\2\u01b4\u0187\3\2"+
		"\2\2\u01b4\u0194\3\2\2\2\u01b4\u0199\3\2\2\2\u01b4\u019e\3\2\2\2\u01b4"+
		"\u01a3\3\2\2\2\u01b4\u01a8\3\2\2\2\u01b4\u01ad\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b5!\3\2\2\2\u01b6\u01b7\7\60\2\2\u01b7\u01bf\t\7\2\2\u01b8\u01b9"+
		"\7\65\2\2\u01b9\u01bf\t\7\2\2\u01ba\u01bb\7\66\2\2\u01bb\u01bf\t\n\2\2"+
		"\u01bc\u01bd\7A\2\2\u01bd\u01bf\7\67\2\2\u01be\u01b6\3\2\2\2\u01be\u01b8"+
		"\3\2\2\2\u01be\u01ba\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf#\3\2\2\2\u01c0"+
		"\u01c1\7>\2\2\u01c1\u01c2\7&\2\2\u01c2\u01c3\79\2\2\u01c3\u01c4\5&\24"+
		"\2\u01c4\u01c5\7:\2\2\u01c5\u01c6\7;\2\2\u01c6\u01ca\7<\2\2\u01c7\u01c9"+
		"\5.\30\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\5\60"+
		"\31\2\u01ce%\3\2\2\2\u01cf\u01d0\5\b\5\2\u01d0\u01d1\7\13\2\2\u01d1\u01d4"+
		"\3\2\2\2\u01d2\u01d4\5(\25\2\u01d3\u01cf\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\'\3\2\2\2"+
		"\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7L\2\2\u01d9\u01da\7\16\2\2\u01da\u01db"+
		"\7=\2\2\u01db\u01dd\7\f\2\2\u01dc\u01de\5,\27\2\u01dd\u01dc\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\7\r\2\2\u01e0\u01e1\7\n"+
		"\2\2\u01e1\u01eb\5*\26\2\u01e2\u01e3\7>\2\2\u01e3\u01e7\7?\2\2\u01e4\u01e5"+
		"\5\b\5\2\u01e5\u01e6\7\13\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e4\3\2\2\2"+
		"\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec"+
		"\3\2\2\2\u01eb\u01e2\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ef\7A\2\2\u01ee\u01f0\5 \21\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f4\7@\2\2\u01f4)\3\2\2\2\u01f5\u01f8\5\4\3\2\u01f6\u01f8\7\6\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8+\3\2\2\2\u01f9\u01fe\5\b\5\2"+
		"\u01fa\u01fb\7\t\2\2\u01fb\u01fd\5\b\5\2\u01fc\u01fa\3\2\2\2\u01fd\u0200"+
		"\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff-\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0201\u0204\7:\2\2\u0202\u0205\5\n\6\2\u0203\u0205\5\34"+
		"\17\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205\u020f\3\2\2\2\u0206"+
		"\u0207\7>\2\2\u0207\u020b\7?\2\2\u0208\u0209\5\b\5\2\u0209\u020a\7\13"+
		"\2\2\u020a\u020c\3\2\2\2\u020b\u0208\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u0206\3\2"+
		"\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\7A\2\2\u0212"+
		"\u0214\5 \21\2\u0213\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0213\3\2"+
		"\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\7@\2\2\u0218"+
		"/\3\2\2\2\u0219\u021a\7B\2\2\u021a\u0224\7C\2\2\u021b\u021c\7>\2\2\u021c"+
		"\u0220\7?\2\2\u021d\u021e\5\b\5\2\u021e\u021f\7\13\2\2\u021f\u0221\3\2"+
		"\2\2\u0220\u021d\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0220\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u021b\3\2\2\2\u0224\u0225\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226\u0228\7A\2\2\u0227\u0229\5 \21\2\u0228"+
		"\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2"+
		"\2\2\u022b\u022c\3\2\2\2\u022c\u022d\7@\2\2\u022d\61\3\2\2\2;\649@Les"+
		"u\u00bc\u00ca\u00cc\u00f0\u00f9\u0101\u010a\u010f\u0111\u0115\u0118\u0123"+
		"\u012b\u012f\u0132\u0139\u013f\u0144\u014a\u014f\u0155\u015a\u0160\u0164"+
		"\u016a\u0170\u0177\u017d\u0183\u018a\u0190\u01b0\u01b4\u01be\u01ca\u01d3"+
		"\u01d5\u01dd\u01e9\u01eb\u01f1\u01f7\u01fe\u0204\u020d\u020f\u0215\u0222"+
		"\u0224\u022a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}