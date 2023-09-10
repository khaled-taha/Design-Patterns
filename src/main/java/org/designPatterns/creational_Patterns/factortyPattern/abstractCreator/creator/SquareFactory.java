package org.designPatterns.creational_patterns.factortyPattern.abstractCreator.creator;

import org.designPatterns.creational_patterns.factortyPattern.abstractCreator.Shape;
import org.designPatterns.creational_patterns.factortyPattern.abstractCreator.Square;

public class SquareFactory extends AbstractShapeCreator{
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
