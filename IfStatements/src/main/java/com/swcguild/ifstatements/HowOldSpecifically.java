/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.ifstatements;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HowOldSpecifically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = "";
        String age = "";
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        name = sc.nextLine();
        System.out.print("Ok, " + name + " how old are you? ");
        age = sc.nextLine();
        
        int ageInt = Integer.parseInt(age);
        
        if (ageInt<16){
            System.out.println("You can't drive.");
        }
        else if (ageInt==16 && ageInt<=17){
            System.out.println("You can drive but not vote.");
        }
        else if (ageInt ==18 && ageInt<=24){
            System.out.println("You can vote, but not rent a car.");
        }
        else {
            System.out.println("You can do pretty much anything.");
        }
    }
    
}
