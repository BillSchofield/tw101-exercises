package com.thoughtworks.tw101.introductory_programming_exercises;

/**
 * Created by cgrad01 on 7/25/17.
 */
public class TriangleWithName extends Triangle {
    @Override
    public void printStars(int i, int n) {
        if (i==n+2-n%2){
            printName();
        } else {
            for (int j = 1; j<i+2; j++){
                if(j==1){
                    addSpaces(n-i);
                }
            System.out.print("*");
            }
        }
    }

    public static void printName(){
        System.out.print("Corey");
    }
}
