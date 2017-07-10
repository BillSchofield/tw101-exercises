package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by cgrad01 on 7/10/17.
 */
public class Orc implements Monster {

    private int hitPoints;
    private String name;

    public Orc() {
        name = "Orc";
        hitPoints = 20;
    }
    @Override
    public void reportStatus() {
        System.out.println(name + " with " + hitPoints + " hit points remaining.");
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;
    }
}
