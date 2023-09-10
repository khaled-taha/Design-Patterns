package org.designPatterns.creational_patterns.abstractFactoryMethod.shapeFactory;


import org.designPatterns.creational_patterns.abstractFactoryMethod.DrawingFactory;



public class ShapeFactory implements DrawingFactory {

    @Override
    public Shape getShape(String type) {
            if(type == null) throw new NullPointerException("Type is null");

            if(type.equalsIgnoreCase("SQUARE"))
                return new Square();

            if(type.equalsIgnoreCase("RECTANGLE"))
                return new Rectangle();

            return null;

    }
}
