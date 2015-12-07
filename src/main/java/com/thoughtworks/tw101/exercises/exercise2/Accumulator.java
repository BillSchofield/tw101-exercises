package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int total;

    public Accumulator() {
        total = 0;
    }

    public void increment() {
        total += 1;
    }

    public int getTotal(){
        return total;
    }
}
