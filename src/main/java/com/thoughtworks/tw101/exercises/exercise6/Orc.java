package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    private int hitpoints;
    private String name;

    public Orc() {
        hitpoints = 20;
        name = "Orc";
    }

    public void takeDamage(int amount) {
        hitpoints -=  amount;
    }

    public void reportStatus() {
        System.out.println(String.format("%s: %s hitpoints", name, hitpoints));
    }

}
