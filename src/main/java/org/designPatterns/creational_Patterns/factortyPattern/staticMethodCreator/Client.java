package org.designPatterns.creational_Patterns.factortyPattern.staticMethodCreator;


public class Client {
    public static void main(String[] args) {
        Shape square = ShapeFactory.getShape("square");
        assert square != null;
        square.draw();

        Shape rectangle = ShapeFactory.getShape("rectangle");
        assert rectangle != null;
        rectangle.draw();

    }
}
