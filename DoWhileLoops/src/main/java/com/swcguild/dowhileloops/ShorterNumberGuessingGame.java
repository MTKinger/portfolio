package com.swcguild.dowhileloops;

import java.util.Random;
import java.util.Scanner;

public class ShorterNumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int magicNumber;
        int userGuess;
        int totalGuesses = 1;

        System.out.println("I have chosen a number from 1 to 10. Try to guess it.");
        magicNumber = 1 + r.nextInt(10);//
        do {

            System.out.print("Your guess: ");
            userGuess = sc.nextInt();
            System.out.println("That is incorrect. Guess again.");
            totalGuesses++;
        } while (userGuess != magicNumber);

        System.out.println("That is correct!!! You're a good guesser.");
    }

}
