package com.swcguild.forloops;

import java.util.Scanner;

public class CountingWithForLoops {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type in a message and I will display it as many times as you wish.");
        System.out.print("Your message: ");
        String message = sc.nextLine();
        System.out.println("");
        System.out.print("How many times would you like me to print this message? ");
        int repetitions = sc.nextInt();
        System.out.println("");
        
        for ( int i = 1; i<=repetitions; i = i+1){
            System.out.println(i + ". " + message );
        }
    }

}
