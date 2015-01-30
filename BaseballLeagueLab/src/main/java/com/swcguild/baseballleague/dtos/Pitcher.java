package com.swcguild.baseballleague.dtos;

public class Pitcher extends Player {

    private int earnedRuns;                 //Added to String**
    private int strikeouts;                 //Added to String**
    private int homeRunsAllowed;            //Added to String**
    private int wins;                       //Added to String**
    private int losses;                     //Added to String**
    private int saves;                      //Added to String**
    private int blownSaves;                 //Added to String**
    private int hitsAllowed;                //Added to String**
    private int walksAllowed;               //Added to String**
    private double era;                     //Added to String**
    private double whip;                    //Added to String**
    private double inningsPitched;          //Added to String**
    private double hitsPer9;                //Added to String**
    private double walksPer9;               //Added to String**
    private double strikeoutsPer9;          //Added to String**
    private double homerunsPer9;            //Added to String**
    private double savesPerOpportunity;     //Added to String**
    private double inningsPitchedMath;      //No Need

    public Pitcher(int id) {
        this.mlbPlayerId = id;
    }

    public double getEra() {
        return era;
    }

    public void setEra(double era) {
        this.era = era;
    }

    public int getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    public double getWhip() {
        return whip;
    }

    public void setWhip(double whip) {
        this.whip = whip;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    public double getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(double inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

    public int getHomeRunsAllowed() {
        return homeRunsAllowed;
    }

    public void setHomeRunsAllowed(int homeRunsAllowed) {
        this.homeRunsAllowed = homeRunsAllowed;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getBlownSaves() {
        return blownSaves;
    }

    public void setBlownSaves(int blownSaves) {
        this.blownSaves = blownSaves;
    }

    public int getHitsAllowed() {
        return hitsAllowed;
    }

    public void setHitsAllowed(int hitsAllowed) {
        this.hitsAllowed = hitsAllowed;
    }

    public double getHitsPer9() {
        return hitsPer9;
    }

    public void setHitsPer9(double hitsPer9) {
        this.hitsPer9 = hitsPer9;
    }

    public double getStrikeoutsPer9() {
        return strikeoutsPer9;
    }

    public void setStrikeoutsPer9(double strikeoutsPer9) {
        this.strikeoutsPer9 = strikeoutsPer9;
    }

    public double getHomerunsPer9() {
        return homerunsPer9;
    }

    public void setHomerunsPer9(double homerunsPer9) {
        this.homerunsPer9 = homerunsPer9;
    }

    public double getSavesPerOpportunity() {
        return savesPerOpportunity;
    }

    public void setSavesPerOpportunity(double savesPerOpportunity) {
        this.savesPerOpportunity = savesPerOpportunity;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getWalksAllowed() {
        return walksAllowed;
    }

    public void setWalksAllowed(int walksAllowed) {
        this.walksAllowed = walksAllowed;
    }

    public double getWalksPer9() {
        return walksPer9;
    }

    public void setWalksPer9(double walksPer9) {
        this.walksPer9 = walksPer9;
    }

    public double getInningsPitchedMath() {
        return inningsPitchedMath;
    }

    public void setInningsPitchedMath(double inningsPitchedMath) {
        this.inningsPitchedMath = inningsPitchedMath;
    }


    public void testingPitcherToString(Pitcher pitcher) {
        System.out.println("\n\n" + pitcher.getLastName() + ", " + pitcher.getFirstName()
                + " - " + pitcher.getPosition() + " - #" + pitcher.getNumber() + 
                " - " + pitcher.getTeamCity() + " " + pitcher.getTeamName() + "\n\n"
                + "-2014 STATS-\n");
        System.out.printf("%-25s"
                + "%-25s"
                + "%-25s\n"
                + "%-25s"
                + "%-25s"
                + "%-25s\n"
                + "%-25s"
                + "%-25s"
                + "%-25s\n"
                + "%-25s"
                + "%-25s"
                + "%-25s\n\n"
                + "%-25s"
                + "%-25s"
                + "%-25s\n"
                + "%-25s"
                + "%-25s"
                + "%-25s\n"
                + "%-25s\n\n"
                + "%-25s"
                + "%-25s\n\n"
                + "%s\n",
                "Games Played: " + pitcher.getGamesPlayed(),
                "Innings Pitched: " + pitcher.getInningsPitched(),
                "Earned Runs: " + pitcher.getEarnedRuns(),
                "Hits Allowed: " + pitcher.getHitsAllowed(),
                "Walks Allowed: " + pitcher.getWalksAllowed(),
                "Strikeouts: " + pitcher.getStrikeouts(),
                "Homeruns Allowed: " + pitcher.getHomeRunsAllowed(),
                "Wins: " + pitcher.getWins(),
                "Losses: " + pitcher.getLosses(),
                "Saves: " + pitcher.getSaves(),
                "Blown Saves: " + pitcher.getBlownSaves(),
                "Save Opportunities: " + (pitcher.getSaves() + pitcher.getBlownSaves()),
                "ERA: " + pitcher.getEra(),
                "WHIP: " + pitcher.getWhip(),
                "Hits/9: " + pitcher.getHitsPer9(),
                "Walks/9: " + pitcher.getWalksPer9(),
                "Strikeouts/9: " + pitcher.getStrikeoutsPer9(),
                "Homeruns/9: " + pitcher.getHomerunsPer9(),
                "Saves Per Opportunity: " + pitcher.getSavesPerOpportunity(),
                "Bats: " + pitcher.getBatHand(),
                "Throws: " + pitcher.getThrowHand(),
                "MLB ID#: " + pitcher.getMlbPlayerId());

    }

}
