/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.scope;

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
    
        
    /**
     * Make a new symbol.
     * 
     * @param name symbol name
     */
    public Symbole(String name) {
        this.name = name;
        this.type = null;
        this.isArray = false;
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
    
    public void setArray(int [] length){
        this.isArray = true;
        this.type = "tableau";
        this.length = length;
    }

    public int[] getLength() {
        return length;
    }

    public void setLength(int[] length) {
        this.length = length;
        setIsArray(true);
        setType("tableau");        
    }

    public Boolean getIsArray() {
        return isArray;
    }

    public void setIsArray(Boolean isArray) {
        this.isArray = isArray;
    }
    
}
