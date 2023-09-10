package org.designPatterns.behavioral_patterns.strategy_pattern.flyBehavior;

public class FlyWithWings implements Flyable{

    @Override
    public void fly() {
        System.out.println("Fly With Wings");
    }
}
