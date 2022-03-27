package StrategyPattern.Entity;

import StrategyPattern.Behavior.Fly.FlyNoWay;
import StrategyPattern.Behavior.Quack.SoundMute;

public class VitNhua extends Duck{

    public VitNhua() {
        quackBehavior = new SoundMute();
        flyBehavior = new FlyNoWay();
    }

}
