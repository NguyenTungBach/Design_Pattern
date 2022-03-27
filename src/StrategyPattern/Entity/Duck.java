package StrategyPattern.Entity;

import StrategyPattern.Behavior.Fly.IFlyBehavior;
import StrategyPattern.Behavior.Quack.IQuackBehavior;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public Duck(){};

    // Fly
    public void performFly() {
        flyBehavior.fly();
    }

    // Quack
    public void performQuack() {
        quackBehavior.quack();
    }
}
