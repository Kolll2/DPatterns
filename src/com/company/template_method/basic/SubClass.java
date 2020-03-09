package com.company.template_method.basic;

public class SubClass extends TemplateMethodSkeleton {

//  Override abstract method superclass
    @Override
    protected void concreteOperation() {
        System.out.println("@Override abstract concreteOperation");
    }


}
