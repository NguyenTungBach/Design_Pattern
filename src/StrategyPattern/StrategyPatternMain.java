package StrategyPattern;

import StrategyPattern.Entity.Duck;
import StrategyPattern.Entity.VitNhua;
import StrategyPattern.Entity.VitTroi;

public class StrategyPatternMain {
    public static void main(String[] args) {
        // Vit troi
        Duck vitTroi = new VitTroi();
        vitTroi.performQuack();
        vitTroi.performFly();

        // Vit nhua
        Duck vitNhua = new VitNhua();
        vitNhua.performQuack();
        vitNhua.performFly();
    }
}
