package com.company.state.basic;

public class ConcreteStateC implements State {
    Context context;

    public ConcreteStateC(Context context) {
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("Concrete State C");
    }
}
