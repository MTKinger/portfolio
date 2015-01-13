package com.swcguild.refactorobjects;

import java.util.Random;
import java.util.Scanner;

public class MorePractice {

    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    public void run() {
        System.out.print("What number would you like to start with? ");
        int starter = sc.nextInt();
        divideBy(addA(multiplyBy(starter)));

    }

    public int multiplyBy(int starter) {
        int factor = 1 + r.nextInt(5);
        System.out.println("The factor is " + factor + ".");
        int equals = (starter * factor);
        return equals;
    }

    public int addA(int equals) {
        int addend = 1 + r.nextInt(20);
        System.out.println("We have added a " + addend + ".");
        int sum = (equals + addend);
        return sum;
    }

    public void divideBy(int sum) {
        int divisor = 1 + r.nextInt(3);
        System.out.println("The divisor was " + divisor + ".");
        double quotient = (sum / divisor);
        System.out.println(quotient);
    }

}
