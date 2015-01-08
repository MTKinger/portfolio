package com.swcguild.ifstatements;

import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double height;
        double weight;
        
        System.out.print("Enter your height in meters: ");
        height = sc.nextDouble();
        System.out.print("Enter your weight in kilograms: ");
        weight = sc.nextDouble();
        System.out.println("");
        System.out.println("");
        double bmi = (weight/(height*height));
        System.out.println("Your BMI is " + bmi + ".");
        if(bmi<18.5){
            System.out.println("BMI category = underweight");
        }
        if(bmi>=18.5 && bmi<=24.9){
            System.out.println("BMI category = normal weight.");
        }
        if(bmi>=25.0 && bmi<=29.9){
            System.out.println("BMI category = overweight.");
        }
        if(bmi>=30){
            System.out.println("BMI category = obese.");
        }
    }

}
