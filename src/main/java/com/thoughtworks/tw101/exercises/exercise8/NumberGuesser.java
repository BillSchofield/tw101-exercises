package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

public class NumberGuesser {
    private int secretNumber;
    private int currentGuess;

    public NumberGuesser() {
        secretNumber = (int) (Math.random() * 100 + 1);
        currentGuess = -1;

    }

    public void play() {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print(Messages.requestGuess());
            currentGuess = input.nextInt();
            checkGuess(currentGuess);
        } while (currentGuess != secretNumber);

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
