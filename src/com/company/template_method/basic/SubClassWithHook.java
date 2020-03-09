package com.company.template_method.basic;

public class SubClassWithHook extends TemplateMethodSkeleton {
    
    @Override
    protected void concreteOperation() {
        System.out.println("@Override abstract concreteOperation in" + this.getClass().getSimpleName());
    }

    @Override
    void hook() {
        System.out.println("@Override hook method");
    }
}
