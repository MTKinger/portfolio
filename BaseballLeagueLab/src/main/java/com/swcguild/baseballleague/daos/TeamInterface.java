package com.swcguild.baseballleague.daos;

import com.swcguild.baseballleague.dtos.Player;
import com.swcguild.baseballleague.dtos.Team;
import java.util.ArrayList;

public interface TeamInterface {
    
    public void writeTeamToFile();
    
    public ArrayList<Player> loadTeamFromFile();
    
    public Team getTeamByName(String name);
    
    

}
