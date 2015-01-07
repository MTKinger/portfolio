/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.ifstatements;

//import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HowOldAreYou {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String name = "";
        String age = "";
        
        System.out.print("Hey, what's your name? ");
        name = sc.nextLine();
        System.out.print("Ok, " + name + ", how old are you?");
        age = sc.nextLine();
        
        int ageInt = Integer.parseInt(age);
        
        if (ageInt<16){
            System.out.println("You cant drive, " + name + "."); 
        }
        if (ageInt <18){
            System.out.println("You can't vote, " + name + ".");
        }
        if (ageInt<25){
            System.out.println("You can't rent a car, " +name + ".");
        }
        if (ageInt>=25){
            System.out.println("You can do anything that is legal");
        }
                
    }
    
}
