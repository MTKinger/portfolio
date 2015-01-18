/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.arraysdrills;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
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
public class ArraysDrillsTest {

    boolean result;
    int intResult;
    int[] arrayResult;
    ArraysDrills ad = new ArraysDrills();

    public ArraysDrillsTest() {
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
    public void FirstLast6Test() {
        int[] testArray1 = {1, 2, 6};
        result = ad.firstLast6(testArray1);
        assertTrue(result);
        int[] testArray2 = {6, 1, 2, 3};
        result = ad.firstLast6(testArray2);
        assertTrue(result);
        int[] testArray3 = {13, 6, 1, 2, 3};
        result = ad.firstLast6(testArray3);
        assertFalse(result);
    }

    @Test
    public void sameFirstLastTest() {
        int[] testArray1 = {1, 2, 3};
        result = ad.sameFirstLast(testArray1);
        assertFalse(result);
        int[] testArray2 = {1, 2, 3, 1};
        result = ad.sameFirstLast(testArray2);
        assertTrue(result);
        int[] testArray3 = {1, 2, 1};
        result = ad.sameFirstLast(testArray3);
        assertTrue(result);
        int[] testArray4 = {3, 1, 5, 6, 7, 3, 4, 5, 3};
        result = ad.sameFirstLast(testArray4);
        assertTrue(result);
    }

    @Test
    public void commonEndTest() {
        int[] testArray1 = {1, 2, 3};
        int[] testArray2 = {7, 3};
        result = ad.commonEnd(testArray1, testArray2);
        assertTrue(result);
        int[] testArray3 = {1, 2, 3};
        int[] testArray4 = {7, 3, 2};
        result = ad.commonEnd(testArray3, testArray4);
        assertFalse(result);
        int[] testArray5 = {1, 2, 3};
        int[] testArray6 = {1, 3};
        result = ad.commonEnd(testArray5, testArray6);
        assertTrue(result);
    }

    @Test
    public void sumTest() {
        int[] testArray1 = {1, 2, 3};
        intResult = ad.sum(testArray1);
        assertEquals(intResult, 6);
        int[] testArray2 = {5, 11, 2};
        intResult = ad.sum(testArray2);
        assertEquals(intResult, 18);
        int[] testArray3 = {7, 0, 0};
        intResult = ad.sum(testArray3);
        assertEquals(intResult, 7);
    }

    @Test
    public void rotateLeftTest() {
        int[] testArray1 = {1, 2, 3};
        int[] testAgainst = {2, 3, 1};
        arrayResult = ad.rotateLeft(testArray1);
        Assert.assertArrayEquals(arrayResult, testAgainst);
        int[] testArray2 = {5, 11, 9};
        int[] testAgainst2 = {11, 9, 5};
        arrayResult = ad.rotateLeft(testArray2);
        Assert.assertArrayEquals(arrayResult, testAgainst2);
        int[] testArray3 = {4, 8, 15, 16, 23, 42};
        int[] testAgainst3 = {8, 15, 16, 23, 42, 4};
        arrayResult = ad.rotateLeft(testArray3);
        Assert.assertArrayEquals(arrayResult, testAgainst3);
    }

    @Test
    public void reverseTest() {
        int[] testArray1 = {1, 2, 3};
        int[] testAgainst1 = {3, 2, 1};
        arrayResult = ad.reverse(testArray1);
        Assert.assertArrayEquals(arrayResult, testAgainst1);
        int[] testArray2 = {4, 8, 15, 16, 23, 42};
        int[] testAgainst2 = {42, 23, 16, 15, 8, 4};
        arrayResult = ad.reverse(testArray2);
        Assert.assertArrayEquals(arrayResult, testAgainst2);
    }

    @Test
    public void higherWinsTest() {
        int[] testArray1 = {1, 2, 3};
        int[] testAgainst1 = {3, 3, 3};
        arrayResult = ad.higherWins(testArray1);
        Assert.assertArrayEquals(arrayResult, testAgainst1);
        int[] testArray2 = {11, 5, 9};
        int[] testAgainst2 = {11, 11, 11};
        arrayResult = ad.higherWins(testArray2);
        Assert.assertArrayEquals(arrayResult, testAgainst2);
        int[] testArray3 = {2, 6, 7, 9, 4, 17};
        int[] testAgainst3 = {17, 17, 17, 17, 17, 17};
        arrayResult = ad.higherWins(testArray3);
        Assert.assertArrayEquals(arrayResult, testAgainst3);
    }

    @Test
    public void getMiddleTest() {
        int[] testArray1 = {1, 2, 3};
        int[] testArray2 = {4, 5, 6};
        int[] testAgainst1 = {2, 5};
        arrayResult = ad.getMiddle(testArray1, testArray2);
        Assert.assertArrayEquals(arrayResult, testAgainst1);
        int[] testArray3 = {1, 2, 3, 9, 4, 5, 6};
        int[] testArray4 = {9, 8, 7, 14, 3, 2, 1};
        int[] testagainst2 = {9, 14};
        arrayResult = ad.getMiddle(testArray3, testArray4);
        Assert.assertArrayEquals(arrayResult, testagainst2);
    }

    @Test
    public void hasEvenTest(){
        int[] testArray1 = {1,3,9,17,21};
        result = ad.hasEven(testArray1);
        assertFalse(result);
        int[] testArray2 = {1,5,3,9,4,1,3};
        result = ad.hasEven(testArray2);
        assertTrue(result);
    }
    
    @Test
    public void keepLastTest(){
        int[] tester1 = {1,2,3,4,5};
        int[] against1 = {0,0,0,0,0,0,0,0,0,5};
        arrayResult = ad.keepLast(tester1);
        Assert.assertArrayEquals(arrayResult, against1);
        int[] tester2 = {4,5,6};
        int[] against2 = {0,0,0,0,0,6};
        arrayResult = ad.keepLast(tester2);
        Assert.assertArrayEquals(arrayResult, against2);
    }
    
    @Test
    public void double23Test(){
        int[] tester1 = {2,3,4,5,6};
        result = ad.double23(tester1);
        assertFalse(result);
        int[] tester2 = {2,4,6,3,4,8,3,1};
        result = ad.double23(tester2);
        assertTrue(result);
        int[] tester3 = {1,2,3,4,5,2,4,5,6,3};
        result = ad.double23(tester3);
        assertTrue(result);
    }
    
    @Test
    public void fix23Test(){
        int[] tester1 = {1,2,3};
        int[] against1 = {1,2,0};
        arrayResult = ad.fix23(tester1);
        Assert.assertArrayEquals(arrayResult, against1);
        int[] tester2 = {2,3,5};
        int[] against2 = {2,0,5};
        arrayResult = ad.fix23(tester2);
        Assert.assertArrayEquals(arrayResult, against2);
        int[] tester3 = {1,2,1};
        int[] against3 = {1,2,1};
        arrayResult = ad.fix23(tester3);
        Assert.assertArrayEquals(arrayResult, against3);
    }
    
    @Test
    public void unlucky1Test(){
        int[] tester1 = {1,3,4,5};
        result = ad.unlucky1(tester1);
        assertTrue(result);
        int[] tester2 = {2,1,3,4,5};
        result = ad.unlucky1(tester2);
        assertTrue(result);
        int[] tester3 = {1,1,1};
        result = ad.unlucky1(tester3);
        assertFalse(result);
    }
    
    @Test
    public void make2Test(){
        int[] tester1 = {4,5};
        int[] tester2 = {1,2,3};
        int[] against1 = {4,5};
        arrayResult = ad.make2(tester1, tester2);
        Assert.assertArrayEquals(arrayResult, against1);
        int[] tester3 = {4};
        int[] tester4 = {1,2,3};
        int[] against2 = {4,1};
        arrayResult = ad.make2(tester3, tester4);
        Assert.assertArrayEquals(arrayResult, against2);
        int[] tester5 = {};
        int[] tester6 = {1,2};
        int[] against3 = {1,2};
        arrayResult = ad.make2(tester5, tester6);
        Assert.assertArrayEquals(arrayResult, against3);
    }
}
