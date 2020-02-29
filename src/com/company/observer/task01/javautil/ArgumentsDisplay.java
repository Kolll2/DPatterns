package com.company.observer.task01.javautil;

import com.company.observer.task01.javautil.displays.Display;

import java.util.Observable;
import java.util.Observer;

public class ArgumentsDisplay implements Observer {

    Observable observable;

    private float floatArgument;
    private int intArgument;
    private String stringArgument;

    public ArgumentsDisplay() {
    }

    public ArgumentsDisplay( Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Subject){
            Subject subject = (Subject) o;
            floatArgument = subject.getArgument1();
            intArgument = subject.getArgument2();
            stringArgument= subject.getArgument3();
            display();
        }
    }

    private void display() {
        System.out.println("floatArgument=" + floatArgument);
        System.out.println("intArgument=" + intArgument);
        System.out.println("stringArgument='" + stringArgument);
    }

    @Override
    public String toString() {
        return "ArgumentsDisplay{" +
                "observable=" + observable +
                ", floatArgument=" + floatArgument +
                ", intArgument=" + intArgument +
                ", stringArgument='" + stringArgument + '\'' +
                '}';
    }
}
