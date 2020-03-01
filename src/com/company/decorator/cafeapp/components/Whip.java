package com.company.decorator.cafeapp.components;

import com.company.decorator.cafeapp.beverage.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Whip";
    }

    @Override
    public double cost() {
        return .10d + beverage.cost();
    }
}
