package com.thoughtworks.tw101.introductory_programming_exercises;

/**
 * Created by cgrad01 on 7/25/17.
 */
public class UpsideDownTriangle extends Triangle {

    @Override
    public void printStars(int i, int n){
        for (int j = 1; j<=n-i+1-n%2; j++){
            if(j==1){
                addSpaces(i);
            }
            System.out.print("*");
        }
    }

}
