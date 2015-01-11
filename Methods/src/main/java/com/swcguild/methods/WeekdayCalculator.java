package com.swcguild.methods;

import java.util.Scanner;

public class WeekdayCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Welcome to the weekday calculator.");
//        System.out.println("\nAll you have to do is enter your birthday, and it will tell you \nthe day of the week on which you were born.");
//        System.out.println("\nSome automatic tests...");
//        System.out.println("12 10 2003 => " + weekday(12, 10, 2003));
//        System.out.println(" 2 13 1976 => " + weekday(2, 13, 1976));
//        System.out.println(" 2 13 1977 => " + weekday(2, 13, 1977));
//        System.out.println(" 7  2 1974 => " + weekday(7, 2, 1974));
//        System.out.println(" 1 15 2003 => " + weekday(1, 15, 2003));
//        System.out.println("10 13 2000 => " + weekday(10, 13, 2000));
//        System.out.println();
//
//        System.out.println("Now it's your turn! What is your birthday?");
//        System.out.println("Birth date (mm dd yyyy): ");
//        int mm = sc.nextInt();
//        int dd = sc.nextInt();
//        int yyyy = sc.nextInt();
//        String month = "month_name()";
//        System.out.println("You were born on " + weekday() + ", " + month + " " + dd + ", " + yyyy + ".");
    
}
    

    public static String month_name(int mm) {
        String result = "";
        if (mm == 1) {
            result = "January";
        }
        if (mm == 2) {
            result = "February";
        }
        if (mm == 3) {
            result = "March";
        }
        if (mm == 4) {
            result = "April";
        }
        if (mm == 5) {
            result = "May";
        }
        if (mm == 6) {
            result = "June";
        }
        if (mm == 7) {
            result = "July";
        }
        if (mm == 8) {
            result = "August";
        }
        if (mm == 9) {
            result = "September";
        }
        if (mm == 10) {
            result = "October";
        }
        if (mm == 11) {
            result = "November";
        }
        if (mm == 12) {
            result = "December";
        }
        if (mm > 12) {
            result = "ERROR.";
        }
        return result;
    }
    public static int month_offset(int mm) {
        int offset = 0;

        if (mm == 1) {
            offset = 1;
        }
        if (mm == 2) {
        }
        if (mm == 3) {
            offset = 4;
        }
        if (mm == 4) {
            offset = 0;
        }
        if (mm == 5) {
            offset = 2;
        }
        if (mm == 6) {
            offset = 5;
        }
        if (mm == 7) {
            offset = 0;
        }
        if (mm == 8) {
            offset = 3;
        }
        if (mm == 9) {
            offset = 6;
        }
        if (mm == 10) {
            offset = 1;
        }
        if (mm == 11) {
            offset = 4;
        }
        if (mm == 12) {
            offset = 6;
        }
        if (mm > 12) {
            offset = -1;
        }
        return offset;

    }
//    public static String weekday(int mm, int dd, int yyyy){
//        int yy;
//        int total;
//        String date = "";
//        yy= (yyyy - 1990);
//        total = (yy /4);
//        //total = (total + yy + dd + month_offset());
//    }
}

