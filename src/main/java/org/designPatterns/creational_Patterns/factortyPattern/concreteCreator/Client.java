package org.designPatterns.creational_patterns.factortyPattern.concreteCreator;

public class Client {
    public static void main(String[] args) {
        Shape square = new ShapeFactory().getShape("square");
        square.draw();

        Shape rectangle = new ShapeFactory().getShape("rectangle");
        rectangle.draw();
    }
}
