package org.designPatterns.creational_patterns.factortyPattern.abstractCreator;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
