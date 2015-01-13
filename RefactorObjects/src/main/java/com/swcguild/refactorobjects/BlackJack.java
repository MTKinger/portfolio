package com.swcguild.refactorobjects;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {

    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    int playerCard1 = 2 + r.nextInt(10);
    int playerCard2 = 2 + r.nextInt(10);
    int dealerCard1 = 2 + r.nextInt(10);
    int dealerCard2 = 2 + r.nextInt(10);
    int playerTotal;
    int dealerTotal;
    int hitCard;
    String playerChoice = "";
    
    public void run()throws Exception{
        dealCards();
        playerChoice();
        dealerTurn();
        result();
    }

    public void dealCards() throws Exception {
        System.out.println("Welcome to Kinger's Casino!");
        Thread.sleep(1000);
        System.out.println("\nLet's play some Blackjack!");
        Thread.sleep(1000);
        System.out.println("\nYou get a " + playerCard1 + " and a " + playerCard2 + ".");
        Thread.sleep(1000);
        playerTotal = (playerCard1 + playerCard2);
        System.out.println("Your total is " + playerTotal + ".");
        Thread.sleep(1000);
        System.out.println("");
        System.out.println("\nThe dealer has a " + dealerCard1 + " showing, plus a hidden card.");
        Thread.sleep(1000);
        dealerTotal = (dealerCard1 + dealerCard2);
        System.out.println("His total is hidden too.");
        Thread.sleep(1000);
    }

    public void playerChoice() throws Exception {
        while (playerTotal < 21 && !playerChoice.equalsIgnoreCase("stay") && playerTotal != 0) {
            System.out.print("\nWould you like to \"hit\" or \"stay\"? ");
            playerChoice = sc.nextLine();
            if (playerChoice.equalsIgnoreCase("hit")) {
                hitCard = 2 + r.nextInt(10);
                playerTotal = (playerTotal + hitCard);
                Thread.sleep(1000);
                System.out.println("\nYou drew a " + hitCard + ".");
                Thread.sleep(1000);
                System.out.println("Your total is " + playerTotal + ".");
                System.out.println("");
            } else if (playerChoice.equalsIgnoreCase("stay")) {
                Thread.sleep(1000);
                System.out.println("\nYou have chosen to stay with a total of " + playerTotal + ".");
            } else {
                System.out.println("I did not understand.");
            }
            if (playerTotal > 21) {
                System.out.println("The player has busted.");
                playerTotal = 0;
            }
        }
    }

    public void dealerTurn() throws Exception {

        System.out.println("\nOkay, now it's the dealer's turn.");
        Thread.sleep(1000);
        System.out.println("\nHis hidden card was a " + dealerCard2 + ".");
        Thread.sleep(1000);
        System.out.println("That makes his total " + dealerTotal + ".");

        while (dealerTotal <= 16) {
            Thread.sleep(1000);
            System.out.println("\n The dealer will hit");
            Thread.sleep(1000);
            hitCard = 2 + r.nextInt(10);
            System.out.println("\nThe dealer's hit card was a " + hitCard + ".");
            Thread.sleep(1000);
            dealerTotal = (dealerTotal + hitCard);
            System.out.println("That makes his total " + dealerTotal + ".");
            Thread.sleep(1000);
            if (dealerTotal > 21) {
                System.out.println("\nThe dealer has BUSTED!!!");
                Thread.sleep(1000);
                dealerTotal = 0;
            } else if (dealerTotal >=17 && dealerTotal<=21) {
                System.out.println("\nThe dealer stays.");
                Thread.sleep(1000);
            }
        }

    }

    public void result() throws Exception {
        if (playerTotal == 0) {
            System.out.println("\nThe player busted.");
            Thread.sleep(1000);
        } else {
            System.out.println("\nThe player has " + playerTotal + ".");
            Thread.sleep(1000);
        }
        if (dealerTotal == 0) {
            System.out.println("\nThe dealer busted.");
            Thread.sleep(1000);
        } else {
            System.out.println("\nThe dealer has " + dealerTotal + ".");
        }
        if (playerTotal > dealerTotal) {
            System.out.println("\n PLAYER WINS!!!");
        } else {
            System.out.println("\nThe dealer wins. Better luck next time.");
        }
    }

}
