package com.company.factory.factorymethod.burgers.chicagostyle;

import com.company.factory.factorymethod.burgers.Burger;

public class ChicagoCheeseburger extends Burger {

    public ChicagoCheeseburger() {
        description = "ChicagoCheeseburger";
    }

    @Override
    public double cost() {
        return 1.24d;
    }
}
