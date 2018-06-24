package com.infoshare.refactoring._1_smells._8_switches;

public class Shape {

    private double width;
    private double height;
    private double radius;
    private ShapeType type;

    public double countPerimeter() {
        if (type.equals(ShapeType.CIRCLE)) {
            return Math.PI * 2 * radius;
        }
        if (type.equals(ShapeType.RECTANGLE)) {
            return 2 * (width + height);
        }
        throw new RuntimeException("Unsupported shape: " + type);
    }

    public double getWidth() {
        return width;
    }

    public Shape setWidth(double width) {
        this.width = width;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public Shape setHeight(double height) {
        this.height = height;
        return this;
    }

    public double getRadius() {
        return radius;
    }

    public Shape setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    public ShapeType getType() {
        return type;
    }

    public Shape setType(ShapeType type) {
        this.type = type;
        return this;
    }
}
