package com.example.layoutproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms
                Intent logintent = new Intent(MainActivity.this, page2.class);
                startActivity(logintent);
            }
        }, 5000);*/

        AbsoluteLayout layout= (AbsoluteLayout)findViewById(R.id.relativeLayout1);
        layout.setOnTouchListener(this);

    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Intent logintent = new Intent(MainActivity.this, page2.class);
        startActivity(logintent);
        return false;
    }
}
