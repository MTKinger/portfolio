package com.swcguild.ifstatements;

import java.util.Scanner;

public class TwoQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String type = "";
        String size = "";
        
        System.out.println("TWO QUESTIONS!!!");
        System.out.println("Think of an object, and I will try and guess it.");
        System.out.println("");
        System.out.println("Question 1) Is it animal, vegetable, or mineral?");
        System.out.print(">");
        type = sc.nextLine();
        System.out.println("");
        System.out.println("Question 2) Is it bigger than a breadbox?");
        System.out.print(">");
        size = sc.nextLine();
        System.out.println("");
        
        if (type .equals("animal") && size .equals("yes")){
            System.out.println("My guess is that you are thinking of a moose.");
            }
        else if(type .equals("animal") && size .equals("no")){
            System.out.println("My guess is that you are thinking of a squirrel.");
        }
        else if(type .equals("vegetable") && size .equals("yes")){
            System.out.println("My guess is that you are thinking of a watermellon.");
        }
        else if(type .equals("vegetable") && size .equals("no")){
            System.out.println("My guess is that you are thinking of a carrot.");
        }
        else if(type .equals("mineral") && size .equals("yes")){
            System.out.println("My guess is that you are thinking of a Camaro.");
        }
        else if(type .equals("mineral") && size .equals("no")){
            System.out.println("My guess is that you are thinking of a paper clip.");
        }
        else{
            System.out.println("I don't understand. Try again and check your spelling.");
        }
        System.out.println("I would ask if I am right, but frankly i could care less.");
    }

}
