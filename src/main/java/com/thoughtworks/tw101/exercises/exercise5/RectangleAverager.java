package com.thoughtworks.tw101.exercises.exercise5;

import java.util.Arrays;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int sum = Arrays.stream(rectangles).mapToInt(r -> r.area()).sum();

        return sum / rectangles.length;
    }

}
