package demo.normal;

import demo.model.SwordBehavior;

/**
 * Created by demi on 16/10/25.
 */
public class King extends Character {

    public King(String name) {
        this.name = name;
    }

    @Override
    public void fight() {
        System.out.println(name + "使用宝剑⚔飞舞");
    }
}
