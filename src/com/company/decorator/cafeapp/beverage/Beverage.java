package com.company.decorator.cafeapp.beverage;

public abstract class Beverage {
    String description = "Unknown Beverage";
    Size size ;


    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();

}
