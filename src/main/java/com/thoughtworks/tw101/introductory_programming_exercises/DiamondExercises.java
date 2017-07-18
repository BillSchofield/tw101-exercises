package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(4);
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

    private static void drawAnUpsideDownTriangle(int n){
        for(int i=0; i < n+2; i+=2){
            for(int j = 1; j<=n-i+1-n%2; j++){
                if(j==1) {
                    for (int k = 0; k <= i; k += 2) {
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
            }
            System.out.println();
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
        drawAnUpsideDownTriangle(n);
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
        for(int i=0; i<=n+2; i+=2){
            for (int j = 1; j<i+2; j++){
                if(j==1){
                    for(int k = 0; k<(n-i)+1; k+=2){
                        System.out.print(" ");
                    }
                }
                if(i==n+2-n%2){
                    System.out.print("Corey");
                    break;
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        drawAnUpsideDownTriangle(n);
    }
}
