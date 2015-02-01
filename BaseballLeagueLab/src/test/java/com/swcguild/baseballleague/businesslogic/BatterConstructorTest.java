/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.baseballleague.businesslogic;

import com.swcguild.baseballleague.dtos.Batter;
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
public class BatterConstructorTest {
    
    BatterConstructor bc = new BatterConstructor();
    Batter testBatter1 = new Batter(1);
    Batter testBatter2 = new Batter(2);
    
    public BatterConstructorTest() {
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
    public void batterConstructorTest(){
        testBatter1.setAtBats(100);
        testBatter1.setSingles(20);
        testBatter1.setDoubles(7);
        testBatter1.setTriples(1);
        testBatter1.setHomeruns(4);
        testBatter1.setHits(32);
        testBatter1.setWalks(8);
        testBatter1.setHitByPitch(3);
        testBatter1.setSacFlies(5);
        testBatter1.setStrikeouts(13);
        testBatter1.setRuns(14);
        testBatter2 = bc.buildBatter(testBatter1);
        assertEquals(testBatter2.getBattingAverage(), .32, .00001);
        assertEquals(testBatter2.getOnBasePercentage(), .3706, .001);
        assertEquals(testBatter2.getSluggingPercentage(), .53, .01);
        assertEquals(testBatter2.getOnBasePlusSlugging(), .9006, .0001);
        assertEquals(testBatter2.getAtBatsPerHR(), 25, .00001);
        assertEquals(testBatter2.getAtBatsPerStrikeout(), 7.692, .001);
        assertEquals(testBatter2.getRunsPerAtBat(), .14, .001);
    }
}
