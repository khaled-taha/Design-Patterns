package org.designPatterns.behavioral_patterns.strategy_pattern.quackBehavior;

public class MuteQuack implements Quackable {

    @Override
    public void quack() {
        System.out.println("Mute Quack");
    }
}
