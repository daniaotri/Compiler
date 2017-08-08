package be.unamur.info.b314.compiler.Visitor;

/**
 * Created by Dania Otri on 21/07/2017.
 */
public enum SquareType {
    dirt (0),
    rock (1),
    vines (2),
    zombie (3),
    ennemi (4),
    player (5),
    map (6),
    radio (7),
    ammo (8),
    fruit (9),
    soda (10);

    private final int representation;

    SquareType(int i) {
        this.representation = i;
    }

    int getValue(){
        return representation;
    }
}
