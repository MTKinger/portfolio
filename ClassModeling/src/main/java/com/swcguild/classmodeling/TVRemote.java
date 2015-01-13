package com.swcguild.classmodeling;

public class TVRemote {

    private boolean isOn = false;
    private int channel = 0;
    private int previousChannel = 0;
    private int volume = 0;

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }
    
    public void previousChannel(){
        
    }
    public void volumeUp(){
        volume++;
    }
    public void volumeDown(){
        volume--;
    }
    

    public boolean isIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPreviousChannel() {
        return previousChannel;
    }

    public void setPreviousChannel(int previousChannel) {
        this.previousChannel = previousChannel;
    }
    

}
