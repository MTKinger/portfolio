package com.swcguild.greetings2;

import java.util.Scanner;

public class Greetings2 {
    
    public void execute(){
        Scanner sc = new Scanner(System.in);
        sayHi();
        System.out.print("Please enter your name: ");
        String userName = sc.nextLine();
        helloToYou(userName);
    }
    
    public void sayHi(){
        System.out.println("HI!");
    }
    public void helloToYou(String name){
        System.out.println("Hi, " + name + "!");
    }

}
