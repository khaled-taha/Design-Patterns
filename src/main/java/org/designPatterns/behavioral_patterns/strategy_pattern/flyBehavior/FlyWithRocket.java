package org.designPatterns.behavioral_patterns.strategy_pattern.flyBehavior;

public class FlyWithRocket implements Flyable{

    @Override
    public void fly() {
        System.out.println("Fly With Rocket");
    }
}
