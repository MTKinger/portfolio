package com.swcguild.dowhileloops;

import java.util.Scanner;

public class SafeSquareRoot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rootNumber;
        double rootAnswer;

        System.out.println("SQUARE ROOTS!!!\n");
        System.out.print("Enter a number: ");
        rootNumber = sc.nextInt();

        while (rootNumber < 1) {
            System.out.println("You can't take the square root of a negative number, dude.");
            System.out.print("Try again: ");
            rootNumber = sc.nextInt();
        }
        rootAnswer = Math.sqrt(rootNumber);
        System.out.println("The square root of " + rootNumber + " is " + rootAnswer + ".");
    }

}
