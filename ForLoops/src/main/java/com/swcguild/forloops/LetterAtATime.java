package com.swcguild.forloops;

import java.util.Scanner;

public class LetterAtATime {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your message? ");
        String message = sc.nextLine();
        System.out.println("\nYour message is " + message.length() + " characters long.");
        System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
        int lastPos = message.length() - 1;
        System.out.println("The last character is at position " + lastPos + " and is '" + message.charAt(lastPos) + "'.");
        System.out.println("\nHere are all of the characters, one at a time:");
        System.out.println("");

        for (int i = 0; i < message.length(); i++) {
            System.out.println("\t\t" + i + " - '" + message.charAt(i) + "'");
            Thread.sleep(100);
        }
        int aCount = 0;
        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            if (letter == 'a' || letter == 'A') {
                aCount++;
            }

        }
        System.out.println("\n\nYour message contains the letter \"a\" " + aCount + " times.");
    }

}
