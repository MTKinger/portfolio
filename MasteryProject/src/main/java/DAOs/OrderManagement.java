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
public class OrderManagement implements OrderInterface {

    ArrayList<Order> todayOrders = new ArrayList<>();
    final String DELIMITER = ":::";

    @Override
    public void writeToFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loadFromFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Order> displayOrders(String monthDayYear) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Order> addOrder(Order newOrder, String monthDayYear) {
        todayOrders.add(newOrder);
        return todayOrders;
    }

    @Override
    public ArrayList<Order> removeOrder(String monthDayYear, int orderNumber) {
        int index = 0;
        boolean found = false;
        for (Order currentOrder : todayOrders) {
            if (currentOrder.getOrderNumber() == orderNumber) {
                index = todayOrders.indexOf(currentOrder);
                found = true;
            }
        }
        if (found == true) {
            todayOrders.remove(index);
        }
        return todayOrders;
    }

    @Override
    public Order editOrder(String monthDayYear, int orderNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCurrentOrderSize() {
        return todayOrders.size();
    }

    public Order getOrder(int slot) {
        return todayOrders.get(slot);
    }

}
