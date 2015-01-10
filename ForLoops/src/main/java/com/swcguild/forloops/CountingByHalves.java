package com.swcguild.forloops;

public class CountingByHalves {
    public static void main(String[] args) throws Exception {
        
        System.out.println("  x  ");
        System.out.println("-----");
        
        for( double x = -10; x<= 10; x = x+0.5){
            System.out.println(x);
            Thread.sleep(500);
        }
    }

}
