package org.designPatterns.behavioral_patterns.strategy_pattern;

import org.designPatterns.behavioral_patterns.strategy_pattern.quackBehavior.MuteQuack;
import org.designPatterns.behavioral_patterns.strategy_pattern.quackBehavior.Quack;

public class Main {

    public static void main(String[] args) {
        Duck d1 = new RedHeadDuck();
        d1.swim();
        d1.display();

        d1.fly();
        d1.quack();

        d1.setQuackable(new Quack());
        d1.quack();

        d1.setQuackable(new MuteQuack());
        d1.quack();

    }
}
