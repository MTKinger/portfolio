/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DTOs.Order;
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
    
    
    
}
