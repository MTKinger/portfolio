package com.swcguild.baseballleague.dtos;

public class Batter extends Player {
    
    private int atBats;
    private int plateAppearances;
    private int strikeouts;
    private int hits;
    private int homeruns;
    private int doubles;
    private int tripples;
    private int totalBases;
    private int RBI;
    private int steals;
    private int caughtStealing;
    private int groundedIntoDP;
    private int hitByPitch;
    private int sacHits;
    private int sacFlies;
    private int intBB;
    private int leftOnBase;
    private double battingAverage;
    private double onBasePercentage;
    private double onBasePlusSlugging;
    private double homerunsPerAB;
    private double strikeoutsPerAB;
    private double runsPerGame;
    
    public Batter(int id){
        this.mlbPlayerId = id;
    }
    

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getPlateAppearances() {
        return plateAppearances;
    }

    public void setPlateAppearances(int plateAppearances) {
        this.plateAppearances = plateAppearances;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getHomeruns() {
        return homeruns;
    }

    public void setHomeruns(int homeruns) {
        this.homeruns = homeruns;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getTripples() {
        return tripples;
    }

    public void setTripples(int tripples) {
        this.tripples = tripples;
    }

    public int getTotalBases() {
        return totalBases;
    }

    public void setTotalBases(int totalBases) {
        this.totalBases = totalBases;
    }

    public int getRBI() {
        return RBI;
    }

    public void setRBI(int RBI) {
        this.RBI = RBI;
    }

    public int getSteals() {
        return steals;
    }

    public void setSteals(int steals) {
        this.steals = steals;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public double getOnBasePercentage() {
        return onBasePercentage;
    }

    public void setOnBasePercentage(double onBasePercentage) {
        this.onBasePercentage = onBasePercentage;
    }

    public double getOnBasePlusSlugging() {
        return onBasePlusSlugging;
    }

    public void setOnBasePlusSlugging(double onBasePlusSlugging) {
        this.onBasePlusSlugging = onBasePlusSlugging;
    }

    public double getHomerunsPerAB() {
        return homerunsPerAB;
    }

    public void setHomerunsPerAB(double homerunsPerAB) {
        this.homerunsPerAB = homerunsPerAB;
    }

    public double getStrikeoutsPerAB() {
        return strikeoutsPerAB;
    }

    public void setStrikeoutsPerAB(double strikeoutsPerAB) {
        this.strikeoutsPerAB = strikeoutsPerAB;
    }

    public int getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
    }

    public int getGroundedIntoDP() {
        return groundedIntoDP;
    }

    public void setGroundedIntoDP(int groundedIntoDP) {
        this.groundedIntoDP = groundedIntoDP;
    }

    public int getHitByPitch() {
        return hitByPitch;
    }

    public void setHitByPitch(int hitByPitch) {
        this.hitByPitch = hitByPitch;
    }

    public int getSacHits() {
        return sacHits;
    }

    public void setSacHits(int sacHits) {
        this.sacHits = sacHits;
    }

    public int getSacFlies() {
        return sacFlies;
    }

    public void setSacFlies(int sacFlies) {
        this.sacFlies = sacFlies;
    }

    public int getIntBB() {
        return intBB;
    }

    public void setIntBB(int intBB) {
        this.intBB = intBB;
    }

    public int getLeftOnBase() {
        return leftOnBase;
    }

    public void setLeftOnBase(int leftOnBase) {
        this.leftOnBase = leftOnBase;
    }

    public double getRunsPerGame() {
        return runsPerGame;
    }

    public void setRunsPerGame(double runsPerGame) {
        this.runsPerGame = runsPerGame;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.atBats;
        hash = 29 * hash + this.plateAppearances;
        hash = 29 * hash + this.strikeouts;
        hash = 29 * hash + this.hits;
        hash = 29 * hash + this.homeruns;
        hash = 29 * hash + this.doubles;
        hash = 29 * hash + this.tripples;
        hash = 29 * hash + this.totalBases;
        hash = 29 * hash + this.RBI;
        hash = 29 * hash + this.steals;
        hash = 29 * hash + this.caughtStealing;
        hash = 29 * hash + this.groundedIntoDP;
        hash = 29 * hash + this.hitByPitch;
        hash = 29 * hash + this.sacHits;
        hash = 29 * hash + this.sacFlies;
        hash = 29 * hash + this.intBB;
        hash = 29 * hash + this.leftOnBase;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.battingAverage) ^ (Double.doubleToLongBits(this.battingAverage) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.onBasePercentage) ^ (Double.doubleToLongBits(this.onBasePercentage) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.onBasePlusSlugging) ^ (Double.doubleToLongBits(this.onBasePlusSlugging) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.homerunsPerAB) ^ (Double.doubleToLongBits(this.homerunsPerAB) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.strikeoutsPerAB) ^ (Double.doubleToLongBits(this.strikeoutsPerAB) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.runsPerGame) ^ (Double.doubleToLongBits(this.runsPerGame) >>> 32));
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
        final Batter other = (Batter) obj;
        if (this.atBats != other.atBats) {
            return false;
        }
        if (this.plateAppearances != other.plateAppearances) {
            return false;
        }
        if (this.strikeouts != other.strikeouts) {
            return false;
        }
        if (this.hits != other.hits) {
            return false;
        }
        if (this.homeruns != other.homeruns) {
            return false;
        }
        if (this.doubles != other.doubles) {
            return false;
        }
        if (this.tripples != other.tripples) {
            return false;
        }
        if (this.totalBases != other.totalBases) {
            return false;
        }
        if (this.RBI != other.RBI) {
            return false;
        }
        if (this.steals != other.steals) {
            return false;
        }
        if (this.caughtStealing != other.caughtStealing) {
            return false;
        }
        if (this.groundedIntoDP != other.groundedIntoDP) {
            return false;
        }
        if (this.hitByPitch != other.hitByPitch) {
            return false;
        }
        if (this.sacHits != other.sacHits) {
            return false;
        }
        if (this.sacFlies != other.sacFlies) {
            return false;
        }
        if (this.intBB != other.intBB) {
            return false;
        }
        if (this.leftOnBase != other.leftOnBase) {
            return false;
        }
        if (Double.doubleToLongBits(this.battingAverage) != Double.doubleToLongBits(other.battingAverage)) {
            return false;
        }
        if (Double.doubleToLongBits(this.onBasePercentage) != Double.doubleToLongBits(other.onBasePercentage)) {
            return false;
        }
        if (Double.doubleToLongBits(this.onBasePlusSlugging) != Double.doubleToLongBits(other.onBasePlusSlugging)) {
            return false;
        }
        if (Double.doubleToLongBits(this.homerunsPerAB) != Double.doubleToLongBits(other.homerunsPerAB)) {
            return false;
        }
        if (Double.doubleToLongBits(this.strikeoutsPerAB) != Double.doubleToLongBits(other.strikeoutsPerAB)) {
            return false;
        }
        if (Double.doubleToLongBits(this.runsPerGame) != Double.doubleToLongBits(other.runsPerGame)) {
            return false;
        }
        return true;
    }
    
    
    

}
