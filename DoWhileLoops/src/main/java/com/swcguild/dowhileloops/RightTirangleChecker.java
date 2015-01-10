package com.swcguild.dowhileloops;

import java.util.Scanner;

public class RightTirangleChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int side1;
        int side2;
        int side3;

        System.out.println("Enter three integers:");
        System.out.print("Side 1: ");
        side1 = sc.nextInt();

        System.out.print("Side 2: ");
        side2 = sc.nextInt();

        while (side2 < side1) {
            System.out.println(side2 + " is smaller than " + side1 + ". Try again.");
            System.out.print("Side 2: ");
            side2 = sc.nextInt();
        }
        System.out.print("Side 3: ");
        side3 = sc.nextInt();

        while (side3 <= side2) {
            System.out.println(side3 + " is smaller than " + side2 + ". Try again.");
            System.out.print("Side 3: ");
            side3 = sc.nextInt();
        }
        System.out.println("Your three sides are " + side1 + "\t" +  side2 + "   " + side3);

        if (((side1 * side1) + (side2 * side2)) == (side3 * side3)) {
            System.out.println("These three sides make a right triangle!!!");
        } else {
            System.out.println("No. These three sides do not make a right triangle.");
        }

    }

}
