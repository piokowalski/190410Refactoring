package com.infoshare.refactoring._1_smells._7_switches.exercise;

public class ShapeAreaCalculator {

    public double calculateArea(Shape shape) {
        switch (shape.getType()) {
            case CIRCLE:
                return shape.getRadius() * shape.getRadius() * Math.PI;
            case RECTANGLE:
                return shape.getWidth() * shape.getHeight();
            default:
                throw new RuntimeException("Unsupported shape: " + shape.getType());
        }
    }
}
