/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.baseballleague.daos;

import com.swcguild.baseballleague.dtos.Batter;
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
public class BatterManagementTest {
    
    BatterManagement bm = new BatterManagement();
    Batter testBatter1 = new Batter(1);
    Batter testBatter2 = new Batter(2);
    Batter testBatter3 = new Batter(3);
    
    public BatterManagementTest() {
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
    public void batterReadWriteTest() throws IOException{
        assertEquals(bm.getSizeBattersList(), 0);
        testBatter1.setTeamCity("Philadelphia");
        testBatter1.setBattingAverage(.301);
        testBatter1.setGroundedIntoDP(22);
        testBatter1.setOnBasePlusSlugging(.423);
        testBatter1.setLastName("Utley");
        testBatter2.setDoubles(22);
        testBatter2.setHits(197);
        testBatter2.setRuns(111);
        testBatter2.setSacHits(13);
        testBatter2.setLastName("Abreu");
        bm.addBatter(testBatter1);
        assertEquals(bm.getSizeBattersList(), 1);
        bm.addBatter(testBatter2);
        assertEquals(bm.getSizeBattersList(), 2);
        bm.writeBattersToFile();
        bm.removeBatter(testBatter1);
        assertEquals(bm.getSizeBattersList(), 1);
        bm.removeBatter(testBatter2);
        assertEquals(bm.getSizeBattersList(), 0);
        bm.loadBatterToFile();
        assertEquals(bm.getSizeBattersList(), 2);
        assertEquals(bm.getBatterByLastName("Utley").getTeamCity(), "Philadelphia");
        assertEquals(bm.getBatterByLastName("Utley").getBattingAverage(), 0.301, .00001);
        assertEquals(bm.getBatterByLastName("Utley").getGroundedIntoDP(), 22);
        assertEquals(bm.getBatterByLastName("Utley").getOnBasePlusSlugging(), .423, .00001);
        assertEquals(bm.getBatterByLastName("Abreu").getDoubles(), 22);
        assertEquals(bm.getBatterByLastName("Abreu").getHits(), 197);
        assertEquals(bm.getBatterByLastName("Abreu").getRuns(), 111);
        assertEquals(bm.getBatterByLastName("Abreu").getSacHits(), 13);
    }*/
    
    @Test
    public void getBatterByBatHandTest(){
        testBatter1.setBatHand('R');
        testBatter2.setBatHand('L');
        testBatter3.setBatHand('R');
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        ArrayList<Batter> batHandtest = bm.getBatterByBatHand('R');
        assertEquals(batHandtest.size(), 2);
    }
    
    @Test
    public void getBatterByStrikeoutsTest(){
        testBatter1.setStrikeouts(27);
        testBatter2.setStrikeouts(19);
        testBatter3.setStrikeouts(21);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        ArrayList<Batter> strikeoutsTest = bm.getBatterByStrikeouts(20);
        assertEquals(strikeoutsTest.size(), 1);
        bm.removeBatter(testBatter1);
        bm.removeBatter(testBatter2);
        bm.removeBatter(testBatter3);
        strikeoutsTest.clear();
        assertEquals(strikeoutsTest.size(), 0);
        testBatter1.setStrikeouts(27);
        testBatter2.setStrikeouts(15);
        testBatter3.setStrikeouts(17);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        strikeoutsTest = bm.getBatterByStrikeouts(20);
        assertEquals(strikeoutsTest.size(), 2);
    }
    
    @Test
    public void getBatterByHitsTest(){
        testBatter1.setHits(27);
        testBatter2.setHits(19);
        testBatter3.setHits(21);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        ArrayList<Batter> strikeoutsTest = bm.getBatterByHits(20);
        assertEquals(strikeoutsTest.size(), 2);
        bm.removeBatter(testBatter1);
        bm.removeBatter(testBatter2);
        bm.removeBatter(testBatter3);
        strikeoutsTest.clear();
        assertEquals(strikeoutsTest.size(), 0);
        testBatter1.setHits(27);
        testBatter2.setHits(15);
        testBatter3.setHits(17);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        strikeoutsTest = bm.getBatterByHits(20);
        assertEquals(strikeoutsTest.size(), 1);
    }
    
    @Test
    public void getBatterByHomerunsTest(){
        testBatter1.setHomeruns(27);
        testBatter2.setHomeruns(19);
        testBatter3.setHomeruns(21);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        ArrayList<Batter> strikeoutsTest = bm.getBatterByHomeruns(20);
        assertEquals(strikeoutsTest.size(), 2);
        bm.removeBatter(testBatter1);
        bm.removeBatter(testBatter2);
        bm.removeBatter(testBatter3);
        strikeoutsTest.clear();
        assertEquals(strikeoutsTest.size(), 0);
        testBatter1.setHomeruns(27);
        testBatter2.setHomeruns(15);
        testBatter3.setHomeruns(17);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        strikeoutsTest = bm.getBatterByHomeruns(20);
        assertEquals(strikeoutsTest.size(), 1);
    }
    
    @Test
    public void getBatterByRBITest(){
        testBatter1.setRBI(27);
        testBatter2.setRBI(19);
        testBatter3.setRBI(21);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        ArrayList<Batter> strikeoutsTest = bm.getBatterByRBI(20);
        assertEquals(strikeoutsTest.size(), 2);
        bm.removeBatter(testBatter1);
        bm.removeBatter(testBatter2);
        bm.removeBatter(testBatter3);
        strikeoutsTest.clear();
        assertEquals(strikeoutsTest.size(), 0);
        testBatter1.setRBI(27);
        testBatter2.setRBI(15);
        testBatter3.setRBI(17);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        strikeoutsTest = bm.getBatterByRBI(20);
        assertEquals(strikeoutsTest.size(), 1);
    }
    
    @Test
    public void getBatterByStealsTest(){
        testBatter1.setSteals(27);
        testBatter2.setSteals(19);
        testBatter3.setSteals(21);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        ArrayList<Batter> strikeoutsTest = bm.getBatterBySteals(20);
        assertEquals(strikeoutsTest.size(), 2);
        bm.removeBatter(testBatter1);
        bm.removeBatter(testBatter2);
        bm.removeBatter(testBatter3);
        strikeoutsTest.clear();
        assertEquals(strikeoutsTest.size(), 0);
        testBatter1.setSteals(27);
        testBatter2.setSteals(15);
        testBatter3.setSteals(17);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        strikeoutsTest = bm.getBatterBySteals(20);
        assertEquals(strikeoutsTest.size(), 1);
    }
    
    @Test
    public void getBatterByBattingAverageTest(){
        testBatter1.setBattingAverage(.313);
        testBatter2.setBattingAverage(.275);
        testBatter3.setBattingAverage(.291);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        ArrayList<Batter> strikeoutsTest = bm.getBatterByBattingAverage(.280);
        assertEquals(strikeoutsTest.size(), 2);
        bm.removeBatter(testBatter1);
        bm.removeBatter(testBatter2);
        bm.removeBatter(testBatter3);
        strikeoutsTest.clear();
        assertEquals(strikeoutsTest.size(), 0);
        testBatter1.setBattingAverage(.260);
        testBatter2.setBattingAverage(.320);
        testBatter3.setBattingAverage(.280);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        strikeoutsTest = bm.getBatterByBattingAverage(.320);
        assertEquals(strikeoutsTest.size(), 1);
    }
    
    @Test
    public void getBatterByOnBasePercentageTest(){
        testBatter1.setOnBasePercentage(.313);
        testBatter2.setOnBasePercentage(.275);
        testBatter3.setOnBasePercentage(.291);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        ArrayList<Batter> strikeoutsTest = bm.getBatterByOnBasePercentage(.280);
        assertEquals(strikeoutsTest.size(), 2);
        bm.removeBatter(testBatter1);
        bm.removeBatter(testBatter2);
        bm.removeBatter(testBatter3);
        strikeoutsTest.clear();
        assertEquals(strikeoutsTest.size(), 0);
        testBatter1.setOnBasePercentage(.260);
        testBatter2.setOnBasePercentage(.320);
        testBatter3.setOnBasePercentage(.280);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        strikeoutsTest = bm.getBatterByOnBasePercentage(.320);
        assertEquals(strikeoutsTest.size(), 1);
    }
    
    @Test
    public void getBatterByOnBasePlusSluggingTest(){
        testBatter1.setOnBasePlusSlugging(.313);
        testBatter2.setOnBasePlusSlugging(.275);
        testBatter3.setOnBasePlusSlugging(.291);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        ArrayList<Batter> strikeoutsTest = bm.getBatterByOnBasePlusSlugging(.280);
        assertEquals(strikeoutsTest.size(), 2);
        bm.removeBatter(testBatter1);
        bm.removeBatter(testBatter2);
        bm.removeBatter(testBatter3);
        strikeoutsTest.clear();
        assertEquals(strikeoutsTest.size(), 0);
        testBatter1.setOnBasePlusSlugging(.260);
        testBatter2.setOnBasePlusSlugging(.320);
        testBatter3.setOnBasePlusSlugging(.280);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        strikeoutsTest = bm.getBatterByOnBasePlusSlugging(.320);
        assertEquals(strikeoutsTest.size(), 1);
    }
    
    @Test
    public void getBatterBySluggingTest(){
        testBatter1.setSluggingPercentage(.313);
        testBatter2.setSluggingPercentage(.275);
        testBatter3.setSluggingPercentage(.291);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        ArrayList<Batter> strikeoutsTest = bm.getBatterBySluggingPercentage(.280);
        assertEquals(strikeoutsTest.size(), 2);
        bm.removeBatter(testBatter1);
        bm.removeBatter(testBatter2);
        bm.removeBatter(testBatter3);
        strikeoutsTest.clear();
        assertEquals(strikeoutsTest.size(), 0);
        testBatter1.setSluggingPercentage(.260);
        testBatter2.setSluggingPercentage(.320);
        testBatter3.setSluggingPercentage(.280);
        bm.addBatter(testBatter1);
        bm.addBatter(testBatter2);
        bm.addBatter(testBatter3);
        strikeoutsTest = bm.getBatterBySluggingPercentage(.320);
        assertEquals(strikeoutsTest.size(), 1);
    }
}
