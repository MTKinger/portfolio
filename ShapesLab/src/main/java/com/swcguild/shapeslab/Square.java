package com.swcguild.shapeslab;

public class Square extends Shape {

    protected double side1;

    Square(String color, double side) {
        super(color);
        this.side1 = side;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side) {
        this.side1 = side;
    }
    
    @Override
    public double area(){
        double area = Math.pow(side1, 2);
        return area;
    }
    
    @Override
    public double perimeter(){
        double perim= side1*4;
        return perim;
    }

}
