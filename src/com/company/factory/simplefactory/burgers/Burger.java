package com.company.factory.simplefactory.burgers;

public abstract class Burger {
    String description = "Unknown Burger";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void prepare(){

    }

    public void incase(){

    }
}
