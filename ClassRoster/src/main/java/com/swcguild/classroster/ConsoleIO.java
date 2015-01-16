package com.swcguild.classroster;

import java.util.Scanner;

public class ConsoleIO {

    Scanner sc = new Scanner(System.in);

    public int getInt(String prompt) {
        boolean badInput;
        int result = 0;
        do {
            try {
                System.out.println(prompt);
                result = Integer.parseInt(sc.nextLine());
                badInput = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a numeric value!");
                badInput = true;
            }
        } while (badInput);
        return result;
    }

    public int getInt(String prompt, int min, int max) {
        int result = 0;
        do {
            result = getInt(prompt);
        } while (result < min || result > max);
        return result;
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

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double input = Double.parseDouble(sc.nextLine());
        return input;
    }

    public double getDouble(String prompt, double min, double max) {
        double input;
        do {
            System.out.println(prompt);
            input = Double.parseDouble(sc.nextLine());
        } while (input < min || input > max);
        return input;
    }

    public void printMessage(String prompt) {
        System.out.println(prompt);
    }
}
