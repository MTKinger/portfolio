package com.swcguild.methods;

import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shape Area Calculator v1.0");
        System.out.println("");
        int choice = 0;

        while (choice != 5) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Circle");
            System.out.println("5) Quit");
            System.out.print("Which shape: ");
            choice = sc.nextInt();
            System.out.println("");

            if (choice == 1) {
                System.out.print("Base: ");
                int base = sc.nextInt();
                System.out.print("Height: ");
                int height = sc.nextInt();
                System.out.println("");
                System.out.println("The area is " + area_triangle(base, height));
                System.out.println("");
            }
            if (choice == 2) {
                System.out.print("Length: ");
                int length = sc.nextInt();
                System.out.print("Width: ");
                int width = sc.nextInt();
                System.out.println("");
                System.out.println("The area is " + area_rectangle(length, width));
                System.out.println("");
            }
            if (choice == 3) {
                System.out.print("Side: ");
                int side = sc.nextInt();
                System.out.println("");
                System.out.println("The area is " + area_square(side));
                System.out.println("");
            }
            if (choice == 4) {
                System.out.print("Radius: ");
                int radius = sc.nextInt();
                System.out.println("");
                System.out.println("The area is " + area_circle(radius));
                System.out.println("");
            }

        }
        System.out.println("GOODBYE!");

    }

    public static double area_circle(int radius) {
        double area = (Math.pow(radius, 2) * Math.PI);
        return area;
    }

    public static double area_square(int side) {
        double area = (side * side);
        return area;
    }

    public static double area_triangle(int base, int height) {
        double area = ((base * height) * .5);
        return area;
    }

    public static double area_rectangle(int length, int width) {
        double area = (length * width);
        return area;
    }

}
