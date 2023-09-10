package org.designPatterns.creational_patterns.abstractFactoryMethod.shapeFactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
