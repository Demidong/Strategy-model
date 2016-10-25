package demo.model;

/**
 * Created by demi on 16/10/25.
 */
public class King extends Character {

    public King(String name) {
        this.name = name;
        weaponBehavior = new SwordBehavior();
    }

}
