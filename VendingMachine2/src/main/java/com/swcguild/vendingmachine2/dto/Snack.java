package com.swcguild.vendingmachine2.dto;

import java.util.Objects;

public class Snack {
    
    private int snackId;
    private String snackName;
    private double snackPrice;
    private int snackLeft;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getSnackId() {
        return snackId;
    }

    public void setSnackId(int snackId) {
        this.snackId = snackId;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public double getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(double snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getSnackLeft() {
        return snackLeft;
    }

    public void setSnackLeft(int snackLeft) {
        this.snackLeft = snackLeft;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.snackId;
        hash = 79 * hash + Objects.hashCode(this.snackName);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.snackPrice) ^ (Double.doubleToLongBits(this.snackPrice) >>> 32));
        hash = 79 * hash + this.snackLeft;
        hash = 79 * hash + Objects.hashCode(this.image);
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
        if (this.snackId != other.snackId) {
            return false;
        }
        if (!Objects.equals(this.snackName, other.snackName)) {
            return false;
        }
        if (Double.doubleToLongBits(this.snackPrice) != Double.doubleToLongBits(other.snackPrice)) {
            return false;
        }
        if (this.snackLeft != other.snackLeft) {
            return false;
        }
        if (!Objects.equals(this.image, other.image)) {
            return false;
        }
        return true;
    }

    

}
