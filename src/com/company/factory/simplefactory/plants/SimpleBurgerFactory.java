package com.company.factory.simplefactory.plants;

import com.company.factory.simplefactory.burgers.Burger;
import com.company.factory.simplefactory.burgers.Cheeseburger;
import com.company.factory.simplefactory.burgers.Hamburger;

public class SimpleBurgerFactory {
    public Burger createPizza (String type){
        Burger burger = null;
        if (type.equals("Hamburger") || (type.equals("hamburger"))){
            burger = new Hamburger();
        } else if (type.equals("Cheeseburger") || (type.equals("cheeseburger"))){
            burger = new Cheeseburger();
        }
        return burger;
    }
}
