 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *and open the template in the editor.
*/

package be.unamur.info.b314.compiler.scope;

import be.unamur.info.b314.compiler.B314BaseListener;
import be.unamur.info.b314.compiler.B314Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

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

        //le constructeur qui permet d'initialiser le scope general
        public SymboleTableFiller() {
            GeneralScope = new ScopeImpl("Programme");
            CurrentScope = GeneralScope;
            CurrentIsFonction=false;
            position=1;
            CurrentSymbole=null;
            /*
            CurrentScope.AddSymbole(new Symbole("latitude",Type.INTEGER.name()));
            CurrentScope.AddSymbole(new Symbole("longitude",Type.INTEGER.name()));
            CurrentScope.AddSymbole(new Symbole("grid size",Type.INTEGER.name()));
            CurrentScope.AddSymbole(new Symbole("map count",Type.INTEGER.name()));
            CurrentScope.AddSymbole(new Symbole("ammo count",Type.INTEGER.name()));
            CurrentScope.AddSymbole(new Symbole("soda count",Type.INTEGER.name()));
            CurrentScope.AddSymbole(new Symbole("radio count",Type.INTEGER.name()));
            CurrentScope.AddSymbole(new Symbole("fruits count",Type.INTEGER.name()));
            CurrentScope.AddSymbole(new Symbole("life",Type.INTEGER.name()));
            CurrentScope.AddSymbole(new Symbole("true",Type.BOOLEAN.name()));
            CurrentScope.AddSymbole(new Symbole("false",Type.BOOLEAN.name()));
            CurrentScope.AddSymbole(new Symbole("ennemi is north",Type.BOOLEAN.name()));
            CurrentScope.AddSymbole(new Symbole("ennemi is south",Type.BOOLEAN.name()));
            CurrentScope.AddSymbole(new Symbole("ennemi is east",Type.BOOLEAN.name()));
            CurrentScope.AddSymbole(new Symbole("ennemi is west",Type.BOOLEAN.name()));
            CurrentScope.AddSymbole(new Symbole("graal is north",Type.BOOLEAN.name()));
            CurrentScope.AddSymbole(new Symbole("graal is south",Type.BOOLEAN.name()));
            CurrentScope.AddSymbole(new Symbole("graal is east",Type.BOOLEAN.name()));
            CurrentScope.AddSymbole(new Symbole("graal is west",Type.BOOLEAN.name()));
            CurrentScope.AddSymbole(new Symbole("dirt",Type.SQUARE.name()));
            CurrentScope.AddSymbole(new Symbole("rock",Type.SQUARE.name()));
            CurrentScope.AddSymbole(new Symbole("vines",Type.SQUARE.name()));
            CurrentScope.AddSymbole(new Symbole("zombie",Type.SQUARE.name()));
            CurrentScope.AddSymbole(new Symbole("player",Type.SQUARE.name()));
            CurrentScope.AddSymbole(new Symbole("ennemi",Type.SQUARE.name()));
            CurrentScope.AddSymbole(new Symbole("map",Type.SQUARE.name()));
            CurrentScope.AddSymbole(new Symbole("radio",Type.SQUARE.name()));
            CurrentScope.AddSymbole(new Symbole("ammo",Type.SQUARE.name()));
            CurrentScope.AddSymbole(new Symbole("fruits",Type.SQUARE.name()));
            CurrentScope.AddSymbole(new Symbole("soda",Type.SQUARE.name()));
            */
        }
        
        //renvoie le scope general qui contient tous les autres scopes du programmme
        public ScopeImpl getScope(){           
            GeneralScope.CorrectEveryThing();            
            return GeneralScope;
        }
        
        
         //programmes
	@Override 
        public void enterProgramme(B314Parser.ProgrammeContext ctx) {
            GeneralScope= new ScopeImpl("Programme");}

	@Override public void exitProgramme(B314Parser.ProgrammeContext ctx) { }
        
        //les variables et fonctions du programmes
                
	@Override public void enterProgDecl(B314Parser.ProgDeclContext ctx) { }

	@Override public void exitProgDecl(B314Parser.ProgDeclContext ctx) { }

         //les fonctions
	@Override 
        public void enterFctDecl(B314Parser.FctDeclContext ctx) {
            CurrentIsFonction = true;
            CurrentSymbole = new Symbole(ctx.ID().getText());
            CurrentSymbole.setIsFunction(true);
            CurrentScope.AddSymbole(CurrentSymbole); // on ajoute le symbole fonction dans le scope parent
            CurrentScope = new ScopeImpl(ctx.ID().getText(),CurrentScope); //on change de scope
            CurrentScope.AddSymbole(CurrentSymbole);   //on l'ajoute dans son propre scope                     
        }

	@Override 
        public void exitFctDecl(B314Parser.FctDeclContext ctx) {
            CurrentIsFonction = false;
            CurrentScope = (ScopeImpl) CurrentScope.getParent();
        }
        
        //les types de fonctions

	@Override public void enterFctTypeScalar(B314Parser.FctTypeScalarContext ctx) { }

	@Override public void exitFctTypeScalar(B314Parser.FctTypeScalarContext ctx) { }

	@Override public void enterFctTypeVoid(B314Parser.FctTypeVoidContext ctx) { }

	@Override 
        public void exitFctTypeVoid(B314Parser.FctTypeVoidContext ctx) {
            if(CurrentIsFonction){
                CurrentIsFonction = false;
                CurrentSymbole.setType(ctx.VOID().getText());
            }
            else throw new RuntimeException();
        }
        
        //les paramètres de fonctions

	@Override 
        public void enterParamDecl(B314Parser.ParamDeclContext ctx) {
            CurrentIsFonction = false;
        }

	@Override 
        public void exitParamDecl(B314Parser.ParamDeclContext ctx) { 
            CurrentIsFonction = true;
        }
        
        //clause when

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
        
        //clause default

	@Override 
        public void enterClauseDefault(B314Parser.ClauseDefaultContext ctx) {
            CurrentScope = new ScopeImpl("clauseDefault",CurrentScope);
        }

	@Override 
        public void exitClauseDefault(B314Parser.ClauseDefaultContext ctx) {
            CurrentScope = (ScopeImpl) CurrentScope.getParent();
        }
        
        //declaration des variables
	@Override 
        public void enterVarDecl(B314Parser.VarDeclContext ctx) {
            CurrentSymbole = new Symbole(ctx.ID().getText());
        }

	@Override 
        public void exitVarDecl(B314Parser.VarDeclContext ctx){
            //if(CurrentSymbole.getType() == null) throw new RuntimeException();
            /*else
            */CurrentScope.AddSymbole(CurrentSymbole);
        }
        
        //definitions des types
	@Override public void enterTypeScalar(B314Parser.TypeScalarContext ctx) { }

	@Override 
        public void exitTypeScalar(B314Parser.TypeScalarContext ctx) {
            if(CurrentIsFonction)CurrentIsFonction=false;
        }

	@Override 
        public void enterTypeArray(B314Parser.TypeArrayContext ctx) {
            CurrentSymbole.setType(ctx.array().scalar().getText());
        }

	@Override public void exitTypeArray(B314Parser.TypeArrayContext ctx) { }

	@Override 
        public void enterScalarBoolean(B314Parser.ScalarBooleanContext ctx) {
            CurrentSymbole.setType(ctx.BOOLEAN().getText());
        }

	@Override 
        public void exitScalarBoolean(B314Parser.ScalarBooleanContext ctx) { 
            if(CurrentSymbole.getType()!=Type.BOOLEAN.name())throw new RuntimeException();
        }

	@Override 
        public void enterScalarInteger(B314Parser.ScalarIntegerContext ctx) { 
            CurrentSymbole.setType(ctx.INTEGER().getText());
        }

	@Override 
        public void exitScalarInteger(B314Parser.ScalarIntegerContext ctx) {
            if(CurrentSymbole.getType()!=Type.INTEGER.name())throw new RuntimeException();
        }

	@Override 
        public void enterScalarSquare(B314Parser.ScalarSquareContext ctx) { 
            CurrentSymbole.setType(ctx.SQUARE().getText());
        }

	@Override 
        public void exitScalarSquare(B314Parser.ScalarSquareContext ctx) {
            if(CurrentSymbole.getType()!=Type.SQUARE.name())throw new RuntimeException();
        }

	@Override 
        public void enterArray(B314Parser.ArrayContext ctx) {
            if(ctx.taille1==null || ctx.taille2==null || ctx.scalar()==null)throw new RuntimeException();
            if(ctx.scalar()==null)throw new RuntimeException();
            else{
            CurrentSymbole.setType(ctx.scalar().getText());
            System.out.println(CurrentSymbole.getType()+"jessica");
            if (ctx.taille1 !=null){
                int i = Integer.parseInt(ctx.taille1.getText());
                if(ctx.taille2!=null){
                    int j = Integer.parseInt(ctx.taille2.getText());
                    CurrentSymbole.setLength(new int []{i,j});
                    //CurrentSymbole.setType(GetType(ctx.scalar()));
                }
                CurrentSymbole.setLength(new int []{i});
            }
            else throw new RuntimeException();            
            }

        }

	@Override 
        public void exitArray(B314Parser.ArrayContext ctx) {
            if(CurrentIsFonction)CurrentIsFonction=false;
            if(CurrentSymbole.getLength().length == 0) throw new RuntimeException();
        }
        
        //verifications des expressions

	@Override 
        public void enterExprDInteger(B314Parser.ExprDIntegerContext ctx) {
            //CurrentSymbole.setType(Type.INTEGER.name());
        }

	@Override 
        public void exitExprDInteger(B314Parser.ExprDIntegerContext ctx) { 
            //CurrentSymbole.setType(Type.INTEGER.name());
        }

	@Override public void enterExprDBoolean(B314Parser.ExprDBooleanContext ctx) { }

	@Override public void exitExprDBoolean(B314Parser.ExprDBooleanContext ctx) { }

	@Override public void enterExprDCase(B314Parser.ExprDCaseContext ctx) { }

	@Override public void exitExprDCase(B314Parser.ExprDCaseContext ctx) { }
        
	@Override public void enterExprDG(B314Parser.ExprDGContext ctx) { }

	@Override public void exitExprDG(B314Parser.ExprDGContext ctx) { }
        

	@Override 
        public void enterExprEntParennthese(B314Parser.ExprEntParenntheseContext ctx) {
            if(GetType(ctx.exprEnt())!=Type.INTEGER.name())throw new RuntimeException();
        }

	@Override public void exitExprEntParennthese(B314Parser.ExprEntParenntheseContext ctx) { }

	@Override public void enterExprEntEntier(B314Parser.ExprEntEntierContext ctx) { }

	@Override public void exitExprEntEntier(B314Parser.ExprEntEntierContext ctx) { }

	@Override public void enterExprEntEnvironnement(B314Parser.ExprEntEnvironnementContext ctx) { }
	
	@Override public void exitExprEntEnvironnement(B314Parser.ExprEntEnvironnementContext ctx) { }

	@Override 
        public void enterExprEntFonction(B314Parser.ExprEntFonctionContext ctx) { 
            Symbole symbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            //if(symbole==null)throw new RuntimeException(); 
             if(symbole.getType()!=Type.INTEGER.toString())throw new RuntimeException();        
        }

	@Override public void exitExprEntFonction(B314Parser.ExprEntFonctionContext ctx) { }
        

        @Override public void enterExprBoolInfSupEnt(B314Parser.ExprBoolInfSupEntContext ctx) { }

	@Override public void exitExprBoolInfSupEnt(B314Parser.ExprBoolInfSupEntContext ctx) { }
                
        @Override 
        public void enterExprBoolInfSupGG(B314Parser.ExprBoolInfSupGGContext ctx) { 
              if(ctx.expr1 == null || ctx.expr2 == null)throw new RuntimeException();
              else{
                Symbole symbole1 = CurrentScope.FoundSymbole(ctx.expr1.getChild(0).getText());
                Symbole symbole2 = CurrentScope.FoundSymbole(ctx.expr2.getChild(0).getText()); 
                String type1=symbole1.getType();
                String type2= symbole2.getType();
                if(type1!=Type.INTEGER.name()||type2!=Type.INTEGER.name())throw new RuntimeException();
              }
              
        }

	@Override public void exitExprBoolInfSupGG(B314Parser.ExprBoolInfSupGGContext ctx) { }
        
	@Override 
        public void enterExprBoolInfSupGEnt(B314Parser.ExprBoolInfSupGEntContext ctx) { 
              if(ctx.expr1 == null)throw new RuntimeException();
              else{
                Symbole symbole1 = CurrentScope.FoundSymbole(ctx.expr1.getChild(0).getText());
                String type1=symbole1.getType();
                if(type1!=Type.INTEGER.name())throw new RuntimeException();
              }        
        }

	@Override public void exitExprBoolInfSupGEnt(B314Parser.ExprBoolInfSupGEntContext ctx) { }

	@Override 
        public void enterExprBoolInfSupEntGauche(B314Parser.ExprBoolInfSupEntGaucheContext ctx) {
              if(ctx.expr2 == null)throw new RuntimeException();
              else{
                Symbole symbole2 = CurrentScope.FoundSymbole(ctx.expr2.getChild(0).getText()); 
                String type2= symbole2.getType();
                if(type2!=Type.INTEGER.name())throw new RuntimeException();
              }        
        }

	@Override public void exitExprBoolInfSupEntGauche(B314Parser.ExprBoolInfSupEntGaucheContext ctx) { }

        
        
	@Override public void enterExprBoolFalse(B314Parser.ExprBoolFalseContext ctx) { }

	@Override public void exitExprBoolFalse(B314Parser.ExprBoolFalseContext ctx) { }

	@Override public void enterExprBoolTrue(B314Parser.ExprBoolTrueContext ctx) { }

	@Override public void exitExprBoolTrue(B314Parser.ExprBoolTrueContext ctx) { }

	@Override 
        public void enterExprBoolEgaleCase(B314Parser.ExprBoolEgaleCaseContext ctx) {
            String type1 = GetType((ParserRuleContext) ctx.getChild(0));
            String type2 = GetType((ParserRuleContext) ctx.getChild(2));
            if(type1!=Type.SQUARE.name() || type2!=Type.SQUARE.name())throw new RuntimeException();        
        }

	@Override public void exitExprBoolEgaleCase(B314Parser.ExprBoolEgaleCaseContext ctx) { }

	@Override 
        public void enterExprBoolNot(B314Parser.ExprBoolNotContext ctx) {
            String type1 = GetType((ParserRuleContext) ctx.getChild(1));
            if(type1!=Type.BOOLEAN.name())throw new RuntimeException();        
        }

	@Override public void exitExprBoolNot(B314Parser.ExprBoolNotContext ctx) { }
