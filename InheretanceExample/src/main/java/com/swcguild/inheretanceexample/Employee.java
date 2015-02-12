package com.swcguild.inheretanceexample;

public abstract class Employee {
    
    protected String name;
    protected String ssn;

    public Employee (String name, String ssn){
        this.name = name;
        this.ssn = ssn;
        System.out.println("Employee Constructor.");
    }
    
    public abstract void doWork();
    
    public void createObjectives(){
        System.out.println("Employee creating objectives");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return ssn;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.ssn = socialSecurityNumber;
    }
    
    @Override
    public String toString(){
        return "EMPLOYEE ";
    }

}
