package com.swcguild.classmodeling;

public class Employee {

    private String name;
    private String gender;
    private double pay;
    private double hoursPer;
    private int age;

    public void employee(String nameIn, String genderIn, double payIn, double hoursPerIn, int ageIn) {
        name = nameIn;
        gender = genderIn;
        pay = payIn;
        hoursPer = hoursPerIn;
        age = ageIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getHoursPer() {
        return hoursPer;
    }

    public void setHoursPer(double hoursPer) {
        this.hoursPer = hoursPer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
