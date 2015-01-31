package com.swcguild.baseballleague.daos;

import com.swcguild.baseballleague.dtos.Player;
import com.swcguild.baseballleague.dtos.Team;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class TeamManagement implements TeamInterface {
    
    HashMap<String, Team> league = new HashMap<>();

    @Override
    public void writeTeamToFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Player> loadTeamFromFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Team getTeamByName(String name) {
       Team thisTeam = new Team();
        Set<String> keySet = league.keySet();
        for (String currentTeam : keySet){
            if (currentTeam.equalsIgnoreCase(name)){
                thisTeam = league.get(name);
            }
        }
        return thisTeam;
    }
    
    public ArrayList<Player> getTeamRosterByName(String name){
        ArrayList<Player> roster = new ArrayList<>();
        Team thisTeam = new Team();
        Set<String> keySet = league.keySet();
        for(String currentTeam : keySet){
            if(currentTeam.equalsIgnoreCase(name)){
                roster = league.get(name).getRoster();
            }
        }
        return roster;
    }
    
    

}
