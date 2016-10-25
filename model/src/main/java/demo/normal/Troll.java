package demo.normal;

import demo.model.MagicBehavior;

/**
 * Created by demi on 16/10/25.
 */
public class Troll extends Character {
    public Troll(String name) {
        this.name = name;
    }
    @Override
    public void fight() {
        System.out.println(name + "使用魔法迷惑");
    }
}
