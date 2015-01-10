package com.swcguild.forloops;

import java.util.Scanner;

public class CountingRevisited {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Count from: ");
        int countFrom = sc.nextInt();
        System.out.print("Count to: ");
        int countTo = sc.nextInt();
        System.out.print("Count by: ");
        int countBy = sc.nextInt();
        
        for( int i = countFrom; i <= countTo; i = i + countBy){
            System.out.print( i + "  ");
        }
        System.out.println("");
    }

}
