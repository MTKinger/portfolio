package com.swcguild.arrays;

import java.util.Random;

public class BasicArray3 {
    public static void main(String[] args) {
        
        int myArray[];
        myArray = new int[10];
        
        for( int i = 0; i < myArray.length; i++){
            int rando = random();
            myArray[i] = rando;
            System.out.println("Slot " + i + " contains a " + rando + ".");
        }
        
    }
    public static int random(){
        Random r = new Random();
        int x = 1 + r.nextInt(100);
        return x;
    }

}
