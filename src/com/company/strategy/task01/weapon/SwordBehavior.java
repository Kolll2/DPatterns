package com.company.strategy.task01.weapon;

public class SwordBehavior implements WeaponBehavor {

    @Override
    public void useWeapon() {
        System.out.println(" hit the Sword");
    }
}
