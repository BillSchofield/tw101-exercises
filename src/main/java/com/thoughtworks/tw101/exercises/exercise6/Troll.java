package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private String name;
    private int hp;

    public Troll(){
        name = "Troll";
        hp = 40;
    }

    @Override
    public void takeDamage(int amount){
        hp -= (0.5 * amount);
    }

    @Override
    public void reportStatus(){
        System.out.println("----------");
        System.out.println("Status report for: " + name);
        System.out.println("Trunggh my health is at " + hp + " healthpoints.");
        System.out.println("----------");
    }
}
