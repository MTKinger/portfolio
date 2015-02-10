/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.masteryproject.daos;

import com.swcguild.masteryproject.dtos.Order;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public interface OrderInterface {

    ArrayList<Order> addOrder(Order newOrder, ArrayList<Order> orderToBeAdded);

    int getCounter();

    //**TESTED**
    int getCurrentOrderSize(ArrayList<Order> orderSizeArray);

    //**TESTED**
    Order getOrder(int slot, ArrayList<Order> getOrderArray);

    //**TESTED**
    Order getOrderByID(int id, ArrayList<Order> currentList);

    ArrayList<Order> getTodaysOrders();

    //**TESTED**
    ArrayList<Order> loadFromFile(String monthDayYear) throws FileNotFoundException;

    void readCounter() throws FileNotFoundException;

    //**TESTED**
    ArrayList<Order> removeOrder(int orderNumber, ArrayList<Order> orderToBeDeleted);

    void writeCounter() throws IOException;

    //**TESTED**
    void writeToFile(ArrayList<Order> orders, String monthDayYear) throws IOException;
    
    void editOrder();
    
}
