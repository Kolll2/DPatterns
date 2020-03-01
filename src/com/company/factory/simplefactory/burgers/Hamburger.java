package com.company.factory.simplefactory.burgers;

public class Hamburger extends Burger {

    public Hamburger() {
        description = "Hamburger";
    }

    @Override
    public double cost() {
        return 0.99d;
    }
}
