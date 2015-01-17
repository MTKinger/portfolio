package com.swcguild.stringdrills;

public class LastChars {
    
    public static void main(String[] args) {
        lastChars("last", "chars");
        lastChars("yo", "mama");
        lastChars("hi", "");
        
    }

    private static void lastChars(String a, String b) {
        if (a.length() == 0) {
            System.out.println("@" + b.substring(b.length() - 1));
        } else if (b.length() == 0) {
            System.out.println(a.substring(0, 1)+ "@");
        }
        else{
            System.out.println(a.substring(0, 1) + b.substring(b.length()-1));
        }

    }

}
