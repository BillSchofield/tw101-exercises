package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NumberGuesser {
    private int secretNumber;
    private int currentGuess;
    private List<Integer> guesses;

    public NumberGuesser() {
        secretNumber = (int) (Math.random() * 100 + 1);
        currentGuess = -1;
        guesses = new ArrayList<Integer>();
    }

    public void play() {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print(Messages.requestGuess());

            try {
                currentGuess = input.nextInt();
                guesses.add(currentGuess);
                checkGuess(currentGuess);
            } catch (InputMismatchException error) {
                currentGuess = -1;
                System.out.println("Sorry, that's not a valid guess");
                input.next();
            }

        } while (currentGuess != secretNumber);

        System.out.println("Your guesses: " + guesses);
    }

    private void checkGuess(int currentGuess) {
        if (currentGuess == secretNumber) {
            System.out.println(Messages.winGame(secretNumber));
        } else if (currentGuess < secretNumber && currentGuess > 0) {
           System.out.println(Messages.low());
        } else {
            System.out.println(Messages.high());
        }
    }
}
