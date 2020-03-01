package com.company.strategy.cafeapp.components;

public class Mocha implements Component {
    double cost = 0.2d;

    @Override
    public double getCost() {
        return cost;
    }
}
