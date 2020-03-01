package com.company.factory.factorymethod.burgers.chicagostyle;

import com.company.factory.factorymethod.burgers.Burger;

public class ChicagoHamburger extends Burger {

    public ChicagoHamburger() {
        description = "ChicagoHamburger";
    }

    @Override
    public double cost() {
        return 0.94d;
    }
}
