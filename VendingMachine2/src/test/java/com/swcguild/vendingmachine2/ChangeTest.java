/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.vendingmachine2;

import com.swcguild.vendingmachine2.dao.ChangeDao;
import com.swcguild.vendingmachine2.dao.ChangeDaoInMemImpl;
import com.swcguild.vendingmachine2.dto.Change;
import com.swcguild.vendingmachine2.dto.Snack;
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
public class ChangeTest {
    
    ChangeDao dao = new ChangeDaoInMemImpl();
    
    public ChangeTest() {
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
    public void makeChangeTest(){
        Change testChange1 = new Change();
        Snack testSnack1 = new Snack();
        testChange1.setTotalChange(1.50);
        testSnack1.setSnackPrice(0.72);
        dao.makeChange(testChange1, testSnack1);
        assertEquals(3, testChange1.getQuarters());
        assertEquals(3, testChange1.getPennies());
        testChange1.setQuarters(0);
        testChange1.setPennies(0);
        testChange1.setTotalChange(2.28);
        testSnack1.setSnackPrice(1.34);
        dao.makeChange(testChange1, testSnack1);
        assertEquals(3, testChange1.getQuarters());
        assertEquals(3, testChange1.getPennies());
        assertEquals(1, testChange1.getDimes());
        assertEquals(1, testChange1.getNickles());
    }
}
