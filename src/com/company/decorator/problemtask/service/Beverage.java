package com.company.decorator.problemtask.service;

/**
 * Кафе сделала заказ на разработку ПО для сети своих заведений.
 * !Напитки состоят из ингридиентов, необходим гибкий механизм для
 * расчета стоимости и кастомизации любого напитка. Ингридиенты могут добавлятся
 * в больших колличествах.
 */
public class Beverage {

    String description;
    double baseCost;
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    public double cost(){
        double result = baseCost;
        if (hasMill()) result += 0.1;
        if (hasMocha()) result += 0.2;
        if (hasSoy()) result += 0.15;
        if (hasWhip()) result += 0.05;
        return result;
    }

    public String getDescription() {
        return description;
    }

    public boolean hasMill() {
        return milk;
    }

    public void setMilk() {
        this.milk = true;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy() {
        this.soy = true;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha() {
        this.mocha = true;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip() {
        this.whip = true;
    }
}
