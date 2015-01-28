/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuisnessLogic;

/**
 *
 * @author apprentice
 */
public interface Calculator {
    
    public double calculateMaterial(double area, double costPSF);
    public double calculateLabor(double area, double laborPSF);
    public double calculateCost(double material, double labor);
    public double calculateTax(double cost, double taxRate);
    public double calculateTotalCost(double tax, double cost);
    
}
