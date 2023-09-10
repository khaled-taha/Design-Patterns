package org.designPatterns.creational_patterns.abstractFactoryMethod.colorFactory;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green");
    }
}
