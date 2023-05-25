package org.designPatterns.creational_Patterns.abstractFactoryMethod;

import org.designPatterns.creational_Patterns.abstractFactoryMethod.colorFactory.Color;


public class Client {

    public static void main(String[] args) {
        DrawingFactory colorFactory = DrawingProvider.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();


    }


}
