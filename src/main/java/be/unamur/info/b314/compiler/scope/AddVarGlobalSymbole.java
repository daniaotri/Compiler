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
public class AddVarGlobalSymbole {
    
    private Scope currentScope;

    public AddVarGlobalSymbole(Scope currentScope) {
        this.currentScope = currentScope;
    }
    
    public Scope getScope(){
        return currentScope;
    }
    
}
