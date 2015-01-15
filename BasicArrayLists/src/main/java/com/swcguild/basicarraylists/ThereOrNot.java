package com.swcguild.basicarraylists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ThereOrNot {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
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
                System.out.println(searchInt + " is in the array.");
                there = true;
            }
        }
            if (there == false){
            System.out.println(searchInt + " is not in the Array List");
        }
        
        
        
    }

}
