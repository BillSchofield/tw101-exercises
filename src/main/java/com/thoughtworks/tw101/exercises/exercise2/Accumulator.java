package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    int count;

    void increment() {
        count += 1;
    }

    void total() {
        System.out.println(count);
    }
}
