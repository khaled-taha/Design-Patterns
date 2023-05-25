package org.designPatterns.creational_Patterns.abstractFactoryMethod.shapeFactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
