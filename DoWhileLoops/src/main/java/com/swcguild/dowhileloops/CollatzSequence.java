package com.swcguild.dowhileloops;

import java.util.Scanner;

public class CollatzSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input;
        int stepNumber = 1;
        int maxInputEven;
        int maxInputOdd;

        System.out.print("Start with a natural (non negative integer) number: ");
        input = sc.nextInt();

        while (input < 0) {
            System.out.print("That is not a natural number.  Please try again: ");
            input = sc.nextInt();
        }
        maxInputEven = input;
        maxInputOdd = input;

        System.out.print(input + "\t");
        while (input != 1) {
            if (input % 2 == 0) {
                input = (input / 2);
                System.out.print(input + "\t");
                stepNumber++;
                if (stepNumber % 10 == 0) {
                    System.out.println("");
                    if (input > maxInputEven) {
                        maxInputEven = input;
                    }
                }
            } else {
                input = ((input * 3) + 1);
                System.out.print(input + "\t");
                stepNumber++;
                if (stepNumber % 10 == 0) {
                    System.out.println("");
                    if (input > maxInputOdd) {
                        maxInputOdd = input;
                    }
                }
            }

        }
        System.out.println("\n");
        System.out.println("Terminated after " + (stepNumber - 1) + " steps.");
        if (maxInputEven > maxInputOdd) {
            System.out.println("The greatest number in the sequence was " + maxInputEven + ".");
        }
        else{
            System.out.println("The greatest number in the sequence was " + maxInputOdd + ".");
        }
    }

}
