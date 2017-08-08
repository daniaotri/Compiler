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

    /**
    * @return the parent's scope
    */
    public Scope getParent();
    /**
    *@return the list children of scope
    */
    public ArrayList<Scope> getChildren();
    /**
    *@return the symboles of scope
    */
    public ArrayList<Symbole> getSymboles();

    public String GetName();

    public void setSeize (int s);

    public int getSize ();

    /**
    *Permet d'ajouter un Scope enfant
    * @param child l'enfant à ajouter
    */
    public void addChildScope(Scope child);
    /**
     *Definit un symbole du scope
     *
     @param symbole le symbole à définir
     */
    public void AddSymbole(Symbole symbole);
    /**
     *
     * @param name le nom du symbole
     * @return le symbole si existe, sinon null
     */
    public Symbole FoundSymbole(String name);
    

    public void deleteDuplicateSCope();

    public void deleteDuplicateSymbole();

    public Scope WhoIsThisScope(String name);
}
