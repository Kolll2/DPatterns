package com.company.iterator.basic_iterator;

public class Item {
    String name;
    String description;
    boolean extra;
    double price;

    public Item(String name, String description, boolean extra, double price) {
        this.name = name;
        this.description = description;
        this.extra = extra;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
