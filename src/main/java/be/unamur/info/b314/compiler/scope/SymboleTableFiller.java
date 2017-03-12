// /* To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// *and open the template in the editor.
//*/
//
//package be.unamur.info.b314.compiler.scope;
//
//import be.unamur.info.b314.compiler.B314BaseListener;
//import be.unamur.info.b314.compiler.B314Parser;
//import org.antlr.v4.runtime.ParserRuleContext;
//
//
//
////@author jessi
//
//
//
//public class SymboleTableFiller extends B314BaseListener {
//
//    enum Type{
//    INTEGER,
//    BOOLEAN,
//    SQUARE,
//    VOID
//    }
//
//    private Scope ScopeParent;
//    private Scope scopeEnfant;
//    private int WhichWhen;
//    private boolean isFonction;
//
//    private Symbole SymboleActual;
//    private SymboleScope SymboleScopeActual;
//
//
//    public SymboleTableFiller(){
//        ScopeParent = new ScopeBase("Programme");
//        scopeEnfant = ScopeParent;
//        WhichWhen = 1;
//        isFonction = false;
//    }
//    public Scope getScope(){
//        return ScopeParent;
//    }
//
//    @Override
//    public void enterFctDecl(B314Parser.FctDeclContext ctx) {
//        SymboleScopeActual = new SymboleScope(ScopeParent,ctx.ID().getText());
//        ScopeParent = SymboleScopeActual;
//        scopeEnfant.define((Symbole) SymboleScopeActual);
//        isFonction = true;
//    }
//
//    @Override
//    public void exitFctDecl(B314Parser.FctDeclContext ctx) {
//        scopeEnfant = SymboleScopeActual.getParent();
//        isFonction = false;
//    }
//    @Override
//    public void enterClauseWhen(B314Parser.ClauseWhenContext ctx) {
//        String name = "when"+"__"+WhichWhen;
//        Scope scope = new ScopeBase(name,scopeEnfant);
//        WhichWhen ++;
//        scopeEnfant = scope;
//    }
//
//    @Override
//    public void exitClauseWhen(B314Parser.ClauseWhenContext ctx) {
//        scopeEnfant = scopeEnfant.getParent();
//    }
//
//    @Override
//    public void enterClauseDefault(B314Parser.ClauseDefaultContext ctx) {
//        Scope scope = new ScopeBase("default",scopeEnfant);
//        scopeEnfant = scope;
//    }
//
//    @Override
//    public void exitClauseDefault(B314Parser.ClauseDefaultContext ctx) {
//        scopeEnfant = scopeEnfant.getParent();
//    }
//    @Override public void enterParamDecl(B314Parser.ParamDeclContext ctx) {
//        isFonction = true;
//    }
//
//    @Override
//    public void exitParamDecl(B314Parser.ParamDeclContext ctx) {
//        isFonction = false;
//    }
//
//    @Override
//    public void enterVarDecl(B314Parser.VarDeclContext ctx) {
//        SymboleActual = new Symbole(ctx.ID().getText());
//    }
//
//    @Override
//    public void exitVarDecl(B314Parser.VarDeclContext ctx) {
//        if(SymboleActual.type == null) throw new RuntimeException("Variable non typée");
//        scopeEnfant.define(SymboleActual);
//    }
//    @Override
//    public void enterTypeScalar(B314Parser.TypeScalarContext ctx) {
//
//    }
//
//    @Override
//    public void exitTypeScalar(B314Parser.TypeScalarContext ctx) {
//        if(isFonction) isFonction = false;
//    }
//
//    @Override
//    public void enterTypeArray(B314Parser.TypeArrayContext ctx) {
//
//
//    }
//
//
//    @Override
//    public void exitTypeArray(B314Parser.TypeArrayContext ctx) {
//        if(isFonction) isFonction = false;
//    }
//
//    @Override
//    public void enterScalarBoolean(B314Parser.ScalarBooleanContext ctx) {
//        if(isFonction)SymboleScopeActual.setType(Type.BOOLEAN.name());
//        SymboleActual.setType(SymboleActual, Type.BOOLEAN.name());
//    }
//
//    @Override
//    public void enterScalarInteger(B314Parser.ScalarIntegerContext ctx) {
//        if(isFonction)SymboleScopeActual.setType(Type.INTEGER.name());
//        SymboleActual.setType(SymboleActual, Type.INTEGER.name());
//    }
//
//    @Override
//    public void enterScalarSquare(B314Parser.ScalarSquareContext ctx) {
//        if(isFonction)SymboleScopeActual.setType(Type.SQUARE.name());
//        SymboleActual.setType(SymboleActual, Type.SQUARE.name());
//    }
//
//    @Override
//    public void exitFctTypeVoid(B314Parser.FctTypeVoidContext ctx) {
//        if(isFonction){
//            SymboleScopeActual.setType(Type.VOID.name());
//            isFonction = false;
//        }
//        else
//            throw new RuntimeException("erreur de typage");
//    }
//
//    private String getTypeContext(ParserRuleContext ctx){
//        if(ctx instanceof B314Parser.ExprBoolContext) return Type.BOOLEAN.name();
//        else if(ctx instanceof B314Parser.ExprCaseContext) return Type.VOID.name();
//        else if(ctx instanceof B314Parser.ExprIntContext) return Type.INTEGER.name();
//        else return Type.VOID.name();
//    }
//    @Override
//    public void enterFunctionCall(B314Parser.FunctionCallContext ctx) {
//        Symbole symbole = scopeEnfant.resolve(ctx.ID().getText());
//        if(symbole.getType() != Type.SQUARE.name()) throw new RuntimeException("ex");
//    }
//
//	@Override
//        public void enterExprBoolInfSupEgale(B314Parser.ExprBoolInfSupEgaleContext ctx) {
//            String type1 = getTypeContext(ctx.expr1);
//            String type2 = getTypeContext(ctx.expr2);
//            if(type1 != Type.BOOLEAN.name() || type2 != Type.BOOLEAN.name()) throw new RuntimeException("ex");
//        }
//
//	@Override public void enterExprBoolNot(B314Parser.ExprBoolNotContext ctx) {
//            String type = getTypeContext(ctx.exprBool());
//            if(type != Type.BOOLEAN.name() ) throw new RuntimeException("ex");
//        }
//	@Override
//        public void exitExprBoolAndOr(B314Parser.ExprBoolAndOrContext ctx) {
//            String type1 = getTypeContext(ctx.expr1);
//            String type2 = getTypeContext(ctx.expr2);
//            if(type1 != Type.BOOLEAN.name() || type2 != Type.BOOLEAN.name()) throw new RuntimeException("ex");
//        }
//
//	@Override
//        public void enterExprIntPlusMoins(B314Parser.ExprIntPlusMoinsContext ctx) {
//            String type1 = getTypeContext(ctx.expr1);
//            String type2 = getTypeContext(ctx.expr2);
//            if(type1 != Type.INTEGER.name() || type2 != Type.INTEGER.name()) throw new RuntimeException("ex");
//        }
//
//        @Override
//        public void enterExprIntMulDiv(B314Parser.ExprIntMulDivContext ctx) {
//            String type1 = getTypeContext(ctx.expr1);
//            String type2 = getTypeContext(ctx.expr2);
//            if(type1 != Type.INTEGER.name() || type2 != Type.INTEGER.name()) throw new RuntimeException("ex");
//        }
//
//	@Override
//        public void enterExprCaseNearby(B314Parser.ExprCaseNearbyContext ctx) {
//
//        }
//
//	@Override
//        public void enterVariableExprG(B314Parser.VariableExprGContext ctx) {
//
//        }
//
//	@Override
//        public void enterTableauExprG(B314Parser.TableauExprGContext ctx) {
//           Symbole symbole = scopeEnfant.resolve(ctx.ID().getText());
//           if(symbole.isArray){
//               if(symbole.length.length == 1){
//                   if(ctx.exprD(0) == null) throw new RuntimeException("ex");
//                   if(getTypeContext(ctx.exprD(0))!= Type.INTEGER.name())throw new RuntimeException("ex");
//                   if (ctx.exprD(1)!= null) throw new RuntimeException("ex");
//               }
//
//           else {
//               if((ctx.exprD(0) == null)|| (ctx.exprD(1) == null))throw new RuntimeException("ex");
//               if((getTypeContext(ctx.exprD(0))!= Type.INTEGER.name())||(getTypeContext(ctx.exprD(1))!= Type.INTEGER.name()))throw new RuntimeException("ex");
//               }
//           }
//           else if (ctx.exprD(0)!= null) throw new RuntimeException("ex");
//        }
//        @Override
//        public void enterArray(B314Parser.ArrayContext ctx) {
//            int i = Integer.parseInt(ctx.NUMBER(0).getText());
//            int j = 0;
//            boolean AllGiven = false;
//            if(ctx.NUMBER(1) != null){
//                j = Integer.parseInt(ctx.NUMBER(1).getText());
//                AllGiven = true;
//            }
//            int [] length = {};
//            if(AllGiven) length = new int []{i,j};
//            else length = new int[]{i};
//
//            if(isFonction) SymboleScopeActual.setArray(length);
//            SymboleActual.setArray(length);
//
//        }
//        @Override
//        public void enterAffectation(B314Parser.AffectationContext ctx) {
//            String name = ctx.exprG().getChild(0).getText();
//            if(scopeEnfant.resolve(name) != null){
//                Symbole s = scopeEnfant.resolve(name);
//                String type = s.getType();
//                String new_type = getTypeContext((ParserRuleContext) ctx.exprD().getChild(0));
//                if(type != new_type) throw new RuntimeException("Error");
//            }
//        }
//
//
//}
