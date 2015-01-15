package com.swcguild.basicarraylists;

import java.util.ArrayList;

public class BasicArrayLists1 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        
        for(int i = 0;i<10;i++){
            myArray.add(-113);
        }
        for(int i = 0; i < 10; i++){
            System.out.println("Slot " + i + " contains a " + myArray.get(i));
        }
    }

}
