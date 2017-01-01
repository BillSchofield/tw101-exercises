package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;
        while (number <= 100){
            if (number % 2 == 1){
                sum += number;
                System.out.println(number);
            }
            number++;
        }
        System.out.println("The sum total of all odd numbers from 1 to 100 is " + sum);
    }
}
