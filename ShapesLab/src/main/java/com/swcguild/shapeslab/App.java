package com.swcguild.shapeslab;

public class App {
    
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("Blue", 4, 5);
        Square square1 = new Square("Orange", 5);
        Triangle triangle1 = new Triangle("Green", 3, 4, 5);
        Circle circle1 = new Circle("Red", 2.5);
        Shape shape1 = circle1;
        
        
        System.out.println("Rectangle area, perimeter and color:");
        System.out.println(rectangle1.area());
        System.out.println(rectangle1.perimeter());
        System.out.println(rectangle1.getColor());
        
        System.out.println("Square area, perimeter and color:");
        System.out.println(square1.area());
        System.out.println(square1.perimeter());
        System.out.println(square1.getColor());
        
        System.out.println("Triangle area, perimeter and color:");
        System.out.println(triangle1.area());
        System.out.println(triangle1.perimeter());
        System.out.println(triangle1.getColor());
        
        System.out.println("Circle are, perimeter, and color:");
        System.out.println(circle1.area());
        System.out.println(circle1.perimeter());
        System.out.println(circle1.getColor());
        
        System.out.println("Shape color:");
        System.out.println(shape1.getColor());
    }

}
