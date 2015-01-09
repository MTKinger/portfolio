package com.swcguild.ifstatements;

import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String lastName = "";
        
        System.out.print("What's your last name? ");
        lastName = sc.nextLine();
        
        int a = lastName.compareToIgnoreCase("Carswell");
        int b = lastName.compareToIgnoreCase("Jones");
        int c = lastName.compareToIgnoreCase("Smith");
        int d = lastName.compareToIgnoreCase("Young");
        
        if ( a <= 0 ){
            System.out.println("You don't have to wait long.");
        }
        else if (a>0 && b<0){
            System.out.println("That's not bad.");
        }
        else if (b>0 && c<0){
            System.out.println("Looks like a bit of a wait.");
        }
        else if (c>0 && d<0){
            System.out.println("It's going to be a while.");
        }
        else{
            System.out.println("Grab a Snickers, homie...");
        }
        
    }

}
