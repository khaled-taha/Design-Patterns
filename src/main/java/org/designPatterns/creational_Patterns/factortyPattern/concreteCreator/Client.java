package org.designPatterns.creational_Patterns.factortyPattern.concreteCreator;

import org.designPatterns.creational_Patterns.factortyPattern.abstractCreator.creator.RectangleFactory;
import org.designPatterns.creational_Patterns.factortyPattern.abstractCreator.creator.SquareFactory;

public class Client {
    public static void main(String[] args) {
        Shape square = new ShapeFactory().getShape("square");
        square.draw();

        Shape rectangle = new ShapeFactory().getShape("rectangle");
        rectangle.draw();
    }
}
