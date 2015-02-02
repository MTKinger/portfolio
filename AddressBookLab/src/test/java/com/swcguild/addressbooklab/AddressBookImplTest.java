/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbooklab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public class AddressBookImplTest {
    
    AddressBookDao ab = new AddressBookImpl();
    
    House test1;
    House test2;
    House test3;
    
    public AddressBookImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        test1 = new House(123);
        test2 = new House(456);
        test3 = new House(789);
        test1.setFirstName("Mike");
        test1.setLastName("King");
        test1.setStreetAddress("401 South Main St.");
        test1.setCity("Akron");
        test1.setState("OH");
        test1.setZip("44311");
        test2.setFirstName("Zach");
        test2.setLastName("Sullivan");
        test2.setStreetAddress("123 Street Rd.");
        test2.setCity("Cleveland");
        test2.setState("OH");
        test2.setZip("44123");
        test3.setFirstName("Rob");
        test3.setLastName("Helvey");
        test3.setStreetAddress("444 Happy St.");
        test3.setCity("Columbia");
        test3.setState("SC");
        test3.setZip("00311");
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
    public void addGetRemoveTest(){
        ab.addHouse(test1);
        assertEquals(ab.getAllHouses().size(), 1);
        House actualResult = ab.getHouse(test1.getId());
        assertEquals(test1, actualResult);
        ab.removeHouse(test1.getId());
        assertEquals(0, ab.getAllHouses().size());
        actualResult = ab.getHouse(test1.getId());
        assertNull(actualResult);
    }
    
    @Test
    public void updateTest(){
        ab.addHouse(test1);
        test1.setCity("Philadelphia");
        ab.updateHouse(test1);
        House actualResult = ab.getHouse(test1.getId());
        assertEquals("Philadelphia", actualResult.getCity());
        test1.setFirstName("Joe");
        ab.updateHouse(test1);
        actualResult = ab.getHouse(test1.getId());
        assertEquals("Joe", actualResult.getFirstName());
    }
    
    @Test
    public void getAllHousesTest(){
        assertEquals(ab.getAllHouses().size(),0);
        ab.addHouse(test1);
        ab.addHouse(test2);
        ab.addHouse(test3);
        assertEquals(ab.getAllHouses().size(), 3);
        List<House> actualResult = ab.getAllHouses();
        List<House> expectedResult = new ArrayList<>();
        expectedResult.add(test1);
        expectedResult.add(test2);
        expectedResult.add(test3);
        
        Collections.sort(actualResult);
        Collections.sort(expectedResult);
        
        assertEquals(expectedResult, actualResult);
        
    }
}
