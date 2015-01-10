package com.swcguild.forloops;

public class FIzzBuzz {

    public static void main(String[] args) throws Exception {

        for (int x = 1; x <= 100; x = x + 1) {
            if (x % 5 == 0 && x % 3 == 0) {
                System.out.println("FIZZBUZZ");
                Thread.sleep(400);
            }
            else if(x%3==0){
                System.out.println("FIZZ");
                Thread.sleep(400);
            }
            else if (x%5==0){
                System.out.println("BUZZ");
                Thread.sleep(400);
            }
            else {
                System.out.println(x);
                Thread.sleep(400);
            }
        }

    }

}
