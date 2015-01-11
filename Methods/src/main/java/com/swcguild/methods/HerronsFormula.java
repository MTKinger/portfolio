package com.swcguild.methods;

public class HerronsFormula {

    public static void main(String[] args) {

        double a;
        a = triangleArea(3, 3, 3);
        System.out.println("A triagle with sides 3,3,3 has an area of " + a + ".");

        a = triangleArea(3, 4, 5);
        System.out.println("A triangle with sides 3,4,5 has an area of " + a + ".");

        a = triangleArea(7, 8, 9);
        System.out.println("A triangle with sides 7,8,9 has an area of " + a + ".");

    } 
    // at this point I get it.  A lot of work to be done and I don't feel the need
    // to do EVERY example in this exercise.

    public static double triangleArea(int a, int b, int c) {
        double s, A;

        s = ((a + b + c) / 2);
        A = Math.sqrt((s - a) * (s - b) * (s - c) * s);
        return A;
    }

}
