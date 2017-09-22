package com.exerciseOne;

public class Triangle {
    private int sideOne;
    private int sideTwo;
    private int sideThree;

    public Triangle() {
    }

    public Triangle(int sideOne, int sideTwo, int sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    public void setSideThree(int sideThree) {
        this.sideThree = sideThree;
    }

    public int getSideOne() {
        return sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public int getSideThree() {
        return sideThree;
    }
}
