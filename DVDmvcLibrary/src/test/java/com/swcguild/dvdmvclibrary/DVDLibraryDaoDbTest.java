/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.dvdmvclibrary;

import com.swcguild.dvdmvclibrary.dao.DVDLibraryDao;
import com.swcguild.dvdmvclibrary.dto.DVD;
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
public class DVDLibraryDaoDbTest {

    DVDLibraryDao dao;

    public DVDLibraryDaoDbTest() {
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
        dao = (DVDLibraryDao) ctx.getBean("dvdLibraryDao");
        JdbcTemplate cleaner = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        cleaner.execute("DELETE FROM dvds");
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
    public void addGetDeleteDVDTest() {
        DVD testDVD = new DVD();
        testDVD.setDvdId(22);
        testDVD.setTitle("Kingsman");
        testDVD.setReleaseYear("2015");
        testDVD.setRating("R");
        testDVD.setDirector("Vaughn");
        testDVD.setStudio("BBC");
        testDVD.setComments("Way better than I thought it would be...");

        dao.addDVD(testDVD);

        DVD fromDB = dao.getDVDById(testDVD.getDvdId());

        assertEquals(testDVD.getTitle(), fromDB.getTitle());
        assertEquals(testDVD.getReleaseYear(), fromDB.getReleaseYear());
        assertEquals(testDVD.getRating(), fromDB.getRating());
        assertEquals(testDVD.getDirector(), fromDB.getDirector());
        assertEquals(testDVD.getStudio(), fromDB.getStudio());
        assertEquals(testDVD.getComments(), fromDB.getComments());

        dao.removeDVD(testDVD.getDvdId());

        assertNull(dao.getDVDById(testDVD.getDvdId()));
    }

    @Test
    public void addUpdateDVD() {
        DVD testDVD = new DVD();
        testDVD.setDvdId(19);
        testDVD.setTitle("Birdman");
        testDVD.setReleaseYear("2014");
        testDVD.setRating("R");
        testDVD.setDirector("Alexandro");
        testDVD.setStudio("Indy");
        testDVD.setComments("All in one shot");

        dao.addDVD(testDVD);

        testDVD.setRating("G");
        testDVD.setReleaseYear("1985");
        testDVD.setDirector("Keaton");

        dao.editDVD(testDVD);

        DVD fromDB = dao.getDVDById(testDVD.getDvdId());

        assertEquals(testDVD.getDirector(), fromDB.getDirector());
        assertEquals(testDVD.getRating(), fromDB.getRating());
        assertEquals(testDVD.getReleaseYear(), fromDB.getReleaseYear());
    }

    @Test
    public void getAllDVDs() {
        DVD testDVD = new DVD();
        testDVD.setDvdId(19);
        testDVD.setTitle("Birdman");
        testDVD.setReleaseYear("2014");
        testDVD.setRating("R");
        testDVD.setDirector("Alexandro");
        testDVD.setStudio("Indy");
        testDVD.setComments("All in one shot");
        
        dao.addDVD(testDVD);
        
        DVD testDVD2 = new DVD();
        testDVD2.setDvdId(7);
        testDVD2.setTitle("Animal House");
        testDVD2.setReleaseYear("1978");
        testDVD2.setRating("PG-13");
        testDVD2.setDirector("Landis");
        testDVD2.setStudio("National Lampoon");
        testDVD2.setComments("TOGA!");
        
        dao.addDVD(testDVD2);
        
        List<DVD> testArray = dao.getAllDVD();
        assertEquals(2, testArray.size());
    }
}
