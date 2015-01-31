package com.swcguild.baseballleague.dtos;

import java.util.Objects;

public class Player {
    
    protected int mlbPlayerId;      //Pitcher*
    protected String firstName;     //Pitcher*
    protected String lastName;      //Pitcher*
    protected String position;        //Pitcher*
    protected int number;           //Pitcher*
    protected char batHand;         //Pitcher*
    protected char throwHand;       //Pitcher*
    protected int gamesPlayed;      //Pitcher*
    protected int gamesStarted;     //Pitcher*
    protected String teamCity;      //Pitcher*
    protected String teamName;      //Pitcher*
    protected int age;              //Pitcher*
    protected String league;        //Pitcher*
    

    public String getTeamCity() {
        return teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    public Player(){
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getBatHand() {
        return batHand;
    }

    public void setBatHand(char batHand) {
        this.batHand = batHand;
    }

    public char getThrowHand() {
        return throwHand;
    }

    public void setThrowHand(char throwHand) {
        this.throwHand = throwHand;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getMlbPlayerId() {
        return mlbPlayerId;
    }

    public void setMlbPlayerId(int mlbPlayerId) {
        this.mlbPlayerId = mlbPlayerId;
    }

    public int getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(int gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.firstName);
        hash = 59 * hash + Objects.hashCode(this.lastName);
        hash = 59 * hash + Objects.hashCode(this.position);
        hash = 59 * hash + this.number;
        hash = 59 * hash + this.batHand;
        hash = 59 * hash + this.throwHand;
        hash = 59 * hash + this.gamesPlayed;
        hash = 59 * hash + this.gamesStarted;
        hash = 59 * hash + this.mlbPlayerId;
        hash = 59 * hash + Objects.hashCode(this.teamCity);
        hash = 59 * hash + Objects.hashCode(this.teamName);
        hash = 59 * hash + this.age;
        hash = 59 * hash + Objects.hashCode(this.league);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
        if (this.number != other.number) {
            return false;
        }
        if (this.batHand != other.batHand) {
            return false;
        }
        if (this.throwHand != other.throwHand) {
            return false;
        }
        if (this.gamesPlayed != other.gamesPlayed) {
            return false;
        }
        if (this.gamesStarted != other.gamesStarted) {
            return false;
        }
        if (this.mlbPlayerId != other.mlbPlayerId) {
            return false;
        }
        if (!Objects.equals(this.teamCity, other.teamCity)) {
            return false;
        }
        if (!Objects.equals(this.teamName, other.teamName)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.league, other.league)) {
            return false;
        }
        return true;
    }
    
    
    
    

}
