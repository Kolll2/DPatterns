package com.company.factory.simplefactory;

import com.company.factory.simplefactory.burgers.Burger;
import com.company.factory.simplefactory.plants.SimpleBurgerFactory;

public class BurgerStore {
    SimpleBurgerFactory factory;

    public BurgerStore(SimpleBurgerFactory simpleBurgerFactory) {
        this.factory = simpleBurgerFactory;
    }

    public Burger orderBurger (String type){
        Burger burger;

        burger = factory.createPizza(type);

        burger.prepare();
        burger.incase();
        return burger;
    }
}
