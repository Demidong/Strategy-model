package demo.model;

/**
 * Created by demi on 16/10/25.
 */
public abstract class Character {
    protected WeaponBehavior weaponBehavior;
    protected String name;

    public void fight() {
        weaponBehavior.useWeapon(name);
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

}
