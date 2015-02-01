package com.swcguild.baseballleague.businesslogic;

import com.swcguild.baseballleague.dtos.Batter;

public class BatterConstructor {

    public Batter buildBatter(Batter thisBatter) {
        Batter currentBatter = thisBatter;
        currentBatter.setTotalBases(calcTotalBases(currentBatter.getSingles(), currentBatter.getDoubles(), currentBatter.getTriples(), currentBatter.getHomeruns()));
        currentBatter.setBattingAverage(calcBattingAverage(currentBatter.getHits(), currentBatter.getAtBats()));
        currentBatter.setOnBasePercentage(calcOnBasePercentage(currentBatter.getHits(), currentBatter.getWalks(), currentBatter.getHitByPitch(), currentBatter.getAtBats(), currentBatter.getSacFlies()));
        currentBatter.setSluggingPercentage(calcSluggingPercentage(currentBatter.getSingles(), currentBatter.getDoubles(), currentBatter.getTriples(), currentBatter.getHomeruns(), currentBatter.getAtBats()));
        currentBatter.setOnBasePlusSlugging(calcOnBasePlusSlugging(currentBatter.getOnBasePercentage(), currentBatter.getSluggingPercentage()));
        currentBatter.setAtBatsPerHR(calcAbPerHr(currentBatter.getAtBats(), currentBatter.getHomeruns()));
        currentBatter.setAtBatsPerStrikeout(calcAbPerStrikout(currentBatter.getAtBats(), currentBatter.getStrikeouts()));
        currentBatter.setRunsPerAtBat(calcRunsPerAb(currentBatter.getRuns(), currentBatter.getAtBats()));
        return currentBatter;
    }

    private int calcTotalBases(int singles, int doubles, int triples, int homeruns) {
        return ((singles) + (doubles * 2) + (triples * 3) + (homeruns * 4));
    }

    private double calcBattingAverage(int hits, int atBats) {
        double hitsDouble = (double) hits;
        double atBatsDouble = (double) atBats;
        return (hitsDouble / atBatsDouble);
    }

    private double calcOnBasePercentage(int hits, int walks, int hbp, int atBats, int sacFlies) {
        double hitsDouble = (double) hits;
        double walksD = (double) walks;
        double hbpD = (double) hbp;
        double atBatsD = (double) atBats;
        double sacFliesD = (double) sacFlies;
        return ((hitsDouble + walksD + hbpD) / (atBatsD + walksD + hbpD + sacFliesD));
    }

    private double calcSluggingPercentage(int singles, int doubles, int triples, int homeruns, int atBats) {
        double atBatsD = (double)atBats;
        double totalBases = (double)((singles) + (doubles * 2) + (triples * 3) + (homeruns * 4));
        return(totalBases/atBatsD);
    }

    private double calcOnBasePlusSlugging(double onBase, double slugging) {
        return (onBase + slugging);
    }

    private double calcAbPerHr(int atBats, int homeruns) {
        double atBatsD = (double) atBats;
        double homerunsD = (double) homeruns;
        return (atBatsD / homerunsD);
    }

    private double calcAbPerStrikout(int atBats, int strikeouts) {
        double atBatsD = (double) atBats;
        double strikeoutsD = (double) strikeouts;
        return (atBatsD / strikeoutsD);
    }

    private double calcRunsPerAb(int runs, int atBats) {
        double runsD = (double) runs;
        double atBatsD = (double) atBats;
        return (runsD / atBatsD);
    }

}