/*
	@Override 
        public void enterExprBoolEgaleGauche(B314Parser.ExprBoolEgaleGaucheContext ctx) {
            String type1 = CurrentScope.FoundSymbole(ctx.expr1.getText()).getType();
            String type2 = CurrentScope.FoundSymbole(ctx.expr1.getText()).getType();
            if(type1!=type2)throw new RuntimeException();
        }

	@Override public void exitExprBoolEgaleGauche(B314Parser.ExprBoolEgaleGaucheContext ctx) { }
*/
	@Override 
        public void enterExprBoolFonction(B314Parser.ExprBoolFonctionContext ctx) {
            Symbole symbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            if(symbole.getType()!=Type.BOOLEAN.toString())throw new RuntimeException();
        }

	@Override public void exitExprBoolFonction(B314Parser.ExprBoolFonctionContext ctx) { }

	@Override public void enterExprBoolEnvironnement(B314Parser.ExprBoolEnvironnementContext ctx) { }

	@Override public void exitExprBoolEnvironnement(B314Parser.ExprBoolEnvironnementContext ctx) { }

	@Override 
        public void enterExprBoolEgaleInteger(B314Parser.ExprBoolEgaleIntegerContext ctx) {
            String type1 = GetType((ParserRuleContext) ctx.getChild(0));
            String type2 = GetType((ParserRuleContext) ctx.getChild(2));
            if(type1!=Type.INTEGER.name() || type2!=Type.INTEGER.name())throw new RuntimeException();        
        }

	@Override public void exitExprBoolEgaleInteger(B314Parser.ExprBoolEgaleIntegerContext ctx) { }

	@Override 
        public void enterExprBoolEgaleBoolean(B314Parser.ExprBoolEgaleBooleanContext ctx) {
            String type1 = GetType((ParserRuleContext) ctx.getChild(0));
            String type2 = GetType((ParserRuleContext) ctx.getChild(2));
            if(type1!=Type.BOOLEAN.name() || type2!=Type.BOOLEAN.name())throw new RuntimeException();        
        }

	@Override public void exitExprBoolEgaleBoolean(B314Parser.ExprBoolEgaleBooleanContext ctx) { }

	@Override 
        public void enterExprBoolParennthese(B314Parser.ExprBoolParenntheseContext ctx) {
            String type1 = GetType((ParserRuleContext) ctx.getChild(1));
            if(type1!=Type.BOOLEAN.name())throw new RuntimeException();       
        }

	@Override public void exitExprBoolParennthese(B314Parser.ExprBoolParenntheseContext ctx) { }
        

	@Override 
        public void enterExprCaseFonction(B314Parser.ExprCaseFonctionContext ctx) { 
            Symbole symbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            if(symbole.getType()!=Type.SQUARE.toString())throw new RuntimeException();        
        }

	@Override public void exitExprCaseFonction(B314Parser.ExprCaseFonctionContext ctx) { }

	@Override public void enterExprCaseEnvironnement(B314Parser.ExprCaseEnvironnementContext ctx) { }

	@Override public void exitExprCaseEnvironnement(B314Parser.ExprCaseEnvironnementContext ctx) { }

	@Override 
        public void enterExprCaseNearby(B314Parser.ExprCaseNearbyContext ctx) {
            if(ctx.taille1==null || ctx.taille2==null)throw new RuntimeException();
            else if(GetType(ctx.taille1)!=Type.INTEGER.toString() ||GetType(ctx.taille2)!=Type.INTEGER.toString())throw new RuntimeException();
        }

	@Override public void exitExprCaseNearby(B314Parser.ExprCaseNearbyContext ctx) { }

	@Override 
        public void enterExprCaseParennthese(B314Parser.ExprCaseParenntheseContext ctx) {
            String type1 = GetType((ParserRuleContext) ctx.getChild(1));
            if(type1!=Type.SQUARE.name())throw new RuntimeException();        
        }

	@Override public void exitExprCaseParennthese(B314Parser.ExprCaseParenntheseContext ctx) { }
        

	@Override public void enterEnvironnementInt(B314Parser.EnvironnementIntContext ctx) { }

	@Override public void exitEnvironnementInt(B314Parser.EnvironnementIntContext ctx) { }

	@Override public void enterEnvironnementBool(B314Parser.EnvironnementBoolContext ctx) { }

	@Override public void exitEnvironnementBool(B314Parser.EnvironnementBoolContext ctx) { }

	@Override public void enterEnvironnementCase(B314Parser.EnvironnementCaseContext ctx) { }

	@Override public void exitEnvironnementCase(B314Parser.EnvironnementCaseContext ctx) { }

        
        
	@Override 
        public void enterExprGVariable(B314Parser.ExprGVariableContext ctx) {
            CurrentSymbole = CurrentScope.FoundSymbole(ctx.ID().getText());
            if(CurrentSymbole == null)throw new RuntimeException();
        }

	@Override public void exitExprGVariable(B314Parser.ExprGVariableContext ctx) { }

        private void checkExprGTableau(B314Parser.ExprGContext ctx){
            CurrentSymbole = CurrentScope.FoundSymbole(ctx.getChild(0).getText());
            if(CurrentSymbole == null)throw new RuntimeException();
            if(CurrentSymbole.getIsArray()){
                if(CurrentSymbole.getLength().length==1){
                    if(ctx.getChild(2)==null || ctx.getChild(4)!=null)throw new RuntimeException();
                    else if (GetType((ParserRuleContext) ctx.getChild(2))!=Type.INTEGER.toString())throw new RuntimeException();
                }
                else{
                    if(ctx.getChild(2)==null || ctx.getChild(4)==null)throw new RuntimeException();
                    else if(GetType((ParserRuleContext) ctx.getChild(2))!=Type.INTEGER.toString() ||GetType((ParserRuleContext) ctx.getChild(4))!=Type.INTEGER.toString() )throw new RuntimeException();
                }
            }
            else throw new RuntimeException();            
        }
	@Override 
        public void enterExprGTableau(B314Parser.ExprGTableauContext ctx) {
              //if(!(ctx.taille1 instanceof B314Parser.ExprEntContext && ctx.taille1 instanceof B314Parser.ExprGContext && ctx.taille2 instanceof B314Parser.ExprEntContext && ctx.taille2 instanceof B314Parser.ExprGContext)) throw new RuntimeException();
              checkExprGTableau(ctx);
        }
        
	@Override 
        public void exitExprGTableau(B314Parser.ExprGTableauContext ctx) {}

	@Override public void enterEntier(B314Parser.EntierContext ctx) { }

	@Override public void exitEntier(B314Parser.EntierContext ctx) { }
        
        //les instructions

	@Override public void enterSkipppp(B314Parser.SkippppContext ctx) { }

	@Override public void exitSkipppp(B314Parser.SkippppContext ctx) { }

	@Override public void enterIf(B314Parser.IfContext ctx) { }

	@Override public void exitIf(B314Parser.IfContext ctx) { }

	@Override public void enterIfthenelse(B314Parser.IfthenelseContext ctx) { }

	@Override public void exitIfthenelse(B314Parser.IfthenelseContext ctx) { }

	@Override public void enterWhile(B314Parser.WhileContext ctx) { }

	@Override public void exitWhile(B314Parser.WhileContext ctx) { }

	@Override 
        public void enterAffectation(B314Parser.AffectationContext ctx) { 
            if(ctx.exprG()!=null && ctx.exprD()!=null ){
            String name = ctx.exprG().getChild(0).getText();
            Symbole symbole = CurrentScope.FoundSymbole(name);
            String assign = GetType(ctx.exprD());
            if(symbole!=null)
                if(symbole.getType()!=assign)throw new RuntimeException();                      
            
            else throw new RuntimeException();
            }
            else throw new RuntimeException();
        }

	@Override public void exitAffectation(B314Parser.AffectationContext ctx) { }

	@Override public void enterCompute(B314Parser.ComputeContext ctx) { }

	@Override public void exitCompute(B314Parser.ComputeContext ctx) { }

	@Override 
        public void enterNextAction(B314Parser.NextActionContext ctx) {
              if(ctx.action().children.isEmpty()) throw new RuntimeException();
        }

	@Override public void exitNextAction(B314Parser.NextActionContext ctx) { }

        //les actions
        
	@Override public void enterAction(B314Parser.ActionContext ctx) { }

	@Override public void exitAction(B314Parser.ActionContext ctx) { }
       
        //other

	@Override public void enterEveryRule(ParserRuleContext ctx) { }

	@Override public void exitEveryRule(ParserRuleContext ctx) { }

	@Override public void visitTerminal(TerminalNode node) { }

	@Override public void visitErrorNode(ErrorNode node) { }
        
        //méthodes privates
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
        
        @Override 
        public void enterExprBoolEgaleGaucheGauche(B314Parser.ExprBoolEgaleGaucheGaucheContext ctx) { 
            String type1 = CurrentScope.FoundSymbole(ctx.expr3.getChild(0).getText()).getType();
            String type2 = CurrentScope.FoundSymbole(ctx.expr4.getChild(0).getText()).getType();
           if(type1!=type2)throw new RuntimeException();        
        }
	@Override public void exitExprBoolEgaleGaucheGauche(B314Parser.ExprBoolEgaleGaucheGaucheContext ctx) { }
        
        @Override 
        public void enterExprBoolEgaleGaucheEnt(B314Parser.ExprBoolEgaleGaucheEntContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.INTEGER.name())throw new RuntimeException();
        }

	@Override public void exitExprBoolEgaleGaucheEnt(B314Parser.ExprBoolEgaleGaucheEntContext ctx) { }

	@Override 
        public void enterExprBoolEgaleGaucheCase(B314Parser.ExprBoolEgaleGaucheCaseContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.SQUARE.name())throw new RuntimeException();        
        }
	@Override public void exitExprBoolEgaleGaucheCase(B314Parser.ExprBoolEgaleGaucheCaseContext ctx) { }

	@Override 
        public void enterExprBoolEgaleGaucheBool(B314Parser.ExprBoolEgaleGaucheBoolContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.BOOLEAN.name())throw new RuntimeException();         
        }

	@Override public void exitExprBoolEgaleGaucheBool(B314Parser.ExprBoolEgaleGaucheBoolContext ctx) { }

	@Override 
        public void enterExprBoolEgaleEntGauche(B314Parser.ExprBoolEgaleEntGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.INTEGER.name())throw new RuntimeException();        
        }

	@Override public void exitExprBoolEgaleEntGauche(B314Parser.ExprBoolEgaleEntGaucheContext ctx) { }    
        
	@Override 
        public void enterExprBoolEgaleBoolGauche(B314Parser.ExprBoolEgaleBoolGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.BOOLEAN.name())throw new RuntimeException();         
        }

	@Override public void exitExprBoolEgaleBoolGauche(B314Parser.ExprBoolEgaleBoolGaucheContext ctx) { }
        
        @Override 
        public void enterExprBoolEgaleCaseGauche(B314Parser.ExprBoolEgaleCaseGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.SQUARE.name())throw new RuntimeException();         
        }

	@Override public void exitExprBoolEgaleCaseGauche(B314Parser.ExprBoolEgaleCaseGaucheContext ctx) { }
        
	@Override 
        public void enterExprBoolNotGauche(B314Parser.ExprBoolNotGaucheContext ctx) { 
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.BOOLEAN.name())throw new RuntimeException();            
        }

	@Override public void exitExprBoolNotGauche(B314Parser.ExprBoolNotGaucheContext ctx) {}
        
        @Override 
        public void enterExprBoolAndOrGaucheGauche(B314Parser.ExprBoolAndOrGaucheGaucheContext ctx) {
            String type1 = CurrentScope.FoundSymbole(ctx.expr5.getChild(0).getText()).getType();
            String type2 = CurrentScope.FoundSymbole(ctx.expr6.getChild(0).getText()).getType();
           if(type1!=Type.BOOLEAN.name() || type2!= Type.BOOLEAN.name())throw new RuntimeException();        
        }

	@Override public void exitExprBoolAndOrGaucheGauche(B314Parser.ExprBoolAndOrGaucheGaucheContext ctx) { }
        
        @Override 
        public void enterExprBoolAndOrGaucheBool(B314Parser.ExprBoolAndOrGaucheBoolContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
           if(type!=Type.BOOLEAN.name())throw new RuntimeException();        
        }

	@Override public void exitExprBoolAndOrGaucheBool(B314Parser.ExprBoolAndOrGaucheBoolContext ctx) { }
        
        @Override 
        public void enterExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
           if(type!=Type.BOOLEAN.name())throw new RuntimeException();          
        }

	@Override 
        public void exitExprBoolAndOrBoolGauche(B314Parser.ExprBoolAndOrBoolGaucheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
           if(type!=Type.BOOLEAN.name())throw new RuntimeException();          
        }
        
        @Override public void enterExprBoolAndOrBoolBool(B314Parser.ExprBoolAndOrBoolBoolContext ctx) { }

	@Override public void exitExprBoolAndOrBoolBool(B314Parser.ExprBoolAndOrBoolBoolContext ctx) { }
        
	@Override 
        public void enterExprEntMulDivEntGauhe(B314Parser.ExprEntMulDivEntGauheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.INTEGER.name())throw new RuntimeException();          
        }
	@Override public void exitExprEntMulDivEntGauhe(B314Parser.ExprEntMulDivEntGauheContext ctx) { }
        
	@Override public void enterExprEntMulDivEntEnt(B314Parser.ExprEntMulDivEntEntContext ctx) {}

	@Override public void exitExprEntMulDivEntEnt(B314Parser.ExprEntMulDivEntEntContext ctx) { }

	@Override 
        public void enterExprEntMulDivGaucheGauhe(B314Parser.ExprEntMulDivGaucheGauheContext ctx) { 
            String type1 = CurrentScope.FoundSymbole(ctx.expr3.getChild(0).getText()).getType();
            String type2 = CurrentScope.FoundSymbole(ctx.expr4.getChild(0).getText()).getType();
           if(type1!=Type.INTEGER.name()||type2!=Type.INTEGER.name())throw new RuntimeException();          
        }

	@Override public void exitExprEntMulDivGaucheGauhe(B314Parser.ExprEntMulDivGaucheGauheContext ctx) { }

	@Override 
        public void enterExprEntMulDivGauheEnt(B314Parser.ExprEntMulDivGauheEntContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.INTEGER.name())throw new RuntimeException();          
        }

	@Override public void exitExprEntMulDivGauheEnt(B314Parser.ExprEntMulDivGauheEntContext ctx) { }

        @Override 
        public void enterExprEntPlusMoinsEntGauhe(B314Parser.ExprEntPlusMoinsEntGauheContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.INTEGER.name())throw new RuntimeException();              
        }
	@Override public void exitExprEntPlusMoinsEntGauhe(B314Parser.ExprEntPlusMoinsEntGauheContext ctx) { }

	@Override 
        public void enterExprEntPlusMoinsGaucheGauhe(B314Parser.ExprEntPlusMoinsGaucheGauheContext ctx) { 
            String type1 = CurrentScope.FoundSymbole(ctx.expr3.getChild(0).getText()).getType();
            String type2 = CurrentScope.FoundSymbole(ctx.expr4.getChild(0).getText()).getType();
           if(type1!=Type.INTEGER.name()||type2!=Type.INTEGER.name())throw new RuntimeException();          
        }

	@Override public void exitExprEntPlusMoinsGaucheGauhe(B314Parser.ExprEntPlusMoinsGaucheGauheContext ctx) { }  
        	
        @Override 
        public void enterExprEntPlusMoinsGauheEnt(B314Parser.ExprEntPlusMoinsGauheEntContext ctx) {
            String type = CurrentScope.FoundSymbole(ctx.exprG().getChild(0).getText()).getType();
            if(type!= Type.INTEGER.name())throw new RuntimeException();          
        }
	@Override public void exitExprEntPlusMoinsGauheEnt(B314Parser.ExprEntPlusMoinsGauheEntContext ctx) { }

	@Override public void enterExprEntPlusMoinsEntEnt(B314Parser.ExprEntPlusMoinsEntEntContext ctx) {  }

	@Override public void exitExprEntPlusMoinsEntEnt(B314Parser.ExprEntPlusMoinsEntEntContext ctx) { }
}
