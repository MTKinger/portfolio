package com.swcguild.arrays;

public class BasicArray2 {
    public static void main(String[] args) {
        
        int basicArray[];
        basicArray = new int[10];
        
        for(int i = 0; i<10; i++){
            basicArray[i] = -113;
            System.out.println("Slot "+ i + " contains a " + basicArray[i]);
        }
        
    }

}
