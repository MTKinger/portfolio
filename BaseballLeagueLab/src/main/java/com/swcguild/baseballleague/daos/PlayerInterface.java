package com.swcguild.baseballleague.daos;

import com.swcguild.baseballleague.dtos.Player;
import java.util.ArrayList;

public interface PlayerInterface {
    
    public void writeToFile(ArrayList<Player> allMlbPlayers);
    
    public ArrayList<Player> loadFromFile();
    
    public ArrayList<Player> getPlayerByLastName(String lastName);
    
    public ArrayList<Player> getPlayerByPosition (String position);
    
    public ArrayList<Player> getPlayerByTeam (String teamName);
    
    public ArrayList<Player> getPlayerByAge (int age);
    
    public ArrayList<Player> getPlayerByGamesPlayed (int gamesPlayed);
    
    public ArrayList<Player> getAllPlayers ();
    

}
