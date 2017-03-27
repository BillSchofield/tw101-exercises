package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class NumberGuesser {
    private int secretNumber;
    private int guess;

    public NumberGuesser() {
        secretNumber = (int) (Math.random() * 100 + 1);
        guess = -1;
    }

    public void play() {

        System.out.println("DEBUG: The secret number is " + secretNumber);

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter a guess");

            guess = input.nextInt();

            System.out.println("Your guess is " + guess);

            checkGuess(guess);

        } while (guess != secretNumber);

        System.out.println("You guessed the number!");
    }

    private void checkGuess(int guess) {
        if (guess < secretNumber && guess > 0) {
           System.out.println("Guess is too low");
        } else {
            System.out.println("Guess is too high");
        }

    }
}
