package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by cgrad01 on 7/11/17.
 */
public class Player {
    private int number;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Integer> guesses = new ArrayList<>();

    public void guessNumber(){
        System.out.println("Guess a number:");
        number = scanner.nextInt();
        guesses.add(number);
    }

    public int getNumber() {
        return number;
    }
    public ArrayList<Integer> getGuesses() {
        return guesses;
    }
}
