package com.swcguild.randomnumbers;

import java.util.Random;
import java.util.Scanner;

public class OneShotHiLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int rando = 1 + r.nextInt(100);
        int guess;
        
        System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
        System.out.print(">");
        guess = sc.nextInt();
        System.out.println("");
        
        if (guess == rando){
            System.out.println("You guessed it! What are the odds?!");
        }
        else if (guess < rando){
            System.out.println("Sorry, you are too low.  I was thinking of " + rando + ".");
        }
        else{
            System.out.println("Sorry, you are too high.  I was thinking of " + rando + ".");
        }
        
    }

}
