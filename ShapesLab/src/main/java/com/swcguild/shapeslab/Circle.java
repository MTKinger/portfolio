package com.swcguild.shapeslab;

public class Circle extends Shape{
    
    private double radius;
    
    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area(){
        double area = Math.PI*(radius*radius);
        return area;
    }
    
    @Override
    public double perimeter(){
        double perim = 2*Math.PI*radius;
        return perim;
    }

}
