/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DTOs.Order;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class OrderManagement implements OrderInterface {

    ArrayList<Order> todayOrders = new ArrayList<>();
    final String DELIMITER = ":::";
    final String ORDER_ = "Order_";

    //**TESTED**
    @Override
    public void writeToFile(ArrayList<Order> orders, String monthDayYear) throws IOException { //will ideally write to any file we want
        String targetFile = ORDER_ + monthDayYear + ".txt";  //can take three parameters from LocalDate of the objecct we adding/editing
        PrintWriter out = new PrintWriter(new FileWriter(targetFile));
        out.println("OrderNumber, CustomerName, State, TaxRate, ProductType, Area, CostPerSquareFoot, LaborCostPerSquareFoot, MaterialCost, LaborCost, Tax, Total, CustomerFirstName, CustomerLastName");
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
                    + currentOrder.getTaxTotal() + DELIMITER
                    + currentOrder.getTotalCost() + DELIMITER
                    + currentOrder.getFirstName() + DELIMITER
                    + currentOrder.getLastName());
            out.flush();
        }
        out.close();
    }

    //**TESTED**
    @Override
    public ArrayList<Order> loadFromFile(String monthDayYear) throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(ORDER_ + monthDayYear + ".txt")));
        String currentLine = sc.nextLine();
        String[] currentTokens;
        ArrayList<Order> ordersFromSelectedDate = new ArrayList<>();
        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            int orderNumber = Integer.parseInt(currentTokens[0]);
            String name = currentTokens[1];
            String state = currentTokens[2];
            double taxRate = Double.parseDouble(currentTokens[3]);
            String productType = currentTokens[4];
            double area = Double.parseDouble(currentTokens[5]);
            double costPSF = Double.parseDouble(currentTokens[6]);
            double laborPSF = Double.parseDouble(currentTokens[7]);
            double materialTotal = Double.parseDouble(currentTokens[8]);
            double laborTotal = Double.parseDouble(currentTokens[9]);
            double taxTotal = Double.parseDouble(currentTokens[10]);
            double totalCost = Double.parseDouble(currentTokens[11]);
            String firstName = currentTokens[12];
            String lastName = currentTokens[13];

            Order currentOrder = new Order(name, productType, area);
            currentOrder.setOrderNumber(orderNumber);
            currentOrder.setState(state);
            currentOrder.setTaxRate(taxRate);
            currentOrder.setCostPSF(costPSF);
            currentOrder.setLaborPSF(laborPSF);
            currentOrder.setMaterialTotal(materialTotal);
            currentOrder.setLaborTotal(laborTotal);
            currentOrder.setTaxTotal(taxTotal);
            currentOrder.setTotalCost(totalCost);
            currentOrder.setFirstName(firstName);
            currentOrder.setLastName(lastName);

            String month = monthDayYear.substring(0, 2);
            String day = monthDayYear.substring(2, 4);
            String year = monthDayYear.substring(4);

            String date = year + "-" + month + "-" + day;
            LocalDate ld = LocalDate.parse(date);

            currentOrder.setDate(ld);

            ordersFromSelectedDate.add(currentOrder);
        }
        sc.close();
        return ordersFromSelectedDate;
    }

    @Override
    public ArrayList<Order> addOrder(Order newOrder, ArrayList<Order> orderToBeAdded) {
        orderToBeAdded.add(newOrder);
        return orderToBeAdded;
    }

    //**TESTED**
    @Override
    public ArrayList<Order> removeOrder(int orderNumber, ArrayList<Order> orderToBeDeleted) {
        int index = 0;
        boolean found = false;
        for (Order currentOrder : orderToBeDeleted) {
            if (currentOrder.getOrderNumber() == orderNumber) {
                index = orderToBeDeleted.indexOf(currentOrder);
                found = true;
            }
        }
        if (found == true) {
            orderToBeDeleted.remove(index);
        }
        return orderToBeDeleted;
    }

    //**TESTED**
    public int getCurrentOrderSize(ArrayList<Order> orderSizeArray) {
        return orderSizeArray.size();
    }

    //**TESTED**
    public Order getOrder(int slot, ArrayList<Order> getOrderArray) {
        return getOrderArray.get(slot);
    }

    //**TESTED**
    public Order getOrderByID(int id, ArrayList<Order> currentList) {
        Order returnOrder = new Order("null", "null", 0.0);
        for (Order currentOrder : currentList) {
            if (id == currentOrder.getOrderNumber()) {
                returnOrder = currentOrder;
            }
        }
        return returnOrder;
    }

    public ArrayList<Order> getTodaysOrders() {
        return todayOrders;
    }

}
