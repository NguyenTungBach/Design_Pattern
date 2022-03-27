package FactoryPattern;

import FactoryPattern.View.CarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.viewCar("HONDA");
        carFactory.viewCar("NEXUS");
        carFactory.viewCar("TOYOTA");
    }
}
