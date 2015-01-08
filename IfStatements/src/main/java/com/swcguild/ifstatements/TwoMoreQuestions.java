package com.swcguild.ifstatements;

import java.util.Scanner;

public class TwoMoreQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String answer1;
        String answer2;
        
        System.out.println("TWO MORE QUESTIONS, BABY!!!");
        System.out.println("");
        System.out.println("Think of something and I will try and guess it.");
        System.out.println("");
        System.out.print("Question 1) Does it belong \"inside\", \"outside\", or \"both\"? ");
        answer1 = sc.nextLine();
        System.out.print("Question 2) Is it a living thing? Answer \"yes\" or \"no\". ");
        answer2 = sc.nextLine();
        System.out.println("");
        System.out.println("");
        
        if (answer1.equalsIgnoreCase("inside") && answer2.equalsIgnoreCase("yes")){
            System.out.println("You must be thinking of a houseplant!!!");
        }
        if (answer1.equalsIgnoreCase("inside") && answer2.equalsIgnoreCase("no")){
            System.out.println("You must be thinking of a shower curtain!!!");
        }
        if (answer1.equalsIgnoreCase("outside") && answer2.equalsIgnoreCase("yes")){
            System.out.println("You must be thinking of a bison!!!");
        }
        if (answer1.equalsIgnoreCase("outside") && answer2.equalsIgnoreCase("no")){
            System.out.println("You must be thinking of a houseplant!!!");
        }
        if (answer1.equalsIgnoreCase("both") && answer2.equalsIgnoreCase("no")){
            System.out.println("You must be thinking of a cellphone!!!");
        }
        if (answer1.equalsIgnoreCase("both") && answer2.equalsIgnoreCase("yes")){
            System.out.println("You must be thinking of a dog!!!");
        }
    }

}
