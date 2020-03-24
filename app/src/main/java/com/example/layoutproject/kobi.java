package com.example.layoutproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kobi extends AppCompatActivity {

    PDFView read;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kobi);

        read=(PDFView) findViewById(R.id.kobi);
        read.fromAsset("Kobi.pdf").load();
    }
}
