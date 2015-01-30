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
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/**
 *
 * @author apprentice
 */
public class TaxManagement implements TaxInterface {

    ArrayList<Taxes> allTaxes = new ArrayList<>();
    final String DELIMITER = ",";
    final String TARGET_FILE = "taxes.txt";
    final String XML_TARGET_FILE = "xmlTaxes.txt";
    
    static final String TAX = "TAX";
    static final String STATE = "STATE";
    static final String RATE = "RATE";

    
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
    
    public void loadTaxesXML() throws FileNotFoundException, XMLStreamException{
        try{
            
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            InputStream in = new FileInputStream(XML_TARGET_FILE);
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
            Taxes tax = null;
            
            while(eventReader.hasNext()){
                XMLEvent event = eventReader.nextEvent();
                
                if (event.isStartElement()){
                    StartElement startElement = event.asStartElement();
                    
                    if(startElement.getName().getLocalPart() == (TAX)){
                        tax = new Taxes();
                    }
                    
                    if (event.isStartElement()){
                        if(event.asStartElement().getName().getLocalPart().equals(STATE)){
                            event = eventReader.nextEvent();
                            tax.setState(event.asCharacters().getData());
                            continue;
                        }
                    }
                    
                    if ( event.asStartElement().getName().getLocalPart().equals(RATE)){
                        event = eventReader.nextEvent();
                        String rateString = (event.asCharacters().getData());
                        double rate = Double.parseDouble(rateString);
                        tax.setTaxRate(rate);
                    }
                }
                
                if (event.isEndElement()){
                    EndElement endElement = event.asEndElement();
                    if(endElement.getName().getLocalPart() == (TAX)){
                        allTaxes.add(tax);
                    }
                }
            }
        }catch (FileNotFoundException fnf){
            System.out.println("ERROR LOADING FROM FILE");
        }catch (XMLStreamException xml){
            System.out.println("ERROR OF SOME KIND...");
        }
    }

}
