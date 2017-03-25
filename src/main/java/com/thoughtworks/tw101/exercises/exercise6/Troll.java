package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private int hitpoints;
    private String name;

    public Troll() {
        hitpoints = 40;
        name = "Troll";
    }

    public void takeDamage(int amount) {
        hitpoints -=  amount/2;
    }

    public void reportStatus() {
        System.out.println(String.format("%s: %s hitpoints", name, hitpoints));
    }
}
