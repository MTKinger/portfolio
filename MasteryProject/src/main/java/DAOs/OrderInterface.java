/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DTOs.Order;
import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public interface OrderInterface {
    
    public void writeToFile();
    public void loadFromFile();
    public ArrayList<Order> displayOrders(String monthDayYear);
    public ArrayList<Order> addOrder(Order newOrder);
    public ArrayList<Order> removeOrder(int orderNumber);
    
}
