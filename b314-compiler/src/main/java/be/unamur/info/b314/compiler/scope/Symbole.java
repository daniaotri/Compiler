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
    
   
    String name;
    
    String type;
    
    /**
     * Make a new symbol.
     * 
     * @param name symbol name
     * @param type symbol type
     */
    public Symbole(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Symbole{" + "name=" + name + ", type=" + type + '}';
    }
 

    
}
