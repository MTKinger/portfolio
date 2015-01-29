/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.masteryproject.daos;

import com.swcguild.masteryproject.dtos.Taxes;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public interface TaxInterface {
    
public double getTaxRate(String state);
public void loadFromFile() throws FileNotFoundException;
public ArrayList<String> getStates();
    
}
