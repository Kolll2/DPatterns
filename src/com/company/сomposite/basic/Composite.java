package com.company.сomposite.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Composite extends Component {
    ArrayList components = new ArrayList();
    String name;
    String description;

    public Composite(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void operation() {
        super.operation();
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
       components.remove(component);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("--------------------------");
        Iterator iterator = components.iterator();
        while(iterator.hasNext()){
            Component menuComponent = (Component) iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Component getChild(int i) {
        return (Component) components.get(i);
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void addAll(Component ... components) {
        this.components.addAll(Arrays.asList(components));
    }
}
