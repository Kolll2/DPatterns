package com.company.iterator.basic_iterator;

import java.util.ArrayList;

public class ConcreteAggregate1 {
    ArrayList items;

    public ConcreteAggregate1() {
        items = new ArrayList();

        addItem("item #1", "this item is fine", false, 1.44d);
        addItem("item #2", "this item is poor", false, 0.77d);
        addItem("item #3", "this item is extra", true, 3.99d);
        addItem("item #4", "this item is great", true, 2.99d);
    }

    private void addItem(String name, String desc, boolean extra, double price) {
        Item item = new Item(name, desc, extra, price);
        items.add(item);
    }

    public Iterator createIterator(){
        return new ConcreteAggregate1Iterator(items);
    }
}
