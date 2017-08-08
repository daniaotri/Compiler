 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *and open the template in the editor.
*/

package be.unamur.info.b314.compiler.scope;

import be.unamur.info.b314.compiler.B314BaseListener;
import be.unamur.info.b314.compiler.B314Parser;
import org.antlr.v4.runtime.ParserRuleContext;

 /**
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
        boolean visitExprD;
        int level;
        
        public SymboleTableFiller(Scope x){
            GeneralScope = (ScopeImpl) x;
            CurrentScope = GeneralScope;            
            CurrentIsFonction=false;
            position = 1;
            visitExprD = false;
            level = 0;
        }
        /**
         *
         *  Renvoie le scope general
         */
        public ScopeImpl getScope(){
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

        /**
         *
         *  Clause When
         */
	@Override 
        public void enterClauseWhen(B314Parser.ClauseWhenContext ctx) { 
            String nomScope = "clauseWhen"+position;
            CurrentScope= (ScopeImpl) CurrentScope.WhoIsThisScope(nomScope);
            position = position +1;  
            if(ctx.exprG() != null || ctx.appelDeFonction() != null)
            {
                Scope parent = CurrentScope.getParent();
                Symbole sym= parent.FoundSymbole(ctx.getChild(1).getChild(0).getText());
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

	public void enterIf_Else(B314Parser.IfthenelseContext ctx) {
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
            level = 0;
            checkExpressionGauche(ctx.exprG(),Type.INTEGER.toString().toLowerCase());
            
        }
    @Override
        public void enterAffectationGaucheDroiteBool(B314Parser.AffectationGaucheDroiteBoolContext ctx) {
            level = 0;
            checkExpressionGauche(ctx.exprG(),Type.BOOLEAN.toString().toLowerCase());      
        }
 
        public void enterAffectationGaucheDroiteCase(B314Parser.AffectationGaucheDroiteCaseContext ctx) {
            level = 0;
            checkExpressionGauche(ctx.exprG(),Type.SQUARE.toString().toLowerCase());   
        }

	@Override 
        public void enterAffectationGaucheDroiteGauche(B314Parser.AffectationGaucheDroiteGaucheContext ctx) {            
                Symbole symbole1 = CurrentScope.FoundSymbole(ctx.exprG(0).getChild(0).getText());
                Symbole symbole2 = CurrentScope.FoundSymbole(ctx.exprG(1).getChild(0).getText());                
                CheckTwoType(symbole1.getType(), symbole2.getType());        
        }

	@Override 
        public void enterAffectationGaucheDroiteFonction(B314Parser.AffectationGaucheDroiteFonctionContext ctx) {
            Symbole symbole = CurrentScope.FoundSymbole(ctx.appelDeFonction().getChild(0).getText());
            level = 0;
            checkExpressionGauche(ctx.exprG(),symbole.getType());
        }

        /**
         *
         * les Fonctions
         */
        @Override 
        public void enterAppelDeFonction(B314Parser.AppelDeFonctionContext ctx) {
            visitExprD = true;
            Symbole sym = CurrentScope.FoundSymbole(ctx.ID().getText());
            if (sym.getTheParameters().size()>0)
                    {
                    for(int i = 0; i<sym.getTheParameters().size(); i++)
                    {
                        CurrentSymbole = GetSymboleParm(sym.getName(),sym.getTheParameters().get(i));
                        if(ctx.exprD(i)== null)throw new RuntimeException();
                    }        
                    }
            else if(ctx.exprD(0)!= null) throw new RuntimeException();   
            visitExprD = false;
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
                if(CurrentSymbole.getLength().length==1)
                {
                    if(ctx.getChild(2)==null)throw new RuntimeException();
                    else
                    {
                        CheckTwoType(GetType((ParserRuleContext) ctx.getChild(2)),Type.INTEGER.toString().toLowerCase( ));
                    }
                    if(ctx.getChild(4)!=null)throw new RuntimeException();    
                }
                else
                    {
                    if(ctx.getChild(2)==null || ctx.getChild(4)==null)throw new RuntimeException();
                    }
            }
            else if(ctx.getChild(2)!= null)  throw new RuntimeException();             
        }
    @Override
        public void enterExprGTableauEntEnt(B314Parser.ExprGTableauEntEntContext ctx){            
            CurrentSymbole =choiceTableauExprG(ctx.ID().getText(),ctx.getChild(2)!=null,ctx.getChild(4)!=null );
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
            if(CurrentSymbole.getIsArray())
            {
                if(CurrentSymbole.getLength().length==1)
                {
                    if(ctx.getChild(2)==null)throw new RuntimeException();
                    else CheckTwoType(GetType((ParserRuleContext) ctx.getChild(2)),Type.INTEGER.toString().toLowerCase( ));
                    if(ctx.getChild(4)!=null)throw new RuntimeException();    
                }
                else{
                    if(ctx.getChild(2)==null || ctx.getChild(4)==null)throw new RuntimeException();
                    else{
                        CheckTwoType(GetType((ParserRuleContext) ctx.getChild(2)),Type.INTEGER.toString().toLowerCase( ));
                        CheckTwoType(GetType((ParserRuleContext) ctx.getChild(4)),Type.INTEGER.toString().toLowerCase( ));                    
                    } 
                }
            }
            else if(ctx.getChild(2)!= null) throw new RuntimeException();            
        }
        /**
         *
         * Les expressions de droite
         */
	@Override 
        public void enterExprDInteger(B314Parser.ExprDIntegerContext ctx) {
            if (visitExprD)CheckTwoType(CurrentSymbole.getType(),Type.INTEGER.toString().toLowerCase());
        }
	@Override 
        public void enterExprDBoolean(B314Parser.ExprDBooleanContext ctx) {
            if (visitExprD)CheckTwoType(CurrentSymbole.getType(),Type.BOOLEAN.toString().toLowerCase());        
        }
	@Override 
        public void enterExprDCase(B314Parser.ExprDCaseContext ctx) {
            if (visitExprD)CheckTwoType(CurrentSymbole.getType(),Type.SQUARE.toString().toLowerCase());
        }
	@Override 
        public void enterExprDG(B314Parser.ExprDGContext ctx) {
            if (visitExprD)CheckTwoType(CurrentSymbole.getType(),CurrentScope.FoundSymbole(ctx.getChild(0).getText()).getType());
        }
	@Override 
        public void enterExprDFonction(B314Parser.ExprDFonctionContext ctx) {
            if (visitExprD)CheckTwoType(CurrentSymbole.getType(),CurrentScope.FoundSymbole(ctx.getChild(0).getText()).getType());        
        }        
        /**
         * Les expressions de type case
         */
        @Override 
        public void enterExprCaseNearby(B314Parser.ExprCaseNearbyContext ctx) {
            if(ctx.getChild(2) == null || ctx.getChild(4) == null)throw new RuntimeException();
            else{
                if(ctx.exprG(0)!= null)checkExpressionGauche(ctx.exprG(0),Type.INTEGER.toString().toLowerCase());
                if(ctx.exprG(1)!= null)checkExpressionGauche(ctx.exprG(1),Type.INTEGER.toString().toLowerCase());
                if(ctx.appelDeFonction(0)!= null)CheckTwoType(GetType(ctx.appelDeFonction(0)),Type.INTEGER.toString().toLowerCase( ));
                if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),Type.INTEGER.toString().toLowerCase( ));
            }
        }
        /**
         * Les expressions de type booléenne
         */
	@Override 
        public void enterExprBoolNotGauche(B314Parser.ExprBoolNotGaucheContext ctx) {
            if(ctx.exprG()!= null)checkExpressionGauche(ctx.exprG(),Type.BOOLEAN.toString().toLowerCase());
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.BOOLEAN.toString().toLowerCase( ));
            else throw new RuntimeException();
        }
	@Override 
        public void enterExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx) {
            if(ctx.exprG()!= null)checkExpressionGauche(ctx.exprG(),Type.BOOLEAN.toString().toLowerCase());
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.BOOLEAN.toString().toLowerCase( ));    
            else throw new RuntimeException();
        }
	@Override 
        public void enterExprBoolEgaleBoolGauche(B314Parser.ExprBoolEgaleBoolGaucheContext ctx) {
            if(ctx.exprG()!= null)checkExpressionGauche(ctx.exprG(),Type.BOOLEAN.toString().toLowerCase());
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.BOOLEAN.toString().toLowerCase( ));
            else throw new RuntimeException();
        }
    @Override
        public void enterExprBoolEgaleGEnt(B314Parser.ExprBoolEgaleGEntContext ctx) {
            if(ctx.exprG() == null){
                CheckTwoType(GetType(ctx.appelDeFonction()),Type.INTEGER.toString().toLowerCase());
            }
            else{
                checkExpressionGauche(ctx.exprG(),Type.INTEGER.toString().toLowerCase());
            }
        }
    @Override
        public void enterExprBoolEgaleGCase(B314Parser.ExprBoolEgaleGCaseContext ctx) { 
           if(ctx.exprG() == null){
                CheckTwoType(GetType(ctx.appelDeFonction()),Type.SQUARE.toString().toLowerCase());
            }
            else{
                checkExpressionGauche(ctx.exprG(),Type.SQUARE.toString().toLowerCase());
            }        
        }
    @Override
        public void enterExprBoolEgaleEntG(B314Parser.ExprBoolEgaleEntGContext ctx) {
           if(ctx.exprG() == null)
           {
                CheckTwoType(GetType(ctx.appelDeFonction()),Type.INTEGER.toString().toLowerCase());
           }
            else{
                checkExpressionGauche(ctx.exprG(),Type.INTEGER.toString().toLowerCase());
            }            
        }
    @Override
        public void enterExprBoolEgaleCaseG(B314Parser.ExprBoolEgaleCaseGContext ctx) {
           if(ctx.exprG() == null){
                CheckTwoType(GetType(ctx.appelDeFonction()),Type.SQUARE.toString().toLowerCase());
            }
            else{
                checkExpressionGauche(ctx.exprG(),Type.SQUARE.toString().toLowerCase());
            }        
        }
    @Override
        public void enterExprBoolEgaleGG(B314Parser.ExprBoolEgaleGGContext ctx) { 
            CheckTwoType(GetType((ParserRuleContext)ctx.getChild(0)), GetType((ParserRuleContext)ctx.getChild(2)));
        }
	@Override 
        public void enterExprBoolAndOrGaucheBool(B314Parser.ExprBoolAndOrGaucheBoolContext ctx) {
            level = 0;                        
            if(ctx.exprG()!= null)checkExpressionGauche(ctx.exprG(),Type.BOOLEAN.toString().toLowerCase());
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.BOOLEAN.toString().toLowerCase( ));                     
        }
	@Override 
        public void enterExprBoolEgaleGaucheBool(B314Parser.ExprBoolEgaleGaucheBoolContext ctx) {
            if(ctx.exprG()!= null)checkExpressionGauche(ctx.exprG(),Type.BOOLEAN.toString().toLowerCase());
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.BOOLEAN.toString().toLowerCase( ));                    
        }

	@Override 
        public void enterExprBoolAndOrGaucheGauche(B314Parser.ExprBoolAndOrGaucheGaucheContext ctx) {
            if(ctx.exprG(0)!= null)checkExpressionGauche(ctx.exprG(0),Type.BOOLEAN.toString().toLowerCase());
            else if(ctx.appelDeFonction(0)!= null)CheckTwoType(GetType(ctx.appelDeFonction(0)),Type.BOOLEAN.toString().toLowerCase( ));
            if(ctx.exprG(1)!= null)checkExpressionGauche(ctx.exprG(1),Type.BOOLEAN.toString().toLowerCase());
            else if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),Type.BOOLEAN.toString().toLowerCase( ));
        }

	@Override 
        public void enterExprBoolInfSupEnt(B314Parser.ExprBoolInfSupEntContext ctx) {
            if(ctx.exprEnt(0)!= null)CheckTwoType(GetType(ctx.exprEnt(0)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.exprEnt(1)!= null)CheckTwoType(GetType(ctx.exprEnt(1)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.exprG(0)!= null)checkExpressionGauche(ctx.exprG(0),Type.INTEGER.toString().toLowerCase());
            if(ctx.exprG(1)!= null)checkExpressionGauche(ctx.exprG(0),Type.INTEGER.toString().toLowerCase());
            if(ctx.appelDeFonction(0)!= null)CheckTwoType(GetType(ctx.appelDeFonction(0)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),Type.INTEGER.toString().toLowerCase( ));                   
        }
        /**
         * Les expressions de type entière
         */
	@Override 
        public void enterExprEntPlusMoinsGauheEnt(B314Parser.ExprEntPlusMoinsGauheEntContext ctx) {
            if(ctx.exprG()!= null)checkExpressionGauche(ctx.exprG(),Type.INTEGER.toString().toLowerCase());
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.INTEGER.toString().toLowerCase( ));        
        }

	@Override 
        public void enterExprEntMulDivEntGauhe(B314Parser.ExprEntMulDivEntGauheContext ctx) {
            if(ctx.exprG()!= null)checkExpressionGauche(ctx.exprG(),Type.INTEGER.toString().toLowerCase());
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.INTEGER.toString().toLowerCase( ));        
        }

	@Override 
        public void enterExprEntMulDivGaucheGauhe(B314Parser.ExprEntMulDivGaucheGauheContext ctx) {
            if(ctx.exprG(0)!= null)checkExpressionGauche(ctx.exprG(0),Type.INTEGER.toString().toLowerCase());
            if(ctx.exprG(1)!= null)checkExpressionGauche(ctx.exprG(1),Type.INTEGER.toString().toLowerCase());
            if(ctx.appelDeFonction(0)!= null)CheckTwoType(GetType(ctx.appelDeFonction(0)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),Type.INTEGER.toString().toLowerCase( ));         
        }

	@Override 
        public void enterExprEntMulDivGauheEnt(B314Parser.ExprEntMulDivGauheEntContext ctx) {
            if(ctx.exprG()!= null)checkExpressionGauche(ctx.exprG(),Type.INTEGER.toString().toLowerCase());
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.INTEGER.toString().toLowerCase( ));        
        }
	@Override 
        public void enterExprEntPlusMoinsEntGauhe(B314Parser.ExprEntPlusMoinsEntGauheContext ctx) {
            if(ctx.exprG()!= null)checkExpressionGauche(ctx.exprG(),Type.INTEGER.toString().toLowerCase());
            else if(ctx.appelDeFonction()!= null)CheckTwoType(GetType(ctx.appelDeFonction()),Type.INTEGER.toString().toLowerCase( ));        
        }
	@Override 
        public void enterExprEntPlusMoinsGaucheGauhe(B314Parser.ExprEntPlusMoinsGaucheGauheContext ctx) {
            if(ctx.exprG(0)!= null)checkExpressionGauche(ctx.exprG(0),Type.INTEGER.toString().toLowerCase());
            if(ctx.exprG(1)!= null)checkExpressionGauche(ctx.exprG(1),Type.INTEGER.toString().toLowerCase());
            if(ctx.appelDeFonction(0)!= null)CheckTwoType(GetType(ctx.appelDeFonction(0)),Type.INTEGER.toString().toLowerCase( ));
            if(ctx.appelDeFonction(1)!= null)CheckTwoType(GetType(ctx.appelDeFonction(1)),Type.INTEGER.toString().toLowerCase( ));         
        }      
        /**
         *the privates methodes
         */
        private Symbole GetSymboleParm(String nameFct, String nameParam){
            Scope parent = CurrentScope.getParent();
            Scope scopefct = parent.WhoIsThisScope(nameFct);
            Symbole sym = scopefct.FoundSymbole(nameParam);
            return sym;           
        }

        private String GetType(ParserRuleContext ctx){
            String result = null;
            if(ctx instanceof B314Parser.ExprEntContext) result= Type.INTEGER.toString().toLowerCase();
            
            if(ctx instanceof B314Parser.ExprGContext || ctx instanceof B314Parser.AppelDeFonctionContext){
                Symbole symbole = CurrentScope.FoundSymbole(ctx.getChild(0).getText());
                result= symbole.getType(); 
            }
            if(ctx instanceof B314Parser.ExprBoolContext)result= Type.BOOLEAN.toString().toLowerCase();
            if(ctx instanceof B314Parser.ExprCaseContext)result= Type.SQUARE.toString().toLowerCase();
            return result;
        }

        private void CheckTwoType(String type1, String type2)
        {
            if(!type1.equals(type2)) throw new RuntimeException();
        }
        
        private void checkExpressionGauche(B314Parser.ExprGContext ctx,String type){
            level = 0;
            Symbole symbole = CurrentScope.FoundSymbole(ctx.getChild(0).getText());
                Scope scope = CurrentScope.getParent();
                Symbole symglobal = null;
                if(scope != null){
                    symglobal = scope.FoundSymbole(symbole.getName());
                    if(symglobal != null){
                        if(symglobal.equals(symbole))level = 1;
                        else level = 2;
                    }else level = 1;
                }else level = 1;
                if (level == 1) {
                    CurrentSymbole = symbole;
                    CheckTwoType(CurrentSymbole.getType(), type);
                }
                else {
                    int i = 0;
                    if(symbole.getType().equals(type)){
                        i++;
                        CurrentSymbole = symbole;
                    }
                    if(symglobal.getType().equals(type)){
                        i++;
                        CurrentSymbole = symglobal;
                    }
                    if(i==0) throw new RuntimeException();
                }
        }

        private Symbole choiceTableauExprG(String name,boolean one,boolean two){
                Symbole symbole = CurrentScope.FoundSymbole(name);
                Scope scope = CurrentScope.getParent();
                Symbole symglobal = null;
                if(scope != null)
                {
                    symglobal = scope.FoundSymbole(symbole.getName());
                    if(symglobal != null){
                        if(symglobal.equals(symbole))level = 1;
                        else level = 2;
                    }else level = 1;
                }else level = 1;
                if (level == 1) {
                    CurrentSymbole = symbole;
                }
                else {
                    int i = 0;
                    int j = 0;                
                    if(symbole.getIsArray())i++;
                    if(symglobal.getIsArray())j++;
                    if(i==0 && j == 0) throw new RuntimeException();
                    if(i==1 && j == 1){
                        int tailleSymboleLocale = symbole.getLength().length;
                        int tailleSymboleGlobale = symglobal.getLength().length;
                        int x = chooseOne(tailleSymboleLocale, tailleSymboleGlobale, one, two);
                        if(tailleSymboleLocale==x)CurrentSymbole= symbole;
                        else CurrentSymbole= symglobal;
                        
                    }
                    if(i==1) CurrentSymbole= symbole;
                    if(j==1) CurrentSymbole= symglobal;                    
                } 
            return CurrentSymbole;
    }

        private int chooseOne(int i,int j, boolean a, boolean b){
        if(a && b)
        {
            if(i == 2) return i;
            else if(j==2) return j;
            else throw new RuntimeException();
        }
        else
        {
            if(i == 1) return i;
            else if(j== 1) return j;
            else throw  new RuntimeException();
        }
    }
}
