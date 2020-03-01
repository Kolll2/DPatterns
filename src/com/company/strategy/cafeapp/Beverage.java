package com.company.strategy.cafeapp;

import com.company.strategy.cafeapp.components.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Кафе сделала заказ на разработку ПО для сети своих заведений.
 * !Напитки состоят из ингридиентов, необходим гибкий механизм для
 * расчета стоимости и кастомизации любого напитка. Ингридиенты могут добавлятся
 * в больших колличествах.
 * Применение паттерна Стратегия для инкапсуляции изменчивого фактора (дополнительных ингридиентов)
 */
public class Beverage {

    String description;
    double baseCost;

    List<Component> components;
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    public Beverage() {
        this.description = "Base Beverage";
        this.components = new ArrayList<>();
    }

    public double cost(){
        double result = baseCost;
        Iterator<Component> iterator = components.iterator();
        while (iterator.hasNext()){
            result += iterator.next().getCost();
        }

        return result;
    }

    public void addComponent (Component component){
        components.add(component);
    }

}
