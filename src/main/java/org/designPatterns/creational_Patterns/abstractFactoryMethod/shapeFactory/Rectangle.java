package org.designPatterns.creational_patterns.abstractFactoryMethod.shapeFactory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
