package com.company.singleton.thread_safe_simple_implementation;

public class Singleton {
    private static Singleton instance;

    String description = "simple singleton";

    private Singleton() {
    }

    //
    public static synchronized Singleton getInstance() {

        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
