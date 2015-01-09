package com.swcguild.whileloops;

import java.util.Scanner;

public class CountingWithWhileLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type in a message and I will display it as many times as you wish.");
        System.out.print("Message: ");
        String message = sc.nextLine();
        System.out.print("How many times would you like to display this message? ");
        int itterations = sc.nextInt();
        
        int i = 0;
        while (i<itterations){
            System.out.println( (i+1) + ". " + message);
            i++;
        }
        
    }

}
