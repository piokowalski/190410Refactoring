package com.infoshare.refactoring._1_smells._7_switches.exercise;

public class SwitchExercise {

    public static void main(String[] args) {
        Shape circle = new Shape();
        circle.setType(ShapeType.CIRCLE);
        circle.setRadius(16);

        Shape rectangle = new Shape();
        rectangle.setType(ShapeType.RECTANGLE);
        rectangle.setWidth(5);
        rectangle.setHeight(2);

        printCalculations(circle);
        printCalculations(rectangle);
    }

    private static void printCalculations(Shape shape) {
        ShapeAreaCalculator shapeAreaCalculator = new ShapeAreaCalculator();
        System.out.println("Perimeter: " + shape.countPerimeter());
        System.out.println("Area: " + shapeAreaCalculator.calculateArea(shape));
    }
}
