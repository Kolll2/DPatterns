package com.company.factory.factorymethod.burgers.chicagostyle;

import com.company.factory.factorymethod.burgers.Burger;

public class ChicagoHamburger extends Burger {

    public ChicagoHamburger() {
        description = "ChicagoHamburger";
        name = "Chicago style Hamburger with coleslaw";
        bun = "high soft bun";
        cutlet = "high beef cutlet";
        toppings.add("coleslaw");
    }

    @Override
    public double cost() {
        return 0.94d;
    }
}
