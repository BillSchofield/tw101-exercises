package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

/**
 * Created by cgrad01 on 7/11/17.
 */
public class Player {
    private int number;
    private Scanner scanner = new Scanner(System.in);

    public void guessNumber(){
        System.out.println("Guess a number:");
        number = scanner.nextInt();
    }

    public int getNumber() {
        return number;
    }
}
