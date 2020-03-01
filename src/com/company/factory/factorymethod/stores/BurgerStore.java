package com.company.factory.factorymethod.stores;

import com.company.factory.factorymethod.burgers.Burger;

public abstract class BurgerStore {
    

    public Burger orderBurger (String type){
        Burger burger;

        burger = createPizza(type);

        burger.prepare();
        burger.incase();
        return burger;
    }

    protected abstract Burger createPizza(String type);
}
