package com.company.singleton.double_check_thread_safe_implementation;

public class Singleton {
    private volatile static Singleton instance;

    String description = " thread safe singleton with double check";

    private Singleton() {
        // protect against instantiation via reflection
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("already initialized");
        }
    }

    //thread safe method with double check
    public static  Singleton getInstance() {

        if (instance == null)
            synchronized (Singleton.class) {
                if (instance ==null)
                    instance = new Singleton();
            }

        return instance;
    }
}
