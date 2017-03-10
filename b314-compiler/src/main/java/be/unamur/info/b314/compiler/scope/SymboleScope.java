/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.scope;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author jessi
 */
public class SymboleScope extends Symbole implements Scope {
    
    /*Le scope parent*/
    Scope Parent;
    
    /*Liste des tous les scopes inckus dans le scope*/
    ArrayList<Scope> Children;   
    
    /*Liste des symboles du scope*/
    Map<String, ArrayList<Symbole>> symboles;
    
    String type;
            
    public SymboleScope(String name) {
        super(name);
    }

    public SymboleScope(Scope Parent, String name) {
        super(name);
        this.Parent = Parent;
    }

    @Override
    public Scope getParent() {
        return Parent;
    }

    @Override
    public ArrayList<Scope> getChildren() {
        return Children;
    }

    @Override
    public Map<String, ArrayList<Symbole>> getSymboles() {
        return symboles;
    }

    @Override
    public void define(Symbole symbole) {
        symboles.get(symbole.name).add(symbole);
    }

    @Override
    public Symbole resolve(String name) {
        
        /*Recupérer la liste des symboles portant le type donné en paramètre*/
        ArrayList<Symbole> TSymboles = symboles.get(name);
        Symbole symbole = null;
        /*Verifier si le symbole a déjà était trouvé*/
        for(int position = 0;position<TSymboles.size();position++){
            if(name.equals(TSymboles.get(position).getName())) symbole = TSymboles.get(position); /*Le symbole est trouvé*/
        }
        if(symbole!=null)return symbole; 
        if(Parent != null)return Parent.resolve(name);
        return null; /*Ausun symbole trouvé*/
    }

    public String getScopeName() {
        return super.name;
    }

    @Override
    public void addChildScope(Scope child) {
        if(!Children.contains(child))Children.add(child);
    }
    public void setType(String type){
        type = type;
    }
    
}
