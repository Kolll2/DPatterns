package com.company.strategy.task01;

import com.company.strategy.task01.character.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Archer archer = new Archer();
        archer.fight();
        King king = new King();
        king.fight();
        Knight knight = new Knight();
        knight.fight();
        Troll troll = new Troll();
        troll.fight();
        Queen queen = new Queen();
        queen.fight();
    }
}
