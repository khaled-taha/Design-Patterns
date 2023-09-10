package org.designPatterns.creational_patterns.factortyPattern.abstractCreator.creator;

import org.designPatterns.creational_patterns.factortyPattern.abstractCreator.Rectangle;
import org.designPatterns.creational_patterns.factortyPattern.abstractCreator.Shape;

public class RectangleFactory extends AbstractShapeCreator{
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
