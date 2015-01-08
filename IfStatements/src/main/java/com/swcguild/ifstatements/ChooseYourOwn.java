package com.swcguild.ifstatements;

import java.util.Scanner;

public class ChooseYourOwn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String location = "";
        String action1 = "";
        String action2 = "";

        System.out.println("WELCOME TO YOUR ADVENTURE!!!!");
        System.out.println("");
        System.out.println("You are in a creepy house. Will you go \"upstairs\" or \"downstairs?\"");
        System.out.print(">");
        location = sc.nextLine();
        System.out.println("");

        if (location.equalsIgnoreCase("upstairs")) { //if#1
            System.out.println("NEVER GO UPSTAIRS!!! But since your are there, will you check the \"closet\" or the \"bedroom\"?");
            System.out.print(">");
            action1 = sc.nextLine();
            System.out.println("");
            if (action1.equalsIgnoreCase("closet")) {
                System.out.println("");
                System.out.println("A loud noise comes from the closet, but it was just the cat. Do you \"ignore\" the cat or \"chase\" after it?");
                System.out.print(">");
                action2 = sc.nextLine();
                System.out.println("");
                if (action2.equalsIgnoreCase("ignore")) {
                    System.out.println("");
                    System.out.println("You were able to hide in the closet and avoid being killed!!!");
                }
                if (action2.equalsIgnoreCase("chase")) {
                    System.out.println("You turn to chase the cat and find the killer is right behind you!!! FUUUUUCK!!!");
                }
            }
            if (action1.equalsIgnoreCase("bedroom")) {
                System.out.println("");
                System.out.println("In the bedroom there is an old \"mirror\" and a \"curtain\". Which will you hide behind?");
                System.out.print(">");
                action2 = sc.nextLine();
                if (action2.equalsIgnoreCase("mirror")) {
                    System.out.println("");
                    System.out.println("Unfortunately, thats where the killer was hiding. Ya dead, kiddo.");
                }
                if (action2.equalsIgnoreCase("curtain")) {
                    System.out.println("You hide behind the curtain until the cops come. COWARD!!!!");
                }
            }
        }

        if (location.equalsIgnoreCase("downstairs")) {
            System.out.println("");
            System.out.println("Who the hell goes into the basement of a scary house? Since youre there, though, you could go \"left\" or \"right\".  Which way will you go?");
            System.out.print(">");
            action1 = sc.nextLine();
            if (action1.equalsIgnoreCase("left")) {
                System.out.println("You see a door.  Will you go through it?");
                System.out.print(">");
                action2 = sc.nextLine();
                if (action2.equalsIgnoreCase("yes")) {
                    System.out.println("Awesome. You got out of the house.");
                }
                if (action2.equalsIgnoreCase("no")) {
                    System.out.println("You could have gotten out, you IDIOT!!! Now you're dead!!!");
                }
            }
            if (action1.equalsIgnoreCase("right")) {
                System.out.println("You hear screaming at the end of the hall. Do you investigate?");
                System.out.print(">");
                action2 = sc.nextLine();
                if (action2.equalsIgnoreCase("yes")) {
                    System.out.println("You are the worst at this.  You're dead!!");
                }
                if (action2.equalsIgnoreCase("no")) {
                    System.out.println("You sure are a wuss. At least you're still alive i guess...");
                }
            }
        }
            //apparently i need some real help with booleans.
        //I understand their purpose, but not how they work.   

    }
}
