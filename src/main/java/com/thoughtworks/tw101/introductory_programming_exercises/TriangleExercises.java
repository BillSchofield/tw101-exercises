package com.thoughtworks.tw101.introductory_programming_exercises;

public class TriangleExercises {
    public static void main(String[] args) {
        System.out.println("draw an asterisk:");
        drawAnAsterisk();
        System.out.println();

        System.out.println("draw a horizonal line:");
        drawAHorizontalLine(8);
        System.out.println();


        System.out.println("draw a vertical line:");
        drawAVerticalLine(3);
        System.out.println();


        System.out.println("draw a right triangle:");
        drawARightTriangle(3);
        System.out.println();

    }

//    Easiest exercise ever
//    Print one asterisk to the console.
//    Example: *
    private static void drawAnAsterisk() {
        System.out.print("*");
    }

//    Draw a horizontal line
//    Given a number n, print n asterisks on one line.
//    Example when n=8:  ********
    private static void drawAHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            drawAnAsterisk();
        }
    }

//    Draw a vertical line
//    Given a number n, print n lines, each with one asterisks
//    Example when n=3:
//            *
//            *
//            *
    private static void drawAVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            drawAnAsterisk();
            if (i < n -1) {
                System.out.println();
            }
        }
    }

//    Draw a right triangle
//    Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
//    Example when n=3:
//            *
//            **
//            ***
    private static void drawARightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            drawAHorizontalLine(i);
            System.out.println();
        }
    }
}
