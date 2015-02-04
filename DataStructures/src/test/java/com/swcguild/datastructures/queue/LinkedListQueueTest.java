/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.datastructures.queue;

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
public class LinkedListQueueTest {

    Queue aq = new LinkedListQueue();
    ArrayQueue aq2 = new ArrayQueue(16);
    Integer test1;
    Integer test2;
    Integer test3;
    Integer test4;
    Integer test5;
    Integer test6;
    Integer test7;
    Integer test8;
    Integer test9;
    Integer test10;
    Integer test11;
    Integer test12;
    Integer test13;
    Integer test14;
    Integer test15;
    Integer test16;

    public LinkedListQueueTest() {
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
        test6 = 6;
        test7 = 7;
        test8 = 8;
        test9 = 9;
        test10 = 10;
        test11 = 11;
        test12 = 12;
        test13 = 13;
        test14 = 14;
        test15 = 15;
        test16 = 16;
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
    public void isEmptyTest() {
        assertTrue(aq.isEmpty());
        aq.enqueue(test1);
        assertFalse(aq.isEmpty());
    }

    @Test
    public void sizeTest() {
        assertEquals(0, aq.size());
        aq.enqueue(test1);
        assertEquals(1, aq.size());
        aq.enqueue(test2);
        assertEquals(2, aq.size());
        aq.enqueue(test3);
        assertEquals(3, aq.size());
        Object intTest = (Integer)aq.dequeue();
        assertEquals(2, aq.size());
        assertEquals(1, intTest);
    }

    @Test
    public void resizeUpTest() {
        ArrayList<Integer> testArray = new ArrayList<>();
        aq.enqueue(test1);
        aq.enqueue(test2);
        aq.enqueue(test3);
        aq.dequeue();
        aq.enqueue(test4);
        aq.enqueue(test5);
        aq.enqueue(test1);
        for (Object o : aq) {
            int currentNumber = (Integer) o;
            testArray.add(currentNumber);
        }
        assertEquals(5, testArray.size());
        assertTrue(2 == testArray.get(0));
        assertTrue(3 == testArray.get(1));
        assertTrue(4 == testArray.get(2));
        assertTrue(5 == testArray.get(3));
        assertTrue(1 == testArray.get(4));
    }

    @Test
    public void resizeDownTest() {
        aq2.enqueue(test1);
        aq2.enqueue(test3);
        aq2.enqueue(test7);
        aq2.enqueue(test11);
        aq2.enqueue(test12);
        aq2.enqueue(test15);
        aq2.dequeue();
        aq2.dequeue();
        aq2.dequeue();
        assertEquals(8, aq2.returnArraySize());
        aq2.dequeue();
        aq2.dequeue();
        aq2.enqueue(test1);
        aq2.enqueue(test2);
        aq2.enqueue(test3);
        aq2.enqueue(test4);
        aq2.enqueue(test5);
        aq2.enqueue(test6);
        aq2.dequeue();
        aq2.dequeue();
        aq2.dequeue();
        aq2.dequeue();
        aq2.dequeue();
        assertEquals(4, aq2.returnArraySize());
        assertEquals(2, aq2.size());
    }
}
