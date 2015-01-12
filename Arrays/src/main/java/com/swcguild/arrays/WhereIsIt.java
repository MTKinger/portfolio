package com.swcguild.arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] myArray;
        myArray = new int[10];
        int count = 0;

        System.out.print("Array: ");

        for (int element = 0; element < 10; element++) {
            myArray[element] = random();
            System.out.print(myArray[element] + "  ");
            if ((1 + element) % 10 == 0) {
                System.out.println("");
            }
        }
        System.out.print("Element to find: ");
        int search = sc.nextInt();
        System.out.println();

        for (int i = 0; i < 10; i++) {
            
            if (search == myArray[i]) {
                count = count + 1;
                System.out.println(search + " was found in element " + i + ".");
            }
        }
        System.out.println("\n" + search + " was found " + count + " times.");
    }

    public static int random() {
        Random r = new Random();
        int rando = 1 + r.nextInt(50);
        return rando;
    }
}
