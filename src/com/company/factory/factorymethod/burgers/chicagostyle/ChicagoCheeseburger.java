package com.company.factory.factorymethod.burgers.chicagostyle;

import com.company.factory.factorymethod.burgers.Burger;

public class ChicagoCheeseburger extends Burger {

    public ChicagoCheeseburger() {
        description = "ChicagoCheeseburger";
        name = "Chicago style Cheeseburger with coleslaw";
        bun = "high soft bun";
        cutlet = "high beef cutlet";
        toppings.add("coleslaw");
        toppings.add("Reggiano Cheese");
    }

    @Override
    public double cost() {
        return 1.24d;
    }
}
