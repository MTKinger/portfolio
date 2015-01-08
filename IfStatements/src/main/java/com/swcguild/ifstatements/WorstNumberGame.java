package com.swcguild.ifstatements;

import java.util.Scanner;

public class WorstNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int secret = 17;
        String userGuess;
        int guess;
        
        System.out.println("THE WORST NUMBER GUESSING GAME EVER!!!!!!");
        System.out.println("");
        System.out.print("I'm thinking of a number between 1 and 20.  Try to guess:  ");
        userGuess = sc.nextLine();
        guess = Integer.parseInt(userGuess);
        System.out.println("");
        
        if (guess == secret){
            System.out.println("Wow. Great job. I cant believe you got it right.");
        }
        else{
            System.out.println("HAHAHAHAHAH!!!  WAYYYYYYYY off. It was " + secret + "!!!");
        }
        
    }

}
