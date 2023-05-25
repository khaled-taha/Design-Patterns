package org.designPatterns.creational_Patterns.factortyPattern.staticMethodCreator;

/**
 * Another common technique.
 * It's often called a static factory.
 * This technique is sometimes used so that you do not need to instantiate a factory class
 */
public class ShapeFactory {

    public static Shape getShape(String type){
        if(type == null) throw new NullPointerException("Type is null");

        if(type.equalsIgnoreCase("SQUARE"))
            return new Square();
        if(type.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();

        return null;
    }
}
