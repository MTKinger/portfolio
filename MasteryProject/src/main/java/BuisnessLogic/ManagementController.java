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

    String defaultDate = localDateToStringToday();

    public void run() throws FileNotFoundException {
        doMenu();
    }

    private void doMenu() throws FileNotFoundException {
        do {
            printMenu();
            menuChoice = cio.getInt("Please make a selection from the above choices:", 1, 7);
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
                    changeDate();
                    break;
                case 7:
                    //exit();
                    break;
                default:
                    cio.printMessage("Please enter a valid menu choice!\n");
                    break;
            }
        } while (menuChoice != 7);
        cio.printMessage("\n\nThank you for chosing SWC Corp...");
    }

    private void printMenu() {
        cio.printMessage("\n\n***************************************************");
        cio.printMessage("*\tSWC Corp. Flooring Program");
        cio.printMessage("*");
        cio.printMessage("*\t\tDate:" + defaultDate);
        cio.printMessage("*");
        cio.printMessage("* 1. Display Orders");
        cio.printMessage("* 2. Add an Order");
        cio.printMessage("* 3. Edit an Order");
        cio.printMessage("* 4. Remove an Order");
        cio.printMessage("* 5. Save Current Work");
        cio.printMessage("* 6. Switch Date");
        cio.printMessage("* 7. Quit");
        cio.printMessage("*");
        cio.printMessage(defaultDateToString());
        cio.printMessage("***************************************************\n\n");
    }

    private void addOrder() throws FileNotFoundException {
        tm.loadFromFile();
        pm.loadFromFile();
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
            if (stateCheck == false) {
                cio.printMessage("\nThe state you have entered is not in out database.  Please enter a valid state.\n");
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
            if (productCheck == false) {
                cio.printMessage("\nThis product is not in our database.  Please enter a new product.\n");
            }
        } while (productCheck == false);

        
        Order currentOrder = new Order(userName, productType, area);
        currentOrder.setDate(giveLocalDate());
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
        Order foundOrder = new Order("null", "null", 0.0);
        int orderNumber = cio.getInt("Please enter the order ID# for the order you wish to remove");
        foundOrder = om.getOrderByID(orderNumber, om.getTodaysOrders());
        while (foundOrder.getCustomerName().equalsIgnoreCase("null")) {
            orderNumber = cio.getInt("Error: No such Order ID# has been found. Please enter a valid ID#");
            foundOrder = om.getOrderByID(orderNumber, om.getTodaysOrders());
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
        Order foundOrder = new Order("null", "null", 0.0);
        int orderNumber = cio.getInt("Please enter the order ID# for the order you wish to edit");
        foundOrder = om.getOrderByID(orderNumber, om.getTodaysOrders());
        Order editedOrder = new Order("", "", 0);
        while (foundOrder.getCustomerName().equalsIgnoreCase("null")) {
            orderNumber = cio.getInt("\nError: No such Order ID# has been found. Please enter a valid ID#");
            foundOrder = om.getOrderByID(orderNumber, om.getTodaysOrders());
        }
        cio.printMessage("\n\n" + foundOrder.orderToString());

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
                } else {
                    editedOrder.setArea(foundOrder.getArea());
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

                if (!newYear.equalsIgnoreCase("")) {
                    newDate = newYear + "-";
                } else {
                    newDate = foundOrder.getDate().getYear() + "-";
                }
                if (!newMonth.equalsIgnoreCase("")) {
                    newDate = newDate + newMonth + "-";
                } else {
                    if (foundOrder.getDate().getMonthValue() > 9) {
                        newDate = newDate + foundOrder.getDate().getMonthValue() + "-";
                    } else {
                        newDate = newDate + "0" + foundOrder.getDate().getMonthValue() + "-";
                    }
                }
                // Start Here
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

                // End Here
            } catch (DateTimeParseException dtpe) {
                cio.printMessage("\nDate entered is invalid.  Please enter a valid date.\n");
                badDate = true;
            }
        } while (badDate == true);

        String newState = cio.getString("Please enter the state (" + foundOrder.getState() + ") :").toUpperCase();
        if (!newState.equalsIgnoreCase("")) {

            boolean stateCheck = false;
            ArrayList<String> allStates = tm.getStates();
            for (String currentState : allStates) {
                if (newState.equalsIgnoreCase(currentState)) {
                    stateCheck = true;
                }
            }
            while (stateCheck == false) {
                newState = cio.getString("\nNo such state found. Please enter a valid state.");
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

    public void changeDate() {
        boolean badDate = false;
        String date = "";
        String year = "";
        String day = "";
        String month = "";
        do {
            try {
                year = cio.getString("Please enter the year you would like to access (YYYY)");
                month = cio.getString("Please enter the month you would like to access (MM)");
                day = cio.getString("Please enter the day of month you would like to access (DD)");
                date = year + "-" + month + "-" + day;
                LocalDate ld = LocalDate.parse(date); //THIS IS WHERE WE CHECK IF CURRENT DATE
                badDate = false;
            } catch (DateTimeParseException dtpe) {
                cio.printMessage("\nInvalid date entered. Please enter a valid date.\n");
                badDate = true;
            }
        } while (badDate == true);
        date = month + "-" + day + "-" + year;
        defaultDate = date;

    }

    private String localDateToStringToday() {
        LocalDate today = LocalDate.now();
        int numMonth = today.getMonthValue();
        String month = Integer.toString(numMonth);
        if (month.length() == 1) {
            month = "0" + month;
        }

        String day = Integer.toString(today.getDayOfMonth());
        if (day.length() == 1) {
            day = "0" + day;
        }

        String year = Integer.toString(today.getYear());

        return month + "-" + day + "-" + year;
    }

    private String defaultDateToString() {
        String month = defaultDate.substring(0, 2);
        String day = defaultDate.substring(3, 5);
        String year = defaultDate.substring(6);
        return month + day + year;
    }

    private LocalDate giveLocalDate() {
        String month = defaultDate.substring(0, 2);
        String day = defaultDate.substring(3, 5);
        String year = defaultDate.substring(6);
        String localDateDate = year + "-" + month + "-" + day;
        LocalDate output = LocalDate.parse(localDateDate);
        return output;
    }
}
