package com.swcguild.stringdrills;

public class MinCat {
    
    public static void main(String[] args) {
        minCat("Hello", "Hi");
        minCat("Hello", "java");
        minCat("java", "Hello");
    }
    
    private static void minCat(String a, String b){
        if (a.length() == b.length()){
            System.out.println(a+b);
        }
        else if (a.length() > b.length()){
            System.out.println(a.substring(a.length()-(b.length())) + b);
        }
        else{
            System.out.println(a + b.substring(b.length()-(a.length())));
        }
    }

}
