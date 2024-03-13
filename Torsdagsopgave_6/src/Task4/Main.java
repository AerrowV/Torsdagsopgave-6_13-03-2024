package Task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Circle circle = new Circle(2.0);
        Square square = new Square(4);


        ShapeBuilder shape = new ShapeBuilder(new ArrayList<>());

        Shape circle1 = new Circle(13.0);
        Shape circle2 = new Circle(11.0);
        shape.addShape(circle1);
        shape.addShape(circle2);


        System.out.println("Area of square: " + square.getArea());
        System.out.println("Area of circle: " + circle.getArea());

        System.out.println("Total area of shapes: " + shape.getTotalArea());

    }
}
