/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.scope;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Implemente l'interface Scope
 * 
 * @author jessi
 */
public class ScopeImpl implements Scope{
    
    /*Le scope parent*/
    Scope Parent;
    /*le nom du scope*/
    String name;
    
    /*Liste des tous les scopes inckus dans le scope*/
    ArrayList<Scope> Children;   
    
    /*Liste des symboles du scope*/
    Map<String, ArrayList<Symbole>> symboles;

    public ScopeImpl(String st) {
        this.name = st;
        this.Children = new ArrayList();
        this.symboles = new LinkedHashMap<>();
        this.Parent = Parent;
    }
    
    public ScopeImpl(String st,Scope parent) {
        this.name = st;
        this.Children = new ArrayList();
        this.symboles = new LinkedHashMap<>();
        this.Parent = parent;
    }
        
    @Override
    public void addChildScope(Scope child) {
        if(!Children.contains(child)) Children.add(child);
    }

    @Override
    public void AddSymbole(Symbole symbole) {
        symboles.get(symbole.getName()).add(symbole);
    }

    /**
     * @param name le nom du symbole
     * @return le symbole si existe, sinon null
     */
    @Override
    public Symbole FoundSymbole(String name) {
        
        /*Recupérer la liste des symboles portant le type donné en paramètre*/
        ArrayList<Symbole> TSymboles = symboles.get(name);
        
        Symbole symbole = null;
        /*Verifier si le symbole a déjà était trouvé*/
        for(int position = 0;position<TSymboles.size();position++){
            if(name.equals(TSymboles.get(position).getName())) symbole = TSymboles.get(position); /*Le symbole est trouvé*/
        }
        if(symbole!=null)return symbole; 
        if(Parent != null)return Parent.FoundSymbole(name);
        return null; /*Ausun symbole trouvé*/
       
    }

    /**
     *
     * @return le scope parent
     */
    @Override
    public Scope getParent() {
        return Parent;
    }

    /**
     *
     * @return la liste des enfants
     */
    @Override
    public ArrayList<Scope> getChildren() {
        return Children;
    }

    /**
     *
     * @return
     */
    @Override
    public Map<String, ArrayList<Symbole>> getSymboles() {
        return symboles;
    }

}
