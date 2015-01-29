/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuisnessLogic;

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
public class CostCalculatorTest {
    
    CostCalculator cc = new CostCalculator();
    double result;

    public CostCalculatorTest() {
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
    
    @ Test
    public void calculateMaterialTest(){
        result = cc.calculateMaterial(2.5, 3.0);
        assertEquals(result, 7.5, .0005);
        result = cc.calculateMaterial(1.5, 4.0);
        assertEquals(result, 6.0, .00001);
        result = cc.calculateMaterial(1.25, 3.15);
        assertEquals(result, 3.93, .01);
    }
    
    @ Test
    public void calculateLaborTest(){
        result = cc.calculateLabor(2.5, 3.0);
        assertEquals(result, 7.5, .0005);
        result = cc.calculateLabor(3.1, 2.5);
        assertEquals(result, 7.75, .0001);
        result = cc.calculateLabor(6.2, 9.4);
        assertEquals(result, 58.28, .0001);
    }
    
    @Test
    public void calculateCostTest(){
        result = cc.calculateCost(7.8, 9.6);
        assertEquals(result, 17.4, .0001);
        result = cc.calculateCost(5.36, 15.001);
        assertEquals(result, 20.361, .000001);
        result = cc.calculateCost(8.94, 14.234);
        assertEquals(result, 23.174,.000000001);
    }
    
    @Test
    public void calculateTaxTest(){
        result = cc.calculateTax(8.45, 9.6);
        assertEquals(result, .8112,.01);
        result = cc.calculateTax(18.6, 1.345);
        assertEquals(result, .2501, .01);
        result = cc.calculateTax(3.45, 7.9);
        assertEquals(result, .2725, .01);
    }
    
    @Test
    public void calculateTotalCostTest(){
        result = cc.calculateTotalCost(1.23, 4.601);
        assertEquals(result, 5.831, .00001);
        result = cc.calculateTotalCost(6.013, 7.84);
        assertEquals(result, 13.853, .0000001);
        result = cc.calculateTotalCost(1.02, 3.04);
        assertEquals(result, 4.06, .0001);
    }
}
