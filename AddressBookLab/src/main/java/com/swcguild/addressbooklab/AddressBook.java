package com.swcguild.addressbooklab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class AddressBook {

    public static final String ADDRESS_FILE = "addressbook.txt";
    public static final String DELIMITER = "::";

    private HashMap<String, House> addressMap = new HashMap<String, House>();

    public House addHouse(String lastName, House house) {
        return addressMap.put(lastName, house);
    }

    public House getHouse(String lastName) {
        return addressMap.get(lastName);
    }

    public House removeHouse(String lastName) {
        return addressMap.remove(lastName);
    }

    // Requires J-Unit
    public ArrayList<String> getLastNames() {
        Set<String> lastNameSet = addressMap.keySet();
        ArrayList<String> lastNameList = new ArrayList<String>(lastNameSet);
        return lastNameList;
    }

    // Requires J-Unit
    public int getNumberHouses() {
        Set<String> lastNameSet = addressMap.keySet();
        ArrayList<String> lastNameList = new ArrayList<String>(lastNameSet);
        return lastNameList.size();
    }

    public void loadAddressBook() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(ADDRESS_FILE)));
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            House currentHouse = new House(currentTokens[0]);
            currentHouse.setFirstName(currentTokens[1]);
            currentHouse.setStreetAddress(currentTokens[2]);
            currentHouse.setCity(currentTokens[3]);
            currentHouse.setState(currentTokens[4]);
            currentHouse.setZip(currentTokens[5]);
            addressMap.put(currentHouse.getLastName(), currentHouse);
        }
        sc.close();
    }

    public void writeAddressBook() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(ADDRESS_FILE));

        ArrayList<String> lastNames = getLastNames();
        for (String currentLastName : lastNames) {
            House currentHouse = this.getHouse(currentLastName);

            out.println(currentHouse.getLastName() + DELIMITER + currentHouse.getFirstName()
                    + DELIMITER + currentHouse.getStreetAddress() + DELIMITER + currentHouse.getCity()
                    + DELIMITER + currentHouse.getState() + DELIMITER + currentHouse.getZip());

            out.flush();
        }
        out.close();
    }

}
