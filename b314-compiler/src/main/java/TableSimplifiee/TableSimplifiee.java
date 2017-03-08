/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableSimplifiee;

/**
 *
 * @author Charles
 */

    import java.util.Map;
    import java.util.HashMap;
    /*import java.util.LinkedList;
    import java.util.List;
    import java.util.ListIterator;*/




public class TableSimplifiee<K,V> {
    
    Map<String, Map<K,V>> laTable = new HashMap<>();
    
    public TableSimplifiee(){
        
    }
    
    public void ajoutLigne(String globalKey){
        laTable.put(globalKey, null);
    }
    
    public void ajoutLigne(String globalKey, Map<K,V> newMap){
        laTable.put(globalKey, newMap);
    }
    
    public void ajoutValeur(String place,K key,V value) throws AlreadyExistsException{
        laTable.get(place).put(key, value);
    }
    
    
    public void supprimerValeur(String place,K key){
        laTable.get(place).remove(key);
    }
    
    
    
    
}
