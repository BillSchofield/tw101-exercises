package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {

    public static IsocelesTriangle triangle = new IsocelesTriangle();
    public static UpsideDownTriangle upsideDownTriangle = new UpsideDownTriangle();
    public static TriangleWithName triangleWithName = new TriangleWithName();

    public static void main(String[] args) {
        drawAnIsocelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
//           *******
//          *********
private static void drawAnIsocelesTriangle(int n) {
        triangle.draw(n);
}

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        triangle.draw(n);
        upsideDownTriangle.draw(n);
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
       triangleWithName.draw(n);
       upsideDownTriangle.draw(n);
    }
}
