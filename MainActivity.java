package com.example.jp048220.tradeapp;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout menuDrawer;
    private ActionBarDrawerToggle menuToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menuDrawer=(DrawerLayout)findViewById(R.id.drawer);
        menuToggle=new ActionBarDrawerToggle(this, menuDrawer,R.string.open,R.string.close);
        menuDrawer.addDrawerListener(menuToggle);
        menuToggle.syncState();
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(menuToggle.onOptionsItemSelected(item)) {
            return true;
        }
            return super.onOptionsItemSelected(item);
        }

}
