package be.unamur.info.b314.compiler.Visitor;

/**
 * Created by Nathalie Masudi on 24/04/2017.
 */
public enum NextActions {
    doNothing(0);

    private final int representation;

    NextActions(int i) {
        this.representation = i;
    }

    int getValue(){
        return representation;
    }
}
