package com.company.singleton.thread_safe_simple_implementation;

public class Singleton {
    private static Singleton instance;

    String description = "simple thread safe singleton";

    private Singleton() {
        // this constructor can be called with reflection
    }

    // expensive multithreaded safety method
    public static synchronized Singleton getInstance() {

        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
