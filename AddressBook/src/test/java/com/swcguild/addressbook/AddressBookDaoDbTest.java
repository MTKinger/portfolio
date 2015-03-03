/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook;

import com.swcguild.addressbook.dao.ContactDao;
import com.swcguild.addressbook.dto.Contact;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author apprentice
 */
public class AddressBookDaoDbTest {

    private ContactDao dao;

    public AddressBookDaoDbTest() {
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
        dao = (ContactDao) ctx.getBean("contactDao");

        JdbcTemplate cleaner = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        cleaner.execute("DELETE FROM addresses");
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
    public void addGetDeleteAddress() {
        Contact testContact = new Contact();
        testContact.setFirstName("Mike");
        testContact.setLastName("King");
        testContact.setStreetAddress("12345");
        testContact.setCity("Philadelphia");
        testContact.setState("PA");
        testContact.setZip("19116");

        dao.addContact(testContact);

        Contact fromDb = dao.getContactById(testContact.getContactId());

        assertEquals(testContact.getFirstName(), fromDb.getFirstName());
        assertEquals(testContact.getLastName(), fromDb.getLastName());
        assertEquals(testContact.getStreetAddress(), fromDb.getStreetAddress());
        assertEquals(testContact.getCity(), fromDb.getCity());
        assertEquals(testContact.getState(), fromDb.getState());
        assertEquals(testContact.getZip(), fromDb.getZip());

        dao.removeContact(testContact.getContactId());

        assertNull(dao.getContactById(testContact.getContactId()));
    }

    @Test
    public void addUpdateAddress() {
        Contact testContact = new Contact();
        testContact.setFirstName("John");
        testContact.setLastName("Doe");
        testContact.setStreetAddress("98765");
        testContact.setCity("Jamison");
        testContact.setState("PA");
        testContact.setZip("18929");

        dao.addContact(testContact);
        testContact.setFirstName("Jonathan");
        testContact.setState("OH");

        dao.updateContact(testContact);

        Contact fromDb = dao.getContactById(testContact.getContactId());

        assertEquals(testContact.getFirstName(), fromDb.getFirstName());
        assertEquals(testContact.getLastName(), fromDb.getLastName());
        assertEquals(testContact.getStreetAddress(), fromDb.getStreetAddress());
        assertEquals(testContact.getCity(), fromDb.getCity());
        assertEquals(testContact.getState(), fromDb.getState());
        assertEquals(testContact.getZip(), fromDb.getZip());
    }

    @Test
    public void getAllAddresses() {
        Contact testContact = new Contact();
        testContact.setFirstName("Tom");
        testContact.setLastName("Jones");
        testContact.setStreetAddress("9797979");
        testContact.setCity("Las Vegas");
        testContact.setState("NV");
        testContact.setZip("75321");

        dao.addContact(testContact);
        
        Contact testContact2 = new Contact();
        testContact2.setFirstName("Chris");
        testContact2.setLastName("Paul");
        testContact2.setStreetAddress("3333333");
        testContact2.setCity("Los Angeles");
        testContact2.setState("CA");
        testContact2.setZip("90210");
        
        dao.addContact(testContact2);
        
        List<Contact> testArray = dao.getAllContacts();
        assertEquals(2, testArray.size());
        
    }
}
