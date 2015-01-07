package com.swcguild.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsStep4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean tie;
        String playAgain;
        int userChoice;
        int compChoice;
        int numberOfRounds;
        int userWins = 0;
        int compWins = 0;
        int ties = 0;
        final int MAX_ROUNDS = 10;
        final int MIN_ROUNDS = 1;

        System.out.println("ROCK PAPER SCISSORS!!!!");

        do {
            System.out.println("How many rounds would you like to play?");
            numberOfRounds = sc.nextInt();
            if (numberOfRounds > MAX_ROUNDS || numberOfRounds < MIN_ROUNDS) {
                System.out.println("Fatal error, division by zero");
                return;
            }

            System.out.println("OK, we will play " + numberOfRounds + " rounds!");

            for (int i = 1; i <= numberOfRounds; i++) {
                do {
                    System.out.println("What would you like to thow?");
                    System.out.println("1. Rock");
                    System.out.println("2. Paper");
                    System.out.println("3. Scissors");
                    userChoice = sc.nextInt();

                    Random rps = new Random();
                    compChoice = rps.nextInt(3) + 1;

                    System.out.println(compChoice);
                    if (userChoice - compChoice == 1 || userChoice - compChoice == -2) {
                        System.out.println("User Wins!!!");
                        tie = false;
                        userWins++;
                    } else if (compChoice == userChoice) {
                        System.out.println("It's a Tie!!!");
                        tie = true;
                        ties++;
                    } else {
                        System.out.println("Computer Wins!!!");
                        tie = false;
                        compWins++;
                    }
                } while (tie);
            }
            System.out.println("The user won " + userWins + " rounds.");
            System.out.println("The computer won " + compWins + " rounds.");
            System.out.println(ties + " rounds ended in a tie.");
            if (userWins > compWins) {
                System.out.println("The user has won the game!!!");
            } else if (userWins < compWins) {
                System.out.println("The computer has won the game!!!");
            } else {
                System.out.println("The game has ended in a tie!!!");
            }
            
            System.out.println("Do you want to play again?");
            playAgain = sc.next();
            
        } while (playAgain.equalsIgnoreCase("yes"));
        
        System.out.println("Thanks for playing!");
    }
}
