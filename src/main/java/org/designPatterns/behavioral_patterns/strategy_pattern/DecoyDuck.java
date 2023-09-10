package org.designPatterns.behavioral_patterns.strategy_pattern;

import org.designPatterns.behavioral_patterns.strategy_pattern.flyBehavior.Flyable;

public class DecoyDuck extends Duck{


    @Override
    void display() {
        System.out.println("I am a DecoyDuck");
    }
}