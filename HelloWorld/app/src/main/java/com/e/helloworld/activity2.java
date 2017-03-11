package com.e.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

/**
 * Created by cotyembry on 3/16/15.
 */
public class activity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
    }
    public void onActivity2ButtonClick(View view) {
        Intent intent = new Intent(this, TheLast.class);
        startActivity(intent);
    }
}
