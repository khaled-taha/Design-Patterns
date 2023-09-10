package org.designPatterns.behavioral_patterns.strategy_pattern;

import org.designPatterns.behavioral_patterns.strategy_pattern.flyBehavior.Flyable;
import org.designPatterns.behavioral_patterns.strategy_pattern.flyBehavior.NoFly;
import org.designPatterns.behavioral_patterns.strategy_pattern.quackBehavior.NoQuack;
import org.designPatterns.behavioral_patterns.strategy_pattern.quackBehavior.Quackable;

public abstract class Duck {

    private Flyable flyable = new NoFly();
    private Quackable quackable = new NoQuack();


    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    void swim(){
        System.out.println("SWIM.................!");
    }

    abstract void display();

    public void fly(){
       this.flyable.fly();
    }

    public void quack(){
        this.quackable.quack();
    }
}
