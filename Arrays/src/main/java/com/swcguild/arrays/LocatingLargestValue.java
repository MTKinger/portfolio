package com.swcguild.arrays;

import java.util.Random;

public class LocatingLargestValue {
    public static void main(String[] args) {

        int myArray[];
        myArray = new int[10];
        int maxValue = 0;
        int search = 0;

        System.out.print("Array: ");

        for (int i = 0; i < 10; i++) {
            myArray[i] = random();
            System.out.print(myArray[i] + "  ");
            if ((i + 1) % 10 == 0) {
                System.out.println("");
            }
            if (myArray [i] > maxValue){
                maxValue = myArray[i];
                search = i;
            }
        }
        System.out.println("");
        System.out.println("The largest value is " + maxValue + ".");
        System.out.println(maxValue + " is located in element " + search + ".");
        
        

    }

    public static int random() {
        Random r = new Random();
        int rando = 1 + r.nextInt(100);
        return rando;
    }
}
