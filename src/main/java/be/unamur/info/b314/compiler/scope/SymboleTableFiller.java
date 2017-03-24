 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *and open the template in the editor.
*/

package be.unamur.info.b314.compiler.scope;

import be.unamur.info.b314.compiler.B314BaseListener;
import be.unamur.info.b314.compiler.B314Parser;
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
            System.out.println(CurrentScope.GetName());
            for(int i = 0;i < CurrentScope.getChildren().size();i++)
                System.out.println(CurrentScope.getChildren().get(i).GetName());
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
         *  les expressions entières
         */
	@Override 
        public void enterExprEntFonction(B314Parser.ExprEntFonctionContext ctx) { 
            Symbole symbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            if(symbole == null)throw new RuntimeException();
            else if(!(symbole.getType().equals(Type.INTEGER.toString().toLowerCase())))throw new RuntimeException();        
        }
	@Override 
        public void enterExprEntMulDivEntGauhe(B314Parser.ExprEntMulDivEntGauheContext ctx) {
            Symbole symbole = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText());
            if(symbole == null)throw new RuntimeException();
            else if(!(symbole.getType().equals(Type.INTEGER.toString().toLowerCase())))throw new RuntimeException();         
        }

	@Override 
        public void enterExprEntMulDivGaucheGauhe(B314Parser.ExprEntMulDivGaucheGauheContext ctx) { 
            String type1 = CurrentScope.FoundSymbole(ctx.expr3.getChild(0).getText()).getType();
            String type2 = CurrentScope.FoundSymbole(ctx.expr4.getChild(0).getText()).getType();
           if((!(type1.equals(Type.INTEGER.toString().toLowerCase()))) || (!(type2.equals(Type.INTEGER.toString().toLowerCase()))))throw new RuntimeException();          
        }

	@Override 
        public void enterExprEntMulDivGauheEnt(B314Parser.ExprEntMulDivGauheEntContext ctx) {
            Symbole symbole = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText());
            if(symbole == null)throw new RuntimeException();
            else if(!(symbole.getType().equals(Type.INTEGER.toString().toLowerCase())))throw new RuntimeException();         
        }

        @Override 
        public void enterExprEntPlusMoinsEntGauhe(B314Parser.ExprEntPlusMoinsEntGauheContext ctx) {
            Symbole symbole = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText());
            System.out.println(symbole.getName()+" "+symbole.getType());
            if(symbole == null)throw new RuntimeException();
            else if(!(symbole.getType().equals(Type.INTEGER.toString().toLowerCase())))throw new RuntimeException();             
        }
	@Override 
        public void enterExprEntPlusMoinsGaucheGauhe(B314Parser.ExprEntPlusMoinsGaucheGauheContext ctx) { 
            String type1 = CurrentScope.FoundSymbole(ctx.expr3.getChild(0).getText()).getType();
            String type2 = CurrentScope.FoundSymbole(ctx.expr4.getChild(0).getText()).getType();
           if((!(type1.equals(Type.INTEGER.toString().toLowerCase()))) || (!(type2.equals(Type.INTEGER.toString().toLowerCase()))))throw new RuntimeException();          
        }	
        @Override 
        public void enterExprEntPlusMoinsGauheEnt(B314Parser.ExprEntPlusMoinsGauheEntContext ctx) {
            Symbole symbole = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText());
            if(symbole == null)throw new RuntimeException();
            else if(!(symbole.getType().equals(Type.INTEGER.toString().toLowerCase())))throw new RuntimeException();          
        }     
        /**
         *
         *  les expressions booleénnes
         */        
	@Override 
        public void enterExprBoolFonction(B314Parser.ExprBoolFonctionContext ctx) {
            Symbole symbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            if(!(symbole.getType().equals(Type.BOOLEAN.toString().toLowerCase())))throw new RuntimeException();
        }
        
        @Override 
        public void enterExprBoolEgaleGaucheGauche(B314Parser.ExprBoolEgaleGaucheGaucheContext ctx) { 
            String type1 = CurrentScope.FoundSymbole(ctx.expr3.getChild(0).getText()).getType();
            String type2 = CurrentScope.FoundSymbole(ctx.expr4.getChild(0).getText()).getType();
           if(!(type1.equals(type2)))throw new RuntimeException();        
        }

        @Override 
        public void enterExprBoolEgaleGaucheEnt(B314Parser.ExprBoolEgaleGaucheEntContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(!(type.equals(Type.INTEGER.toString().toLowerCase())))throw new RuntimeException();
        }

	@Override 
        public void enterExprBoolEgaleGaucheCase(B314Parser.ExprBoolEgaleGaucheCaseContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(!(type.equals(Type.SQUARE.toString().toLowerCase())))throw new RuntimeException();        
        }

	@Override 
        public void enterExprBoolEgaleGaucheBool(B314Parser.ExprBoolEgaleGaucheBoolContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(!(type.equals(Type.BOOLEAN.toString().toLowerCase())))throw new RuntimeException();         
        }

	@Override 
        public void enterExprBoolEgaleEntGauche(B314Parser.ExprBoolEgaleEntGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(!(type.equals(Type.INTEGER.toString().toLowerCase())))throw new RuntimeException();        
        }

	@Override 
        public void enterExprBoolEgaleBoolGauche(B314Parser.ExprBoolEgaleBoolGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(!(type.equals(Type.BOOLEAN.toString().toLowerCase())))throw new RuntimeException();         
        }

        @Override 
        public void enterExprBoolEgaleCaseGauche(B314Parser.ExprBoolEgaleCaseGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(!(type.equals(Type.SQUARE.toString().toLowerCase())))throw new RuntimeException();         
        }

	@Override 
        public void enterExprBoolNotGauche(B314Parser.ExprBoolNotGaucheContext ctx) { 
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(!(type.equals(Type.BOOLEAN.toString().toLowerCase())))throw new RuntimeException();            
        }

        @Override 
        public void enterExprBoolAndOrGaucheGauche(B314Parser.ExprBoolAndOrGaucheGaucheContext ctx) {
            String type1 = CurrentScope.FoundSymbole(ctx.expr5.getChild(0).getText()).getType();
            String type2 = CurrentScope.FoundSymbole(ctx.expr6.getChild(0).getText()).getType();
           if((!(type1.equals(Type.BOOLEAN.toString().toLowerCase()))) || (!(type2.equals(Type.BOOLEAN.toString().toLowerCase()))))throw new RuntimeException();        
        }

        @Override 
        public void enterExprBoolAndOrGaucheBool(B314Parser.ExprBoolAndOrGaucheBoolContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
           if(!(type.equals(Type.BOOLEAN.toString().toLowerCase())))throw new RuntimeException();        
        }

        @Override 
        public void enterExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
           if(!(type.equals(Type.BOOLEAN.toString().toLowerCase())))throw new RuntimeException();          
        }

	@Override 
        public void exitExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
           if(!(type.equals(Type.BOOLEAN.toString().toLowerCase())))throw new RuntimeException();          
        }
        
        @Override 
        public void enterExprBoolInfSupGG(B314Parser.ExprBoolInfSupGGContext ctx) { 
              if(ctx.expr1 == null || ctx.expr2 == null)throw new RuntimeException();
              else{
                Symbole symbole1 = CurrentScope.FoundSymbole(ctx.expr1.getChild(0).getText());
                Symbole symbole2 = CurrentScope.FoundSymbole(ctx.expr2.getChild(0).getText()); 
                String type1=symbole1.getType();
                String type2= symbole2.getType();
                if((!(type1.equals(Type.INTEGER.toString().toLowerCase())))||(!(type2.equals(Type.INTEGER.toString().toLowerCase()))))throw new RuntimeException();
              }
              
        }

	@Override 
        public void enterExprBoolInfSupGEnt(B314Parser.ExprBoolInfSupGEntContext ctx) { 
              if(ctx.expr1 == null)throw new RuntimeException();
              else{
                Symbole symbole1 = CurrentScope.FoundSymbole(ctx.expr1.getChild(0).getText());
                String type1=symbole1.getType();
                if(!(type1.equals(Type.INTEGER.toString().toLowerCase())))throw new RuntimeException();
              }        
        }

	@Override 
        public void enterExprBoolInfSupEntGauche(B314Parser.ExprBoolInfSupEntGaucheContext ctx) {
              if(ctx.expr2 == null)throw new RuntimeException();
              else{
                Symbole symbole2 = CurrentScope.FoundSymbole(ctx.expr2.getChild(0).getText()); 
                String type2= symbole2.getType();
                if(!(type2.equals(Type.INTEGER.toString().toLowerCase())))throw new RuntimeException();
              }        
        }      
        /**
         *
         *  les expressions squares
         */
	@Override 
        public void enterExprCaseFonction(B314Parser.ExprCaseFonctionContext ctx) { 
            Symbole symbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            if(!(symbole.getType().equals(Type.SQUARE.toString().toLowerCase())))throw new RuntimeException();             
        }
	@Override 
        public void enterExprCaseNearbyEntG(B314Parser.ExprCaseNearbyEntGContext ctx) {
            if(ctx.exprG()==null)throw new RuntimeException();
            else {
                String type1 = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
                if(!(type1.equals(Type.INTEGER.toString().toLowerCase())))throw new RuntimeException();
            }         
        }
	@Override 
        public void enterExprCaseNearbyGEnt(B314Parser.ExprCaseNearbyGEntContext ctx) {
            if(ctx.exprG()==null)throw new RuntimeException();
            else {
                String type1 = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
                if(!(type1.equals(Type.INTEGER.toString().toLowerCase())))throw new RuntimeException();
            }         
        }
	@Override 
        public void enterExprCaseNearbyGG(B314Parser.ExprCaseNearbyGGContext ctx) {
            if(ctx.taille1==null || ctx.taille2==null)throw new RuntimeException();
            else {
                Symbole s1 = CurrentScope.FoundSymbole(ctx.taille1.getChild(0).getText());
                Symbole s2 = CurrentScope.FoundSymbole(ctx.taille2.getChild(0).getText());
                if((!(s1.getType().equals(Type.INTEGER.toString().toLowerCase()))) || (!(s2.getType().equals(Type.INTEGER.toString().toLowerCase()))))
                throw new RuntimeException();
            }         
        }     
        /**
         *
         * Les expressions de gauches
         */
        
	@Override 
        public void enterExprGVariable(B314Parser.ExprGVariableContext ctx) {
            CurrentSymbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            if(CurrentSymbole == null)throw new RuntimeException();
        }
        
	@Override 
        public void enterExprGTableau(B314Parser.ExprGTableauContext ctx) {
            CurrentSymbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            //if(CurrentSymbole == null)throw new RuntimeException();
            if(CurrentSymbole.getIsArray()){
                if(CurrentSymbole.getLength().length==1){
                    if(ctx.t3==null)throw new RuntimeException();
                    else if (!(GetType((ParserRuleContext) ctx.t3.getChild(0)).equals(Type.INTEGER.toString().toLowerCase())))throw new RuntimeException();
                    if(ctx.t4!=null)throw new RuntimeException();    
                }
                else{
                    if(ctx.t3==null || ctx.t4==null)throw new RuntimeException();
                    else if((!(GetType((ParserRuleContext) ctx.t3.getChild(0)).equals(Type.INTEGER.toString().toLowerCase()))) || (!(GetType((ParserRuleContext) ctx.t4.getChild(0)).equals(Type.INTEGER.toString().toLowerCase()))) )throw new RuntimeException();
                }
            }
            else if(!(ctx.t3.equals(null))) throw new RuntimeException();
        }

        @Override 
        public void enterAffectationGaucheGauche(B314Parser.AffectationGaucheGaucheContext ctx) {
            String name1 = ctx.exprG(0).getChild(0).getText();
            Symbole symbole1 = CurrentScope.FoundSymbole(name1);
            String name2 = ctx.exprG(1).getChild(0).getText();
            Symbole symbole2 = CurrentScope.FoundSymbole(name2);
            if(symbole1==null || symbole2==null || symbole1.getType()!=symbole2.getType())
                throw new RuntimeException();
        }

	@Override 
        public void enterAffectationGaucheEnt(B314Parser.AffectationGaucheEntContext ctx) {
            String name = ctx.exprG().getChild(0).getText();
            Symbole symbole = CurrentScope.FoundSymbole(name);
            System.out.println(symbole.getName()+" "+symbole.getType()+" "+symbole.getIsArray()+" "+symbole.getIsFunction());
            if((symbole==null)||!(symbole.getType().equals(Type.INTEGER.name().toLowerCase())))
                throw new RuntimeException();        
        }

	@Override 
        public void enterAffectationGaucheBool(B314Parser.AffectationGaucheBoolContext ctx) {
            String name = ctx.exprG().getChild(0).getText();
            Symbole symbole = CurrentScope.FoundSymbole(name);
            System.out.println(symbole.getName()+" "+symbole.getType()+" "+symbole.getIsArray()+" "+symbole.getIsFunction());
            if((symbole==null) || !(symbole.getType().equals(Type.BOOLEAN.name().toLowerCase())))
                throw new RuntimeException();          
        }

	@Override 
        public void enterAffectationGaucheCase(B314Parser.AffectationGaucheCaseContext ctx) {
            String name = ctx.exprG().getChild(0).getText();
            Symbole symbole = CurrentScope.FoundSymbole(name);
            System.out.println(symbole.getName()+" "+symbole.getType()+" "+symbole.getIsArray()+" "+symbole.getIsFunction());
            if((symbole==null) || !(symbole.getType().equals(Type.SQUARE.toString().toLowerCase())))
                throw new RuntimeException();          
        }
        
	@Override 
        public void enterNextAction(B314Parser.NextActionContext ctx) {
              if(ctx.action().children.isEmpty()) throw new RuntimeException();
        }
        private String GetType(ParserRuleContext ctx){
            String result = null;
            if(ctx instanceof B314Parser.ExprEntContext) result= Type.INTEGER.toString().toLowerCase();
            else if(ctx instanceof B314Parser.ExprGContext){
                Symbole symbole = CurrentScope.FoundSymbole(ctx.getChild(0).getText());
                result= symbole.getType(); 
            }
            return result;
        }
}
