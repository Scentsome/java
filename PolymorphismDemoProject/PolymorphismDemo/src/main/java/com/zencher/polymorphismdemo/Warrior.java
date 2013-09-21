package com.zencher.polymorphismdemo;

/**
 * Created by chronoer on 13/9/21.
 */
public class Warrior {
    public Weapon weapon;
    public void attack(){
        weapon.behave();
    }
}
