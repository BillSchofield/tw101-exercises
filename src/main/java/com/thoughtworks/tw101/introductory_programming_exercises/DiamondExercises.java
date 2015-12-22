package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

    //    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int width = (2 * n - 1);
        drawAnIsoscelesTriangle(n, width);
    }

    private static void drawAnIsoscelesTriangle(int n, int width) {
        for (int i = 1; i <= n; i++) {
            System.out.println(centeredRow(starsForRow(i), width));
        }
    }

    private static void drawUpsideDownIsoscelesTriangle(int n){
        int width = (2 * n - 1);
        drawUpsideDownIsoscelesTriangle(n, width);
    }

    private static void drawUpsideDownIsoscelesTriangle(int n, int width) {
        int offset = n - 1;

        for (int i = offset; i > 0; i--) {
            System.out.println(centeredRow(starsForRow(i), width));
        }
    }

    //    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawUpsideDownIsoscelesTriangle(n);
    }

    //    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        String name = "Rebecca";

        drawAnIsoscelesTriangle(n-1, name.length());
        System.out.println(name);
        drawUpsideDownIsoscelesTriangle(n, name.length());

    }

    private static String starsForRow(int n) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < (2 * n - 1); i++) {
            sb.append("*");
        }

        return sb.toString();
    }

    private static String centeredRow(String stars, int width) {

        int padding = width - stars.length();

        if (padding == 0) {
            return stars;
        } else {
            int sizeWithRightPadding = stars.length() + (padding / 2);
            return String.format("%" + sizeWithRightPadding + "s", stars);
        }

    }
}
