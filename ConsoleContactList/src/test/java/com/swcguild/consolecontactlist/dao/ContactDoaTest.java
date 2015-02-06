/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.consolecontactlist.dao;

import com.swcguild.consolecontactlist.dto.Contact;
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
public class ContactDoaTest {
    
    ContactDao dao;
    
    public ContactDoaTest() {
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
        dao = ctx.getBean("contactDao", ContactDao.class);
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
    public void addGetTest(){
        Contact testContact = new Contact();
        testContact.setFirstName("John");
        testContact.setLastName("Doe");
        testContact.seteMail("jdoe@doe.com");
        
        dao.add(testContact);
        
        Contact fromDao = dao.getContactById(testContact.getContactId());
        
        assertEquals(testContact, fromDao);
    }
}
