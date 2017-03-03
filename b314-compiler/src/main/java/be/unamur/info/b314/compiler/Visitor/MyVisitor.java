/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.Visitor;

import TableSimplifiee.TableSimplifiee;
import be.unamur.info.b314.compiler.B314BaseVisitor;
import be.unamur.info.b314.compiler.B314Parser;

import java.util.Map;
import java.util.HashMap;

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
      TableSimplifiee<Integer, Scalar> typeParametresFunctions = new TableSimplifiee();
      
      Map<String, Scalar> TypeParametresLocaux = new HashMap<>();
      Map<String, String> TypeVariablesLocales = new HashMap<>();
      Map<String, String> TypeTableauxLocaux = new HashMap<>();
      
      String idUtilise = new String(); // Permet de voir avec quelle variable on travaille lors
      //de la vérification de la définition des variables
      String typeUtilise = new String(); // Permet de voir le type de la variable qu'on utilise
      // à l'instant dans le visiteur.
      int nombreParametresUtilises=0;
      boolean currentIsArray=false;

    @Override
    public Object visitVarDecl(B314Parser.VarDeclContext ctx) {
        idUtilise = ctx.getChild(0).getText();
        visitType(ctx.typeOfVar);
        
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
        
        return null;
    }

    @Override
    public Object visitType(B314Parser.TypeContext ctx) {
        
        visitChildren(ctx);
        
        
                
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
    
    
    
}
    
    
    
    
    

    
      
      
      
      
      
    
      
      
    
    
    
