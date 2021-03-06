/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.masteryproject.daos;

import com.swcguild.masteryproject.businesslogic.CostCalculator;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class TaxManagementXMLTest {
    
    TaxManagementXML taxes;
    
    public TaxManagementXMLTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        taxes = ctx.getBean("taxManagement", TaxManagementXML.class);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
        //Test all passed, however adding or removing taxes can cause the tests to fail
    //Which is why we have them commented out.
    
    
    
//    @Test
//    public void writeTaxesXMLTest() throws FileNotFoundException, javax.xml.stream.XMLStreamException, IOException {
//        assertEquals(0, taxes.getSize());
//        taxes.loadFromFile();
//        taxes.writeToFile();
//        taxes.clearAllTaxes();
//        taxes.loadFromFile();
//        assertEquals(5, taxes.getSize());
//        assertEquals(6.25, taxes.getTaxRate("OH"), .00001);
//        
//    }
//    
//    @Test
//    public void loadTaxesXMLTest() throws FileNotFoundException, javax.xml.stream.XMLStreamException{
//        taxes.loadFromFile();
//        assertEquals(5, taxes.getSize());
//        assertEquals(taxes.getTaxRate("PA"), 6.75, .00001);
//        assertEquals(taxes.getStates().get(3), "IN");
//        
//    }
}
