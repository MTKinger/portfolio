/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DTOs.Product;
import java.io.FileNotFoundException;
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
        assertEquals(2.10, pm.getLaborPerSquareFoot("Laminate"), .00001);
    }
}
