/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.vendingmachine2;

import com.swcguild.vendingmachine2.dao.SnackDao;
import com.swcguild.vendingmachine2.dao.SnackDaoInMemImpl;
import com.swcguild.vendingmachine2.dto.Snack;
import java.util.List;
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
public class SnackDaoTest {
    
    SnackDao dao = new SnackDaoInMemImpl();
    
    public SnackDaoTest() {
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
    public void addGetRemoveTest(){
        assertEquals("Snickers", dao.getSnackById(1).getSnackName());
        List<Snack> testArray = dao.getAllSnacks();
        assertEquals(9, testArray.size());
        Snack testSnack = new Snack();
        testSnack.setSnackId(10);
        testSnack.setSnackName("Testing");
        dao.addSnack(testSnack);
        assertEquals("Testing", dao.getSnackById(10).getSnackName());
        testArray = dao.getAllSnacks();
        assertEquals(10, testArray.size());
        assertEquals(0.60, dao.getSnackPrice(9), .001);
    }
}
