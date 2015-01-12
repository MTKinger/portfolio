package com.swcguild.arrays;

import java.util.Random;

public class BasicArray4 {

    public static void main(String[] args) {
        int myArray[];
        myArray = new int[1000];

        for (int i = 0; i < myArray.length; i++) {
            int rando = random();
            myArray[i] = rando;

            if (i % 20 == 0) {
                System.out.print("\n");
            }
            System.out.print(myArray[i] + "  ");
        }
        System.out.println("");
    }

    public static int random() {
        Random r = new Random();
        int rando = 10 + r.nextInt(90);
        return rando;

    }

}
