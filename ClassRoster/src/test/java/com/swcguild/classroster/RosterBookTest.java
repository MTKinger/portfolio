/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.classroster;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class RosterBookTest {
    
    public RosterBookTest() {
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
    public void AddEditRemoveStudent(){
        RosterBook book = new RosterBook();
        
        Student st = new Student("0");
        st.setFirstName("John");
        st.setLastName("Doe");
        st.setCohort("Java-Jan 2015");
        
        book.addStudent(st.getStudentId(),st );
        
        ArrayList<String> studentIds = book.getAllStudentIds();
        
        assertEquals(studentIds.size(),1);
        assertEquals(studentIds.get(0), "0");
        
        Student fromBook = book.getStudent("0");
        assertEquals(st,fromBook);
        
        book.removeStudent("0");
        fromBook = book.getStudent("0");
        assertNull(fromBook);
    }
}
