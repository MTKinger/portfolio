package com.swcguild.simplecalculator;

import java.util.Scanner;

public class CalcInterface {

    ConsoleIO cio = new ConsoleIO();

    public void userInput() throws Exception {

        Scanner sc = new Scanner(System.in);
        SimpleCalculator simp = new SimpleCalculator();
        int choice = 12345678;

        while (choice != 5) {
            cio.printMessage("CALCULATOR");
            Thread.sleep(500);
            cio.printMessage("\nWhich operation do you wish to perform?\n");
            Thread.sleep(500);
            cio.printMessage("1. Addition");
            cio.printMessage("2. Subtraction");
            cio.printMessage("3. Multiplication");
            cio.printMessage("4. Division");
            cio.printMessage("5. QUIT");
            choice = cio.getInt("\nYour choice: ");
            Thread.sleep(500);

            while (choice != 5 && choice != 12345678) {
                double a = cio.getDouble("\nPlease enter the first number: ");
                Thread.sleep(500);
                double b = cio.getDouble("\nPlease enter your second number: ");
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
                    cio.printMessage("\nERROR!");
                }
                choice = 12345678;
            }

        }
        if (choice == 5) {
            cio.printMessage("\nGOODBYE!");
        }

    }
}
