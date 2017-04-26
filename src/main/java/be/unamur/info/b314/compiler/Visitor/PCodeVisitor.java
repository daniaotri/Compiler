/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.Visitor;
import java.util.*;

import be.unamur.info.b314.compiler.B314BaseVisitor;
import be.unamur.info.b314.compiler.B314Parser;
import be.unamur.info.b314.compiler.B314Parser.InstructionContext;
import be.unamur.info.b314.compiler.scope.Scope;
import be.unamur.info.b314.compiler.main.Main;

import java.util.List;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;



/**
 * 
 * @author jessi
 */
public class PCodeVisitor extends B314BaseVisitor<Object>{
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    private Scope Globalscope;
    private Scope Currentscope;
    private final PCodePrinter printer;
    private int position;
    private int LevelScope;
    

    public PCodeVisitor(Scope scope, PCodePrinter printer) {
        this.Globalscope = scope;
        this.printer = printer;
        this.Currentscope = scope;
	this.position=1;
        this.LevelScope = 0;
    }


       
          
	@Override public Object visitExprBoolTrue(B314Parser.ExprBoolTrueContext ctx) {
		printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Bool,1);
		       //printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Bool,0);
		return visitChildren(ctx);

	}

	@Override public Object visitExprBoolNot(B314Parser.ExprBoolNotContext ctx) {
		printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Bool,0);
		return visitChildren(ctx);
	}

	@Override public Object visitCompute(B314Parser.ComputeContext ctx) { return null; }

	@Override public Object visitNextAction(B314Parser.NextActionContext ctx) {
            String nomAction = ctx.action().getText().toLowerCase().replace("\\s+","");
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, NextActions.valueOf(nomAction).getValue());
            printer.printSetTo(PCodePrinter.PCodeTypes.Int);
            return null;
	}
        
	@Override public Object visitAction(B314Parser.ActionContext ctx) { return null; }


	private void readInputValues(){
        for(int i= 0; i<99;i++){

            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, i);
            printer.printRead();
            printer.printStore(PCodePrinter.PCodeTypes.Int);

        }
    }

	//Nath
	@Override
        public Object visitProgramme(B314Parser.ProgrammeContext ctx) {
	        LOG.error("Je passe ici ------------------------------------------------------");
            printer.printSetStackPointer(Globalscope.getChildren().size()+99);
            this.readInputValues();
            printer.printUnconditionalJump("Begin");
            printer.printDefineLabel("Begin");
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
            printer.printPrin();
            //printer.printUnconditionalJump("byDefault");
            //super.visitProgramme(ctx);
            printer.printStop();
            return null;
	}

	@Override public Object visitProgDecl(B314Parser.ProgDeclContext ctx) {return null; }

	@Override public Object visitFctDecl(B314Parser.FctDeclContext ctx) { return null; }

	@Override public Object visitFctTypeScalar(B314Parser.FctTypeScalarContext ctx) { return null; }

	@Override public Object visitFctTypeVoid(B314Parser.FctTypeVoidContext ctx) { return null; }

	@Override public Object visitParamDecl(B314Parser.ParamDeclContext ctx) { return null; }

	@Override 
        public Object visitClauseWhen(B314Parser.ClauseWhenContext ctx) {

            String name = "clauseWhen"+position;

            position++;
            try{
                LOG.debug(name);
                Scope scope = Currentscope.WhoIsThisScope(name);
                LevelScope ++;
                Currentscope = scope;
                printer.printDefine(name);
                printer.printSetStackPointer(Currentscope.getChildren().size()+5);
                printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, 0);
                printer.printSetTo(PCodePrinter.PCodeTypes.Int);
                List<InstructionContext> Instructions = ctx.instruction();
                for(int i = 0; i < Instructions.size();i++)
                    Instructions.get(i).accept(this);
                printer.printReturnFromFunction();
                LevelScope--;
                Currentscope = Currentscope.getParent();
            }catch(Exception ex){
                throw new RuntimeException();
            }
            return null;
	}



    @Override
        public Object visitClauseDefault(B314Parser.ClauseDefaultContext ctx) {
            String name = "clauseDefault";
            try{
                Scope scope = Currentscope.WhoIsThisScope(name);
                LevelScope ++;
                Currentscope = scope;
                printer.printDefine(name);
                printer.printSetStackPointer(Currentscope.getChildren().size());
                printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, 0);
                printer.printSetTo(PCodePrinter.PCodeTypes.Int);
                List<InstructionContext> Instructions = ctx.instruction();
                for(int i = 0; i < Instructions.size();i++)
                    Instructions.get(i).accept(this);
                printer.printReturnFromFunction();
                LevelScope--;
                Currentscope = Currentscope.getParent();
            }catch(Exception ex){
                throw new RuntimeException();
            }
            return null;
	}

