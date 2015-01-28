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

/**
 *
 * @author apprentice
 */
public interface OrderInterface{
    
    public void writeToFile(ArrayList<Order> orders, String monthDayYear) throws IOException;
    public ArrayList<Order> loadFromFile(String monthDayYear) throws FileNotFoundException;
    public ArrayList<Order> displayOrders(String monthDayYear);
    public ArrayList<Order> addOrder(Order newOrder, ArrayList<Order> orderToBeAdded);
    public ArrayList<Order> removeOrder(int orderNumber, ArrayList<Order> orderToBeDeleted);
    
}
