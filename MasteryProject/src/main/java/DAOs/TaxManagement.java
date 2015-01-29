/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DTOs.Taxes;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TaxManagement implements TaxInterface {

    ArrayList<Taxes> allTaxes = new ArrayList<>();
    final String DELIMITER = ":::";
    final String TARGET_FILE = "taxes.txt";

    
            //**TESTED**
    
    @Override           //GETS A SINGLE TAX RATE THAT IS DEPENDENT ON THE STATE
    public double getTaxRate(String state) {
        double taxRate = 0;
        for (Taxes currentTaxes : allTaxes) {
            if (state.equalsIgnoreCase(currentTaxes.getState())) {
                taxRate = currentTaxes.getTaxRate();

            }
        }
        return taxRate;
    }

    
            //**TESTED**
    
    @Override
    public void loadFromFile() throws FileNotFoundException {
        
        Scanner sc = new Scanner(new BufferedReader(new FileReader(TARGET_FILE)));
        String currentLine;
        String[] currentTokens;
        while(sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            String state = currentTokens[0];
            double taxRate = Double.parseDouble(currentTokens[1]);
            Taxes currentTax = new Taxes ();
            currentTax.setState(state);
            currentTax.setTaxRate(taxRate);
            allTaxes.add(currentTax);
        }
        sc.close();
    }

            //**TESTED**
    
    @Override //GET AN ARRAY LIST OF ALL STATES TO CHECK AGAINST IN THE CONTROLLER
    public ArrayList<String> getStates() {
        ArrayList<String> allStates = new ArrayList<>();
        for(Taxes currentState: allTaxes) {
            allStates.add(currentState.getState());
        }
        return allStates;
    }
    
            //**TESTED**
    
    public int getSize() { //for testing purposes
        return allTaxes.size();
    }
    
    public void clearAllTaxes() {
        allTaxes.clear();
    }

}
