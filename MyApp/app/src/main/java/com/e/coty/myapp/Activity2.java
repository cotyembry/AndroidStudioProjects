package com.e.coty.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by cotyembry on 3/17/15.
 */
public class Activity2 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
    }
    public void activityButtonClick(View view) {
        startActivity(new Intent("com.e.coty.myapp.ACTIVITY3"));
    }
}
