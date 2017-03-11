package com.e.coty.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void mainButtonClick(View view) {
        startActivity(new Intent("com.e.coty.myapp.ACTIVITY2"));
    }
}
