package com.company.singleton.simple_implementation;

public class Singleton {
    private static Singleton instance;

    String description = "simple singleton";

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
