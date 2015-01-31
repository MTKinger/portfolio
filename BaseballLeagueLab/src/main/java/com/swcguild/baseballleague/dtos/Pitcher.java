package com.swcguild.baseballleague.dtos;

public class Pitcher extends Player {

    private int earnedRuns;                 
    private int strikeouts;                 
    private int homeRunsAllowed;            
    private int wins;                       
    private int losses;                     
    private int saves;                      
    private int blownSaves;                 
    private int hitsAllowed;                
    private int walksAllowed;               
    private double era;                     
    private double whip;                    
    private double inningsPitched;          
    private double hitsPer9;                
    private double walksPer9;               
    private double strikeoutsPer9;          
    private double homerunsPer9;            
    private double savesPerOpportunity;     
    private double inningsPitchedMath;      
    private double winLossPercent;          
    private double strikeoutWalkRatio;      
    private int runsAllowed;                
    private int completeGames;              
    private int shutouts;                   
    private int hitBatters;                 
    private int balks;                      
    private int wildPitches;
    private int battersFaced;               

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

    public double getWinLossPercent() {
        return winLossPercent;
    }

    public void setWinLossPercent(double winLossPercent) {
        this.winLossPercent = winLossPercent;
    }

    public double getStrikeoutWalkRatio() {
        return strikeoutWalkRatio;
    }

    public void setStrikeoutWalkRatio(double strikeoutWalkRatio) {
        this.strikeoutWalkRatio = strikeoutWalkRatio;
    }

    public int getRunsAllowed() {
        return runsAllowed;
    }

    public void setRunsAllowed(int runsAllowed) {
        this.runsAllowed = runsAllowed;
    }

    public int getCompleteGames() {
        return completeGames;
    }

    public void setCompleteGames(int completeGames) {
        this.completeGames = completeGames;
    }

    public int getShutouts() {
        return shutouts;
    }

    public void setShutouts(int shutouts) {
        this.shutouts = shutouts;
    }

    public int getHitBatters() {
        return hitBatters;
    }

    public void setHitBatters(int hitBatters) {
        this.hitBatters = hitBatters;
    }

    public int getBalks() {
        return balks;
    }

    public void setBalks(int balks) {
        this.balks = balks;
    }

    public int getWildPitches() {
        return wildPitches;
    }

    public void setWildPitches(int wildPitches) {
        this.wildPitches = wildPitches;
    }

    public int getBattersFaced() {
        return battersFaced;
    }

    public void setBattersFaced(int battersFaced) {
        this.battersFaced = battersFaced;
    }

    public void testingPitcherToString(Pitcher pitcher) {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.earnedRuns;
        hash = 53 * hash + this.strikeouts;
        hash = 53 * hash + this.homeRunsAllowed;
        hash = 53 * hash + this.wins;
        hash = 53 * hash + this.losses;
        hash = 53 * hash + this.saves;
        hash = 53 * hash + this.blownSaves;
        hash = 53 * hash + this.hitsAllowed;
        hash = 53 * hash + this.walksAllowed;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.era) ^ (Double.doubleToLongBits(this.era) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.whip) ^ (Double.doubleToLongBits(this.whip) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.inningsPitched) ^ (Double.doubleToLongBits(this.inningsPitched) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.hitsPer9) ^ (Double.doubleToLongBits(this.hitsPer9) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.walksPer9) ^ (Double.doubleToLongBits(this.walksPer9) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.strikeoutsPer9) ^ (Double.doubleToLongBits(this.strikeoutsPer9) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.homerunsPer9) ^ (Double.doubleToLongBits(this.homerunsPer9) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.savesPerOpportunity) ^ (Double.doubleToLongBits(this.savesPerOpportunity) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.inningsPitchedMath) ^ (Double.doubleToLongBits(this.inningsPitchedMath) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.winLossPercent) ^ (Double.doubleToLongBits(this.winLossPercent) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.strikeoutWalkRatio) ^ (Double.doubleToLongBits(this.strikeoutWalkRatio) >>> 32));
        hash = 53 * hash + this.runsAllowed;
        hash = 53 * hash + this.completeGames;
        hash = 53 * hash + this.shutouts;
        hash = 53 * hash + this.hitBatters;
        hash = 53 * hash + this.balks;
        hash = 53 * hash + this.wildPitches;
        hash = 53 * hash + this.battersFaced;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pitcher other = (Pitcher) obj;
        if (this.earnedRuns != other.earnedRuns) {
            return false;
        }
        if (this.strikeouts != other.strikeouts) {
            return false;
        }
        if (this.homeRunsAllowed != other.homeRunsAllowed) {
            return false;
        }
        if (this.wins != other.wins) {
            return false;
        }
        if (this.losses != other.losses) {
            return false;
        }
        if (this.saves != other.saves) {
            return false;
        }
        if (this.blownSaves != other.blownSaves) {
            return false;
        }
        if (this.hitsAllowed != other.hitsAllowed) {
            return false;
        }
        if (this.walksAllowed != other.walksAllowed) {
            return false;
        }
        if (Double.doubleToLongBits(this.era) != Double.doubleToLongBits(other.era)) {
            return false;
        }
        if (Double.doubleToLongBits(this.whip) != Double.doubleToLongBits(other.whip)) {
            return false;
        }
        if (Double.doubleToLongBits(this.inningsPitched) != Double.doubleToLongBits(other.inningsPitched)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hitsPer9) != Double.doubleToLongBits(other.hitsPer9)) {
            return false;
        }
        if (Double.doubleToLongBits(this.walksPer9) != Double.doubleToLongBits(other.walksPer9)) {
            return false;
        }
        if (Double.doubleToLongBits(this.strikeoutsPer9) != Double.doubleToLongBits(other.strikeoutsPer9)) {
            return false;
        }
        if (Double.doubleToLongBits(this.homerunsPer9) != Double.doubleToLongBits(other.homerunsPer9)) {
            return false;
        }
        if (Double.doubleToLongBits(this.savesPerOpportunity) != Double.doubleToLongBits(other.savesPerOpportunity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.inningsPitchedMath) != Double.doubleToLongBits(other.inningsPitchedMath)) {
            return false;
        }
        if (Double.doubleToLongBits(this.winLossPercent) != Double.doubleToLongBits(other.winLossPercent)) {
            return false;
        }
        if (Double.doubleToLongBits(this.strikeoutWalkRatio) != Double.doubleToLongBits(other.strikeoutWalkRatio)) {
            return false;
        }
        if (this.runsAllowed != other.runsAllowed) {
            return false;
        }
        if (this.completeGames != other.completeGames) {
            return false;
        }
        if (this.shutouts != other.shutouts) {
            return false;
        }
        if (this.hitBatters != other.hitBatters) {
            return false;
        }
        if (this.balks != other.balks) {
            return false;
        }
        if (this.wildPitches != other.wildPitches) {
            return false;
        }
        if (this.battersFaced != other.battersFaced) {
            return false;
        }
        return true;
    }

}
