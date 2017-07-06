package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int total = 0;
        for(Rectangle rectangle : rectangles){
            total += rectangle.area();
        }
        return total/rectangles.length;
    }
}
