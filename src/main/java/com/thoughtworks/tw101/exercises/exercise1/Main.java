package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i);
            total+=i;
        }
        System.out.println(total);
    }
}
