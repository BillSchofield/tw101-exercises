package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses - done
// and print them out once they guess correctly. -done
// Use an ArrayList to store the guesses. -done
// Catch the NumberFormatException and handle the case -done
// where the user entered a String that is not parseable.

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Player playerOne = new Player();
        Game newGame = new Game(playerOne);
        newGame.play();
    }
}
