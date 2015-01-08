package com.swcguild.ifstatements;

import java.util.Scanner;

public class LittleQuiz {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int answer1;
        int answer2;
        int answer3;
        int score = 0;
        
        System.out.println("Are you ready for a quiz? ");
        // Find out how to code for a response with no change in outcome.
        System.out.println("Okay! Here it comes!");
        System.out.println("");
        System.out.println("1. What is the capital of Alaska?");
        System.out.println("    1) Melbourne");
        System.out.println("    2) Ankorage");
        System.out.println("    3) Juneau");
        System.out.println("");
        System.out.print(">");
        answer1 = sc.nextInt();
        if (answer1 == 3){
            System.out.println("");
            System.out.println("That's right!");
            score ++;
        }
        else {
            System.out.println("");
            System.out.println("Incorrect.");
        }
        System.out.println("");
        System.out.println("2. Can you store the value cat in a variable type int?");
        System.out.println("    1) yes");
        System.out.println("    2) no");
        System.out.println("");
        System.out.print(">");
        answer2 = sc.nextInt();
        
        if (answer2 == 2){
        System.out.println("");
        System.out.println("That's right!");
        score ++;
    }else {
            System.out.println("");
            System.out.println("Sorry, cat is a string. ints can only store numbers.");
        }
        System.out.println("");
        System.out.println("3. What is the result of 9+6/3?");
        System.out.println("    1) 5");
        System.out.println("    2) 11");
        System.out.println("    3) 15/3");
        System.out.println("");
        System.out.print(">");
        answer3 = sc.nextInt();
        
        if (answer3 == 2 ){
            System.out.println("");
            System.out.println("That is correct!");
            score ++;
        }
        else{
            System.out.println("");
            System.out.println("I'm sorry, that is wrong.");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Overall, you got " + score + " out of 3 correct.");
        System.out.println("Thank you for playing.");
        
        
        
    }

}
