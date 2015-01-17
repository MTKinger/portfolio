package com.swcguild.stringdrills;

public class HasBad {

    public static void main(String[] args) {

        System.out.println("1");
        hasBad("badxx");
        System.out.println("2");
        hasBad("xbadxx");
        System.out.println("3");
        hasBad("xxbadxx");

    }

    public static boolean hasBad(String word) {
        boolean output = false;
        for (int i = 0; i < 2; i++) {
            if (word.substring(i, i + 3).equalsIgnoreCase("bad")) {
                output = true;
            } else {
                output = false;
            }

            if (output == true) {
                System.out.println("You got it.");
            }
        }
        return output;
    }

}
