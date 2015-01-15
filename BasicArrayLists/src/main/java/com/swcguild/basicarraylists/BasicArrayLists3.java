package com.swcguild.basicarraylists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists3 {

    public static void main(String[] args) {

        ArrayList<Integer> myArray = new ArrayList<Integer>();
        Random r = new Random();

        for (int i = 0; i < 1000; i++) {
            myArray.add(10 + r.nextInt(89));
        }

        for (int i = 0; i < 1000; i++) {
            System.out.print(myArray.get(i) + ",  ");
            if (1+i%10 == 0){
                System.out.println();
            }
        }
        
    }

}
