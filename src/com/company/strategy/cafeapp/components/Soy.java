package com.company.strategy.cafeapp.components;

public class Soy implements Component{
    double cost = 0.15d;

    @Override
    public double getCost() {
        return cost;
    }
}
