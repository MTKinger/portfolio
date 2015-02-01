package com.swcguild.baseballleague.businesslogic;

import com.swcguild.baseballleague.dtos.Pitcher;
import com.swcguild.baseballleague.dtos.Player;

public class PitcherBuilder {

    public Pitcher buildPitcher(Pitcher thisPitcher) {
        Pitcher currentPitcher = thisPitcher;
        currentPitcher.setInningsPitchedMath(calcInningsPitchedMath(currentPitcher.getInningsPitched()));
        currentPitcher.setEra(calcERA(currentPitcher.getInningsPitched(), currentPitcher.getEarnedRuns()));
        currentPitcher.setWhip(calcWhip(currentPitcher.getWalksAllowed(), currentPitcher.getHitsAllowed(), currentPitcher.getInningsPitched()));
        currentPitcher.setHitsPer9(calcHitsPer9(currentPitcher.getHitsAllowed(), currentPitcher.getInningsPitched()));
        currentPitcher.setWalksPer9(calcWalksPer9(currentPitcher.getWalksAllowed(), currentPitcher.getInningsPitched()));
        currentPitcher.setStrikeoutsPer9(calcStrikeoutsPer9(currentPitcher.getStrikeouts(), currentPitcher.getInningsPitched()));
        currentPitcher.setHomerunsPer9(calcHomerunsPer9(currentPitcher.getHomeRunsAllowed(), currentPitcher.getInningsPitched()));
        currentPitcher.setSavesPerOpportunity(calcSavesPerOpportunity(currentPitcher.getSaves(), currentPitcher.getBlownSaves()));
        currentPitcher.setWinLossPercent(calcWinLossPercent(currentPitcher.getWins(), currentPitcher.getLosses()));
        currentPitcher.setStrikeoutWalkRatio(calcStrikeoutWalkRatio(currentPitcher.getStrikeouts(), currentPitcher.getWalksAllowed()));
        return currentPitcher;
    }

    private double calcInningsPitchedMath(double inningsPitched) {
        return inningsPitched;
    }
    
    private double calcERA(double inningsPitched, int earnedRuns){
        double erDouble = (double)earnedRuns;
        return ((erDouble/inningsPitched) *9);
    }
    
    private double calcWhip(int walks, int hits, double inningsPitched){
        double walksDouble = (double)walks;
        double hitsDouble = (double)hits;
        return ((walksDouble + hitsDouble) / inningsPitched);
    }
    
    private double calcHitsPer9(int hits, double inningsPitched){
        double hitsDouble = (double)hits;
        return((hitsDouble/inningsPitched) * 9);
    }
    
    private double calcWalksPer9(int walks, double inningsPitched){
        double walksDouble = (double)walks;
        return ((walksDouble/inningsPitched) *9);
    }
    
    private double calcStrikeoutsPer9(int strikeouts, double inningsPitched){
        double strikeoutsDouble = (double)strikeouts;
        return ((strikeoutsDouble/inningsPitched) * 9);
    }
    
    private double calcHomerunsPer9(int homerunsAllowed, double inningsPitched){
        double hrDouble = (double)homerunsAllowed;
        return ((hrDouble/inningsPitched) * 9);
    }
    
    private double calcSavesPerOpportunity(int saves, int blownSaves){
        double savesDouble  = (double)saves;
        double blownSavesDouble = (double)blownSaves;
        return (savesDouble / (savesDouble + blownSavesDouble));
    }
    
    private double calcWinLossPercent(int wins, int losses){
        double winsDouble = (double)wins;
        double lossesDouble = (double)losses;
        return (winsDouble/lossesDouble);
    }
    
    private double calcStrikeoutWalkRatio(int strikeouts, int walks){
        double strikeoutsDouble = (double)strikeouts;
        double walksDouble = (double)walks;
        return (strikeoutsDouble / walksDouble);
    }

}
