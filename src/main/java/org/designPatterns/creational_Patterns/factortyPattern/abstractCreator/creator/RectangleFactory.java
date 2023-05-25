package org.designPatterns.creational_Patterns.factortyPattern.abstractCreator.creator;

import org.designPatterns.creational_Patterns.factortyPattern.abstractCreator.Rectangle;
import org.designPatterns.creational_Patterns.factortyPattern.abstractCreator.Shape;

public class RectangleFactory extends AbstractShapeCreator{
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
