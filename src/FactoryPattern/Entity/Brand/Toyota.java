package FactoryPattern.Entity.Brand;

import FactoryPattern.Entity.ICar;

public class Toyota implements ICar {

    @Override
    public void view() {
        System.out.println("Toyota view");
    }
}
