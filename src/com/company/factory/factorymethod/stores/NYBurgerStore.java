package com.company.factory.factorymethod.stores;

import com.company.factory.factorymethod.burgers.Burger;
import com.company.factory.factorymethod.burgers.nysyle.NYCheeseburger;
import com.company.factory.factorymethod.burgers.nysyle.NYHamburger;

public class NYBurgerStore extends BurgerStore {
    @Override
    protected Burger createPizza(String type) {
        Burger burger = null;
        if (type.equals("Hamburger") || (type.equals("hamburger"))){
            burger = new NYHamburger();
        } else if (type.equals("Cheeseburger") || (type.equals("cheeseburger"))){
            burger = new NYCheeseburger();
        }
        return burger;
    }
}
