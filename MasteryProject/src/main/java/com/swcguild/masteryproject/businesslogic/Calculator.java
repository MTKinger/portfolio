/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.masteryproject.businesslogic;

import com.swcguild.masteryproject.dtos.Order;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import javax.xml.stream.XMLStreamException;

/**
 *
 * @author apprentice
 */
public interface Calculator{
    
    public double calculateMaterial(double area, double costPSF);
    public double calculateLabor(double area, double laborPSF);
    public double calculateCost(double material, double labor);
    public double calculateTax(double cost, double taxRate);
    public double calculateTotalCost(double tax, double cost);
    public Order buildOrder(String name, double area, String productType, String state, LocalDate ld5)throws FileNotFoundException, XMLStreamException;
    public Order buildEditedOrder(Order editedOrder, String state, String productType) throws FileNotFoundException, XMLStreamException;
    }
