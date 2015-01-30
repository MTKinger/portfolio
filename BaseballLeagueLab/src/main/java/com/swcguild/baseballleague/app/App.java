package com.swcguild.baseballleague.app;

import com.swcguild.baseballleague.dtos.Pitcher;

public class App {
    
    public static void main(String[] args) {
        Pitcher roy = new Pitcher(001);
        
        roy.setFirstName("Roy");
        roy.setLastName("Halladay");
        roy.setBatHand('R');
        roy.setThrowHand('R');
        roy.setNumber(34);
        roy.setPosition("SP");
        roy.setGamesPlayed(26);
        roy.setEarnedRuns(76);
        roy.setBlownSaves(3);
        roy.setEra(2.98);
        roy.setStrikeouts(201);
        roy.setHitsAllowed(21);
        roy.setWins(21);
        roy.setLosses(6);
        roy.setSaves(1);
        roy.setHitsAllowed(79);
        roy.setWalksAllowed(39);
        roy.setWhip(1.01);
        roy.setInningsPitched(234);
        roy.setHitsPer9(6.02);
        roy.setWalksPer9(1.24);
        roy.setStrikeoutsPer9(7.81);
        roy.setHomerunsPer9(0.64);
        roy.setSavesPerOpportunity(0);
        roy.setTeamCity("Philadelphia");
        roy.setTeamName("Phillies");
        
        roy.testingPitcherToString(roy);
        
    }

}
