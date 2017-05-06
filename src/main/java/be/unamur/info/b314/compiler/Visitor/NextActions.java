package be.unamur.info.b314.compiler.Visitor;

/**
 * Created by Nathalie Masudi on 24/04/2017.
 */
public enum NextActions {
    doNothing(0),
    move_north(1),
    move_east(2),
    move_south(3),
    move_west (4),
    shoot_north (5),
    shoot_east (6),
    shoot_south (7),
    shoot_west (8),
    use_map (9),
    use_radio (10),
    use_fruit (11),
    use_soda (12);


    private final int representation;

    NextActions(int i) {
        this.representation = i;
    }

    int getValue(){
        return representation;
    }
}
