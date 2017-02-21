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
public class ScopeGeneral extends ScopeBase{
    
    public ScopeGeneral(Scope Parent) {
        super(Parent);
    }
    
    public ScopeGeneral(){
        super(null);
    }
    
    public String getScopeName(){
        return "General";
    }
}
