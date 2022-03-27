package StrategyPattern.Behavior.Quack;

public class SoundMute implements IQuackBehavior{
    public void quack() {
        System.out.println("Tao không kêu được");
    }
}
