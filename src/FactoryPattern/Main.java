package FactoryPattern;

import FactoryPattern.Entity.ICar;
import FactoryPattern.View.CarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        ICar car1= carFactory.getCar("HONDA");
        ICar car2=carFactory.getCar("NEXUS");
        ICar car3=carFactory.getCar("TOYOTA");

        car1.view();
        car2.view();
        car3.view();
    }
}
