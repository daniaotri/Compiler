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
       
    final String name;
    String type;
    int [] length = {};
    Boolean isArray;
    
        
    /**
     * Make a new symbol.
     * 
     * @param name symbol name
     */
    public Symbole(String name) {
        this.name = name;
        this.type = null;
    }
    
    public void setType(Symbole sym, String type){
        sym.type = type;
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
}
