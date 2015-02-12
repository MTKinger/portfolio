/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

import DataAccessObject.DVDLabDao;
import DataAccessObject.DVDLabImpl;
import com.swcguild.dvdlibrary.dto.DVD;
import java.time.LocalDate;
import java.util.ArrayList;
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
public class DVDLabDaoTest {
    
    DVDLabDao dvd = new DVDLabImpl();
    DVD test1;
    DVD test2;
    DVD test3;
    DVD test4;
    
    public DVDLabDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        test1 = new DVD(123);
        test2 = new DVD(456);
        test3 = new DVD(789);
        test4 = new DVD(311);
        test1.setTitle("Pulp Fiction");
        test1.setReleaseDate(LocalDate.parse("1994-01-01"));
        test1.setRating("R");
        test1.setDirector("Tarantino");
        ArrayList<String> test1Comments = new ArrayList<>();
        test1Comments.add("violent");
        test1Comments.add("funny");
        test1Comments.add("good soundtrack");
        test1Comments.add("oscar nominee");
        test1Comments.add("royale with cheese...");
        test1.setComments(test1Comments);
        
        test2.setTitle("Jurassic Park");
        test2.setReleaseDate(LocalDate.parse("1993-01-01"));
        test2.setRating("PG-13");
        test2.setDirector("Speilberg");
        test2.setStudio("Dreamworks");
        ArrayList<String> testComments2 = new ArrayList<>();
        testComments2.add("clever girl...");
        testComments2.add("hold on to your butts");
        test2.setComments(testComments2);
        
        test3.setTitle("Schindler's List");
        test3.setReleaseDate(LocalDate.parse("1995-01-01"));
        test3.setRating("R");
        test3.setDirector("Speilberg");
        test3.setStudio("Dreamworks");
        ArrayList<String> testComments3 = new ArrayList<>();
        testComments3.add("very sad");
        testComments3.add("oscar nominee");
        testComments3.add("ben kingsly's best worlk");
        testComments3.add("nazis suck");
        test3.setComments(testComments3);
        
        test4.setTitle("The Incredibles");
        test4.setReleaseDate(LocalDate.parse("2003-01-01"));
        test4.setRating("PG");
        test4.setDirector("Bird");
        test4.setStudio("Pixar");
        ArrayList<String> testComments4 = new ArrayList<>();
        testComments4.add("best pixar movie");
        test4.setComments(testComments4);
        
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
        assertEquals(0, dvd.getLibrarySize());
        dvd.addDVD(test1);
        assertEquals(1, dvd.getLibrarySize());
        DVD actualResult = dvd.getDVD(test1.getDvdID());
        assertEquals(test1, actualResult);
        dvd.removeDVD(test1.getDvdID());
        assertEquals(0, dvd.getLibrarySize());
    }
    
    @Test
    public void updateTest(){
        dvd.addDVD(test1);
        test1.setRating("G");
        DVD actualResult = dvd.getDVD(test1.getDvdID());
        assertEquals("G", actualResult.getRating());
        test1.setRating("NC-17");
        actualResult = dvd.getDVD(test1.getDvdID());
        assertEquals("NC-17", actualResult.getRating());
    }
    
    @Test
    public void getAllDVDTest(){
        dvd.addDVD(test1);
        List<DVD> test = dvd.getAllDVD();
        assertEquals(1, test.size());
        dvd.addDVD(test2);
        dvd.addDVD(test3);
        test = dvd.getAllDVD();
        assertEquals(3, test.size());
        dvd.addDVD(test4);
        test = dvd.getAllDVD();
        assertEquals(4, test.size());
    }
    
    @Test
    public void getDVDByReleaseDateTest(){
        dvd.addDVD(test1);
        dvd.addDVD(test2);
        dvd.addDVD(test3);
        dvd.addDVD(test4);
        List<DVD> test = dvd.getDVDByReleaseDate(15);
        assertEquals(3, test.size());
        test = dvd.getDVDByReleaseDate(20);
        assertEquals(2, test.size());
        test = dvd.getDVDByReleaseDate(25);
        assertEquals(0, test.size());
    }
    
    @Test
    public void getDVDByRatingTest(){
        dvd.addDVD(test1);
        dvd.addDVD(test2);
        dvd.addDVD(test3);
        dvd.addDVD(test4);
        List<DVD> test = dvd.getDVDByMPAA("R");
        assertEquals(2, test.size());
        test4.setRating("R");
        dvd.updateDVD(test4);
        test = dvd.getDVDByMPAA("R");
        assertEquals(3, test.size());
    }
    
    
    
    
}
