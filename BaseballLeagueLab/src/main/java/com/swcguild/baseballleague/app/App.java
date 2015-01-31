package com.swcguild.baseballleague.app;

import com.swcguild.baseballleague.daos.TeamManagement;
import com.swcguild.baseballleague.dtos.Team;
import com.swcguild.baseballleaguelab.ui.ConsoleIO;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        TeamManagement tm = new TeamManagement();
        ConsoleIO cio = new ConsoleIO();
        
        tm.loadTeamsFromFile();
        
        String city = cio.getString("City: ");
        String name = cio.getString("name: ");
        String stadium = cio.getString("stadium");
        String league = cio.getString("league").toUpperCase();
        String division = cio.getString("division");
        
        Team teamToAdd = new Team();
        
        teamToAdd.setCity(city);
        teamToAdd.setDivision(division);
        teamToAdd.setLeague(league);
        teamToAdd.setNickname(name);
        teamToAdd.setStadium(stadium);
        
        tm.addTeam(teamToAdd);
        
        tm.writeTeamsToFile();
        
    }

}
