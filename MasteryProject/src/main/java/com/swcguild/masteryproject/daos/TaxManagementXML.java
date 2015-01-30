package com.swcguild.masteryproject.daos;

import com.swcguild.masteryproject.dtos.Taxes;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
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

public class TaxManagementXML implements TaxInterface {

    ArrayList<Taxes> allTaxes = new ArrayList<>();

    final String XML_TARGET_FILE = "xmlTaxes.txt";

    static final String TAX = "TAX";
    static final String STATE = "STATE";
    static final String RATE = "RATE";

    @Override
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
    
    public void loadFromFile() throws FileNotFoundException, XMLStreamException {
        try {

            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            InputStream in = new FileInputStream(XML_TARGET_FILE);
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
            Taxes tax = null;

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();

                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();

                    if (startElement.getName().getLocalPart() == (TAX)) {
                        tax = new Taxes();
                    }

                    if (event.isStartElement()) {
                        if (event.asStartElement().getName().getLocalPart().equals(STATE)) {
                            event = eventReader.nextEvent();
                            tax.setState(event.asCharacters().getData());
                            continue;
                        }
                    }

                    if (event.asStartElement().getName().getLocalPart().equals(RATE)) {
                        event = eventReader.nextEvent();
                        String rateString = (event.asCharacters().getData());
                        double rate = Double.parseDouble(rateString);
                        tax.setTaxRate(rate);
                    }
                }

                if (event.isEndElement()) {
                    EndElement endElement = event.asEndElement();
                    if (endElement.getName().getLocalPart() == (TAX)) {
                        allTaxes.add(tax);
                    }
                }
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("ERROR LOADING FROM FILE");
        } catch (XMLStreamException xml) {
            System.out.println("ERROR OF SOME KIND...");
        }

    }
    
    public ArrayList<Taxes> removeTax(ArrayList<Taxes> allTaxes, String state) {
        int index = 0;
        boolean found = false;
        for (Taxes currentTax : allTaxes) {
            if(currentTax.getState().equalsIgnoreCase(state)) {
                index = allTaxes.indexOf(currentTax);
                found = true;
            }
        }
        if(found == true) {
            allTaxes.remove(index);
        }
        return allTaxes;
    }

    @Override
    public void writeToFile() throws IOException, XMLStreamException {

        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_TARGET_FILE));
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent nodeBreak = eventFactory.createStartElement("", "", "TAX");
        XMLEvent nodeBreak2 = eventFactory.createEndElement("", "", "/TAX");
        StartDocument startDocument = eventFactory.createStartDocument();
        eventWriter.add(startDocument);
        StartElement configStartElement = eventFactory.createStartElement("", "", "TAXRATE");
        eventWriter.add(end);
        eventWriter.add(configStartElement);
        eventWriter.add(end);
        for (Taxes currentTax : allTaxes) {
            eventWriter.add(nodeBreak);
            eventWriter.add(end);
            String rate = Double.toString(currentTax.getTaxRate());
            createNode(eventWriter, "RATE", rate);
            createNode(eventWriter, "STATE", currentTax.getState());
            eventWriter.add(nodeBreak2);
            eventWriter.add(end);
        }

        eventWriter.add(eventFactory.createEndElement("", "", "TAX RATE"));
        eventWriter.add(end);
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }

    @Override
    public ArrayList<String> getStates() {
        ArrayList<String> allStates = new ArrayList<>();
        for (Taxes currentState : allTaxes) {
            allStates.add(currentState.getState());
        }
        return allStates;
    }

    private void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");

        StartElement sElement = eventFactory.createStartElement("", "", name);
        eventWriter.add(tab);
        eventWriter.add(sElement);

        Characters characters = eventFactory.createCharacters(value);
        eventWriter.add(characters);

        EndElement eElement = eventFactory.createEndElement("", "", name);
        eventWriter.add(eElement);
        eventWriter.add(end);
    }
    
    public ArrayList<Taxes> getAllTaxes() {
        return allTaxes;
    }

}
