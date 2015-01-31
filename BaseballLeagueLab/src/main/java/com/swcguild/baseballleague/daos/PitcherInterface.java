package com.swcguild.baseballleague.daos;

import com.swcguild.baseballleague.dtos.Pitcher;
import java.util.ArrayList;

public interface PitcherInterface {
    
    public void writePitchersToFile();
    
    public ArrayList<Pitcher> loadPitchersFromFile();
    
    public ArrayList<Pitcher> getAllPitchers();
    
    public ArrayList<Pitcher> getPitcherByThrowHand(char throwHand);
    
    public ArrayList<Pitcher> getPitcherByGamesStarted(int gamesStarted);
    
    public ArrayList<Pitcher> getPitcherByERA(double era);
    
    public ArrayList<Pitcher> getPitcherByStrikeouts(int strikeouts);
    
    public ArrayList<Pitcher> getPitcherByHRAllowed(int homeRunsAllowed);
    
    public ArrayList<Pitcher> getPitcherByWins(int wins);
    
    public ArrayList<Pitcher> getPitcherBySaves(int saves);
    
    public ArrayList<Pitcher> getPitcherByWHIP(double whip);
    
    public ArrayList<Pitcher> getPitcherByHitsPer9(double hitsPer9);
    
    public ArrayList<Pitcher> getPitcherByWalksPer9(double walksPer9);
    
    public ArrayList<Pitcher> getPitcherByStrikeoutsPer9(double strikeoutsPer9);
    
    public ArrayList<Pitcher> getPitcherByHRPer9(double hrPer9);
    
    public ArrayList<Pitcher> getPitcherByStrikoutWalkRatio(double strikeoutWalkRatio);
    
    

}
