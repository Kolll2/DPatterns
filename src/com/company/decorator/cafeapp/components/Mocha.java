package com.company.decorator.cafeapp.components;

import com.company.decorator.cafeapp.beverage.Beverage;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Mocha";
    }

    @Override
    public double cost() {
        return .20d + beverage.cost();
    }
}
