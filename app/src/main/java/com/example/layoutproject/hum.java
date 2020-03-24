package com.example.layoutproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hum extends AppCompatActivity {

    Button shonkho, kobi, nondito, dekha, kath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hum);
        shonkho=(Button) findViewById(R.id.shonkhonil);
        shonkho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logintent = new Intent(hum.this, shonkhonil_karagar.class);
                startActivity(logintent);
            }
        });

        kobi=(Button) findViewById(R.id.kobi);
        kobi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logintent = new Intent(hum.this, kobi.class);
                startActivity(logintent);
            }
        });

        nondito=(Button) findViewById(R.id.nondito);
        nondito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logintent = new Intent(hum.this, nondito.class);
                startActivity(logintent);
            }
        });

        dekha=(Button) findViewById(R.id.dekha);
        dekha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logintent = new Intent(hum.this, dekha.class);
                startActivity(logintent);
            }
        });

        kath=(Button) findViewById(R.id.kath);
        kath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logintent = new Intent(hum.this, kath.class);
                startActivity(logintent);
            }
        });
        
    }
}
