/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.scope;

/**
 *
 * @author jessi
 */
public class SymboleTable {
    
    ScopeGeneral general = new ScopeGeneral(); /*LE scope global*/
    /*constructeur*/
    public SymboleTable() {
    }
    /*getter*/
    public ScopeGeneral getGeneral() {
        return general;
    }
    @Override
    public String toString(){return general.toString();}
    
    public SymboleTable(String[] type){general.define(type);}
}
