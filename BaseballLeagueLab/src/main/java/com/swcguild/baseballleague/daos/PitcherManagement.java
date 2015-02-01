package com.swcguild.baseballleague.daos;

import com.swcguild.baseballleague.dtos.Pitcher;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PitcherManagement implements PitcherInterface {

    ArrayList<Pitcher> allPitchers = new ArrayList<>();
    final String PITCHER_FILE = "allPitchers.txt";
    final String DELIMITER = "::";

    //**TESTED**
    @Override
    public void writePitchersToFile() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(PITCHER_FILE));
        out.println("MLBPlayerId, FirstName, LastName, Position, Number, "
                + "BatHand, ThrowHand, GamesPlayed, GamesStarted, TeamCity, TeamNNickname, Age, League, "
                + "EarnedRuns, Strikeouts, HRAllowed, Wins, Losses, Saves, BlownSaves, HitsAllowed, "
                + "WalksAllowed, Era, WHIP, InningsPitched + Hits/9, Walks/9, K/9, HR/9, SavesPerOpportunity, "
                + "InningsPitcherMath, W/L%, K/BBRatio, RunsAllowed, CompleteGames, Shoutouts, HitBatters, "
                + "Balks, WildPitches, BattersFaced");
        for (Pitcher thisPitcher : allPitchers) {
            out.println(thisPitcher.getMlbPlayerId() + DELIMITER
                    + thisPitcher.getFirstName() + DELIMITER
                    + thisPitcher.getLastName() + DELIMITER
                    + thisPitcher.getPosition() + DELIMITER
                    + thisPitcher.getNumber() + DELIMITER
                    + thisPitcher.getBatHand() + DELIMITER
                    + thisPitcher.getThrowHand() + DELIMITER
                    + thisPitcher.getGamesPlayed() + DELIMITER
                    + thisPitcher.getGamesStarted() + DELIMITER
                    + thisPitcher.getTeamCity() + DELIMITER
                    + thisPitcher.getTeamName() + DELIMITER
                    + thisPitcher.getAge() + DELIMITER
                    + thisPitcher.getLeague() + DELIMITER
                    + thisPitcher.getEarnedRuns() + DELIMITER
                    + thisPitcher.getStrikeouts() + DELIMITER
                    + thisPitcher.getHomeRunsAllowed() + DELIMITER
                    + thisPitcher.getWins() + DELIMITER
                    + thisPitcher.getLosses() + DELIMITER
                    + thisPitcher.getSaves() + DELIMITER
                    + thisPitcher.getBlownSaves() + DELIMITER
                    + thisPitcher.getHitsAllowed() + DELIMITER
                    + thisPitcher.getWalksAllowed() + DELIMITER
                    + thisPitcher.getEra() + DELIMITER
                    + thisPitcher.getWhip() + DELIMITER
                    + thisPitcher.getInningsPitched() + DELIMITER
                    + thisPitcher.getHitsPer9() + DELIMITER
                    + thisPitcher.getWalksPer9() + DELIMITER
                    + thisPitcher.getStrikeoutsPer9() + DELIMITER
                    + thisPitcher.getHomerunsPer9() + DELIMITER
                    + thisPitcher.getSavesPerOpportunity() + DELIMITER
                    + thisPitcher.getInningsPitchedMath() + DELIMITER
                    + thisPitcher.getWinLossPercent() + DELIMITER
                    + thisPitcher.getStrikeoutWalkRatio() + DELIMITER
                    + thisPitcher.getRunsAllowed() + DELIMITER
                    + thisPitcher.getCompleteGames() + DELIMITER
                    + thisPitcher.getShutouts() + DELIMITER
                    + thisPitcher.getHitBatters() + DELIMITER
                    + thisPitcher.getBalks() + DELIMITER
                    + thisPitcher.getWildPitches() + DELIMITER
                    + thisPitcher.getBattersFaced());
            out.flush();
        }
        out.close();
    }

    //**TESTED**
    @Override
    public void loadPitchersFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(PITCHER_FILE)));
        String currentLine = sc.nextLine();
        String[] currentTokens = currentLine.split(DELIMITER);
        while (sc.hasNextLine()) {
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
            int earnedRuns = Integer.parseInt(currentTokens[13]);
            int strikeouts = Integer.parseInt(currentTokens[14]);
            int homerunsAllowed = Integer.parseInt(currentTokens[15]);
            int wins = Integer.parseInt(currentTokens[16]);
            int losses = Integer.parseInt(currentTokens[17]);
            int saves = Integer.parseInt(currentTokens[18]);
            int blownSaves = Integer.parseInt(currentTokens[19]);
            int hitsAllowed = Integer.parseInt(currentTokens[20]);
            int walksAllowed = Integer.parseInt(currentTokens[21]);
            double era = Double.parseDouble(currentTokens[22]);
            double whip = Double.parseDouble(currentTokens[23]);
            double inningsPitched = Double.parseDouble(currentTokens[24]);
            double hitsPer9 = Double.parseDouble(currentTokens[25]);
            double walksPer9 = Double.parseDouble(currentTokens[26]);
            double strikeoutsPer9 = Double.parseDouble(currentTokens[27]);
            double homerunsPer9 = Double.parseDouble(currentTokens[28]);
            double savesPerOpportunity = Double.parseDouble(currentTokens[29]);
            double inningsPitchedMath = Double.parseDouble(currentTokens[30]);
            double winLossPercent = Double.parseDouble(currentTokens[31]);
            double strikeoutWalkRatio = Double.parseDouble(currentTokens[32]);
            int runsAllowed = Integer.parseInt(currentTokens[33]);
            int completeGames = Integer.parseInt(currentTokens[34]);
            int shutouts = Integer.parseInt(currentTokens[35]);
            int hitBatters = Integer.parseInt(currentTokens[36]);
            int balks = Integer.parseInt(currentTokens[37]);
            int wildPitches = Integer.parseInt(currentTokens[38]);
            int battersFaced = Integer.parseInt(currentTokens[39]);

            Pitcher pitcherToAdd = new Pitcher(mlbPlayerId);
            pitcherToAdd.setFirstName(firstName);
            pitcherToAdd.setLastName(lastname);
            pitcherToAdd.setPosition(position);
            pitcherToAdd.setNumber(number);
            pitcherToAdd.setBatHand(batHand);
            pitcherToAdd.setThrowHand(throwhand);
            pitcherToAdd.setGamesPlayed(gamesPlayed);
            pitcherToAdd.setGamesStarted(gamesStarted);
            pitcherToAdd.setTeamCity(teamCity);
            pitcherToAdd.setTeamName(teamName);
            pitcherToAdd.setAge(age);
            pitcherToAdd.setLeague(league);
            pitcherToAdd.setEarnedRuns(earnedRuns);
            pitcherToAdd.setStrikeouts(strikeouts);
            pitcherToAdd.setHomeRunsAllowed(homerunsAllowed);
            pitcherToAdd.setWins(wins);
            pitcherToAdd.setLosses(losses);
            pitcherToAdd.setSaves(saves);
            pitcherToAdd.setBlownSaves(blownSaves);
            pitcherToAdd.setHitsAllowed(hitsAllowed);
            pitcherToAdd.setWalksAllowed(walksAllowed);
            pitcherToAdd.setEra(era);
            pitcherToAdd.setWhip(whip);
            pitcherToAdd.setInningsPitched(inningsPitched);
            pitcherToAdd.setHitsPer9(hitsPer9);
            pitcherToAdd.setWalksPer9(walksPer9);
            pitcherToAdd.setStrikeoutsPer9(strikeoutsPer9);
            pitcherToAdd.setHomerunsPer9(homerunsPer9);
            pitcherToAdd.setSavesPerOpportunity(savesPerOpportunity);
            pitcherToAdd.setInningsPitchedMath(inningsPitchedMath);
            pitcherToAdd.setWinLossPercent(winLossPercent);
            pitcherToAdd.setStrikeoutWalkRatio(strikeoutWalkRatio);
            pitcherToAdd.setRunsAllowed(runsAllowed);
            pitcherToAdd.setCompleteGames(completeGames);
            pitcherToAdd.setShutouts(shutouts);
            pitcherToAdd.setHitBatters(hitBatters);
            pitcherToAdd.setBalks(balks);
            pitcherToAdd.setWildPitches(wildPitches);
            pitcherToAdd.setBattersFaced(battersFaced);

            allPitchers.add(pitcherToAdd);
        }
        sc.close();
    }

    @Override
    public ArrayList<Pitcher> getAllPitchers() {
        return allPitchers;
    }

    //**TESTED**
    @Override
    public ArrayList<Pitcher> getPitcherByThrowHand(char throwHand) {
        ArrayList<Pitcher> foundPitchers = new ArrayList<>();
        for (Pitcher thisPitcher : allPitchers) {
            if (thisPitcher.getThrowHand() == throwHand) {
                foundPitchers.add(thisPitcher);
            }
        }
        return foundPitchers;
    }

    //**TESTED**
    @Override
    public ArrayList<Pitcher> getPitcherByGamesStarted(int gamesStarted) {
        ArrayList<Pitcher> foundPitchers = new ArrayList<>();
        for (Pitcher thisPitcher : allPitchers) {
            if (thisPitcher.getGamesStarted() >= gamesStarted) {
                foundPitchers.add(thisPitcher);
            }
        }
        return foundPitchers;
    }

    //**TESTED**
    @Override
    public ArrayList<Pitcher> getPitcherByERA(double era) {
        ArrayList<Pitcher> foundPitchers = new ArrayList<>();
        for (Pitcher thisPitcher : allPitchers) {
            if (thisPitcher.getEra() <= era) {
                foundPitchers.add(thisPitcher);
            }
        }
        return foundPitchers;
    }

    //**TESTED**
    @Override
    public ArrayList<Pitcher> getPitcherByStrikeouts(int strikeouts) {
        ArrayList<Pitcher> foundPitchers = new ArrayList<>();
        for (Pitcher thisPitcher : allPitchers) {
            if (thisPitcher.getStrikeouts() >= strikeouts) {
                foundPitchers.add(thisPitcher);
            }
        }
        return foundPitchers;
    }

    //**TESTED**
    @Override
    public ArrayList<Pitcher> getPitcherByHRAllowed(int homeRunsAllowed) {
        ArrayList<Pitcher> foundPitchers = new ArrayList<>();
        for (Pitcher thisPitcher : allPitchers) {
            if (thisPitcher.getHomeRunsAllowed() <= homeRunsAllowed) {
                foundPitchers.add(thisPitcher);
            }
        }
        return foundPitchers;
    }

    //**TESTED**
    @Override
    public ArrayList<Pitcher> getPitcherByWins(int wins) {
        ArrayList<Pitcher> foundPitchers = new ArrayList<>();
        for (Pitcher thisPitcher : allPitchers) {
            if (thisPitcher.getWins() >= wins) {
                foundPitchers.add(thisPitcher);
            }
        }
        return foundPitchers;
    }

    //**TESTED**
    
    @Override
    public ArrayList<Pitcher> getPitcherBySaves(int saves) {
        ArrayList<Pitcher> foundPitchers = new ArrayList<>();
        for (Pitcher thisPitcher : allPitchers) {
            if (thisPitcher.getSaves() >= saves) {
                foundPitchers.add(thisPitcher);
            }
        }
        return foundPitchers;
    }

    //**TESTED**
    
    @Override
    public ArrayList<Pitcher> getPitcherByWHIP(double whip) {
        ArrayList<Pitcher> foundPitchers = new ArrayList<>();
        for (Pitcher thisPitcher : allPitchers) {
            if (thisPitcher.getWhip() <= whip) {
                foundPitchers.add(thisPitcher);
            }
        }
        return foundPitchers;
    }

    //**TESTED**
    
    @Override
    public ArrayList<Pitcher> getPitcherByHitsPer9(double hitsPer9) {
        ArrayList<Pitcher> foundPitchers = new ArrayList<>();
        for (Pitcher thisPitcher : allPitchers) {
            if (thisPitcher.getHitsPer9() <= hitsPer9) {
                foundPitchers.add(thisPitcher);
            }
        }
        return foundPitchers;
    }

    //**TESTED**
    
    @Override
    public ArrayList<Pitcher> getPitcherByWalksPer9(double walksPer9) {
        ArrayList<Pitcher> foundPitchers = new ArrayList<>();
        for (Pitcher thisPitcher : allPitchers) {
            if (thisPitcher.getWalksPer9() <= walksPer9) {
                foundPitchers.add(thisPitcher);
            }
        }
        return foundPitchers;
    }
    
    //**TESTED**

    @Override
    public ArrayList<Pitcher> getPitcherByStrikeoutsPer9(double strikeoutsPer9) {
        ArrayList<Pitcher> foundPitchers = new ArrayList<>();
        for (Pitcher thisPitcher : allPitchers) {
            if (thisPitcher.getStrikeoutsPer9() >= strikeoutsPer9) {
                foundPitchers.add(thisPitcher);
            }
        }
        return foundPitchers;
    }
    
    //**TESTED**

    @Override
    public ArrayList<Pitcher> getPitcherByHRPer9(double hrPer9) {
        ArrayList<Pitcher> foundPitchers = new ArrayList<>();
        for (Pitcher thisPitcher : allPitchers) {
            if (thisPitcher.getHomerunsPer9() <= hrPer9) {
                foundPitchers.add(thisPitcher);
            }
        }
        return foundPitchers;
    }
    
    //**TESTED**

    @Override
    public ArrayList<Pitcher> getPitcherByStrikoutWalkRatio(double strikeoutWalkRatio) {
        ArrayList<Pitcher> foundPitchers = new ArrayList<>();
        for (Pitcher thisPitcher : allPitchers) {
            if (thisPitcher.getStrikeoutWalkRatio() >= strikeoutWalkRatio) {
                foundPitchers.add(thisPitcher);
            }
        }
        return foundPitchers;
    }

    //**TESTED**
    
    public Pitcher getPitcherByLastName(String lastname) {
        Pitcher foundPitcher = new Pitcher(0);
        for (Pitcher thisPitcher : allPitchers) {
            if (thisPitcher.getLastName().equalsIgnoreCase(lastname)) {
                foundPitcher = thisPitcher;
            }
        }
        return foundPitcher;
    }

    //**TESTED**
    public void addPitcher(Pitcher thisPitcher) {
        allPitchers.add(thisPitcher);
    }

    //**TESTED**
    public int getSizePitcherList() {
        return allPitchers.size();
    }

    //**TESTED**
    public void removePitcher(Pitcher thisPitcher) {
        allPitchers.remove(thisPitcher);
    }

}
