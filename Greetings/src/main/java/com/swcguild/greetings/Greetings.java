package com.swcguild.greetings;

import java.util.Scanner;

public class Greetings {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sayHi();
        System.out.print("Please enter your name: ");
        String userName = sc.nextLine();
        helloToYou(userName);
        
    }
    
    public static void sayHi(){
        System.out.println("HI!");
    }
    public static void helloToYou(String name){
        System.out.println("Hi, " + name + "!");
    }

}
