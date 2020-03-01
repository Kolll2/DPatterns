package com.company.decorator.cafeapp.components;

import com.company.decorator.cafeapp.beverage.Beverage;
import com.company.decorator.cafeapp.beverage.Size;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.setSize(beverage.getSize());
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", Whip";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Size.TALL) {
            cost += 0.07d;
        } else if (getSize() == Size.GRANDE){
            cost += 0.1d;
        } else if (getSize() == Size.VENTI){
            cost += 0.12d;
        }
        return cost;
    }
}
