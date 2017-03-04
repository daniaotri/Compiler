/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.Visitor;

import TableSimplifiee.AlreadyExistsException;
import TableSimplifiee.TableSimplifiee;
import be.unamur.info.b314.compiler.B314BaseVisitor;
import be.unamur.info.b314.compiler.B314Parser;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * ce visitor permet de créer la table de symbole
 * @author jessi
 */




public class MyVisitor extends B314BaseVisitor {
    //Charles
    
    	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
    
    enum FunctionType{
        INTEGER,
        BOOLEAN,
        SQUARE,
        VOID
    }
    
    enum Scalar{
        INTEGER,
        BOOLEAN,
        SQUARE
        
    }
    
      Map<String, Scalar> TypeVariablesGlobales = new HashMap<>(); 
      Map<String, Scalar> TypeTableauxGlobaux = new HashMap<>();
      Map<String, Integer> NombreParametresTableauxGlobaux = new HashMap<>();
      
      Map<String, FunctionType> TypeFonctions = new HashMap<>();
      Map<String, Integer> NombreParametresFonctions = new HashMap<>();
      TableSimplifiee<Integer, Scalar> TypeParametresFunctions = new TableSimplifiee();
      
      Map<String, Scalar> TypeParametresLocaux = new HashMap<>();
      Map<String, Scalar> TypeVariablesLocales = new HashMap<>();
      Map<String, Scalar> TypeTableauxLocaux = new HashMap<>();
      Map<String, Integer> NombreParametresTableauxLocaux = new HashMap<>();
      
      //Les variables suivantes permettent de remplir typeVariablesGlobales, TypeTableauxGlobaux
      //et NombreParametresTableauxGlobaux.
      
      String idUtilise = new String(); // Permet de voir avec quelle variable on travaille lors
      //de la vérification de la définition des variables
      String typeUtilise = new String(); // Permet de voir le type de la variable qu'on utilise
      // à l'instant dans le visiteur.
      int nombreParametresUtilises=0;
      boolean currentIsArray=false;
      
      //Variables utilisées pour la définition des données relatives aux fonctions.
      
      String typeFonctionCourante = new String();
      int nombreParametresFonctionCourante = 0;
      boolean currentIsFunction=false;
      boolean currentIsParameter=false;
      
      

    @Override
    public Object visitVarDecl(B314Parser.VarDeclContext ctx) {
        idUtilise = ctx.getChild(0).getText();
        visitType(ctx.typeOfVar);
        if(currentIsFunction==false){
            if(currentIsArray==true){

                switch (typeUtilise) {
                case "BOOLEAN":
                    TypeTableauxGlobaux.put(idUtilise, Scalar.BOOLEAN);
                    break;
                case "INTEGER":
                    TypeTableauxGlobaux.put(idUtilise, Scalar.INTEGER);
                    break;
                case "SQUARE":
                    TypeTableauxGlobaux.put(idUtilise, Scalar.SQUARE);
                    break;
                }

                NombreParametresTableauxGlobaux.put(idUtilise, nombreParametresUtilises);
                nombreParametresUtilises=0;

                currentIsArray=false;
            }else{
                switch (typeUtilise) {
                case "BOOLEAN":
                    TypeVariablesGlobales.put(idUtilise, Scalar.BOOLEAN);
                    break;
                case "INTEGER":
                    TypeVariablesGlobales.put(idUtilise, Scalar.INTEGER);
                    break;
                case "SQUARE":
                    TypeVariablesGlobales.put(idUtilise, Scalar.SQUARE);
                    break;
                }
            }
        }else{
            if(currentIsParameter){
                nombreParametresFonctionCourante++;

                //typeUtilise idUtilise

                switch (typeUtilise) {
                case "BOOLEAN":
                    TypeParametresLocaux.put(idUtilise, Scalar.BOOLEAN);
                    break;
                case "INTEGER":
                    TypeParametresLocaux.put(idUtilise, Scalar.INTEGER);
                    break;
                case "SQUARE":
                    TypeParametresLocaux.put(idUtilise, Scalar.SQUARE);
                    break;
                }
            
                

            }else{
                if(currentIsArray==true){

                switch (typeUtilise) {
                case "BOOLEAN":
                    TypeTableauxLocaux.put(idUtilise, Scalar.BOOLEAN);
                    
                    break;
                case "INTEGER":
                    TypeTableauxLocaux.put(idUtilise, Scalar.INTEGER);
                    break;
                case "SQUARE":
                    TypeTableauxLocaux.put(idUtilise, Scalar.SQUARE);
                    break;
                }

                NombreParametresTableauxLocaux.put(idUtilise, nombreParametresUtilises);
                nombreParametresUtilises=0;

                currentIsArray=false;
                }else{
                switch (typeUtilise) {
                case "BOOLEAN":
                    TypeVariablesLocales.put(idUtilise, Scalar.BOOLEAN);
                    break;
                case "INTEGER":
                    TypeVariablesLocales.put(idUtilise, Scalar.INTEGER);
                    break;
                case "SQUARE":
                    TypeVariablesLocales.put(idUtilise, Scalar.SQUARE);
                    break;
                }
            }
                
                
                
                
                
                
                
            }
        }
        return null;
    }

