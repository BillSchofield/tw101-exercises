package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by cgrad01 on 7/11/17.
 */
public class Player {
    private int number;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Integer> guesses = new ArrayList<>();

    public void guessNumber() throws InputMismatchException {
        do {
            System.out.println("Guess a number:");
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Not a valid guess");
            }
            scanner.nextLine();
        } while (number == 0);
        guesses.add(number);
    }

    public int getNumber() {
        return number;
    }
    public ArrayList<Integer> getGuesses() {
        return guesses;
    }
}
