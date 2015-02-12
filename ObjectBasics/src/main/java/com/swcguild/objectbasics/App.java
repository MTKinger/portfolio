package com.swcguild.objectbasics;

public class App {

    public static void main(String[] args) {

        Dog rover = new Dog();
        rover.setDogName("Buster");
        rover.setAge(10);
        rover.setWeight(30);
        System.out.println(rover.getDogName());
        System.out.println(rover.getAge());
        System.out.println(rover.getWeight());

        Dog spot = rover;

        System.out.println(spot.getDogName());
        System.out.println(spot.getAge());
        System.out.println(spot.getWeight());

        spot.setDogName("Bubba");
        System.out.println(rover.getDogName());
        System.out.println(rover.getAge());
        System.out.println(rover.getWeight());
        
        rover = new Dog("Brand New Dog", 15, 30);
        System.out.println(rover.getDogName());
        System.out.println(rover.getAge());
        System.out.println(rover.getWeight());

    }

}
