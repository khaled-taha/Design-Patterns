package org.designPatterns.creational_patterns.abstractFactoryMethod.colorFactory;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red");
    }
}
