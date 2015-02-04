/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.datastructures.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
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
public class LinkedListTest {
    
    LinkedList llLinkedList = new LinkedList();
    Object test1;
    Object test2;
    Object test3;
    Object test4;
    Object test5;
    Object test6;
    
    ArrayList<Object> iterTest = new ArrayList<>();
    
    public LinkedListTest() {
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
    public void isEmptySizeTest(){
        assertTrue(llLinkedList.isEmpty());
        llLinkedList.append(test1);
        assertFalse(llLinkedList.isEmpty());
        assertEquals(1, llLinkedList.size());
        llLinkedList.append(test2);
        assertFalse(llLinkedList.isEmpty());
        assertEquals(2, llLinkedList.size());
    }
    
    @Test
    public void getTest(){
        llLinkedList.append(test1);
        llLinkedList.append(test2);
        llLinkedList.append(test3);
        llLinkedList.append(test4);
        llLinkedList.append(test5);
        int test3 = (Integer)llLinkedList.get(2);
        assertEquals(3, test3);
        int test5 = (Integer)llLinkedList.get(4);
        assertEquals(5, test5);
    }
    
    @Test
    public void insertTest(){
        llLinkedList.append(test1);
        llLinkedList.append(test2);
        llLinkedList.append(test3);
        llLinkedList.append(test4);
        llLinkedList.append(test5);
        llLinkedList.insert(test6, 3);
        int test6 = (Integer)llLinkedList.get(3);
        assertEquals(6, test6);
        int test4 = (Integer)llLinkedList.get(4);
        assertEquals(4, test4);
    }
    
    @Test
    public void appendPrependTest(){
        llLinkedList.append(test1);
        llLinkedList.prepend(test2);
        llLinkedList.append(test3);
        llLinkedList.prepend(test4);
        int test4 = (Integer)llLinkedList.get(0);
        assertEquals(4, test4);
        int test2 = (Integer)llLinkedList.get(1);
        assertEquals(2, test2);
        int test1 = (Integer)llLinkedList.get(2);
        assertEquals(1, test1);
        int test3 = (Integer)llLinkedList.get(3);
        assertEquals(3, test3);
    }
    
    @Test
    public void removeTest(){
        llLinkedList.append(test1);
        llLinkedList.prepend(test2);
        llLinkedList.append(test3);
        llLinkedList.prepend(test4);
        int test2 = (Integer)llLinkedList.remove(1);
        assertEquals(2, test2);
        assertEquals(3, llLinkedList.size());
        int test1 = (Integer)llLinkedList.remove(1);
        assertEquals(1, test1);
        assertEquals(2, llLinkedList.size());
    }
    
    @Test
    public void iteratorTest(){
        llLinkedList.append(test1);
        llLinkedList.prepend(test2);
        llLinkedList.append(test3);
        llLinkedList.prepend(test4);
        Iterator iter = llLinkedList.iterator();
        while (iter.hasNext()){
            iterTest.add(iter.next());
        }
        int test4 = (Integer)iterTest.get(0);
        int test2 = (Integer)iterTest.get(1);
        int test1 = (Integer)iterTest.get(2);
        int test3 = (Integer)iterTest.get(3);
        
        assertEquals(4, test4);
        assertEquals(2, test2);
        assertEquals(1, test1);
        assertEquals(3, test3);
        
    }
    
}
