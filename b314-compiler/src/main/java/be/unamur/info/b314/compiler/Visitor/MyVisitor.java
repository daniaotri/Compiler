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

    @Override
    public Object visitVarDecl(B314Parser.VarDeclContext ctx) {
        idUtilise = ctx.getChild(0).getText();
        visitType(ctx.typeOfVar);
        System.out.println("id: " + idUtilise + TypeVariablesGlobales.get(idUtilise));
        
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
                TypeVariablesGlobales.put(idUtilise, Scalar.BOOLEAN);
                break;
            case "integer":
                TypeVariablesGlobales.put(idUtilise, Scalar.INTEGER);
                break;
            case "square":
                TypeVariablesGlobales.put(idUtilise, Scalar.SQUARE);
                break;
        }
        
        
        
        return null;
    }
    
}
    
    
    
    
    

    
      
      
      
      
      
    
      
      
    
    
    
