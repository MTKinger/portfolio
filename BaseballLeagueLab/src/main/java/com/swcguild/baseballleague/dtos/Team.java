package com.swcguild.baseballleague.dtos;

public class Team {
    
    private String city;
    private String nickname;
    private String stadium;
    private String league;
    private String division;
    
    
    public Team(String city, String nickname, String stadium, String league, String division){
        this.city = city;
        this.nickname = nickname;
        this.stadium = stadium;
        this.league = league;
        this.division = division;
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
    
    

}
