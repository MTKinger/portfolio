package BuisnessLogic;

import DAOs.OrderManagement;
import DAOs.ProductManagement;
import DAOs.TaxManagement;
import DTOs.Order;
import UI.ConsoleIO;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class ManagementController {

    ConsoleIO cio = new ConsoleIO();
    int menuChoice;
    TaxManagement tm = new TaxManagement();
    ProductManagement pm = new ProductManagement();
    OrderManagement om = new OrderManagement();
    CostCalculator calc = new CostCalculator();
    private int counter = 1;

    public void run() throws FileNotFoundException {
        doMenu();
    }

    private void doMenu() throws FileNotFoundException {
        do {
            printMenu();
            menuChoice = cio.getInt("Please make a selection from the above choices:", 1, 6);
            switch (menuChoice) {
                case 1:
                    displayOrders();
                    break;
                case 2:
                    addOrder();
                    break;
                case 3:
                    editOrder();
                    break;
                case 4:
                    removeOrder();
                    break;
                case 5:
                    // saveCurrentWork();
                    break;
                case 6:
                    // exit();
                    break;
                default:
                    cio.printMessage("Please enter a valid menu choice!\n");
                    break;
            }
        } while (menuChoice != 6);
        cio.printMessage("\n\nThank you for chosing SWC Corp...");
    }

    private void printMenu() {
        cio.printMessage("\n\n***************************************************");
        cio.printMessage("*\tSWC Corp. Flooring Program");
        cio.printMessage("*");
        cio.printMessage("* 1. Display Orders");
        cio.printMessage("* 2. Add an Order");
        cio.printMessage("* 3. Edit an Order");
        cio.printMessage("* 4. Remove an Order");
        cio.printMessage("* 5. Save Current Work");
        cio.printMessage("* 6. Quit");
        cio.printMessage("*");
        cio.printMessage("***************************************************\n\n");
    }

    private void addOrder() throws FileNotFoundException {
        tm.loadFromFile();
        pm.loadFromFile();
        boolean badDate = false;
        String userName = cio.getString("Who placed the order?");
        double area = cio.getDouble("What's the area of the order, in square feet");
        String state = "";
        String productType = "";

        boolean stateCheck = false;
        do {
            state = cio.getString("What is the two letter code of the state in which the order is being placed?").toUpperCase();
            ArrayList<String> allStates = tm.getStates();
            for (String currentState : allStates) {
                if (state.equals(currentState)) {
                    stateCheck = true;
                }
            }
        } while (stateCheck == false);

        boolean productCheck = false;
        do {
            productType = cio.getString("What is the product type of the order?");
            ArrayList<String> allTypes = pm.getAllProductTypes();
            for (String currentProduct : allTypes) {
                if (productType.equalsIgnoreCase(currentProduct)) {
                    productCheck = true;
                }
            }
        } while (productCheck == false);
        LocalDate ld = LocalDate.now();
        do {
            try {
                String year = cio.getString("Please enter the year you would like the order to be processed (YYYY)");
                String month = cio.getString("Please enter the month you would like the order to be processed (MM)");
                String day = cio.getString("Please enter the day of month you would like the order to be processed (DD)");
                String date = year + "-" + month + "-" + day;
                ld = LocalDate.parse(date); //THIS IS WHERE WE CHECK IF CURRENT DATE
                badDate = false;
            } catch (DateTimeParseException dtpe) {
                cio.printMessage("Invalid date entered. Please enter a valid date.");
                badDate = true;
            }
        } while (badDate == true);
        Order currentOrder = new Order(userName, productType, area);
        currentOrder.setDate(ld);
        currentOrder.setLaborTotal(calc.calculateLabor(area, pm.getLaborPerSquareFoot(productType)));
        currentOrder.setMaterialTotal(calc.calculateMaterial(area, pm.getCostPerSquareFoot(productType)));
        double cost = calc.calculateCost(currentOrder.getLaborTotal(), currentOrder.getMaterialTotal());
        currentOrder.setTaxTotal(calc.calculateTax(cost, tm.getTaxRate(state)));
        currentOrder.setTaxRate(tm.getTaxRate(state));
        currentOrder.setTotalCost(calc.calculateTotalCost(currentOrder.getTaxTotal(), cost));
        currentOrder.setLaborPSF(pm.getLaborPerSquareFoot(productType));
        currentOrder.setCostPSF(pm.getCostPerSquareFoot(productType));
        currentOrder.setOrderNumber(counter);
        currentOrder.setState(state);

        cio.printMessage("Please review your submitted order:\n\n");
        cio.printMessage(currentOrder.orderToString());
        int approved = cio.getInt("\nAre you sure you would like to submit this order? (press 1 for yes, 2 for no)", 1, 2);

        if (approved == 1) {
            om.addOrder(currentOrder);
            cio.printMessage("\nYour order has been processed. Thank you.");
            counter++;
        } else {
            cio.printMessage("\nYour order will not be processed.");
        }
    }

    private void displayOrders() {
        ArrayList<Order> toDisplay = om.displayOrders("date");
        for (Order currentOrder : toDisplay) {
            cio.printMessage("\n" + currentOrder.orderToString());
        }
    }

    private void removeOrder() {
        String year = cio.getString("Please enter the year for the order you wish to remove (YYYY) ");
        String month = cio.getString("Please enter the month for the order you wish to remove (MM) ");
        String day = cio.getString("Please enter the day of month for the order you wish to remove (DD)");
        String date = year + month + day;
        Order foundOrder = new Order("null", "null", 0.0);
        int orderNumber = cio.getInt("Please enter the order ID# for the order you wish to remove");
        foundOrder = om.getOrderByID(orderNumber);
        while (foundOrder.getCustomerName().equalsIgnoreCase("null")) {
            orderNumber = cio.getInt("Error: No such Order ID# has been found. Please enter a valid ID#");
            foundOrder = om.getOrderByID(orderNumber);
        }
        cio.printMessage(foundOrder.orderToString());

        int approved = cio.getInt("\nAre you sure you would like to delete this order? (press 1 for yes, 2 for no)", 1, 2);
        if (approved == 1) {
            om.removeOrder(orderNumber);
            cio.printMessage("\nYour order has been deleted. Thank you.");
        } else {
            cio.printMessage("\nYour order will not be deleted.");
        }
    }

    private void editOrder() {
        boolean badDouble = false;
        boolean badDate = false;
        String year = cio.getString("Please enter the year for the order you wish to edit (YYYY) ");
        String month = cio.getString("Please enter the month for the order you wish to edit (MM) ");
        String day = cio.getString("Please enter the day of month for the order you wish to edit (DD)");
        String date = year + month + day;
        Order foundOrder = new Order("null", "null", 0.0);
        int orderNumber = cio.getInt("Please enter the order ID# for the order you wish to edit");
        foundOrder = om.getOrderByID(orderNumber);
        Order editedOrder = new Order("", "", 0);
        while (foundOrder.getCustomerName().equalsIgnoreCase("null")) {
            orderNumber = cio.getInt("Error: No such Order ID# has been found. Please enter a valid ID#");
            foundOrder = om.getOrderByID(orderNumber);
        }
        cio.printMessage(foundOrder.orderToString());

        String newName = cio.getString("Enter customer name (" + foundOrder.getCustomerName() + ") :");
        if (!newName.equalsIgnoreCase("")) {
            editedOrder.setCustomerName(newName);
        } else {
            editedOrder.setCustomerName(foundOrder.getCustomerName());
        }

        do {
            try {
                String newArea = cio.getString("Please enter the new area (" + foundOrder.getArea() + ") :");
                if (!newArea.equalsIgnoreCase("")) {
                    double newArea1 = Double.parseDouble(newArea);
                    editedOrder.setArea(newArea1);
                    badDouble = false;
                }
            } catch (NumberFormatException nfe) {
                cio.printMessage("Please enter a valid area.");
                badDouble = true;
            }
        } while (badDouble == true);

        String newProduct = cio.getString("Please enter the product type (" + foundOrder.getProductType() + ") :");
        if (!newProduct.equalsIgnoreCase("")) {

            boolean productCheck = false;
            ArrayList<String> allTypes = pm.getAllProductTypes();
            for (String currentProduct : allTypes) {
                if (newProduct.equalsIgnoreCase(currentProduct)) {
                    productCheck = true;
                }
            }
            while (productCheck == false) {
                newProduct = cio.getString("No such product found. Please enter a valid product type.");
                for (String currentProduct1 : allTypes) {

                    if (newProduct.equalsIgnoreCase(currentProduct1)) {
                        productCheck = true;
                    }
                }
            }
            editedOrder.setProductType(newProduct);
        } else {
            editedOrder.setProductType(foundOrder.getProductType());
        }

        do {
            try {
                String newYear = cio.getString("Please enter the year you would like your order to be processed ("
                        + foundOrder.getDate().getYear() + ") (YYYY):");
                String newMonth = cio.getString("Please enter the month you would like your order to be processed ("
                        + foundOrder.getDate().getMonthValue() + ") (MM):");
                String newDay = cio.getString("Please enter the day of month you would like your order to be processed ("
                        + foundOrder.getDate().getDayOfMonth() + ") (DD):");
                String newDate;

                // ****Requires Catches to protect against bad input****
                if (!newYear.equalsIgnoreCase("")) {
                    newDate = newYear + "-";
                } else {
                    newDate = foundOrder.getDate().getYear() + "-";
                }
                if (!newMonth.equalsIgnoreCase("")) {
                    newDate = newDate + newMonth + "-";
                } else {
                    if (foundOrder.getDate().getMonthValue() > 9) {
                        newDate = newDate + foundOrder.getDate().getMonth() + "-";
                    } else {
                        newDate = newDate + "0" + foundOrder.getDate().getMonthValue() + "-";
                    }
                }
                if (!newDay.equalsIgnoreCase("")) {
                    newDate = newDate + newDay;
                } else {
                    if (foundOrder.getDate().getDayOfMonth() > 9) {
                        newDate = newDate + foundOrder.getDate().getDayOfMonth();
                    } else {
                        newDate = newDate + "0" + foundOrder.getDate().getDayOfMonth();
                    }
                }
                editedOrder.setDate(LocalDate.parse(newDate));
                badDate = false;

            } catch (DateTimeParseException dtpe) {
                cio.printMessage("Date entered is invalid.  Please enter a valid date.\n");
                badDate = true;
            }
        } while (badDate == true);

        // This is where we will add the section to change the state if necessary.
        // do not want to start on this until we get the product type sorted out.
        String newState = cio.getString("Please enter the state (" + foundOrder.getState() + ") :");
        if (!newState.equalsIgnoreCase("")) {

            boolean stateCheck = false;
            ArrayList<String> allStates = tm.getStates();
            for (String currentState : allStates) {
                if (newState.equalsIgnoreCase(currentState)) {
                    stateCheck = true;
                }
            }
            while (stateCheck == false) {
                newState = cio.getString("No such state found. Please enter a valid state.");
                for (String currentState1 : allStates) {
                    if (newState.equalsIgnoreCase(currentState1)) {
                        stateCheck = true;
                    }
                }
            }
            editedOrder.setState(newState);
        } else {
            editedOrder.setState(foundOrder.getState());
        }
        editedOrder.setCostPSF(pm.getCostPerSquareFoot(editedOrder.getProductType()));
        editedOrder.setLaborPSF(pm.getLaborPerSquareFoot(editedOrder.getProductType()));
        editedOrder.setLaborTotal(calc.calculateLabor(editedOrder.getArea(), pm.getLaborPerSquareFoot(editedOrder.getProductType())));
        editedOrder.setMaterialTotal(calc.calculateMaterial(editedOrder.getArea(), pm.getCostPerSquareFoot(editedOrder.getProductType())));
        editedOrder.setTaxRate(tm.getTaxRate(editedOrder.getState()));
        double cost = calc.calculateCost(editedOrder.getLaborTotal(), editedOrder.getMaterialTotal());
        editedOrder.setTaxTotal(calc.calculateTax(cost, tm.getTaxRate(editedOrder.getState())));
        editedOrder.setTotalCost(calc.calculateTotalCost(editedOrder.getTaxTotal(), cost));
        editedOrder.setOrderNumber(foundOrder.getOrderNumber());

        cio.printMessage("Please review your edited order:\n\n");
        cio.printMessage(editedOrder.orderToString());
        int approved = cio.getInt("\nAre you sure you would like to submit this edited order? (press 1 for yes, 2 for no)", 1, 2);

        if (approved == 1) {
            om.removeOrder(foundOrder.getOrderNumber());
            om.addOrder(editedOrder);
            cio.printMessage("\nYour order has been changed. Thank you.");
        } else {
            cio.printMessage("\nYour order will not be changed.");
        }

    }
}
