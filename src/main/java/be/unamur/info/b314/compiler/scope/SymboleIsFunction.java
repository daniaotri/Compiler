/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.scope;

import java.util.ArrayList;

/**
 *
 * @author jessi
 */
public class SymboleIsFunction extends Symbole implements Scope{
    
    public SymboleIsFunction(Scope Parent, String nom) {
        super(nom);
        this.Parent = Parent;
        this.name = name;
    }
 /*Le scope parent*/
    private Scope Parent;
    /*le nom du scope*/
    private String name;
    
    /*Liste des tous les scopes inckus dans le scope*/
    private ArrayList<Scope> Children;   
    
    /*Liste des symboles du scope*/
    private ArrayList<SymboleIsFunction> symboles;
    
    private ArrayList<SymboleIsFunction> MyFunction;

    public ArrayList<SymboleIsFunction> getMyFunction() {
        return MyFunction;
    }

    public void setMyFunction(ArrayList<SymboleIsFunction> MyFunction) {
        this.MyFunction = MyFunction;
    }
 
    @Override
    public void addChildScope(Scope child) {
        String nameChild = child.GetName();
        Scope scope = WhoIsThisScope(nameChild);
        if(scope==null){
            Children.add(child);
        }
        else throw new RuntimeException();    
    }

    @Override
    public void AddSymbole(Symbole symbole) {
        if(symbole == null)throw new RuntimeException();
        String name = symbole.getName();
        if(symboles != null ){
            Symbole sym=FoundSymbole(name);
            if ((sym!= null)) throw new RuntimeException();
        }
        if(symboles.contains(symbole))throw new RuntimeException();
        else symboles.add((SymboleIsFunction) symbole);
        //symboles.add(symbole);
    }
    /**
     * @param name le nom du symbole
     * @return le symbole si existe, sinon null
     */
    @Override
    public Symbole FoundSymbole(String name) {        
        Symbole symbole = null;
        
        /*Verifier si le symbole a déjà était trouvé*/
        for(int position = 0;position<symboles.size();position++){
            if(name.equals(symboles.get(position).getName()))symbole = symboles.get(position); /*Le symbole est trouvé*/
        }
        if(symbole!=null)return symbole; 
        else if(Parent != null)return Parent.FoundSymbole(name);
        
        /*Ausun symbole trouvé*/
        else return null;
    }
    
    @Override
    public Scope WhoIsThisScope(String name){
        Scope scope = null;
        if(Children.size()!=0)
        {
            for (int i = 0;i<Children.size();i++){
                String result = Children.get(i).GetName();
                if(result.equals(name)){
                  scope= Children.get(i); 
                  break;
                }} 
        }
            return scope;
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
    public ArrayList<Symbole> getSymboles() {
        return null;
    }

    @Override
    public String GetName() {
        return name;
    }
    
    public void CorrectEveryThing(){
        deleteDuplicateSCope();
        String type = null;
        for(int i=0;i<symboles.size();i++){
            type =symboles.get(i).getType();
            if(type==null){
                if((symboles.get(i).getIsFunction())){
                    Scope scope = WhoIsThisScope(symboles.get(i).getName());
                    if(scope==null)throw new RuntimeException();
                    else{
                        Symbole symbole = scope.FoundSymbole(symboles.get(i).getName());
                        if(symbole == null)throw new RuntimeException();
                        else{
                            String type1= symbole.getType();
                            symboles.get(i).setType(type1);
                        }
                    }
                }
                else throw new RuntimeException();
            }
            
        }
    }
    @Override
    public void deleteDuplicateSymbole(){
        String name=null;
        if(symboles.size()>0){
            name=symboles.get(0).getName();
            for(int i=1;i<symboles.size();i++){
                if(name.equals(symboles.get(i).getName())) throw new RuntimeException();
                name=symboles.get(i).getName();
            }
        }        
    }
    @Override
    public void deleteDuplicateSCope(){
        String name=null;
        Scope scope=null;
        if(Children.size()>0){
            scope=Children.get(0);
            name=scope.GetName();
            for(int i=1;i<Children.size();i++){
                if(name.equals(Children.get(i).GetName())) throw new RuntimeException();
                scope=Children.get(i);
                name = scope.GetName();
                scope.deleteDuplicateSymbole();                
            }
        }
        
    }

    @Override
    public String toString() {
        return "SymboleIsFunction{" + "Parent=" + Parent + ", name=" + name + ", Children=" + Children + ", symboles=" + symboles + ", MyFunction=" + MyFunction + '}';
    }

}
