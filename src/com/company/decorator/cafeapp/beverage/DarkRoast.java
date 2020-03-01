package com.company.decorator.cafeapp.beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        if (getSize() == Size.GRANDE) {
            return 0.99d;
        } else if (getSize() == Size.VENTI) {
            return 1.19d;
        }
        return 0.79d;
    }
}
