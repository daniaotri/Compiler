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

import be.unamur.info.b314.compiler.scope.Symbole;
import org.antlr.v4.runtime.tree.ParseTree;
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
    private  int ifIndice;
    private int FctLevel;
    private int whileNumber;
    

    public PCodeVisitor(Scope scope, PCodePrinter printer) {
        this.Globalscope = scope;
        this.printer = printer;
        this.Currentscope = scope;
	   	this.position=1;
        this.LevelScope = 0;
        this.ifIndice=1;
        this.FctLevel=0;
        this.whileNumber=0;


    }


       
          
	@Override public Object visitExprBoolTrue(B314Parser.ExprBoolTrueContext ctx) {
		printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Bool,1);
		       //printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Bool,0);
		return null;

	}

	@Override public Object visitExprBoolNot(B314Parser.ExprBoolNotContext ctx) {
		printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Bool,0);
		return null;
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


	@Override
        public Object visitProgramme(B314Parser.ProgrammeContext ctx) {
	        LOG.error("Je passe ici ------------------------------------------------------");
            printer.printSetStackPointer(Globalscope.getChildren().size()+99);
            this.readInputValues();
            printer.printUnconditionalJump("Begin");
            printer.printDefineLabel("Begin");
            //printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
            printer.printPrin();
            //printer.printUnconditionalJump("byDefault");
            //super.visitProgramme(ctx);
            printer.printStop();
            return null;
	}

	@Override public Object visitProgDecl(B314Parser.ProgDeclContext ctx) {



	    return null;
	}

	@Override public Object visitFctDecl(B314Parser.FctDeclContext ctx) {
		String name = ctx.ID().getText();
		try{
			Scope scope = Currentscope.WhoIsThisScope(name);
			LevelScope ++;
			Currentscope = scope;
			printer.printDefine(name);
			printer.printSetStackPointer(Currentscope.getChildren().size()+5);
			List<InstructionContext> Instructions = ctx.instruction();
			for(int i = 0; i < Instructions.size();i++)
				Instructions.get(i).accept(this);
			printer.printReturnFromFunction();

		}catch(Exception ex){
			ex.printStackTrace();
			throw new RuntimeException();
		}

		return null;
	}

	@Override public Object visitFctTypeScalar(B314Parser.FctTypeScalarContext ctx) {

	    return null;
	}

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
	@Override public Object visitTypeScalar(B314Parser.TypeScalarContext ctx) { return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitTypeArray(B314Parser.TypeArrayContext ctx) { return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitScalarBoolean(B314Parser.ScalarBooleanContext ctx) {

		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitScalarInteger(B314Parser.ScalarIntegerContext ctx) {

		//printer.printPutValueToStackPoint(PCodeType.integer, SquareType.rock.getValue());
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitScalarSquare(B314Parser.ScalarSquareContext ctx) { return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitArray(B314Parser.ArrayContext ctx) { return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitVarDecl(B314Parser.VarDeclContext ctx) { return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprDInteger(B314Parser.ExprDIntegerContext ctx) { return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitExprDBoolean(B314Parser.ExprDBooleanContext ctx) {

		return null;
	}

	@Override public Object visitExprDCase(B314Parser.ExprDCaseContext ctx) {
		// printer.printPutValueToStackPoint(PCodeType.integer, SquareType.rock.getValue());
		//printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, );
		return null; }

	@Override public Object visitExprDG(B314Parser.ExprDGContext ctx) { return null; }

	@Override public Object visitExprDFonction(B314Parser.ExprDFonctionContext ctx) { return null; }

	@Override public Object visitExprFonctionParennthese(B314Parser.ExprFonctionParenntheseContext ctx) { return null; }

	@Override public Object visitExprEntParennthese(B314Parser.ExprEntParenntheseContext ctx) { return null; }

	@Override public Object visitExprEntEntier(B314Parser.ExprEntEntierContext ctx) {
		/*@Override public Object visitExprGArrayEntEnt(B314Parser.ExprGArrayEntEntContext ctx) {
        VariableSymbol var = getVariableSymbol(ctx.ID().getText());
        resolveArraySymbol(var, ctx);

        //Print the value founded
        printer.printInd(PCodeType.valueOf(var.getType().toString()));*/
		//Symbole var =

		return null;
	}

	@Override public Object visitExprEntEnvironnement(B314Parser.ExprEntEnvironnementContext ctx) {

		int valeur= Integer.parseInt(ctx.getText());
		printer.printLoadAdress(PCodePrinter.PCodeTypes.Int,this.LevelScope, valeur);
	    return null;
	}

	@Override public Object visitExprEntPlusMoinsGauheEnt(B314Parser.ExprEntPlusMoinsGauheEntContext ctx) { return null; }

	@Override public Object visitExprEntPlusMoinsEntEnt(B314Parser.ExprEntPlusMoinsEntEntContext ctx) {

		ctx.exprEnt(0).accept(this);
		ctx.exprEnt(1).accept(this);
		if(ctx.PLUS()!= null){
			printer.printAdd(PCodePrinter.PCodeTypes.Int);
		}else {
			printer.printSub(PCodePrinter.PCodeTypes.Int);
		}
		return null;
	}

	@Override public Object visitExprEntMulDivEntGauhe(B314Parser.ExprEntMulDivEntGauheContext ctx) { return null; }

	@Override public Object visitExprEntMulDivEntEnt(B314Parser.ExprEntMulDivEntEntContext ctx) {
		ctx.exprEnt(0).accept(this);
		ctx.exprEnt(1).accept(this);
		if(ctx.MUL()!=null){
			printer.printMul(PCodePrinter.PCodeTypes.Int);
		}else {
			printer.printDiv(PCodePrinter.PCodeTypes.Int);
					}
		return null;
	}

	@Override public Object visitExprEntMulDivGaucheGauhe(B314Parser.ExprEntMulDivGaucheGauheContext ctx) {
		ctx.exprG(0).accept(this);
		ctx.exprG(1).accept(this);
		if(ctx.MUL()!=null){
			printer.printMul(PCodePrinter.PCodeTypes.Int);
		}else {
			printer.printDiv(PCodePrinter.PCodeTypes.Int);
		}

		return null;
	}

	@Override public Object visitExprEntMulDivGauheEnt(B314Parser.ExprEntMulDivGauheEntContext ctx) {

		return null;
	}

	@Override public Object visitExprEntPlusMoinsEntGauhe(B314Parser.ExprEntPlusMoinsEntGauheContext ctx) { return null; }

	@Override public Object visitExprEntPlusMoinsGaucheGauhe(B314Parser.ExprEntPlusMoinsGaucheGauheContext ctx) {
		ctx.exprG(0).accept(this);
		ctx.exprG(1).accept(this);
		if(ctx.PLUS()!= null){
			printer.printAdd(PCodePrinter.PCodeTypes.Int);
		}else {
			printer.printSub(PCodePrinter.PCodeTypes.Int);
		}
		return null;
	}

	@Override public Object visitExprBoolEgaleGEnt(B314Parser.ExprBoolEgaleGEntContext ctx) { return null; }

	@Override public Object visitExprBoolFalse(B314Parser.ExprBoolFalseContext ctx) { return null; }

	@Override public Object visitExprBoolEgaleGCase(B314Parser.ExprBoolEgaleGCaseContext ctx) { return null; }

	@Override public Object visitExprBoolEgaleCaseCase(B314Parser.ExprBoolEgaleCaseCaseContext ctx) { return null; }

	@Override public Object visitExprBoolNotGauche(B314Parser.ExprBoolNotGaucheContext ctx) { return null; }

	@Override public Object visitExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx) { return null; }

	@Override public Object visitExprBoolEgaleEntG(B314Parser.ExprBoolEgaleEntGContext ctx) { return null; }

	@Override public Object visitExprBoolEgaleEntEnt(B314Parser.ExprBoolEgaleEntEntContext ctx) { return null; }

	@Override public Object visitExprBoolAndOrBoolBool(B314Parser.ExprBoolAndOrBoolBoolContext ctx) { return null; }

	@Override public Object visitExprBoolEgaleBoolGauche(B314Parser.ExprBoolEgaleBoolGaucheContext ctx) { return null; }

	@Override public Object visitExprBoolEgaleCaseG(B314Parser.ExprBoolEgaleCaseGContext ctx) { return null; }

	@Override public Object visitExprBoolEnvironnement(B314Parser.ExprBoolEnvironnementContext ctx) { return null; }

	@Override public Object visitExprBoolEgaleBoolean(B314Parser.ExprBoolEgaleBooleanContext ctx) { return null; }

	@Override public Object visitExprBoolParennthese(B314Parser.ExprBoolParenntheseContext ctx) { return null; }

	@Override public Object visitExprBoolEgaleGG(B314Parser.ExprBoolEgaleGGContext ctx) { return null; }

	@Override public Object visitExprBoolAndOrGaucheBool(B314Parser.ExprBoolAndOrGaucheBoolContext ctx) { return null; }

	@Override public Object visitExprBoolEgaleGaucheBool(B314Parser.ExprBoolEgaleGaucheBoolContext ctx) { return null; }

	@Override public Object visitExprBoolAndOrGaucheGauche(B314Parser.ExprBoolAndOrGaucheGaucheContext ctx) { return null; }

	@Override public Object visitExprBoolInfSupEnt(B314Parser.ExprBoolInfSupEntContext ctx) { return null; }

	@Override public Object visitExprCaseEnvironnement(B314Parser.ExprCaseEnvironnementContext ctx) { return null; }

	@Override public Object visitExprCaseNearby(B314Parser.ExprCaseNearbyContext ctx) { return null; }

	@Override public Object visitExprCaseParennthese(B314Parser.ExprCaseParenntheseContext ctx) { return null; }

	@Override public Object visitEnvironnementInt(B314Parser.EnvironnementIntContext ctx) { return null; }

	@Override public Object visitEnvironnementBool(B314Parser.EnvironnementBoolContext ctx) { return null; }

	@Override public Object visitEnvironnementCase(B314Parser.EnvironnementCaseContext ctx) { return null; }

	@Override public Object visitExprGVariable(B314Parser.ExprGVariableContext ctx) { return null; }

	@Override public Object visitExprGTableauEntFonct(B314Parser.ExprGTableauEntFonctContext ctx) { return null; }

	@Override public Object visitExprGTableauFonctEnt(B314Parser.ExprGTableauFonctEntContext ctx) { return null; }

	@Override public Object visitExprGTableauFonctFonct(B314Parser.ExprGTableauFonctFonctContext ctx) { return null; }

	@Override public Object visitExprGTableauEntEnt(B314Parser.ExprGTableauEntEntContext ctx) { return null; }

	@Override public Object visitEntier(B314Parser.EntierContext ctx) { return null; }

	@Override public Object visitAppelDeFonction(B314Parser.AppelDeFonctionContext ctx) {

		printer.printMarkStack(FctLevel);
		FctLevel++;
		Iterator<B314Parser.ExprDContext> iter= ctx.exprD().iterator();
		int comptArg= 0;
		while (iter.hasNext()){
			comptArg++;
			iter.next().accept(this);
		}
		printer.printCallUserProcedure(comptArg, ctx.ID().getText());
		FctLevel--;
		return null; }

	@Override public Object visitSkipppp(B314Parser.SkippppContext ctx) { return null; }

	@Override public Object visitIf(B314Parser.IfContext ctx) {
		String Nomif = "if"+ifIndice;
		ifIndice++;
			ctx.getChild(1).accept(this);
		printer.printFalseJump(Nomif);
		List<InstructionContext> Instructions = ctx.instruction();
		for(int i = 0; i < Instructions.size();i++)
			Instructions.get(i).accept(this);
		printer.printDefine(Nomif);
		return null;
	}

	@Override public Object visitIfthenelse(B314Parser.IfthenelseContext ctx) {
		String Nomif = "if"+ifIndice;
		String Nomelse = "else"+ifIndice;
		ifIndice++;
		List<ParseTree> lsp = ctx.children;
		Iterator<ParseTree> iterlsp = lsp.iterator();

		ctx.getChild(1).accept(this);
		printer.printFalseJump(Nomelse);
		while (iterlsp.hasNext()){
			ParseTree t =iterlsp.next();
			if (t.getText().equals("else"));
			break;
			//t.accept(this);



		}

		printer.printFalseJump(Nomif);
		printer.printDefine(Nomelse);
		while (iterlsp.hasNext()){
			ParseTree t= iterlsp.next();
			if (t.getText().equals("done"))
				break;
			t.accept(this);
		}
		printer.printDefine(Nomif);


        return null;
	}

	@Override public Object visitWhile(B314Parser.WhileContext ctx) {
		String whileFin = "whileFin"+whileNumber;
		String whileDebut= "whileDebut"+whileNumber;
		whileNumber++;
		printer.printDefine(whileDebut);
		ctx.getChild(1).accept(this);

		printer.printFalseJump(whileFin);
		List<B314Parser.InstructionContext> instr = ctx.instruction();
		Iterator<B314Parser.InstructionContext> iter = instr.iterator();
		 while (iter.hasNext()){
		 	iter.next().accept(this);
		 }
		 printer.printUnconditionalJump(whileDebut);
		 printer.printDefine(whileFin);
		return null; }

	@Override public Object visitAffectationGaucheDroite(B314Parser.AffectationGaucheDroiteContext ctx) {
		ctx.exprG().accept(this);
		ctx.getChild(3).accept(this);
		printer.printSetTo(PCodePrinter.PCodeTypes.Int);
		return null;
	}

	@Override public Object visitAffectationGaucheDroiteBool(B314Parser.AffectationGaucheDroiteBoolContext ctx) {
		ctx.exprG().accept(this);
		ctx.getChild(3).accept(this);
		printer.printSetTo(PCodePrinter.PCodeTypes.Bool);
		return null; }

	@Override public Object visitAffectationGaucheDroiteCase(B314Parser.AffectationGaucheDroiteCaseContext ctx) {

		ctx.exprG().accept(this);
		ctx.getChild(3).accept(this);
		printer.printSetTo(PCodePrinter.PCodeTypes.Int);
		return null;
	}

	@Override public Object visitAffectationGaucheDroiteGauche(B314Parser.AffectationGaucheDroiteGaucheContext ctx) {

		Symbole curSym = Currentscope.FoundSymbole(ctx.exprG(0).getChild(0).getText());

		ctx.exprG(0).accept(this);
		ctx.exprG(1).accept(this);
		String curType = curSym.getType();

		if(curType.equals("integer"))
			printer.printSetTo(PCodePrinter.PCodeTypes.Int);
		else if (curType.equals("boolean"))
			printer.printSetTo(PCodePrinter.PCodeTypes.Bool);
		else;

		return null;
	}


	@Override public Object visitAffectationGaucheDroiteFonction(B314Parser.AffectationGaucheDroiteFonctionContext ctx) {

		return null;
	}

}
      
    
    
    
