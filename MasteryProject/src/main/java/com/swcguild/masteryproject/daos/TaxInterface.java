/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.masteryproject.daos;

import com.swcguild.masteryproject.dtos.Taxes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.stream.XMLStreamException;


public interface TaxInterface {

    void addTax(String state, double rate);

    void clearAllTaxes();

    ArrayList<Taxes> getAllTaxes();

    //**TESTED**
    int getSize();

    ArrayList<String> getStates();

    double getTaxRate(String state);

    void loadFromFile() throws FileNotFoundException, XMLStreamException;

    ArrayList<Taxes> removeTax(ArrayList<Taxes> allTaxes, String state);

    void writeToFile() throws IOException, XMLStreamException;
    
}
