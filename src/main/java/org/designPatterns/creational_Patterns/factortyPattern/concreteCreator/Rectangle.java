package org.designPatterns.creational_patterns.factortyPattern.concreteCreator;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
