package com.swcguild.masteryproject.businesslogic;

import com.swcguild.masteryproject.daos.ProductInterface;
import com.swcguild.masteryproject.daos.ProductManagement;
import com.swcguild.masteryproject.daos.TaxInterface;
import com.swcguild.masteryproject.daos.TaxManagementXML;
import com.swcguild.masteryproject.dtos.Order;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import javax.xml.stream.XMLStreamException;

public class CostCalculator implements Calculator {
    
    private TaxInterface tm;
    private ProductInterface pm;
    
    public CostCalculator(TaxInterface tm, ProductInterface pm){
        this.tm = tm;
        this.pm = pm;
    }

    //**TESTED**
    @Override
    public double calculateMaterial(double area, double costPSF) {
        double materialCost = area * costPSF;
        return materialCost;
    }

    //**TESTED**
    @Override
    public double calculateLabor(double area, double laborPSF) {  //**TESTED**
        double laborCost = area * laborPSF;
        return laborCost;
    }

    //**TESTED**
    @Override
    public double calculateCost(double material, double labor) {  //**TESTED**
        double costBeforeTax = material + labor;
        return costBeforeTax;
    }

    //**TESTED**
    @Override
    public double calculateTax(double cost, double taxRate) {  //**TESTED**
        double tax = cost * (taxRate / 100);
        return tax;
    }

    //**TESTED**
    @Override
    public double calculateTotalCost(double tax, double cost) {  //**TESTED**
        double totalCost = tax + cost;
        return totalCost;
    }

    @Override
    public Order buildOrder(String name, double area, String productType, String state, LocalDate ld5) throws FileNotFoundException, XMLStreamException {
        tm.loadFromFile();
        pm.loadFromFile();
        Order orderOut = new Order(name, productType, area);
        orderOut.setState(state);
        double taxRate = tm.getTaxRate(state);
        orderOut.setTaxRate(tm.getTaxRate(state));
        orderOut.setDate(ld5);
        orderOut.setCostPSF(pm.getCostPerSquareFoot(productType));
        orderOut.setLaborPSF(pm.getLaborPerSquareFoot(productType));
        orderOut.setMaterialTotal(this.calculateMaterial(area, orderOut.getCostPSF()));
        orderOut.setLaborTotal(this.calculateLabor(area, orderOut.getLaborPSF()));
        orderOut.setTaxTotal(this.calculateTax(calculateCost(orderOut.getLaborTotal(), orderOut.getMaterialTotal()), orderOut.getTaxRate()));
        orderOut.setTotalCost(this.calculateTotalCost(calculateCost(orderOut.getLaborTotal(), orderOut.getMaterialTotal()), orderOut.getTaxTotal()));
        pm.clearAllProducts();
        tm.clearAllTaxes();
        return orderOut;

    }

    @Override
    public Order buildEditedOrder(Order editedOrder, String state, String productType) throws FileNotFoundException, XMLStreamException {
        tm.loadFromFile();
        pm.loadFromFile();
        editedOrder.setCostPSF(pm.getCostPerSquareFoot(productType));
        editedOrder.setLaborPSF(pm.getLaborPerSquareFoot(productType));
        editedOrder.setLaborTotal(this.calculateLabor(editedOrder.getArea(), editedOrder.getLaborPSF()));
        editedOrder.setMaterialTotal(this.calculateMaterial(editedOrder.getArea(), editedOrder.getCostPSF()));
        editedOrder.setTaxRate(tm.getTaxRate(state));
        editedOrder.setTaxTotal(this.calculateTax(calculateCost(editedOrder.getMaterialTotal(), editedOrder.getLaborTotal()), editedOrder.getTaxRate()));
        editedOrder.setTotalCost(this.calculateTotalCost(calculateCost(editedOrder.getMaterialTotal(), editedOrder.getLaborTotal()), editedOrder.getTaxTotal()));
        pm.clearAllProducts();
        tm.clearAllTaxes();
        return editedOrder;
    }

}
