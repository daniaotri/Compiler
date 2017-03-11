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
public class AlreadyExistsException extends Exception {
    
    public AlreadyExistsException() {
        super();
    }
    
    public AlreadyExistsException(String s){
        super(s);
    }
}
