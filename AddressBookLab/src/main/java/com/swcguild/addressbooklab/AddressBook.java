package com.swcguild.addressbooklab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class AddressBook {

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
    public String[] getLastNames() {
        Set<String> lastNameSet = addressMap.keySet();
        String[] lastNameList = new String[lastNameSet.size()];
        lastNameList = lastNameSet.toArray(lastNameList);
        return lastNameList;
    }

    // Requires J-Unit

    public int getNumberHouses() {
        Set<String> lastNameSet = addressMap.keySet();
        ArrayList<String> lastNameList = new ArrayList<String>(lastNameSet);
        return lastNameList.size();
    }

}
