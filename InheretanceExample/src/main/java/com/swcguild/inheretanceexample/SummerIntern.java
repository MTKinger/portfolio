package com.swcguild.inheretanceexample;

public class SummerIntern extends Employee{
    
    private String school;
    
    
    
    public SummerIntern(String name, String ssn, String school){
        super(name, ssn);
        this.school = school;
        System.out.println("Summer Intern Constructor.");
    }
    
    public void requestPerformanceReview(){
        System.out.println("Intern has requested a performance review.");
    }

    @Override
    public void doWork(){
        System.out.println("Summer Intern doing work.");
    }
    
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    

}
