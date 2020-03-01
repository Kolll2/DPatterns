package com.company.factory.simplefactory.ingredient;

import com.company.factory.simplefactory.burgers.Burger;

public class Onion extends IngredientDecorator {
    Burger burger;

    public Onion(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Onion";
    }

    @Override
    public double cost() {
        return 0.02d;
    }
}
