package com.swcguild.vendingmachine.dto;

import java.util.Objects;

public class Snack {
    
    private String snackName;
    private int snackPrice;
    private int snackRemaining;

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public int getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(int snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getSnackRemaining() {
        return snackRemaining;
    }

    public void setSnackRemaining(int snackRemaining) {
        this.snackRemaining = snackRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.snackName);
        hash = 71 * hash + this.snackPrice;
        hash = 71 * hash + this.snackRemaining;
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
        final Snack other = (Snack) obj;
        if (!Objects.equals(this.snackName, other.snackName)) {
            return false;
        }
        if (this.snackPrice != other.snackPrice) {
            return false;
        }
        if (this.snackRemaining != other.snackRemaining) {
            return false;
        }
        return true;
    }

    
    
    
    
}
