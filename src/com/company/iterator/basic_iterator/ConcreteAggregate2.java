package com.company.iterator.basic_iterator;

import com.company.command.control_panel.MacroCommand;

public class ConcreteAggregate2 {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Item[] items;

    public ConcreteAggregate2() {
        items = new Item[MAX_ITEMS];

        addItem("@2 Item 1", "Second Agregate", false, 1.99d);
        addItem("@2 Item 2", "Second Agregate", false, 2.99d);
        addItem("@2 Item 3", "Second Agregate", false, 3.99d);
    }

    private void addItem(String name, String desc, boolean extra, double price) {
        Item item = new Item(name, desc, extra, price);
        if (numberOfItems >= MAX_ITEMS){
            System.out.println(this.getClass().getSimpleName()+" is full");
        } else {
            items[numberOfItems] = item;
            numberOfItems++;
        }
    }

    public Iterator createIterator(){
        return new ConcreteAggregate2Iterator(items);
    }
}
