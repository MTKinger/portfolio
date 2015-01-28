/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DTOs.Order;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
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
public class OrderManagementTest {
    
    OrderManagement om = new OrderManagement();
    Order testOrder = new Order("Mike", "Wood", 10);
    Order testOrder2 = new Order("Sam", "Tile", 20);
    ArrayList<Order> testArray = new ArrayList<Order>();
    
    
    public OrderManagementTest() {
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
    public void addRemoveCurrentOrderTest(){
        assertEquals(om.getCurrentOrderSize(),0);
        om.addOrder(testOrder);
        assertEquals(om.getCurrentOrderSize(),1);
        assertEquals(testOrder.getCustomerName(), om.getOrder(0).getCustomerName());
        testOrder.setOrderNumber(2);
        om.removeOrder(3);
        assertEquals(om.getCurrentOrderSize(),1);
        om.removeOrder(2);
        assertEquals(om.getCurrentOrderSize(),0);
    }

    @Test
    public void readWriteTest()throws IOException, FileNotFoundException{
        testArray.add(testOrder);
        testArray.add(testOrder2);
        om.writeToFile(testArray, "12", "03", "1995");
        ArrayList<Order> testRead = om.loadFromFile("12", "03", "1995");
        assertEquals(testArray.get(0).getCustomerName(), testRead.get(0).getCustomerName());
        assertEquals(testArray.get(1).getArea(), testRead.get(1).getArea(), .0001);
    }
    
    @Test
    public void getOrderByIDTest(){
        testOrder.setOrderNumber(123);
        testOrder2.setOrderNumber(987);
        ArrayList<Order> testId = new ArrayList<Order>();
        testId.add(testOrder);
        testId.add(testOrder2);
        Order testOrder3 = om.getOrderByID(123, testId);
        Order testOrder4 = om.getOrderByID(987, testId);
        assertEquals(testOrder3.getCustomerName(), "Mike");
        assertEquals(testOrder4.getArea(), 20, .00001);
        
    }
}
