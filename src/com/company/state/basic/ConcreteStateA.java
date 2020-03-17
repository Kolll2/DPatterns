package com.company.state.basic;

public class ConcreteStateA implements State{
    Context context;

    public ConcreteStateA(Context context) {
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("Concrete State A");
    }
}
