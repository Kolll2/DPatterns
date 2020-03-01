package com.company.decorator.cafeapp.components;

import com.company.decorator.cafeapp.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
