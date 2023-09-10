package org.designPatterns.creational_patterns.factortyPattern.abstractCreator.creator;

import org.designPatterns.creational_patterns.factortyPattern.abstractCreator.Shape;

/**
 * Abstract Creator
 * The way that it's implemented is the creator class as an abstract class.
 * What happens here is you create a subclass of the creator class for each product type,
 * which contains an implementation of the factory method.
 *
 * Each product type will be the instance that you want to create.
 * And so there may be many and the product is usually hidden behind an interface as well.
 *
 * To use the factory method creating objects you simply specify an instance
 * of the type of product and invoke the factory method.
 */
public abstract class AbstractShapeCreator {
    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }
}
