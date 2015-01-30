package com.swcguild.masteryproject.dtos;

import java.text.DecimalFormat;

public  class  Taxes {
    
    protected String state;
    protected double taxRate;

    public Taxes() {
    }
    

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "\nState: " + state + " :: Rate: " + df.format(taxRate);
    }
    
    
    
    

}
