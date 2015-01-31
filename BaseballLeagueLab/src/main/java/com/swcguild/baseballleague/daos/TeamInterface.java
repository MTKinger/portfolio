package com.swcguild.baseballleague.daos;

import com.swcguild.baseballleague.dtos.Team;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public interface TeamInterface {
    
    public void writeTeamsToFile() throws IOException;
    
    public void loadTeamsFromFile() throws FileNotFoundException;
    
    public Team getTeamByName(String name);
    
    

}
