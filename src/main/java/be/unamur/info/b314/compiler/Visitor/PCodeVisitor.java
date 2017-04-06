/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.Visitor;

import be.unamur.info.b314.compiler.B314BaseVisitor;
import be.unamur.info.b314.compiler.B314Parser;
import be.unamur.info.b314.compiler.scope.Scope;
import org.antlr.v4.runtime.ParserRuleContext;




/**
 * 
 * @author jessi
 */
public class PCodeVisitor extends B314BaseVisitor<Object>{
    
       private final Scope scope;
       private final PCodePrinter printer;

    public PCodeVisitor(Scope scope, PCodePrinter printer) {
        this.scope = scope;
        this.printer = printer;
    }
       
       
    
       @Override public Object visitTypeScalar(B314Parser.TypeScalarContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitTypeArray(B314Parser.TypeArrayContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitScalarBoolean(B314Parser.ScalarBooleanContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitScalarInteger(B314Parser.ScalarIntegerContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitScalarSquare(B314Parser.ScalarSquareContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitArray(B314Parser.ArrayContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitVarDecl(B314Parser.VarDeclContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprDInteger(B314Parser.ExprDIntegerContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprDBoolean(B314Parser.ExprDBooleanContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprDCase(B314Parser.ExprDCaseContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprDG(B314Parser.ExprDGContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprEntParennthese(B314Parser.ExprEntParenntheseContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprEntEntier(B314Parser.ExprEntEntierContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprEntEnvironnement(B314Parser.ExprEntEnvironnementContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprEntPlusMoinsGauheEnt(B314Parser.ExprEntPlusMoinsGauheEntContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
        public Object visitExprEntPlusMoinsEntEnt(B314Parser.ExprEntPlusMoinsEntEntContext ctx)  { 
            ExpressionEntiere(ctx);
            return null; 
        }
	@Override 
        public Object visitExprEntMulDivEntGauhe(B314Parser.ExprEntMulDivEntGauheContext ctx)  { 
            ExpressionEntiere(ctx);
            return null; 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
        public Object visitExprEntMulDivEntEnt(B314Parser.ExprEntMulDivEntEntContext ctx)  { 
            ExpressionEntiere(ctx);
            return null; 
        }
	@Override 
        public Object visitExprEntMulDivGaucheGauhe(B314Parser.ExprEntMulDivGaucheGauheContext ctx)  { 
            ExpressionEntiere(ctx);
            return null; 
        }
	@Override 
        public Object visitExprEntMulDivGauheEnt(B314Parser.ExprEntMulDivGauheEntContext ctx) { 
            ExpressionEntiere(ctx);
            return null; 
        }
	@Override 
        public Object visitExprEntPlusMoinsEntGauhe(B314Parser.ExprEntPlusMoinsEntGauheContext ctx) { 
            ExpressionEntiere(ctx);
            return null; 
        }

	@Override 
        public Object visitExprEntPlusMoinsGaucheGauhe(B314Parser.ExprEntPlusMoinsGaucheGauheContext ctx)  { 
            ExpressionEntiere(ctx);
            return null; 
        }
	@Override public Object visitExprBoolFalse(B314Parser.ExprBoolFalseContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
        public Object visitExprBoolNotGauche(B314Parser.ExprBoolNotGaucheContext ctx) { 
            BoolNot(ctx);
            return null;
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
        public Object visitExprBoolAndOrBoolBool(B314Parser.ExprBoolAndOrBoolBoolContext ctx) { 
            BoolAndOr(ctx);
            return null; 
        }
	@Override 
        public Object visitExprBoolEgaleBoolean(B314Parser.ExprBoolEgaleBooleanContext ctx){ 
            ctx.getChild(0).accept(this);
            ctx.getChild(2).accept(this);
            if(ctx.EGALE()!=null)printer.printEqualsValues(PCodePrinter.PCodeTypes.Bool);
            return null; 
        }
	@Override public Object visitExprBoolParennthese(B314Parser.ExprBoolParenntheseContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
        public Object visitExprBoolInfSupEnt(B314Parser.ExprBoolInfSupEntContext ctx)  { 
            ExpressionEntiere(ctx);
            return null; 
        }
	@Override public Object visitExprBoolTrue(B314Parser.ExprBoolTrueContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
        public Object visitExprBoolNot(B314Parser.ExprBoolNotContext ctx) { 
            BoolNot(ctx);
            return null;
        }
	@Override 
        public Object visitExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx) { 
            BoolAndOr(ctx);
            return null; 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
        public Object visitExprBoolEgaleBoolGauche(B314Parser.ExprBoolEgaleBoolGaucheContext ctx) { 
            ctx.getChild(0).accept(this);
            ctx.getChild(2).accept(this);
            if(ctx.EGALE()!=null)printer.printEqualsValues(PCodePrinter.PCodeTypes.Bool);
            return null; 
        }

	@Override public Object visitExprBoolEnvironnement(B314Parser.ExprBoolEnvironnementContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
        public Object visitExprBoolAndOrGaucheBool(B314Parser.ExprBoolAndOrGaucheBoolContext ctx){ 
            BoolAndOr(ctx);
            return null; 
        }
	@Override 
        public Object visitExprBoolEgaleGaucheBool(B314Parser.ExprBoolEgaleGaucheBoolContext ctx){ 
            ctx.getChild(0).accept(this);
            ctx.getChild(2).accept(this);
            if(ctx.EGALE()!=null)printer.printEqualsValues(PCodePrinter.PCodeTypes.Bool);
            return null; 
        }
	@Override 
        public Object visitExprBoolAndOrGaucheGauche(B314Parser.ExprBoolAndOrGaucheGaucheContext ctx) { 
            BoolAndOr(ctx);
            return null; 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprCaseEnvironnement(B314Parser.ExprCaseEnvironnementContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprCaseParennthese(B314Parser.ExprCaseParenntheseContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitEnvironnementInt(B314Parser.EnvironnementIntContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitEnvironnementBool(B314Parser.EnvironnementBoolContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitEnvironnementCase(B314Parser.EnvironnementCaseContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprGVariable(B314Parser.ExprGVariableContext ctx) { return  null; }

	@Override public Object visitEntier(B314Parser.EntierContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitSkipppp(B314Parser.SkippppContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitIf(B314Parser.IfContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitIfthenelse(B314Parser.IfthenelseContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitWhile(B314Parser.WhileContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitCompute(B314Parser.ComputeContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitNextAction(B314Parser.NextActionContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitAction(B314Parser.ActionContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
        public Object visitProgramme(B314Parser.ProgrammeContext ctx) { 
            printer.printSetStackPointer(scope.getSymboles().size());
            printer.printComments("Début du programme");
            super.visitProgramme(ctx);
            printer.printComments("Fin du programme");
            printer.printStop();
            return null;
        }

	@Override public Object visitProgDecl(B314Parser.ProgDeclContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitFctDecl(B314Parser.FctDeclContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitFctTypeScalar(B314Parser.FctTypeScalarContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitFctTypeVoid(B314Parser.FctTypeVoidContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitParamDecl(B314Parser.ParamDeclContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitClauseWhen(B314Parser.ClauseWhenContext ctx) { return  null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitClauseDefault(B314Parser.ClauseDefaultContext ctx) { return  null; }  
        
        private void ExpressionEntiere(ParserRuleContext ctx){
            ctx.getChild(0).accept(this);
            ctx.getChild(2).accept(this);
            if(ctx.getChild(1).getText().equals("plus")) printer.printSub(PCodePrinter.PCodeTypes.Int);
            else if (ctx.getChild(1).getText().equals("moins")) printer.printAdd(PCodePrinter.PCodeTypes.Int);
            else if (ctx.getChild(1).getText().equals("mul"))printer.printMul(PCodePrinter.PCodeTypes.Int);
            else if (ctx.getChild(1).getText().equals("div"))printer.printDiv(PCodePrinter.PCodeTypes.Int);
            else if(ctx.getChild(1).getText().equals("div_ent"))printer.printMod(PCodePrinter.PCodeTypes.Int);
            else if(ctx.getChild(1).getText().equals("sup"))printer.printGreather(PCodePrinter.PCodeTypes.Int);
            else if(ctx.getChild(1).getText().equals("inf"))printer.printLess(PCodePrinter.PCodeTypes.Int);
        }
        private void BoolAndOr(ParserRuleContext ctx){
            ctx.getChild(0).accept(this);
            ctx.getChild(2).accept(this);
            if(ctx.getChild(1).getText().equals("and")) printer.printAnd();
            else if (ctx.getChild(1).getText().equals("or")) printer.printOr();           
        }
        private void BoolNot(ParserRuleContext ctx){
            ctx.getChild(0).accept(this);
            if(ctx.getChild(1).getText().equals("not")) printer.printNot();         
        }        
}
      
    
    
    
