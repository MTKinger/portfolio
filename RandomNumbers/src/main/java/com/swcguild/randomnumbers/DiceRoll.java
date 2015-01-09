package com.swcguild.randomnumbers;

import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        Random r = new Random();
        
        int die1 = r.nextInt(6);
        int die2 = r.nextInt(6);
        
        System.out.println("HERE COME THE DIE!!!");
        System.out.println("");
        System.out.println("");
        System.out.println("Roll #1:  " + (1 + die1));
        System.out.println("Roll #2:  " + (1 + die2));
        System.out.println("The total is " + (2+die1+ die2) + "!");
    }

}
