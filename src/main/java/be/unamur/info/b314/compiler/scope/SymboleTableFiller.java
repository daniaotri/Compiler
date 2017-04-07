 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *and open the template in the editor.
*/

package be.unamur.info.b314.compiler.scope;

import be.unamur.info.b314.compiler.B314BaseListener;
import be.unamur.info.b314.compiler.B314Parser;
import java.util.Locale;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
/*
 *
 *@author jessi
 *
 */

public class SymboleTableFiller extends B314BaseListener {
    
    enum Type{
    INTEGER,
    BOOLEAN,
    SQUARE,
    VOID
    }
    
        ScopeImpl GeneralScope;
        ScopeImpl CurrentScope;
        Symbole CurrentSymbole;
        boolean CurrentIsFonction;
        int position;
        
        public SymboleTableFiller(Scope x){
            GeneralScope = (ScopeImpl) x;
            CurrentScope = GeneralScope;            
            CurrentIsFonction=false;
            position = 1;
            for(int j=0;j<CurrentScope.getChildren().size();j++)
                System.out.println(CurrentScope.getChildren().get(j).GetName());
            for(int i =0;i<CurrentScope.getSymboles().size();i++)
            System.out.println(CurrentScope.getSymboles().get(i).toString());
        }
        /**
         *
         *  Renvoie le scope general
         */
        public ScopeImpl getScope(){
            //GeneralScope.CorrectEveryThing();
            return GeneralScope;
        }
        /**
         *
         *  Debut du programme
         */
	@Override 
        public void enterProgramme(B314Parser.ProgrammeContext ctx) {
        }
        /**
         *
         *  Définition des fonctions
         */
	@Override 
        public void enterFctDecl(B314Parser.FctDeclContext ctx) {
            CurrentScope = (ScopeImpl) CurrentScope.WhoIsThisScope(ctx.ID().getText()); 
        }

	@Override 
        public void exitFctDecl(B314Parser.FctDeclContext ctx) {
            CurrentIsFonction = false;
            CurrentScope = (ScopeImpl) CurrentScope.getParent();
        }

        /*
         *
         *  Clause When
         */
	@Override 
        public void enterClauseWhen(B314Parser.ClauseWhenContext ctx) { 
            String nomScope = "clauseWhen"+position;
            CurrentScope= (ScopeImpl) CurrentScope.WhoIsThisScope(nomScope);
            position = position +1;  
            if(ctx.exprG() != null || ctx.appelDeFonction() != null){
                Symbole sym= CurrentScope.FoundSymbole(ctx.getChild(1).getChild(0).getText());
                CheckTwoType(sym.getType(), Type.BOOLEAN.toString().toLowerCase());
            }
        }

	@Override 
        public void exitClauseWhen(B314Parser.ClauseWhenContext ctx) { 
            CurrentScope = (ScopeImpl) CurrentScope.getParent();
        }
        /**
         *
         *  Clause default
         */
	@Override 
        public void enterClauseDefault(B314Parser.ClauseDefaultContext ctx) {
            CurrentScope=(ScopeImpl) CurrentScope.WhoIsThisScope("clauseDefault");             
        }

	@Override 
        public void exitClauseDefault(B314Parser.ClauseDefaultContext ctx) {
            CurrentScope = (ScopeImpl) CurrentScope.getParent();
        }
        /**
         *
         * Les instructions
         */
	@Override 
        public void enterIf(B314Parser.IfContext ctx) {
            if(ctx.exprG() != null || ctx.appelDeFonction() != null){
                Symbole sym= CurrentScope.FoundSymbole(ctx.getChild(1).getChild(0).getText());
                CheckTwoType(sym.getType(), Type.BOOLEAN.toString().toLowerCase());
            }
        }

	@Override 
        public void enterIfthenelse(B314Parser.IfthenelseContext ctx) {
            if(ctx.exprG() != null || ctx.appelDeFonction() != null){
                Symbole sym= CurrentScope.FoundSymbole(ctx.getChild(1).getChild(0).getText());
                CheckTwoType(sym.getType(), Type.BOOLEAN.toString().toLowerCase());
            }
        }

	@Override
        public void enterWhile(B314Parser.WhileContext ctx) {
            if(ctx.exprG() != null || ctx.appelDeFonction() != null){
                Symbole sym= CurrentScope.FoundSymbole(ctx.getChild(1).getChild(0).getText());
                CheckTwoType(sym.getType(), Type.BOOLEAN.toString().toLowerCase());
            }
        }

