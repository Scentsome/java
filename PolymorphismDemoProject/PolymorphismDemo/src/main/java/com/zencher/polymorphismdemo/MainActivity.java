package com.zencher.polymorphismdemo;

import android.os.Bundle;
import android.app.Activity;
import android.os.StatFs;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sword sword = new Sword();
        Staff staff = new Staff();
        Warrior warrior = new Warrior();

        warrior.weapon = sword;
        warrior.attack();

        warrior.weapon = staff;
        warrior.attack();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
