package org.designPatterns.creational_Patterns.abstractFactoryMethod;

import org.designPatterns.creational_Patterns.abstractFactoryMethod.colorFactory.Color;
import org.designPatterns.creational_Patterns.abstractFactoryMethod.shapeFactory.Shape;

public interface DrawingFactory {

    default Shape getShape(String type){
       return null;
   }

    default Color getColor(String type){
        return null;
    }

}
