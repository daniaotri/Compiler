/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.scope;

import be.unamur.info.b314.compiler.B314BaseListener;
import be.unamur.info.b314.compiler.B314Parser;

/**
 *
 * @author jessi
 */
public class FillScope extends B314BaseListener {
    
    enum Type{
    INTEGER,
    BOOLEAN,
    SQUARE,
    VOID
    }
    
        Scope GeneralScope;
        Scope CurrentScope;
        Symbole CurrentSymbole;
        SymboleIsFunction CurrentIsFunction;
        boolean CurrentIsFonction;
        int position;

        /**
         *
         *  Constructeur
         */
        public FillScope() {
            GeneralScope = new ScopeImpl("Programme");
            CurrentScope = GeneralScope;
            CurrentIsFonction=false;
            position=1;
        }
        /**
         *
         *  Renvoie le scope general
         */
        public Scope getScope(){
            return this.GeneralScope;
        }
        /**
         *
         *  Debut du programme
         */
	@Override 
        public void enterProgramme(B314Parser.ProgrammeContext ctx) {
            GeneralScope = new ScopeImpl("Programme");
            CurrentScope = GeneralScope;
            CurrentIsFonction=false;
            position=1;
        }
        /**
         *
         *  Définition des fonctions
         */
	@Override 
        public void enterFctDecl(B314Parser.FctDeclContext ctx) {
            CurrentSymbole = new Symbole(ctx.ID().getText());
            CurrentSymbole.setIsFunction(true);
            //CurrentScope.AddSymbole(CurrentSymbole); // on ajoute le symbole fonction dans le scope parent
            Scope x = new ScopeImpl(ctx.ID().getText(),CurrentScope); //on change de scope
            CurrentScope.addChildScope(x);
            CurrentScope =   x;
            CurrentScope.AddSymbole(CurrentSymbole);   //on l'ajoute dans son propre scope  */
        }

	@Override 
        public void exitFctDecl(B314Parser.FctDeclContext ctx) {
            //CurrentIsFonction = false;
            System.out.println(CurrentScope.toString());
            CurrentScope = CurrentScope.getParent();
        }


	@Override 
        public void enterParamDecl(B314Parser.ParamDeclContext ctx) {
            CurrentIsFonction = true;
        }

	@Override 
        public void exitParamDecl(B314Parser.ParamDeclContext ctx) { 
            CurrentIsFonction = false;
        }
        /**
         *
         *  Clause When
         */
	@Override 
        public void enterClauseWhen(B314Parser.ClauseWhenContext ctx) { 
            String nomScope = "clauseWhen"+position;
            Scope x = new ScopeImpl(nomScope,CurrentScope);
            CurrentScope.addChildScope(x);
            CurrentScope =   x;
            position = position +1;
        }

	@Override 
        public void exitClauseWhen(B314Parser.ClauseWhenContext ctx) { 
            CurrentScope =   CurrentScope.getParent();
        }
        /**
         *
         *  Clause default
         */
	@Override 
        public void enterClauseDefault(B314Parser.ClauseDefaultContext ctx) {
            Scope x = new ScopeImpl("clauseDefault",CurrentScope);
            CurrentScope.addChildScope(x);
            CurrentScope =   x;           
        }

	@Override 
        public void exitClauseDefault(B314Parser.ClauseDefaultContext ctx) {
            CurrentScope = CurrentScope.getParent();
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
            else CurrentScope.AddSymbole(CurrentSymbole);
            //if(CurrentIsFonction)CurrentScope.FoundSymbole(CurrentScope.GetName()).getLesParametres().add(CurrentSymbole);
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
                if(i<0)throw new RuntimeException();
                if(ctx.taille2!=null){
                    int j = Integer.parseInt(ctx.taille2.getText());
                    if(j<0)throw new RuntimeException();
                    CurrentSymbole.setLength(new int []{i,j});
                }
                else CurrentSymbole.setLength(new int []{i});
            }
            CurrentSymbole.setType(ctx.scalar().getChild(0).getText());
        }

	@Override 
        public void exitArray(B314Parser.ArrayContext ctx) {
            if(CurrentIsFonction)CurrentIsFonction=false;           
        }
        
	@Override 
        public void enterFctTypeScalar(B314Parser.FctTypeScalarContext ctx) {
            CurrentSymbole = CurrentScope.FoundSymbole(CurrentScope.GetName());
            //CurrentSymbole.setType(ctx.);
        }

	@Override 
        public void exitFctTypeScalar(B314Parser.FctTypeScalarContext ctx) {
            CurrentScope.getParent().AddSymbole(CurrentSymbole);
        }

	@Override 
        public void enterFctTypeVoid(B314Parser.FctTypeVoidContext ctx) { 
            CurrentSymbole = CurrentScope.FoundSymbole(CurrentScope.GetName());
        }
	       
	@Override 
        public void exitFctTypeVoid(B314Parser.FctTypeVoidContext ctx) {
            if(CurrentIsFonction){
                CurrentIsFonction = false;
                CurrentSymbole.setType(ctx.VOID().getText());
                CurrentScope.getParent().AddSymbole(CurrentSymbole);
            }
            else throw new RuntimeException();
        }
        
}
