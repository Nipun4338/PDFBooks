package com.example.layoutproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shonkhonil_karagar extends AppCompatActivity {

    Button read, back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shonkhonil_karagar);
        read= (Button) findViewById(R.id.shonkhoread);
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent humintent = new Intent(shonkhonil_karagar.this, shonkhoread.class);
                startActivity(humintent);
            }
        });

        back1 =(Button) findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logintent = new Intent(shonkhonil_karagar.this, hum.class);
                startActivity(logintent);
            }
        });
    }
}
