package org.designPatterns.behavioral_patterns.strategy_pattern.flyBehavior;

public class NoFly implements Flyable{

    @Override
    public void fly() {
        System.out.println("No Fly!");
    }
}