package com.company.strategy.task01.character;

import com.company.strategy.task01.weapon.BowAndArrowBehavior;

public class Archer extends Character {
    public Archer() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.print("Archer");
        weapon.useWeapon();
    }
}
