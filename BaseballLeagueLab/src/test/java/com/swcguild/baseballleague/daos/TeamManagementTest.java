/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.baseballleague.daos;

import com.swcguild.baseballleague.dtos.Batter;
import com.swcguild.baseballleague.dtos.Pitcher;
import com.swcguild.baseballleague.dtos.Player;
import com.swcguild.baseballleague.dtos.Team;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class TeamManagementTest {
    
    TeamManagement tm = new TeamManagement();
    Team testTeam1 = new Team();
    Team testTeam2 = new Team();
    Team testTeam3 = new Team();
    
    public TeamManagementTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void addTeamTest(){
        testTeam1.setNickname("Phillies");
        testTeam2.setNickname("Indians");
        testTeam3.setNickname("A's");
        assertEquals(tm.getLeagueSize(), 0);
        tm.addTeam(testTeam1);
        assertEquals(tm.getLeagueSize(), 1);
        tm.addTeam(testTeam2);
        assertEquals(tm.getLeagueSize(), 2);
        tm.addTeam(testTeam3);
        assertEquals(tm.getLeagueSize(), 3);
    }
    
    @Test
    public void getTeamByNameTest(){
        testTeam1.setNickname("Phillies");
        testTeam1.setCity("Philadelphia");
        testTeam2.setNickname("Yankees");
        testTeam2.setCity("New York");
        tm.addTeam(testTeam1);
        tm.addTeam(testTeam2);
        assertEquals(tm.getTeamByName("Phillies").getCity(), "Philadelphia");
        assertEquals(tm.getTeamByName("Yankees").getCity(), "New York");
    }
    
    @Test
    public void getTeamRosterByName(){
        testTeam1.setNickname("Phillies");
        ArrayList<Player> testRoster = new ArrayList<>();
        Pitcher testPitcher = new Pitcher(1);
        Batter testBatter = new Batter(7);
        testRoster.add(testBatter);
        testRoster.add(testPitcher);
        testTeam1.setRoster(testRoster);
        tm.addTeam(testTeam1);
        ArrayList<Player> testRoster2 = tm.getTeamRosterByName("Phillies");
        assertEquals(testRoster2.size(), 2);
        assertEquals(testRoster2.get(0).getMlbPlayerId(), 7);
        assertEquals(testRoster2.get(1).getMlbPlayerId(), 1);
    }
    

    @Test
    public void readWriteTest() throws IOException{
        testTeam1.setNickname("Phillies");
        testTeam2.setNickname("Indians");
        testTeam1.setLeague("NL");
        testTeam2.setLeague("AL");
        tm.addTeam(testTeam1);
        tm.addTeam(testTeam2);
        tm.writeTeamsToFile();
        assertEquals (tm.getLeagueSize(), 2);
        tm.removeTeam("Indians");
        assertEquals(tm.getLeagueSize(), 1);
        tm.removeTeam("Phillies");
        assertEquals(tm.getLeagueSize(), 0);
        tm.loadTeamsFromFile();
        assertEquals(tm.getLeagueSize(), 2);
    }
    
}
