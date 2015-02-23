package com.swcguild.vendingmachine.dto;

public class Change {
    
    private int moneyIn;
    private int dollars;
    private int quarters;
    private int dimes;
    private int nickles;
    private int pennies;

    public int getMoneyIn() {
        return moneyIn;
    }

    public void setMoneyIn(int moneyIn) {
        this.moneyIn = moneyIn;
    }

    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
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
        int hash = 7;
        hash = 79 * hash + this.moneyIn;
        hash = 79 * hash + this.dollars;
        hash = 79 * hash + this.quarters;
        hash = 79 * hash + this.dimes;
        hash = 79 * hash + this.nickles;
        hash = 79 * hash + this.pennies;
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
        if (this.moneyIn != other.moneyIn) {
            return false;
        }
        if (this.dollars != other.dollars) {
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
