package com.company.template_method.basic;

public abstract class TemplateMethodSkeleton {

    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
    }

    private void primitiveOperation1() {
        System.out.println("general operation №1");
    }

    private void primitiveOperation2() {
        System.out.println("general operation №2");
    }

    protected abstract void concreteOperation();
}
