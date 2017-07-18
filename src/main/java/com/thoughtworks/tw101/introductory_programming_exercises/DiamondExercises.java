package com.thoughtworks.tw101.introductory_programming_exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(5);
//        drawADiamond(8);
//        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
//           *******
//          *********
    private static void drawAnIsoscelesTriangle(int n) {
        for(int i=0; i<=n+2; i+=2){
            for (int j = 1; j<i+2; j++){
                if(j==1){
                    for(int k = 0; k<(n-i)+1; k+=2){
                        System.out.print(" ");
                    }
                }
                    System.out.print("*");
                }
                System.out.println();
            }
        }



//    for(String printLine :lines){
//            for(int i = 0; i<lines.indexOf(printLine)+(lines.size()); i+=2){
//        printLine = " " + printLine;
//
//    }
//            System.out.println(lines.indexOf(printLine));
//            System.out.println(printLine);
//}

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {

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
}
