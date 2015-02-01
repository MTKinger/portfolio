package com.swcguild.baseballleague.businesslogic;

import com.swcguild.baseballleague.daos.BatterManagement;
import com.swcguild.baseballleague.daos.PitcherManagement;
import com.swcguild.baseballleague.daos.TeamManagement;
import com.swcguild.baseballleague.dtos.Player;
import com.swcguild.baseballleague.dtos.Team;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class TeamSorter {
    
    PitcherManagement pm = new PitcherManagement();
    BatterManagement bm = new BatterManagement();
    TeamManagement tm = new TeamManagement();
    
    public void sortRosters() throws FileNotFoundException{
        tm.loadTeamsFromFile();
        pm.loadPitchersFromFile();
        bm.loadBatterToFile();
        ArrayList<Player> teamsRoster = new ArrayList<>();
        ArrayList<Player> mlbPlayers = new ArrayList<>();
        mlbPlayers.addAll(pm.getAllPitchers());
        mlbPlayers.addAll(bm.getallBatters());
        HashMap<String, Team> allTeams = tm.getAllTeams();
        Set<String> keySet = allTeams.keySet();
        for(String currentTeam : keySet){
            Team thisTeam = tm.getTeamByName(currentTeam);
            for(Player currentPlayer : mlbPlayers){
                if(currentPlayer.getTeamName().equalsIgnoreCase(currentTeam)){
                    teamsRoster.add(currentPlayer);
                }
            }
            thisTeam.setRoster(teamsRoster);
        }
    }

}
