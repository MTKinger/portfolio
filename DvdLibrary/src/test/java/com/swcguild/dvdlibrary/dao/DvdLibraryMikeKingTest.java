package com.swcguild.dvdlibrary.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.dvdlibrary.dao.DvdLibraryDao;
import com.swcguild.dvdlibrary.dao.DvdLibraryMikeKing;
import com.swcguild.dvdlibrary.dto.Dvd;
import java.time.LocalDate;
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
public class DvdLibraryMikeKingTest {
    
    DvdLibraryDao dvd = new DvdLibraryMikeKing();
    Dvd test1;
    Dvd test2;
    Dvd test3;
    Dvd test4;
    
    public DvdLibraryMikeKingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        test1 = new Dvd();
        test2 = new Dvd();
        test3 = new Dvd();
        test4 = new Dvd();
        test1.setTitle("Pulp Fiction");
        test1.setReleaseDate(LocalDate.parse("1994-01-01"));
        test1.setMpaaRating("R");
        test1.setDirector("Tarantino");
        test1.setStudio("A Band Apart");
        test1.setNote("violent");
        
        
        test2.setTitle("Jurassic Park");
        test2.setReleaseDate(LocalDate.parse("1993-01-01"));
        test2.setMpaaRating("PG-13");
        test2.setDirector("Speilberg");
        test2.setStudio("Dreamworks");
        test2.setNote("hold on to your butts");
        
        test3.setTitle("Schindler's List");
        test3.setReleaseDate(LocalDate.parse("1995-01-01"));
        test3.setMpaaRating("R");
        test3.setDirector("Speilberg");
        test3.setStudio("Dreamworks");
        test3.setNote("nazis suck");

        
        test4.setTitle("The Incredibles");
        test4.setReleaseDate(LocalDate.parse("2003-01-01"));
        test4.setMpaaRating("PG");
        test4.setDirector("Bird");
        test4.setStudio("Pixar");
        test4.setNote("best pixar movie");
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
    public void addRemoveListAllTest(){
        List<Dvd> testList = dvd.listAll();
        assertEquals(0, testList.size());
        dvd.add(test1);
        testList = dvd.listAll();
        assertEquals(1, testList.size());
        dvd.add(test2);
        testList = dvd.listAll();
        assertEquals(2, testList.size());
        dvd.add(test3);
        testList = dvd.listAll();
        assertEquals(3, testList.size());
        dvd.add(test4);
        testList = dvd.listAll();
        assertEquals(4, testList.size());
        dvd.remove(test4);
        testList = dvd.listAll();
        assertEquals(3, testList.size());
        dvd.remove(test3);
        testList = dvd.listAll();
        assertEquals(2, testList.size());
        dvd.remove(test2);
        testList = dvd.listAll();
        assertEquals(1, testList.size());
        dvd.remove(test1);
        testList = dvd.listAll();
        assertEquals(0, testList.size());
    }
    
    @Test
    public void getByTitleTest(){
        dvd.add(test1);
        dvd.add(test2);
        dvd.add(test3);
        dvd.add(test4);
        List<Dvd> testList = dvd.getByTitle("Pulp Fiction");
        assertEquals("Tarantino", testList.get(0).getDirector());
        testList = dvd.getByTitle("The Incredibles");
        assertEquals("PG", testList.get(0).getMpaaRating());
    }
    
    @Test
    public void getByRatingTest(){
        dvd.add(test1);
        dvd.add(test2);
        dvd.add(test3);
        dvd.add(test4);
        List<Dvd> testList = dvd.getByRating("R");
        assertEquals(2, testList.size());
        testList = dvd.getByRating("PG");
        assertEquals(1, testList.size());
        assertEquals("Bird", testList.get(0).getDirector());
    }
    
    @Test
    public void getByStudioTest(){
        dvd.add(test1);
        dvd.add(test2);
        dvd.add(test3);
        dvd.add(test4);
        List<Dvd> testList = dvd.getByStudio("Dreamworks");
        assertEquals(2, testList.size());
        testList = dvd.getByStudio("A Band Apart");
        assertEquals("violent", testList.get(0).getNote());
    }
}
