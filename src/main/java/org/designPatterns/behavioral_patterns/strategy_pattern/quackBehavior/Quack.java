package org.designPatterns.behavioral_patterns.strategy_pattern.quackBehavior;

public class Quack implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
