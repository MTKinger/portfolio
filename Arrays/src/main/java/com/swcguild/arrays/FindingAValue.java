package com.swcguild.arrays;

import java.util.Random;
import java.util.Scanner;

public class FindingAValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int myArray[];
        myArray = new int[10];
        boolean wasFound = false;

        System.out.print("Array:  ");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomizer();
            System.out.print(myArray[i] + "  ");
            if ((i + 1) % 10 == 0) {
                System.out.println("");
            }
        }
        System.out.print("Value to find: ");
        int search = sc.nextInt();
        for (int num : myArray) {
            if (search == num) {
                wasFound = true;
            }
        }

        if (wasFound) {
            System.out.println("\n" + search + " is in the array.");
        } else {
            System.out.println("\n" + search + " was not in the array.");
        }
    }

    public static int randomizer() {
        Random r = new Random();
        int rando = 1 + r.nextInt(50);
        return rando;
    }

}
