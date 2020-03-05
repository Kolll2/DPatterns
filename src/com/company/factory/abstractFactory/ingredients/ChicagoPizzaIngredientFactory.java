package com.company.factory.abstractFactory.ingredients;

import com.company.factory.abstractFactory.ingredients.cheese.Cheese;
import com.company.factory.abstractFactory.ingredients.cheese.Mozzarella;
import com.company.factory.abstractFactory.ingredients.clams.Clams;
import com.company.factory.abstractFactory.ingredients.clams.FrozenClams;
import com.company.factory.abstractFactory.ingredients.dough.Dough;
import com.company.factory.abstractFactory.ingredients.dough.ThickCrustDough;
import com.company.factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import com.company.factory.abstractFactory.ingredients.pepperoni.SlicedPepperoni;
import com.company.factory.abstractFactory.ingredients.sauce.PlumTomatoSauce;
import com.company.factory.abstractFactory.ingredients.sauce.Sauce;
import com.company.factory.abstractFactory.ingredients.veggies.BlackOlives;
import com.company.factory.abstractFactory.ingredients.veggies.EggPlant;
import com.company.factory.abstractFactory.ingredients.veggies.Spinach;
import com.company.factory.abstractFactory.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies [] veggies = {
                new BlackOlives(),
                new Spinach(),
                new EggPlant(),
        };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
