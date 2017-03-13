/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.scope;

import java.util.ArrayList;
import java.util.Map;

/**
 *Scope est un groupe de symboles
 * 
 * @author jessi
 */
public interface Scope {

    /*
    * @return le Scope Parent
    **/
    public Scope getParent();
    /*
    *@return la liste des Scopes enfants 
    **/
    public ArrayList<Scope> getChildren();
    /*
    *@return les symboles du scope
    **/
    public Map<String, ArrayList<Symbole>> getSymboles();
    
    /*
    *Permet d'ajouter un Scope enfant
    * @param child l'enfant à ajouter
    **/
    public void addChildScope(Scope child);
    
    /**
     *Definit un symbole du scope
     *
     @param symbole le symbole à définir
     */
    public void DefineSymbole(Symbole symbole);
    
    /**
     *
     * @param name le nom du symbole
     * @return le symbole si existe, sinon null
     */
    public Symbole resolve(String name);

}
