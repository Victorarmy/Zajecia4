package com.exerciseOne;

public class TriangleUtilities {

    public boolean isRightTriagnle(Triangle triangle) {
        return Math.pow(triangle.getSideOne(), 2) + Math.pow(triangle.getSideTwo(), 2) == Math.pow(triangle.getSideThree(), 2);
    }
}
