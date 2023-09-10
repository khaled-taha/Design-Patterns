package org.designPatterns.creational_patterns.abstractFactoryMethod;

import org.designPatterns.creational_patterns.abstractFactoryMethod.colorFactory.Color;
import org.designPatterns.creational_patterns.abstractFactoryMethod.shapeFactory.Shape;

public interface DrawingFactory {

    default Shape getShape(String type){
       return null;
   }

    default Color getColor(String type){
        return null;
    }

}
