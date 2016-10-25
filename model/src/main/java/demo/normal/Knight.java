package demo.normal;

import demo.model.BowAndArrowBehavior;

/**
 * Created by demi on 16/10/25.
 */
public class Knight extends Character {
    public Knight(String name) {
        this.name = name;
    }

    @Override
    public void fight() {
        System.out.println(name + "使用弓箭射击");
    }
}
