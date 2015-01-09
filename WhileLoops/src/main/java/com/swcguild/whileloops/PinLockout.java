package com.swcguild.whileloops;

import java.util.Scanner;

public class PinLockout {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 12345;

        System.out.println("Welcome to the bank of Kinger.");
        System.out.print("Enter your PIN: ");
        int pinInput = sc.nextInt();
        System.out.println("");

        //while (pinInput != pin) {
            int i = 1;
            while (i < 3 && pinInput != pin) {
                System.out.println("INCORRECT PIN! TRY AGAIN!");
                System.out.print("Enter your PIN: ");
                pinInput = sc.nextInt();
                System.out.println("");
                i++;
            }

            if ( pinInput != pin){
                System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED!!!");
            }
        //}
            else{
                System.out.println("WELCOME TO YOUR ACCOUNT!!!");
            }
        
    }

}
