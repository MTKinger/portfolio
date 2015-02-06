package com.swcguild.olympian;

public class SkiJumpEvent implements Event{

    @Override
    public String compete() {
        System.out.println("Ski Jumping!!!");
        return "SkiJump";
    }
    
    

}
