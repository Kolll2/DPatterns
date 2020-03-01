package com.company.factory.factorymethod.burgers.nysyle;

import com.company.factory.factorymethod.burgers.Burger;

public class NYHamburger extends Burger {

    public NYHamburger() {
        description = "NYHamburger";
    }

    @Override
    public double cost() {
        return 1.09d;
    }
}
