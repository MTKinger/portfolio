package com.swcguild.largenumbers.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class CalculatorImplTest {

    CalculatorImpl calc = new CalculatorImpl();

    public CalculatorImplTest() {
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
    public void addTest(){
        assertEquals("941", calc.add("354+587"));
        assertEquals("1241", calc.add("654+587"));
        assertEquals("1724", calc.add("981+743"));
        assertEquals("2225", calc.add("1374+851"));
        assertEquals("2566012", calc.add("1983+2564029"));
        assertEquals("10766181", calc.add("8675309+2090872"));
    }
}
