package com.swcguild.ifstatements;

import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String gender;
        String firstName;
        String lastName;
        int age;
        String maritalStatus;
        
        System.out.print("What is your gender? (M or F): ");
        gender = sc.nextLine();
        System.out.print("First Name: ");
        firstName = sc.nextLine();
        System.out.print("Last Name: ");
        lastName = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.println("");
        
        if(gender.equalsIgnoreCase("f") && age>19){
        System.out.print("Are you married, " + firstName + " (y or n)? ");
        maritalStatus = sc.next();
        System.out.println("");
        if (maritalStatus.equalsIgnoreCase("y")){
            System.out.println("Then I shall call you Mrs. " + lastName + ".");
        }
        else{
            System.out.println("Then I shall call you Ms. " + lastName + ".");
        }
        }
        else if(gender.equalsIgnoreCase("m") && age>19){
            System.out.println("Then I shall call you Mr. " + lastName + ".");
        }
        else{
            System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
    }

}}
