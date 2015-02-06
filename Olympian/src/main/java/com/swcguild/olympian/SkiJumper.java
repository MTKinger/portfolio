package com.swcguild.olympian;

public class SkiJumper {

    private Event myEvent;

    public SkiJumper() {
        myEvent = new SkiJumpEvent();
    }
    
    public String competeInEvent(){
        return myEvent.compete();
    }

}
