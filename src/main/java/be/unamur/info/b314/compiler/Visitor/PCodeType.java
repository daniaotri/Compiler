package be.unamur.info.b314.compiler.Visitor;

/**
 * Created by Dania Otri on 7/08/2017.
 */
public enum PCodeType {

        square('s'),
        INTEGER('i'),
        BOOLEAN('b'),
        VOID('v');


        private final int representation;

        PCodeType(char c) {
            this.representation = c;
        }

        int getValue(){
            return representation;
        }
    }


