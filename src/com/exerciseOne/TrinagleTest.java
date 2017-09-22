package com.exerciseOne;

public class TrinagleTest {
    public static void main(String[] args) {
        Triangle rightTriangle = new Triangle(3,4,5);
        Triangle acuteTriangle = new Triangle(4,5,6);
        Triangle obtuseTriangle = new Triangle(6,7,9);

        TriangleUtilities triangleUtilities = new TriangleUtilities();

        System.out.println(triangleUtilities.isRightTriagnle(rightTriangle));
        System.out.println(triangleUtilities.isRightTriagnle(acuteTriangle));
        System.out.println(triangleUtilities.isRightTriagnle(obtuseTriangle));
    }
}
