package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by cgrad01 on 7/10/17.
 */
public class Troll implements Monster {
    private int hitPoints;
    private String name;

    public Troll() {
        name = "Troll";
        hitPoints = 40;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + " with " + hitPoints + " hit points remaining.");
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= (amount/2);
    }

}
