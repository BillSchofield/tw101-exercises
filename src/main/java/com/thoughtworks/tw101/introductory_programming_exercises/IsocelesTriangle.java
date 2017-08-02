package com.thoughtworks.tw101.introductory_programming_exercises;

/**
 * Created by cgrad01 on 7/25/17.
 */
public class IsocelesTriangle extends Triangle{

    @Override
    public void printStars(int i, int n) {
        for (int j = 1; j<i+2; j++){
            if(j==1){
                addSpaces(n-i);
            }
            System.out.print("*");
        }
    }
}
