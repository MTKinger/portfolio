package com.swcguild.refactorobjects;

import java.util.Scanner;

public class Interest {

    private int numYears;
    private int currentYear;
    private int period = 4; //Periods per year
    private double interestRate;
    private double principal;
    private double sPrincipal;
    Scanner sc = new Scanner(System.in);

    public void run() {
        System.out.println("How much would you like to invest?");
        principal = sc.nextDouble();
        sPrincipal = principal;
        System.out.println("What's the current annual interest rate.");
        interestRate = sc.nextDouble();
        System.out.println("How long would you like to invest for?");
        numYears = sc.nextInt();
        System.out.println("What year is it?");
        currentYear = sc.nextInt();
        System.out.println("How often will you like it to compound?\n"
                + "1) Quarterly 2) Monthly 3) Daily");
        switch (sc.nextInt()) {
            case 1:
                period = 4;
                break;
            case 2:
                period = 12;
                break;
            case 3:
                period = 365;
                break;
            default:
                System.out.println("It will be compounded quarterly.");
        }
        for (int i = currentYear; i < currentYear + numYears; i++) {
            System.out.println("At the beginning of " + i
                    + " the principal is $" + sPrincipal);
            for (int j = 0; j < period; j++) {
                principal = principal * (1 + (interestRate / period) / 100);
            }
            System.out.println("You earned $" + (principal - sPrincipal));
            System.out.println("At the end of " + i
                    + " the principal is $" + principal);
            sPrincipal = principal;
        }
    }

}
