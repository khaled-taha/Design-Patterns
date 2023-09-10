package org.designPatterns.creational_patterns.factortyPattern.concreteCreator;

/**
 * Concrete Creator
 * This is the most common implementation.
 * The advantage of this approach is that you don't need to create a subclass,
 * new subclass for every single product, new factory.
 */
public class ShapeFactory {

    public Shape getShape(String type){
        if(type == null) throw new NullPointerException("Type is null");

        if(type.equalsIgnoreCase("SQUARE"))
            return new Square();
        if(type.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();

        return null;
    }
}
