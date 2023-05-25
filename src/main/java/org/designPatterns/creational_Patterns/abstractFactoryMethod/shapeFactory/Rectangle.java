package org.designPatterns.creational_Patterns.abstractFactoryMethod.shapeFactory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
