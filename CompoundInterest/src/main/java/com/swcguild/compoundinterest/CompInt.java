package com.swcguild.compoundinterest;

import java.util.Scanner;

public class CompInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double initialPrincipal;
        double currentTotal;
        int totalYears;
        double yearIntRate;
        int currentYear = 1;
        double quartIntRate;
        double intEarned;
        double quarterEarned;
       
        System.out.print("How much money will you be starting your account with? ");
        initialPrincipal = sc.nextDouble();
        currentTotal=initialPrincipal;
        System.out.print("How long will you be keeping your money with the bank? ");
        totalYears = sc.nextInt();
        System.out.print("What is the yearly interest rate for your account? ");
        yearIntRate = sc.nextDouble();
        quartIntRate = (yearIntRate/4);
        
        while ( (totalYears) >= currentYear ){
            System.out.println("In year " + currentYear);
            System.out.println("You will start with " + currentTotal);
            
            intEarned = 0;
            
            for(int i =1; i<=4; i++){
                quarterEarned=0;
                quarterEarned += (currentTotal * (quartIntRate/100));
                intEarned += quarterEarned;
                currentTotal += quarterEarned;
            }
            System.out.println("You will earn $" + intEarned + " this year.");
            System.out.println("At year end, you will have $" + currentTotal + "in your account.");
            currentYear++;
        }
        
    }

}