/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitTypeScalar(B314Parser.TypeScalarContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitTypeArray(B314Parser.TypeArrayContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitScalarBoolean(B314Parser.ScalarBooleanContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitScalarInteger(B314Parser.ScalarIntegerContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitScalarSquare(B314Parser.ScalarSquareContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitArray(B314Parser.ArrayContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitVarDecl(B314Parser.VarDeclContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprDInteger(B314Parser.ExprDIntegerContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprDBoolean(B314Parser.ExprDBooleanContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprDCase(B314Parser.ExprDCaseContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprDG(B314Parser.ExprDGContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprDFonction(B314Parser.ExprDFonctionContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprFonctionParennthese(B314Parser.ExprFonctionParenntheseContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprEntParennthese(B314Parser.ExprEntParenntheseContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprEntEntier(B314Parser.ExprEntEntierContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprEntEnvironnement(B314Parser.ExprEntEnvironnementContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprEntPlusMoinsGauheEnt(B314Parser.ExprEntPlusMoinsGauheEntContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprEntPlusMoinsEntEnt(B314Parser.ExprEntPlusMoinsEntEntContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprEntMulDivEntGauhe(B314Parser.ExprEntMulDivEntGauheContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprEntMulDivEntEnt(B314Parser.ExprEntMulDivEntEntContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprEntMulDivGaucheGauhe(B314Parser.ExprEntMulDivGaucheGauheContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprEntMulDivGauheEnt(B314Parser.ExprEntMulDivGauheEntContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprEntPlusMoinsEntGauhe(B314Parser.ExprEntPlusMoinsEntGauheContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprEntPlusMoinsGaucheGauhe(B314Parser.ExprEntPlusMoinsGaucheGauheContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolEgaleGEnt(B314Parser.ExprBoolEgaleGEntContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolFalse(B314Parser.ExprBoolFalseContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolEgaleGCase(B314Parser.ExprBoolEgaleGCaseContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolEgaleCaseCase(B314Parser.ExprBoolEgaleCaseCaseContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolNotGauche(B314Parser.ExprBoolNotGaucheContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolEgaleEntG(B314Parser.ExprBoolEgaleEntGContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolEgaleEntEnt(B314Parser.ExprBoolEgaleEntEntContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolAndOrBoolBool(B314Parser.ExprBoolAndOrBoolBoolContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolEgaleBoolGauche(B314Parser.ExprBoolEgaleBoolGaucheContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolEgaleCaseG(B314Parser.ExprBoolEgaleCaseGContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolEnvironnement(B314Parser.ExprBoolEnvironnementContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolEgaleBoolean(B314Parser.ExprBoolEgaleBooleanContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolParennthese(B314Parser.ExprBoolParenntheseContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolEgaleGG(B314Parser.ExprBoolEgaleGGContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolAndOrGaucheBool(B314Parser.ExprBoolAndOrGaucheBoolContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolEgaleGaucheBool(B314Parser.ExprBoolEgaleGaucheBoolContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolAndOrGaucheGauche(B314Parser.ExprBoolAndOrGaucheGaucheContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprBoolInfSupEnt(B314Parser.ExprBoolInfSupEntContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprCaseEnvironnement(B314Parser.ExprCaseEnvironnementContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprCaseNearby(B314Parser.ExprCaseNearbyContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprCaseParennthese(B314Parser.ExprCaseParenntheseContext ctx) { return visitChildren(ctx); }

	@Override public Object visitEnvironnementInt(B314Parser.EnvironnementIntContext ctx) { return visitChildren(ctx); }

	@Override public Object visitEnvironnementBool(B314Parser.EnvironnementBoolContext ctx) { return visitChildren(ctx); }

	@Override public Object visitEnvironnementCase(B314Parser.EnvironnementCaseContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprGVariable(B314Parser.ExprGVariableContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprGTableauEntFonct(B314Parser.ExprGTableauEntFonctContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprGTableauFonctEnt(B314Parser.ExprGTableauFonctEntContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprGTableauFonctFonct(B314Parser.ExprGTableauFonctFonctContext ctx) { return visitChildren(ctx); }

	@Override public Object visitExprGTableauEntEnt(B314Parser.ExprGTableauEntEntContext ctx) { return visitChildren(ctx); }

	@Override public Object visitEntier(B314Parser.EntierContext ctx) { return visitChildren(ctx); }

	@Override public Object visitAppelDeFonction(B314Parser.AppelDeFonctionContext ctx) { return visitChildren(ctx); }

	@Override public Object visitSkipppp(B314Parser.SkippppContext ctx) { return visitChildren(ctx); }

	@Override public Object visitIf(B314Parser.IfContext ctx) { return visitChildren(ctx); }

	@Override public Object visitIfthenelse(B314Parser.IfthenelseContext ctx) { return visitChildren(ctx); }

	@Override public Object visitWhile(B314Parser.WhileContext ctx) { return visitChildren(ctx); }

	@Override public Object visitAffectationGaucheDroite(B314Parser.AffectationGaucheDroiteContext ctx) { return visitChildren(ctx); }

	@Override public Object visitAffectationGaucheDroiteBool(B314Parser.AffectationGaucheDroiteBoolContext ctx) { return visitChildren(ctx); }

	@Override public Object visitAffectationGaucheDroiteCase(B314Parser.AffectationGaucheDroiteCaseContext ctx) { return visitChildren(ctx); }

	@Override public Object visitAffectationGaucheDroiteGauche(B314Parser.AffectationGaucheDroiteGaucheContext ctx) { return visitChildren(ctx); }

	@Override public Object visitAffectationGaucheDroiteFonction(B314Parser.AffectationGaucheDroiteFonctionContext ctx) { return visitChildren(ctx); }

}
      
    
    
    
