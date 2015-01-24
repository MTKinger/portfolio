package com.swcguild.vendmachinelab;

import java.text.DecimalFormat;

public class Snack {

    DecimalFormat df = new DecimalFormat("#.00");

    private String name;
    private String slot;
    private int price;
    private int stock;

    Snack(String name, String slot, int price, int stock) {
        this.name = name;
        this.slot = slot;
        this.price = price;
        this.stock = stock;
    }

    public String snackToString() {
        double dPrice = (double) (price);
        dPrice = dPrice / 100;
        if (name.length() >7) {
            return "\n" + name
                    + "\t\t||\t\t$" + df.format(dPrice)
                    + "\n" + stock + " in stock."
                    + "\t\t||\t\tslot " + slot;
        } else {
            return "\n" + name
                    + "\t\t\t||\t\t$" + df.format(dPrice)
                    + "\n" + stock + " in stock."
                    + "\t\t||\t\tslot " + slot;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
