package com.swcguild.forloops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Count to: ");
        int repetitions = sc.nextInt();
        
        for( int i = 1; i<=repetitions; i = i+1){
            System.out.print(i + "  ");
        }
        System.out.println("");
        
    }

}
