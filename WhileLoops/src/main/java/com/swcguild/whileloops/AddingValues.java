package com.swcguild.whileloops;

import java.util.Scanner;

public class AddingValues {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int userInput;
        int currentTotal =0;
        
        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");
        userInput = sc.nextInt();
        
        while (userInput != 0){
            currentTotal = (currentTotal + userInput );
            System.out.println("The total so far is " + currentTotal + ".");
            System.out.print("Number: ");
            userInput = sc.nextInt();
        }
        System.out.println("\n");
        System.out.println("The final total is " + currentTotal + ".");
    }

}
