/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.drillstest;

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
public class GreatPartyTest {

    GreatParty gp = new GreatParty();      // can instantiate the class at class level
    boolean result;

    public GreatPartyTest() {
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
    public void greatPartyTest() {                //creates test method
        result = gp.greatParty(39, true);
        assertFalse(result);                      //makes sure result is desired outcome.
        result = gp.greatParty(40, true);
        assertTrue(result);
        result = gp.greatParty(80, true);
        assertTrue(result);
        result = gp.greatParty(39, false);
        assertFalse(result);
        result = gp.greatParty(40, false);
        assertTrue(result);
        result = gp.greatParty(50, false);
        assertTrue(result);
        result = gp.greatParty(60, false);
        assertTrue(result);
        result = gp.greatParty(65, false);
        assertFalse(result);

    }

    @Test
    public void greatParty50False() {
        result = gp.greatParty(50, false);
        assertTrue(result);
    }
}
