package com.swcguild.olympian;

public class SkiJumpEvent implements Event{

    @Override
    public String compete(String message) {
        System.out.println(message);
        System.out.println("Ski Jumping!!!");
        return "SkiJump";
    }
    
    

}
