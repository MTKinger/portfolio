package com.swcguild.dowhileloops;

import java.util.Random;
import java.util.Scanner;

public class FlipAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        String again = "";
        
        do{
            int flip = r.nextInt(2);
            String coin;
            
            if (flip == 1){
                coin = "heads.";
            }
            else{
                coin = "tails.";
            }
            System.out.println("You flip a coin and it is " + coin );
            System.out.print("Would you like to play again? \"Y\" or \"N\"? ");
            again = sc.nextLine();
        } while ( again.equalsIgnoreCase("y"));
    }

}
