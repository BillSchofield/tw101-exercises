package com.thoughtworks.tw101.introductory_programming_exercises;

//FizzBuzz Exercise
//        FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to
//        certain rules.
//
//        Create a fizzBuzz() method that prints out the numbers 1 through 100.
//        Instead of numbers divisible by three print "Fizz".
//        Instead of numbers divisible by five print "Buzz".
//        Instead of numbers divisible by three and five print "FizzBuzz".
//
//        Sample Output:
//        1
//        2
//        Fizz
//        4
//        Buzz
//        Fizz
//        7
//        8
//        Fizz
//        Buzz
//        11
//        Fizz
//        13
//        14
//        FizzBuzz

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz();
    }

    private static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(convertNumber(i));
        }

    }
    private static String convertNumber(int number) {
        String output = "";

        if (number % 3 == 0) {
            output += "Fizz";
        }

        if (number % 5 == 0) {
            output += "Buzz";
        }

        if (output.equals("")) {
            output += number;
        }

        return output;

    }
}
