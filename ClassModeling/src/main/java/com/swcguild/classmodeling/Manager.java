package com.swcguild.classmodeling;

public class Manager {

    private String name;
    private String gender;
    private double wage;
    private double hoursPer;

    public void manager(String nameIn, String genderIn, double wageIn, double hoursPerIn) {
        name = nameIn;
        gender = genderIn;
        wage = wageIn;
        hoursPer = hoursPerIn;
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

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHoursPer() {
        return hoursPer;
    }

    public void setHoursPer(double hoursPer) {
        this.hoursPer = hoursPer;
    }

}
