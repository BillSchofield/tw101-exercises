package com.thoughtworks.tw101.exercises.exercise6;

public class Troll {
    public int hitpoints;

    public Troll() {
        hitpoints = 40;
    }

    public void takeDamage(int amount) {
        hitpoints -=  amount/2;
    }

    public void reportStatus() {
        System.out.println("Current health: " + hitpoints);
    }
}
