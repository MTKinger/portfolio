package com.swcguild.javabasicsskillscheck;

public class AreTheyTrue {

    public static void main(String[] args) {

        System.out.println(howTrue(true, true));
        System.out.println(howTrue(false, false));
        System.out.println(howTrue(true, false));
        System.out.println(howTrue(false, true));

    }

    public static String howTrue(boolean bool1, boolean bool2) {

        String output = "";

        if (bool1 == true && bool2 == true) {
            output = "BOTH.";
        } else if (bool1 == false && bool2 == false) {
            output = "NEITHER.";
        } else {
            output = "ONLY ONE.";
        }
        return output;
    }
}
