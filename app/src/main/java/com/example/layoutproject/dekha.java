package com.example.layoutproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class dekha extends AppCompatActivity {
    PDFView read;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dekha);

        read=(PDFView) findViewById(R.id.dekha);
        read.fromAsset("Dekha_Na_Dekha.pdf").load();
    }
}
