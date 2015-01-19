/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.logicdrillstest;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class LogicDrillsTest {
    
    LogicDrills ld = new LogicDrills();
    boolean result;
    int intResult;
    String stringResult;
    
    public LogicDrillsTest() {
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
    public void greatPartyTest(){
        result = ld.greatParty(30, false);
        assertFalse(result);
        result = ld.greatParty(50, false);
        assertTrue(result);
        result = ld.greatParty(70, true);
        assertTrue(result);
    }
    
    @Test
    public void canHazTableTest(){
        intResult = ld.canHazTables(5, 10);
        assertEquals(intResult, 2);
        intResult = ld.canHazTables(5, 2);
        assertEquals(intResult, 0);
        intResult = ld.canHazTables(5, 5);
        assertEquals(intResult, 1);
        intResult = ld.canHazTables(10, 2);
        assertEquals(intResult, 0);
    }
    
    @Test
    public void playOutsideTest(){
        result = ld.playOutside(70, false);
        assertTrue(result);
        result = ld.playOutside(95, false);
        assertFalse(result);
        result = ld.playOutside(95, true);
        assertTrue(result);
    }
    
    @Test
    public void caughtSpeedingTest(){
        intResult = ld.caughtSpeeding(60, false);
        assertEquals(intResult, 0);
        intResult = ld.caughtSpeeding(65, false);
        assertEquals(intResult, 1);
        intResult = ld.caughtSpeeding(65, true);
        assertEquals(intResult, 0);
        intResult = ld.caughtSpeeding(85, true);
        assertEquals(intResult, 1);
        intResult = ld.caughtSpeeding(85, false);
        assertEquals(intResult, 2);
    }
    
    @Test
    public void skipSumTest(){
        intResult = ld.skipSum(3, 4);
        assertEquals(intResult, 7);
        intResult = ld.skipSum(9, 4);
        assertEquals(intResult,20);
        intResult = ld.skipSum(10, 11);
        assertEquals(intResult, 21);
    }
    
    @Test
    public void alarmClockTest(){
        stringResult = ld.alarmClock(1, false);
        assertEquals(stringResult, "7:00");
        stringResult = ld.alarmClock(5, false);
        assertEquals(stringResult, "7:00");
        stringResult = ld.alarmClock(0, false);
        assertEquals(stringResult, "10:00");
        stringResult = ld.alarmClock(1, true);
        assertEquals(stringResult, "10:00");
        stringResult = ld.alarmClock(6, true);
        assertEquals(stringResult, "Alarm Off");
    }
    
    @Test
    public void loveSixTest(){
        result = ld.loveSix(6, 4);
        assertTrue(result);
        result = ld.loveSix(4, 5);
        assertFalse(result);
        result = ld.loveSix(1, 5);
        assertTrue(result);
        result = ld.loveSix(9, 3);
        assertTrue(result);
    }
    
    @Test
    public void inRangeTest(){
        result = ld.inRange(5, false);
        assertTrue(result);
        result = ld.inRange(11, false);
        assertFalse(result);
        result = ld.inRange(11, true);
        assertTrue(result);
    }
    
    @Test
    public void specialElevenTest(){
        result = ld.specialEleven(22);
        assertTrue(result);
        result = ld.specialEleven(23);
        assertTrue(result);
        result = ld.specialEleven(24);
        assertFalse(result);
    }
    
    @Test
    public void mod20Test(){
        result = ld.mod20(20);
        assertFalse(result);
        result = ld.mod20(21);
        assertTrue(result);
        result = ld.mod20(42);
        assertTrue(result);
    }
    
    @Test
    public void mod35Test(){
        result = ld.mod35(3);
        assertTrue(result);
        result = ld.mod35(10);
        assertTrue(result);
        result = ld.mod35(15);
        assertFalse(result);
    }
    
    @Test
    public void answerCallTest(){
        result = ld.answerCall(false, false, false);
        assertTrue(result);
        result = ld.answerCall(false, false, true);
        assertFalse(result);
        result = ld.answerCall(true, false, false);
        assertFalse(result);
    }
    
    @Test
    public void twoIsOneTest(){
        result = ld.twoIsOne(1, 2, 3);
        assertTrue(result);
        result = ld.twoIsOne(3, 1, 2);
        assertTrue(result);
        result = ld.twoIsOne(3, 2, 2);
        assertFalse(result);
    }
    
    @Test
    public void areInOrderTest(){
        result = ld.areInOrder(1, 2, 4, false);
        assertTrue(result);
        result = ld.areInOrder(1, 2, 1, false);
        assertFalse(result);
        result = ld.areInOrder(2, 1, 3, true);
        assertTrue(result);
    }
    
    @Test
    public void inOrderEqualTest(){
        result = ld.inOrderEqual(2, 5, 11, false);
        assertTrue(result);
        result = ld.inOrderEqual(5, 7, 6, false);
        assertFalse(result);
        result = ld.inOrderEqual(5, 5, 7, true);
        assertTrue(result);
    }
    
    @Test
    public void lastDigitTest(){
        result = ld.lastDigit(23, 19, 13);
        assertTrue(result);
        result = ld.lastDigit(23, 19, 12);
        assertFalse(result);
        result = ld.lastDigit(3, 13, 23);
        assertTrue(result);
    }
    
    @Test
    public void rollDiceTest(){
        intResult = ld.rollDice(2, 3, true);
        assertEquals(intResult, 5);
        intResult = ld.rollDice(3, 3, true);
        assertEquals(intResult, 7);
        intResult = ld.rollDice(3, 3, false);
        assertEquals(intResult, 6);
        intResult = ld.rollDice(6, 6, true);
        assertEquals(intResult, 7);
    }
}
