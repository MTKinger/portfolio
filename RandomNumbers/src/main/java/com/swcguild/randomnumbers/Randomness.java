package com.swcguild.randomnumbers;

import java.util.Random;

public class Randomness {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        int x = 1 + r.nextInt(10);
        
        System.out.println("My random number is " + x );
        System.out.println("");
        System.out.println("");
        System.out.println("Here are some random numbers from 1-5: ");
        System.out.print(1 + r.nextInt(5) +" ");
        System.out.print(1 + r.nextInt(5) +" ");
        System.out.print(1 + r.nextInt(5) +" ");
        System.out.print(1 + r.nextInt(5) +" ");
        System.out.print(1 + r.nextInt(5) +" ");
        System.out.println("");
        System.out.println("");
        System.out.println("Here are some numbers from 1 to 100:");
        System.out.print(1 + r.nextInt(100) +"\t");
        System.out.print(1 + r.nextInt(100) +"\t");
        System.out.print(1 + r.nextInt(100) +"\t");
        System.out.print(1 + r.nextInt(100) +"\t");
        System.out.print(1 + r.nextInt(100) +"\t");
        System.out.println("");
        System.out.println("");
        
        int num1 = 1+r.nextInt(10);
        int num2 = 1+r.nextInt(10);
        
        if (num1 == num2){
            System.out.println("WEIRD! The random numbers were the same!");
        }
        else{
            System.out.println("Not suprising. The random numbers were different.");
        }
        
        
    }

}
