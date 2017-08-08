package be.unamur.info.b314.compiler.scope;


import java.util.ArrayList;

/**
 * Created by Dano on 06/08/2017.
 */
public class AddGlobalSymbole
{
    private Scope currentScope;
    private String [] LesEnties = {"grid size","latitude","longitude","map count","radio count","fruits count","soda count","life"};
    private String [] lesBooleans = {"ennemi is north","ennemi is south","ennemi is east","ennemi is west","graal is north","graal is south","graal is east","graal is west"};
    private String [] lesCases = {"dirt","rock","vines","zombie","player","ennemi","map","radio","ammo","fruits","soda"};

    public AddGlobalSymbole (Scope currentScope){
        this.currentScope= currentScope;
    }

    public Scope getScope (){
        AddNewSymbole(createListSymbole(LesEnties, "integer"));
        AddNewSymbole(createListSymbole(lesBooleans, "boolean"));
        AddNewSymbole(createListSymbole(lesCases, "square"));
        return currentScope;
    }

    public void AddNewSymbole(ArrayList<Symbole> liste){
        for(int i = 0;i<liste.size();i++)
            currentScope.AddSymbole(liste.get(i));
    }

    public ArrayList<Symbole> createListSymbole ( String [] args, String type){
        ArrayList<Symbole> liste = new ArrayList<>();
        for (int i = 0; i<args.length;i++)
            liste.add(addSymbole(args[i], type));
        return liste;
    }

    public Symbole addSymbole (String name , String type ){
        Symbole symbole = new Symbole(name);
        symbole.setType(type);
        return symbole;
    }
}
