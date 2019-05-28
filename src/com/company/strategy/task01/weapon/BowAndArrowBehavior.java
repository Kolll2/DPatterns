package com.company.strategy.task01.weapon;

public class BowAndArrowBehavior implements WeaponBehavor {
    @Override
    public void useWeapon() {
        System.out.println(" shot a Bow from an Arrow");
    }
}
