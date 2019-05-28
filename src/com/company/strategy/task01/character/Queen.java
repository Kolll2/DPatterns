package com.company.strategy.task01.character;

import com.company.strategy.task01.weapon.KnifeBehavior;

public class Queen extends Character {
    public Queen() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.print("Queen");
        weapon.useWeapon();
    }
}
