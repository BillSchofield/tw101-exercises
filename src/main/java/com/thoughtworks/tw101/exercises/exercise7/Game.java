package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

/**
 * Created by cgrad01 on 7/11/17.
 */
public class Game {

    private final int NUMBER = new Random().nextInt(100)+1;
    private Player player;

    public Game(Player player) {
        this.player = player;
    }

    private void evaluateGuess(int guess){
        System.out.println((NUMBER < guess ? "Too high" : "Too low"));
    }

    public void play() {
        player.guessNumber();
        while (NUMBER != player.getNumber()) {
            evaluateGuess(player.getNumber());
            player.guessNumber();
        }
        System.out.println("You win!");
    }
}
