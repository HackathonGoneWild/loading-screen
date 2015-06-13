package com.map.omri_pc.myapplication;

import com.dd.CircularProgressButton;
import com.dd.*;


import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CircularProgressButton circularButton1 = (CircularProgressButton) findViewById(R.id.btnWithText);
        circularButton1.setIndeterminateProgressMode(true);
        circularButton1.setProgress(50);
    }



}
