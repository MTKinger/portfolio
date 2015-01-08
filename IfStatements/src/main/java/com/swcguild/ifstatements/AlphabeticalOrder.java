package com.swcguild.ifstatements;

import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String lastName = "";
        int a = lastName.compareTo("Carswell");
        int b = lastName.compareTo("Jones");
        int c = lastName.compareTo("Smith");
        int d = lastName.compareTo("Young");
        
        System.out.print("What's your last name? ");
        lastName = sc.nextLine();
        
        if ( a <= 0 ){
            System.out.println("You don't have to wait long.");
        }
        if (a>0 && b<0){
            System.out.println("That's not bad.");
        }
        
    }

}
