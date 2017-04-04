/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.scope;

import java.util.ArrayList;

/**
 *
 * Represente un symbole du langage
 * 
 * @author jessi
 */
public class Symbole {
       
    private final String name;
    private String type;
    private int [] length = {};
    private Boolean isArray;
    private Boolean isFunction;
    private ArrayList<Symbole> LesParametres;
    
        
    /**
     * Make a new symbol.
     * 
     * @param name symbol name
     */
    public Symbole(String name) {
        this.name = name;
        this.type = null;
        this.isArray = false;
        this.isFunction = false;
        this.LesParametres = new ArrayList<>();
    }
    public Symbole(String name,String type){
        this.name = name;
        this.type = name;
        this.isArray = false;
        this.isFunction = false;
        this.LesParametres = new ArrayList<>();
    }
    
    public Boolean getIsFunction() {
        return isFunction;
    }

    public void setIsFunction(Boolean isFunction) {
        this.isFunction = isFunction;
    }
    
    public void setType(String type){
        this.type = type;
    }
   
    public String getType(){
        return type;
    }
    public String getName() {
        return name;
    }
    
    public int[] getLength() {
        return length;
    }

    public void setLength(int[] length) {
        this.length = length;
        setIsArray(true);      
    }

    public Boolean getIsArray() {
        return isArray;
    }

    public void setIsArray(Boolean isArray) {
        this.isArray = isArray;
    }

    public ArrayList<Symbole> getLesParametres() {
        return LesParametres;
    }

    public void setLesParametres(ArrayList<Symbole> LesParametres) {
        this.LesParametres = LesParametres;
    }
    
    public void AddParam(Symbole sym){
        if(LesParametres.contains(sym))throw new RuntimeException();
        else LesParametres.add(sym);
    }

    @Override
    public String toString() {
        return "Symbole{" + "name=" + name + ", type=" + type + ", length=" + length + ", isArray=" + isArray + ", isFunction=" + isFunction + ", LesParametres=" + LesParametres + '}';
    }
    

}
