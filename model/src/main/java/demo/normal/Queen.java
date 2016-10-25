package demo.normal;

import demo.model.KnifeBehavior;

/**
 * Created by demi on 16/10/25.
 */
public class Queen extends Character {
    public Queen(String name) {
        this.name = name;

    }
    @Override
    public void fight() {
        System.out.println(name + "使用匕首刺杀");
    }
}
