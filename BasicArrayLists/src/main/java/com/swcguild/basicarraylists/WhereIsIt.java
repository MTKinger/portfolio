package com.swcguild.basicarraylists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        ArrayList<Integer> myArray = new ArrayList<Integer>();
        boolean there = false;

        for (int i = 0; i < 10; i++) {
            myArray.add(1 + r.nextInt(50));
        }

        System.out.println("Array: " + myArray);
        System.out.println("Value to find: ");
        String value = sc.nextLine();
        int valueFind = Integer.parseInt(value);
        System.out.println("");

        int valueLocation = 0;

        for (int i = 0; i < myArray.size(); i++) {
            if (valueFind == myArray.get(i)) {
                valueLocation = i;
                there = true;
            }
        }

        if (there == true) {
            System.out.println(valueFind + " is in slot " + valueLocation + ".");
        }
        else{
            System.out.println(valueFind + " in not in the Array.");
        }
    }

}
