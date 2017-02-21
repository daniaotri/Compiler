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
            
    public SymboleScope(String name, String type) {
        super(name, type);
    }

    public SymboleScope(Scope Parent, String name, String type) {
        super(name, type);
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
        symboles.get(symbole.type).add(symbole);
    }

    @Override
    public Symbole resolve(String name, String type) {
        
        /*Recupérer la liste des symboles portant le type donné en paramètre*/
        ArrayList<Symbole> TSymboles = symboles.get(type);
        Symbole symbole = null;
        /*Verifier si le symbole a déjà était trouvé*/
        for(int position = 0;position<TSymboles.size();position++){
            if(name.equals(TSymboles.get(position).getName())) symbole = TSymboles.get(position); /*Le symbole est trouvé*/
        }
        if(symbole!=null)return symbole; 
        if(Parent != null)return Parent.resolve(name, type);
        return null; /*Ausun symbole trouvé*/
    }

    public String getScopeName() {
        return super.name;
    }

    @Override
    public void addChildScope(Scope child) {
        if(!Children.contains(child))Children.add(child);
    }

    @Override
    public void define(String[] type) {
       if(type != null) for(String s:type) symboles.put(s, new ArrayList<Symbole>());
    }
    
}
