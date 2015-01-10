package com.swcguild.dowhileloops;

import java.util.Random;
import java.util.Scanner;

public class ShorterDice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int dice1;
        int dice2;

        System.out.println("Here come the dice!!!!\n\n\n");

        do {
            dice1 = 1 + r.nextInt(6);
            dice2 = 1 + r.nextInt(6);
            System.out.println("Roll #1: " + dice1);
            System.out.println("Roll #2: " + dice2);
            int sum = (dice1 + dice2);
            System.out.println("The total is " + sum + "!");
        } while (dice1 != dice2);

    }

}
