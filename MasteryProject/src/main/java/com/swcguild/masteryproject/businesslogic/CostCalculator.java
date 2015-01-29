package com.swcguild.masteryproject.businesslogic;

import com.swcguild.masteryproject.daos.ProductManagement;
import com.swcguild.masteryproject.daos.TaxManagement;
import com.swcguild.masteryproject.dtos.Order;
import java.time.LocalDate;

public class CostCalculator implements Calculator {
    
    TaxManagement tm = new TaxManagement();
    ProductManagement pm = new ProductManagement();

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
    public Order buildOrder(String name, double area, String productType, String state, LocalDate ld5){
        Order orderOut = new Order(name, productType, area);
        orderOut.setState(state);
        orderOut.setTaxRate(tm.getTaxRate(state));
        orderOut.setCostPSF(pm.getCostPerSquareFoot(productType));
        orderOut.setLaborPSF(pm.getLaborPerSquareFoot(productType));
        orderOut.setMaterialTotal(calculateMaterial(area, orderOut.getCostPSF()));
        orderOut.setLaborTotal(calculateLabor(area, orderOut.getLaborPSF()));
        orderOut.setTaxTotal(calculateTax(calculateCost(orderOut.getLaborTotal(), orderOut.getMaterialTotal()), orderOut.getTaxRate()));
        orderOut.setTotalCost(calculateTotalCost(calculateCost(orderOut.getLaborTotal(), orderOut.getMaterialTotal()), orderOut.getTaxTotal()));
        return orderOut;
    }

}
