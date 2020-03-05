package com.company.factory.factorymethod.stores;

import com.company.factory.factorymethod.burgers.Burger;

public abstract class BurgerStore {
    

    public Burger orderBurger (String type){
        Burger burger;

        burger = createBurger(type);

        burger.prepare();
        burger.incase();
        return burger;
    }

    protected abstract Burger createBurger(String type);
}
