/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.masteryproject.daos;

import com.swcguild.masteryproject.dtos.Taxes;
import java.io.FileNotFoundException;
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
public class TaxManagementCSVTest {
    
    TaxManagementCSV taxes = new TaxManagementCSV();
    
    public TaxManagementCSVTest() {
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
    
    @Test
    public void taxesTest() throws FileNotFoundException {
        taxes.loadFromFile();
        assertEquals(4, taxes.getSize());
        ArrayList<String> testStates = taxes.getStates();
        assertEquals(4, testStates.size());
        String state = testStates.get(0);
        String state2 = testStates.get(2);
        assertEquals("OH", state);
        assertEquals("MI", state2);
        assertEquals(6.25, taxes.getTaxRate("OH"), .01);
        assertEquals(5.75, taxes.getTaxRate(state2), .00001);
    }
       
    @Test
    public void addTaxesTest() {
        assertEquals(0, taxes.getSize());
        taxes.addTax("RI", 0.12);
        assertEquals(1, taxes.getSize());
    
}
    
    @Test
    public void writeTaxesCSV() throws FileNotFoundException, IOException {
        assertEquals(0, taxes.getSize());
        taxes.loadFromFile();
        taxes.writeToFile();
        taxes.clearAllTaxes();
        taxes.loadFromFile();
        assertEquals(4, taxes.getSize());
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
