package com.company.decorator.cafeapp.components;

import com.company.decorator.cafeapp.beverage.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Soy";
    }

    @Override
    public double cost() {
        return .15d + beverage.cost();
    }
}
