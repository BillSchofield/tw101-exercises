package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by cgrad01 on 7/10/17.
 */
public class Troll implements Monster {
    int hitPoints = 40;
    String name = "Troll";

    @Override
    public void reportStatus() {
        System.out.println(name + " with " + hitPoints + " hit points remaining.");
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= (amount/2);
    }

}
