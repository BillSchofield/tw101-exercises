package com.thoughtworks.tw101.introductory_programming_exercises;

/**
 * Created by cgrad01 on 7/25/17.
 */
public abstract class Triangle {

    public void draw(int n) {
        for(int i=0; i<=n+2; i+=2){
            printStars(i, n);
            System.out.println();
        }
    }

    public void addSpaces(int i) {
        for (int k = 0; k <= i; k += 2) {
            System.out.print(" ");
        }
    }

    public abstract void printStars(int i, int n);

}
