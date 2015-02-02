package com.swcguild.baseballleague.businesslogic;

import com.swcguild.baseballleague.daos.BatterManagement;
import com.swcguild.baseballleague.daos.PitcherManagement;
import com.swcguild.baseballleague.daos.TeamManagement;
import com.swcguild.baseballleague.dtos.Player;
import com.swcguild.baseballleague.dtos.Team;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class TeamSorter {

    PitcherManagement pm = new PitcherManagement();
    BatterManagement bm = new BatterManagement();
    TeamManagement tm = new TeamManagement();

    public ArrayList<Player> sortRosters(Team thisTeam) throws FileNotFoundException {
        tm.loadTeamsFromFile();
        pm.loadPitchersFromFile();
        bm.loadBatterToFile();
        ArrayList< Player> teamsRoster = new ArrayList<>();
        ArrayList< Player> mlbPlayers = new ArrayList<>();
        mlbPlayers.addAll(pm.getAllPitchers());
        mlbPlayers.addAll(bm.getallBatters());
        for(Player thisPlayer : mlbPlayers){
            if (thisPlayer.getTeamName().equalsIgnoreCase(thisTeam.getNickname())){
                teamsRoster.add(thisPlayer);
            }
            mlbPlayers.remove(thisPlayer);
        }
        return teamsRoster;
    }

}
