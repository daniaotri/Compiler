/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.scope;

import java.util.List;

/**
 *
 * @author jessi
 */
public class InitialiserLesAdresses {
 
    private Scope currentScope;

    public InitialiserLesAdresses(Scope currentScope){
        this.currentScope = currentScope;
        int adress = 101;
        for(int i =0;i<currentScope.getSymboles().size();i++){
            currentScope.getSymboles().get(i).setAddress(adress);
            getAddress(currentScope.getSymboles().get(i),adress);
        }
        for(int j =0;j<currentScope.getChildren().size();j++){
            List<Symbole> child = currentScope.getChildren().get(j).getSymboles();
            for(int i =0;i<currentScope.getChildren().get(j).getSymboles().size();i++){
                currentScope.getChildren().get(j).getSymboles().get(i).setAddress(adress);
                getAddress(currentScope.getChildren().get(j).getSymboles().get(i),adress);
            }
        }    
            
    }    
    public Scope getScope(){
        return currentScope;
    }
    
    private  int getAddress (Symbole symbole, int add){
        if(symbole.getIsArray()){
            int taille = symbole.getLength().length;
            if(taille == 1) return add + 1 + symbole.getLength()[0];
            else return add + 1 + (symbole.getLength()[0]*symbole.getLength()[0]);
        }
        else return add++;
    }
}
