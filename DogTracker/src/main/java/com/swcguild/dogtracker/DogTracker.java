package com.swcguild.dogtracker;

public class DogTracker {
    
    private int age;
    private int weight;
    
    private int howManyDogs = 0;
    
    public DogTracker(int howOld, int howBig){
        age = howOld;
        weight = howBig;
        howManyDogs ++;
    }
    
    public String getValues(){
        return "Age: " + age + ", weight: " + weight + ", Total Dogs: " + howManyDogs;
    }

}
