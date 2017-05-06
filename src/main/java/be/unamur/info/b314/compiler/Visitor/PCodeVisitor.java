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
import be.unamur.info.b314.compiler.scope.InitialiserLesAdresses;
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
    private final PCodePrinter printer;
    private int LevelWhen;
    private int LevelScope;
    private  int IfPosition;
    private int FunctionPosition;
    private int WhilePosition;
    
    /*
    * Constructeur
    */
    public PCodeVisitor(Scope scope, PCodePrinter printer) {
        this.Globalscope = new InitialiserLesAdresses(scope).getScope();
        this.printer = printer;
        this.Currentscope = scope;
	this.LevelWhen=1;
        this.LevelScope = 0;
        this.IfPosition=1;
        this.FunctionPosition=0;
        this.WhilePosition=0;
    }
    /*
    *Debut Du programme
    */
	@Override
        public Object visitProgramme(B314Parser.ProgrammeContext ctx) {
	    
            LOG.error("Je passe ici ------------------------------------------------------");
            printer.printSetStackPointer(Globalscope.getChildren().size());
            this.readInputValues();   
            
            List<ParseTree> childVarGlobal = ctx.progDecl().children;
            for(int i =0; i<childVarGlobal.size();i++)
                if(childVarGlobal.get(i)instanceof B314Parser.VarDeclContext) childVarGlobal.get(i).accept(this);
            printer.printUnconditionalJump("Start");
            
            printer.printComments("Liste des fonctions");
            for(int i =0; i<childVarGlobal.size();i++)
                if(childVarGlobal.get(i)instanceof B314Parser.FctDeclContext) childVarGlobal.get(i).accept(this);  
            
            printer.printComments("Liste des clauses when");
            List<B314Parser.ClauseWhenContext> childWhen = ctx.clauseWhen();
            for(int i =0;i<childWhen.size();i++)
                childWhen.get(i).accept(this);
            ctx.clauseDefault().accept(this);
            printer.printDefine("Start");
            for(int i =0;i<childWhen.size();i++){
               int position = 1;
               String name = "clauseWhen"+position;
               String nameVisite = "when"+position;
               printer.printDefine(nameVisite);
               printer.printFalseJump(nameVisite);
               position ++;
               printer.printMarkStack(0);
               printer.printCallUserProcedure(0, name);
               printer.printUnconditionalJump("exit");        
            }
            printer.printFalseJump("default");
            printer.printDefine("default");
            ctx.clauseDefault().getChild(1).accept(this);
            printer.printMarkStack(0);
            printer.printCallUserProcedure(0, "clauseDefault");
            printer.printUnconditionalJump("exit");
            
            printer.printComments("End");
            printer.printDefine("exit");
            printer.printPrin();
            printer.printStop();
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
                List<B314Parser.VarDeclContext>VarLocal = ctx.varDecl();
                for(int i =0;i<VarLocal.size();i++)
                    VarLocal.get(i).accept(this);
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
        /*Clause When*/        
	@Override 
        public Object visitClauseWhen(B314Parser.ClauseWhenContext ctx) {
            String name = "clauseWhen"+LevelWhen;
            LevelWhen++;
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
                List<B314Parser.VarDeclContext>VarLocal = ctx.varDecl();
                for(int i =0;i<VarLocal.size();i++)
                    VarLocal.get(i).accept(this);       
                List<InstructionContext> Instructions = ctx.instruction();
                FunctionPosition++;
                for(int i = 0; i < Instructions.size();i++)
                    Instructions.get(i).accept(this);
                //printer.printReturnFromFunction();
                FunctionPosition--;
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
                printer.printSetStackPointer(Currentscope.getChildren().size()+5);
                printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, 0);
                printer.printSetTo(PCodePrinter.PCodeTypes.Int);
                List<InstructionContext> Instructions = ctx.instruction();
                FunctionPosition ++;
                for(int i = 0; i < Instructions.size();i++)
                    Instructions.get(i).accept(this);
                FunctionPosition--;
                printer.printReturnFromFunction();
                LevelScope--;
                Currentscope = Currentscope.getParent();
            }catch(Exception ex){
                throw new RuntimeException();
            }
            return null;
	}
        
        /*Les instructions*/

	@Override 
        public Object visitIf(B314Parser.IfContext ctx) {
		String name = "if"+IfPosition;
		IfPosition++;
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
		String nameIf = "if"+IfPosition;
		String nameElse = "else"+IfPosition;
		IfPosition++;                
		List<ParseTree> liste = ctx.children;
                ctx.getChild(1).accept(this);
                printer.printFalseJump(nameElse);
                for(int i = 0; i<liste.size(); i++){
                    if(liste.get(i).equals("else"))break;
                    liste.get(i).accept(this);
                }
                printer.printUnconditionalJump(nameIf);
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
		String StartWhile = "StartWhile"+WhilePosition;
		String EndWhile = "EndWhile"+WhilePosition;
		WhilePosition++;
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
                printer.printSetTo(getType(symbole));
		return null;
	}

	@Override
        public Object visitAffectationGaucheDroiteFonction(B314Parser.AffectationGaucheDroiteFonctionContext ctx) {
            Symbole symbole = Currentscope.FoundSymbole(ctx.appelDeFonction().getChild(0).getText()); 
            ctx.exprG().accept(this);
            ctx.appelDeFonction().accept(this);
            printer.printSetTo(getType(symbole));
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
            ctx.exprBool().accept(this);
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
            ctx.exprEnt().accept(this);
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

	@Override 
        public Object visitExprCaseNearby(B314Parser.ExprCaseNearbyContext ctx) { 
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, LevelScope, 17);
            CheckTableauTwo(ctx,9,9);
            printer.printIndexedFetch(PCodePrinter.PCodeTypes.Int);
            return null; 
        }

	@Override 
        public Object visitExprCaseParennthese(B314Parser.ExprCaseParenntheseContext ctx) { 
            ctx.exprCase().accept(this);
            return null; 
        }
	
        /*Les variables d'environnement*/
        @Override 
        public Object visitEnvironnementInt(B314Parser.EnvironnementIntContext ctx) { 
            String name = ctx.getChild(0).getText();
            switch(name){
                case"latitude": printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 0);break;
                case"longititue":printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 1);break;
                case"grid":printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 2);break;
                case"map":printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 3);break;
                case"radio":printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 4);break;
                case"ammo":printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 5);break;
                case"fruits":printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 6);break;
                case"soda":printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 7);break;
                case"life":printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 8);break;
            }
            return null; 
        }
	@Override 
        public Object visitEnvironnementBool(B314Parser.EnvironnementBoolContext ctx) {          
            String name = ctx.getChild(0).getText();
            String nameCard = ctx.getChild(3).getText();            
            switch(name){
                case"ennemi":
                    switch(nameCard){
                        case"north":
                            printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 9);
                            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, 1);
                            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
                            break;
                        case"east":
                            printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 10);
                            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, 1);
                            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
                            break;                            
                        case"south":
                            printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 11);
                            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, 1);
                            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
                            break;                            
                        case"west":
                            printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 12);
                            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, 1);
                            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
                            break;                            
                    }
                case"graal":
                    switch(nameCard){
                        case"north":
                            printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 13);
                            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, 1);
                            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
                            break;
                        case"east":
                            printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 14);
                            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, 1);
                            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
                            break;                            
                        case"south":
                            printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 15);
                            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, 1);
                            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
                            break;                            
                        case"west":
                            printer.printLoad(PCodePrinter.PCodeTypes.Int, LevelScope, 16);
                            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, 1);
                            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
                            break;                            
                    }           
            }
            return null;
        }

	@Override public Object visitEnvironnementCase(B314Parser.EnvironnementCaseContext ctx) {

        String name = ctx.getChild(0).getText();
        switch(name){
            case "dirt":
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int,SquareType.dirt.getValue() );
                break;
            case  "rock":
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int,SquareType.rock.getValue());
                break;
            case "vines":
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int,SquareType.vines.getValue());
                break;
            case "zombie":
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int,SquareType.zombie.getValue());
                break;
            case  "ennemi":
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int,SquareType.ennemi.getValue());
                break;
            case "player":
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int,SquareType.player.getValue());
                break;
            case  "map":
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int,SquareType.map.getValue());
                break;
            case "radio":
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int,SquareType.radio.getValue());
                break;
            case "ammo":
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int,SquareType.ammo.getValue());
                break;
            case "fruit":
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int,SquareType.fruit.getValue());
                break;
            case "soda":
                printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int,SquareType.soda.getValue());
                break;
            case "nearby":
                printer.printLoadAdress(PCodePrinter.PCodeTypes.Int,LevelScope,17);
                CheckTableauTwo(ctx,9,9);
                printer.printIndexedFetch(PCodePrinter.PCodeTypes.Int);
                break;


        }

            return null;
        }

        /*Les expressions de gauche*/
        
	@Override 
        public Object visitExprGVariable(B314Parser.ExprGVariableContext ctx) { 
            Symbole symbole = Currentscope.FoundSymbole(ctx.ID().getText());
            if(symbole.getIsFunction())printer.printLoad(getType(symbole), LevelScope, 0);
            else printer.printLoad(getType(symbole), LevelScope, symbole.getAddress());
            return null; 
        }

	@Override 
        public Object visitExprGTableauEntFonct(B314Parser.ExprGTableauEntFonctContext ctx) { 
            Symbole symbole = Currentscope.FoundSymbole(ctx.ID().getText());
            ManipulationTableau(ctx,symbole);
            printer.printIndexedFetch(getType(symbole));
            return null; 
        }

	@Override 
        public Object visitExprGTableauFonctEnt(B314Parser.ExprGTableauFonctEntContext ctx) { 
            Symbole symbole = Currentscope.FoundSymbole(ctx.ID().getText());
            ManipulationTableau(ctx,symbole);
            printer.printIndexedFetch(getType(symbole));            
            return null; 
        }

	@Override 
        public Object visitExprGTableauFonctFonct(B314Parser.ExprGTableauFonctFonctContext ctx) { 
            Symbole symbole = Currentscope.FoundSymbole(ctx.ID().getText());
            ManipulationTableau(ctx,symbole);
            printer.printIndexedFetch(getType(symbole));            
            return null; 
        }

	@Override 
        public Object visitExprGTableauEntEnt(B314Parser.ExprGTableauEntEntContext ctx) { 
            Symbole symbole = Currentscope.FoundSymbole(ctx.ID().getText());
            ManipulationTableau(ctx,symbole);
            printer.printIndexedFetch(getType(symbole));            
            return null; 
        }

       /*Entier*/         
	@Override 
        public Object visitEntier(B314Parser.EntierContext ctx) { 
            int entier = Integer.parseInt(ctx.NUMBER().getText());
            if(ctx.MOINS().getText().equals("-")) entier = 0 - entier;
            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, entier);
            return null;
        }

        /*Appel de fonctions*/        
	@Override 
        public Object visitAppelDeFonction(B314Parser.AppelDeFonctionContext ctx) {
            printer.printMarkStack(FunctionPosition);
            FunctionPosition++;
            List<B314Parser.ExprDContext> listeParametre = ctx.exprD();
            for(int i =0;i<listeParametre.size();i++)
                listeParametre.get(i).accept(this);
            printer.printCallUserProcedure(listeParametre.size(), ctx.ID().getText());
            FunctionPosition--;
            return null; 
        }
        /*Declaration des variables*/
	@Override 
        public Object visitVarDecl(B314Parser.VarDeclContext ctx) { 
            Symbole symbole = Currentscope.FoundSymbole(ctx.ID().getText());
            printer.printComments("Les variables");
            if(symbole.getIsArray()){
                VariableIsArray(symbole);
                return null;
            }
            printer.printLoadAdress(getType(symbole), 0, symbole.getAddress());
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
            PCodePrinter.PCodeTypes type = getType(symbole);
            int[] taille = symbole.getLength();
            if(taille.length==1){
                int index = taille[0];
                for(int i = 0;i<index;i++){
                    printer.printLoadAdress(type, 0, symbole.getAddress());
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
                        printer.printLoadAdress(type, 0, symbole.getAddress());
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
        private void CheckTableauTwo(ParserRuleContext ctx,int ligne,int col){
            printer.printPutValueToStackPoint(PCodePrinter.PCodeTypes.Int, col);
            ctx.getChild(2).accept(this);
            printer.printCheck(0, ligne-1);
            printer.printMul(PCodePrinter.PCodeTypes.Int);
            ctx.getChild(4).accept(this);
            printer.printCheck(0, col-1);
            printer.printAdd(PCodePrinter.PCodeTypes.Int);
            printer.printIndexedAdressComputation(col);
        }
        private void CheckTableauOne(ParserRuleContext ctx, int taille){
            ctx.getChild(2).accept(this);
            printer.printCheck(0, taille-1);
            printer.printIndexedAdressComputation(taille);
        }
        private void ManipulationTableau( ParserRuleContext ctx,Symbole symbole){
            printer.printLoadAdress(getType(symbole), LevelScope, symbole.getAddress());
            if(symbole.getLength().length==1) CheckTableauOne(ctx, symbole.getLength()[0]);
            else CheckTableauTwo(ctx, symbole.getLength()[0], symbole.getLength()[1]);
        }
 
}
      
    
    
    
