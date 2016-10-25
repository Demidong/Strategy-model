package demo.model;

/**
 * Created by demi on 16/10/25.
 */
public class MagicBehavior implements WeaponBehavior {
    public void useWeapon(String name) {
        System.out.println(name + "使用魔法迷惑");
    }
}
