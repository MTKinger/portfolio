package com.swcguild.forloops;

public class XsAndYs {

    public static void main(String[] args) throws Exception {

        System.out.println("  X  \t  Y  ");
        System.out.println("-----\t-----");

        for (double x = -10; x <= 10; x = x + 0.5) {
            double y = (x * x);   //i can work around this, but why is it an error???
            System.out.println(x + "\t " + (y));
            Thread.sleep(400);
        }
    }

}
