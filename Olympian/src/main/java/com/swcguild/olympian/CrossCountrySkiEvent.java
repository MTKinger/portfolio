package com.swcguild.olympian;

public class CrossCountrySkiEvent implements Event{

    @Override
    public String compete(String message) {
        System.out.println(message);
        System.out.println("Cross Country Skiing!!!");
        return "CrossCountrySki";
    }
    
    

}
