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
import org.antlr.v4.runtime.ParserRuleContext;
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
    private Symbole symbole;
    private final PCodePrinter printer;
    private int position;
    private int LevelScope;
    private  int ifIndice;
    private int FctLevel;
    private int whileNumber;
    
    /*
    * Constructeur
    */
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
    /*
    *Debut Du programme
    */
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
            printer.printDefine("exit");
            printer.printPrin();
            printer.printStop();
            return null;
	}

	@Override 
        public Object visitProgDecl(B314Parser.ProgDeclContext ctx) {
	    List<B314Parser.VarDeclContext> Global = ctx.varDecl();
            for(int i = 0;i<Global.size();i++)Global.get(i).accept(this);
            
            printer.printComments("Liste des fonctions");
            List<B314Parser.FctDeclContext> Function = ctx.fctDecl();
            for(int i = 0; i<Function.size();i++) Function.get(i).accept(this);
            return null;
	}  
    /*Definition des fonctions*/   
	@Override 
        public Object visitFctDecl(B314Parser.FctDeclContext ctx) {
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
                        LevelScope--;
                        Currentscope = Currentscope.getParent();                        
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

	@Override 
        public Object visitParamDecl(B314Parser.ParamDeclContext ctx) { 
	    List<B314Parser.VarDeclContext> Global = ctx.varDecl();
            for(int i = 0;i<Global.size();i++)Global.get(i).accept(this);            
            return null; 
        }
        
        /*Clause When*/
        
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
        /* Clause Default*/

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
        
        /*Les instructions*/

	@Override public Object visitSkipppp(B314Parser.SkippppContext ctx) { return null; }

	@Override 
        public Object visitIf(B314Parser.IfContext ctx) {
		String name = "if"+ifIndice;
		ifIndice++;
                ctx.getChild(1).accept(this);
		printer.printFalseJump(name);
		List<InstructionContext> Instructions = ctx.instruction();
		for(int i = 0; i < Instructions.size();i++)
			Instructions.get(i).accept(this);
		printer.printDefine(name);
		return null;
	}

	@Override 
        public Object visitIfthenelse(B314Parser.IfthenelseContext ctx) {
		String nameIf = "if"+ifIndice;
		String nameElse = "else"+ifIndice;
		ifIndice++;                
		List<ParseTree> liste = ctx.children;
                ctx.getChild(1).accept(this);
                printer.printFalseJump(nameElse);
                for(int i = 0; i<liste.size(); i++){
                    if(liste.get(i).equals("else"))break;
                    liste.get(i).accept(this);
                }
                printer.printFalseJump(nameIf);
                printer.printDefine(nameElse);
                for(int i = 0; i<liste.size(); i++){
                    if(liste.get(i).equals("done"))break;
                    liste.get(i).accept(this);
                }
                printer.printDefine(nameIf);
        return null;
	}

	@Override 
        public Object visitWhile(B314Parser.WhileContext ctx) {
		String StartWhile = "StartWhile"+whileNumber;
		String EndWhile = "EndWhile"+whileNumber;
		whileNumber++;
		printer.printDefine(StartWhile);
		ctx.getChild(1).accept(this);
		printer.printFalseJump(EndWhile);
		List<B314Parser.InstructionContext> instructions = ctx.instruction();
                for(int i =0;i<instructions.size();i++) instructions.get(i).accept(this);
		printer.printUnconditionalJump(StartWhile);
		printer.printDefine(EndWhile);
		return null; }

	@Override 
        public Object visitAffectationGaucheDroite(B314Parser.AffectationGaucheDroiteContext ctx) {
		ctx.exprG().accept(this);
		ctx.getChild(3).accept(this);
		printer.printSetTo(PCodePrinter.PCodeTypes.Int);
		return null;
	}

	@Override 
        public Object visitAffectationGaucheDroiteBool(B314Parser.AffectationGaucheDroiteBoolContext ctx) {
		ctx.exprG().accept(this);
		ctx.getChild(3).accept(this);
		printer.printSetTo(PCodePrinter.PCodeTypes.Bool);
		return null; }

	@Override 
        public Object visitAffectationGaucheDroiteCase(B314Parser.AffectationGaucheDroiteCaseContext ctx) {

		ctx.exprG().accept(this);
		ctx.getChild(3).accept(this);
		printer.printSetTo(PCodePrinter.PCodeTypes.Int);
		return null;
	}

	@Override
        public Object visitAffectationGaucheDroiteGauche(B314Parser.AffectationGaucheDroiteGaucheContext ctx) {
		Symbole symbole = Currentscope.FoundSymbole(ctx.exprG(0).getChild(0).getText());
		ctx.exprG(0).accept(this);
		ctx.exprG(1).accept(this);
		String type = symbole.getType();
		if(type.equals("integer"))printer.printSetTo(PCodePrinter.PCodeTypes.Int);
		else if (type.equals("boolean"))printer.printSetTo(PCodePrinter.PCodeTypes.Bool);
                else if(type.equals("square"))printer.printSetTo(PCodePrinter.PCodeTypes.Int);
		return null;
	}

	@Override
        public Object visitAffectationGaucheDroiteFonction(B314Parser.AffectationGaucheDroiteFonctionContext ctx) {
            Symbole symboleGauche = Currentscope.FoundSymbole(ctx.appelDeFonction().getChild(0).getText()); 
            ctx.exprG().accept(this);
            ctx.appelDeFonction().accept(this);
            String type = symboleGauche.getType();
            if(type.equals("integer"))printer.printSetTo(PCodePrinter.PCodeTypes.Int);
            else if (type.equals("boolean"))printer.printSetTo(PCodePrinter.PCodeTypes.Bool);
            else if(type.equals("square"))printer.printSetTo(PCodePrinter.PCodeTypes.Int);
            return null;
	}
        
        @Override 
        public Object visitCompute(B314Parser.ComputeContext ctx) { 
            ctx.getChild(1).accept(this);
            return null; 
        }
        
	@Override public Object visitNextAction(B314Parser.NextActionContext ctx) {
            String name = ctx.action().getText().toLowerCase().replace(" ","");
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, NextActions.valueOf(name).getValue());
            printer.printSetTo(PCodePrinter.PCodeTypes.Int);
            printer.printReturnFromFunction();
            return null;
	}

        
        /*Les expressions Bool*/
	@Override 
        public Object visitExprBoolTrue(B314Parser.ExprBoolTrueContext ctx) {
            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Bool,1);
            return null;
	}        
	@Override 
        public Object visitExprBoolNot(B314Parser.ExprBoolNotContext ctx) {
            ctx.exprBool().accept(this);
            printer.printNot();
            return null;
	}

	@Override 
        public Object visitExprBoolEgaleGEnt(B314Parser.ExprBoolEgaleGEntContext ctx) { 
            OperationEgale(ctx,PCodePrinter.PCodeTypes.Int);
            return null; 
        }

	@Override 
        public Object visitExprBoolFalse(B314Parser.ExprBoolFalseContext ctx) { 
            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Bool,0);
            return null; 
        }

	@Override 
        public Object visitExprBoolEgaleGCase(B314Parser.ExprBoolEgaleGCaseContext ctx) { 
            OperationEgale(ctx,PCodePrinter.PCodeTypes.Int);
            return null; 
        }

	@Override 
        public Object visitExprBoolEgaleCaseCase(B314Parser.ExprBoolEgaleCaseCaseContext ctx) { 
            OperationEgale(ctx,PCodePrinter.PCodeTypes.Int);
            return null; 
        }

	@Override 
        public Object visitExprBoolNotGauche(B314Parser.ExprBoolNotGaucheContext ctx) { 
            ctx.exprG().accept(this);
            printer.printNot();
            return null; 
        }

	@Override 
        public Object visitExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx) { 
            Operation(ctx);
            return null; 
        }

	@Override 
        public Object visitExprBoolEgaleEntG(B314Parser.ExprBoolEgaleEntGContext ctx) { 
            OperationEgale(ctx,PCodePrinter.PCodeTypes.Int);
            return null; 
        }

	@Override 
        public Object visitExprBoolEgaleEntEnt(B314Parser.ExprBoolEgaleEntEntContext ctx) { 
            OperationEgale(ctx,PCodePrinter.PCodeTypes.Int);
            return null; 
        }

	@Override 
        public Object visitExprBoolAndOrBoolBool(B314Parser.ExprBoolAndOrBoolBoolContext ctx) { 
            Operation(ctx);
            return null; 
        }

	@Override 
        public Object visitExprBoolEgaleBoolGauche(B314Parser.ExprBoolEgaleBoolGaucheContext ctx) { 
            OperationEgale(ctx,PCodePrinter.PCodeTypes.Bool);
            return null;
        }

	@Override 
        public Object visitExprBoolEgaleCaseG(B314Parser.ExprBoolEgaleCaseGContext ctx) { 
            OperationEgale(ctx,PCodePrinter.PCodeTypes.Int);
            return null; 
        }

	@Override 
        public Object visitExprBoolEgaleBoolean(B314Parser.ExprBoolEgaleBooleanContext ctx) { 
            OperationEgale(ctx,PCodePrinter.PCodeTypes.Bool);
            return null; 
        }

	@Override 
        public Object visitExprBoolParennthese(B314Parser.ExprBoolParenntheseContext ctx) { 
            ctx.getChild(1).accept(this);
            return null; 
        }

	@Override 
        public Object visitExprBoolEgaleGG(B314Parser.ExprBoolEgaleGGContext ctx) { 
            Symbole symbole = Currentscope.FoundSymbole(ctx.exprG(0).getChild(0).getText());
            OperationEgale(ctx, getType(symbole));
            return null; 
        }

	@Override 
        public Object visitExprBoolAndOrGaucheBool(B314Parser.ExprBoolAndOrGaucheBoolContext ctx) { 
            Operation(ctx);
            return null; 
        }

	@Override 
        public Object visitExprBoolEgaleGaucheBool(B314Parser.ExprBoolEgaleGaucheBoolContext ctx) {
            OperationEgale(ctx,PCodePrinter.PCodeTypes.Bool);
            return null; 
        }

	@Override 
        public Object visitExprBoolAndOrGaucheGauche(B314Parser.ExprBoolAndOrGaucheGaucheContext ctx) { 
            Operation(ctx);
            return null; 
        }
	@Override 
        public Object visitExprBoolInfSupEnt(B314Parser.ExprBoolInfSupEntContext ctx) { 
            Operation(ctx);
            return null; 
        }
        
        /*Les expressions Entieres*/
        
	@Override 
        public Object visitExprEntParennthese(B314Parser.ExprEntParenntheseContext ctx) { 
            ctx.getChild(1).accept(this);
            return null;
        }

	@Override 
        public Object visitExprEntPlusMoinsGauheEnt(B314Parser.ExprEntPlusMoinsGauheEntContext ctx) { 
            Operation(ctx);
            return null;
        }
	@Override 
        public Object visitExprEntPlusMoinsEntEnt(B314Parser.ExprEntPlusMoinsEntEntContext ctx) {
            Operation(ctx);
            return null;
	}
	@Override 
        public Object visitExprEntMulDivEntGauhe(B314Parser.ExprEntMulDivEntGauheContext ctx) { 
            Operation(ctx);
            return null; 
        }
	@Override 
        public Object visitExprEntMulDivEntEnt(B314Parser.ExprEntMulDivEntEntContext ctx) {
            Operation(ctx);
            return null;
	}
	@Override 
        public Object visitExprEntMulDivGaucheGauhe(B314Parser.ExprEntMulDivGaucheGauheContext ctx) {
            Operation(ctx);
            return null;
	}
	@Override 
        public Object visitExprEntMulDivGauheEnt(B314Parser.ExprEntMulDivGauheEntContext ctx) {
            Operation(ctx);
            return null;
	}
	@Override 
        public Object visitExprEntPlusMoinsEntGauhe(B314Parser.ExprEntPlusMoinsEntGauheContext ctx) { 
            Operation(ctx);
            return null; 
        }
	@Override 
        public Object visitExprEntPlusMoinsGaucheGauhe(B314Parser.ExprEntPlusMoinsGaucheGauheContext ctx) {
            Operation(ctx);
            return null;
	}        
        /*Les expressions Case*/

	@Override public Object visitExprCaseNearby(B314Parser.ExprCaseNearbyContext ctx) { return null; }

	@Override 
        public Object visitExprCaseParennthese(B314Parser.ExprCaseParenntheseContext ctx) { 
            ctx.getChild(1).accept(this);
            return null; 
        }
	
        /*Les variables d'environnement*/
        @Override 
        public Object visitEnvironnementInt(B314Parser.EnvironnementIntContext ctx) { 
            if(ctx.LATITUDE() != null) {};
            if(ctx.LONGITUDE() != null) {};
            if(ctx.GRID() != null) {};
            if(ctx.COUNT()!=null){
                String name = ctx.getChild(0).getText();
                switch(name){
                    case"map":{};break;
                    case "radio":{};break;
                    case"ammo":{};break;
                    case "fruits":{};break;
                    case"soda":{};break;
                }
            }
            if(ctx.LIFE()!=null)if(ctx.LATITUDE() != null) {};
            return null; 
        }
	@Override 
        public Object visitEnvironnementBool(B314Parser.EnvironnementBoolContext ctx) { 
            String name = ctx.getChild(0).getText();
            switch(name){
                case"ennemi":
                    if(ctx.NORTH()!= null){}
                    if(ctx.SOUTH()!= null){}
                    if(ctx.EAST() != null){}
                    if(ctx.WEST() != null){}
                case"graal":
                    if(ctx.NORTH()!= null){}
                    if(ctx.SOUTH()!= null){}
                    if(ctx.EAST() != null){}
                    if(ctx.WEST() != null){}                
            }
            return null;
        }

	@Override public Object visitEnvironnementCase(B314Parser.EnvironnementCaseContext ctx) { return null; }

        /*Les expressions de gauche*/
        
	@Override 
        public Object visitExprGVariable(B314Parser.ExprGVariableContext ctx) { 
            //symbole = Currentscope.FoundSymbole(ctx.ID().getText());
            
            return null; 
        }

	@Override public Object visitExprGTableauEntFonct(B314Parser.ExprGTableauEntFonctContext ctx) { return null; }

	@Override public Object visitExprGTableauFonctEnt(B314Parser.ExprGTableauFonctEntContext ctx) { return null; }

	@Override public Object visitExprGTableauFonctFonct(B314Parser.ExprGTableauFonctFonctContext ctx) { return null; }

	@Override public Object visitExprGTableauEntEnt(B314Parser.ExprGTableauEntEntContext ctx) { return null; }

       /*Entier*/         
	@Override 
        public Object visitEntier(B314Parser.EntierContext ctx) { 
            int entier = Integer.parseInt(ctx.NUMBER().getText());
            if(ctx.MOINS()!= null) entier = 0 - entier;
            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, entier);
            return null;
        }

        /*Appel de fonctions*/        
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
        
        /* Les actions*/
	@Override public Object visitAction(B314Parser.ActionContext ctx) { return null; }
        
        /*Les Types*/
	@Override public Object visitTypeScalar(B314Parser.TypeScalarContext ctx) { return null; }

	@Override public Object visitTypeArray(B314Parser.TypeArrayContext ctx) { return null; }

	@Override public Object visitScalarBoolean(B314Parser.ScalarBooleanContext ctx) {

		return null;
	}

	@Override public Object visitScalarInteger(B314Parser.ScalarIntegerContext ctx) {

		//printer.printPutValueToStackPoint(PCodeType.integer, SquareType.rock.getValue());
		return null; }

	@Override public Object visitScalarSquare(B314Parser.ScalarSquareContext ctx) { return null; }

	@Override public Object visitArray(B314Parser.ArrayContext ctx) { return null; }

        /*Declaration des variables*/
	@Override 
        public Object visitVarDecl(B314Parser.VarDeclContext ctx) { 
            Symbole symbole = Currentscope.FoundSymbole(ctx.ID().getText());
            int address = 0;
            printer.printComments("Les variables");
            if(symbole.getIsArray()){
                VariableIsArray(symbole);
                return null;
            }
            printer.printLoadAdress(getType(symbole), 0, address);
            printer.printPutValueToStackPoint(getType(symbole), 0);
            printer.printSetTo(getType(symbole));
            return null; 
        }
        
        /*Les méthodes privates*/
        private void Operation(ParserRuleContext ctx){
            ctx.getChild(0).accept(this);
            ctx.getChild(2).accept(this);
            
            String operation = ctx.getChild(1).getText();
            switch(operation){
                case"%": printer.printMod(PCodePrinter.PCodeTypes.Int);break;
                case"/": printer.printDiv(PCodePrinter.PCodeTypes.Int);break;
                case"*": printer.printMul(PCodePrinter.PCodeTypes.Int);break;
                case"+": printer.printAdd(PCodePrinter.PCodeTypes.Int);break;
                case"-": printer.printSub(PCodePrinter.PCodeTypes.Int);break;
                case"<": printer.printLess(PCodePrinter.PCodeTypes.Int);break;
                case">": printer.printGreather(PCodePrinter.PCodeTypes.Int);break;
                case"and": printer.printAnd();break;
                case"or": printer.printOr();break;                
            }
        } 
	private void readInputValues(){
        for(int i= 0; i<99;i++){
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, i);
            printer.printRead();
            printer.printStore(PCodePrinter.PCodeTypes.Int);

            }
        }
        private void OperationEgale(ParserRuleContext ctx ,PCodePrinter.PCodeTypes types){
            ctx.getChild(0).accept(this);
            ctx.getChild(2).accept(this);
            printer.printEqualsValues(types);
        }
        private PCodePrinter.PCodeTypes getType(Symbole symbole){
            String type = symbole.getType();
            PCodePrinter.PCodeTypes type2 = null;
            if(type.equals("integer"))type2 = PCodePrinter.PCodeTypes.Int;
            else if (type.equals("boolean"))type2 = PCodePrinter.PCodeTypes.Bool;
            else if(type.equals("square"))type2 = PCodePrinter.PCodeTypes.Int; 
            return type2;
        }
        private void VariableIsArray(Symbole symbole){
            int address = 0;
            PCodePrinter.PCodeTypes type = getType(symbole);
            int[] taille = symbole.getLength();
            if(taille.length==1){
                int index = taille[0];
                for(int i = 0;i<index;i++){
                    printer.printLoadAdress(type, 0, address);
                    printer.printPutValueToStackPoint(type, i);
                    printer.printIndexedAdressComputation(i);
                    printer.printPutValueToStackPoint(type, i);
                    printer.printSetTo(type);
                }
            }else{
                int index1 = taille[0];
                int index2 = taille[1];
                for(int i = 0; i<index1;i++)
                    for(int j = 0;j<index2;j++){
                        printer.printLoadAdress(type, 0, address);
                        printer.printPutValueToStackPoint(type, index2);
                        printer.printPutValueToStackPoint(type, i);
                        printer.printMul(type);
                        printer.printPutValueToStackPoint(type, j);
                        printer.printAdd(type);
                        printer.printIndexedAdressComputation(j);
                        printer.printPutValueToStackPoint(type, 0);
                        printer.printSetTo(type);                    
                        }
            }
        }
        
}
      
    
    
    
