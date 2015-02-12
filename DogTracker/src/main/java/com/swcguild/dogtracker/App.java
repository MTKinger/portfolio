package com.swcguild.dogtracker;

public class App {

    public static void main(String[] args) {

        DogTracker rover = new DogTracker(5, 50);
        System.out.println("Rover Info: " + rover.getValues());

        DogTracker buster = new DogTracker(8, 25);
        System.out.println("Buster Info: " + buster.getValues());

        System.out.println("Rover Info: " + rover.getValues());

    }

}
