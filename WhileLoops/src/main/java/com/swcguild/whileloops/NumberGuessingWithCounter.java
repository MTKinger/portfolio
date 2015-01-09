package com.swcguild.whileloops;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWithCounter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int magicNumber = 1 + r.nextInt(10);
        int userGuess;
        int totalGuesses = 1;
        
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        userGuess = sc.nextInt();
        
        while ( userGuess != magicNumber){
            System.out.println("That is incorrect. Please try again.");
            System.out.print("Your guess: ");
            userGuess = sc.nextInt();
            totalGuesses++;
        }
        System.out.println("That's right! You're a good guesser!");
        System.out.println("It only took you " + totalGuesses + " tries.");
        
    }

}
