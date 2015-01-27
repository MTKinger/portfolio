package UI;

import java.util.InputMismatchException;
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
                System.out.println("Please enter a valid numerical value!");
                badInput = true;
            }
        } while (badInput);
        return result;
    }

    public int getInt(String prompt, int min, int max) {
        int input = 0;
        boolean badInput;
        do {
            do {
                try {
                    System.out.println(prompt);
                    input = Integer.parseInt(sc.nextLine());
                    badInput = false;
                } catch (NumberFormatException nfe) {
                    System.out.println("Please enter a valid numerical value!");
                    badInput = true;
                }

            } while (input < min || input > max);
        } while (badInput);

        return input;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String input = sc.nextLine();
        return input;
    }

    public float getFloat(String prompt) {
        boolean badInput;
        float input = 0;

        do {
            try {
                System.out.print(prompt);
                input = Float.parseFloat(sc.nextLine());
                badInput = false;
            } catch (InputMismatchException ime) {
                System.out.println("Please enter a valid numerical value!");
                badInput = true;
            }
        } while (badInput);
        return input;
    }

    public float getFloat(String prompt, float min, float max) {
        float input = 0;
        boolean badInput;
        do {
            do {
                try {
                    System.out.println(prompt);
                    input = Float.parseFloat(sc.nextLine());
                    badInput = false;
                } catch (InputMismatchException ime) {
                    System.out.println("Please enter a valid numerical value!");
                    badInput = true;
                }
            } while (input < min || input > max);
        } while (badInput);
        return input;
    }

    public double getDouble(String prompt) {
        boolean badInput;
        double input = 0;
        do {
            try {
                System.out.println(prompt);
                input = Double.parseDouble(sc.nextLine());
                badInput = false;
            } catch (NumberFormatException ime) {
                System.out.println("Please enter a valid numerical value!");
                badInput = true;
            }

        } while (badInput);
        return input;
    }

    public double getDouble(String prompt, double min, double max) {
        double input = 0;
        boolean badInput;
        do {
            do {
                try {
                    System.out.println(prompt);
                    input = Double.parseDouble(sc.nextLine());
                    badInput = false;
                } catch (InputMismatchException ime) {
                    System.out.println("Please enter a valid numerical value!");
                    badInput = true;
                }
            } while (input < min || input > max);
        } while (badInput);
        return input;
    }

    public void printMessage(String prompt) {
        System.out.println(prompt);
    }
    
    public void printMessageNoReturn(String prompt) {
        System.out.print(prompt);
    }
}
