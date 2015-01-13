package com.swcguild.simplecalculator;

import java.util.Scanner;

public class CalcInterface {

    public void userInput() throws Exception {

        Scanner sc = new Scanner(System.in);
        SimpleCalculator simp = new SimpleCalculator();
        int choice = 12345678;

        while (choice != 5) {
            System.out.println("CALCULATOR");
            Thread.sleep(500);
            System.out.println("\nWhich operation do you wish to perform?\n");
            Thread.sleep(500);
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. QUIT");
            System.out.println("\nYour choice: ");
            choice = sc.nextInt();
            Thread.sleep(500);
        
        while (choice != 5 && choice != 12345678) {
            System.out.print("\nPlease enter the first number: ");
            double a = sc.nextDouble();
            Thread.sleep(500);
            System.out.print("\nPlease enter your second number: ");
            double b = sc.nextDouble();
            Thread.sleep(500);

            if (choice == 1) {
                simp.addCalc(a, b);
            } else if (choice == 2) {
                simp.subtractCalc(a, b);
            } else if (choice == 3) {
                simp.multiplyCalc(a, b);
            } else if (choice == 4) {
                simp.divideCalc(a, b);
            } else {
                System.out.println("\nERROR!");
            }
            choice = 12345678;
        }
        
        }
        if (choice == 5) {
            System.out.println("\nGOODBYE!");
        }

    }
}
