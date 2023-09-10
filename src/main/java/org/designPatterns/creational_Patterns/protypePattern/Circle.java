package org.designPatterns.creational_patterns.protypePattern;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                super.toString() + " " +
                "radius=" + radius +
                '}';
    }
}
