package com.swcguild.stringdrills;

public class SwapsLast {
    
    public static void main(String[] args) {
        swapLast("coding");
        swapLast("cat");
        swapLast("Michael");
    }

    private static void swapLast(String a) {
        if (a.length() <= 1) {
            System.out.println("No Word Entered");
        } else {
            System.out.println(a.subSequence(0, a.length() - 2) + a.substring(a.length()-1)+ a.substring(a.length()-2, a.length()-1)); 
        }

    }

}
