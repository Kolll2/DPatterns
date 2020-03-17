package com.company.state.basic;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(context.getConcreteStateA());
        context.handle();
        context.setState(context.getConcreteStateB());
        context.handle();
        context.setState(context.getConcreteStateC());
        context.handle();
    }
}
