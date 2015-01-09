package com.swcguild.randomnumbers;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int secret = 1 + r.nextInt(10);
        int guess;
        
        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.print("Your guess: ");
        guess = sc.nextInt();
        System.out.println("");
        
        if (guess == secret){
            System.out.println("That's right!!! My secret number was " + secret + ".");
        }
        else{
            System.out.println("Sorry, but i was thinking of the number " + secret + ".");
        }
    }

}
