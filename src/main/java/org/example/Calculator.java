package org.example;

public class Calculator {
    public int summation(int a, int b) throws InterruptedException {
        Thread.sleep(1200);
        return a + b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }
}