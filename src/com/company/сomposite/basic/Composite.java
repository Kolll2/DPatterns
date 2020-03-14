package com.company.сomposite.basic;

public class Composite extends Component {
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
        super.add(component);
    }

    @Override
    public void remove(Component component) {
        super.remove(component);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public void getChild(int i) {
        super.getChild(i);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getDescription() {
        return description;
    }
}
