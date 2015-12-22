package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);

        for( int factor : primeFactors){
            System.out.println(factor);
        }
    }

    private static List<Integer> generate(int n, int divisor){

        if (n < 2) return new ArrayList();
        if (n % divisor == 0) {
            List<Integer> factors = generate((n/divisor), divisor);
            factors.add(divisor);
            Collections.sort(factors); // Horribly hacky :-/
            return factors;
        } else {
            return generate(n, divisor + 1);
        }

    }

    private static List<Integer> generate(int n) {

        return generate(n, 2);
    }
}
