package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by cgrad01 on 7/11/17.
 */
public class Game {

    private int number;
    private Player user;

    public Game(Player user) {
        this.user = user;
    }

    private void setNumber(){
         number = (int) (Math.random() * 100);
    }

    public void play() {
        setNumber();
        System.out.println(number);
        while (number != user.getNumber()) {
            System.out.println("Guess again!");
            user.guessNumber();
        }
        System.out.println("You win!");
    }
}
