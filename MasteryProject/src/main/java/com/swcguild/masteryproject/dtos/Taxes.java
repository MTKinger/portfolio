package com.swcguild.masteryproject.dtos;

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
    
    

}
