package com.e.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

//this demonstrates two ways to use a button click event
//button two shows creating the object through java

//buttons 1 & 3 shows more of working with them xml to define the method that java would use
//then it implements the method

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thelast);
    }

    public void onTheLastClick(View v) {
        Intent intent = new Intent(this, TheLast.class);
        startActivity(intent);
    }
}