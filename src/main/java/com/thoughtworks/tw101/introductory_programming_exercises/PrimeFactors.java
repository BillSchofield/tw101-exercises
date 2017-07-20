package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println(generate(30));
        System.out.println(generate(1));
        System.out.println(generate(8987));
    }


    private static List<Integer> generate(int n) {
        ArrayList<Integer> factors = getFactors(n);
        ArrayList<Integer> results = getFactors(n);
        for(int factor : factors){
            if(getFactors(factor).size() > 0){
                results.remove(results.indexOf(factor));
            }
        }
        return results;
    }

    private static ArrayList<Integer> getFactors(int n){
        ArrayList<Integer> factors = new ArrayList<>();
        for(int i = 2; i < n; i++){
            if(n%i==0){
                factors.add(i);
            }
        }
        return factors;
    }



}
