package com.company.factory.abstractFactory.ingredients;

import com.company.factory.abstractFactory.ingredients.cheese.Cheese;
import com.company.factory.abstractFactory.ingredients.clams.Clams;
import com.company.factory.abstractFactory.ingredients.dough.Dough;
import com.company.factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import com.company.factory.abstractFactory.ingredients.sauce.Sauce;
import com.company.factory.abstractFactory.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
