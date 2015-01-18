/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.conditionalsdrills;

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
public class ConditionalsDrillsTests {
    
    boolean result;
    int intResult;
    String stringResult;
    ConditionalsDrills cd = new ConditionalsDrills();
    
    public ConditionalsDrillsTests() {
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
    public void mischeviousChildrenTest(){
        result = cd.mischeviousChildren(true, true);
        assertTrue(result);
        result = cd.mischeviousChildren(false, false);
        assertTrue(result);
        result = cd.mischeviousChildren(true, false);
        assertFalse(result);
    }
    
    @Test
    public void sleepingInTest(){
        result = cd.sleepingIn(false, false);
        assertTrue(result);
        result = cd.sleepingIn(true, false);
        assertFalse(result);
        result = cd.sleepingIn(true, true);
        assertTrue(result);
        result = cd.sleepingIn(false, true);
        assertTrue(result);
    }
    
    @Test
    public void sumDoubleTest(){
        intResult = cd.sumDouble(1, 2);
        assertEquals(intResult, 3);
        intResult = cd.sumDouble(3, 2);
        assertEquals(intResult, 5);
        intResult = cd.sumDouble(2, 2);
        assertEquals(intResult, 8);
    }
    
    @Test
    public void diff21Test(){
        intResult = cd.diff21(23);
        assertEquals(intResult, 4);
        intResult = cd.diff21(10);
        assertEquals(intResult, 11);
        intResult = cd.diff21(21);
        assertEquals(intResult, 0);
    }
    
    @Test
    public void parrotTroubleTest(){
        result = cd.parrotTrouble(true, 6);
        assertTrue(result);
        result = cd.parrotTrouble(true, 7);
        assertFalse(result);
        result = cd.parrotTrouble(false, 6);
        assertFalse(result);
    }
    
    @Test
    public void makes10Test(){
        result = cd.makes10(9, 10);
        assertTrue(result);
        result = cd.makes10(9, 9);
        assertFalse(result);
        result = cd.makes10(1, 9);
        assertTrue(result);
    }
    
    @Test
    public void nearHundredTest(){
        result = cd.nearHundred(103);
        assertTrue(result);
        result = cd.nearHundred(90);
        assertTrue(result);
        result = cd.nearHundred(89);
        assertFalse(result);
    }
    
    @Test
    public void posNegTest(){
        result = cd.posNeg(1, -1, false);
        assertTrue(result);
        result = cd.posNeg(-1, 1, false);
        assertTrue(result);
        result = cd.posNeg(-4, -5, true);
        assertTrue(result);
        result = cd.posNeg(-4, -5, false);
        assertFalse(result);
    }
    
    @Test
    public void notStringTest(){
        stringResult = cd.notString("candy");
        assertEquals(stringResult, "not candy");
        stringResult = cd.notString("x");
        assertEquals(stringResult, "not x");
        stringResult = cd.notString("not bad");
        assertEquals(stringResult, "not bad");
    }
    
    @Test
    public void missingCharTest(){
        stringResult = cd.missingChar("kitten", 1);
        assertEquals(stringResult, "ktten");
        stringResult = cd.missingChar("kitten", 0);
        assertEquals(stringResult, "itten");
        stringResult = cd.missingChar("kitten", 4);
        assertEquals(stringResult, "kittn");
    }
    
    @Test
    public void firstLastTest(){
        stringResult = cd.frontBack("code");
        assertEquals(stringResult, "eodc");
        stringResult = cd.frontBack("a");
        assertEquals(stringResult, "a");
        stringResult = cd.frontBack("ab");
        assertEquals(stringResult, "ba");
        stringResult = cd.frontBack("Mike King");
        assertEquals(stringResult, "gike KinM");
    }
    
    @Test
    public void front3Test(){
        stringResult = cd.front3("Microsoft");
        assertEquals(stringResult, "MicMicMic");
        stringResult = cd.front3("Chocolate");
        assertEquals(stringResult, "ChoChoCho");
        stringResult = cd.front3("at");
        assertEquals(stringResult, "atatat");
    }
    
    @Test
    public void backAroundTest(){
        stringResult = cd.backAround("cat");
        assertEquals(stringResult, "tcatt");
        stringResult = cd.backAround("Hello");
        assertEquals(stringResult, "oHelloo");
        stringResult = cd.backAround("a");
        assertEquals(stringResult, "aaa");
    }
    
    @Test
    public void multiple3or5Test(){
        result = cd.multiple3or5(3);
        assertTrue(result);
        result = cd.multiple3or5(10);
        assertTrue(result);
        result = cd.multiple3or5(8);
        assertFalse(result);
    }
    
    @Test
    public void startHiTest(){
        result = cd.startHi("hi there");
        assertTrue(result);
        result = cd.startHi("hi");
        assertTrue(result);
        result = cd.startHi("high up");
        assertFalse(result);
    }
    
    @Test
    public void icyHotTest(){
        result = cd.icyHot(120, -1);
        assertTrue(result);
        result = cd.icyHot(-1, 120);
        assertTrue(result);
        result = cd.icyHot(2, 120);
        assertFalse(result);
    }
    
    @Test
    public void between10and20Test(){
        result = cd.between10and20(12, 99);
        assertTrue(result);
        result = cd.between10and20(21, 12);
        assertTrue(result);
        result = cd.between10and20(8, 99);
        assertFalse(result);
    }
    
    @Test
    public void hasTeenTest(){
        result = cd.hasTeen(13, 20, 10);
        assertTrue(result);
        result = cd.hasTeen(20, 19, 10);
        assertTrue(result);
        result = cd.hasTeen(20, 10, 12);
        assertFalse(result);
    }
    
    @Test
    public void soAloneTest(){
        result = cd.soAlone(13, 99);
        assertTrue(result);
        result = cd.soAlone(21, 19);
        assertTrue(result);
        result = cd.soAlone(13, 13);
        assertFalse(result);
    }
    
    @Test
    public void removeDelTest(){
        stringResult = cd.removeDel("adelbc");
        assertEquals(stringResult, "abc");
        stringResult = cd.removeDel("adelHello");
        assertEquals(stringResult, "aHello");
        stringResult = cd.removeDel("adedbc");
        assertEquals(stringResult, "adedbc");
    }
    
    @Test
    public void ixStartTest(){
        result = cd.ixStart("mix snacks");
        assertTrue(result);
        result = cd.ixStart("pix snacks");
        assertTrue(result);
        result = cd.ixStart("piz snacks");
        assertFalse(result);
    }
    
    @Test
    public void startOzTest(){
        stringResult = cd.startOz("ozymandias");
        assertEquals(stringResult, "oz");
        stringResult = cd.startOz("bzoo");
        assertEquals(stringResult, "z");
        stringResult = cd.startOz("oxx");
        assertEquals(stringResult, "o");
    }
    
    @Test
    public void maxTest(){
        intResult = cd.max(1, 2, 3);
        assertEquals(intResult, 3);
        intResult = cd.max(1, 3, 2);
        assertEquals(intResult, 3);
        intResult = cd.max(3, 2, 1);
        assertEquals(intResult, 3);
        intResult = cd.max(3, 3, 1);
        assertEquals(intResult, 3);
    }
    
    @Test
    public void closerTest(){
        intResult = cd.closer(8, 13);
        assertEquals(intResult, 8);
        intResult = cd.closer(13, 8);
        assertEquals(intResult, 8);
        intResult = cd.closer(13, 7);
        assertEquals(intResult,0);
    }
    
    @Test
    public void howManyETest(){
        result = cd.howManyE("Hello");
        assertTrue(result);
        result = cd.howManyE("Heelle");
        assertTrue(result);
        result = cd.howManyE("Heelele");
        assertFalse(result);
        result = cd.howManyE("boohoo");
        assertFalse(result);
    }
    
    @Test
    public void endUpTest(){
        stringResult = cd.endUp("Hello");
        assertEquals(stringResult, "HeLLO");
        stringResult = cd.endUp("hi there");
        assertEquals(stringResult, "hi thERE");
        stringResult = cd.endUp("hi");
        assertEquals(stringResult, "HI");
    }
    
    @Test
    public void everyNthTest(){
        stringResult = cd.everyNth("Miracle", 2);
        assertEquals(stringResult, "Mrce");
        stringResult = cd.everyNth("abcdefg", 2);
        assertEquals(stringResult, "aceg");
        stringResult = cd.everyNth("abcdefg", 3);
        assertEquals(stringResult, "adg");
    }
}
