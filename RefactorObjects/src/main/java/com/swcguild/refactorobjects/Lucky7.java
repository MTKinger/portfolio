package com.swcguild.refactorobjects;

import java.util.Scanner;

public class Lucky7 {

    private int money;
    private int die1;
    private int die2;
    private int played = 0;
    private int maxMoney;
    private int maxPlayed;
    Scanner sc = new Scanner(System.in);

    public void run() {
        System.out.println("How much do you have to bet?");
        money = sc.nextInt();
        maxMoney = money;
        maxPlayed = played;
        roll();
        quit();

    }

    public void roll() {
        while (money > 0) {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            played++;
            if ((die1 + die2) == 7) {
                money = money + 4;
                if (money > maxMoney) {
                    maxMoney = money;
                    maxPlayed = played;
                }
            } else if ((die1 + die2) < 2 || (die1 + die2) > 12) {
                System.out.println("ERROR!!!"); //In case Math.random was going undesired numbers
            } else {
                money--;
            }
        }
    }

    public void quit() {
        System.out.println("You are broke after " + played + " rolls.");
        System.out.println("You should have quit after " + maxPlayed
                + " rolls when you had $" + maxMoney);
    }
}
