package com.company.state.basic;

public class Context {

    State concreteStateA;
    State concreteStateB;
    State concreteStateC;


    State state;

    public Context() {
        concreteStateA = new ConcreteStateA(this);
        concreteStateB = new ConcreteStateB(this);
        concreteStateC = new ConcreteStateC(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getConcreteStateA() {
        return concreteStateA;
    }

    public State getConcreteStateB() {
        return concreteStateB;
    }

    public State getConcreteStateC() {
        return concreteStateC;
    }

    public void handle() {
        state.handle();
    }

}
