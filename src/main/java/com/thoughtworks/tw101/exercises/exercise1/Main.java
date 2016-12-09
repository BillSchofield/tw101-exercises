package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            if ( i % 2 != 0 ) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("The sum of all these odd numbers is " + sum);
    }
}
