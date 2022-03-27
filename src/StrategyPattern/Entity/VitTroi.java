package StrategyPattern.Entity;

import StrategyPattern.Behavior.Fly.FlyWithWings;
import StrategyPattern.Behavior.Quack.SoundQuack;

public class VitTroi extends Duck{

    public VitTroi() {
        quackBehavior = new SoundQuack();
        flyBehavior = new FlyWithWings();
    }

}
