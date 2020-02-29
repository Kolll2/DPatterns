package com.company.observer.task01.basic;

public interface Observeble {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
