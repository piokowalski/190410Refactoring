package com.infoshare.refactoring._1_smells._2_primitives.methods;

public class MethodPrimitivesExample {


    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("Triangle area: " + areaCalculator.calculateArea(6, 2, true));
        System.out.println("Rectangle area: " + areaCalculator.calculateArea(6, 2, false));

        // TODO: Zamienić na calle do dwóch różnych metod
        // TODO: ewentualnie zamienić parametry na klasy
        // TODO: może konstruktor -> static factory?

    }

}
