package com.company.observer.basic;

public class currentObserver implements Observer{
    @Override
    public void update(float arg1, int arg2, String arg3) {
        System.out.println("floatArgument=" + arg1);
        System.out.println("intArgument=" + arg2);
        System.out.println("stringArgument='" + arg3);
    }
}
