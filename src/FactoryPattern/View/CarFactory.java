package FactoryPattern.View;

import FactoryPattern.Entity.Brand.Honda;
import FactoryPattern.Entity.ICar;
import FactoryPattern.Entity.Brand.Nexus;
import FactoryPattern.Entity.Brand.Toyota;

public class CarFactory {
    public ICar getCar(String carType) {
        ICar car = null;
        if (carType.equalsIgnoreCase("HONDA")) {
            car = new Honda();
        } else if (carType.equalsIgnoreCase("NEXUS")) {
            car = new Nexus();
        } else if (carType.equalsIgnoreCase("TOYOTA")) {
            car = new Toyota();
        }
        return car;
    }
}
