package com.company.сomposite.basic;

public class Leaf extends Component {
    String name;
    int number;

    public Leaf(String name) {
        this.name = name;
        number = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public void operation() {
        number++;
    }
}
