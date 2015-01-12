package com.swcguild.javabasicsskillscheck;

public class Adder {
    public static void main(String[] args) {
        
        System.out.println(add(1,1));
        System.out.println(add (2,3));
        System.out.println(add (5,8));
        System.out.println(add(95,42));
        
    }
    public static int add(int a, int b){
        int sum;
        sum = (a +b);
        return sum;
    }

}
