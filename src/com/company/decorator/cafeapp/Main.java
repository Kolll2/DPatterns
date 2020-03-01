package com.company.decorator.cafeapp;

import com.company.decorator.cafeapp.beverage.Beverage;
import com.company.decorator.cafeapp.beverage.Espresso;
import com.company.decorator.cafeapp.beverage.Size;
import com.company.decorator.cafeapp.components.Milk;
import com.company.decorator.cafeapp.components.Mocha;
import com.company.decorator.cafeapp.components.Soy;
import com.company.decorator.cafeapp.components.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso.setSize(Size.TALL);
        espresso = new Whip(espresso);
        espresso = new Mocha(new Mocha(espresso));
        espresso = new Soy(espresso);
        System.out.println(espresso.getSize() + " "+espresso.getDescription() + " " + espresso.cost());
    }
}
