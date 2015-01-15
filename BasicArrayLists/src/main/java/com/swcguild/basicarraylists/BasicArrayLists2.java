package com.swcguild.basicarraylists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        Random r = new Random();
        
        for ( int i =0; i<10;i++){
            myArray.add(1 + r.nextInt(100));
        }
        System.out.println("Array List: " + myArray);
    }

}
