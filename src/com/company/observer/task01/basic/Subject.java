package com.company.observer.task01.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Subject implements Observeble {
    List<Observer> observersList;

    boolean isChanged = false;

    private float argument1;
    private int argument2;
    private String argument3;

    public Subject() {
        this.observersList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (Objects.nonNull(observer)){
            observersList.add(observer);
        } else {
            throw new NullPointerException("Subject method registerObserver will come Null argument Observer observer");
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (Objects.nonNull(observer)){
            observersList.remove(observer);
        } else {
            throw new NullPointerException("Subject method removeObserver will come Null argument Observer observer");
        }
    }

    @Override
    public void notifyObservers() {
        if (isChanged)
            for (int i = 0; i < observersList.size(); i++) {
                observersList.get(i).update(argument1, argument2, argument3);
            }
    }

    public void setArgument(float arg1, int arg2, String arg3){
        this.argument1 = arg1;
        this.argument2 = arg2;
        this.argument3 = arg3;
        argumentsChenged();
    }

    private void argumentsChenged() {
        isChanged = true;
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
