package com.swcguild.forloops;

public class NoticingEvenNumbers {
    
    public static void main(String[] args) throws Exception {
        
        for (int x = 1; x <= 20; x = x + 1) {
            if (x % 2 == 0) {
                System.out.println(x + "  <");
                Thread.sleep(400);
            } else {
                System.out.println(x);
                Thread.sleep(400);
            }
        }
        
    }
    
}
