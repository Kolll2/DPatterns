package com.company.strategy.task01.weapon;

public class AxeBehavior implements WeaponBehavor {
    @Override
    public void useWeapon() {
        System.out.println(" hit the Axe");
    }
}
