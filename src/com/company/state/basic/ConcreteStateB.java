package com.company.state.basic;

public class ConcreteStateB implements State{
    Context context;

    public ConcreteStateB(Context context) {
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("Concrete State B");
    }
}
