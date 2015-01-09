package com.swcguild.whileloops;

import java.util.Random;
import java.util.Scanner;

public class HiLoLimitedGuesses {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int magicNumber = 1 + r.nextInt(100);
        int totalGuesses = 1;
        
        System.out.println(magicNumber);
        
        System.out.println("I am thinking of a number between 1-100.  You have 7 guesses.");
        System.out.print("First guess: ");
        int userGuess = sc.nextInt();
        
        while ( userGuess != magicNumber && totalGuesses <= 6){
        totalGuesses++;
        if (userGuess < magicNumber){
            System.out.println("Sorry, you are too low.");
            System.out.print("Guess #" + totalGuesses + ":");
            userGuess = sc.nextInt();
        }
        else{
            System.out.println("Sorry, you are too high.");
            System.out.print("Guess #" + totalGuesses + ":");
            userGuess = sc.nextInt();
        }
    }
        if (userGuess != magicNumber){
            System.out.println("Sorry, my number was " + magicNumber + " you didnt guess it in 7 tries. You lose.");
        }
        else{
            System.out.println("You guessed it!!! What are the odds!?!?!?!");
        }
    }

}
