package org.designPatterns.creational_patterns.abstractFactoryMethod.colorFactory;


import org.designPatterns.creational_patterns.abstractFactoryMethod.DrawingFactory;

public class ColorFactory implements DrawingFactory {

    @Override
    public Color getColor(String type){
        if(type == null) throw new NullPointerException("Type is null");

        if(type.equalsIgnoreCase("Green"))
            return new Green();
        if(type.equalsIgnoreCase("Red"))
            return new Red();

        return null;
    }
}
