package com.swcguild.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean tie = true;
        int userChoice = 0;
        int compChoice = 0;

        do {
            System.out.println("ROCK PAPER SCISSORS!!!!");
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
            } else if (compChoice == userChoice) {
                System.out.println("It's a Tie!!!");
            } else {
                System.out.println("Computer Wins!!!");
                tie = false;
            }
        } while (tie);
    }

}
