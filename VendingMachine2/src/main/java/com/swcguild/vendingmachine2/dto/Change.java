package com.swcguild.vendingmachine2.dto;

public class Change {
    
    private double totalChange;
    private int quarters;
    private int dimes;
    private int nickles;
    private int pennies;

    public double getTotalChange() {
        return totalChange;
    }

    public void setTotalChange(double totalChange) {
        this.totalChange = totalChange;
    }

    public int getQuarters() {
        return quarters;
    }

    public void setQuarters(int quarters) {
        this.quarters = quarters;
    }

    public int getDimes() {
        return dimes;
    }

    public void setDimes(int dimes) {
        this.dimes = dimes;
    }

    public int getNickles() {
        return nickles;
    }

    public void setNickles(int nickles) {
        this.nickles = nickles;
    }

    public int getPennies() {
        return pennies;
    }

    public void setPennies(int pennies) {
        this.pennies = pennies;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.totalChange) ^ (Double.doubleToLongBits(this.totalChange) >>> 32));
        hash = 23 * hash + this.quarters;
        hash = 23 * hash + this.dimes;
        hash = 23 * hash + this.nickles;
        hash = 23 * hash + this.pennies;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Change other = (Change) obj;
        if (Double.doubleToLongBits(this.totalChange) != Double.doubleToLongBits(other.totalChange)) {
            return false;
        }
        if (this.quarters != other.quarters) {
            return false;
        }
        if (this.dimes != other.dimes) {
            return false;
        }
        if (this.nickles != other.nickles) {
            return false;
        }
        if (this.pennies != other.pennies) {
            return false;
        }
        return true;
    }

    
}
