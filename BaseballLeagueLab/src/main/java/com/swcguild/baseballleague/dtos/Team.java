package com.swcguild.baseballleague.dtos;

import java.util.ArrayList;
import java.util.Objects;

public class Team {
    
    private String city;
    private String nickname;
    private String stadium;
    private String league;
    private String division;
    private ArrayList<Player> roster;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.city);
        hash = 89 * hash + Objects.hashCode(this.nickname);
        hash = 89 * hash + Objects.hashCode(this.stadium);
        hash = 89 * hash + Objects.hashCode(this.league);
        hash = 89 * hash + Objects.hashCode(this.division);
        hash = 89 * hash + Objects.hashCode(this.roster);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Team other = (Team) obj;
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.stadium, other.stadium)) {
            return false;
        }
        if (!Objects.equals(this.league, other.league)) {
            return false;
        }
        if (!Objects.equals(this.division, other.division)) {
            return false;
        }
        if (!Objects.equals(this.roster, other.roster)) {
            return false;
        }
        return true;
    }
    
    
    public Team(){
        
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public ArrayList<Player> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Player> roster) {
        this.roster = roster;
    }
    
    

}
