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
		RULE_entier = 12, RULE_instruction = 13, RULE_action = 14, RULE_programme = 15, 
		RULE_progDecl = 16, RULE_fctDecl = 17, RULE_fctType = 18, RULE_paramDecl = 19, 
		RULE_clauseWhen = 20, RULE_clauseDefault = 21;
	public static final String[] ruleNames = {
		"type", "scalar", "array", "varDecl", "exprD", "exprEnt", "exprBool", 
		"exprCase", "environnementInt", "environnementBool", "environnementCase", 
		"exprG", "entier", "instruction", "action", "programme", "progDecl", "fctDecl", 
		"fctType", "paramDecl", "clauseWhen", "clauseDefault"
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
			setState(53);
			scalar();
			setState(54);
			match(CROCHET_OUVERT);
			setState(55);
			((ArrayContext)_localctx).taille1 = match(NUMBER);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULE) {
				{
				setState(56);
				match(VIRGULE);
				setState(57);
				((ArrayContext)_localctx).taille2 = match(NUMBER);
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
			setState(62);
			match(ID);
			setState(63);
			match(AS);
			setState(64);
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ExprDIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				exprEnt(0);
				}
				break;
			case 2:
				_localctx = new ExprDBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				exprBool(0);
				}
				break;
			case 3:
				_localctx = new ExprDCaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				exprCase();
				}
				break;
			case 4:
				_localctx = new ExprDGContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
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
	public static class ExprEntPlusMoinsContext extends ExprEntContext {
		public ExprEntContext expr1;
		public Token op;
		public ExprEntContext expr2;
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(B314Parser.PLUS, 0); }
		public TerminalNode MOINS() { return getToken(B314Parser.MOINS, 0); }
		public ExprEntPlusMoinsContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntPlusMoins(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntPlusMoins(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntPlusMoins(this);
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
	public static class ExprEntMulDivContext extends ExprEntContext {
		public ExprEntContext expr1;
		public Token op;
		public ExprEntContext expr2;
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode MUL() { return getToken(B314Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(B314Parser.DIV, 0); }
		public TerminalNode DIV_ENT() { return getToken(B314Parser.DIV_ENT, 0); }
		public ExprEntMulDivContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEntFonctionContext extends ExprEntContext {
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
		public ExprEntFonctionContext(ExprEntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprEntFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprEntFonction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprEntFonction(this);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOINS:
			case NUMBER:
				{
				_localctx = new ExprEntEntierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(73);
				entier();
				}
				break;
			case LATITUDE:
			case LONGITUDE:
			case GRID:
			case LIFE:
			case MAP:
			case RADIO:
			case AMMO:
			case FRUITS:
			case SODA:
				{
				_localctx = new ExprEntEnvironnementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				environnementInt();
				}
				break;
			case ID:
				{
				_localctx = new ExprEntFonctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(ID);
				setState(76);
				match(PAR_OUVERT);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OUVERT) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << LIFE) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << ENNEMI) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << NEARBY) | (1L << TRUE) | (1L << FALSE) | (1L << GRAAL) | (1L << NOT) | (1L << MOINS))) != 0) || _la==ID || _la==NUMBER) {
					{
					setState(77);
					exprD();
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULE) {
						{
						{
						setState(78);
						match(VIRGULE);
						setState(79);
						exprD();
						}
						}
						setState(84);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(87);
				match(PAR_FERME);
				}
				break;
			case PAR_OUVERT:
				{
				_localctx = new ExprEntParenntheseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(PAR_OUVERT);
				setState(89);
				exprEnt(0);
				setState(90);
				match(PAR_FERME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprEntMulDivContext(new ExprEntContext(_parentctx, _parentState));
						((ExprEntMulDivContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(94);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(95);
						((ExprEntMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << DIV_ENT))) != 0)) ) {
							((ExprEntMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						((ExprEntMulDivContext)_localctx).expr2 = exprEnt(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprEntPlusMoinsContext(new ExprEntContext(_parentctx, _parentState));
						((ExprEntPlusMoinsContext)_localctx).expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exprEnt);
						setState(97);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(98);
						((ExprEntPlusMoinsContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MOINS) ) {
							((ExprEntPlusMoinsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(99);
						((ExprEntPlusMoinsContext)_localctx).expr2 = exprEnt(3);
						}
						break;
					}
					} 
				}
				setState(104);
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
		public Token op;
		public List<ExprEntContext> exprEnt() {
			return getRuleContexts(ExprEntContext.class);
		}
		public ExprEntContext exprEnt(int i) {
			return getRuleContext(ExprEntContext.class,i);
		}
		public TerminalNode INF() { return getToken(B314Parser.INF, 0); }
		public TerminalNode SUP() { return getToken(B314Parser.SUP, 0); }
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
	public static class ExprBoolEgaleGaucheContext extends ExprBoolContext {
		public ExprGContext expr1;
		public ExprGContext expr2;
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public List<ExprGContext> exprG() {
			return getRuleContexts(ExprGContext.class);
		}
		public ExprGContext exprG(int i) {
			return getRuleContext(ExprGContext.class,i);
		}
		public ExprBoolEgaleGaucheContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolEgaleGauche(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolEgaleGauche(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolEgaleGauche(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolFonctionContext extends ExprBoolContext {
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
		public ExprBoolFonctionContext(ExprBoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprBoolFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprBoolFonction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprBoolFonction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolAndOrContext extends ExprBoolContext {
		public Token op;
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ExprBoolTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(106);
				match(TRUE);
				}
				break;
			case 2:
				{
				_localctx = new ExprBoolFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(FALSE);
				}
				break;
			case 3:
				{
				_localctx = new ExprBoolFonctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(ID);
				setState(109);
				match(PAR_OUVERT);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OUVERT) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << LIFE) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << ENNEMI) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << NEARBY) | (1L << TRUE) | (1L << FALSE) | (1L << GRAAL) | (1L << NOT) | (1L << MOINS))) != 0) || _la==ID || _la==NUMBER) {
					{
					setState(110);
					exprD();
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULE) {
						{
						{
						setState(111);
						match(VIRGULE);
						setState(112);
						exprD();
						}
						}
						setState(117);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(120);
				match(PAR_FERME);
				}
				break;
			case 4:
				{
				_localctx = new ExprBoolEnvironnementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				environnementBool();
				}
				break;
			case 5:
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
			case 6:
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
			case 7:
				{
				_localctx = new ExprBoolEgaleGaucheContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				((ExprBoolEgaleGaucheContext)_localctx).expr1 = exprG();
				setState(131);
				match(EGALE);
				setState(132);
				((ExprBoolEgaleGaucheContext)_localctx).expr2 = exprG();
				}
				break;
			case 8:
				{
				_localctx = new ExprBoolInfSupEgaleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				exprEnt(0);
				setState(135);
				((ExprBoolInfSupEgaleContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INF || _la==SUP) ) {
					((ExprBoolInfSupEgaleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(136);
				exprEnt(0);
				}
				break;
			case 9:
				{
				_localctx = new ExprBoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(NOT);
				setState(139);
				exprBool(2);
				}
				break;
			case 10:
				{
				_localctx = new ExprBoolParenntheseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(PAR_OUVERT);
				setState(141);
				exprBool(0);
				setState(142);
				match(PAR_FERME);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBoolEgaleBooleanContext(new ExprBoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(146);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(147);
						match(EGALE);
						setState(148);
						exprBool(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprBoolAndOrContext(new ExprBoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprBool);
						setState(149);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(150);
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
						setState(151);
						exprBool(4);
						}
						break;
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class ExprCaseNearbyContext extends ExprCaseContext {
		public ExprDContext taille1;
		public ExprDContext taille2;
		public TerminalNode NEARBY() { return getToken(B314Parser.NEARBY, 0); }
		public TerminalNode CROCHET_OUVERT() { return getToken(B314Parser.CROCHET_OUVERT, 0); }
		public TerminalNode VIRGULE() { return getToken(B314Parser.VIRGULE, 0); }
		public TerminalNode CROCHET_FERME() { return getToken(B314Parser.CROCHET_FERME, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
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
	public static class ExprCaseFonctionContext extends ExprCaseContext {
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
		public ExprCaseFonctionContext(ExprCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprCaseFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprCaseFonction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprCaseFonction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseContext exprCase() throws RecognitionException {
		ExprCaseContext _localctx = new ExprCaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprCase);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ExprCaseFonctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(ID);
				setState(158);
				match(PAR_OUVERT);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OUVERT) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << LIFE) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << ENNEMI) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << NEARBY) | (1L << TRUE) | (1L << FALSE) | (1L << GRAAL) | (1L << NOT) | (1L << MOINS))) != 0) || _la==ID || _la==NUMBER) {
					{
					setState(159);
					exprD();
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULE) {
						{
						{
						setState(160);
						match(VIRGULE);
						setState(161);
						exprD();
						}
						}
						setState(166);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(169);
				match(PAR_FERME);
				}
				break;
			case DIRT:
			case ROCK:
			case VINES:
			case ZOMBIE:
			case PLAYER:
			case ENNEMI:
			case MAP:
			case RADIO:
			case AMMO:
			case FRUITS:
			case SODA:
				_localctx = new ExprCaseEnvironnementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				environnementCase();
				}
				break;
			case NEARBY:
				_localctx = new ExprCaseNearbyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(NEARBY);
				setState(172);
				match(CROCHET_OUVERT);
				setState(173);
				((ExprCaseNearbyContext)_localctx).taille1 = exprD();
				setState(174);
				match(VIRGULE);
				setState(175);
				((ExprCaseNearbyContext)_localctx).taille2 = exprD();
				setState(176);
				match(CROCHET_FERME);
				}
				break;
			case PAR_OUVERT:
				_localctx = new ExprCaseParenntheseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(PAR_OUVERT);
				setState(179);
				exprCase();
				setState(180);
				match(PAR_FERME);
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
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LATITUDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(LATITUDE);
				}
				break;
			case LONGITUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(LONGITUDE);
				}
				break;
			case GRID:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(GRID);
				setState(187);
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
				setState(188);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(189);
				match(COUNT);
				}
				break;
			case LIFE:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
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
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENNEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(ENNEMI);
				setState(194);
				match(IS);
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
			case GRAAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(GRAAL);
				setState(197);
				match(IS);
				setState(198);
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
			setState(201);
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
		public ExprDContext taille1;
		public ExprDContext taille2;
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode CROCHET_OUVERT() { return getToken(B314Parser.CROCHET_OUVERT, 0); }
		public TerminalNode CROCHET_FERME() { return getToken(B314Parser.CROCHET_FERME, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ExprGVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ExprGTableauContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(ID);
				setState(205);
				match(CROCHET_OUVERT);
				setState(206);
				((ExprGTableauContext)_localctx).taille1 = exprD();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VIRGULE) {
					{
					setState(207);
					match(VIRGULE);
					setState(208);
					((ExprGTableauContext)_localctx).taille2 = exprD();
					}
				}

				setState(211);
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
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MOINS) {
				{
				setState(215);
				match(MOINS);
				}
			}

			setState(218);
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
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
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
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
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
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
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
		enterRule(_localctx, 26, RULE_instruction);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new SkippppContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(SKIPPPP);
				}
				break;
			case 2:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(IF);
				setState(222);
				exprBool(0);
				setState(223);
				match(THEN);
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					instruction();
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (NEXT - 54)) | (1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (SET - 54)) | (1L << (COMPUTE - 54)) | (1L << (SKIPPPP - 54)))) != 0) );
				setState(229);
				match(DONE);
				}
				break;
			case 3:
				_localctx = new IfthenelseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(IF);
				setState(232);
				exprBool(0);
				setState(233);
				match(THEN);
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(234);
					instruction();
					}
					}
					setState(237); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (NEXT - 54)) | (1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (SET - 54)) | (1L << (COMPUTE - 54)) | (1L << (SKIPPPP - 54)))) != 0) );
				setState(239);
				match(ELSE);
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(240);
					instruction();
					}
					}
					setState(243); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (NEXT - 54)) | (1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (SET - 54)) | (1L << (COMPUTE - 54)) | (1L << (SKIPPPP - 54)))) != 0) );
				setState(245);
				match(DONE);
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(WHILE);
				setState(248);
				exprBool(0);
				setState(249);
				match(DO);
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(250);
					instruction();
					}
					}
					setState(253); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (NEXT - 54)) | (1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (SET - 54)) | (1L << (COMPUTE - 54)) | (1L << (SKIPPPP - 54)))) != 0) );
				setState(255);
				match(DONE);
				}
				break;
			case 5:
				_localctx = new AffectationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				match(SET);
				setState(258);
				exprG();
				setState(259);
				match(TO);
				setState(260);
				exprD();
				}
				break;
			case 6:
				_localctx = new ComputeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(262);
				match(COMPUTE);
				setState(263);
				exprD();
				}
				break;
			case 7:
				_localctx = new NextActionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				match(NEXT);
				setState(265);
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
		enterRule(_localctx, 28, RULE_action);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(MOVE);
				setState(269);
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
				setState(270);
				match(SHOOT);
				setState(271);
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
				setState(272);
				match(USE);
				setState(273);
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
				setState(274);
				match(DO);
				setState(275);
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
		enterRule(_localctx, 30, RULE_programme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(DECLARE);
			setState(279);
			match(AND);
			setState(280);
			match(RETAIN);
			setState(281);
			progDecl();
			setState(282);
			match(WHEN);
			setState(283);
			match(YOUR);
			setState(284);
			match(TURN);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(285);
				clauseWhen();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
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
		enterRule(_localctx, 32, RULE_progDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(293);
					varDecl();
					setState(294);
					match(POINtVIRGULE);
					}
					break;
				case 2:
					{
					setState(296);
					fctDecl();
					}
					break;
				}
				}
				setState(301);
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
		enterRule(_localctx, 34, RULE_fctDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(ID);
			setState(303);
			match(AS);
			setState(304);
			match(FUNCTION);
			setState(305);
			match(PAR_OUVERT);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(306);
				paramDecl();
				}
			}

			setState(309);
			match(PAR_FERME);
			setState(310);
			match(DEUXPOINTS);
			setState(311);
			fctType();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(312);
				match(DECLARE);
				setState(313);
				match(LOCAL);
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
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (NEXT - 54)) | (1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (SET - 54)) | (1L << (COMPUTE - 54)) | (1L << (SKIPPPP - 54)))) != 0) );
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
		enterRule(_localctx, 36, RULE_fctType);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTEGER:
			case SQUARE:
				_localctx = new FctTypeScalarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				scalar();
				}
				break;
			case VOID:
				_localctx = new FctTypeVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
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
		enterRule(_localctx, 38, RULE_paramDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(335);
			varDecl();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULE) {
				{
				{
				setState(336);
				match(VIRGULE);
				setState(337);
				varDecl();
				}
				}
				setState(342);
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
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
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
			setState(343);
			match(WHEN);
			setState(344);
			exprD();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(345);
				match(DECLARE);
				setState(346);
				match(LOCAL);
				setState(350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(347);
					varDecl();
					setState(348);
					match(POINtVIRGULE);
					}
					}
					setState(352); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(356);
			match(DO);
			setState(358); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(357);
				instruction();
				}
				}
				setState(360); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (NEXT - 54)) | (1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (SET - 54)) | (1L << (COMPUTE - 54)) | (1L << (SKIPPPP - 54)))) != 0) );
			setState(362);
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
		enterRule(_localctx, 42, RULE_clauseDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(BY);
			setState(365);
			match(DEFAULT);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(366);
				match(DECLARE);
				setState(367);
				match(LOCAL);
				setState(371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(368);
					varDecl();
					setState(369);
					match(POINtVIRGULE);
					}
					}
					setState(373); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(377);
			match(DO);
			setState(379); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(378);
				instruction();
				}
				}
				setState(381); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (NEXT - 54)) | (1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (SET - 54)) | (1L << (COMPUTE - 54)) | (1L << (SKIPPPP - 54)))) != 0) );
			setState(383);
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
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprBool_sempred(ExprBoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\5\2\61\n\2"+
		"\3\3\3\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\5\6I\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7S\n"+
		"\7\f\7\16\7V\13\7\5\7X\n\7\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7g\n\7\f\7\16\7j\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"t\n\b\f\b\16\bw\13\b\5\by\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0093\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009b\n\b\f\b\16\b\u009e\13\b\3\t\3\t\3\t"+
		"\3\t\3\t\7\t\u00a5\n\t\f\t\16\t\u00a8\13\t\5\t\u00aa\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b9\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00c2\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ca\n\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d4\n\r\3\r\3\r\5\r\u00d8\n\r\3"+
		"\16\5\16\u00db\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\6\17\u00e4\n\17"+
		"\r\17\16\17\u00e5\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00ee\n\17\r\17\16"+
		"\17\u00ef\3\17\3\17\6\17\u00f4\n\17\r\17\16\17\u00f5\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\6\17\u00fe\n\17\r\17\16\17\u00ff\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u010d\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0117\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u0121\n\21\f\21\16\21\u0124\13\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\7\22\u012c\n\22\f\22\16\22\u012f\13\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0136\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u0140\n\23\r"+
		"\23\16\23\u0141\5\23\u0144\n\23\3\23\3\23\6\23\u0148\n\23\r\23\16\23\u0149"+
		"\3\23\3\23\3\24\3\24\5\24\u0150\n\24\3\25\3\25\3\25\7\25\u0155\n\25\f"+
		"\25\16\25\u0158\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u0161\n"+
		"\26\r\26\16\26\u0162\5\26\u0165\n\26\3\26\3\26\6\26\u0169\n\26\r\26\16"+
		"\26\u016a\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u0176\n\27"+
		"\r\27\16\27\u0177\5\27\u017a\n\27\3\27\3\27\6\27\u017e\n\27\r\27\16\27"+
		"\u017f\3\27\3\27\3\27\2\4\f\16\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,\2\n\3\2-/\3\2+,\3\2()\3\2&\'\3\2\33\37\3\2\61\64\3\2\25\37"+
		"\4\2\33\34\36\37\u01b1\2\60\3\2\2\2\4\65\3\2\2\2\6\67\3\2\2\2\b@\3\2\2"+
		"\2\nH\3\2\2\2\f^\3\2\2\2\16\u0092\3\2\2\2\20\u00b8\3\2\2\2\22\u00c1\3"+
		"\2\2\2\24\u00c9\3\2\2\2\26\u00cb\3\2\2\2\30\u00d7\3\2\2\2\32\u00da\3\2"+
		"\2\2\34\u010c\3\2\2\2\36\u0116\3\2\2\2 \u0118\3\2\2\2\"\u012d\3\2\2\2"+
		"$\u0130\3\2\2\2&\u014f\3\2\2\2(\u0151\3\2\2\2*\u0159\3\2\2\2,\u016e\3"+
		"\2\2\2.\61\5\4\3\2/\61\5\6\4\2\60.\3\2\2\2\60/\3\2\2\2\61\3\3\2\2\2\62"+
		"\66\7\3\2\2\63\66\7\4\2\2\64\66\7\5\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65"+
		"\64\3\2\2\2\66\5\3\2\2\2\678\5\4\3\289\7\7\2\29<\7M\2\2:;\7\t\2\2;=\7"+
		"M\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\b\2\2?\7\3\2\2\2@A\7L\2\2AB\7"+
		"\16\2\2BC\5\2\2\2C\t\3\2\2\2DI\5\f\7\2EI\5\16\b\2FI\5\20\t\2GI\5\30\r"+
		"\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\13\3\2\2\2JK\b\7\1\2K_\5\32"+
		"\16\2L_\5\22\n\2MN\7L\2\2NW\7\f\2\2OT\5\n\6\2PQ\7\t\2\2QS\5\n\6\2RP\3"+
		"\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WO\3\2\2\2WX\3"+
		"\2\2\2XY\3\2\2\2Y_\7\r\2\2Z[\7\f\2\2[\\\5\f\7\2\\]\7\r\2\2]_\3\2\2\2^"+
		"J\3\2\2\2^L\3\2\2\2^M\3\2\2\2^Z\3\2\2\2_h\3\2\2\2`a\f\5\2\2ab\t\2\2\2"+
		"bg\5\f\7\6cd\f\4\2\2de\t\3\2\2eg\5\f\7\5f`\3\2\2\2fc\3\2\2\2gj\3\2\2\2"+
		"hf\3\2\2\2hi\3\2\2\2i\r\3\2\2\2jh\3\2\2\2kl\b\b\1\2l\u0093\7!\2\2m\u0093"+
		"\7\"\2\2no\7L\2\2ox\7\f\2\2pu\5\n\6\2qr\7\t\2\2rt\5\n\6\2sq\3\2\2\2tw"+
		"\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xp\3\2\2\2xy\3\2\2\2y"+
		"z\3\2\2\2z\u0093\7\r\2\2{\u0093\5\24\13\2|}\5\f\7\2}~\7*\2\2~\177\5\f"+
		"\7\2\177\u0093\3\2\2\2\u0080\u0081\5\20\t\2\u0081\u0082\7*\2\2\u0082\u0083"+
		"\5\20\t\2\u0083\u0093\3\2\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7*\2\2"+
		"\u0086\u0087\5\30\r\2\u0087\u0093\3\2\2\2\u0088\u0089\5\f\7\2\u0089\u008a"+
		"\t\4\2\2\u008a\u008b\5\f\7\2\u008b\u0093\3\2\2\2\u008c\u008d\7%\2\2\u008d"+
		"\u0093\5\16\b\4\u008e\u008f\7\f\2\2\u008f\u0090\5\16\b\2\u0090\u0091\7"+
		"\r\2\2\u0091\u0093\3\2\2\2\u0092k\3\2\2\2\u0092m\3\2\2\2\u0092n\3\2\2"+
		"\2\u0092{\3\2\2\2\u0092|\3\2\2\2\u0092\u0080\3\2\2\2\u0092\u0084\3\2\2"+
		"\2\u0092\u0088\3\2\2\2\u0092\u008c\3\2\2\2\u0092\u008e\3\2\2\2\u0093\u009c"+
		"\3\2\2\2\u0094\u0095\f\t\2\2\u0095\u0096\7*\2\2\u0096\u009b\5\16\b\n\u0097"+
		"\u0098\f\5\2\2\u0098\u0099\t\5\2\2\u0099\u009b\5\16\b\6\u009a\u0094\3"+
		"\2\2\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\17\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7L\2\2"+
		"\u00a0\u00a9\7\f\2\2\u00a1\u00a6\5\n\6\2\u00a2\u00a3\7\t\2\2\u00a3\u00a5"+
		"\5\n\6\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00a1\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b9\7\r\2\2\u00ac"+
		"\u00b9\5\26\f\2\u00ad\u00ae\7 \2\2\u00ae\u00af\7\7\2\2\u00af\u00b0\5\n"+
		"\6\2\u00b0\u00b1\7\t\2\2\u00b1\u00b2\5\n\6\2\u00b2\u00b3\7\b\2\2\u00b3"+
		"\u00b9\3\2\2\2\u00b4\u00b5\7\f\2\2\u00b5\u00b6\5\20\t\2\u00b6\u00b7\7"+
		"\r\2\2\u00b7\u00b9\3\2\2\2\u00b8\u009f\3\2\2\2\u00b8\u00ac\3\2\2\2\u00b8"+
		"\u00ad\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\21\3\2\2\2\u00ba\u00c2\7\17\2"+
		"\2\u00bb\u00c2\7\20\2\2\u00bc\u00bd\7\21\2\2\u00bd\u00c2\7\22\2\2\u00be"+
		"\u00bf\t\6\2\2\u00bf\u00c2\7\23\2\2\u00c0\u00c2\7\24\2\2\u00c1\u00ba\3"+
		"\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\23\3\2\2\2\u00c3\u00c4\7\32\2\2\u00c4\u00c5\7#\2"+
		"\2\u00c5\u00ca\t\7\2\2\u00c6\u00c7\7$\2\2\u00c7\u00c8\7#\2\2\u00c8\u00ca"+
		"\t\7\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\25\3\2\2\2\u00cb"+
		"\u00cc\t\b\2\2\u00cc\27\3\2\2\2\u00cd\u00d8\7L\2\2\u00ce\u00cf\7L\2\2"+
		"\u00cf\u00d0\7\7\2\2\u00d0\u00d3\5\n\6\2\u00d1\u00d2\7\t\2\2\u00d2\u00d4"+
		"\5\n\6\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\7\b\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00ce\3\2"+
		"\2\2\u00d8\31\3\2\2\2\u00d9\u00db\7,\2\2\u00da\u00d9\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7M\2\2\u00dd\33\3\2\2\2\u00de"+
		"\u010d\7K\2\2\u00df\u00e0\7D\2\2\u00e0\u00e1\5\16\b\2\u00e1\u00e3\7E\2"+
		"\2\u00e2\u00e4\5\34\17\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7@"+
		"\2\2\u00e8\u010d\3\2\2\2\u00e9\u00ea\7D\2\2\u00ea\u00eb\5\16\b\2\u00eb"+
		"\u00ed\7E\2\2\u00ec\u00ee\5\34\17\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f3\7I\2\2\u00f2\u00f4\5\34\17\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3"+
		"\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\7@\2\2\u00f8\u010d\3\2\2\2\u00f9\u00fa\7F\2\2\u00fa\u00fb\5\16"+
		"\b\2\u00fb\u00fd\7A\2\2\u00fc\u00fe\5\34\17\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0102\7@\2\2\u0102\u010d\3\2\2\2\u0103\u0104\7G\2\2\u0104\u0105"+
		"\5\30\r\2\u0105\u0106\7J\2\2\u0106\u0107\5\n\6\2\u0107\u010d\3\2\2\2\u0108"+
		"\u0109\7H\2\2\u0109\u010d\5\n\6\2\u010a\u010b\78\2\2\u010b\u010d\5\36"+
		"\20\2\u010c\u00de\3\2\2\2\u010c\u00df\3\2\2\2\u010c\u00e9\3\2\2\2\u010c"+
		"\u00f9\3\2\2\2\u010c\u0103\3\2\2\2\u010c\u0108\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d\35\3\2\2\2\u010e\u010f\7\60\2\2\u010f\u0117\t\7\2\2\u0110\u0111"+
		"\7\65\2\2\u0111\u0117\t\7\2\2\u0112\u0113\7\66\2\2\u0113\u0117\t\t\2\2"+
		"\u0114\u0115\7A\2\2\u0115\u0117\7\67\2\2\u0116\u010e\3\2\2\2\u0116\u0110"+
		"\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0114\3\2\2\2\u0117\37\3\2\2\2\u0118"+
		"\u0119\7>\2\2\u0119\u011a\7&\2\2\u011a\u011b\79\2\2\u011b\u011c\5\"\22"+
		"\2\u011c\u011d\7:\2\2\u011d\u011e\7;\2\2\u011e\u0122\7<\2\2\u011f\u0121"+
		"\5*\26\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\5,"+
		"\27\2\u0126!\3\2\2\2\u0127\u0128\5\b\5\2\u0128\u0129\7\13\2\2\u0129\u012c"+
		"\3\2\2\2\u012a\u012c\5$\23\2\u012b\u0127\3\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e#\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u0130\u0131\7L\2\2\u0131\u0132\7\16\2\2\u0132\u0133"+
		"\7=\2\2\u0133\u0135\7\f\2\2\u0134\u0136\5(\25\2\u0135\u0134\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\r\2\2\u0138\u0139\7\n"+
		"\2\2\u0139\u0143\5&\24\2\u013a\u013b\7>\2\2\u013b\u013f\7?\2\2\u013c\u013d"+
		"\5\b\5\2\u013d\u013e\7\13\2\2\u013e\u0140\3\2\2\2\u013f\u013c\3\2\2\2"+
		"\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144"+
		"\3\2\2\2\u0143\u013a\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\7A\2\2\u0146\u0148\5\34\17\2\u0147\u0146\3\2\2\2\u0148\u0149\3"+
		"\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014c\7@\2\2\u014c%\3\2\2\2\u014d\u0150\5\4\3\2\u014e\u0150\7\6\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\'\3\2\2\2\u0151\u0156\5\b\5\2"+
		"\u0152\u0153\7\t\2\2\u0153\u0155\5\b\5\2\u0154\u0152\3\2\2\2\u0155\u0158"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157)\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0159\u015a\7:\2\2\u015a\u0164\5\n\6\2\u015b\u015c\7>\2"+
		"\2\u015c\u0160\7?\2\2\u015d\u015e\5\b\5\2\u015e\u015f\7\13\2\2\u015f\u0161"+
		"\3\2\2\2\u0160\u015d\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u015b\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0168\7A\2\2\u0167\u0169\5\34\17\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7@\2\2\u016d+\3\2\2\2\u016e\u016f"+
		"\7B\2\2\u016f\u0179\7C\2\2\u0170\u0171\7>\2\2\u0171\u0175\7?\2\2\u0172"+
		"\u0173\5\b\5\2\u0173\u0174\7\13\2\2\u0174\u0176\3\2\2\2\u0175\u0172\3"+
		"\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u017a\3\2\2\2\u0179\u0170\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u017d\7A\2\2\u017c\u017e\5\34\17\2\u017d\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0182\7@\2\2\u0182-\3\2\2\2-\60\65<HTW^fhux\u0092\u009a\u009c"+
		"\u00a6\u00a9\u00b8\u00c1\u00c9\u00d3\u00d7\u00da\u00e5\u00ef\u00f5\u00ff"+
		"\u010c\u0116\u0122\u012b\u012d\u0135\u0141\u0143\u0149\u014f\u0156\u0162"+
		"\u0164\u016a\u0177\u0179\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}