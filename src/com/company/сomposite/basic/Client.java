package com.company.сomposite.basic;



public class Client {
    public static void main(String[] args) {
        Composite component = new Composite("Composite # 1", "Composite # 1 ===> ");
        Composite component2 = new Composite("Composite # 2", "Composite # 2 ===> ");
        Composite component3= new Composite("Composite # 3", "Composite # 3 ===> ");

        component.add(new Leaf("Leaf #1"));
        component.add(new Leaf("Leaf #2"));
        component.add(new Leaf("Leaf #3"));
        component2.add(new Leaf("Leaf #1"));
        component2.add(new Leaf("Leaf #2"));
        component2.add(new Leaf("Leaf #3"));
        component3.add(new Leaf("Leaf #1"));
        component3.add(new Leaf("Leaf #2"));
        component3.add(new Leaf("Leaf #3"));

        Composite allComponents = new Composite("All Composite", "All Composite ===> ");

        allComponents.addAll(component, component2, component3);

        allComponents.print();

    }
}
