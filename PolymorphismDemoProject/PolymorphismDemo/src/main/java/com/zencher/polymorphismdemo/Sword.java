package com.zencher.polymorphismdemo;

import android.util.Log;

/**
 * Created by chronoer on 13/9/21.
 */
public class Sword implements Weapon{
    public void behave(){
        this.slash();
    }

    public void slash(){
        Log.v("Game", "Slash...");
        System.out.println("Slash...");
    }
}
