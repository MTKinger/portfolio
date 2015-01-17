package com.swcguild.stringdrills;

public class StripX {
    
    public static void main(String[] args) {
        stripX("xHix");
        stripX("xHi");
        stripX("Hxix");
        stripX("xBigMKx");
    }

    private static void stripX(String a) {
        if (a.length() < 2) {
            System.out.println(a);
        } else if (a.substring(0, 1).equalsIgnoreCase("x") && 
                a.substring(a.length()-1).equalsIgnoreCase("x")) {
            System.out.println(a.substring(1, a.length() - 1));
        } else {
            System.out.println(a);
        }

    }

}
