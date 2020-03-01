package com.company.factory.factorymethod;

import com.company.factory.factorymethod.burgers.Burger;
import com.company.factory.factorymethod.stores.BurgerStore;
import com.company.factory.factorymethod.stores.NYBurgerStore;

public class Main {
    public static void main(String[] args) {
        BurgerStore nyBurgerStore = new NYBurgerStore();
        Burger burger = nyBurgerStore.orderBurger("hamburger");
        System.out.println(burger.toString());

    }
}