    @Override
    public Object visitType(B314Parser.TypeContext ctx) {
        
        visitChildren(ctx);
        
        if(currentIsFunction){
            if(currentIsArray){
                //Renvoyer une erreur
                currentIsArray=false;
            }
            
            
        }
        
        
                
        return null;
    }

    @Override
    public Object visitScalar(B314Parser.ScalarContext ctx) {
        
        
        switch (ctx.getChild(0).getText()) {
            case "boolean":
                //TypeVariablesGlobales.put(idUtilise, Scalar.BOOLEAN);
                typeUtilise = "BOOLEAN";
                break;
            case "integer":
                //TypeVariablesGlobales.put(idUtilise, Scalar.INTEGER);
                typeUtilise = "INTEGER";
                break;
            case "square":
                //TypeVariablesGlobales.put(idUtilise, Scalar.SQUARE);
                typeUtilise = "SQUARE";
                break;
        }
        
        
        
        return null;
    }

    @Override
    public Object visitArray(B314Parser.ArrayContext ctx) {
        
        switch (ctx.getChild(0).getText()) {
            case "boolean":
                //TypeVariablesGlobales.put(idUtilise, Scalar.BOOLEAN);
                typeUtilise = "BOOLEAN";
                break;
            case "integer":
                //TypeVariablesGlobales.put(idUtilise, Scalar.INTEGER);
                typeUtilise = "INTEGER";
                break;
            case "square":
                //TypeVariablesGlobales.put(idUtilise, Scalar.SQUARE);
                typeUtilise = "SQUARE";
                break;
        }
        
        if(ctx.getChildCount()==4){
            //NombreParametresTableauxGlobaux.put(idUtilise, 1);
            nombreParametresUtilises = 1;
        }else if(ctx.getChildCount()==5){
            //NombreParametresTableauxGlobaux.put(idUtilise, 2);
            nombreParametresUtilises = 2;
        }
        
        currentIsArray=true;
           
        
        return null;
    }

    @Override
    public Object visitFctDecl(B314Parser.FctDeclContext ctx) {
        
        currentIsFunction=true;
        
        visitChildren(ctx);
        
        NombreParametresFonctions.put(ctx.ID().getText(), nombreParametresUtilises);
        
        switch (typeFonctionCourante) {
            case "boolean":
                TypeFonctions.put(ctx.ID().getText(), FunctionType.BOOLEAN);
                break;
            case "integer":
                TypeFonctions.put(ctx.ID().getText(), FunctionType.INTEGER);
                break;
            case "square":
                TypeFonctions.put(ctx.ID().getText(), FunctionType.SQUARE);
                break;
            case "void":
                TypeFonctions.put(ctx.ID().getText(), FunctionType.VOID);
                break;
        }
        
        
        
        TypeParametresFunctions.ajoutLigne(ctx.ID().getText());
        
        Set<String> parametersSets = TypeParametresLocaux.keySet();
        Iterator it= parametersSets.iterator();
        
        int i=0;
        while(it.hasNext()){
            
            String str = (String)it.next();
            Scalar scal = TypeParametresLocaux.get(str);

            try {
                TypeParametresFunctions.ajoutValeur(ctx.ID().getText(),new Integer(i), scal);
            } catch (AlreadyExistsException ex) {
                Logger.getLogger(MyVisitor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            i++;
        }
        
        currentIsFunction= false;

        return null;
    }

    @Override
    public Object visitFctType(B314Parser.FctTypeContext ctx) {
        
        typeFonctionCourante=ctx.getText();
        
        return null; 
    }

    @Override
    public Object visitParamDecl(B314Parser.ParamDeclContext ctx) {
        
        currentIsParameter=true;
        visitChildren(ctx);
        
        currentIsParameter=false;
        
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
}
    
    
    
    
    

    
      
      
      
      
      
    
      
      
    
    
    
