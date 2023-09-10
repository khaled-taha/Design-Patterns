package org.designPatterns.creational_patterns.factortyPattern.abstractCreator;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
