package com.swcguild.lunchables;

import java.util.ArrayList;

public class CarCompany {
    
    private String companyName;
    private ArrayList<Car> cars;
    private ArrayList<Truck> trucks;
    private ArrayList<Suv> suvs;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Truck> getTrucks() {
        return trucks;
    }

    public void setTrucks(ArrayList<Truck> trucks) {
        this.trucks = trucks;
    }

    public ArrayList<Suv> getSuvs() {
        return suvs;
    }

    public void setSuvs(ArrayList<Suv> suvs) {
        this.suvs = suvs;
    }
    
    

}
