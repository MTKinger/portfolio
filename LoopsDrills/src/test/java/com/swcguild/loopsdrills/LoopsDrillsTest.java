/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.loopsdrills;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class LoopsDrillsTest {

    LoopsDrills ld = new LoopsDrills();
    boolean result;
    String stringResult;
    int intResult;
    double doubleResult;

    public LoopsDrillsTest() {
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
    public void stringTimesTest() {
        stringResult = ld.stringTimes("Hi", 2);
        assertEquals(stringResult, "HiHi");
        stringResult = ld.stringTimes("Hi", 3);
        assertEquals(stringResult, "HiHiHi");
        stringResult = ld.stringTimes("Hi", 1);
        assertEquals(stringResult, "Hi");
    }

    @Test
    public void frontTimesTest() {
        stringResult = ld.frontTimes("Chocolate", 2);
        assertEquals(stringResult, "ChoCho");
        stringResult = ld.frontTimes("Chocolate", 3);
        assertEquals(stringResult, "ChoChoCho");
        stringResult = ld.frontTimes("Abc", 3);
        assertEquals(stringResult, "AbcAbcAbc");
    }

    @Test
    public void countXXTest() {
        intResult = ld.countXX("abcxx");
        assertEquals(intResult, 1);
        intResult = ld.countXX("xxx");
        assertEquals(intResult, 2);
        intResult = ld.countXX("xxxx");
        assertEquals(intResult, 3);
    }

    @Test
    public void doubleXTest() {
        result = ld.doubleX("axxbb");
        assertTrue(result);
        result = ld.doubleX("axaxxax");
        assertFalse(result);
        result = ld.doubleX("xxxxx");
        assertTrue(result);
    }

    @Test
    public void everyOtherTest() {
        stringResult = ld.everyOther("Hello");
        assertEquals(stringResult, "Hlo");
        stringResult = ld.everyOther("Hi");
        assertEquals(stringResult, "H");
        stringResult = ld.everyOther("Heeololeo");
        assertEquals(stringResult, "Hello");
    }

    @Test
    public void stringSplosionTest() {
        stringResult = ld.stringSplosion("Code");
        assertEquals(stringResult, "CCoCodCode");
        stringResult = ld.stringSplosion("abc");
        assertEquals(stringResult, "aababc");
        stringResult = ld.stringSplosion("ab");
        assertEquals(stringResult, "aab");
    }

    @Test
    public void countLast2Test() {
        intResult = ld.countLast2("hixxhi");
        assertEquals(intResult, 1);
        intResult = ld.countLast2("xaxxaxaxx");
        assertEquals(intResult, 1);
        intResult = ld.countLast2("axxxaaxx");
        assertEquals(intResult, 2);
        intResult = ld.countLast2("xxaxxxaxxxxaxxx");
        assertEquals(intResult, 7);
    }

    @Test
    public void count9Test() {
        int[] testArray = {1, 2, 9};
        intResult = ld.count9(testArray);
        assertEquals(intResult, 1);
        int[] testArray2 = {1, 9, 9};
        intResult = ld.count9(testArray2);
        assertEquals(intResult, 2);
        int[] testArray3 = {1, 9, 9, 3, 9};
        intResult = ld.count9(testArray3);
        assertEquals(intResult, 3);
    }

    @Test
    public void arrayFront9Test() {
        int[] testArray1 = {1, 2, 9, 3, 4};
        result = ld.arrayFront9(testArray1);
        assertTrue(result);
        int[] testArray2 = {1, 2, 3, 4, 9};
        result = ld.arrayFront9(testArray2);
        assertFalse(result);
        int[] testArray3 = {1, 2, 3, 4, 5};
        result = ld.arrayFront9(testArray3);
        assertFalse(result);
    }

    @Test
    public void Array123Test() {
        int[] testArray1 = {1, 1, 2, 3, 1};
        result = ld.array123(testArray1);
        assertTrue(result);
        int[] testArray2 = {1,1,2,4,1};
        result = ld.array123(testArray2);
        assertFalse(result);
        int[] testArray3 = {1,1,2,1,2,3};
        result = ld.array123(testArray3);
        assertTrue(result);
    }
    
    @Test
    public void substringMatchTest(){
        intResult = ld.substringMatch("xxcaazz", "xxbaaz");
        assertEquals(intResult, 3);
        intResult = ld.substringMatch("abc", "abc");
        assertEquals(intResult, 2);
        intResult = ld.substringMatch("abc", "axz");
        assertEquals(intResult, 0);
    }
}
