package com.company.decorator.cafeapp.components;

import com.company.decorator.cafeapp.beverage.Beverage;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Milk";
    }

    @Override
    public double cost() {
        return .10d + beverage.cost();
    }
}
