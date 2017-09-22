package com.exerciseThree;

public class MathQuizApp {
    public static void main(String[] args) {
        MathQuiz mathQuiz = new MathQuiz();

        boolean first = mathQuiz.questionOne();
        boolean second = mathQuiz.questionTwo();
        boolean third = mathQuiz.questionThree();


        System.out.println("Ogólny wynik: " + ((first ? 1 : 0) + (second ? 1 : 0) + (third ? 1 : 0)) + "/3");
        System.out.println("Wynik poszczególnych zadań:\n1. " + first + "\n" + "2. " + second+ "\n" + "3. " + third + "\n");
        mathQuiz.closeScanner();
    }
}
