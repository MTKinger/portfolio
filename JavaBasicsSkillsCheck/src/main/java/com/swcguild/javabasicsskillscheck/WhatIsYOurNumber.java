package com.swcguild.javabasicsskillscheck;

import java.util.Scanner;

public class WhatIsYOurNumber {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter an integer: ");
        int userInt = sc.nextInt();
        Thread.sleep(1000);
        System.out.println("The integer you have entered is " + userInt + ".");
        Thread.sleep(1000);
        
        for (int i =0; i <= userInt; i++){
            System.out.println(i);
            Thread.sleep(500);
        }
        System.out.println("\nThank you for playing.");
    }

}
