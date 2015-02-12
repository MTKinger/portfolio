package com.swcguild.objectbasics;

public class Dog {

    private String dogName;
    private int age;
    private int weight;

    public Dog() {

    }

    public Dog(String nameIn, int ageIn, int weightIn) {
        dogName = nameIn;
        age = ageIn;
        weight = weightIn;
    }

    public void bark() {
        System.out.println("I'm barking...");
    }

    public void sit() {
        System.out.println("I'm sitting...");
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
