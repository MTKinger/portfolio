/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DTOs.Order;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public class OrderManagement implements OrderInterface {

    ArrayList<Order> todayOrders = new ArrayList<>();
    final String DELIMITER = ":::";
    final String ORDER_ = "Order_";

    @Override
    public void writeToFile(ArrayList<Order> orders,String month, String day, String year) throws IOException { //will ideally write to any file we want
        String targetFile = ORDER_ + month + day + year + ".txt";                       //can take three parameters from LocalDate of the objecct we adding/editing
        PrintWriter out = new PrintWriter(new FileWriter(targetFile));
        out.println("OrderNumber, CustomerName, State, TaxRate, ProductType, Area, CostPerSquareFoot, LaborCostPerSquareFoot, MaterialCost, LaborCost, Tax, Total");
        for (Order currentOrder : orders) {
            out.println(currentOrder.getOrderNumber() + DELIMITER
                    + currentOrder.getCustomerName() + DELIMITER
                    + currentOrder.getState() + DELIMITER
                    + currentOrder.getTaxRate() + DELIMITER
                    + currentOrder.getProductType() + DELIMITER
                    + currentOrder.getArea() + DELIMITER
                    + currentOrder.getCostPSF() + DELIMITER
                    + currentOrder.getLaborPSF() + DELIMITER
                    + currentOrder.getMaterialTotal() + DELIMITER
                    + currentOrder.getLaborTotal() + DELIMITER
                    + currentOrder.getTaxRate() + DELIMITER
                    + currentOrder.getTotalCost());
            out.flush();
        }
        out.close();
    }

    @Override
    public void loadFromFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Order> displayOrders(String monthDayYear) {
        return todayOrders;
        }

    @Override
    public ArrayList<Order> addOrder(Order newOrder) {
        todayOrders.add(newOrder);
        return todayOrders;
    }

    @Override
    public ArrayList<Order> removeOrder(int orderNumber) {
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

    public int getCurrentOrderSize() {
        return todayOrders.size();
    }

    public Order getOrder(int slot) {
        return todayOrders.get(slot);
    }
    
    public Order getOrderByID(int id){
        Order returnOrder = new Order("null", "null" , 0.0);
        for(Order currentOrder: todayOrders){
            if(id == currentOrder.getOrderNumber()){
                returnOrder = currentOrder;
            }
        }
        return returnOrder;
    }

}
