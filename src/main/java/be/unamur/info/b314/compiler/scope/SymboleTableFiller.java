 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *and open the template in the editor.
*/

package be.unamur.info.b314.compiler.scope;

import be.unamur.info.b314.compiler.B314BaseListener;
import be.unamur.info.b314.compiler.B314Parser;
import org.antlr.v4.runtime.ParserRuleContext;

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

        /**
         *
         *  Constructeur
         */
        public SymboleTableFiller() {
            GeneralScope = new ScopeImpl("Programme");
            CurrentScope = GeneralScope;
            CurrentIsFonction=false;
            position=1;
            //CurrentSymbole=null;
        }
        /**
         *
         *  Renvoie le scope general
         */
        public ScopeImpl getScope(){
            GeneralScope.deleteDuplicateSymbole();
            return GeneralScope;
        }
        /**
         *
         *  Debut du programme
         */
	@Override 
        public void enterProgramme(B314Parser.ProgrammeContext ctx) {
            GeneralScope= new ScopeImpl("Programme");            
        }
        /**
         *
         *  Définition des fonctions
         */
	@Override 
        public void enterFctDecl(B314Parser.FctDeclContext ctx) {
            CurrentIsFonction = true;
            CurrentSymbole = new Symbole(ctx.ID().getText());
            CurrentSymbole.setIsFunction(true);
            CurrentScope.AddSymbole(CurrentSymbole); // on ajoute le symbole fonction dans le scope parent
            CurrentScope = new ScopeImpl(ctx.ID().getText(),CurrentScope); //on change de scope
            CurrentScope.AddSymbole(CurrentSymbole);   //on l'ajoute dans son propre scope  
            
           /* CurrentScope.AddSymbole(new Symbole("latitude",Type.INTEGER.toString()));
            CurrentScope.AddSymbole(new Symbole("longitude",Type.INTEGER.toString()));
            CurrentScope.AddSymbole(new Symbole("grid size",Type.INTEGER.toString()));
            CurrentScope.AddSymbole(new Symbole("map count",Type.INTEGER.toString()));
            CurrentScope.AddSymbole(new Symbole("ammo count",Type.INTEGER.toString()));
            CurrentScope.AddSymbole(new Symbole("soda count",Type.INTEGER.toString()));
            CurrentScope.AddSymbole(new Symbole("radio count",Type.INTEGER.toString()));
            CurrentScope.AddSymbole(new Symbole("fruits count",Type.INTEGER.toString()));
            CurrentScope.AddSymbole(new Symbole("life",Type.INTEGER.toString()));
            CurrentScope.AddSymbole(new Symbole("true",Type.BOOLEAN.toString()));
            CurrentScope.AddSymbole(new Symbole("false",Type.BOOLEAN.toString()));
            CurrentScope.AddSymbole(new Symbole("ennemi is north",Type.BOOLEAN.toString()));
            CurrentScope.AddSymbole(new Symbole("ennemi is south",Type.BOOLEAN.toString()));
            CurrentScope.AddSymbole(new Symbole("ennemi is east",Type.BOOLEAN.toString()));
            CurrentScope.AddSymbole(new Symbole("ennemi is west",Type.BOOLEAN.toString()));
            CurrentScope.AddSymbole(new Symbole("graal is north",Type.BOOLEAN.toString()));
            CurrentScope.AddSymbole(new Symbole("graal is south",Type.BOOLEAN.toString()));
            CurrentScope.AddSymbole(new Symbole("graal is east",Type.BOOLEAN.toString()));
            CurrentScope.AddSymbole(new Symbole("graal is west",Type.BOOLEAN.toString()));
            CurrentScope.AddSymbole(new Symbole("dirt",Type.SQUARE.toString()));
            CurrentScope.AddSymbole(new Symbole("rock",Type.SQUARE.toString()));
            CurrentScope.AddSymbole(new Symbole("vines",Type.SQUARE.toString()));
            CurrentScope.AddSymbole(new Symbole("zombie",Type.SQUARE.toString()));
            CurrentScope.AddSymbole(new Symbole("player",Type.SQUARE.toString()));
            CurrentScope.AddSymbole(new Symbole("ennemi",Type.SQUARE.toString()));
            CurrentScope.AddSymbole(new Symbole("map",Type.SQUARE.toString()));
            CurrentScope.AddSymbole(new Symbole("radio",Type.SQUARE.toString()));
            CurrentScope.AddSymbole(new Symbole("ammo",Type.SQUARE.toString()));
            CurrentScope.AddSymbole(new Symbole("fruits",Type.SQUARE.toString()));
            CurrentScope.AddSymbole(new Symbole("soda",Type.SQUARE.toString()));
               */         
        }

	@Override 
        public void exitFctDecl(B314Parser.FctDeclContext ctx) {
            CurrentIsFonction = false;
            CurrentScope = (ScopeImpl) CurrentScope.getParent();
        }

	@Override 
        public void exitFctTypeVoid(B314Parser.FctTypeVoidContext ctx) {
            if(CurrentIsFonction){
                CurrentIsFonction = false;
                CurrentSymbole.setType(ctx.VOID().getText());
            }
            else throw new RuntimeException();
        }

	@Override 
        public void enterParamDecl(B314Parser.ParamDeclContext ctx) {
            CurrentIsFonction = false;
        }

	@Override 
        public void exitParamDecl(B314Parser.ParamDeclContext ctx) { 
            CurrentIsFonction = true;
        }
        /**
         *
         *  Clause When
         */
	@Override 
        public void enterClauseWhen(B314Parser.ClauseWhenContext ctx) { 
            String nomScope = "clauseWhen"+position;
            CurrentScope = new ScopeImpl(nomScope,CurrentScope);
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
            CurrentScope = new ScopeImpl("clauseDefault",CurrentScope);
        }

	@Override 
        public void exitClauseDefault(B314Parser.ClauseDefaultContext ctx) {
            CurrentScope = (ScopeImpl) CurrentScope.getParent();
        }
        /**
         *
         *  Declaration des variables
         */
	@Override 
        public void enterVarDecl(B314Parser.VarDeclContext ctx) {
            CurrentSymbole = new Symbole(ctx.ID().getText());
        }

	@Override 
        public void exitVarDecl(B314Parser.VarDeclContext ctx){
            if(CurrentSymbole.getType() == null) throw new RuntimeException();
            Symbole symbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            if(symbole!= null)throw new RuntimeException();
            else CurrentScope.AddSymbole(CurrentSymbole);
        }
        /**
         *
         *  type Scalar
         */
	@Override 
        public void exitTypeScalar(B314Parser.TypeScalarContext ctx) {
            if(CurrentIsFonction)CurrentIsFonction=false;
        }
	@Override 
        public void enterScalarBoolean(B314Parser.ScalarBooleanContext ctx) {
            CurrentSymbole.setType(ctx.BOOLEAN().getText());
        }
	@Override 
        public void enterScalarInteger(B314Parser.ScalarIntegerContext ctx) { 
            CurrentSymbole.setType(ctx.INTEGER().getText());
        }
	@Override 
        public void enterScalarSquare(B314Parser.ScalarSquareContext ctx) { 
            CurrentSymbole.setType(ctx.SQUARE().getText());
        }
        /**
         *
         *  type tableau
         */        
	@Override 
        public void enterArray(B314Parser.ArrayContext ctx) {
            if(ctx.taille1==null && ctx.taille2==null)throw new RuntimeException();
            else if (ctx.taille1 !=null){
                int i = Integer.parseInt(ctx.taille1.getText());
                if(ctx.taille2!=null){
                    int j = Integer.parseInt(ctx.taille2.getText());
                    CurrentSymbole.setLength(new int []{i,j});
                }
                CurrentSymbole.setLength(new int []{i});
            }
            CurrentSymbole.setType(ctx.scalar().getChild(0).getText());
        }

	@Override 
        public void exitArray(B314Parser.ArrayContext ctx) {
            if(CurrentIsFonction)CurrentIsFonction=false;           
        }
        /**
         *
         *  les expressions entières
         */
	@Override 
        public void enterExprEntFonction(B314Parser.ExprEntFonctionContext ctx) { 
            Symbole symbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            if(symbole.getType()!=Type.INTEGER.toString())throw new RuntimeException();        
        }
	@Override 
        public void enterExprEntMulDivEntGauhe(B314Parser.ExprEntMulDivEntGauheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.INTEGER.toString())throw new RuntimeException();          
        }

	@Override 
        public void enterExprEntMulDivGaucheGauhe(B314Parser.ExprEntMulDivGaucheGauheContext ctx) { 
            String type1 = CurrentScope.FoundSymbole(ctx.expr3.getChild(0).getText()).getType();
            String type2 = CurrentScope.FoundSymbole(ctx.expr4.getChild(0).getText()).getType();
           if(type1!=Type.INTEGER.toString()||type2!=Type.INTEGER.toString())throw new RuntimeException();          
        }

	@Override 
        public void enterExprEntMulDivGauheEnt(B314Parser.ExprEntMulDivGauheEntContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.INTEGER.toString())throw new RuntimeException();          
        }

        @Override 
        public void enterExprEntPlusMoinsEntGauhe(B314Parser.ExprEntPlusMoinsEntGauheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.INTEGER.toString())throw new RuntimeException();              
        }
	@Override 
        public void enterExprEntPlusMoinsGaucheGauhe(B314Parser.ExprEntPlusMoinsGaucheGauheContext ctx) { 
            String type1 = CurrentScope.FoundSymbole(ctx.expr3.getChild(0).getText()).getType();
            String type2 = CurrentScope.FoundSymbole(ctx.expr4.getChild(0).getText()).getType();
           if(type1!=Type.INTEGER.toString()||type2!=Type.INTEGER.toString())throw new RuntimeException();          
        }	
        @Override 
        public void enterExprEntPlusMoinsGauheEnt(B314Parser.ExprEntPlusMoinsGauheEntContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.INTEGER.toString())throw new RuntimeException();          
        }     
        /**
         *
         *  les expressions booleénnes
         */        
	@Override 
        public void enterExprBoolFonction(B314Parser.ExprBoolFonctionContext ctx) {
            Symbole symbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            if(symbole.getType()!=Type.BOOLEAN.toString())throw new RuntimeException();
        }
        
        @Override 
        public void enterExprBoolEgaleGaucheGauche(B314Parser.ExprBoolEgaleGaucheGaucheContext ctx) { 
            String type1 = CurrentScope.FoundSymbole(ctx.expr3.getChild(0).getText()).getType();
            String type2 = CurrentScope.FoundSymbole(ctx.expr4.getChild(0).getText()).getType();
           if(type1!=type2)throw new RuntimeException();        
        }

        @Override 
        public void enterExprBoolEgaleGaucheEnt(B314Parser.ExprBoolEgaleGaucheEntContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.INTEGER.toString())throw new RuntimeException();
        }

	@Override 
        public void enterExprBoolEgaleGaucheCase(B314Parser.ExprBoolEgaleGaucheCaseContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.SQUARE.toString())throw new RuntimeException();        
        }

	@Override 
        public void enterExprBoolEgaleGaucheBool(B314Parser.ExprBoolEgaleGaucheBoolContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.BOOLEAN.toString())throw new RuntimeException();         
        }

	@Override 
        public void enterExprBoolEgaleEntGauche(B314Parser.ExprBoolEgaleEntGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.INTEGER.toString())throw new RuntimeException();        
        }

	@Override 
        public void enterExprBoolEgaleBoolGauche(B314Parser.ExprBoolEgaleBoolGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.BOOLEAN.toString())throw new RuntimeException();         
        }

        @Override 
        public void enterExprBoolEgaleCaseGauche(B314Parser.ExprBoolEgaleCaseGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.SQUARE.toString())throw new RuntimeException();         
        }

	@Override 
        public void enterExprBoolNotGauche(B314Parser.ExprBoolNotGaucheContext ctx) { 
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.BOOLEAN.toString())throw new RuntimeException();            
        }

        @Override 
        public void enterExprBoolAndOrGaucheGauche(B314Parser.ExprBoolAndOrGaucheGaucheContext ctx) {
            String type1 = CurrentScope.FoundSymbole(ctx.expr5.getChild(0).getText()).getType();
            String type2 = CurrentScope.FoundSymbole(ctx.expr6.getChild(0).getText()).getType();
           if(type1!=Type.BOOLEAN.toString() || type2!= Type.BOOLEAN.toString())throw new RuntimeException();        
        }

        @Override 
        public void enterExprBoolAndOrGaucheBool(B314Parser.ExprBoolAndOrGaucheBoolContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
           if(type!=Type.BOOLEAN.toString())throw new RuntimeException();        
        }

        @Override 
        public void enterExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
           if(type!=Type.BOOLEAN.toString())throw new RuntimeException();          
        }

	@Override 
        public void exitExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
           if(type!=Type.BOOLEAN.toString())throw new RuntimeException();          
        }
        
        @Override 
        public void enterExprBoolInfSupGG(B314Parser.ExprBoolInfSupGGContext ctx) { 
              if(ctx.expr1 == null || ctx.expr2 == null)throw new RuntimeException();
              else{
                Symbole symbole1 = CurrentScope.FoundSymbole(ctx.expr1.getChild(0).getText());
                Symbole symbole2 = CurrentScope.FoundSymbole(ctx.expr2.getChild(0).getText()); 
                String type1=symbole1.getType();
                String type2= symbole2.getType();
                if(type1!=Type.INTEGER.toString()||type2!=Type.INTEGER.toString())throw new RuntimeException();
              }
              
        }

	@Override 
        public void enterExprBoolInfSupGEnt(B314Parser.ExprBoolInfSupGEntContext ctx) { 
              if(ctx.expr1 == null)throw new RuntimeException();
              else{
                Symbole symbole1 = CurrentScope.FoundSymbole(ctx.expr1.getChild(0).getText());
                String type1=symbole1.getType();
                if(type1!=Type.INTEGER.toString())throw new RuntimeException();
              }        
        }

	@Override 
        public void enterExprBoolInfSupEntGauche(B314Parser.ExprBoolInfSupEntGaucheContext ctx) {
              if(ctx.expr2 == null)throw new RuntimeException();
              else{
                Symbole symbole2 = CurrentScope.FoundSymbole(ctx.expr2.getChild(0).getText()); 
                String type2= symbole2.getType();
                if(type2!=Type.INTEGER.toString())throw new RuntimeException();
              }        
        }      
        /**
         *
         *  les expressions squares
         */
	@Override 
        public void enterExprCaseFonction(B314Parser.ExprCaseFonctionContext ctx) { 
            Symbole symbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            if(symbole.getType()!=Type.SQUARE.toString())throw new RuntimeException();             
        }
	@Override 
        public void enterExprCaseNearbyEntG(B314Parser.ExprCaseNearbyEntGContext ctx) {
            if(ctx.exprG()==null)throw new RuntimeException();
            else {
                String type1 = GetType((ParserRuleContext) ctx.exprG().getChild(0));
                if(type1!=Type.INTEGER.toString())throw new RuntimeException();
            }         
        }
	@Override 
        public void enterExprCaseNearbyGEnt(B314Parser.ExprCaseNearbyGEntContext ctx) {
            if(ctx.exprG()==null)throw new RuntimeException();
            else {
                String type1 = GetType((ParserRuleContext) ctx.exprG().getChild(0));
                if(type1!=Type.INTEGER.toString())throw new RuntimeException();
            }         
        }
	@Override 
        public void enterExprCaseNearbyGG(B314Parser.ExprCaseNearbyGGContext ctx) {
            if(ctx.taille1==null || ctx.taille2==null)throw new RuntimeException();
            else {
                String type1 = GetType((ParserRuleContext) ctx.taille1.getChild(0));
                String type2 = GetType((ParserRuleContext) ctx.taille2.getChild(0));
                CheckType(type1,type2,Type.INTEGER.toString());
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
            if(CurrentSymbole == null)throw new RuntimeException();
            if(CurrentSymbole.getIsArray()){
                if(CurrentSymbole.getLength().length==1){
                    if(ctx.taille1==null || ctx.taille2!=null)throw new RuntimeException();
                    else if (GetType(ctx.taille1)!=Type.INTEGER.toString())throw new RuntimeException();
                }
                else{
                    if(ctx.taille1==null || ctx.taille2==null)throw new RuntimeException();
                    else if(GetType(ctx.taille1)!=Type.INTEGER.toString() ||GetType(ctx.taille2)!=Type.INTEGER.toString() )throw new RuntimeException();
                }
            }
            else throw new RuntimeException();
        }
        /***
         * Les instructions
         */
	@Override 
        public void enterAffectation(B314Parser.AffectationContext ctx) { 
            String name = ctx.exprG().getChild(0).getText();
            Symbole symbole = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText());
            if(symbole!=null){
                CheckType(symbole.getType(),null,GetType(ctx.exprD()));
            }
            //voir nouvelle version si jamais
            
        }
	@Override 
        public void enterNextAction(B314Parser.NextActionContext ctx) {
              if(ctx.action().children.isEmpty()) throw new RuntimeException();
        }
        
        /**
         *
         * Les méthodes privates
         */
        private String GetType(ParserRuleContext ctx){
            //if(ctx == null) throw new RuntimeException();
            if(ctx instanceof B314Parser.ExprEntContext) return Type.INTEGER.toString();
            else if (ctx instanceof B314Parser.ExprBoolContext) return Type.BOOLEAN.toString();
            else if (ctx instanceof B314Parser.ExprCaseContext) return Type.SQUARE.toString();
            else if(ctx instanceof B314Parser.ExprGContext){
                Symbole sym = CurrentScope.FoundSymbole(ctx.getChild(0).getText());
                return sym.getType();
            }            
            else throw new RuntimeException();
        }
        private void CheckType(String givenType1,String givenType2,String expectedType){
            if(givenType2==null){
                if(givenType1!=expectedType)throw new RuntimeException();
            }
            else {
                if((givenType1!=expectedType)||(givenType2!=expectedType) )throw new RuntimeException();
            }            
        }
}
