package com.swcguild.stringdrills;

public class TweakFront {
    public static void main(String[] args) {
        tweakFront("Hello");
        tweakFront("away");
        tweakFront("oboe");
        tweakFront("able");
        
    }
    
    
    
    
    private static void tweakFront(String a){
        if(a.substring(0, 1).equalsIgnoreCase("a") && a.substring(1, 2).equalsIgnoreCase("b")){
            System.out.println(a);
        }
        else if (a.substring(0, 1).equalsIgnoreCase("a")){
            System.out.println(a.substring(0, 1) + a.substring(2));
        }
        else if(a.substring(1, 2).equalsIgnoreCase("b")){
            System.out.println(a.substring(1));
        }
        else System.out.println(a.substring(2));
    }

}
