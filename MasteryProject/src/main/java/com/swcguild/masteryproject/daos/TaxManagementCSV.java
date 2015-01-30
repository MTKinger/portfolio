/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.masteryproject.daos;

import com.swcguild.masteryproject.dtos.Taxes;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/**
 *
 * @author apprentice
 */
public class TaxManagementCSV implements TaxInterface {

    ArrayList<Taxes> allTaxes = new ArrayList<>();
    final String DELIMITER = ",";
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

    @Override
    public int getSize() { //for testing purposes
        return allTaxes.size();
    }

    @Override
    public void clearAllTaxes() {
        allTaxes.clear();
    }

    @Override
    public void addTax(String state, double rate) {
        Taxes currentTax = new Taxes();
        currentTax.setState(state);
        currentTax.setTaxRate(rate);
        allTaxes.add(currentTax);
    }

    //**TESTED**
    @Override //GET AN ARRAY LIST OF ALL STATES TO CHECK AGAINST IN THE CONTROLLER
    public ArrayList<String> getStates() {
        ArrayList<String> allStates = new ArrayList<>();
        for (Taxes currentState : allTaxes) {
            allStates.add(currentState.getState());
        }
        return allStates;
    }

    @Override
    public void writeToFile() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(TARGET_FILE));
        out.println("State, Rate");
        for (Taxes currentTax : allTaxes) {
            out.println(currentTax.getState() + DELIMITER
                    + currentTax.getTaxRate());
            out.flush();
        }
        out.close();
    }

    @Override
    public void loadFromFile() throws FileNotFoundException {

        Scanner sc = new Scanner(new BufferedReader(new FileReader(TARGET_FILE)));
        String currentLine = sc.nextLine();
        String[] currentTokens;
        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            String state = currentTokens[0];
            double taxRate = Double.parseDouble(currentTokens[1]);
            Taxes currentTax = new Taxes();
            currentTax.setState(state);
            currentTax.setTaxRate(taxRate);
            allTaxes.add(currentTax);
        }
        sc.close();
    }

}
