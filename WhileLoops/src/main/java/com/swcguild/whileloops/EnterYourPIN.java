package com.swcguild.whileloops;

import java.util.Scanner;

public class EnterYourPIN {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int pin = 12345;
        
        System.out.println("Welcome to the bank of Kinger.");
        System.out.print("Please enter your PIN: ");
        int entry = sc.nextInt();
        
        while ( entry != pin){
            System.out.println("");
            System.out.println("Incorrect PIN. Please try again.");
            System.out.print("Please enter your PIN: ");
            entry = sc.nextInt();
        }
        System.out.println("");
        System.out.println("PIN accepted. You now have access to your account.");
    }

}
