package com.swcguild.refactorobjects;

import java.util.Scanner;

public class Factorizer {

    private int number;
    private int sumOfFactors = 0;
    private int numOfFactors = 0;
    Scanner sc = new Scanner(System.in);
    
    public void run(){
        System.out.print("What number would you like to factor? ");
        factorizer(number = sc.nextInt());
        numberChecker();
    }
       
    
    
    public void factorizer(int number){
    while (number <= 0) {
        System.out.println("Enter a number greater than 0.");
        number = sc.nextInt();
}
        System.out.println("The factors of " + number + " are:");
        int i = 0;
        while (i <= number / 2) {
        i++;
        if (number % i == 0) {
        System.out.println(i);
        sumOfFactors = sumOfFactors + i;
        numOfFactors++;
}
}
}
        public void numberChecker(){
         if (sumOfFactors == number) {
System.out.println(number + " is a perfect number.");
} else {
System.out.println(number + " is not a perfect number.");
}
if (numOfFactors <= 1) {
System.out.println(number + " is a prime number.");
} else {
System.out.println(number + " is not a prime number");
}
        }
}
