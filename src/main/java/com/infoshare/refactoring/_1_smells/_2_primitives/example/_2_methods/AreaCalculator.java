package com.infoshare.refactoring._1_smells._2_primitives.example._2_methods;

public class AreaCalculator {

    public double calculateArea(int width, int height, boolean isTriangle) {
        if (isTriangle) {
            return width * height / 2;
        }

        return width * height;
    }
}
