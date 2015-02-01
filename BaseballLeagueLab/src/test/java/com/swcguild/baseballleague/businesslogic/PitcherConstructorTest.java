/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.baseballleague.businesslogic;

import com.swcguild.baseballleague.dtos.Pitcher;
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
public class PitcherConstructorTest {
    
    PitcherConstructor pb = new PitcherConstructor();
    Pitcher testPitcher1 = new Pitcher(1);
    Pitcher testPitcher2 = new Pitcher(2);
    
    public PitcherConstructorTest() {
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
    public void buildPitcherTest(){
        testPitcher1.setEarnedRuns(2);
        testPitcher1.setInningsPitched(6);
        testPitcher1.setWalksAllowed(3);
        testPitcher1.setHitsAllowed(6);
        testPitcher1.setStrikeouts(6);
        testPitcher1.setHomeRunsAllowed(2);
        testPitcher1.setSaves(4);
        testPitcher1.setBlownSaves(4);
        testPitcher1.setWins(11);
        testPitcher1.setLosses(2);
        testPitcher2 = pb.buildPitcher(testPitcher1);
        assertEquals(testPitcher2.getEra(), 3.0, .0001);
        assertEquals(testPitcher2.getWhip(),1.5, .0001);
        assertEquals(testPitcher2.getHitsPer9(), 9, .0001);
        assertEquals(testPitcher2.getWalksPer9(), 4.5, .0001);
        assertEquals(testPitcher2.getStrikeoutsPer9(), 9, .00001);
        assertEquals(testPitcher2.getHomerunsPer9(), 3, .00001);
        assertEquals(testPitcher2.getSavesPerOpportunity(), .5, .0000001);
        assertEquals(testPitcher2.getWinLossPercent(), 5.5, .00001);
        assertEquals(testPitcher2.getStrikeoutWalkRatio(), 2.0, .0001);
        System.out.println(testPitcher2.getSavesPerOpportunity());
        System.out.println(testPitcher2.getWinLossPercent());
        
    }
    
}
