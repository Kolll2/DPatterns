package com.company.strategy.cafeapp.components;

public class Milk implements Component{
    double cost = 0.1d;

    @Override
    public double getCost() {
        return cost;
    }
}
