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
public class ScopeBase implements Scope{
    
    /*Le scope parent*/
    Scope Parent;
    
    /*Liste des tous les scopes inckus dans le scope*/
    ArrayList<Scope> Children;   
    
    /*Liste des symboles du scope*/
    Map<String, ArrayList<Symbole>> symboles;

    public ScopeBase(Scope Parent) {
        this.Parent = Parent;
        this.Children = new ArrayList();
        this.symboles = new LinkedHashMap<>();
    }
    
        
    @Override
    public void addChildScope(Scope child) {
        if(!Children.contains(child))Children.add(child);
    }

    @Override
    public void define(Symbole symbole) {
        symboles.get(symbole.type).add(symbole);
    }

    /**
     *
     * @param name le nom du symbole
     * @param type le type du symbole
     * @return le symbole si existe, sinon null
     */
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

    @Override
    public String toString() {
       
        String result ="";
        for(final String key:symboles.keySet())
            for(Symbole symbole: symboles.get(key))
                result +=" "+key+" : "+symbole.getName()+ ";\n";
        for(Scope scope: Children) result += scope.toString() +"\n";
        return result;
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

    @Override
    public void define(String[] type) {
        if(type != null) for(String s:type) symboles.put(s, new ArrayList<Symbole>());
    }
    
    
}
