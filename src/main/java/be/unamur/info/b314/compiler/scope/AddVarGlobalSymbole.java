/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.scope;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jessi
 */
public class AddVarGlobalSymbole {
 
    private Scope currentScope;
    private String [] lesEntiers = {"grid size","latitude","longitude","map count","radio count","fruits count","soda count","life"};
    private String [] lesBooleans = {"ennemi is north","ennemi is south","ennemi is east","ennemi is west","graal is north","graal is south","graal is east","graal is west"};
    private String [] lesCases = {"dirt","rock","vines","zombie","player","ennemi","map","radio","ammo","fruits","soda"};

    public AddVarGlobalSymbole(Scope currentScope) {
        this.currentScope = currentScope;
    }
    
    public Scope getScope(){
        AddNewSymbole(createListSymbole(lesEntiers, "integer"));
        AddNewSymbole(createListSymbole(lesBooleans, "boolean"));
        AddNewSymbole(createListSymbole(lesCases, "square"));
        return currentScope;
    }
    
    public Symbole addSymbole(String name,String type){
        Symbole symbole = new Symbole(name);
        symbole.setType(type);
        return symbole;
    }    
    public ArrayList<Symbole> createListSymbole(String [] args, String type){
        ArrayList<Symbole> liste = new ArrayList<>();
        for (int i = 0; i<args.length;i++)
            liste.add(addSymbole(args[i], type));
        return liste;
    }
    public void AddNewSymbole(ArrayList<Symbole> liste){
        for(int i = 0;i<liste.size();i++)
            currentScope.AddSymbole(liste.get(i));
    }
}
