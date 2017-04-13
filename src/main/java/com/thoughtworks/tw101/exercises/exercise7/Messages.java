package com.thoughtworks.tw101.exercises.exercise7;

public class Messages {
    public static String intro() {
        return "Welcome to number guesser! I've selected a random number between 1 and 100.";
    }
    public static String requestGuess() {
        return "Please enter a guess: ";
    };

    public static String low() {
        return "Too low, Guess again!";
    }

    public static String high() {
        return "Too high, Guess again!";
    }

    public static String winGame(int secret) {
        return String.format("You guessed the number! The secret number was %s", secret);
    }
}
