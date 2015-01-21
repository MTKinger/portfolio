/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbooklab;

import java.io.IOException;
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
public class AddressBookTest {

    public AddressBookTest() {
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
    public void addressBookTest() throws IOException {
        AddressBook ab = new AddressBook();
        House testHouse = new House("King");
        testHouse.setFirstName("Mike");
        testHouse.setStreetAddress("401 South Main St.");
        testHouse.setCity("Akron");
        testHouse.setState("OH");
        testHouse.setZip("44311");

        ab.addHouse("King", testHouse);

        ab.writeAddressBook();

        AddressBook ab1 = new AddressBook();

        ab1.loadAddressBook();

        //assertEquals(ab.getHouse("King"), ab1.getHouse("King"));
    }
}
