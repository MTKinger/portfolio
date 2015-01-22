package com.swcguild.shapeslab;

public class Triangle extends Shape{
    
    private double sideA;
    private double sideB;
    private double sideC;
    
    Triangle(String color, double sideA, double sideB, double sideC){
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    
    @Override
    public double area(){
        double perim = sideA+sideB+sideC;
        double area = Math.sqrt(perim*(perim-sideA)*(perim-sideB)*(perim-sideC));
        return area;
    }
    
    @Override
    public double perimeter(){
        double perim = sideA+sideB+sideC;
        return perim;
    }

}
