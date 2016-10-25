package demo.model;

/**
 * Created by demi on 16/10/25.
 */
public class Knight extends Character {
    public Knight(String name) {
        this.name = name;
        weaponBehavior = new BowAndArrowBehavior();
    }
}
