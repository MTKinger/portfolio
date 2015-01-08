package com.swcguild.ifstatements;

import java.util.Scanner;

public class AgeStatements3 {
    public static void main(String[] args){
        
        String name;
        int age;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Your name: ");
        name = sc.nextLine();
        System.out.println("");
        System.out.print("Your age: ");
        age = sc.nextInt();
        System.out.println("");
        System.out.println("");
        
        if(age < 16){
            System.out.println("You cant drive, " + name + ".");
        }
        if(age == 16 || age ==17){
            System.out.println("You can drive but not vote, " + name + ".");
        }
        if (age >= 18 && age <= 24){
            System.out.println("You can vote but not rent a car, " + name + ".");
        }
        if (age > 24){
            System.out.println("YOu can do pretty much anything, " + name + ".");
        }
    }

}
