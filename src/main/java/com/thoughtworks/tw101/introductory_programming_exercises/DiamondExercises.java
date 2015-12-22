package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
//        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
//        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int width = (2*n - 1);
        for(int i = 1; i <= n; i++){
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

        for(int i = (n-1); i > 0; i--){
            System.out.println(centeredRow(starsForRow(i), (2*n -1)));
        }

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

    }

    private static String starsForRow(int n) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < (2*n - 1); i++){
            sb.append("*");
        }

        return sb.toString();
    }

    private static String centeredRow(String stars, int width) {

        int padding = width - stars.length();
//        System.out.println("Current Padding is: " + padding);
//        System.out.println("Current Stars Size is: " + stars.length());

        if (padding == 0) {
            return stars;
        } else {
            int sizeWithRightPadding = stars.length() + (padding / 2);
            String formattedString = String.format("%" + sizeWithRightPadding + "s", stars);
            return  formattedString;
        }

    }
}
