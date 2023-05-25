package org.designPatterns.creational_Patterns.abstractFactoryMethod.colorFactory;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green");
    }
}
