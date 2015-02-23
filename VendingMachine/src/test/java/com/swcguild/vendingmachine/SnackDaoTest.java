/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.vendingmachine;

import com.swcguild.vendingmachine.dao.SnackDao;
import com.swcguild.vendingmachine.dto.Snack;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class SnackDaoTest {
    
    SnackDao dao;
    
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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        dao = ctx.getBean("snackDao", SnackDao.class);
        
        Snack testSnack1 = new Snack();
        testSnack1.setSnackName("Oreo");
        testSnack1.setSnackPrice(150);
        testSnack1.setSnackRemaining(12);
        
        Snack testSnack2 = new Snack();
        testSnack2.setSnackName("Doritos");
        testSnack2.setSnackPrice(75);
        testSnack2.setSnackRemaining(7);
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
    public void addGetDeleteTest(){
        Snack testSnack1 = new Snack();
        testSnack1.setSnackName("Oreo");
        testSnack1.setSnackPrice(150);
        testSnack1.setSnackRemaining(12);
        
        Snack testSnack2 = new Snack();
        testSnack2.setSnackName("Doritos");
        testSnack2.setSnackPrice(75);
        testSnack2.setSnackRemaining(7);
        
        dao.addSnack(testSnack1);
        Snack newSnack = dao.getSnackByName(testSnack1.getSnackName());
        assertEquals(newSnack, testSnack1);
        dao.deleteSnack(testSnack1.getSnackName());
        Snack newerSnack = dao.getSnackByName(testSnack1.getSnackName());
        assertEquals(11, newerSnack.getSnackRemaining());
    }
    
    @Test
    public void updateSnackTest(){
        Snack testSnack1 = new Snack();
        testSnack1.setSnackName("Oreo");
        testSnack1.setSnackPrice(150);
        testSnack1.setSnackRemaining(12);
        
        Snack testSnack2 = new Snack();
        testSnack2.setSnackName("Doritos");
        testSnack2.setSnackPrice(75);
        testSnack2.setSnackRemaining(7);
        
        dao.addSnack(testSnack1);
        dao.addSnack(testSnack2);
        testSnack2.setSnackRemaining(25);
        dao.updateSnack(testSnack2);
        Snack newSnack = dao.getSnackByName(testSnack2.getSnackName());
        assertEquals(25, newSnack.getSnackRemaining());
    }
    
    
}
