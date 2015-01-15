package com.swcguild.basicarraylists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueArrayLists {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        boolean there = false;

        for (int i = 0; i < 10; i++) {
            myArray.add(1 + r.nextInt(50));
        }

        System.out.println("Array: " + myArray);
        System.out.println("");
        System.out.print("What number would you like to search"
                + " for: ");
        String search = sc.nextLine();
        int searchInt = Integer.parseInt(search);
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            if (searchInt == myArray.get(i)) {
                there = true;
            }
        }
        if (there == true){
            System.out.println(search + " is in the array list.");
        }
        else{
            System.out.println(search + " is not int the array list.");
        }
    }
}
