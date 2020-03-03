package com.company.factory.factorymethod.burgers.nysyle;

import com.company.factory.factorymethod.burgers.Burger;

public class NYHamburger extends Burger {

    public NYHamburger() {
        description = "NYHamburger";
        name = "NY style amburger with coleslaw";
        bun = "low crunch bun";
        cutlet = "large beef cutlet";
        toppings.add("salad");
        toppings.add("tomato");
    }

    @Override
    public double cost() {
        return 1.09d;
    }
}
