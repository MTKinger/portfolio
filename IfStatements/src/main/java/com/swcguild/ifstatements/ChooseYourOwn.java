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
        System.out.println("You are in a creepy house. Will you go upstairs or downstairs?");
        System.out.println(">");
        location = sc.nextLine();
        System.out.println("");
        
        if (location .equals("upstairs")){
            System.out.println("NEVER GO UPSTAIRS!!! But since your are there, will you check the closet or the bedroom?");
            System.out.println(">");
            action1 = sc.nextLine();
            System.out.println("");
            //if (action1 equals.("closet")){
            //apparently i need some real help with booleans.
            //I understand their purpose, but not how they work.
    //}

}}}
