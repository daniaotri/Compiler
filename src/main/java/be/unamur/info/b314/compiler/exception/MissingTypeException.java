/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.exception;

/**
 *
 * @author jessi
 */
public class MissingTypeException extends Exception {

    public MissingTypeException(String message, Exception e) {
        super(message, e);
    }
    
    public MissingTypeException(){
        super("Type doesn't given");
    }
}