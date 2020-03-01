package com.company.decorator.cafeapp.beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
        size = Size.GRANDE;
    }

    @Override
    public double cost() {
        if (getSize() == Size.GRANDE) {
            return 1.99d;
        } else if (getSize() == Size.VENTI) {
            return 2.39d;
        }
        return 1.49d;
    }
}
