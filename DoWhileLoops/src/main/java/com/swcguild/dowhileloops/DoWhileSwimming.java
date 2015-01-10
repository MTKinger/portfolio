package com.swcguild.dowhileloops;

import java.util.Scanner;

public class DoWhileSwimming {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        String swimmer1 = "Mike";
        String swimmer2 = "Kinger";
        
        double currentTemp;
        double savedTemp;
        double minTemp = 79.0;
        int swimTime;
        
        System.out.print("What is the water temperature currently? ");
        currentTemp = sc.nextDouble();
        savedTemp = currentTemp;
        
        System.out.println("\n Okay, so the current water temperature is " + currentTemp + "F.");
        System.out.println( swimmer1 + " approaches the lake...");
        
        swimTime = 0;
        while (currentTemp >= minTemp){
            swimTime++;
            System.out.println(swimmer1 + " swims for a bit.  Current swim time: " + swimTime + " min.");
            Thread.sleep(1500);
            currentTemp-=0.5;
            System.out.println("The current water temperature is " + currentTemp + "F.");
        }
        System.out.println(swimmer1 + " stops swimming. Total swim time : " + swimTime + " minutes.");
        
        currentTemp = savedTemp;
        swimTime = 0;
        
        System.out.print("\n\n\n");
        
        do {
            swimTime++;
            System.out.println(swimmer1 + " swims for a bit.  Current swim time: " + swimTime + " min.");
            Thread.sleep(1500);
            currentTemp-=0.5;
            System.out.println("The current water temperature is " + currentTemp + "F.");
        } while (currentTemp >= minTemp);
    }

}
