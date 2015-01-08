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
public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight;
        double venusW = 0.78;
        double marsW = 0.39;
        double jupiterW = 2.65;
        double saturnW = 1.17;
        double uranusW = 1.05;
        double neptuneW = 1.23;
        
        System.out.print("Please enter your current Earth weight: ");
        weight = sc.nextInt();
        System.out.println();
        System.out.println("I Have information on the following planets:");
        System.out.println("    1. Venus    2. Mars     3. Jupiter ");
        System.out.println("    4. Saturn   5. Uranus   6. Neptune ");
        System.out.println("");
        System.out.print("Which planet would you like to know more about? ");
        int response = sc.nextInt();
        
        if (response == 1){
            System.out.println("Your weight  on  Venus would be " + (weight * venusW) + " lbs.");
    }
        else if (response == 2) {
            System.out.println("Your weight on Mars would be " + (weight * marsW) + " lbs.");
        }
        else if (response ==3) {
            System.out.println("Your weight on Jupiter would be " + (weight * jupiterW) + " lbs.");
        }
        else if (response ==4) {
            System.out.println("Your weight on Saturn would be " + (weight * saturnW) + " lbs.");
        }
        else if (response ==5) {
            System.out.println("Your weight on Uranus would be " + (weight * uranusW) + " lbs.");
        }
        else if (response ==6) {
            System.out.println("Your weight on Neptune would be " + (weight * neptuneW) + " lbs.");
        }
    
}}
