package be.unamur.info.b314.compiler.Visitor;

/**
 * Created by Nathalie Masudi on 06/05/2017.
 */
public enum Case {

        square('s');

        private final int representation;

        Case(char c) {
            this.representation = c;
        }

        int getValue(){
            return representation;
        }
    }


