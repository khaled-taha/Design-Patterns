package org.designPatterns.creational_Patterns.factortyPattern.abstractCreator;

import org.designPatterns.creational_Patterns.factortyPattern.abstractCreator.creator.RectangleFactory;
import org.designPatterns.creational_Patterns.factortyPattern.abstractCreator.creator.SquareFactory;

public class Client {
    public static void main(String[] args) {
        Shape square = new SquareFactory().getShape();
        square.draw();

        Shape rectangle = new RectangleFactory().getShape();
        rectangle.draw();
    }
}
