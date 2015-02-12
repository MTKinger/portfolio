package com.swcguild.dicerollcounter;

import java.util.ArrayList;
import java.util.Random;

public class DiceRollCounter {

    public static void main(String[] args) {

        ArrayList<Integer> rollCount = new ArrayList<>();

        Random r = new Random();

        int dieValue = 2;

        for (int i = 0; i < 50; i++) {
            int die1 = 1 + r.nextInt(6);
            int die2 = 1 + r.nextInt(6);
            int sum = die1+die2;
            if (sum == dieValue){
                
            }
            switch(rollSum){
                
            }
            
        }

    }

}
