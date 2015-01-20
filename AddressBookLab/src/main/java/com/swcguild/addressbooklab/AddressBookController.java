package com.swcguild.addressbooklab;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class AddressBookController {

    ConsoleIO cio = new ConsoleIO();
    AddressBook addressBook = new AddressBook();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            addressBook.loadAddressBook();
            while (keepGoing) {
                printMenu();
                menuSelection = cio.getInt("", 1, 9);

                switch (menuSelection) {
                    case 1:
                        createHouse();
                        break;
                    case 2:
                        removeHouse();
                        break;
                    case 3:
                        viewAddress();
                        break;
                    case 4:
                        countAddresses();
                        break;
                    case 5:
                        viewAllAddresses();
                        break;
                    case 6:
                        editAddress();
                        break;
                    case 7:
                        addressBook.loadAddressBook();
                        break;
                    case 8:
                        addressBook.writeAddressBook();
                        break;
                    case 9:
                        cio.printMessage("Exiting....");
                        keepGoing = false;
                        break;
                    default:
                        cio.printMessage("Unknown Command...");
                }

            }
        } catch (FileNotFoundException ex) {
            cio.printMessage("Error Loading Address Book...");
        } catch (IOException ex) {
            cio.printMessage("Error Writing to File...");
        }
    }

    private void printMenu() {
        cio.printMessage("MAIN MENU:");
        cio.printMessage("\tPlease select the operation you wish to perform:");
        cio.printMessage("\t\t1. Add Address");
        cio.printMessage("\t\t2. Delete Address");
        cio.printMessage("\t\t3. Find Address");
        cio.printMessage("\t\t4. List Address Count");
        cio.printMessage("\t\t5. List All Addresses");
        cio.printMessage("\t\t6. Edit Existing Address");
        cio.printMessage("\t\t7. Load Address Book from File");
        cio.printMessage("\t\t8. Save Address Book to File");
        cio.printMessage("\t\t9. Exit");
    }

    private void createHouse() {
        cio.printMessage("Add Address Menu");
        String firstName = cio.getString("\tPlease Enter First Name: ");
        String lastName = cio.getString("\tPlease Enter Last Name: ");
        String streetAddress = cio.getString("\tPlease Enter Street Address:");
        String city = cio.getString("\tPlease Enter City: ");
        String state = cio.getString("\tPlease Enter State: ");
        String zip = cio.getString("\tPlease Enter Zip Code: ");
        House currentHouse = new House(lastName);
        currentHouse.setFirstName(firstName);
        currentHouse.setStreetAddress(streetAddress);
        currentHouse.setCity(city);
        currentHouse.setState(state);
        currentHouse.setZip(zip);
        addressBook.addHouse(lastName, currentHouse);
        int exit;
        do {
            exit = cio.getInt("\n\tAddress Added.  Press 1 to go to Main Menu");
            if (exit != 1) {
                cio.printMessage("\n\tInput Error");
            }
        } while (exit != 1);
    }

    private void removeHouse() {
        boolean badInput;
        cio.printMessage("Delete Address Menu:");
        do {
            try {
                String lastName = cio.getString("\tPlease Enter Last Name of Address to Delete:");
                House currentHouse = addressBook.getHouse(lastName);
                cio.printMessage("\n\t" + currentHouse.getFirstName() + " " + currentHouse.getLastName());
                cio.printMessage("\t" + currentHouse.getStreetAddress());
                cio.printMessage("\t" + currentHouse.getCity() + ", " + currentHouse.getState()
                        + ", " + currentHouse.getZip());
                

        String response = "";
        int exit = 0;
        do {
            response = cio.getString("\n\n\tReally Delete? ( Enter Yes or No)");
            if (response.equalsIgnoreCase("yes")) {
                currentHouse = addressBook.removeHouse(lastName);
                exit = cio.getInt("\n\tAddress Deleted.  Press 1 to go to Main Menu");
            } else if (response.equalsIgnoreCase("no")) {
                cio.printMessage("\tAddress Will Not Be Deleted.  Press 1 to go to Main Menu");
                exit = 1;
            } else {
                cio.printMessage("\n\tInput Error");
            }
        } while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no") && exit != 1);
    badInput = false;
            } catch (InputMismatchException ime) {
                System.out.println("Please enter a valid last name:");
                badInput = true;
            }
        } while (badInput);
            }

    private void viewAddress() {
        cio.printMessage("Find Address Menu:");
        String lastName = cio.getString("\tPlease Enter Last Name of Address to Find:");
        House currentHouse = addressBook.getHouse(lastName);
        int exit = 0;
        if (currentHouse != null) {
            cio.printMessage("\n\t" + currentHouse.getFirstName() + " " + currentHouse.getLastName());
            cio.printMessage("\t" + currentHouse.getStreetAddress());
            cio.printMessage("\t" + currentHouse.getCity() + ", " + currentHouse.getState()
                    + ", " + currentHouse.getZip());
        } else {
            cio.printMessage("\n\tLast Name Not Found.");
        }
        do {
            exit = cio.getInt("\n\n\tPress 1 to go to Main Menu");
            if (exit != 1) {
                cio.printMessage("\n\tInput Error");
            }
        } while (exit != 1);

    }

    private void countAddresses() {
        cio.printMessage("List Address Count Menu:");
        int numberHouses = addressBook.getNumberHouses();
        int exit = cio.getInt("There are " + numberHouses + " addresses in the book.  Press 1 to go to Main Menu");
        while (exit != 1) {
            cio.printMessage("\n\tInput Error");
            exit = cio.getInt("\n\n\tPress 1 to go to Main Menu");
        }
    }

    private void viewAllAddresses() {
        ArrayList<String> lastNames = addressBook.getLastNames();
        for (String lastName : lastNames) {
            House currentHouse = addressBook.getHouse(lastName);
            cio.printMessage("\n\t" + currentHouse.getFirstName() + " " + currentHouse.getLastName());
            cio.printMessage("\t" + currentHouse.getStreetAddress());
            cio.printMessage("\t" + currentHouse.getCity() + ", " + currentHouse.getState()
                    + ", " + currentHouse.getZip() + "\n");
        }
        int exit = 0;
        do {
            exit = cio.getInt("\n\n\tPress 1 to go to Main Menu");
            if (exit != 1) {
                cio.printMessage("\n\tInput Error");
            }
        } while (exit != 1);
    }

    private void editAddress() {
        cio.printMessage("Edit Address Menu:");
        String lastName = cio.getString("\tPlease Enter Last Name of Address to Edit:");
        House currentHouse = addressBook.getHouse(lastName);
        int exit = 0;
        if (currentHouse != null) {
            cio.printMessage("\n\t" + currentHouse.getFirstName() + " " + currentHouse.getLastName());
            cio.printMessage("\t" + currentHouse.getStreetAddress());
            cio.printMessage("\t" + currentHouse.getCity() + ", " + currentHouse.getState()
                    + ", " + currentHouse.getZip());
            String newStreetAddress = cio.getString("\n\n\tPlease Enter New Street Address:");
            String newCity = cio.getString("\tPlease Enter New City:");
            String newState = cio.getString("\tPlease Enter New State:");
            String newZip = cio.getString("\tPlease Enter New Zip Code:");

            currentHouse.setStreetAddress(newStreetAddress);
            currentHouse.setCity(newCity);
            currentHouse.setState(newState);
            currentHouse.setZip(newZip);

            cio.printMessage("\nRevised Address:");

            cio.printMessage("\n\t" + currentHouse.getFirstName() + " " + currentHouse.getLastName());
            cio.printMessage("\t" + currentHouse.getStreetAddress());
            cio.printMessage("\t" + currentHouse.getCity() + ", " + currentHouse.getState()
                    + ", " + currentHouse.getZip());

        } else {
            cio.printMessage("\n\tLast Name Not Found.");
        }
        do {
            exit = cio.getInt("\n\n\tPress 1 to go to Main Menu");
            if (exit != 1) {
                cio.printMessage("\n\tInput Error");
            }
        } while (exit != 1);

    }
}
