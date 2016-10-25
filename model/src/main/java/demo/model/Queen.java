package demo.model;

/**
 * Created by demi on 16/10/25.
 */
public class Queen extends Character {
    public Queen(String name) {
        this.name = name;
        weaponBehavior = new KnifeBehavior();
    }

}
