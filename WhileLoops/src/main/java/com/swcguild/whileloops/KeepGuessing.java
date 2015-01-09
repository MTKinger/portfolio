package com.swcguild.whileloops;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int secretNumber = 1 + r.nextInt(10);
        int userGuess;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        userGuess = sc.nextInt();

        while (userGuess != secretNumber) {
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess: ");
            userGuess = sc.nextInt();
        }
        System.out.println("That's right. You're a good guesser!");
    }
}
