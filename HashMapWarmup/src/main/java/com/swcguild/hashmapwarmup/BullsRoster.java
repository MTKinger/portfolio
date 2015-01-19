package com.swcguild.hashmapwarmup;

import java.util.HashMap;
import java.util.Set;

public class BullsRoster {
     
    public static void main(String[] args) {
        
       HashMap<String, Integer> bulls = new HashMap<String, Integer>();
       
       bulls.put("Smith", 23);
       bulls.put("Jones" , 12) ;
       bulls.put("Jordan", 45);
       bulls.put("Pippen", 32);
       bulls.put("Kerr", 15);
     
       
       Set<String> playerMap = bulls.keySet();
       String[] playerArray = new String[playerMap.size()];
       playerArray = playerMap.toArray(playerArray);
       
       double counter = 0;
       double average;
       
        for (String currentPlayer : playerArray) {
            System.out.println(currentPlayer + " score:");
            int currentScore = bulls.get(currentPlayer);
            System.out.println(currentScore);
            System.out.println();
            counter = counter + currentScore;
        }
        
        System.out.println("Total team score: ");
        System.out.println(counter);
        System.out.println();
        System.out.println("Team average:");
        average = (counter/playerArray.length);
        System.out.println(average);
       
    }
    

}
