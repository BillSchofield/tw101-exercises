package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. - done
// Then asks the user to enter a guess. - done
// If they guess right then tell them they win, - done
// otherwise tell them if they guessed too high or low. - done
// Keep asking the user to guess -done
// until they get the right answer. -done
// Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) {
        Player playerOne = new Player();
        Game newGame = new Game(playerOne);
        newGame.play();
    }
}
