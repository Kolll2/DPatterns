package com.company.factory.factorymethod.burgers.classic;

import com.company.factory.factorymethod.burgers.Burger;

public class Hamburger extends Burger {

    public Hamburger() {
        description = "Hamburger";
    }

    @Override
    public double cost() {
        return 0.99d;
    }
}
