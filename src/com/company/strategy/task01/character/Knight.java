package com.company.strategy.task01.character;

import com.company.strategy.task01.weapon.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.print("Knight");
        weapon.useWeapon();
    }
}
