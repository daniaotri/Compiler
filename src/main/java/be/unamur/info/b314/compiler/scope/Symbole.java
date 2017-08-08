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
    private ArrayList<String> TheParameters;
    private Boolean isParam;
    private int address;
    
        
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
        this.TheParameters = new ArrayList<>();
        this.isParam = false;
        this.address = 0;
    }

    public Symbole(String name,String type){
        this.name = name;
        this.type = name;
        this.isArray = false;
        this.isFunction = false;
        this.TheParameters = new ArrayList<>();
        this.isParam = false;
        this.address = 0;
    }


    public void setIsFunction(Boolean isFunction) {
        this.isFunction = isFunction;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setLength(int[] length) {
        this.length = length;
        setIsArray(true);
    }
    public void setIsArray(Boolean isArray) {
        this.isArray = isArray;
    }
    public void setTheParameters(ArrayList<String> theParameters) {
        this.TheParameters = theParameters;
    }
    public void setIsParam(Boolean isParam) {
        this.isParam = isParam;
    }
    public void setAddress(int address) {
        this.address = address;
    }


    public Boolean getIsFunction() {
        return isFunction;
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
    public Boolean getIsArray() {
        return isArray;
    }
    public ArrayList<String> getTheParameters() {
        return TheParameters;
    }
    public Boolean getIsParam() {
        return isParam;
    }
    public int getAddress() {
        return address;
    }


    
    public void AddParam(String sym){
        if(TheParameters.contains(sym))throw new RuntimeException();
        else TheParameters.add(sym);
    }









    @Override
    public String toString() {
        return "Symbole{" + "name=" + name + ", type=" + type + ", length=" + length.length + ", isArray=" + isArray + ", isFunction=" + isFunction + ", TheParameters=" + TheParameters + ", isParam=" + isParam + '}';
    }
    

    

}
