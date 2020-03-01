package com.company.factory.simplefactory.ingredient;

import com.company.factory.simplefactory.burgers.Burger;

public abstract class IngredientDecorator extends Burger {
    public abstract String getDescription();
}
