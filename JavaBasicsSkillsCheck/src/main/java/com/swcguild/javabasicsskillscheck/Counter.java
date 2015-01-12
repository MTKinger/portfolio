package com.swcguild.javabasicsskillscheck;

public class Counter {
    public static void main(String[] args) {
        
        to10();
        System.out.println("");
        toN(3);
        System.out.println("");
        toN(8);
        System.out.println("");
        toN(200);
        
    }
    public static void to10(){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
    public static void toN(int n){
        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }
        
    }

}
