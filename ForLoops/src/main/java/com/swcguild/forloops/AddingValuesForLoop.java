package com.swcguild.forloops;

import java.util.Scanner;

public class AddingValuesForLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.println("");

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            System.out.print(i + "\t");
            sum = (sum + i);
            if (i%10 == 0){
                System.out.println("");
            }
        }
        System.out.println("The sum is " + sum + ".");
    }

}
