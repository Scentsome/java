package com.zencher.polymorphismdemo;

import android.util.Log;

/**
 * Created by chronoer on 13/9/21.
 */
public class Staff  implements   Weapon{
    public void behave(){
        this.fireBall();
    }
    public void fireBall(){
        Log.v("Game", "Fire ball");
        System.out.println("Fire ball");
    }
}
