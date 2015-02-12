package com.swcguild.olympian;

public class Olympian {
    
    private Event event;
    private String country = "USA";
    
    public Olympian(Event event){
        this.event = event;
    }

    public String competeInEvent(){
        //System.out.println("Now competing for " + country + ":");
        return event.compete("Now competing for " + country + ":");
    }
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    

}
