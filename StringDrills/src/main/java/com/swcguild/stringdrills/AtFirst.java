package com.swcguild.stringdrills;

public class AtFirst {

    public static void main(String[] args) {
        atFirst("Hello");
        atFirst("hi");
        atFirst("h");
    }

    private static void atFirst(String input) {

        if (input.length() <= 1) {
            System.out.println(input + "@");
        } else {
            System.out.println(input.substring(0, 2));
        }
    }

}
