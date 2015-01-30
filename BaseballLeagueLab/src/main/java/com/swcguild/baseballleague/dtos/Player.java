package com.swcguild.baseballleague.dtos;

public class Player {
    
    protected String firstName;     //Pitcher*
    protected String lastName;      //Pitcher*
    private String position;        //Pitcher*
    protected int number;           //Pitcher*
    protected char batHand;         //Pitcher*
    protected char throwHand;       //Pitcher*
    protected int gamesPlayed;      //Pitcher*
    protected int mlbPlayerId;
    protected String teamCity;
    protected String teamName;

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
    
    
    

}
