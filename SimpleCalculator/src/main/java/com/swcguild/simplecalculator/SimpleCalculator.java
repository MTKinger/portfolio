package com.swcguild.simplecalculator;

public class SimpleCalculator {

    public void addCalc(double a, double b) {
        double ans = (a + b);
        System.out.println("\nThe sum is " + ans + "\n");
    }

    public void subtractCalc(double a, double b) {
        double ans = (a - b);
        System.out.println("\nThe difference is " + ans + "\n");
    }

    public void multiplyCalc(double a, double b) {
        double ans = (a * b);
        System.out.println("\nThe product is " + ans + "\n");
    }

    public void divideCalc(double a, double b) {
        double ans = (a / b);
        System.out.println("\nThe quotient is" + ans + "\n");
    }

}
