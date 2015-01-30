/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.masteryproject.daos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.stream.XMLStreamException;

/**
 *
 * @author apprentice
 */
public interface TaxInterface {
    
public double getTaxRate(String state);
public void loadFromFile() throws FileNotFoundException , XMLStreamException;
public void writeToFile() throws IOException , XMLStreamException;
public ArrayList<String> getStates();
public int getSize();
public void clearAllTaxes();
public void addTax(String state, double rate);
    
}
