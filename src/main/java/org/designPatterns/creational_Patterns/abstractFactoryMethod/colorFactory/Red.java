package org.designPatterns.creational_Patterns.abstractFactoryMethod.colorFactory;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red");
    }
}
