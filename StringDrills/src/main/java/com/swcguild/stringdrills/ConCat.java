package com.swcguild.stringdrills;

public class ConCat {

    public static void main(String[] args) {
        conCat("abc", "cat");
        conCat("abc", "dog");
        conCat("abc", "");
        conCat("Eagles", "Sixers");
    }

    private static void conCat(String a, String b) {
        if (a.length() == 0) {
            System.out.println(b);
        } else if (b.length() == 0) {
            System.out.println(a);
        } else if (a.substring(a.length() - 1).equalsIgnoreCase(b.substring(0,1))) {
            System.out.println(a + b.substring(1));
        } else {
            System.out.println(a + b);

        }

    }
}
