package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        List<Integer> primeFactors2 = generate(34);
        List<Integer> primeFactors3 = generate(36);
        List<Integer> primeFactors4 = generate(5);
        List<Integer> primeFactors5 = generate(2);
        System.out.println(primeFactors);
        System.out.println(primeFactors2);
        System.out.println(primeFactors3);
        System.out.println(primeFactors4);
        System.out.println(primeFactors5);
    }

    private static List<Integer> generate(int n) {
        ArrayList<Integer> factors = getFactors(n);
        ArrayList<Integer> results = new ArrayList<>(factors);
        for(int factor : factors){
            ArrayList<Integer> moreFactors = getFactors(factor);
            if(moreFactors.size() > 0){
                results.remove(factors.indexOf(factor));
                results.addAll(moreFactors);
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
