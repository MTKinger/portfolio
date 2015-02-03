/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbooklab;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public interface AddressBookDao {
    
    public void addHouse(House house);
    public House getHouse(int id);
    public void removeHouse(int id);
    public void updateHouse(House house);
    public List<House> getAllHouses();
    public List<House> getHousesByLastName(String lastName);
    public List<House> getHousesByCity(String city);
    public Map<String, List<House>> getHousesByState(String state);
    public List<House> getHousesByZip(String zipCode);
    public House setHouseCounter()throws FileNotFoundException, IOException;

    
}
