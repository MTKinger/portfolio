package com.swcguild.dowhileloops;

import java.util.Scanner;

public class ShortAdventureLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = 1;
        String location = null;

        while (choice == 1) {
            System.out.println("You have come upon some scary looking woods.  Will you go \"left\" or \"right\"?");
            location = sc.nextLine();
            if (location.equalsIgnoreCase("left")) {
                choice = 2;
            }
            if (location.equalsIgnoreCase("right")) {
                choice = 3;
            }
        }

        while (choice == 2) {
            System.out.println("Yet another fork in the road. Will you go \"left\" or \"right?\"");
        }

    }
}
