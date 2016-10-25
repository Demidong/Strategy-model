package demo.model;

/**
 * Created by demi on 16/10/25.
 */
public class Troll extends Character {
    public Troll(String name) {
        this.name = name;
        weaponBehavior = new MagicBehavior();
    }
}