	@Override 
        public void enterAffectationGaucheDroite(B314Parser.AffectationGaucheDroiteContext ctx) {
                Symbole symbole = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText());
                System.out.println(symbole.getName()+" "+ symbole.getType());
                String type = symbole.getType();  
                CheckTwoType(type, Type.INTEGER.toString().toLowerCase());
        }
        @Override 
        public void enterAffectationGaucheDroiteBool(B314Parser.AffectationGaucheDroiteBoolContext ctx) {
                Symbole symbole = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText());
                System.out.println(symbole.getName()+" "+ symbole.getType());
                String type = symbole.getType();  
                CheckTwoType(type, Type.BOOLEAN.toString().toLowerCase());        
        }
 
        public void enterAffectationGaucheDroiteCase(B314Parser.AffectationGaucheDroiteCaseContext ctx) {
                Symbole symbole = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText());
                System.out.println(symbole.getName()+" "+ symbole.getType());
                String type = symbole.getType();  
                CheckTwoType(type, Type.SQUARE.toString().toLowerCase());        
        }

	@Override 
        public void enterAffectationGaucheDroiteGauche(B314Parser.AffectationGaucheDroiteGaucheContext ctx) {
                Symbole symbole1 = CurrentScope.FoundSymbole(ctx.exprG(0).getChild(0).getText());
                Symbole symbole2 = CurrentScope.FoundSymbole(ctx.exprG(1).getChild(0).getText());                
                CheckTwoType(symbole1.getType(), symbole2.getType());        
        }

	@Override 
        public void enterAffectationGaucheDroiteFonction(B314Parser.AffectationGaucheDroiteFonctionContext ctx) {
                Symbole symbole1 = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText());
                Symbole symbole2 = CurrentScope.FoundSymbole(ctx.appelDeFonction().getChild(0).getText());
                CheckTwoType(symbole1.getType(), symbole2.getType());
        }

        /**
         *
         * les Fonctions
         */
        @Override 
        public void enterAppelDeFonction(B314Parser.AppelDeFonctionContext ctx) {
            Symbole sym = CurrentScope.FoundSymbole(ctx.ID().getText());
            if (sym.getLesParametres().size()>0)
                    {
                    for(int i = 0; i<sym.getLesParametres().size();i++){
                        String typeSave = GetTypeParmInFonction(sym.getName(),sym.getLesParametres().get(i));
                        if(ctx.exprD(i)!= null)CheckTypeDroite(ctx.exprD(i),typeSave);
                        else throw new RuntimeException();
                    }        
                    }
            else if(ctx.exprD(0)!= null) throw new RuntimeException();        
        }
        /**
         *
         * Les expressions de gauches
         */
	@Override 
        public void enterExprGVariable(B314Parser.ExprGVariableContext ctx) { 
            CurrentSymbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            if(CurrentSymbole==null)throw new RuntimeException();        
        }

	@Override 
        public void enterExprGTableauEntFonct(B314Parser.ExprGTableauEntFonctContext ctx) {
            CurrentSymbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            //if(CurrentSymbole == null)throw new RuntimeException();
            if(CurrentSymbole.getIsArray()){
                if(CurrentSymbole.getLength().length==1){
                      if(ctx.getChild(4)!=null)throw new RuntimeException();    
                }
                else{
                    if(ctx.getChild(2)==null || ctx.getChild(4)==null)throw new RuntimeException();
                    else CheckTwoType(GetType((ParserRuleContext) ctx.getChild(4)),Type.INTEGER.toString().toLowerCase( ));
                }
            }
            else if(ctx.getChild(2)!= null)  throw new RuntimeException();          
        }

	@Override 
        public void enterExprGTableauFonctEnt(B314Parser.ExprGTableauFonctEntContext ctx) {
            CurrentSymbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            if(CurrentSymbole.getIsArray()){
                if(CurrentSymbole.getLength().length==1){
                    if(ctx.getChild(2)==null)throw new RuntimeException();
                    else {
                        CheckTwoType(GetType((ParserRuleContext) ctx.getChild(2)),Type.INTEGER.toString().toLowerCase( ));
                    }
                    if(ctx.getChild(4)!=null)throw new RuntimeException();    
                }
                else{
                    if(ctx.getChild(2)==null || ctx.getChild(4)==null)throw new RuntimeException();
                      }
            }
            else if(ctx.getChild(2)!= null)  throw new RuntimeException();             
        }
        @Override
        public void enterExprGTableauEntEnt(B314Parser.ExprGTableauEntEntContext ctx){
            CurrentSymbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            if(CurrentSymbole.getIsArray()){
                if(CurrentSymbole.getLength().length==1){
                    if(ctx.getChild(2)==null)throw new RuntimeException();
                    if(ctx.getChild(4)!=null)throw new RuntimeException();    
                }
                else{
                    if(ctx.getChild(2)==null || ctx.getChild(4)==null)throw new RuntimeException();
                      }
            }
            else if(ctx.getChild(2)!= null)  throw new RuntimeException();         
        }

	@Override 
        public void enterExprGTableauFonctFonct(B314Parser.ExprGTableauFonctFonctContext ctx) {
            CurrentSymbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            System.out.println("Bonjour0 ");
            if(CurrentSymbole.getIsArray()){
                if(CurrentSymbole.getLength().length==1){
                    if(ctx.getChild(2)==null)throw new RuntimeException();
                    else CheckTwoType(GetType((ParserRuleContext) ctx.getChild(2)),Type.INTEGER.toString().toLowerCase( ));
                    if(ctx.getChild(4)!=null)throw new RuntimeException();    
                }
                else{
                    System.out.println("Bonjour1 ");
                    if(ctx.getChild(2)==null || ctx.getChild(4)==null)throw new RuntimeException();
                    else{
                        System.out.println("Bonjour2 ");
                        CheckTwoType(GetType((ParserRuleContext) ctx.getChild(2)),Type.INTEGER.toString().toLowerCase( ));
                        CheckTwoType(GetType((ParserRuleContext) ctx.getChild(4)),Type.INTEGER.toString().toLowerCase( ));                    
                    } 
                }
            }
            else if(ctx.getChild(2)!= null) throw new RuntimeException();            
        }
        /**
         *
         * Les expressions de type case
         */
        @Override 
        public void enterExprCaseNearby(B314Parser.ExprCaseNearbyContext ctx) {
            if(ctx.getChild(2) == null || ctx.getChild(4) == null)throw new RuntimeException();
            else{
                if(ctx.exprG(0)!= null)CheckTwoType(GetType(ctx.exprG(0)),Type.INTEGER.toString().toLowerCase( ));
                if(ctx.exprG(1)!= null)CheckTwoType(GetType(ctx.exprG(1)),Type.INTEGER.toString().toLowerCase( ));
                if(ctx.appelDeFonction(0)!= null)CheckTwoType(GetType(ctx.appelDeFonction(0)),Type.INTEGER.toString().toLowerCase( ));
                if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),Type.INTEGER.toString().toLowerCase( ));
            }
        }
        /**
         *
         * Les expressions de type booléenne
         */
	@Override 
        public void enterExprBoolNotGauche(B314Parser.ExprBoolNotGaucheContext ctx) {
            if(ctx.exprG()!= null)CheckTwoType(GetType(ctx.exprG()),Type.BOOLEAN.toString().toLowerCase( ));
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.BOOLEAN.toString().toLowerCase( ));
            else throw new RuntimeException();
        }
	@Override 
        public void enterExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx) {
            if(ctx.exprG()!= null)CheckTwoType(GetType(ctx.exprG()),Type.BOOLEAN.toString().toLowerCase( ));
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.BOOLEAN.toString().toLowerCase( ));    
            else throw new RuntimeException();
        }
	@Override 
        public void enterExprBoolEgaleBoolGauche(B314Parser.ExprBoolEgaleBoolGaucheContext ctx) {
            if(ctx.exprG()!= null)CheckTwoType(GetType(ctx.exprG()),Type.BOOLEAN.toString().toLowerCase( ));
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.BOOLEAN.toString().toLowerCase( ));
            else throw new RuntimeException();
        }
	@Override 
        public void enterExprBoolEgaleOther(B314Parser.ExprBoolEgaleOtherContext ctx) {
            if(ctx.exprCase(0)!= null){
                if(ctx.exprEnt(1)!= null) throw new RuntimeException();
                if(ctx.exprG(1) != null)CheckTwoType(GetType(ctx.exprG(1)),Type.SQUARE.toString().toLowerCase( ));
                if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),Type.SQUARE.toString().toLowerCase( ));
            }
            if(ctx.exprEnt(0)!= null){
                if(ctx.exprCase(1) != null) throw new RuntimeException();
                if(ctx.exprG(1) != null)CheckTwoType(GetType(ctx.exprG(1)),Type.INTEGER.toString().toLowerCase( ));
                if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),Type.INTEGER.toString().toLowerCase( ));
            }
            if(ctx.exprG(0)!= null){
                System.out.println("Hello ...");
                if (ctx.exprCase(1) != null){CheckTwoType(GetType(ctx.exprG(0)),Type.SQUARE.toString().toLowerCase( ));}
                if(ctx.exprG(1) != null){CheckTwoType(GetType(ctx.exprG(1)),GetType(ctx.exprG(0)));}
                if(ctx.appelDeFonction(1)!= null){CheckTwoType(GetType(ctx.appelDeFonction(1)),GetType(ctx.exprG(0)));}
                if(ctx.exprEnt(1)!= null)CheckTwoType(GetType(ctx.exprG(1)),Type.INTEGER.toString().toLowerCase( ));
            }
            if(ctx.appelDeFonction(0)!= null){
                if(ctx.exprEnt(1)!= null) CheckTwoType(GetType(ctx.appelDeFonction(0)),Type.INTEGER.toString().toLowerCase());
                if (ctx.exprCase(1) != null)CheckTwoType(GetType(ctx.appelDeFonction(0)),Type.SQUARE.toString().toLowerCase( ));
                if(ctx.exprG(1) != null)CheckTwoType(GetType(ctx.exprG(1)),GetType(ctx.appelDeFonction(0)));
                if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),GetType(ctx.appelDeFonction(0)));   
            }
            
        }
	@Override 
        public void enterExprBoolAndOrGaucheBool(B314Parser.ExprBoolAndOrGaucheBoolContext ctx) {
            if(ctx.exprG()!= null)CheckTwoType(GetType(ctx.exprG()),Type.BOOLEAN.toString().toLowerCase( ));
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.BOOLEAN.toString().toLowerCase( ));                     
        }
	@Override 
        public void enterExprBoolEgaleGaucheBool(B314Parser.ExprBoolEgaleGaucheBoolContext ctx) {
            if(ctx.exprG()!= null)CheckTwoType(GetType(ctx.exprG()),Type.BOOLEAN.toString().toLowerCase( ));
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.BOOLEAN.toString().toLowerCase( ));                    
        }

	@Override 
        public void enterExprBoolAndOrGaucheGauche(B314Parser.ExprBoolAndOrGaucheGaucheContext ctx) {
            if(ctx.exprG(0)!= null)CheckTwoType(GetType(ctx.exprG(0)),Type.BOOLEAN.toString().toLowerCase( ));
            else if(ctx.appelDeFonction(0)!= null)CheckTwoType(GetType(ctx.appelDeFonction(0)),Type.BOOLEAN.toString().toLowerCase( ));
            if(ctx.exprG(1)!= null)CheckTwoType(GetType(ctx.exprG(1)),Type.BOOLEAN.toString().toLowerCase( ));
            else if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),Type.BOOLEAN.toString().toLowerCase( ));
        }

	@Override 
        public void enterExprBoolInfSupEnt(B314Parser.ExprBoolInfSupEntContext ctx) {
            if(ctx.exprEnt(0)!= null)CheckTwoType(GetType(ctx.exprEnt(0)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.exprEnt(1)!= null)CheckTwoType(GetType(ctx.exprEnt(1)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.exprG(0)!= null)CheckTwoType(GetType(ctx.exprG(0)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.exprG(1)!= null)CheckTwoType(GetType(ctx.exprG(1)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.appelDeFonction(0)!= null)CheckTwoType(GetType(ctx.appelDeFonction(0)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),Type.INTEGER.toString().toLowerCase( ));                   
        }
        /**
         *
         * Les expressions de type entière
         */
	@Override 
        public void enterExprEntPlusMoinsGauheEnt(B314Parser.ExprEntPlusMoinsGauheEntContext ctx) {
            if(ctx.exprG()!= null)CheckTwoType(GetType(ctx.exprG()),Type.INTEGER.toString().toLowerCase( ));
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.INTEGER.toString().toLowerCase( ));        
        }

	@Override 
        public void enterExprEntMulDivEntGauhe(B314Parser.ExprEntMulDivEntGauheContext ctx) {
            if(ctx.exprG()!= null)CheckTwoType(GetType(ctx.exprG()),Type.INTEGER.toString().toLowerCase( ));
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.INTEGER.toString().toLowerCase( ));        
        }

	@Override 
        public void enterExprEntMulDivGaucheGauhe(B314Parser.ExprEntMulDivGaucheGauheContext ctx) {
            if(ctx.exprG(0)!= null)CheckTwoType(GetType(ctx.exprG(0)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.exprG(1)!= null)CheckTwoType(GetType(ctx.exprG(1)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.appelDeFonction(0)!= null)CheckTwoType(GetType(ctx.appelDeFonction(0)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),Type.INTEGER.toString().toLowerCase( ));         
        }

	@Override 
        public void enterExprEntMulDivGauheEnt(B314Parser.ExprEntMulDivGauheEntContext ctx) {
            if(ctx.exprG()!= null)CheckTwoType(GetType(ctx.exprG()),Type.INTEGER.toString().toLowerCase( ));
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.INTEGER.toString().toLowerCase( ));        
        }
	@Override 
        public void enterExprEntPlusMoinsEntGauhe(B314Parser.ExprEntPlusMoinsEntGauheContext ctx) {
            if(ctx.exprG()!= null)CheckTwoType(GetType(ctx.exprG()),Type.INTEGER.toString().toLowerCase( ));
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.INTEGER.toString().toLowerCase( ));        
        }
	@Override 
        public void enterExprEntPlusMoinsGaucheGauhe(B314Parser.ExprEntPlusMoinsGaucheGauheContext ctx) {
            if(ctx.exprG(0)!= null)CheckTwoType(GetType(ctx.exprG(0)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.exprG(1)!= null)CheckTwoType(GetType(ctx.exprG(1)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.appelDeFonction(0)!= null)CheckTwoType(GetType(ctx.appelDeFonction(0)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),Type.INTEGER.toString().toLowerCase( ));         
        }      
        /**
         *
         * LEs méthodes privates
         */
        private String GetTypeParmInFonction(String nameFct, String nameParam){
            Scope parent = CurrentScope.getParent();
            Scope scopefct = parent.WhoIsThisScope(nameFct);
            Symbole sym = scopefct.FoundSymbole(nameParam);
            return sym.getType();            
        }

        private void CheckTypeDroite(ParserRuleContext ctx,String type ){
                if(ctx.getChild(0) instanceof B314Parser.ExprDBooleanContext){
                    System.out.println("Hello boolean ");
                    if(!Type.BOOLEAN.toString().toLowerCase().equals(type))throw new RuntimeException();
                    }
                else if(ctx.getChild(0) instanceof B314Parser.ExprDCaseContext){
                        System.out.println("Hello square ");
                        if(!Type.SQUARE.toString().toLowerCase().equals(type))throw new RuntimeException();
                    }
                else if(ctx.getChild(0) instanceof B314Parser.ExprDIntegerContext){
                        System.out.println("Hello integer ");
                        if(!Type.INTEGER.toString().toLowerCase().equals(type))throw new RuntimeException();
                    }
                else if(ctx.getChild(0) instanceof B314Parser.ExprDFonctionContext || ctx.getChild(0) instanceof B314Parser.ExprDGContext){
                        System.out.print("Expression de Gauche + fonction ");
                        Symbole sym = CurrentScope.FoundSymbole(ctx.getChild(0).getChild(0).getText());
                        System.out.print(" "+sym.getName()+" "+sym.getType()+ " "+sym.getIsArray());
                        if(!sym.getType().equals(type)) throw new RuntimeException();                    
                    }
                else if(ctx.getChild(1) instanceof B314Parser.ExprFonctionParenntheseContext){
                        Symbole sym = CurrentScope.FoundSymbole(ctx.getChild(1).getChild(0).getText());
                        if(!sym.getType().equals(type)) throw new RuntimeException();
                    }                 
                }            

        private String GetType(ParserRuleContext ctx){
            String result = null;
            if(ctx instanceof B314Parser.ExprEntContext) result= Type.INTEGER.toString().toLowerCase();
            
            if(ctx instanceof B314Parser.ExprGContext || ctx instanceof B314Parser.AppelDeFonctionContext){
                Symbole symbole = CurrentScope.FoundSymbole(ctx.getChild(0).getText());
                result= symbole.getType(); 
                System.out.println(symbole.getName()+" "+result);
               
            }
            if(ctx instanceof B314Parser.ExprBoolContext)result= Type.BOOLEAN.toString().toLowerCase();
            if(ctx instanceof B314Parser.ExprCaseContext)result= Type.SQUARE.toString().toLowerCase();
            return result;
        }
        private void CheckTwoType(String type1, String type2){
            if(!type1.equals(type2)) throw new RuntimeException();
        }
        
}
