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
            MustBeBoolean(ctx.exprD());
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
            MustBeBoolean(ctx.exprD());
        }

	@Override 
        public void enterIfthenelse(B314Parser.IfthenelseContext ctx) {
            MustBeBoolean(ctx.exprD());
        }

	@Override
        public void enterWhile(B314Parser.WhileContext ctx) {
            MustBeBoolean(ctx.exprD());
        }

	@Override 
        public void enterAffectationGaucheDroite(B314Parser.AffectationGaucheDroiteContext ctx) {
                Symbole symbole = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText());
                System.out.println(symbole.getName()+" "+ symbole.getType());
                String type = symbole.getType();  
                CheckTypeDroite(ctx.exprD(),type);                          
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
        public void enterExprGTableau(B314Parser.ExprGTableauContext ctx) { 
            CurrentSymbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            //if(CurrentSymbole == null)throw new RuntimeException();
            if(CurrentSymbole.getIsArray()){
                VerifyArrayLength(ctx);
                if(CurrentSymbole.getLength().length==1){
                    if(ctx.getChild(2)==null)throw new RuntimeException();
                    else MustBeInteger(ctx.exprD(0));
                    if(ctx.getChild(4)!= null)throw new RuntimeException();    
                }
                else{
                    if(ctx.getChild(2)==null || ctx.getChild(4)==null)throw new RuntimeException();
                    else{
                        MustBeInteger(ctx.exprD(0));
                        MustBeInteger(ctx.exprD(1));
                    }} 
            }
            else if((ctx.getChild(2)!= null)) throw new RuntimeException();        
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
        }
	@Override 
        public void enterExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx) {
            if(ctx.exprG()!= null)CheckTwoType(GetType(ctx.exprG()),Type.BOOLEAN.toString().toLowerCase( ));
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.BOOLEAN.toString().toLowerCase( ));            
        }
	@Override 
        public void enterExprBoolEgaleBoolGauche(B314Parser.ExprBoolEgaleBoolGaucheContext ctx) {
            if(ctx.exprG()!= null)CheckTwoType(GetType(ctx.exprG()),Type.BOOLEAN.toString().toLowerCase( ));
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.BOOLEAN.toString().toLowerCase( ));        
        }
	@Override 
        public void enterExprBoolEgaleOther(B314Parser.ExprBoolEgaleOtherContext ctx) {
            if(ctx.exprCase(0)!= null){
                if(ctx.exprEnt(1)!= null) throw new RuntimeException();
                else if(ctx.exprG(1)!= null)CheckTwoType(GetType(ctx.exprG(1)),Type.SQUARE.toString().toLowerCase( ));
                else if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),Type.SQUARE.toString().toLowerCase( ));
            }
            else if(ctx.exprEnt(0)!= null){
                if(ctx.exprCase(1)!= null) throw new RuntimeException();
                else if(ctx.exprG(1)!= null)CheckTwoType(GetType(ctx.exprG(1)),Type.INTEGER.toString().toLowerCase( ));
                else if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),Type.INTEGER.toString().toLowerCase( ));            
            }
            else if(ctx.exprG(0)!= null){
                if(ctx.exprEnt(1)!= null) CheckTwoType(GetType(ctx.exprG(0)),Type.INTEGER.toString().toLowerCase());
                else if (ctx.exprCase(1)!= null)CheckTwoType(GetType(ctx.exprG(0)),Type.SQUARE.toString().toLowerCase( ));
                else if(ctx.exprG(1)!= null)CheckTwoType(GetType(ctx.exprG(1)),GetType(ctx.exprG(0)));
                else if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),GetType(ctx.exprG(0)));                            
            }
            else if(ctx.appelDeFonction(0)!= null){
                if(ctx.exprEnt(1)!= null) CheckTwoType(GetType(ctx.exprG(0)),Type.INTEGER.toString().toLowerCase());
                else if (ctx.exprCase(1)!= null)CheckTwoType(GetType(ctx.exprG(0)),Type.SQUARE.toString().toLowerCase( ));
                else if(ctx.exprG(1)!= null)CheckTwoType(GetType(ctx.exprG(1)),GetType(ctx.appelDeFonction(0)));
                else if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),GetType(ctx.appelDeFonction(0)));              
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
            else if(ctx.exprG(1)!= null)CheckTwoType(GetType(ctx.exprG(1)),Type.BOOLEAN.toString().toLowerCase( ));
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
        private void MustBeBoolean(ParserRuleContext ctx){
            if(ctx.getChild(0) instanceof B314Parser.ExprDCaseContext || ctx.getChild(0) instanceof B314Parser.ExprDIntegerContext
                    ) throw new RuntimeException();
            else if(ctx.getChild(0) instanceof B314Parser.ExprDFonctionContext || ctx.getChild(0) instanceof B314Parser.ExprDGContext){
                    Symbole sym = CurrentScope.FoundSymbole(ctx.getChild(0).getChild(0).getText());
                    if(sym.getType() != Type.BOOLEAN.toString().toLowerCase()) throw new RuntimeException();
            }
            else if(ctx.getChild(1).getChild(1) instanceof B314Parser.ExprFonctionParenntheseContext){
                    Symbole sym = CurrentScope.FoundSymbole(ctx.getChild(1).getChild(0).getText());
                    if(sym.getType() != Type.BOOLEAN.toString().toLowerCase()) throw new RuntimeException();
            }            
        }
        private void MustBeInteger(ParserRuleContext ctx){
            if(ctx.getChild(0) instanceof B314Parser.ExprDCaseContext || ctx.getChild(0) instanceof B314Parser.ExprBoolContext
                    ) throw new RuntimeException();
            else if(ctx.getChild(0) instanceof B314Parser.ExprDFonctionContext || ctx.getChild(0) instanceof B314Parser.ExprDGContext){
                    Symbole sym = CurrentScope.FoundSymbole(ctx.getChild(0).getChild(0).getText());
                    if(sym.getType() != Type.INTEGER.toString().toLowerCase()) throw new RuntimeException();
            }
            else if(ctx.getChild(1) instanceof B314Parser.ExprFonctionParenntheseContext){
                    Symbole sym = CurrentScope.FoundSymbole(ctx.getChild(1).getChild(0).getText());
                    if(sym.getType() != Type.INTEGER.toString().toLowerCase()) throw new RuntimeException();
            }             
        }
       
        private String GetTypeParmInFonction(String nameFct, String nameParam){
            Scope parent = CurrentScope.getParent();
            Scope scopefct = parent.WhoIsThisScope(nameFct);
            Symbole sym = scopefct.FoundSymbole(nameParam);
            return sym.getType();            
        }

        private void CheckTypeDroite(ParserRuleContext ctx,String type ){
                if(ctx.getChild(0) instanceof B314Parser.ExprDBooleanContext){
                    if(!Type.BOOLEAN.toString().toLowerCase().equals(type))throw new RuntimeException();
                    }
                else if(ctx.getChild(0) instanceof B314Parser.ExprDCaseContext){
                        if(!Type.SQUARE.toString().toLowerCase().equals(type))throw new RuntimeException();
                    }
                else if(ctx.getChild(0) instanceof B314Parser.ExprDIntegerContext){
                        if(!Type.INTEGER.toString().toLowerCase().equals(type))throw new RuntimeException();
                    }
                else if(ctx.getChild(0) instanceof B314Parser.ExprDFonctionContext || ctx.getChild(0) instanceof B314Parser.ExprDGContext){
                        Symbole sym = CurrentScope.FoundSymbole(ctx.getChild(0).getChild(0).getText());
                        if(!sym.getType().equals(type)) throw new RuntimeException();                    
                    }
                else if(ctx.getChild(1) instanceof B314Parser.ExprFonctionParenntheseContext){
                        Symbole sym = CurrentScope.FoundSymbole(ctx.getChild(1).getChild(0).getText());
                        if(!sym.getType().equals(type)) throw new RuntimeException();
                    }                 
                }            
        private void VerifyArrayLength(B314Parser.ExprGTableauContext ctx){
                Symbole sym = CurrentScope.FoundSymbole(ctx.getChild(0).getText());
                if(sym.getIsArray()){
                    int taille = sym.getLength().length;
                    boolean EstEntier = false;
                    if(taille == 1)MustBeInteger(ctx.exprD(0));
                    else if(taille == 2){
                        MustBeInteger(ctx.exprD(0));
                        MustBeInteger(ctx.exprD(1));
                    }}
               
        }
        private String GetType(ParserRuleContext ctx){
            String result = null;
            if(ctx instanceof B314Parser.ExprEntContext) result= Type.INTEGER.toString().toLowerCase();
            else if(ctx instanceof B314Parser.ExprGContext || ctx instanceof B314Parser.AppelDeFonctionContext){
                Symbole symbole = CurrentScope.FoundSymbole(ctx.getChild(0).getText());
                result= symbole.getType(); 
               
            }
            else if(ctx instanceof B314Parser.ExprBoolContext)result= Type.BOOLEAN.toString().toLowerCase();
            else if(ctx instanceof B314Parser.ExprCaseContext)result= Type.SQUARE.toString().toLowerCase();
            return result;
        }
        private void CheckTwoType(String type1, String type2){
            if(!type1.equals(type2)) throw new RuntimeException();
        }
        
}
