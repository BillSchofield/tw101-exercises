package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;

        while (counter < 100) {
            if (counter % 2 != 0){
                System.out.println(counter);
                sum += counter;
            }

            counter += 1;
        }

        System.out.println(sum);
    }
}
