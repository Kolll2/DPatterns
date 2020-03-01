package com.company.factory.factorymethod.burgers;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public abstract class Burger {
    public String description = "Unknown Burger";
    public String name;
    public String bun;
    public String cutlet;
    public ArrayList toppings = new ArrayList();

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Fry the " + cutlet);
        System.out.println("Take the " + bun);
        System.out.println("Adding souce...");
        System.out.println("Adding toppings:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }


    }

    public void incase(){
        System.out.println("Place the Burger in official BurgerShop paper and box");
    }

    @Override
    public String toString() {
        return "Burger{" +
                "description='" + description + '\'' +
                "cost='" + cost() +'}';
    }

    public String getName() {
        return name;
    }
}
