package com.swcguild.inheretanceexample;

public class Manager extends Employee{
    
    public Manager(String name, String ssn){
        super(name, ssn);
        System.out.println("Manager Constructor.");
    }
    
    public void hire(){
        System.out.println("Manager has hired new employee.");
    }
    
    public void fire(){
        System.out.println("Manager has fired employee.");
    }
    
    public void givePerformanceReview(){
        System.out.println("Manager has given performance review.");
    }
    
    @Override
    public void doWork(){
        System.out.println("Manager doing work.");
    }
    
    @Override
    public void createObjectives(){
        super.createObjectives();
        System.out.println("Manager is creating objectives.");
    }
    
    @Override
    public String toString(){
        return super.toString() + "MANAGER";
    }
}
