package com.company.template_method.basic;

/**
 * Template Method is a behavioral design pattern.
 */

public abstract class TemplateMethodSkeleton {

//  template method, final so subclasses can't override
    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
    }
//  default implementation
    private void primitiveOperation1() {
        System.out.println("general operation №1");
    }
//  default implementation
    private void primitiveOperation2() {
        System.out.println("general operation №2");
    }
//  //methods to be implemented by subclasses
    protected abstract void concreteOperation();
}
