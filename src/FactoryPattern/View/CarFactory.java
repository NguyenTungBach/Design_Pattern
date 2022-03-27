package FactoryPattern.View;

import FactoryPattern.Entity.Brand.Honda;
import FactoryPattern.Entity.ICar;
import FactoryPattern.Entity.Brand.Nexus;
import FactoryPattern.Entity.Brand.Toyota;

public class CarFactory {
    public void viewCar(String carType) {
        ICar car;
        if (carType.equalsIgnoreCase("HONDA")) {
            car = new Honda();
            car.view();
        } else if (carType.equalsIgnoreCase("NEXUS")) {
            car = new Nexus();
            car.view();
        } else if (carType.equalsIgnoreCase("TOYOTA")) {
            car = new Toyota();
            car.view();
        }
    }
}
