package com.company.strategy.cafeapp;

import com.company.strategy.cafeapp.components.Milk;
import com.company.strategy.cafeapp.components.Whip;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        espresso.addComponent(new Milk());
        espresso.addComponent(new Whip());
        System.out.format(Locale.ENGLISH,"Beverage %.2f%n", espresso.cost());
    }
}
