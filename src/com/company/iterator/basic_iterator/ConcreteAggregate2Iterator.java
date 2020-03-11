package com.company.iterator.basic_iterator;

public class ConcreteAggregate2Iterator implements Iterator {
    Item[] items;
    int position = 0;

    public ConcreteAggregate2Iterator(Item[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
            else {
                return true;
            }
    }

    @Override
    public Object next() {
        Item item = items[position];
        position++;
        return item;
    }
}
