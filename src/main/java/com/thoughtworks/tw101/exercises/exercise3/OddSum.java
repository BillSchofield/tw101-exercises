package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {
    private int adjuster = 0;
    private int sum = 0;

    private void setAdjuster(int start) {
        if (start%2 == 0){
            adjuster = 1;
        }
    }
    public int of(int start, int end) {
        setAdjuster(start);
        for (int i = start + adjuster; i < end; i+=2){
            sum += i;
        }
        return sum;
    }
}
