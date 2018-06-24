package com.infoshare.refactoring._1_smells._8_switches;

public class SwitchExample {

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

        // TODO jeden obiekt reprezentuje de facto 2 rozne biznesowo typy
        // TODO problemy z dodaniem kolejnego typu bo rozrzucona odpowiedzialnosc (zawsze sie zastanawiam o ilu rzeczach bede musial pamietac dodajac cos nowego do aplikacji)
        // TODO wymienic na abstrakcje
    }

    private static void printCalculations(Shape shape) {
        ShapeAreaCalculator shapeAreaCalculator = new ShapeAreaCalculator();
        System.out.println("Perimeter: " + shape.countPerimeter());
        System.out.println("Area: " + shapeAreaCalculator.calculateArea(shape));
    }
}
