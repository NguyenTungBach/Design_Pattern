package FactoryPattern.Entity.Brand;

import FactoryPattern.Entity.ICar;

public class Honda implements ICar {
    @Override
    public void view() {
        System.out.println("Honda view");
    }
}
