package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    private String name;
    private int hp;

    public Orc() {
        name = "Orc";
        hp = 20;
    }

    @Override
    public void takeDamage(int amount) {
        hp -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println("----------");
        System.out.println("Status Report for: " + name);
        System.out.println("Blurgh my health is at: " + hp + " hitpoints.");
        System.out.println("----------");
    }
}
