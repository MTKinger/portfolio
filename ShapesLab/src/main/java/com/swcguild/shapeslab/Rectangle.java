package com.swcguild.shapeslab;

public class Rectangle extends Square {
    
    private double side2;
    
    Rectangle(String color, double side1, double side2){
        super(color, side1);
        this.side2 = side2;
    }
    
    @Override
    public double area(){
        double area = side1*side2;
        return area;
    }
    
    @Override
    public double perimeter(){
        double perim = (side1*2)+(side2*2);
        return perim;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
    
    
    

}
