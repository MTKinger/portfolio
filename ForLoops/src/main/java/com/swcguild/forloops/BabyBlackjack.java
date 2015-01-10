package com.swcguild.forloops;

import java.util.Random;

public class BabyBlackjack {

    public static void main(String[] args) throws Exception {

        Random r = new Random();

        int playerCard1 = 1 + r.nextInt(10);
        int playerCard2 = 1 + r.nextInt(10);
        int dealerCard1 = 1 + r.nextInt(10);
        int dealerCard2 = 1 + r.nextInt(10);
        int playerSum = playerCard1+playerCard2;
        int dealerSum = dealerCard1 + dealerCard2;

        System.out.println("BABY BLACKJACK!");
        System.out.println("");
        Thread.sleep(1000);
        System.out.println("You drew " + playerCard1 + " and " + playerCard2 + ".");
        Thread.sleep(1000);
        System.out.println("Your total is " + (playerSum) + ".");
        Thread.sleep(1000);
        System.out.println("");
        System.out.println("The dealer has " + dealerCard1 + " and " + dealerCard2 + ".");
        Thread.sleep(1000);
        System.out.println("The dealer's total is " + (dealerSum) + ".");
        Thread.sleep(1000);
        System.out.println("");
        
        if (playerSum > dealerSum){
            System.out.println("YOU WIN!!!");
        }
        else if (playerSum == dealerSum){
            System.out.println("It's a tie.");
        }
        else{
            System.out.println("Bummer. The dealer wins.");
        }

    }

}
