/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.masteryproject.daos;

import com.swcguild.masteryproject.dtos.Taxes;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import jdk.internal.util.xml.XMLStreamException;
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
public class TaxManagementTest {
    
    TaxManagement taxes = new TaxManagement();
    
    public TaxManagementTest() {
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
    public void loadTaxesXMLTest() throws FileNotFoundException, javax.xml.stream.XMLStreamException{
        ArrayList<Taxes> testList = taxes.loadTaxesXML();
        assertEquals(4, testList.size());
        assertEquals(testList.get(1).getTaxRate(), 6.75, .00001);
        assertEquals(testList.get(3).getState(), "IN");
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
