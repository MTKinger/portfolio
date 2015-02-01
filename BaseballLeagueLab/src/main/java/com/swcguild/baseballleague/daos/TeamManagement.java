package com.swcguild.baseballleague.daos;

import com.swcguild.baseballleague.dtos.Player;
import com.swcguild.baseballleague.dtos.Team;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class TeamManagement implements TeamInterface {

    HashMap<String, Team> league = new HashMap<>();

    final String DELIMITER = "::";
    final String MLB_TEAMS = "mlbTeams.txt";

    //**TESTED**
    
    @Override
    public void writeTeamsToFile() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(MLB_TEAMS));
        out.println("City, Nickname, Stadium, League, Division");
        Team currentTeam = new Team();
        Set<String> keySet = league.keySet();
        for (String currentTeamName : keySet){
            currentTeam = league.get(currentTeamName);
            out.println(currentTeam.getCity() + DELIMITER
            + currentTeam.getNickname() + DELIMITER
            + currentTeam.getStadium() + DELIMITER
            + currentTeam.getLeague() + DELIMITER
            + currentTeam.getDivision());
            out.flush();
        }
        out.close();
    }

    //**TESTED**
    
    @Override
    public void loadTeamsFromFile() throws FileNotFoundException{
        Scanner sc  = new Scanner(new BufferedReader(new FileReader(MLB_TEAMS)));
        String currentLine = sc.nextLine();
        String [] currentTokens;
        while(sc.hasNextLine()){
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            Team currentTeam = new Team();
            currentTeam.setCity(currentTokens[0]);
            currentTeam.setNickname(currentTokens[1]);
            currentTeam.setStadium(currentTokens[2]);
            currentTeam.setLeague(currentTokens[3]);
            currentTeam.setDivision(currentTokens[4]);
            league.put(currentTeam.getNickname(), currentTeam);
        }
        sc.close();
        
    }

    //**TESTED**
    
    @Override
    public Team getTeamByName(String name) {
        Team thisTeam = new Team();
        Set<String> keySet = league.keySet();
        for (String currentTeam : keySet) {
            if (currentTeam.equalsIgnoreCase(name)) {
                thisTeam = league.get(name);
            }
        }
        return thisTeam;
    }

    //**TESTED**
    
    public ArrayList<Player> getTeamRosterByName(String TeamName) {
        ArrayList<Player> roster = new ArrayList<>();
        Team thisTeam = new Team();
        Set<String> keySet = league.keySet();
        for (String currentTeam : keySet) {
            if (currentTeam.equalsIgnoreCase(TeamName)) {
                roster = league.get(TeamName).getRoster();
            }
        }
        return roster;
    }
    
    //**TESTED**
    
    public void addTeam(Team teamToAdd){
        league.put(teamToAdd.getNickname(), teamToAdd);
    }
    
    //**TESTED**
    
    public int getLeagueSize(){
        return league.size();
    }
    
    public void removeTeam(String thisTeam){
        league.remove(thisTeam);
        }
    
    public HashMap<String, Team> getAllTeams(){
        HashMap<String, Team> output = new HashMap<>();
        Set<String> keyset = league.keySet();
        for(String currentTeam : keyset){
            Team thisTeam = league.get(currentTeam);
            output.put(currentTeam, thisTeam);
        }
        return output;
    }
    }
