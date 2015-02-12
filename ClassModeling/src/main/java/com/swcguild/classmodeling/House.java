package com.swcguild.classmodeling;

public class House {
    
    private int walls;
    private int floors;
    private int windows;
    private int garage;
    private int backyard;
    private int address;
    
    public House(int wallsIn, int floorsIn, int windowsIn, int garageIn, int backyardIn, int addressIn){
        walls=wallsIn;
        floors=floorsIn;
        windows=windowsIn;
        garage=garageIn;
        backyard=backyardIn;
        address=addressIn;
        
    }

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getGarage() {
        return garage;
    }

    public void setGarage(int garage) {
        this.garage = garage;
    }

    public int getBackyard() {
        return backyard;
    }

    public void setBackyard(int backyard) {
        this.backyard = backyard;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    
    
}
