/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.masteryproject.daos;

import com.swcguild.masteryproject.daos.ProductManagement;
import com.swcguild.masteryproject.dtos.Product;
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
public class ProductManagementTest {
    
    ProductManagement pm = new ProductManagement();
    
    public ProductManagementTest() {
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
    public void productsTest() throws FileNotFoundException{
        pm.loadFromFile();
        assertEquals (4, pm.getSize());
        ArrayList<String> testProd = pm.getAllProductTypes();
        assertEquals(4, testProd.size());
        String prod = testProd.get(0);
        assertEquals("Carpet", prod);
        assertEquals(1.75, pm.getCostPerSquareFoot("Laminate"), .00001);
        assertEquals(3.50, pm.getCostPerSquareFoot("tile"), .00001);
        assertEquals(2.10, pm.getLaborPerSquareFoot("Laminate"), .00001);
        assertEquals(4.75, pm.getLaborPerSquareFoot("Wood"), .000001);
    }
    
    @Test
    public void productsReadWriteTest() throws FileNotFoundException, IOException{
        pm.loadFromFile();
        pm.writeToFile();
        pm.clearAllProducts();
        pm.loadFromFile();
        assertEquals(pm.getSize(), 4);
        assertEquals(pm.getCostPerSquareFoot("Carpet"), 2.25, .00001);
        assertEquals(pm.getLaborPerSquareFoot("Tile"), 4.15, .000001);
    }
}
