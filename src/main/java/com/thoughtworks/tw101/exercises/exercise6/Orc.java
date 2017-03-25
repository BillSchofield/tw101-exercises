package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    public int hitpoints;

    public Orc() {
        hitpoints = 20;
    }

    public void takeDamage(int amount) {
        hitpoints -=  amount;
    }

    public void reportStatus() {
        System.out.println("Current health: " + hitpoints);
    }

}
