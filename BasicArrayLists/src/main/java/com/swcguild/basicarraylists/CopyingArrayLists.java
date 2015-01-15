package com.swcguild.basicarraylists;

import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayLists {
    
    public static void main(String[] args) {
        
        Random r = new Random();
        ArrayList<Integer> myArray = new ArrayList<>();
        
        for ( int i = 0; i < 10 ; i++){
            myArray.add(1 + r.nextInt(100));
        }
        ArrayList<Integer> myArray2 = new ArrayList<Integer>();
            for ( int i = 0; i < 10; i++){
                myArray2.add(myArray.get(i));
            }
            myArray.set(9, -7);
            System.out.println("Array 1: " + myArray);
            System.out.println("Array 2: "+ myArray2);
    }

}
