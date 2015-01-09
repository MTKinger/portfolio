package com.swcguild.randomnumbers;

import java.util.Random;
import java.util.Scanner;

public class FortuneCookie {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int fortune = 1 + r.nextInt(6);

        System.out.print("Fortune cookie says: ");

        if (fortune == 1) {
            System.out.println("\"You will find happiness with a new love.\"");
        } else if (fortune == 2) {
            System.out.println("\"Be the change you wish to see in the world\"");
        } else if (fortune == 3) {
            System.out.println("\"Material possesions are not all there is to life.\"");
        } else if (fortune == 4) {
            System.out.println("\"Treat others as you would wish to be treated\"");
        } else if (fortune == 5) {
            System.out.println("\"You will find yourself where you want to be in due time. Be patient.\"");
        } else {
            System.out.println("\"You will eat a bland cookie very soon\"");
        }
        System.out.print("   ");
        System.out.print(1 + r.nextInt(54) + " - ");
        System.out.print(1 + r.nextInt(54) + " - ");
        System.out.print(1 + r.nextInt(54) + " - ");
        System.out.print(1 + r.nextInt(54) + " - ");
        System.out.print(1 + r.nextInt(54) + " - ");
        System.out.println(1 + r.nextInt(54));

    }

}
