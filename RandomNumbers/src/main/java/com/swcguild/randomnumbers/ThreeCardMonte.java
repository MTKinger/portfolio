package com.swcguild.randomnumbers;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int fastEddie;
        int userGuess;

        System.out.println("You slide up to Fast eddie's card table and plop down your cash.");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
        System.out.println("He lays down three cards.");
        System.out.println("");
        System.out.println("Which one is the Ace?");
        System.out.println("");
        System.out.println("\t\t##\t##\t##");
        System.out.println("\t\t##\t##\t##");
        System.out.println("\t\t1 \t2 \t3 ");
        System.out.println("");
        System.out.print("> ");
        userGuess = sc.nextInt();
        System.out.println("");
        fastEddie = 1 + r.nextInt(3);

        if (userGuess == fastEddie) {
            System.out.println("YOU WIN!!!");
            System.out.println("");
        } else {
            System.out.println("Fast Eddie wins again!!! The ace was card " + fastEddie + ".");
            System.out.println("");
        }
        if (fastEddie == 1) {
            System.out.println("\t\tAA\t##\t##");
            System.out.println("\t\tAA\t##\t##");
            System.out.println("\t\t1 \t2 \t3 ");
        } else if (fastEddie == 2) {
            System.out.println("\t\t##\tAA\t##");
            System.out.println("\t\t##\tAA\t##");
            System.out.println("\t\t1 \t2 \t3 ");
        } else {
            System.out.println("\t\t##\t##\tAA");
            System.out.println("\t\t##\t##\tAA");
            System.out.println("\t\t1 \t2 \t3 ");
        }

    }

}
