package com.swcguild.fileinputandoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Summing3 {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(new BufferedReader(new FileReader("3nums.txt")));
        
        System.out.println("Reading numbers...");
        System.out.println("");
        
        while(sc.hasNextLine()){
            System.out.println(sc.nextInt());
        }
        
    }

}
