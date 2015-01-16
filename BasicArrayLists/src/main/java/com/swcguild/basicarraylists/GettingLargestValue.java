package com.swcguild.basicarraylists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GettingLargestValue {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        ArrayList<Integer> myArray = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            myArray.add(1 + r.nextInt(50));
        }

        System.out.println("Array: " + myArray);
        System.out.println("");
        
        int max = 0;
        
        for (int i = 0; i<myArray.size();i++)
            if (myArray.get(i)>max){
                max = myArray.get(i); 
        }
        System.out.println("The max value is: " + max + ".");
    }

}
