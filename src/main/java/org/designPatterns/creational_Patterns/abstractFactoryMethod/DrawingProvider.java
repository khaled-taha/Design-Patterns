package org.designPatterns.creational_Patterns.abstractFactoryMethod;

import org.designPatterns.creational_Patterns.abstractFactoryMethod.colorFactory.ColorFactory;
import org.designPatterns.creational_Patterns.abstractFactoryMethod.shapeFactory.ShapeFactory;

/**
 * Usage of Abstract Factory Pattern
 * When the system needs to be independent of how its object are created, composed, and represented.
 * When the family of related objects has to be used together, then this constraint needs to be enforced.
 * When you want to provide a library of objects that does not show implementations and only reveals interfaces.
 * When the system needs to be configured with one of a multiple family of objects.
 */
public class DrawingProvider {

    public static DrawingFactory getFactory(String factory){
        assert factory != null;

        if(factory.equalsIgnoreCase("color"))
            return new ColorFactory();

        if(factory.equalsIgnoreCase("shape"))
            return new ShapeFactory();

        return null;
    }

}
