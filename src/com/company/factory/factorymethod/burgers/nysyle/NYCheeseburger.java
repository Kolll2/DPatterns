package com.company.factory.factorymethod.burgers.nysyle;

import com.company.factory.factorymethod.burgers.Burger;

public class NYCheeseburger extends Burger {
    public NYCheeseburger() {
        description = "NYCheeseburger";
    }

    @Override
    public double cost() {
        return 1.34d;
    }
}
