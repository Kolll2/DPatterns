package com.company.state.gumball_machine;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State SoldState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        
    }
}
