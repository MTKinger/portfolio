package com.swcguild.baseballleague.daos;

import com.swcguild.baseballleague.dtos.Batter;
import java.util.ArrayList;

public interface BatterInterface {
    
    public void writeBattersToFile();
    
    public ArrayList<Batter> loadBatterToFile();
    
    public ArrayList<Batter> getallBatters();
    
    public ArrayList<Batter> getBatterByBatHand(char batHand);
    
    public ArrayList<Batter> getBatterByStrikeouts(int strikeouts);
    
    public ArrayList<Batter> getBatterByHits(int hits);
    
    public ArrayList<Batter> getBatterByHomeruns(int homeruns);
    
    public ArrayList<Batter> getBatterByRBI(int rbi);
    
    public ArrayList<Batter> getBatterBySteals(int steals);
    
    public ArrayList<Batter> getBatterByBattingAverage(double battingAverage);
    
    public ArrayList<Batter> getBatterByOnBasePercentage(double obp);
    
    public ArrayList<Batter> getBatterByOnBasePlusSlugging(double obps);

}
