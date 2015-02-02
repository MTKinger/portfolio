/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.baseballleague.businesslogic;

import com.swcguild.baseballleague.daos.BatterManagement;
import com.swcguild.baseballleague.daos.PitcherManagement;
import com.swcguild.baseballleague.daos.TeamManagement;
import com.swcguild.baseballleague.dtos.Pitcher;
import com.swcguild.baseballleague.dtos.Player;
import com.swcguild.baseballleague.dtos.Team;
import java.io.FileNotFoundException;
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
public class TeamSorterTest {
    
    TeamSorter ts = new TeamSorter();
    TeamManagement tm = new TeamManagement();
    PitcherManagement pm = new PitcherManagement();
    BatterManagement bm = new BatterManagement();
    
    public TeamSorterTest() {
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
    public void teamSorterTest() throws FileNotFoundException, IOException{
        tm.loadTeamsFromFile();
        assertEquals(ts.sortRosters(tm.getTeamByName("Phillies")).size(), 2);
        assertEquals(ts.sortRosters(tm.getTeamByName("Phillies")).get(0).getLastName(), "Lee");
    }
}
