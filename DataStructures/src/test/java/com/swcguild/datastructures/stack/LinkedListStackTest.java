/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.datastructures.stack;

import java.util.ArrayList;
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
public class LinkedListStackTest {
    
    Stack testStack = new LinkedListStack();
    Integer test1;
    Integer test2;
    Integer test3;
    Integer test4;
    Integer test5;

    public LinkedListStackTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        test1 = 1;
        test2 = 2;
        test3 = 3;
        test4 = 4;
        test5 = 5;

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
    public void isExmptyTest() {
        assertTrue(testStack.isEmpty());
        testStack.push(test1);
        assertFalse(testStack.isEmpty());
    }
    
    @Test
    public void sizePushPopTest(){
        assertEquals(0, testStack.size());
        testStack.push(test1);
        assertEquals(1, testStack.size());
        testStack.push(test2);
        assertEquals(2, testStack.size());
        testStack.push(test3);
        assertEquals(3, testStack.size());
        testStack.push(test4);
        assertEquals(4, testStack.size());
        testStack.push(test5);
        assertEquals(5, testStack.size());
        Integer testInt = (Integer)testStack.pop();
        assertEquals(4, testStack.size());
        assertTrue(5 == testInt);
        Integer testInt2 = (Integer)testStack.pop();
        assertEquals(3, testStack.size());
        assertTrue(4 == testInt2);
    }
    
    @Test
    public void iteratorTest(){
        ArrayList<Integer> testArray = new ArrayList<>();
        testStack.push(test1);
        testStack.push(test2);
        testStack.push(test3);
        testStack.push(test4);
        testStack.push(test5);
        for (Object o : testStack){
            int currentNumber = (Integer)o;
            testArray.add(currentNumber);
        }
        assertEquals(5, testArray.size());
        assertTrue(5 == testArray.get(0));
        assertTrue(4 == testArray.get(1));
        assertTrue(3 == testArray.get(2));
        assertTrue(2 == testArray.get(3));
        assertTrue(1 == testArray.get(4));
        
        ArrayList<Integer> testArray2 = new ArrayList<>();
        testStack.pop();
        testStack.pop();
        for (Object o : testStack){
            int currentNumber = (Integer)o;
            testArray2.add(currentNumber);
        }
        assertTrue(3 == testArray.get(2));
        assertTrue(2 == testArray.get(3));
        assertTrue(1 == testArray.get(4));
    }
}
