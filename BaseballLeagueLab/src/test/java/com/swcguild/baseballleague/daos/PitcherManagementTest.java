/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.baseballleague.daos;

import com.swcguild.baseballleague.dtos.Pitcher;
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
public class PitcherManagementTest {
    
    PitcherManagement pm = new PitcherManagement();
    Pitcher testPitcher1 = new Pitcher(1);
    Pitcher testPitcher2 = new Pitcher(2);
    Pitcher testPitcher3 = new Pitcher(3);
    
    public PitcherManagementTest() {
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
    
    /**
    
    @Test
    public void readWritePitcherTest() throws IOException{
        assertEquals(pm.getSizePitcherList(), 0);
        testPitcher1.setAge(27);
        testPitcher1.setTeamName("Phillies");
        testPitcher1.setHomerunsPer9(0.79);
        testPitcher1.setEra(3.75);
        testPitcher1.setLastName("Lee");
        testPitcher2.setBattersFaced(643);
        testPitcher2.setLosses(11);
        testPitcher2.setStrikeouts(194);
        testPitcher2.setThrowHand('L');
        testPitcher2.setLastName("Kluber");
        pm.addPitcher(testPitcher1);
        assertEquals(pm.getSizePitcherList(), 1);
        pm.addPitcher(testPitcher2);
        assertEquals(pm.getSizePitcherList(), 2);
        pm.writePitchersToFile();
        pm.removePitcher(testPitcher1);
        assertEquals(pm.getSizePitcherList(), 1);
        pm.removePitcher(testPitcher2);
        assertEquals(pm.getSizePitcherList(), 0);
        pm.loadPitchersFromFile();
        assertEquals(pm.getSizePitcherList(), 2);
        assertEquals(pm.getPitcherByLastName("Lee").getAge(), 27);
        assertEquals(pm.getPitcherByLastName("Lee").getTeamName(), "Phillies");
        assertEquals(pm.getPitcherByLastName("Lee").getHomerunsPer9(), 0.79, .00001);
        assertEquals(pm.getPitcherByLastName("Lee").getEra(),3.75, .00001);
        assertEquals(pm.getPitcherByLastName("Kluber").getBattersFaced(), 643);
        assertEquals(pm.getPitcherByLastName("Kluber").getLosses(), 11);
        assertEquals(pm.getPitcherByLastName("Kluber").getStrikeouts(), 194);
        assertEquals(pm.getPitcherByLastName("Kluber").getThrowHand(), 'L');
    }
    */
    
    @Test
    public void getPitcherByThrowHandTest(){
        testPitcher1.setThrowHand('R');
        testPitcher2.setThrowHand('L');
        testPitcher3.setThrowHand('R');
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        ArrayList<Pitcher> throwHandTest = pm.getPitcherByThrowHand('R');
        assertEquals(throwHandTest.size(), 2);
    }
    
    @Test
    public void getPitcherByGamesStartedTest(){
        testPitcher1.setGamesStarted(27);
        testPitcher2.setGamesStarted(19);
        testPitcher3.setGamesStarted(21);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        ArrayList<Pitcher> gamesStartedtest = pm.getPitcherByGamesStarted(20);
        assertEquals(gamesStartedtest.size(), 2);
        pm.removePitcher(testPitcher1);
        pm.removePitcher(testPitcher2);
        pm.removePitcher(testPitcher3);
        gamesStartedtest.clear();
        assertEquals(gamesStartedtest.size(), 0);
        testPitcher1.setGamesStarted(27);
        testPitcher2.setGamesStarted(15);
        testPitcher3.setGamesStarted(17);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        gamesStartedtest = pm.getPitcherByGamesStarted(20);
        assertEquals(gamesStartedtest.size(), 1);
    }
    
    
    @Test
    public void getPitcherByStrikeoutsTest(){
        testPitcher1.setStrikeouts(210);
        testPitcher2.setStrikeouts(174);
        testPitcher3.setStrikeouts(194);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        ArrayList<Pitcher> eraTest = pm.getPitcherByStrikeouts(190);
        assertEquals(eraTest.size(), 2);
        eraTest.clear();
        pm.removePitcher(testPitcher1);
        pm.removePitcher(testPitcher2);
        pm.removePitcher(testPitcher3);
        assertEquals(eraTest.size(), 0);
        testPitcher1.setStrikeouts(210);
        testPitcher2.setStrikeouts(174);
        testPitcher3.setStrikeouts(183);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        eraTest = pm.getPitcherByStrikeouts(190);
        assertEquals(eraTest.size(), 1);
    }
    
    @Test
    public void getPitcherByEraTest(){
        testPitcher1.setEra(2.75);
        testPitcher2.setEra(3.24);
        testPitcher3.setEra(2.91);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        ArrayList<Pitcher> eraTest = pm.getPitcherByERA(3.0);
        assertEquals(eraTest.size(), 2);
        eraTest.clear();
        pm.removePitcher(testPitcher1);
        pm.removePitcher(testPitcher2);
        pm.removePitcher(testPitcher3);
        assertEquals(eraTest.size(), 0);
        testPitcher1.setEra(2.75);
        testPitcher2.setEra(3.24);
        testPitcher3.setEra(3.75);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        eraTest = pm.getPitcherByERA(3.0);
        assertEquals(eraTest.size(), 1);
    }
    
    @Test
    public void getPitcherByHRAllowedTest(){
        testPitcher1.setHomeRunsAllowed(75);
        testPitcher2.setHomeRunsAllowed(50);
        testPitcher3.setHomeRunsAllowed(62);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        ArrayList<Pitcher> eraTest = pm.getPitcherByHRAllowed(65);
        assertEquals(eraTest.size(), 2);
        eraTest.clear();
        assertEquals(eraTest.size(), 0);
        eraTest = pm.getPitcherByHRAllowed(60);
        assertEquals(eraTest.size(), 1);
    }
    
    @Test
    public void getPitcherByWinsTest(){
        testPitcher1.setWins(21);
        testPitcher2.setWins(17);
        testPitcher3.setWins(15);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        ArrayList<Pitcher> eraTest = pm.getPitcherByWins(16);
        assertEquals(eraTest.size(), 2);
        eraTest.clear();
        assertEquals(eraTest.size(), 0);
        eraTest = pm.getPitcherByWins(21);
        assertEquals(eraTest.size(), 1);
    }
    
    @Test
    public void getPitcherBySavesTest(){
        testPitcher1.setSaves(43);
        testPitcher2.setSaves(47);
        testPitcher3.setSaves(52);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        ArrayList<Pitcher> eraTest = pm.getPitcherBySaves(47);
        assertEquals(eraTest.size(), 2);
        eraTest.clear();
        assertEquals(eraTest.size(), 0);
        eraTest = pm.getPitcherBySaves(50);
        assertEquals(eraTest.size(), 1);
    }
    
    @Test
    public void getPitcherByWhipTest(){
        testPitcher1.setWhip(1.21);
        testPitcher2.setWhip(1.03);
        testPitcher3.setWhip(0.98);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        ArrayList<Pitcher> eraTest = pm.getPitcherByWHIP(1.1);
        assertEquals(eraTest.size(), 2);
        eraTest.clear();
        assertEquals(eraTest.size(), 0);
        eraTest = pm.getPitcherByWHIP(0.98);
        assertEquals(eraTest.size(), 1);
    }
    
    @Test
    public void getPitcherByHitsPer9Test(){
        testPitcher1.setHitsPer9(7.4);
        testPitcher2.setHitsPer9(5.02);
        testPitcher3.setHitsPer9(6.30);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        ArrayList<Pitcher> eraTest = pm.getPitcherByHitsPer9(6.5);
        assertEquals(eraTest.size(), 2);
        eraTest.clear();
        assertEquals(eraTest.size(), 0);
        eraTest = pm.getPitcherByHitsPer9(5.02);
        assertEquals(eraTest.size(), 1);
    }
    
    @Test
    public void getPitcherByWalksPer9Test(){
        testPitcher1.setWalksPer9(2.3);
        testPitcher2.setWalksPer9(3.1);
        testPitcher3.setWalksPer9(2.57);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        ArrayList<Pitcher> eraTest = pm.getPitcherByWalksPer9(2.7);
        assertEquals(eraTest.size(), 2);
        eraTest.clear();
        assertEquals(eraTest.size(), 0);
        eraTest = pm.getPitcherByWalksPer9(2.3);
        assertEquals(eraTest.size(), 1);
    }
    
    @Test
    public void getPitcherByStrikeoutsPer9Test(){
        testPitcher1.setStrikeoutsPer9(7.5);
        testPitcher2.setStrikeoutsPer9(8.0);
        testPitcher3.setStrikeoutsPer9(6.3);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        ArrayList<Pitcher> eraTest = pm.getPitcherByStrikeoutsPer9(7.5);
        assertEquals(eraTest.size(), 2);
        eraTest.clear();
        assertEquals(eraTest.size(), 0);
        eraTest = pm.getPitcherByStrikeoutsPer9(8.0);
        assertEquals(eraTest.size(), 1);
    }
    
    @Test
    public void getPitcherByHRPer9Test(){
        testPitcher1.setHomerunsPer9(3.1);
        testPitcher2.setHomerunsPer9(2.1);
        testPitcher3.setHomerunsPer9(2.45);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        ArrayList<Pitcher> eraTest = pm.getPitcherByHRPer9(2.5);
        assertEquals(eraTest.size(), 2);
        eraTest.clear();
        assertEquals(eraTest.size(), 0);
        eraTest = pm.getPitcherByHRPer9(2.1);
        assertEquals(eraTest.size(), 1);
    }
    
    @Test
    public void getPitcherByStrikeoutWalkRatioTest(){
        testPitcher1.setStrikeoutWalkRatio(1.5);
        testPitcher2.setStrikeoutWalkRatio(2.1);
        testPitcher3.setStrikeoutWalkRatio(2.94);
        pm.addPitcher(testPitcher1);
        pm.addPitcher(testPitcher2);
        pm.addPitcher(testPitcher3);
        ArrayList<Pitcher> eraTest = pm.getPitcherByStrikoutWalkRatio(2.1);
        assertEquals(eraTest.size(), 2);
        eraTest.clear();
        assertEquals(eraTest.size(), 0);
        eraTest = pm.getPitcherByStrikoutWalkRatio(2.94);
        assertEquals(eraTest.size(), 1);
    }
}
