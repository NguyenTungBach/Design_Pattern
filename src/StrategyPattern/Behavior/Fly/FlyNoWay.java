package StrategyPattern.Behavior.Fly;

public class FlyNoWay implements IFlyBehavior{
    public void fly() {
        System.out.println("ĐM, tao không bay được");
    }
}
