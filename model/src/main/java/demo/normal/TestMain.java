package demo.normal;


/**
 * Created by demi on 16/10/25.
 */
public class TestMain {
    public static void main(String args[]) {
        Character king = new King("国王");
        king.fight();
        Character troll = new Troll("妖怪");
        troll.fight();
    }
}
