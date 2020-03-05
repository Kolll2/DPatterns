package com.company.factory.abstractFactory.ingredients;

import com.company.factory.abstractFactory.ingredients.cheese.Cheese;
import com.company.factory.abstractFactory.ingredients.cheese.ReggianoCheese;
import com.company.factory.abstractFactory.ingredients.clams.Clams;
import com.company.factory.abstractFactory.ingredients.clams.FreshClams;
import com.company.factory.abstractFactory.ingredients.dough.Dough;
import com.company.factory.abstractFactory.ingredients.dough.ThinCrustDough;
import com.company.factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import com.company.factory.abstractFactory.ingredients.pepperoni.SlicedPepperoni;
import com.company.factory.abstractFactory.ingredients.sauce.MarinaraSauce;
import com.company.factory.abstractFactory.ingredients.sauce.Sauce;
import com.company.factory.abstractFactory.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies [] veggies = {
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPapper()
        };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
