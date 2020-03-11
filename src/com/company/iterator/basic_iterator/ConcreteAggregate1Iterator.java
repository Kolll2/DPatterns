package com.company.iterator.basic_iterator;

import java.util.ArrayList;

public class ConcreteAggregate1Iterator implements Iterator {
    ArrayList items;
    int position = 0;

    public ConcreteAggregate1Iterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Item item = (Item) items.get(position);
        position++;
        return item;
    }
}
