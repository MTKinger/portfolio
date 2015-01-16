package com.swcguild.basicarraylists;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListStrings {
    
    public static void main(String[] args) {
        
    
    
    ArrayList<String> myArray = new ArrayList<String>();
    
    
    myArray.add("ask");
    myArray.add("not");
    myArray.add("what");
    myArray.add("your");
    myArray.add("country");
    myArray.add("can");
    myArray.add("do");
    myArray.add("for");
    myArray.add("basket");
    myArray.add("dog");
    myArray.add("car");
    myArray.add("apple");
    
    
        System.out.println("Array: " + myArray);
        
        Collections.sort(myArray);
        
        System.out.println("New Array: " + myArray);
    
    }
}
