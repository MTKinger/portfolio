package com.swcguild.addressbooklab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class AddressBookImpl implements AddressBookDao{
    
    public static final String ADDRESS_FILE = "addressbook.txt";
    public static final String DELIMITER = "::";
    public static final String COUNTER_FILE = "counter.txt";
    int counter = 0;
    
    private HashMap<Integer, House> addressMap = new HashMap<>();
    
    public void loadAddressBook() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(ADDRESS_FILE)));
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            House currentHouse = new House(Integer.parseInt(currentTokens[0]));
            currentHouse.setLastName(currentTokens[1]);
            currentHouse.setFirstName(currentTokens[2]);
            currentHouse.setStreetAddress(currentTokens[3]);
            currentHouse.setCity(currentTokens[4]);
            currentHouse.setState(currentTokens[5]);
            currentHouse.setZip(currentTokens[6]);
            addressMap.put(currentHouse.getId(), currentHouse);
        }
        sc.close();
    }
    
    public void writeAddressBook() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(ADDRESS_FILE));
        Set<Integer> keySet = addressMap.keySet();
        ArrayList<Integer> ids = new ArrayList<>(keySet);
        for (int currentID : ids) {
            House currentHouse = addressMap.get(currentID);

            out.println(currentHouse.getId() + DELIMITER + currentHouse.getLastName() + DELIMITER + currentHouse.getFirstName()
                    + DELIMITER + currentHouse.getStreetAddress() + DELIMITER + currentHouse.getCity()
                    + DELIMITER + currentHouse.getState() + DELIMITER + currentHouse.getZip());

            out.flush();
        }
        out.close();
    }
    
    public void readCounter()throws FileNotFoundException{
        Scanner sc  = new Scanner(new BufferedReader(new FileReader(COUNTER_FILE)));
        String currentLine;
        while(sc.hasNextLine()){
            currentLine = sc.nextLine();
            counter = Integer.parseInt(currentLine) + 1;
        }
        sc.close();
    }
    
    public void writeCounter()throws IOException{
        PrintWriter out = new PrintWriter(new FileWriter(COUNTER_FILE));
        out.println(counter);
        out.flush();
        out.close();
    }

    @Override
    public void addHouse(House house){
        addressMap.put(house.getId(), house);
    }

    @Override
    public House getHouse(int id) {
        return addressMap.get(id);
    }

    @Override
    public void removeHouse(int id) {
        addressMap.remove(id);
    }

    @Override
    public void updateHouse(House house) {
        addressMap.put(house.getId(), house);
    }

    @Override
    public List<House> getAllHouses() {
        return new ArrayList<House>(addressMap.values());
    }

    @Override
    public List<House> getHousesByLastName(String lastName) {
        return addressMap.values().stream()
                .filter(house -> house.getLastName().equalsIgnoreCase(lastName))
                .collect(Collectors.toList());
    }

    @Override
    public List<House> getHousesByCity(String city) {
        return addressMap.values().stream()
                .filter(house -> house.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    @Override
    public Map<String, List<House>> getHousesByState(String state) {
        return addressMap.values().stream()
                .filter(house -> house.getState().equalsIgnoreCase(state))
                .collect(Collectors.groupingBy(House::getCity));
    }

    @Override
    public List<House> getHousesByZip(String zipCode) {
        return addressMap.values().stream()
                .filter(house -> house.getZip().equalsIgnoreCase(zipCode))
                .collect(Collectors.toList());
    }
    
    

}
