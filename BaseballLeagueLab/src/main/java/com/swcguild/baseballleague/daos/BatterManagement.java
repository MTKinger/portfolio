package com.swcguild.baseballleague.daos;

import com.swcguild.baseballleague.dtos.Batter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BatterManagement implements BatterInterface {

    ArrayList<Batter> allBatters = new ArrayList<>();
    final String BATTER_FILE = "allBatters.txt";
    final String DELIMITER = "::";

    //**TESTED**
    
    @Override
    public void writeBattersToFile() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(BATTER_FILE));
        out.println("MLBPlayerId, FirstName, LastName, Position, Number, "
                + "BatHand, ThrowHand, GamesPlayed, GamesStarted, TeamCity, TeamNNickname, Age, League, "
                + "AtBats, PlateAppearances, Strikeouts, Hits, Homeruns, Doubles, Triples, TotalBases, "
                + "RBI, Steals, CaughtStealing, GIDP, HBP, SacHits, SacFlies, IBB, LOB, AVG, OBP, "
                + "OBPS, HomerunsPerAB, StrikeoutsPerGame, RunsPerGame, Runs");
        for (Batter thisBatter : allBatters) {
            out.println(thisBatter.getMlbPlayerId() + DELIMITER
                    + thisBatter.getFirstName() + DELIMITER
                    + thisBatter.getLastName() + DELIMITER
                    + thisBatter.getPosition() + DELIMITER
                    + thisBatter.getNumber() + DELIMITER
                    + thisBatter.getBatHand() + DELIMITER
                    + thisBatter.getThrowHand() + DELIMITER
                    + thisBatter.getGamesPlayed() + DELIMITER
                    + thisBatter.getGamesStarted() + DELIMITER
                    + thisBatter.getTeamCity() + DELIMITER
                    + thisBatter.getTeamName() + DELIMITER
                    + thisBatter.getAge() + DELIMITER
                    + thisBatter.getLeague() + DELIMITER
                    + thisBatter.getAtBats() + DELIMITER
                    + +thisBatter.getPlateAppearances() + DELIMITER
                    + thisBatter.getStrikeouts() + DELIMITER
                    + thisBatter.getHits() + DELIMITER
                    + thisBatter.getHomeruns() + DELIMITER
                    + thisBatter.getDoubles() + DELIMITER
                    + thisBatter.getTriples() + DELIMITER
                    + thisBatter.getTotalBases() + DELIMITER
                    + thisBatter.getRBI() + DELIMITER
                    + thisBatter.getSteals() + DELIMITER
                    + thisBatter.getCaughtStealing() + DELIMITER
                    + thisBatter.getGroundedIntoDP() + DELIMITER
                    + thisBatter.getHitByPitch() + DELIMITER
                    + thisBatter.getSacHits() + DELIMITER
                    + thisBatter.getSacFlies() + DELIMITER
                    + thisBatter.getIntBB() + DELIMITER
                    + thisBatter.getLeftOnBase() + DELIMITER
                    + thisBatter.getBattingAverage() + DELIMITER
                    + thisBatter.getOnBasePercentage() + DELIMITER
                    + thisBatter.getOnBasePlusSlugging() + DELIMITER
                    + thisBatter.getHomerunsPerAB() + DELIMITER
                    + thisBatter.getStrikeoutsPerAB() + DELIMITER
                    + thisBatter.getRunsPerGame() + DELIMITER
            +thisBatter.getRuns());
            out.flush();
        }
        out.close();
    }

    //**TESTED**
    
    @Override
    public void loadBatterToFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(BATTER_FILE)));
        String currentLine = sc.nextLine();
        String[] currentTokens = currentLine.split(DELIMITER);
        while(sc.hasNextLine()){
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            int mlbPlayerId = Integer.parseInt(currentTokens[0]);
            String firstName = currentTokens[1];
            String lastname = currentTokens[2];
            String position = currentTokens[3];
            int number = Integer.parseInt(currentTokens[4]);
            char batHand = currentTokens[5].charAt(0);
            char throwhand = currentTokens[6].charAt(0);
            int gamesPlayed = Integer.parseInt(currentTokens[7]);
            int gamesStarted = Integer.parseInt(currentTokens[8]);
            String teamCity = currentTokens[9];
            String teamName = currentTokens[10];
            int age = Integer.parseInt(currentTokens[11]);
            String league = currentTokens[12];
            int atBats = Integer.parseInt(currentTokens[13]);
            int plateAppearances = Integer.parseInt(currentTokens[14]);
            int strikeouts = Integer.parseInt(currentTokens[15]);
            int hits = Integer.parseInt(currentTokens[16]);
            int homeruns = Integer.parseInt(currentTokens[17]);
            int doubles = Integer.parseInt(currentTokens[18]);
            int triples = Integer.parseInt(currentTokens[19]);
            int totalBases = Integer.parseInt(currentTokens[20]);
            int RBI = Integer.parseInt(currentTokens[21]);
            int steals = Integer.parseInt(currentTokens[22]);
            int caughtStealing = Integer.parseInt(currentTokens[23]);
            int groundedIntoDP = Integer.parseInt(currentTokens[24]);
            int hitByPitch = Integer.parseInt(currentTokens[25]);
            int sacHits = Integer.parseInt(currentTokens[26]);
            int sacFlies = Integer.parseInt(currentTokens[27]);
            int intBB = Integer.parseInt(currentTokens[28]);
            int leftOnBase = Integer.parseInt(currentTokens[29]);
            double battingAverage = Double.parseDouble(currentTokens[30]);
            double onBasePercentage = Double.parseDouble(currentTokens[31]);
            double onBasePlusSlugging = Double.parseDouble(currentTokens[32]);
            double homerunsPerAB = Double.parseDouble(currentTokens[33]);
            double strikeoutsPerAB = Double.parseDouble(currentTokens[34]);
            double runsPerGame = Double.parseDouble(currentTokens[35]);
            int runs = Integer.parseInt(currentTokens[36]);
            
            Batter thisBatter = new Batter(mlbPlayerId);
            thisBatter.setFirstName(firstName);
            thisBatter.setLastName(lastname);
            thisBatter.setPosition(position);
            thisBatter.setNumber(number);
            thisBatter.setBatHand(batHand);
            thisBatter.setThrowHand(throwhand);
            thisBatter.setGamesPlayed(gamesPlayed);
            thisBatter.setGamesStarted(gamesStarted);
            thisBatter.setTeamCity(teamCity);
            thisBatter.setTeamName(teamName);
            thisBatter.setAge(age);
            thisBatter.setLeague(league);
            thisBatter.setAtBats(atBats);
            thisBatter.setPlateAppearances(plateAppearances);
            thisBatter.setStrikeouts(strikeouts);
            thisBatter.setHits(hits);
            thisBatter.setHomeruns(homeruns);
            thisBatter.setDoubles(doubles);
            thisBatter.setTriples(triples);
            thisBatter.setTotalBases(totalBases);
            thisBatter.setRBI(RBI);
            thisBatter.setSteals(steals);
            thisBatter.setCaughtStealing(caughtStealing);
            thisBatter.setGroundedIntoDP(groundedIntoDP);
            thisBatter.setHitByPitch(hitByPitch);
            thisBatter.setSacHits(sacHits);
            thisBatter.setSacFlies(sacFlies);
            thisBatter.setIntBB(intBB);
            thisBatter.setLeftOnBase(leftOnBase);
            thisBatter.setBattingAverage(battingAverage);
            thisBatter.setOnBasePercentage(onBasePercentage);
            thisBatter.setOnBasePlusSlugging(onBasePlusSlugging);
            thisBatter.setHomerunsPerAB(homerunsPerAB);
            thisBatter.setStrikeoutsPerAB(strikeoutsPerAB);
            thisBatter.setRunsPerGame(runsPerGame);
            thisBatter.setRuns(runs);
            
            allBatters.add(thisBatter);
        }
        sc.close();
    }

    //**TESTED**
    
    @Override
    public ArrayList<Batter> getallBatters() {
        return allBatters;
    }
    
    //**TESTED**

    @Override
    public ArrayList<Batter> getBatterByBatHand(char batHand) {
        ArrayList<Batter> foundBatters = new ArrayList<>();
        for (Batter thisBatter : allBatters) {
            if (thisBatter.getBatHand() == batHand) {
                foundBatters.add(thisBatter);
            }
        }
        return foundBatters;
    }
    
    //**TESTED**

    @Override
    public ArrayList<Batter> getBatterByStrikeouts(int strikeouts) {
        ArrayList<Batter> foundBatters = new ArrayList<>();
        for (Batter thisBatter : allBatters) {
            if (thisBatter.getStrikeouts() <= strikeouts) {
                foundBatters.add(thisBatter);
            }
        }
        return foundBatters;
    }
    
    //**TESTED**

    @Override
    public ArrayList<Batter> getBatterByHits(int hits) {
        ArrayList<Batter> foundBatters = new ArrayList<>();
        for (Batter thisBatter : allBatters) {
            if (thisBatter.getHits( ) >= hits) {
                foundBatters.add(thisBatter);
            }
        }
        return foundBatters;
    }
    
    //**TESTED**

    @Override
    public ArrayList<Batter> getBatterByHomeruns(int homeruns) {
        ArrayList<Batter> foundBatters = new ArrayList<>();
        for (Batter thisBatter : allBatters) {
            if (thisBatter.getHomeruns() >= homeruns) {
                foundBatters.add(thisBatter);
            }
        }
        return foundBatters;
    }
    
    //**TESTED**

    @Override
    public ArrayList<Batter> getBatterByRBI(int rbi) {
        ArrayList<Batter> foundBatters = new ArrayList<>();
        for (Batter thisBatter : allBatters) {
            if (thisBatter.getRBI() >= rbi) {
                foundBatters.add(thisBatter);
            }
        }
        return foundBatters;
    }
    
    //**TESTED**

    @Override
    public ArrayList<Batter> getBatterBySteals(int steals) {
        ArrayList<Batter> foundBatters = new ArrayList<>();
        for (Batter thisBatter : allBatters) {
            if (thisBatter.getSteals() >= steals) {
                foundBatters.add(thisBatter);
            }
        }
        return foundBatters;
    }
    
    //**TESTED**

    @Override
    public ArrayList<Batter> getBatterByBattingAverage(double battingAverage) {
        ArrayList<Batter> foundBatters = new ArrayList<>();
        for (Batter thisBatter : allBatters) {
            if (thisBatter.getBattingAverage() >= battingAverage) {
                foundBatters.add(thisBatter);
            }
        }
        return foundBatters;
    }
    
    //**TESTED**

    @Override
    public ArrayList<Batter> getBatterByOnBasePercentage(double obp) {
        ArrayList<Batter> foundBatters = new ArrayList<>();
        for (Batter thisBatter : allBatters) {
            if (thisBatter.getOnBasePercentage() >= obp) {
                foundBatters.add(thisBatter);
            }
        }
        return foundBatters;
    }
    
    //**TESTED**

    @Override
    public ArrayList<Batter> getBatterByOnBasePlusSlugging(double obps) {
        ArrayList<Batter> foundBatters = new ArrayList<>();
        for (Batter thisBatter : allBatters) {
            if (thisBatter.getOnBasePlusSlugging() >= obps) {
                foundBatters.add(thisBatter);
            }
        }
        return foundBatters;
    }
    
    //**TESTED**
    
    public void addBatter(Batter thisBatter){
        allBatters.add(thisBatter);
    }
    
    //**TESTED**
    
    public void removeBatter(Batter thisBatter){
        allBatters.remove(thisBatter);
    }
    
    //**TESTED**
    
    public int getSizeBattersList(){
        return allBatters.size();
    }
    
    //**TESTED**
    
    public Batter getBatterByLastName(String lastName){
        Batter foundBatter = new Batter(0);
        for (Batter thisBatter : allBatters) {
            if (thisBatter.getLastName().equalsIgnoreCase(lastName)) {
                foundBatter = thisBatter;
            }
        }
        return foundBatter;
    }

}
