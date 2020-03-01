package com.company.strategy.cafeapp.components;

public class Whip implements Component {
    double cost = 0.05d;

    @Override
    public double getCost() {
        return cost;
    }
}
