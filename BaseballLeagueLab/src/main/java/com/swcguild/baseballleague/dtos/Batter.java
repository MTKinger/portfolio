package com.swcguild.baseballleague.dtos;

public class Batter extends Player {
    
    private int atBats;
    private int plateAppearances;
    private int strikeouts;
    private int hits;
    private int homeruns;
    private int doubles;
    private int triples;
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
    private double atBatsPerHR;
    private double atBatsPerStrikeout;
    private double runsPerAtBat;
    private int runs;
    private double sluggingPercentage;
    private int singles;
    private int walks;
    
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

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
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


    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public double getSluggingPercentage() {
        return sluggingPercentage;
    }

    public void setSluggingPercentage(double sluggingPercentage) {
        this.sluggingPercentage = sluggingPercentage;
    }

    public double getAtBatsPerHR() {
        return atBatsPerHR;
    }

    public void setAtBatsPerHR(double atBatsPerHR) {
        this.atBatsPerHR = atBatsPerHR;
    }

    public double getAtBatsPerStrikeout() {
        return atBatsPerStrikeout;
    }

    public void setAtBatsPerStrikeout(double atBatsPerStrikeout) {
        this.atBatsPerStrikeout = atBatsPerStrikeout;
    }

    public double getRunsPerAtBat() {
        return runsPerAtBat;
    }

    public void setRunsPerAtBat(double runsPerAtBat) {
        this.runsPerAtBat = runsPerAtBat;
    }

    public int getSingles() {
        return singles;
    }

    public void setSingles(int singles) {
        this.singles = singles;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.atBats;
        hash = 97 * hash + this.plateAppearances;
        hash = 97 * hash + this.strikeouts;
        hash = 97 * hash + this.hits;
        hash = 97 * hash + this.homeruns;
        hash = 97 * hash + this.doubles;
        hash = 97 * hash + this.triples;
        hash = 97 * hash + this.totalBases;
        hash = 97 * hash + this.RBI;
        hash = 97 * hash + this.steals;
        hash = 97 * hash + this.caughtStealing;
        hash = 97 * hash + this.groundedIntoDP;
        hash = 97 * hash + this.hitByPitch;
        hash = 97 * hash + this.sacHits;
        hash = 97 * hash + this.sacFlies;
        hash = 97 * hash + this.intBB;
        hash = 97 * hash + this.leftOnBase;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.battingAverage) ^ (Double.doubleToLongBits(this.battingAverage) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.onBasePercentage) ^ (Double.doubleToLongBits(this.onBasePercentage) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.onBasePlusSlugging) ^ (Double.doubleToLongBits(this.onBasePlusSlugging) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.atBatsPerHR) ^ (Double.doubleToLongBits(this.atBatsPerHR) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.atBatsPerStrikeout) ^ (Double.doubleToLongBits(this.atBatsPerStrikeout) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.runsPerAtBat) ^ (Double.doubleToLongBits(this.runsPerAtBat) >>> 32));
        hash = 97 * hash + this.runs;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.sluggingPercentage) ^ (Double.doubleToLongBits(this.sluggingPercentage) >>> 32));
        hash = 97 * hash + this.singles;
        hash = 97 * hash + this.walks;
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
        if (this.triples != other.triples) {
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
        if (Double.doubleToLongBits(this.atBatsPerHR) != Double.doubleToLongBits(other.atBatsPerHR)) {
            return false;
        }
        if (Double.doubleToLongBits(this.atBatsPerStrikeout) != Double.doubleToLongBits(other.atBatsPerStrikeout)) {
            return false;
        }
        if (Double.doubleToLongBits(this.runsPerAtBat) != Double.doubleToLongBits(other.runsPerAtBat)) {
            return false;
        }
        if (this.runs != other.runs) {
            return false;
        }
        if (Double.doubleToLongBits(this.sluggingPercentage) != Double.doubleToLongBits(other.sluggingPercentage)) {
            return false;
        }
        if (this.singles != other.singles) {
            return false;
        }
        if (this.walks != other.walks) {
            return false;
        }
        return true;
    }
    
    

    
    
    

    
    
    
    

}
