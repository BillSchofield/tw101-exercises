package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

public class NumberGuesser {
    private int secretNumber;
    private int guess;

    public NumberGuesser() {
        secretNumber = (int) (Math.random() * 100 + 1);
        guess = -1;
    }

    public void play() {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print(Messages.requestGuess());
            guess = input.nextInt();
            checkGuess(guess);
        } while (guess != secretNumber);

    }

    private void checkGuess(int guess) {
        if (guess == secretNumber) {
            System.out.println(Messages.winGame(secretNumber));
        } else if (guess < secretNumber && guess > 0) {
           System.out.println(Messages.low());
        } else {
            System.out.println(Messages.high());
        }
    }
}
