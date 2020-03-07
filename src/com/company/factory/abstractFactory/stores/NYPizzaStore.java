package com.company.factory.abstractFactory.stores;

import com.company.factory.abstractFactory.ingredients.NYPizzaIngredientFactory;
import com.company.factory.abstractFactory.ingredients.PizzaIngredientFactory;
import com.company.factory.abstractFactory.pizza.CheesePizza;
import com.company.factory.abstractFactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
