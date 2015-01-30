package com.swcguild.masteryproject.dtos;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Order extends Product {

    private int orderNumber;
    private LocalDate date;
    private double area;
    private double materialTotal;
    private double laborTotal;
    private double taxTotal;
    private double totalCost;
    
    private String customerName;

    public Order(String name, String productType, double area) {
        this.customerName = name;
        this.productType = productType;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getMaterialTotal() {
        return materialTotal;
    }

    public void setMaterialTotal(double materialTotal) {
        this.materialTotal = materialTotal;
    }

    public double getLaborTotal() {
        return laborTotal;
    }

    public void setLaborTotal(double laborTotal) {
        this.laborTotal = laborTotal;
    }

    public double getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(double taxTotal) {
        this.taxTotal = taxTotal;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String orderToString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return customerName + ", " + state + "\n"
                + df.format(area) + " square feet of " + productType
                + " at a rate of $" + df.format(costPSF) + " per square foot\n"
                + df.format(area) + " square feet of labor at a rate of $"
                + df.format(laborPSF) + " per square foot\n"
                + "$" + df.format(materialTotal) + " total material cost\n"
                + "$" + df.format(laborTotal) + " total cost for labor\n"
                + taxRate + "% tax applied\n"
                + "$" + df.format(taxTotal) + " tax added\n\n"
                + "Total cost of order : $" + df.format(totalCost) + "\n\n"
                + "Order ID# : " + orderNumber
                + "\nProcess Date: " + date;
    }
    
    public String orderToStringWithoutOrderNumber() {
        DecimalFormat df = new DecimalFormat("#.00");
        return customerName + ", " + state + "\n"
                + df.format(area) + " square feet of " + productType
                + " at a rate of $" + df.format(costPSF) + " per square foot\n"
                + df.format(area) + " square feet of labor at a rate of $"
                + df.format(laborPSF) + "\n"
                + "$" + df.format(materialTotal) + " total material cost\n"
                + "$" + df.format(laborTotal) + " total cost for labor\n"
                + taxRate + "% tax applied\n"
                + "$" + df.format(taxTotal) + " tax added\n\n"
                + "Total cost of order : $" + df.format(totalCost) + "\n\n"
                + "\nProcess Date: " + date;
    }

}
