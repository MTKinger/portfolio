package com.swcguild.masteryproject.businesslogic;

import com.swcguild.masteryproject.daos.OrderManagement;
import com.swcguild.masteryproject.daos.ProductManagement;
import com.swcguild.masteryproject.daos.TaxManagementXML;
import com.swcguild.masteryproject.dtos.Order;
import com.swcguild.masteryproject.dtos.Product;
import com.swcguild.masteryproject.dtos.Taxes;
import com.swcguild.masteryproject.ui.ConsoleIO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.stream.XMLStreamException;

public class ManagementController {

    ConsoleIO cio = new ConsoleIO();
    int menuChoice;
    TaxManagementXML tm = new TaxManagementXML();
    ProductManagement pm = new ProductManagement();
    OrderManagement om = new OrderManagement();
    CostCalculator calc = new CostCalculator();
    final String MODE_FILE = "ModeConfiguration.txt";
    boolean writeToFile = false;
    final String COUNTER_FILE = "counter.txt";
    String defaultDate = localDateToStringToday();
    private String password = "1";
    private int managerModeCounter = 1;
    DecimalFormat df = new DecimalFormat("#.00");

    public void run() throws FileNotFoundException, IOException, XMLStreamException {
        om.readCounter();
        doMenu();
    }

    private void doMenu() throws FileNotFoundException, IOException, XMLStreamException {
        do {
            writeToFile = setMode();
            printMenu();
            menuChoice = cio.getInt("Please make a selection from the above choices:", 1, 8);
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
                    om.writeCounter();
                    cio.printMessage("saving....\n\nsaving.....\n\nYour work has been saved.\n");
                    break;

                case 6:
                    changeDate();
                    break;
                case 7:
                    managerEntry();
                    break;
                case 8:
                    om.writeCounter();
                    break;
                default:
                    cio.printMessage("Please enter a valid menu choice!\n");
                    break;
            }
        } while (menuChoice != 8);
        cio.printMessage("\n\nThank you for chosing SWC Corp...");
    }

    private void printMenu() {
        if (writeToFile == false) {
            cio.printMessage("\n\n***************************************************");
            cio.printMessage("*\tSWC Corp. Flooring Program");
            cio.printMessage("*\t\t**TEST MODE**");
            cio.printMessage("*\t\tDate:" + defaultDate);
            cio.printMessage("*");
            cio.printMessage("* 1. Display Orders");
            cio.printMessage("* 2. Add an Order");
            cio.printMessage("* 3. Edit an Order");
            cio.printMessage("* 4. Remove an Order");
            cio.printMessage("* 5. Save Current Work");
            cio.printMessage("* 6. Switch Date");
            cio.printMessage("* 7. Manager Mode");
            cio.printMessage("* 8. Quit");
            cio.printMessage("*");
            cio.printMessage("*");
            cio.printMessage("***************************************************\n\n");
        } else {
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
            cio.printMessage("* 7. Manager Mode");
            cio.printMessage("* 8. Quit");
            cio.printMessage("*");
            cio.printMessage("*");
            cio.printMessage("***************************************************\n\n");
        }
    }

    private void managerEntry() throws IOException, XMLStreamException {
        if (managerModeCounter < 4) {
            String enteredPassword = cio.getString("Please enter your authorization");
            while (!enteredPassword.equalsIgnoreCase(password) && managerModeCounter < 4) {
                enteredPassword = cio.getString("Incorrect password. Please reenter authorization");
                managerModeCounter++;
            }
            if (enteredPassword.equalsIgnoreCase(password)) {
                cio.printMessage("Welcome to Manager Mode\n");
                doSubMenu();
                managerModeCounter = 1;
            } else {
                cio.printMessage("YOU ARE LOCKED OUT OF MANAGER MODE, PLEASE CONTACT YOUR MANAGER");
            }
        } else {
            cio.printMessage("YOU ARE LOCKED OUT OF MANAGER MODE, PLEASE CONTACT YOUR MANAGER");
        }
    }

    private void doSubMenu() throws IOException, XMLStreamException {
        int userResponse = 0;

        do {
            displaySubMenu();
            userResponse = cio.getInt("What would you like to do?", 1, 3);
            switch (userResponse) {
                case 1:
                    doTaxMenu();
                    break;
                case 2:
                    doProductMenu();
                    break;
                case 3:
                    cio.printMessage("Returning to retail menu\n");
                    break;
                default:
                    cio.printMessage("ERROR");
            }
        } while (userResponse != 3);
    }

    private void displaySubMenu() {
        cio.printMessage("\n\n***************************************************");
        cio.printMessage("*\tSWC Corp. Flooring Program");
        cio.printMessage("*\t\tMANAGER MODE");
        cio.printMessage("*");
        cio.printMessage("* 1. Change Tax Information");
        cio.printMessage("* 2. Change Product Information");
        cio.printMessage("* 3. Back To Retail Menu");
        cio.printMessage("*");
        cio.printMessage("*");
        cio.printMessage("***************************************************\n\n");
    }

    private void doProductMenu() throws IOException {
        int userResponse = 0;
        do {
            displayProductMenu();
            userResponse = cio.getInt("What would you like to do?", 1, 4);
            switch (userResponse) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    cio.printMessage("Returning to Manager Menu\n");
                    break;
                default:
                    cio.printMessage("ERROR");
            }
        } while (userResponse != 4);
    }

    private void displayProductMenu() {
        cio.printMessage("\n\n***************************************************");
        cio.printMessage("*\tSWC Corp. Flooring Program");
        cio.printMessage("*\t\tPRODUCT DATABASE");
        cio.printMessage("*");
        cio.printMessage("* 1. Add a Product to Database");
        cio.printMessage("* 2. Remove a Product from Database");
        cio.printMessage("* 3. Edit an Existing Product");
        cio.printMessage("* 4. Return to Manager Menu.");
        cio.printMessage("*");
        cio.printMessage("*");
        cio.printMessage("***************************************************\n\n");
    }

    private void addProduct() throws IOException {
        cio.printMessage("");
        pm.clearAllProducts();
        pm.loadFromFile();
        boolean badProduct = false;
        String prodType = cio.getString("Please enter the name of the product you wish to add:");

        do {
            badProduct = false;
            ArrayList<String> allProducts = pm.getAllProductTypes();
            for (String currentProduct : allProducts) {
                if (currentProduct.equalsIgnoreCase(prodType)) {
                    prodType = cio.getString("That product is already in our database, please enter a new product");
                    badProduct = true;
                }
            }
        } while (badProduct == true);

        double costPSF = cio.getDouble("Please enter the cost of the product in dollars per square foot:", 0, 1000000000);
        double laborPSF = cio.getDouble("Please enter the labor cost of the product in dollars per square foot:", 0, 1000000000);
        Product productToAdd = new Product();
        productToAdd.setProductType(prodType);
        productToAdd.setCostPSF(costPSF);
        productToAdd.setLaborPSF(laborPSF);
        cio.printMessage(productToAdd.toString());

        int userChoice = cio.getInt("\nAre you sure you want to add this product to the database? (Press 1 for yes or 2 for no)", 1, 2);
        if (userChoice == 1) {
            pm.clearAllProducts();
            pm.loadFromFile();
            pm.addProduct(productToAdd);
            pm.writeToFile();
            cio.printMessage("\nThis product will now be available for sale.");
        } else {
            cio.printMessage("\nThis product will not be saved to out database.");
        }
    }

    private void removeProduct() throws IOException {
        pm.clearAllProducts();
        pm.loadFromFile();
        cio.printMessage("");
        boolean productCheck = false;
        String remove = "";
        do {
            displayProducts();
            String productType = cio.getString("What is the product type you wish to remove?");
            ArrayList<String> allTypes = pm.getAllProductTypes();
            for (String currentProduct : allTypes) {
                if (productType.equalsIgnoreCase(currentProduct)) {
                    productCheck = true;
                    remove = currentProduct;
                }
            }
            if (productCheck == false) {
                cio.printMessage("\nThis product is not in our database.  Please enter a new product.\n");
            }
        } while (productCheck == false);

        int userChoice = cio.getInt("\nAre you sure you want to remove " + remove + " from the database? (Press 1 for yes or 2 for no)", 1, 2);

        if (userChoice == 1) {
            pm.removeProduct(remove, pm.getAllProducts());
            pm.writeToFile();
            cio.printMessage("\nThis product has been removed from the database and will no longer be available.");
        } else {
            cio.printMessage("This product will not be removed from the database.");
        }

    }

    private void editProduct() throws FileNotFoundException, IOException {
        pm.clearAllProducts();
        pm.loadFromFile();
        cio.printMessage("");
        boolean badDouble = false;
        boolean productCheck = false;
        String edit = "";
        Product productToBeEdited = new Product();
        Product productFound = new Product();
        do {
            displayProducts();
            String productType = cio.getString("What is the product you wish to change?");
            ArrayList<String> productList = pm.getAllProductTypes();
            for (String currentProduct : productList) {
                if (productType.equalsIgnoreCase(currentProduct)) {
                    productCheck = true;
                    edit = currentProduct;
                }
            }
            if (productCheck == false) {
                cio.printMessage("This product has not been found in our database. Please enter a new product.");
            }
        } while (productCheck == false);

        ArrayList<Product> allProducts = pm.getAllProducts();
        for (Product currentProduct : allProducts) {
            if (currentProduct.getProductType().equalsIgnoreCase(edit)) {
                productToBeEdited = currentProduct;
                productFound = currentProduct;
            }
        }
        do {
            String costPSF = cio.getString("\nPlease enter the new cost per square foot of " + edit + " (" + df.format(productFound.getCostPSF()) + ") :");
            if (!costPSF.equalsIgnoreCase("")) {
                try {
                    double cpsfDouble = Double.parseDouble(costPSF);
                    while (cpsfDouble < 0) {
                        cpsfDouble = cio.getDouble("\nPlease enter a valid cost per square foot.", 0, 1000000000);
                    }
                    productToBeEdited.setCostPSF(cpsfDouble);
                    badDouble = false;
                } catch (NumberFormatException nfe) {
                    cio.printMessage("\nPlease enter a valid cost per square foot.");
                    badDouble = true;
                }
            } else {
                productToBeEdited.setCostPSF(productFound.getCostPSF());
            }
        } while (badDouble == true);

        do {
            String laborPSF = cio.getString("\nPlease enter the new labor cost per square foot of " + edit + " (" + df.format(productFound.getLaborPSF()) + ") :");
            if (!laborPSF.equalsIgnoreCase("")) {
                try {
                    double lpsfDouble = Double.parseDouble(laborPSF);
                    while (lpsfDouble < 0) {
                        lpsfDouble = cio.getDouble("\nPlease enter a valid labor cost per square foot.", 0, 1000000000);
                    }
                    productToBeEdited.setLaborPSF(lpsfDouble);
                    badDouble = false;
                } catch (NumberFormatException nfe) {
                    cio.printMessage("\nPlease enter a valid labor cost per square foot.");
                    badDouble = true;
                }
            } else {
                productToBeEdited.setLaborPSF(productFound.getLaborPSF());
            }
        } while (badDouble == true);

        cio.printMessage(productToBeEdited.toString());

        int userChoice = cio.getInt("\nWould you like to save these changes? (Press 1 for yes, 2 for no)", 1, 2);
        if (userChoice == 1) {
            pm.removeProduct(edit, allProducts);
            pm.addProduct(productFound);
            pm.writeToFile();
            cio.printMessage("\nYour change has been submitted to our database.");
        } else {
            cio.printMessage("\nYour change will not be submitted to our database.");
        }
    }

    private void doTaxMenu() throws XMLStreamException, IOException {
        int userChoice = 0;
        do {
            displayTaxMenu();
            userChoice = cio.getInt("What would you like to do?", 1, 4);
            switch (userChoice) {
                case 1:
                    addState();
                    break;
                case 2:
                    removeState();
                    break;
                case 3:
                    editState();
                    break;
                case 4:
                    cio.printMessage("Returning to Manager Menu\n");
                    break;
                default:
                    cio.printMessage("ERROR");
            }
        } while (userChoice != 4);
    }

    private void displayTaxMenu() {
        cio.printMessage("\n\n***************************************************");
        cio.printMessage("*\tSWC Corp. Flooring Program");
        cio.printMessage("*\t\tTAX DATABASE");
        cio.printMessage("*");
        cio.printMessage("* 1. Add a Tax to Database");
        cio.printMessage("* 2. Remove a Tax from Database");
        cio.printMessage("* 3. Edit an Existing Tax");
        cio.printMessage("* 4. Return to Manager Menu.");
        cio.printMessage("*");
        cio.printMessage("*");
        cio.printMessage("***************************************************\n\n");
    }

    private void addState() throws FileNotFoundException, XMLStreamException, IOException {

        tm.clearAllTaxes();
        tm.loadFromFile();
        cio.printMessage("");
        boolean badState = false;
        String state = cio.getString("Please enter the two letter code of the state we are expanding to:").toUpperCase();

        do {
            badState = false;
            ArrayList<String> allStates = tm.getStates();
            for (String currentState : allStates) {
                if (currentState.equalsIgnoreCase(state)) {
                    state = cio.getString("That state is already in our database, please enter a new state").toUpperCase();
                    badState = true;
                }
            }
        } while (badState == true);

        double taxRate = cio.getDouble("Please enter the tax rate associated with said state", 0, 3000);
        Taxes newTax = new Taxes();
        newTax.setState(state);
        newTax.setTaxRate(taxRate);
        cio.printMessage(newTax.toString());

        int userChoice = cio.getInt("\nAre you sure you want to add this state to the database? (Press 1 for yes or 2 for no)", 1, 2);
        if (userChoice == 1) {
            tm.clearAllTaxes();
            tm.loadFromFile();
            tm.addTax(state, taxRate);
            tm.writeToFile();
            cio.printMessage("\nThis state will now be available for selection.");
        } else {
            cio.printMessage("\nThis state will not be available for selection.");
        }

    }

    private void removeState() throws FileNotFoundException, XMLStreamException, IOException {
        tm.clearAllTaxes();
        tm.loadFromFile();
        cio.printMessage("");
        boolean taxCheck = false;
        String remove = "";
        do {
            displayAllStates();
            String productType = cio.getString("What is the state you wish to remove?");
            ArrayList<String> allStates = tm.getStates();
            for (String currentState : allStates) {
                if (productType.equalsIgnoreCase(currentState)) {
                    taxCheck = true;
                    remove = currentState;
                }
            }
            if (taxCheck == false) {
                cio.printMessage("\nThis state is not in our database.  Please enter a new state.\n");
            }
        } while (taxCheck == false);

        int userChoice = cio.getInt("\nAre you sure you want to remove " + remove + " from the database? (Press 1 for yes or 2 for no)", 1, 2);

        if (userChoice == 1) {
            tm.removeTax(tm.getAllTaxes(), remove);
            tm.writeToFile();
            cio.printMessage("\nThis state has been removed from the database and will no longer be available.");
        } else {
            cio.printMessage("\nThis state will not be removed from the database.");
        }
    }

    private void editState() throws FileNotFoundException, XMLStreamException, IOException {
        tm.clearAllTaxes();
        tm.loadFromFile();
        cio.printMessage("");
        boolean badDouble = false;
        boolean taxCheck = false;
        String edit = "";
        Taxes taxToBeEdited = new Taxes();
        Taxes foundTax = new Taxes();
        do {
            displayAllStates();
            String productType = cio.getString("What is the state you wish to change?");
            ArrayList<String> allStates = tm.getStates();
            for (String currentState : allStates) {
                if (productType.equalsIgnoreCase(currentState)) {
                    taxCheck = true;
                    edit = currentState;
                }
            }
            if (taxCheck == false) {
                cio.printMessage("\nThis state is not in our database.  Please enter a new state.\n");
            }
        } while (taxCheck == false);

        ArrayList<Taxes> allTaxes = tm.getAllTaxes();
        for (Taxes currentTax : allTaxes) {
            if (currentTax.getState().equalsIgnoreCase(edit)) {
                taxToBeEdited = currentTax;
                foundTax = currentTax;
            }
        }
        do {
            String taxRate = cio.getString("\nPlease enter the new tax rate for " + edit + " " + "(" + df.format(taxToBeEdited.getTaxRate()) + ") :");
            if (!taxRate.equalsIgnoreCase("")) {
                try {
                    double taxRateNum = Double.parseDouble(taxRate);
                    while (taxRateNum < 0.0) {
                        taxRateNum = cio.getDouble("Please enter a valid tax rate.", 0, 1000000000);
                    }
                    taxToBeEdited.setTaxRate(taxRateNum);
                    badDouble = false;
                } catch (NumberFormatException nfe) {
                    cio.printMessage("\nPlease enter a valid tax rate");
                    badDouble = true;
                }
            } else {
                taxToBeEdited.setTaxRate(foundTax.getTaxRate());
            }
        } while (badDouble == true);

        cio.printMessage(taxToBeEdited.toString());
        int userChoice = cio.getInt("\nWould you like to save these changes? 1 for yes, 2 for no", 1, 2);
        if (userChoice == 1) {
            tm.removeTax(allTaxes, edit);
            tm.addTax(edit, taxToBeEdited.getTaxRate());
            tm.writeToFile();
            cio.printMessage("\nYour change has been submitted to out database.");
        } else {
            cio.printMessage("\nYour change will not be submitted to our database.");
        }

    }

    private void addOrder() throws FileNotFoundException, IOException, XMLStreamException {
        tm.clearAllTaxes();
        pm.clearAllProducts();
        tm.loadFromFile();
        pm.loadFromFile();
        writeToFile = setMode();
        String userName = cio.getString("What is the customer's name?");

        double area = cio.getDouble("What's the area of the order, in square feet", 0, 1000000000);
        String state = "";
        String productType = "";

        boolean stateCheck = false;
        do {
            displayAllStates();
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
            displayProducts();
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
        String customerName = userName;

        Order currentOrder = calc.buildOrder(customerName, area, productType, state, giveLocalDate());

        cio.printMessage("Please review your submitted order:\n\n");
        cio.printMessage(currentOrder.orderToStringWithoutOrderNumber());
        if (writeToFile == false) {
            cio.printMessage("\nSystem is currently configured to test mode.  Your order will not be saved.");
            cio.printMessage("Please contact your system administrator to reconfigure the program.\n\n");
        } else {
            int approved = cio.getInt("\nAre you sure you would like to submit this order? (press 1 for yes, 2 for no)", 1, 2);

            if (approved == 1) {
                try {
                    ArrayList<Order> allOrdersFromAnotherDate = om.loadFromFile(defaultDateToString());
                    om.addOrder(currentOrder, allOrdersFromAnotherDate);
                    om.writeToFile(allOrdersFromAnotherDate, defaultDateToString());
                    cio.printMessage("Your order has been added to our database");
                    cio.printMessage("Your order number was " + (om.getCounter() - 1));
                } catch (FileNotFoundException fnf) {
                    ArrayList<Order> holdingOneOrder = new ArrayList<>();
                    om.addOrder(currentOrder, holdingOneOrder);
                    om.writeToFile(holdingOneOrder, defaultDateToString());
                    cio.printMessage("Your order has been added to our database");
                    cio.printMessage("Your order number was " + (om.getCounter() - 1));
                } catch (IOException ioe) {
                    cio.printMessage("Sorry, your order could not be added to our database.");
                }
            } else {
                cio.printMessage("Your order will not be added to our database.");
            }
        }
        tm.clearAllTaxes();
        pm.clearAllProducts();
    }

    private void displayOrders() throws FileNotFoundException {
        try {
            ArrayList<Order> ordersToBeDisplayed = om.loadFromFile(defaultDateToString());
            for (Order currentOrder : ordersToBeDisplayed) {
                cio.printMessage(currentOrder.orderToString());
                cio.printMessage("-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }
        } catch (FileNotFoundException fnf) {
            cio.printMessage("No orders to display!");
            cio.printMessage("");
        }
    }

    private void removeOrder() throws FileNotFoundException, IOException {
        Order foundOrder = new Order("null", "null", 0.0);
        try {
            displayOrders();
            ArrayList<Order> ordersToBeDeleted = om.loadFromFile(defaultDateToString());
            int orderNumber = cio.getInt("Please enter the order ID# for the order you wish to remove");
            foundOrder = om.getOrderByID(orderNumber, ordersToBeDeleted);
            while (foundOrder.getCustomerName().equalsIgnoreCase("null")) {
                orderNumber = cio.getInt("Error: No such Order ID# has been found. Please enter a valid ID#");
                foundOrder = om.getOrderByID(orderNumber, ordersToBeDeleted);
            }
            cio.printMessage("\n" + foundOrder.orderToString());

            if (writeToFile == false) {
                cio.printMessage("\nSystem is currently configured to test mode.  Orders cannot be deleted at this time.");
                cio.printMessage("Please contact your system administrator to reconfigure the program.\n\n");
            } else {
                int approved = cio.getInt("\nAre you sure you would like to delete this order? (press 1 for yes, 2 for no)", 1, 2);
                if (approved == 1) {
                    om.removeOrder(orderNumber, ordersToBeDeleted);
                    om.writeToFile(ordersToBeDeleted, defaultDateToString());
                    cio.printMessage("\nYour order has been deleted. Thank you.");
                } else {
                    cio.printMessage("\nYour order will not be deleted.");
                }
            }
        } catch (FileNotFoundException fnf) {
            cio.printMessage("No orders to be deleted with that date!");
        } catch (IOException ioe) {
            cio.printMessage("The updated order list could not be saved to our database");
        }
    }

    private void editOrder() throws FileNotFoundException, IOException, XMLStreamException {
        ArrayList<Order> onlyEditedOrder = new ArrayList<>();
        boolean badDouble = false;
        boolean badDate = false;
        tm.loadFromFile();
        pm.loadFromFile();
        Order foundOrder = new Order("null", "null", 0.0);
        try {
            displayOrders();
            ArrayList<Order> ordersToBeEdited = om.loadFromFile(defaultDateToString());
            int orderNumber = cio.getInt("Please enter the order ID# for the order you wish to edit");
            foundOrder = om.getOrderByID(orderNumber, ordersToBeEdited);
            Order editedOrder = new Order("", "", 0);
            while (foundOrder.getCustomerName().equalsIgnoreCase("null")) {
                orderNumber = cio.getInt("\nError: No such Order ID# has been found. Please enter a valid ID#");
                foundOrder = om.getOrderByID(orderNumber, ordersToBeEdited);
            }
            cio.printMessage("\n\n" + foundOrder.orderToString());

            String newName = cio.getString("Enter customer's name (" + foundOrder.getCustomerName() + ") :");
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
                        while (newArea1 < 0) {
                            newArea1 = cio.getDouble("\nPlease enter a valid area.", 0, 1000000000);
                            cio.printMessage("");
                        }
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

            displayProducts();
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
                    displayProducts();
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

            displayAllStates();
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
                    displayAllStates();
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
            calc.buildEditedOrder(editedOrder, editedOrder.getState(), editedOrder.getProductType());
            editedOrder.setOrderNumber(foundOrder.getOrderNumber());

            cio.printMessage("Please review your edited order:\n\n");
            cio.printMessage(editedOrder.orderToString());

            if (writeToFile == false) {
                cio.printMessage("\nSystem is currently configured to test mode.  Orders cannot be changed at this time.");
                cio.printMessage("Please contact your system admin to reconfigure the system.\n\n");
            } else {
                int approved = cio.getInt("\nAre you sure you would like to submit this edited order? (press 1 for yes, 2 for no)", 1, 2);

                if (approved == 1) {
                    om.removeOrder(foundOrder.getOrderNumber(), ordersToBeEdited);
                    om.writeToFile(ordersToBeEdited, defaultDateToString());
                    onlyEditedOrder.add(editedOrder);
                    LocalDate ld3 = editedOrder.getDate();
                    ArrayList<Order> editedOrders = new ArrayList<>();
                    editedOrders = om.loadFromFile(localDateToString(ld3));
                    editedOrders.add(editedOrder);
                    om.writeToFile(editedOrders, localDateToString(ld3));
                    cio.printMessage("\nYour order has been changed. Thank you.");
                } else {
                    cio.printMessage("\nYour order will not be changed.");
                }
            }
            tm.clearAllTaxes();
            pm.clearAllProducts();
        } catch (FileNotFoundException fnf) {
            LocalDate ld4 = onlyEditedOrder.get(0).getDate();
            om.writeToFile(onlyEditedOrder, localDateToString(ld4));
            cio.printMessage("Your order will be changed. Thank you.");
        } catch (IOException ioe) {
            cio.printMessage("Error changing our database, please try again later.");
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

    private String localDateToString(LocalDate ld) {

        int numMonth = ld.getMonthValue();
        String month = Integer.toString(numMonth);
        if (month.length() == 1) {
            month = "0" + month;
        }

        String day = Integer.toString(ld.getDayOfMonth());
        if (day.length() == 1) {
            day = "0" + day;
        }

        String year = Integer.toString(ld.getYear());

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

    //**TESTED WHILE SET TO PUBLIC**
    private boolean setMode() throws FileNotFoundException {
        boolean output;
        Scanner sc = new Scanner(new BufferedReader(new FileReader(MODE_FILE)));
        String currentLine = sc.nextLine();
        if (currentLine.equalsIgnoreCase("production")) {
            output = true;
        } else {
            output = false;
        }
        return output;
    }

    private void displayProducts() {
        ArrayList<String> allProducts = pm.getAllProductTypes();
        cio.printMessage("");
        cio.printMessage("Available Products:");
        for (String currentProduct : allProducts) {
            cio.printMessage(currentProduct);
        }
        cio.printMessage("");
        allProducts.clear();
    }

    private void displayAllStates() {
        ArrayList<String> allStates = tm.getStates();
        cio.printMessage("");
        cio.printMessage("Available States:");
        for (String currentState : allStates) {
            cio.printMessage(currentState);
        }
        cio.printMessage("");
        allStates.clear();
    }

}
