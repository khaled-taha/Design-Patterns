package org.designPatterns.behavioral_patterns.strategy_pattern.quackBehavior;

public class NoQuack implements Quackable {

    @Override
    public void quack() {
        System.out.println("No Quack");
    }
}
