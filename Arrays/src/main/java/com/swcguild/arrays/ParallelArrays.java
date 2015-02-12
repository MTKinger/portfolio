package com.swcguild.arrays;

import java.util.Scanner;

public class ParallelArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = {"Mitchell ", "Ortiz    ", "Luu      ", "Zimmerman", "Brooks   "};
        double[] gpa = {99.5, 78.5, 95.6, 96.8, 82.7};
        int[] id = {123456, 222222, 333333, 444444, 555555};

        System.out.print("Values:\n\t");
        for (int i = 0; i < 5; i++) {
            System.out.print(name[i] + "  " + gpa[i] + "  " + id[i] + "\n\t");
            if((1+i)%5 == 0){
                System.out.println("");
            }
        }
        
        System.out.print("ID number to find: ");
        int idSearch = sc.nextInt();
        System.out.println("");
        
        for (int i =0; i<name.length; i++){
            
            if (idSearch == id[i]){
                
                System.out.println("Found in element " + i);
                System.out.println("\tName: " + name[i]);
                System.out.println("\tAverage: " + gpa[i]);
                System.out.println("\tID: " + id[i]);
            }
        }
        

    }

}
