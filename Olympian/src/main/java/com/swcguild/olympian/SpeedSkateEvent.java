package com.swcguild.olympian;

public class SpeedSkateEvent implements Event{

    @Override
    public String compete(String message) {
        System.out.println(message);
        System.out.println("Skating really fast!!!");
        return "SpeedSkate";
    }
    
    

}
