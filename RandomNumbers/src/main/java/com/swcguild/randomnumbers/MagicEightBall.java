package com.swcguild.randomnumbers;

import java.util.Random;

public class MagicEightBall {
    public static void main(String[] args){
        Random r = new Random();
        
        int choice = 1 + r.nextInt(15);
        String response = "";
        
        if (choice == 1){
            response = "Ask again later.";
        }
        if (choice == 2){
            response = "My signs point to yes.";
        }
        if (choice == 3){
            response = "There is no chance.";
        }
        if (choice == 4){
            response = "Maybe.";
        }
        if (choice == 5){
            response = "Who cares.";
        }
        if (choice == 6){
            response = "My sources say no.";
        }
        if (choice == 7){
            response = "I have it on good authority the answer is yes.";
        }
        if (choice == 8){
            response = "I don't see why not.";
        }
        if (choice == 9){
            response = "1 in a million is still a chance, dude.";
        }
        if (choice == 10){
            response = "Maybe when hell freezes over.";
        }
        if (choice >= 11 && choice < 15){
            response = "For sure.";
        }
        if (choice == 15){
            response = "I guess so.";
        }
        
        System.out.println("Magic 8-Ball says " + response);
    }

}
