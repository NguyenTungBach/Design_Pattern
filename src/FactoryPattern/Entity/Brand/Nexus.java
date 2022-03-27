package FactoryPattern.Entity.Brand;

import FactoryPattern.Entity.ICar;

public class Nexus implements ICar {

    @Override
    public void view() {
        System.out.println("Nexus view");
    }
}
