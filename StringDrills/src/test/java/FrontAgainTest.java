/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.swcguild.stringdrills.FrontAgain;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class FrontAgainTest {
    
    FrontAgain fa = new FrontAgain();
    boolean result;
    
    public FrontAgainTest() {
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
    public void frontAgainTest(){
        result = fa.frontAgain("edited");
        assertTrue(result);
        result = fa.frontAgain("edit");
        assertFalse(result);
        result = fa.frontAgain("ed");
        assertFalse(result);
        result = fa.frontAgain("editorialized");
        assertTrue(result);
        
    }
}
