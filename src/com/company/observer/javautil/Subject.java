package com.company.observer.javautil;

import java.util.Observable;

/**
 * Depricated -> Осуждаемый
 */
public class Subject extends Observable {

    private float argument1;
    private int argument2;
    private String argument3;

    public Subject() {
    }

    public void argumentsChenged(){
        setChanged();
        notifyObservers();
    }

    public void setArgument(float arg1, int arg2, String arg3){
        this.argument1 = arg1;
        this.argument2 = arg2;
        this.argument3 = arg3;
        argumentsChenged();
    }

    public float getArgument1() {
        return argument1;
    }

    public int getArgument2() {
        return argument2;
    }

    public String getArgument3() {
        return argument3;
    }
}
