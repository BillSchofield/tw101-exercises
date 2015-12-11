package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float totalArea = 0;

        for(Rectangle rectangle : rectangles){
            totalArea += rectangle.area();
        }

//        System.out.println("Total Area is: " + totalArea);
//        System.out.println("Num of Rectangles: " + rectangles.length);

        return totalArea / rectangles.length;
    }
}
