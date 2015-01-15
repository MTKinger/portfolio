package com.swcguild.studentquizscores;

import java.util.Scanner;

public class ConsoleIO {

    Scanner sc = new Scanner(System.in);

    public int getInt(String prompt) {
        System.out.print(prompt);
        int input = Integer.parseInt(sc.nextLine());
        return input;
    }

    public int getInt(String prompt, int min, int max) {
        int input;
        do {
            System.out.println(prompt);
            input = Integer.parseInt(sc.nextLine());
        } while (input < min || input > max);
        return input;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String input = sc.nextLine();
        return input;
    }
    public float getFloat(String prompt) {
        System.out.print(prompt);
        float input = Float.parseFloat(sc.nextLine());
        return input;
    }
    public float getFloat(String prompt, float min, float max) {
        float input;
        do {
            System.out.println(prompt);
            input = Float.parseFloat(sc.nextLine());
        } while (input < min || input > max);
        return input;
    }
    public double getDouble(String prompt){
        System.out.println(prompt);
        double input = Double.parseDouble(sc.nextLine());
        return input;
    }
    public double getDouble(String prompt, double min, double max){
        double input;
        do {
            System.out.println(prompt);
            input = Double.parseDouble(sc.nextLine());
        } while (input < min || input > max);
        return input;
    }
    public void printMessage(String prompt){
        System.out.println(prompt);
    }
}
 