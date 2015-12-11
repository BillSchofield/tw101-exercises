package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public OddSum() {}

    public int of(int start, int stop) {

        int sum = 0;

        for(int i = start; i < stop; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }

        return sum;

    }
}
