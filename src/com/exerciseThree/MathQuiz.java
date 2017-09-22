package com.exerciseThree;

import java.util.Scanner;

public class MathQuiz {
    private Scanner scanner;

    public MathQuiz() {
        scanner = new Scanner(System.in);
    }

    public boolean questionOne() {
        System.out.println("3*5?");
        return scanner.nextInt() == 15;
    }

    public boolean questionTwo() {
        System.out.println("Pole kwadratu o boku 12 =?");
        return scanner.nextInt() == 144;
    }

    public boolean questionThree() {
        System.out.println("sqrt(15129) =?");
        return scanner.nextDouble() == Math.sqrt(15123);
    }

    public void closeScanner() {
        scanner.close();
    }
}
